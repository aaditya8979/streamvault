/**
 * End-to-end verification of the Filmin API integration.
 * Tests: search, vod info, hot search, and TMDB cross-reference.
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

// ── Mobile API (POST) ──
async function mobilePost(endpoint, params={}) {
  const ct = Date.now().toString();
  const sign = md5(SECRET+MOB_DEV+ct).toUpperCase();
  const resp = await fetch(BASE+endpoint, {
    method:'POST',
    headers: {
      'User-Agent':'okhttp/4.11.0','app_id':'filmin','package_name':'com.dramarush.shortin',
      'version':'40000','sys_platform':'2','mob_mfr':'google','mobmodel':'Pixel 7',
      'sysrelease':'14','device_id':MOB_DEV,'gaid':'','channel_code':'google',
      'androidid':MOB_DEV,'cur_time':ct,'token':globalThis._token||'','sign':sign,
      'is_vvv':'0','is_language':'en','is_display':'1','app_language':'en','en_al':'0',
      'Content-Type':'application/x-www-form-urlencoded',
    },
    body: new URLSearchParams(params).toString()
  });
  const raw = await resp.text();
  return JSON.parse(aesDecrypt(raw.trim()));
}

// ── Web API (GET) ──
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

// ═══════════════════════════════════════════════════════════════
//  TESTS
// ═══════════════════════════════════════════════════════════════

let passed = 0, failed = 0;
function ok(label, cond, detail='') {
  if (cond) { passed++; console.log(`  ✅ ${label}`); }
  else { failed++; console.log(`  ❌ ${label} ${detail}`); }
}

console.log('🚀 Filmin Integration Verification\n');

// 1. Init
console.log('1. Mobile Init');
const init = await mobilePost('/api/public/init', { invited_by: '' });
ok('code=10000', init.code===10000, `got ${init.code}`);
globalThis._token = init.result?.user_info?.token || '';
ok('token received', !!globalThis._token);

// 2. Hot Search
console.log('\n2. Hot Search');
const hot = await mobilePost('/api/search/hot_search');
ok('code=10000', hot.code===10000);
ok('has results', hot.result?.length > 0, `count=${hot.result?.length}`);
console.log(`   📌 Top: "${hot.result?.[0]?.vod_name}"`);

// 3. Search
console.log('\n3. Search "Invincible"');
const search = await mobilePost('/api/search/result', { keyword: 'Invincible', page: '1' });
ok('code=10000', search.code===10000);
ok('has results', search.result?.length > 0);
const invincible = search.result?.find(v => v.vod_name?.includes('Invincible'));
if (invincible) {
  console.log(`   🎬 Found: "${invincible.vod_name}" (id=${invincible.id})`);
  ok('has vod_nc_show_id (TMDB)', invincible.vod_nc_show_id > 0, `got ${invincible.vod_nc_show_id}`);
  
  // Determine media type
  const type = invincible.type_pid === 1 ? 'movie' : invincible.type_pid === 2 ? 'tv' : (invincible.vod_total <= 1 ? 'movie' : 'tv');
  console.log(`   📺 Type: ${type} | TMDB ID: ${invincible.vod_nc_show_id}`);
}

// 4. VOD Info (Web API)
console.log('\n4. VOD Detail (info_web_get)');
const testVodId = invincible?.id || 555064;
const now = new Date();
const dh = `${now.getFullYear()}${String(now.getMonth()+1).padStart(2,'0')}${String(now.getDate()).padStart(2,'0')}${String(now.getHours()).padStart(2,'0')}${Math.floor(now.getMinutes()/10)}`;
const vod = await webGet(`/api/vod/info_web_get?vod_id=${testVodId}&audio_type=0&date=${dh}`);
ok('code=10000', vod.code===10000, `got ${vod.code}`);
if (vod.result) {
  const v = vod.result;
  ok('has vod_name', !!v.vod_name);
  ok('has vod_collection', v.vod_collection?.length > 0, `episodes=${v.vod_collection?.length}`);
  ok('has series_info', v.series_info?.length > 0, `seasons=${v.series_info?.length}`);
  ok('has audio_type_option', v.audio_type_option?.length > 0);
  ok('has vod_nc_show_id', v.vod_nc_show_id > 0);
  
  console.log(`\n   📋 Title: ${v.vod_name}`);
  console.log(`   📅 Year: ${v.vod_year}`);
  console.log(`   ⭐ Score: ${v.vod_douban_score}`);
  console.log(`   🎭 Cast: ${v.vod_actor}`);
  console.log(`   🏷️  Tags: ${v.vod_tag}`);
  console.log(`   📺 Episodes: ${v.vod_collection?.length}`);
  console.log(`   🔗 TMDB ID: ${v.vod_nc_show_id}`);
  
  if (v.series_info) {
    console.log(`   📦 Seasons: ${v.series_info.map(s => `${s.series} (id=${s.vod_id})`).join(', ')}`);
  }
  
  if (v.audio_type_option) {
    console.log(`   🔊 Audio: ${v.audio_type_option.map(a => a.type_name).join(', ')}`);
  }
  
  if (v.vod_collection?.[0]) {
    const ep = v.vod_collection[0];
    console.log(`   🎞️  Ep1: "${ep.title}" (${ep.duration}, ${ep.vod_duration}s)`);
  }
}

// 5. TMDB Cross-Reference Verification
console.log('\n5. TMDB Cross-Reference');
const tmdbId = vod.result?.vod_nc_show_id;
if (tmdbId) {
  console.log(`   Verifying TMDB ID ${tmdbId}...`);
  try {
    const tmdbResp = await fetch(`https://api.themoviedb.org/3/tv/${tmdbId}?api_key=2dca580c2a14b55200e784d157207b4d`);
    if (tmdbResp.ok) {
      const tmdb = await tmdbResp.json();
      ok('TMDB lookup success', true);
      ok('titles match', tmdb.name?.toLowerCase().includes('invincible') || vod.result?.vod_name?.toLowerCase().includes(tmdb.name?.toLowerCase()), 
        `TMDB="${tmdb.name}" vs Filmin="${vod.result?.vod_name}"`);
      console.log(`   ✨ TMDB: "${tmdb.name}" — ${tmdb.number_of_seasons} seasons`);
    } else {
      ok('TMDB lookup', false, `status=${tmdbResp.status}`);
    }
  } catch(e) {
    console.log(`   ⚠️ TMDB lookup skipped (no API key or network): ${e.message}`);
  }
}

// 6. Channels
console.log('\n6. Channels');
const channels = await mobilePost('/api/channel/get_list', { type: '1' });
ok('code=10000', channels.code===10000);
ok('has channels', channels.result?.length > 0, `count=${channels.result?.length}`);
if (channels.result) {
  console.log(`   📡 Channels: ${channels.result.map(c => c.channel_name).join(', ')}`);
}

// ═══ Summary ═══
console.log(`\n${'═'.repeat(50)}`);
console.log(`  Results: ${passed} passed, ${failed} failed`);
console.log(`${'═'.repeat(50)}`);
if (failed === 0) console.log('  🎉 ALL TESTS PASSED — Filmin integration verified!');
else console.log('  ⚠️  Some tests failed — check output above.');
