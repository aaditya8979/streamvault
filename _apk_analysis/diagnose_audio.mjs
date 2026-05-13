/**
 * AUDIO DIAGNOSTIC — Tests what happens when we request different audio_type values.
 * 
 * This will:
 *  1. Init + get token
 *  2. Search for a known multi-audio title (e.g., a Korean drama with Hindi dub)
 *  3. Call vod/info_web_get with audio_type 0,1,2,3 and compare:
 *     - audio_type_option (what options the API says are available)
 *     - vod_collection[0].vod_url (does the URL change per audio_type?)
 *     - audio_language_tag
 *  4. If P2P is available, also call vod/info_new with different audio_types
 *     and compare CDN URLs
 */
import crypto from 'crypto';

// ── Crypto ──
const md5 = s => crypto.createHash('md5').update(s).digest('hex');
const desedeDecrypt = b64 => {
  const d = crypto.createDecipheriv('des-ede3-cbc',
    Buffer.from('dsawdf634eebGFHITR5UT9kS0').subarray(0,24),
    Buffer.from('32456738'));
  d.setAutoPadding(true);
  return d.update(Buffer.from(b64,'base64'),undefined,'utf-8') + d.final('utf-8');
};
const aesDecrypt = b64 => {
  const d = crypto.createDecipheriv('aes-128-cbc',
    Buffer.from('0123456789123456'), Buffer.from('2015030120123456'));
  d.setAutoPadding(true);
  return Buffer.concat([d.update(Buffer.from(b64,'base64')), d.final()]).toString('utf-8');
};

const SECRET = desedeDecrypt('MxASAkl/yHTGg+/Tw1R7u96nGqkWsOZ2');
const BASE = 'https://filmin.ajfysu.com';
const MOB_DEV = Array.from({length:22},()=>Math.random()<0.5?String.fromCharCode(48+Math.floor(Math.random()*10)):String.fromCharCode(97+Math.floor(Math.random()*6))).join('');
const WEB_DEV = md5('1111111');

const P2P_HOST = process.env.FILMIN_P2P_HOST || '127.0.0.1';
const P2P_PORT = process.env.FILMIN_P2P_PORT || '7000';
const ANDROID_ID = process.env.FILMIN_ANDROID_ID || 'd3ceafd644f584c';

// ── Mobile API ──
let _token = '';
async function mobilePost(endpoint, params={}) {
  const ct = Date.now().toString();
  const sign = md5(SECRET+MOB_DEV+ct).toUpperCase();
  const resp = await fetch(BASE+endpoint, {
    method:'POST',
    headers: {
      'User-Agent':'okhttp/4.11.0','app_id':'filmin','package_name':'com.dramarush.shortin',
      'version':'40000','sys_platform':'2','mob_mfr':'google','mobmodel':'Pixel 7',
      'sysrelease':'14','device_id':MOB_DEV,'gaid':'','channel_code':'google',
      'androidid':MOB_DEV,'cur_time':ct,'token':_token,'sign':sign,
      'is_vvv':'0','is_language':'en','is_display':'1','app_language':'en','en_al':'0',
      'Content-Type':'application/x-www-form-urlencoded',
    },
    body: new URLSearchParams(params).toString()
  });
  const raw = await resp.text();
  return JSON.parse(aesDecrypt(raw.trim()));
}

// ── Web API ──
async function webGet(endpoint) {
  const ct = Date.now().toString();
  const sign = md5('ppcineweb123'+WEB_DEV+ct).toUpperCase();
  const resp = await fetch(BASE+endpoint, {
    method:'GET',
    headers: {
      'User-Agent':'Mozilla/5.0','app_id':'ppcineweb','channel_code':'ppcinewebb_1000',
      'device_id':WEB_DEV,'cur_time':ct,'sign':sign,'token':'','version':'30006',
      'sys_platform':'3','app_language':'en','domain':'enbbu.k5ca.com','en_al':'0',
    }
  });
  const raw = await resp.text();
  return JSON.parse(aesDecrypt(raw.trim()));
}

