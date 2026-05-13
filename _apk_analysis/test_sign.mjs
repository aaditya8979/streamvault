/**
 * Filmin API - Complete Integration Test
 * 
 * Auth flow extracted from decompiled APK (ed/b0.java, ed/e.java, zp/f.java):
 *  1. 3DES decrypt secret: "MxASAkl/yHTGg+/Tw1R7u96nGqkWsOZ2"
 *     - key: "dsawdf634eebGFHITR5UT9kS0" (first 24 bytes), iv: "32456738"
 *  2. sign = MD5(decryptedSecret + deviceId + curTime).toUpperCase()
 *  3. Responses are AES-128-CBC encrypted (key: "0123456789123456", iv: "2015030120123456")
 */

import crypto from 'crypto';

// ===================== CRYPTO HELPERS =====================

function desedeDecrypt(base64Encrypted) {
  const keyRaw = Buffer.from('dsawdf634eebGFHITR5UT9kS0', 'utf-8');
  const key = keyRaw.subarray(0, 24);
  const iv = Buffer.from('32456738', 'utf-8');
  const encrypted = Buffer.from(base64Encrypted, 'base64');
  const decipher = crypto.createDecipheriv('des-ede3-cbc', key, iv);
  decipher.setAutoPadding(true);
  let decrypted = decipher.update(encrypted, undefined, 'utf-8');
  decrypted += decipher.final('utf-8');
  return decrypted;
}

function aesDecrypt(base64Encrypted) {
  const key = Buffer.from('0123456789123456', 'utf-8');
  const iv = Buffer.from('2015030120123456', 'utf-8');
  const encrypted = Buffer.from(base64Encrypted, 'base64');
  const decipher = crypto.createDecipheriv('aes-128-cbc', key, iv);
  decipher.setAutoPadding(true);
  let decrypted = decipher.update(encrypted);
  decrypted = Buffer.concat([decrypted, decipher.final()]);
  return decrypted.toString('utf-8');
}

function md5(str) {
  return crypto.createHash('md5').update(str).digest('hex');
}

function generateDeviceId() {
  const chars = [];
  for (let i = 0; i < 22; i++) {
    if (Math.random() < 0.5) {
      chars.push(String.fromCharCode(Math.floor(Math.random() * 10) + 48));
    } else {
      chars.push(String.fromCharCode(Math.floor(Math.random() * 6) + 97));
    }
  }
  return chars.join('');
}

// ===================== API CLIENT =====================

const SECRET_B64 = 'MxASAkl/yHTGg+/Tw1R7u96nGqkWsOZ2';
const DECRYPTED_SECRET = desedeDecrypt(SECRET_B64);
const DEVICE_ID = generateDeviceId();
const BASE_URL = 'https://filmin.ajfysu.com';

console.log('Decrypted secret:', DECRYPTED_SECRET);
console.log('Device ID:', DEVICE_ID);

function makeHeaders(token = '') {
  const curTime = Date.now().toString();
  const sign = md5(DECRYPTED_SECRET + DEVICE_ID + curTime).toUpperCase();
  return {
    'User-Agent': 'okhttp/4.11.0',
    'app_id': 'filmin',
    'package_name': 'com.dramarush.shortin',
    'version': '40000',
    'sys_platform': '2',
    'mob_mfr': 'google',
    'mobmodel': 'Pixel 7',
    'sysrelease': '14',
    'device_id': DEVICE_ID,
    'gaid': '',
    'channel_code': 'google',
    'androidid': DEVICE_ID,
    'cur_time': curTime,
    'token': token,
    'sign': sign,
    'is_vvv': '0',
    'is_language': 'en',
    'is_display': '1',
    'app_language': 'en',
    'en_al': '0',
    'Content-Type': 'application/x-www-form-urlencoded',
  };
}

async function apiCall(endpoint, params = {}, token = '') {
  const h = makeHeaders(token);
  const resp = await fetch(BASE_URL + endpoint, {
    method: 'POST',
    headers: h,
    body: new URLSearchParams(params).toString(),
  });
  const raw = await resp.text();
  if (!raw || raw === 'error1') {
    return { _raw: raw, _status: resp.status };
  }
  try {
    const decrypted = aesDecrypt(raw.trim());
    return JSON.parse(decrypted);
  } catch (e) {
    return { _raw: raw, _status: resp.status, _error: e.message };
  }
}

