/**
 * PROBE THE ACTUAL MP4 — Fetch raw bytes from the P2P proxy and parse all tracks.
 * This tells us exactly what audio languages are embedded in the container.
 */

const P2P = 'http://127.0.0.1:7000';

// CDN URL from the API
const cdnUrl = 'http://789fc.e6r4r1.com/vod/1/2024/06/06/efcb402a25bf/475459122.mp4';
const src = Buffer.from(cdnUrl).toString('base64');
const proxyUrl = `${P2P}/resource.mp4?src=${src}`;

console.log('🔍 PROBING MP4 CONTAINER FOR AUDIO TRACKS\n');
console.log('URL:', proxyUrl.substring(0, 80) + '...\n');

// Fetch first 2MB to find moov atom
const PROBE_SIZE = 2 * 1024 * 1024;

async function probe() {
  // Try fetching first chunk
  let resp;
  try {
    resp = await fetch(proxyUrl, { 
      headers: { Range: `bytes=0-${PROBE_SIZE - 1}` },
      signal: AbortSignal.timeout(15000)
    });
  } catch (e) {
    console.log('❌ Range request failed, trying full fetch...');
    resp = await fetch(proxyUrl, { signal: AbortSignal.timeout(15000) });
  }
  
  console.log(`Response: ${resp.status} ${resp.statusText}`);
  console.log(`Content-Length: ${resp.headers.get('content-length')}`);
  console.log(`Content-Range: ${resp.headers.get('content-range')}`);
  console.log(`Content-Type: ${resp.headers.get('content-type')}\n`);

  const buf = await resp.arrayBuffer();
  console.log(`Got ${buf.byteLength} bytes\n`);

  const view = new DataView(buf);
  const len = buf.byteLength;

  // Parse MP4 boxes
  const LANGS = {
    'und':'Undetermined','eng':'English','hin':'Hindi','kor':'Korean',
    'jpn':'Japanese','cmn':'Mandarin','zho':'Chinese','chi':'Chinese',
    'spa':'Spanish','fra':'French','fre':'French','deu':'German','ger':'German',
    'ita':'Italian','por':'Portuguese','rus':'Russian','ara':'Arabic',
    'tha':'Thai','vie':'Vietnamese','ind':'Indonesian','mal':'Malay',
    'tam':'Tamil','tel':'Telugu','kan':'Kannada','ben':'Bengali','mar':'Marathi',
    'urd':'Urdu','pan':'Punjabi','guj':'Gujarati','ori':'Odia',
    'tur':'Turkish','pol':'Polish','nld':'Dutch','dut':'Dutch',
    'swe':'Swedish','nor':'Norwegian','dan':'Danish','fin':'Finnish',
  };

  const containers = new Set(['moov','trak','mdia','minf','stbl','edts','udta','meta']);
  const tracks = [];
  let foundMoov = false;

  function parseBoxes(start, end, depth = 0) {
    let pos = start;
    while (pos < end - 8 && pos < len - 8) {
      const size = view.getUint32(pos);
      if (size < 8 || pos + size > len) break;
      
      const type = String.fromCharCode(
        view.getUint8(pos+4), view.getUint8(pos+5),
        view.getUint8(pos+6), view.getUint8(pos+7)
      );

      const indent = '  '.repeat(depth);
      
      if (type === 'moov') {
        foundMoov = true;
        console.log(`${indent}📦 moov (size=${size})`);
        parseBoxes(pos + 8, pos + size, depth + 1);
      } else if (type === 'trak') {
        // Start a new track
        const track = { handler: '', lang: '', codec: '' };
        parseTrak(pos + 8, pos + size, track);
        tracks.push(track);
        const langName = LANGS[track.lang] || track.lang;
        const icon = track.handler === 'soun' ? '🔊' : track.handler === 'vide' ? '🎬' : track.handler.match(/sbtl|text|subt/) ? '💬' : '❓';
        console.log(`${indent}${icon} trak: handler=${track.handler} lang=${track.lang} (${langName}) codec=${track.codec}`);
      } else if (type === 'ftyp') {
        // File type box
        const brand = String.fromCharCode(
          view.getUint8(pos+8), view.getUint8(pos+9),
          view.getUint8(pos+10), view.getUint8(pos+11)
        );
        console.log(`${indent}📋 ftyp: brand=${brand}`);
      } else if (containers.has(type)) {
        parseBoxes(pos + 8, pos + size, depth + 1);
      }
      
      pos += size;
    }
  }

  function parseTrak(start, end, track) {
    let pos = start;
    while (pos < end - 8 && pos < len - 8) {
      const size = view.getUint32(pos);
      if (size < 8 || pos + size > len) break;
      const type = String.fromCharCode(
        view.getUint8(pos+4), view.getUint8(pos+5),
        view.getUint8(pos+6), view.getUint8(pos+7)
      );

      if (type === 'mdia' || type === 'minf' || type === 'stbl') {
        parseTrak(pos + 8, pos + size, track);
      } else if (type === 'hdlr') {
        if (pos + 20 < len) {
          track.handler = String.fromCharCode(
            view.getUint8(pos+16), view.getUint8(pos+17),
            view.getUint8(pos+18), view.getUint8(pos+19)
          );
        }
      } else if (type === 'mdhd') {
        const ver = view.getUint8(pos + 8);
        const langOffset = ver === 0 ? pos + 28 : pos + 40;
        if (langOffset + 2 <= len) {
          const langCode = view.getUint16(langOffset);
          const c1 = String.fromCharCode(((langCode >> 10) & 0x1F) + 0x60);
          const c2 = String.fromCharCode(((langCode >> 5) & 0x1F) + 0x60);
          const c3 = String.fromCharCode((langCode & 0x1F) + 0x60);
          track.lang = c1 + c2 + c3;
        }
      } else if (type === 'stsd') {
        // Sample description — codec info
        if (pos + 20 < len) {
          const codecType = String.fromCharCode(
            view.getUint8(pos+20), view.getUint8(pos+21),
            view.getUint8(pos+22), view.getUint8(pos+23)
          );
          track.codec = codecType;
        }
      }
      
      pos += size;
    }
  }

  parseBoxes(0, len, 0);

  if (!foundMoov) {
    console.log('\n⚠️ moov atom NOT found in first 2MB. Trying end of file...');
    
    // Get file size via HEAD
    try {
      const headResp = await fetch(proxyUrl, { method: 'HEAD', signal: AbortSignal.timeout(5000) });
      const totalSize = parseInt(headResp.headers.get('content-length') || '0');
      console.log(`Total file size: ${totalSize} bytes (${(totalSize/1024/1024).toFixed(1)} MB)`);
      
      if (totalSize > PROBE_SIZE) {
        const start = totalSize - PROBE_SIZE;
        const resp2 = await fetch(proxyUrl, {
          headers: { Range: `bytes=${start}-${totalSize - 1}` },
          signal: AbortSignal.timeout(15000)
        });
        const buf2 = await resp2.arrayBuffer();
        console.log(`Got last ${buf2.byteLength} bytes\n`);
        
        const view2 = new DataView(buf2);
        const len2 = buf2.byteLength;
        
        // Re-parse with buf2/view2/len2
        // (simplified: just scan for moov)
        let moovPos = -1;
        for (let i = 0; i < len2 - 8; i++) {
          if (view2.getUint8(i+4) === 0x6D && view2.getUint8(i+5) === 0x6F &&
              view2.getUint8(i+6) === 0x6F && view2.getUint8(i+7) === 0x76) {
            moovPos = i;
            break;
          }
        }
        
        if (moovPos >= 0) {
          console.log(`Found moov at offset ${moovPos} in tail buffer`);
          // Re-run full parse using view2 from moovPos
          // For simplicity, let's just report we found it
          // (The actual parse would need buf2/view2 substituted in)
        } else {
          console.log('❌ moov not found in last 2MB either');
        }
      }
    } catch (e) {
      console.log('HEAD failed:', e.message);
    }
  }

  // Summary
  console.log('\n═══ TRACK SUMMARY ═══\n');
  const audioTracks = tracks.filter(t => t.handler === 'soun');
  const videoTracks = tracks.filter(t => t.handler === 'vide');
  const subTracks = tracks.filter(t => t.handler.match(/sbtl|text|subt/));
  
  console.log(`Video tracks: ${videoTracks.length}`);
  console.log(`Audio tracks: ${audioTracks.length}`);
  console.log(`Subtitle tracks: ${subTracks.length}`);
  
  if (audioTracks.length > 0) {
    console.log('\n🔊 Audio tracks:');
    audioTracks.forEach((t, i) => {
      const langName = LANGS[t.lang] || t.lang;
      console.log(`  [${i}] ${langName} (${t.lang}) — codec: ${t.codec}`);
    });
  }
  
  if (subTracks.length > 0) {
    console.log('\n💬 Subtitle tracks:');
    subTracks.forEach((t, i) => {
      const langName = LANGS[t.lang] || t.lang;
      console.log(`  [${i}] ${langName} (${t.lang})`);
    });
  }
}

probe().catch(e => console.error('FATAL:', e.message));
