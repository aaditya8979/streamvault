/**
 * Brute-force the P2P sign for /api/vod/info_new
 * 
 * From ShortTkActivity.java:
 *   - P2P SDK key: "c456f75b75d7a1b0b2e0fa85833292a6"
 *   - Verify URL: /control?msg=verify&device_id={androidId}{vodId}&ts={timestamp}
 *   - Response from local server = sign for POST body
 *   - Body params: vod_id, cur_time, sign, audio_type
 */

import crypto from 'crypto';

function desedeDecrypt(base64Encrypted) {
  const key = Buffer.from('dsawdf634eebGFHITR5UT9kS0', 'utf-8').subarray(0, 24);
  const iv = Buffer.from('32456738', 'utf-8');
  const encrypted = Buffer.from(base64Encrypted, 'base64');
  const decipher = crypto.createDecipheriv('des-ede3-cbc', key, iv);
  decipher.setAutoPadding(true);
  return decipher.update(encrypted, undefined, 'utf-8') + decipher.final('utf-8');
}

function aesDecrypt(base64Encrypted) {
  const key = Buffer.from('0123456789123456', 'utf-8');
  const iv = Buffer.from('2015030120123456', 'utf-8');
  const encrypted = Buffer.from(base64Encrypted, 'base64');
  const decipher = crypto.createDecipheriv('aes-128-cbc', key, iv);
  decipher.setAutoPadding(true);
  let d = decipher.update(encrypted);
  return Buffer.concat([d, decipher.final()]).toString('utf-8');
}

function md5(str) { return crypto.createHash('md5').update(str).digest('hex'); }

function hmacMd5(key, data) { return crypto.createHmac('md5', key).update(data).digest('hex'); }

function sha256(str) { return crypto.createHash('sha256').update(str).digest('hex'); }

function generateDeviceId() {
  const chars = [];
  for (let i = 0; i < 22; i++) {
    chars.push(Math.random() < 0.5 
      ? String.fromCharCode(Math.floor(Math.random() * 10) + 48) 
      : String.fromCharCode(Math.floor(Math.random() * 6) + 97));
  }
  return chars.join('');
}

const DECRYPTED_SECRET = desedeDecrypt('MxASAkl/yHTGg+/Tw1R7u96nGqkWsOZ2');
const DEVICE_ID = generateDeviceId();
const BASE_URL = 'https://filmin.ajfysu.com';
const P2P_KEY = 'c456f75b75d7a1b0b2e0fa85833292a6';

console.log('Secret:', DECRYPTED_SECRET);
console.log('Device ID:', DEVICE_ID);

// Step 1: Init to get token
async function apiCall(endpoint, params = {}, token = '') {
  const curTime = Date.now().toString();
  const sign = md5(DECRYPTED_SECRET + DEVICE_ID + curTime).toUpperCase();
  const headers = {
    'User-Agent': 'okhttp/4.11.0',
    'app_id': 'filmin', 'package_name': 'com.dramarush.shortin',
    'version': '40000', 'sys_platform': '2',
    'mob_mfr': 'google', 'mobmodel': 'Pixel 7', 'sysrelease': '14',
    'device_id': DEVICE_ID, 'gaid': '', 'channel_code': 'google',
    'androidid': DEVICE_ID, 'cur_time': curTime, 'token': token,
    'sign': sign, 'is_vvv': '0', 'is_language': 'en', 'is_display': '1',
    'app_language': 'en', 'en_al': '0',
    'Content-Type': 'application/x-www-form-urlencoded',
  };
  const resp = await fetch(BASE_URL + endpoint, {
    method: 'POST', headers, body: new URLSearchParams(params).toString(),
  });
  const raw = await resp.text();
  try {
    const dec = aesDecrypt(raw.trim());
    return JSON.parse(dec);
  } catch (e) {
    return { _raw: raw, _status: resp.status, _error: e.message };
  }
}

// Init
const initResult = await apiCall('/api/public/init', { invited_by: '' });
const token = initResult.result?.user_info?.token || '';
console.log('Token:', token.substring(0, 40) + '...');

// Get a valid vod_id 
const hotSearch = await apiCall('/api/search/hot_search', {}, token);
const vodId = hotSearch.result?.[0]?.vod_id || 566241;
console.log('Testing vod_id:', vodId);

// ===================== BRUTE FORCE P2P SIGN =====================

const ts = Date.now().toString();
const deviceIdPlusVodId = DEVICE_ID + vodId; // URL pattern: device_id={androidId}{vodId}