// ── P2P Sign ──
async function p2pSign(vodId, ts) {
  const url = `http://${P2P_HOST}:${P2P_PORT}/control?msg=verify&device_id=${ANDROID_ID}${vodId}&ts=${ts}`;
  const resp = await fetch(url, { signal: AbortSignal.timeout(5000) });
  if (!resp.ok) throw new Error(`P2P verify failed: ${resp.status}`);
  return (await resp.text()).trim();
}

async function getStreamInfoP2P(vodId, audioType) {
  const ts = Date.now().toString();
  const sign = await p2pSign(vodId, ts);
  return mobilePost('/api/vod/info_new', {
    vod_id: vodId.toString(),
    cur_time: ts,
    sign,
    audio_type: audioType.toString(),
  });
}

// ═══════════════════════════════════════════════════════════════
console.log('🔍 FILMIN AUDIO DIAGNOSTIC\n');

// 1. Init
const init = await mobilePost('/api/public/init', { invited_by: '' });
_token = init.result?.user_info?.token || '';
console.log('✅ Init OK, token received\n');

// 2. Search for a title that we know has multi-audio (try popular Korean/Hindi content)
const searchTerms = ['Squid Game', 'Money Heist', 'Parasyte', 'Solo Leveling', 'The Glory'];
let testVodId = null;
let testVodName = '';

for (const term of searchTerms) {
  const sr = await mobilePost('/api/search/result', { keyword: term, page: '1' });
  if (sr.result?.length > 0) {
    testVodId = sr.result[0].id;
    testVodName = sr.result[0].vod_name;
    console.log(`🎬 Found: "${testVodName}" (id=${testVodId})`);
    console.log(`   audio_language_tag: ${sr.result[0].audio_language_tag || 'N/A'}`);
    break;
  }
}

if (!testVodId) {
  // Fallback: just use hot search
  const hot = await mobilePost('/api/search/hot_search');
  testVodId = hot.result?.[0]?.vod_id;
  testVodName = hot.result?.[0]?.name || 'Unknown';
  console.log(`🎬 Using hot search: "${testVodName}" (id=${testVodId})`);
}

// 3. Web API: Test audio_type 0,1,2,3
console.log('\n═══ WEB API (info_web_get) — comparing audio_type 0,1,2,3 ═══\n');

const now = new Date();
const dh = `${now.getFullYear()}${String(now.getMonth()+1).padStart(2,'0')}${String(now.getDate()).padStart(2,'0')}${String(now.getHours()).padStart(2,'0')}${Math.floor(now.getMinutes()/10)}`;

const webResults = {};
for (const at of [0, 1, 2, 3]) {
  try {
    const info = await webGet(`/api/vod/info_web_get?vod_id=${testVodId}&audio_type=${at}&date=${dh}`);
    if (info.code === 10000 && info.result) {
      const v = info.result;
      const ep1Url = v.vod_collection?.[0]?.vod_url || 'N/A';
      webResults[at] = {
        audio_type: v.audio_type,
        audio_language_tag: v.audio_language_tag || 'N/A',
        audio_type_option: v.audio_type_option,
        ep1_url: ep1Url,
        ep1_url_short: ep1Url.length > 80 ? ep1Url.substring(0, 80) + '...' : ep1Url,
      };
      console.log(`  audio_type=${at}:`);
      console.log(`    response audio_type: ${v.audio_type}`);
      console.log(`    audio_language_tag: ${v.audio_language_tag || 'N/A'}`);
      console.log(`    audio_type_option: ${JSON.stringify(v.audio_type_option)}`);
      console.log(`    ep1 vod_url: ${webResults[at].ep1_url_short}`);
      console.log();
    } else {
      console.log(`  audio_type=${at}: API error code=${info.code} msg=${info.message}`);
    }
  } catch (e) {
    console.log(`  audio_type=${at}: ERROR — ${e.message}`);
  }
}

