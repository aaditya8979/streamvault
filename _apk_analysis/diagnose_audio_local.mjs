/**
 * Direct P2P audio test — uses the EXACT same flow as our API route.
 * Calls the local Filmin API endpoint to compare responses for different audio_types.
 */

const BASE = 'http://127.0.0.1:3000';

// Test with a known VOD — we'll find one first
async function test() {
  console.log('🔍 TESTING AUDIO VIA LOCAL API\n');

  // 1. Search for content
  const searchResp = await fetch(`${BASE}/api/filmin?action=search&q=Squid+Game`);
  const searchData = await searchResp.json();
  
  let testId = null;
  let testTitle = '';
  if (searchData.results?.length > 0) {
    testId = searchData.results[0].id;
    testTitle = searchData.results[0].vod_name;
    console.log(`🎬 Found: "${testTitle}" (id=${testId})`);
    console.log(`   audio_language_tag: ${searchData.results[0].audio_language_tag || 'N/A'}`);
  } else {
    console.log('❌ No search results. Trying hot search...');
    const hotResp = await fetch(`${BASE}/api/filmin?action=hot`);
    const hotData = await hotResp.json();
    if (hotData.results?.length > 0) {
      testId = hotData.results[0].vod_id;
      testTitle = hotData.results[0].name;
      console.log(`🎬 Hot: "${testTitle}" (id=${testId})`);
    }
  }

  if (!testId) {
    console.log('❌ No content found');
    return;
  }

  // 2. Get VOD detail to see audio options
  console.log('\n═══ VOD Detail ═══');
  const vodResp = await fetch(`${BASE}/api/filmin?action=vod&id=${testId}`);
  const vodData = await vodResp.json();
  console.log('audio_type_option:', JSON.stringify(vodData.audio_type_option));
  console.log('audio_language_tag:', vodData.audio_language_tag);
  if (vodData.vod_collection?.[0]) {
    console.log('ep1 vod_url:', vodData.vod_collection[0].vod_url?.substring(0, 120));
  }

  // 3. Compare play endpoint with different audio types  
  console.log('\n═══ PLAY ENDPOINT — comparing audio types ═══\n');
  
  for (const at of [0, 1, 2, 3]) {
    try {
      const resp = await fetch(`${BASE}/api/filmin?action=play&id=${testId}&type=tv&ep=1&audio=${at}&format=json`);
      const data = await resp.json();
      
      if (data.error) {
        console.log(`  audio=${at}: ERROR — ${data.error}`);
      } else {
        console.log(`  audio=${at}:`);
        console.log(`    stream_url: ${data.stream_url?.substring(0, 100)}...`);
        console.log(`    cdn_url: ${data.cdn_url?.substring(0, 100)}...`);
        console.log(`    audio_options: ${JSON.stringify(data.audio_options)}`);
        console.log(`    audio_language_tag: ${data.audio_language_tag}`);
        console.log();
      }
    } catch (e) {
      console.log(`  audio=${at}: FETCH ERROR — ${e.message}`);
    }
  }

  // 4. Also try with TMDB mode (how WatchClient actually calls it)
  console.log('\n═══ PLAY VIA TMDB (WatchClient style) ═══\n');
  // Find a TMDB id by searching TMDB
  try {
    const tmdbResp = await fetch(`https://api.themoviedb.org/3/search/tv?api_key=2dca580c2a14b55200e784d157207b4d&query=${encodeURIComponent(testTitle.replace(/ - Season.*/, ''))}`);
    const tmdbData = await tmdbResp.json();
    if (tmdbData.results?.length > 0) {
      const tmdbId = tmdbData.results[0].id;
      console.log(`TMDB ID: ${tmdbId}`);
      
      for (const at of [0, 1, 2]) {
        try {
          const resp = await fetch(`${BASE}/api/filmin?action=play&id=${tmdbId}&type=tv&ep=1&audio=${at}&tmdb=1&format=json`);
          const data = await resp.json();
          if (data.error) {
            console.log(`  tmdb audio=${at}: ERROR — ${data.error}`);
          } else {
            console.log(`  tmdb audio=${at}: stream=${data.stream_url?.substring(0, 100)}... opts=${JSON.stringify(data.audio_options)}`);
          }
        } catch (e) {
          console.log(`  tmdb audio=${at}: FETCH ERROR — ${e.message}`);
        }
      }
    }
  } catch (e) {
    console.log('TMDB lookup failed:', e.message);
  }
}

test().catch(console.error);