console.log('\n=== Trying sign algorithms for vod/info_new body sign ===');

const signCandidates = {
  // MD5 variants
  'md5(p2pKey+deviceId+vodId+ts)': md5(P2P_KEY + DEVICE_ID + vodId + ts),
  'md5(ts+deviceId+vodId+p2pKey)': md5(ts + DEVICE_ID + vodId + P2P_KEY),
  'md5(p2pKey+deviceIdVodId+ts)': md5(P2P_KEY + deviceIdPlusVodId + ts),
  'md5(ts+p2pKey+deviceIdVodId)': md5(ts + P2P_KEY + deviceIdPlusVodId),
  'md5(deviceIdVodId+ts)': md5(deviceIdPlusVodId + ts),
  'md5(ts+deviceIdVodId)': md5(ts + deviceIdPlusVodId),
  'md5(p2pKey+ts)': md5(P2P_KEY + ts),
  'md5(ts+p2pKey)': md5(ts + P2P_KEY),
  'md5(deviceId+ts)': md5(DEVICE_ID + ts),
  'md5(vodId+ts)': md5(vodId + ts),
  'md5(ts+vodId)': md5(ts + vodId),
  // HMAC-MD5 variants
  'hmac(p2pKey, deviceIdVodId+ts)': hmacMd5(P2P_KEY, deviceIdPlusVodId + ts),
  'hmac(p2pKey, ts+deviceIdVodId)': hmacMd5(P2P_KEY, ts + deviceIdPlusVodId),
  'hmac(p2pKey, vodId+ts)': hmacMd5(P2P_KEY, vodId + ts),
  // SHA256 variants  
  'sha256(p2pKey+deviceIdVodId+ts)': sha256(P2P_KEY + deviceIdPlusVodId + ts),
  // Use decrypted secret instead
  'md5(secret+deviceId+vodId+ts)': md5(DECRYPTED_SECRET + DEVICE_ID + vodId + ts),
  'md5(secret+deviceIdVodId+ts)': md5(DECRYPTED_SECRET + deviceIdPlusVodId + ts),
  // Same as header sign but with vodId appended
  'md5(secret+deviceId+ts) [header sign]': md5(DECRYPTED_SECRET + DEVICE_ID + ts),
  'md5(secret+deviceId+ts).upper()': md5(DECRYPTED_SECRET + DEVICE_ID + ts).toUpperCase(),
};

// Try each sign candidate
for (const [name, signValue] of Object.entries(signCandidates)) {
  const result = await apiCall('/api/vod/info_new', {
    vod_id: vodId.toString(),
    cur_time: ts,
    sign: signValue,
    audio_type: '0',
  }, token);
  
  const status = result.code ? `code=${result.code}` : (result._raw || '').substring(0, 60);
  const success = result.code === 10000;
  console.log(`${success ? '✅' : '❌'} ${name} → ${status}`);
  
  if (success && result.result) {
    console.log('\n🎉 FOUND WORKING SIGN!');
    console.log('Algorithm:', name);
    console.log('Sign value:', signValue);
    console.log('VOD name:', result.result.vod_name);
    console.log('VOD URL:', (result.result.vod_url || '').substring(0, 200));
    console.log('Collection:', result.result.vod_collection?.length, 'episodes');
    if (result.result.vod_collection?.[0]) {
      console.log('First episode:', JSON.stringify(result.result.vod_collection[0]).substring(0, 500));
    }
    process.exit(0);
  }
}

// Also try without any sign at all, and with empty sign
console.log('\n=== Trying without sign params ===');

const noSign = await apiCall('/api/vod/info_new', { vod_id: vodId.toString() }, token);
console.log('No body params:', noSign.code || noSign._raw?.substring(0, 60));

const emptySign = await apiCall('/api/vod/info_new', { 
  vod_id: vodId.toString(), cur_time: ts, sign: '', audio_type: '0' 
}, token);
console.log('Empty sign:', emptySign.code || emptySign._raw?.substring(0, 60));

// Try with the header sign (same algorithm)
const headerSign = md5(DECRYPTED_SECRET + DEVICE_ID + ts).toUpperCase();
const withHeaderSign = await apiCall('/api/vod/info_new', {
  vod_id: vodId.toString(), cur_time: ts, sign: headerSign, audio_type: '0'
}, token);
console.log('Header sign in body:', withHeaderSign.code || withHeaderSign._raw?.substring(0, 60));

console.log('\n=== DONE ===');