// Compare URLs across audio types
const urls = Object.values(webResults).map(r => r.ep1_url);
const uniqueUrls = [...new Set(urls)];
console.log(`\n📊 URL COMPARISON:`);
console.log(`  Total requests: ${urls.length}`);
console.log(`  Unique URLs: ${uniqueUrls.length}`);
if (uniqueUrls.length === 1) {
  console.log(`  ⚠️  ALL AUDIO TYPES RETURN THE SAME URL — language is embedded in container`);
} else {
  console.log(`  ✅ DIFFERENT URLs FOR DIFFERENT AUDIO TYPES — server-side switching works!`);
  for (const [at, r] of Object.entries(webResults)) {
    console.log(`    audio_type=${at}: ${r.ep1_url_short}`);
  }
}

// 4. P2P API: Test if available + compare
console.log('\n═══ P2P API (vod/info_new) — testing ═══\n');

let p2pAvailable = false;
try {
  const resp = await fetch(`http://${P2P_HOST}:${P2P_PORT}/control?msg=verify&device_id=test&ts=0`, {
    signal: AbortSignal.timeout(3000)
  });
  p2pAvailable = resp.ok;
} catch {}

if (p2pAvailable) {
  console.log('✅ P2P server is online\n');
  const p2pResults = {};
  for (const at of [0, 1, 2]) {
    try {
      const info = await getStreamInfoP2P(testVodId, at);
      if (info.code === 10000 && info.result) {
        const v = info.result;
        const ep1Url = v.vod_collection?.[0]?.vod_url || 'N/A';
        p2pResults[at] = ep1Url;
        console.log(`  audio_type=${at}:`);
        console.log(`    audio_type: ${v.audio_type}`);
        console.log(`    audio_language_tag: ${v.audio_language_tag || 'N/A'}`);
        console.log(`    audio_type_option: ${JSON.stringify(v.audio_type_option)}`);
        console.log(`    ep1 vod_url: ${ep1Url.length > 100 ? ep1Url.substring(0, 100) + '...' : ep1Url}`);
        console.log();
      } else {
        console.log(`  audio_type=${at}: code=${info.code} msg=${info.message}`);
      }
    } catch (e) {
      console.log(`  audio_type=${at}: ERROR — ${e.message}`);
    }
  }

  const p2pUrls = Object.values(p2pResults);
  const p2pUnique = [...new Set(p2pUrls)];
  console.log(`\n📊 P2P URL COMPARISON:`);
  console.log(`  Total: ${p2pUrls.length}, Unique: ${p2pUnique.length}`);
  if (p2pUnique.length === 1) {
    console.log(`  ⚠️  P2P also returns same URL — multi-audio is container-embedded`);
  } else {
    console.log(`  ✅ P2P returns different URLs per audio_type!`);
    for (const [at, url] of Object.entries(p2pResults)) {
      console.log(`    audio_type=${at}: ${url.substring(0, 100)}...`);
    }
  }
} else {
  console.log('❌ P2P server offline — cannot test P2P audio switching');
}

// 5. Test with a second title to confirm pattern
console.log('\n═══ SECOND TITLE TEST ═══\n');
const sr2 = await mobilePost('/api/search/result', { keyword: 'Reacher', page: '1' });
if (sr2.result?.length > 0) {
  const vod2 = sr2.result[0];
  console.log(`🎬 "${vod2.vod_name}" (id=${vod2.id})`);
  for (const at of [0, 1, 2]) {
    try {
      const info = await webGet(`/api/vod/info_web_get?vod_id=${vod2.id}&audio_type=${at}&date=${dh}`);
      if (info.code === 10000 && info.result) {
        const v = info.result;
        console.log(`  at=${at}: response_at=${v.audio_type} tag="${v.audio_language_tag}" opts=${JSON.stringify(v.audio_type_option)} url=${(v.vod_collection?.[0]?.vod_url||'N/A').substring(0,80)}...`);
      }
    } catch (e) {
      console.log(`  at=${at}: ERROR — ${e.message}`);
    }
  }
}

console.log('\n═══ DONE ═══');
