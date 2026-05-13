/**
 * Alternative approaches to get streaming URLs from Filmin
 * The vod/info_new error is NOT sign-related — all signs return same error.
 * Try: different app_ids, sunshine endpoints, different base URLs.
 */

import crypto from 'crypto';

function desedeDecrypt(b64) {
  const key = Buffer.from('dsawdf634eebGFHITR5UT9kS0', 'utf-8').subarray(0, 24);
  const iv = Buffer.from('32456738', 'utf-8');
  const d = crypto.createDecipheriv('des-ede3-cbc', key, iv);
  d.setAutoPadding(true);
  return d.update(Buffer.from(b64, 'base64'), undefined, 'utf-8') + d.final('utf-8');
}

function aesDecrypt(b64) {
  const d = crypto.createDecipheriv('aes-128-cbc', 
    Buffer.from('0123456789123456'), Buffer.from('2015030120123456'));
  d.setAutoPadding(true);
  const buf = d.update(Buffer.from(b64, 'base64'));
  return Buffer.concat([buf, d.final()]).toString('utf-8');
}

function md5(s) { return crypto.createHash('md5').update(s).digest('hex'); }

function genId() {
  return Array.from({length: 22}, () => 
    Math.random() < 0.5 ? String.fromCharCode(48 + Math.floor(Math.random()*10)) 
                        : String.fromCharCode(97 + Math.floor(Math.random()*6))
  ).join('');
}

const SECRET = desedeDecrypt('MxASAkl/yHTGg+/Tw1R7u96nGqkWsOZ2');
const DEV_ID = genId();

async function call(baseUrl, endpoint, params = {}, token = '', appId = 'filmin', isJson = false) {
  const ct = Date.now().toString();
  const sign = md5(SECRET + DEV_ID + ct).toUpperCase();
  const headers = {
    'User-Agent': 'okhttp/4.11.0', 'app_id': appId,
    'package_name': 'com.dramarush.shortin', 'version': '40000',
    'sys_platform': '2', 'mob_mfr': 'google', 'mobmodel': 'Pixel 7',
    'sysrelease': '14', 'device_id': DEV_ID, 'gaid': '',
    'channel_code': 'google', 'androidid': DEV_ID,
    'cur_time': ct, 'token': token, 'sign': sign,
    'is_vvv': '0', 'is_language': 'en', 'is_display': '1',
    'app_language': 'en', 'en_al': '0',
    'Content-Type': isJson ? 'application/json' : 'application/x-www-form-urlencoded',
  };
  const body = isJson ? JSON.stringify(params) : new URLSearchParams(params).toString();
  const resp = await fetch(baseUrl + endpoint, { method: 'POST', headers, body });
  const raw = await resp.text();
  try {
    return JSON.parse(aesDecrypt(raw.trim()));
  } catch (e) {
    // Try parsing as plain JSON (some endpoints might not be encrypted)
    try { return JSON.parse(raw); } catch(e2) {}
    return { _raw: raw.substring(0, 200), _status: resp.status };
  }
}

const BASE = 'https://filmin.ajfysu.com';

// 1. Init
const init = await call(BASE, '/api/public/init', { invited_by: '' });
const token = init.result?.user_info?.token || '';
const userId = init.result?.user_info?.user_id;
console.log('Token:', token.substring(0, 40) + '... | User:', userId);

// Dump full init config to see all available URLs
const sysConf = init.result?.sys_conf;
if (sysConf) {
  console.log('\n=== SYSTEM CONFIG ===');
  console.log('api_url2:', sysConf.api_url2);
  console.log('p2p_config:', sysConf.p2p_config);
  console.log('quote_vod_config_app_id:', sysConf.quote_vod_config_app_id);
  console.log('browser_site:', sysConf.browser_site);
  console.log('vod_domain:', sysConf.vod_domain);
  console.log('pic_domain:', sysConf.pic_domain);
  console.log('share_content:', (sysConf.share_content || '').substring(0, 100));
  console.log('external_h5_url:', (sysConf.external_h5_url || '').substring(0, 100));
  console.log('error_m3u8_url:', sysConf.error_m3u8_url);
  
  // Look for ALL URL fields
  for (const [k, v] of Object.entries(sysConf)) {
    if (typeof v === 'string' && (v.includes('http') || v.includes('url'))) {
      if (!['share_content','external_h5_url','privacy_url','api_url2','browser_site','error_m3u8_url'].includes(k)) {
        console.log(`  ${k}: ${v.substring(0, 120)}`);
      }
    }
  }
}