// ===================== TESTS =====================

// 1. Init — get token
console.log('\n=== 1. /api/public/init ===');
const initResult = await apiCall('/api/public/init', { invited_by: '' });
const token = initResult?.result?.user_info?.token || '';
console.log('Code:', initResult.code, '| Message:', initResult.message);
console.log('Token:', token.substring(0, 30) + '...');
console.log('User ID:', initResult?.result?.user_info?.user_id);

// 2. Hot Search — no params needed  
console.log('\n=== 2. /api/search/hot_search ===');
const hotSearch = await apiCall('/api/search/hot_search', {}, token);
console.log('Code:', hotSearch.code, '| Results:', JSON.stringify(hotSearch.result || hotSearch._raw).substring(0, 300));

// 3. Type/Category list — no params
console.log('\n=== 3. /api/type/get_list ===');
const typeList = await apiCall('/api/type/get_list', {}, token);
console.log('Code:', typeList.code, '| Results:', JSON.stringify(typeList.result || typeList._raw).substring(0, 300));

// 4. Channel list
console.log('\n=== 4. /api/channel/get_list ===');
const channelList = await apiCall('/api/channel/get_list', { type: '1' }, token);
console.log('Code:', channelList.code, '| Results:', JSON.stringify(channelList.result || channelList._raw).substring(0, 500));

// 5. Search — try the hot search keyword
const searchKeyword = hotSearch?.result?.[0]?.name || 'Glory';
console.log('\n=== 5. /api/search/result ===');
console.log('Searching for:', searchKeyword);
const searchResult = await apiCall('/api/search/result', { keyword: searchKeyword, page: '1' }, token);
console.log('Code:', searchResult.code, '| Count:', searchResult.result?.length || 0);
if (searchResult.result && searchResult.result.length > 0) {
  console.log('First result:', JSON.stringify(searchResult.result[0], null, 2).substring(0, 500));
}

// 6. Channel Info — browse content (must be before 6b which references it)
console.log('\n=== 6. /api/channel/get_info (Recommend) ===');
const channelId = channelList?.result?.[0]?.id || 520;
const channelInfo = await apiCall('/api/channel/get_info', { channel_id: channelId.toString(), page: '1' }, token);
console.log('Code:', channelInfo.code, '| Modules:', channelInfo.result?.length || 0);
if (channelInfo.result && channelInfo.result.length > 0) {
  const firstBlock = channelInfo.result[0];
  console.log('First module:', firstBlock.module_name, '| Blocks:', firstBlock.block_list?.length);
  if (firstBlock.block_list?.[0]?.vod_info) {
    console.log('VOD info from channel:', JSON.stringify(firstBlock.block_list[0].vod_info, null, 2).substring(0, 500));
  }
}

// 7. Video Info — try just vod_id (body sign comes from local P2P server we can't access)
const vodId = hotSearch?.result?.[0]?.vod_id;
if (vodId) {
  console.log('\n=== 7. /api/vod/info_new (vod_id=' + vodId + ', no body sign) ===');
  const vodInfo = await apiCall('/api/vod/info_new', { vod_id: vodId.toString(), audio_type: '0' }, token);
  console.log('Result:', JSON.stringify(vodInfo).substring(0, 400));
}

// 8. Search/Screen — filter-based search returns full video objects
console.log('\n=== 8. /api/search/screen (Movies, All) ===');
const screenResult = await apiCall('/api/search/screen', {
  type_id: '1', page: '1', psize: '10', type: 'All', year: 'All', area: 'All'
}, token);
console.log('Code:', screenResult.code, '| Count:', screenResult.result?.length || 0);
if (screenResult.result && screenResult.result.length > 0) {
  const v = screenResult.result[0];
  console.log('First VOD:', JSON.stringify(v, null, 2).substring(0, 800));
}

// 9. Search/Recommend
console.log('\n=== 9. /api/search/recommend ===');
const recResult = await apiCall('/api/search/recommend', { page: '1' }, token);
console.log('Code:', recResult.code, '| Count:', recResult.result?.length || 0);
if (recResult.result && recResult.result.length > 0) {
  console.log('First rec:', JSON.stringify(recResult.result[0], null, 2).substring(0, 500));
}

console.log('\n=== DONE ===');
