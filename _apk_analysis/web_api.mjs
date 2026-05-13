/**
 * Final attempt: Use P2P ck (content key) to compute body sign
 * for vod/info_new. ppcineweb returns code 40000 (structured "fail")
 * instead of crashing, meaning the server PROCESSES the request.
 * 
 * P2P verify URL: /control?msg=verify&device_id={deviceId}{vodId}&ts={timestamp}
 * P2P ck: 92b991dfcf878f362f6044f3d6e013255c0726617e4d17858890ecdab1d291c7
 */
import crypto from 'crypto';

const md5 = s => crypto.createHash('md5').update(s).digest('hex');
const sha256 = s => crypto.createHash('sha256').update(s).digest('hex');
const hmacMd5 = (k,d) => crypto.createHmac('md5',k).update(d).digest('hex');
const hmacSha256 = (k,d) => crypto.createHmac('sha256',k).update(d).digest('hex');
const aesDecrypt = b64 => {
  const d = crypto.createDecipheriv('aes-128-cbc', Buffer.from('0123456789123456'), Buffer.from('2015030120123456'));
  d.setAutoPadding(true);
  return Buffer.concat([d.update(Buffer.from(b64,'base64')), d.final()]).toString('utf-8');
};

const DEV = md5('1111111');
const BASE = 'https://filmin.ajfysu.com';
const CK = '92b991dfcf878f362f6044f3d6e013255c0726617e4d17858890ecdab1d291c7';
const P2P_KEY = 'c456f75b75d7a1b0b2e0fa85833292a6';
const VOD_ID = '555064';

async function webCall(bodyParams) {
  const ct = Date.now().toString();
  const headerSign = md5('ppcineweb123'+DEV+ct).toUpperCase();
  const resp = await fetch(BASE+'/api/vod/info_new', {
    method:'POST',
    headers: {
      'User-Agent':'Mozilla/5.0','app_id':'ppcineweb','channel_code':'ppcinewebb_1000',
      'device_id':DEV,'cur_time':ct,'sign':headerSign,'token':'','version':'30006',
      'sys_platform':'3','app_language':'en','domain':'enbbu.k5ca.com','en_al':'0',
      'Content-Type':'application/x-www-form-urlencoded',
    },
    body: new URLSearchParams(bodyParams).toString()
  });
  const raw = await resp.text();
  try { return JSON.parse(aesDecrypt(raw.trim())); } catch(e) { return {_raw: raw.substring(0,100)}; }
}

const ts = Math.floor(Date.now() / 1000).toString(); // Unix seconds
const tsMs = Date.now().toString(); // Unix ms
const deviceVodId = DEV + VOD_ID;

// Generate all possible sign candidates using CK and P2P_KEY
const signCandidates = {
  // CK-based
  'md5(ck+dev+vod+ts)': md5(CK+DEV+VOD_ID+ts),
  'md5(ck+dev+vod+tsMs)': md5(CK+DEV+VOD_ID+tsMs),
  'md5(ck+devVod+ts)': md5(CK+deviceVodId+ts),
  'md5(ck+ts+dev+vod)': md5(CK+ts+DEV+VOD_ID),
  'md5(ck+ts)': md5(CK+ts),
  'md5(ts+ck)': md5(ts+CK),
  'md5(ck+vod+ts)': md5(CK+VOD_ID+ts),
  'md5(ck+vod+ts).upper': md5(CK+VOD_ID+ts).toUpperCase(),
  'sha256(ck+devVod+ts)': sha256(CK+deviceVodId+ts),
  'hmac(ck,devVod+ts)': hmacMd5(CK, deviceVodId+ts),
  'hmac(ck,vod+ts)': hmacMd5(CK, VOD_ID+ts),
  
  // P2P_KEY-based
  'md5(p2p+dev+vod+ts)': md5(P2P_KEY+DEV+VOD_ID+ts),
  'md5(p2p+devVod+ts)': md5(P2P_KEY+deviceVodId+ts),
  'hmac(p2p,devVod+ts)': hmacMd5(P2P_KEY, deviceVodId+ts),
  
  // CK first 32 chars (MD5-length)
  'md5(ck32+devVod+ts)': md5(CK.substring(0,32)+deviceVodId+ts),
  'md5(ck32+vod+ts)': md5(CK.substring(0,32)+VOD_ID+ts),
  
  // Just the basic header sign approach
  'md5(ppcineweb123+dev+ts)': md5('ppcineweb123'+DEV+ts),
  
  // Empty sign and no sign
  'empty': '',
};

console.log('Testing', Object.keys(signCandidates).length, 'sign algorithms...\n');

for (const [name, signValue] of Object.entries(signCandidates)) {
  const bodyTs = name.includes('tsMs') ? tsMs : ts;
  const result = await webCall({
    vod_id: VOD_ID,
    audio_type: '0',
    cur_time: bodyTs,
    sign: signValue,
  });
  
  const success = result.code === 10000;
  const icon = success ? '✅' : (result.code === 40000 ? '❌' : '⚠️');
  console.log(`${icon} ${name} → code=${result.code || 'N/A'} msg=${result.message || result._raw?.substring(0,40) || ''}`);
  
  if (success && result.result) {
    console.log('\n🎉🎉🎉 CRACKED THE SIGN! 🎉🎉🎉');
    console.log('Algorithm:', name);
    console.log('Sign:', signValue);
    console.log('vod_url:', result.result.vod_collection?.[0]?.vod_url);
    process.exit(0);
  }
}

// Also try without cur_time and sign entirely (just vod_id + audio_type)
console.log('\n=== Without body sign params ===');
let r = await webCall({ vod_id: VOD_ID, audio_type: '0' });
console.log('No sign params:', r.code, r.message);

r = await webCall({ vod_id: VOD_ID });
console.log('Just vod_id:', r.code, r.message);

console.log('\n=== DONE ===');