// Get a vod_id
const hot = await call(BASE, '/api/search/hot_search', {}, token);
const vodId = hot.result?.[0]?.vod_id || 566241;
console.log('\nTarget vod_id:', vodId);

// 2. Try with app_id = "cinemain"
console.log('\n=== Try app_id=cinemain ===');
const initCm = await call(BASE, '/api/public/init', { invited_by: '' }, '', 'cinemain');
const tokenCm = initCm.result?.user_info?.token || '';
console.log('Cinemain init:', initCm.code, '| Token:', tokenCm ? tokenCm.substring(0, 30) + '...' : 'NONE');

if (tokenCm) {
  const vodCm = await call(BASE, '/api/vod/info_new', { vod_id: vodId.toString() }, tokenCm, 'cinemain');
  console.log('Cinemain vod/info_new:', vodCm.code || vodCm._raw?.substring(0, 80));
}

// 3. Try sunshine endpoints (JSON body)
console.log('\n=== Sunshine endpoints ===');
const sunshine1 = await call(BASE, '/sunshine/video/showHomePageVideosForPage', { page: 1 }, token, 'filmin', true);
console.log('showHomePageVideos:', sunshine1.code || sunshine1._raw?.substring(0, 80) || JSON.stringify(sunshine1).substring(0, 200));

const sunshine2 = await call(BASE, '/sunshine/video/getSlideVideos', {}, token, 'filmin', true);
console.log('getSlideVideos:', sunshine2.code || sunshine2._raw?.substring(0, 80) || JSON.stringify(sunshine2).substring(0, 200));

// 4. Try api_url2 as base
if (sysConf?.api_url2) {
  console.log('\n=== Try api_url2:', sysConf.api_url2, '===');
  const init2 = await call(sysConf.api_url2, '/api/public/init', { invited_by: '' });
  const token2 = init2.result?.user_info?.token || '';
  if (token2) {
    const vod2 = await call(sysConf.api_url2, '/api/vod/info_new', { vod_id: vodId.toString() }, token2);
    console.log('vod/info_new on api_url2:', vod2.code || vod2._raw?.substring(0, 80));
  } else {
    console.log('api_url2 init failed:', JSON.stringify(init2).substring(0, 200));
  }
}

// 5. Try the vod_type_list endpoint which might include video URLs
console.log('\n=== /api/vod/type_list ===');
const typeList = await call(BASE, '/api/vod/type_list', { type: '1', page: '1', psize: '20', type_name: 'All', year: 'All', area: 'All' }, token);
console.log('type_list:', typeList.code || typeList._raw?.substring(0, 80));
if (typeList.result?.length > 0) {
  console.log('First:', JSON.stringify(typeList.result[0]).substring(0, 500));
}

// 6. Try /api/vod/detail (maybe there's a non-info_new detail endpoint)
console.log('\n=== /api/vod/detail ===');
const detail = await call(BASE, '/api/vod/detail', { vod_id: vodId.toString() }, token);
console.log('vod/detail:', detail.code || detail._raw?.substring(0, 80));

// 7. Try /api/vod/get_url or similar
console.log('\n=== /api/vod/get_url ===');
const getUrl = await call(BASE, '/api/vod/get_url', { vod_id: vodId.toString() }, token);
console.log('vod/get_url:', getUrl.code || getUrl._raw?.substring(0, 80));

// 8. Check browser site for web player
if (sysConf?.browser_site) {
  console.log('\n=== Browser site check ===');
  try {
    const resp = await fetch(sysConf.browser_site, { headers: { 'User-Agent': 'Mozilla/5.0' } });
    const html = await resp.text();
    console.log('Browser site status:', resp.status, '| Size:', html.length);
    // Look for API URLs or video player code
    const apiMatches = html.match(/https?:\/\/[^\s"'<>]+/g) || [];
    console.log('URLs found:', apiMatches.slice(0, 5));
  } catch(e) { console.log('Browser site error:', e.message); }
}

console.log('\n=== DONE ===');
