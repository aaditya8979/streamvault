import crypto from 'crypto';
const md5 = s => crypto.createHash('md5').update(s).digest('hex');
const des = b64 => { const d=crypto.createDecipheriv('des-ede3-cbc',Buffer.from('dsawdf634eebGFHITR5UT9kS0').subarray(0,24),Buffer.from('32456738'));d.setAutoPadding(true);return d.update(Buffer.from(b64,'base64'),undefined,'utf-8')+d.final('utf-8');};
const aes = b64 => { const d=crypto.createDecipheriv('aes-128-cbc',Buffer.from('0123456789123456'),Buffer.from('2015030120123456'));d.setAutoPadding(true);return Buffer.concat([d.update(Buffer.from(b64,'base64')),d.final()]).toString('utf-8');};
const sleep = ms => new Promise(r => setTimeout(r, ms));

const SDK_KEY = 'c456f75b75d7a1b0b2e0fa85833292a6';
const SECRET = des('MxASAkl/yHTGg+/Tw1R7u96nGqkWsOZ2');
const DEV_ID = md5('mydevice123');
let TOKEN = '';

async function post(ep, p = {}, retries = 3) {
  for (let i = 0; i < retries; i++) {
    try {
      const ct = Date.now().toString();
      const s = md5(SECRET + DEV_ID + ct).toUpperCase();
      const r = await fetch('https://filmin.ajfysu.com' + ep, {
        method: 'POST', headers: {
          'User-Agent': 'okhttp/4.11.0', 'app_id': 'filmin', 'package_name': 'com.dramarush.shortin',
          'version': '40000', 'sys_platform': '2', 'device_id': DEV_ID, 'cur_time': ct, 'sign': s,
          'token': TOKEN, 'channel_code': 'google', 'androidid': DEV_ID, 'app_language': 'en',
          'en_al': '0', 'Content-Type': 'application/x-www-form-urlencoded',
        }, body: new URLSearchParams(p).toString()
      });
      return (await r.text()).trim();
    } catch (e) {
      if (i < retries - 1) { await sleep(2000 * (i + 1)); } else throw e;
    }
  }
}

// Init
const initRaw = await post('/api/public/init', { invited_by: '' });
TOKEN = JSON.parse(aes(initRaw)).result.user_info.token;
console.log('Token:', TOKEN ? '✅' : '❌');

const VOD = '555064';

// Generate signs with FRESH timestamps for each attempt
function makeSigns(ts) {
  const devVod = DEV_ID + VOD;
  return [
    ['md5(sdk+devVod+ts)', md5(SDK_KEY + devVod + ts)],
    ['md5(sdk+dev+vod+ts)', md5(SDK_KEY + DEV_ID + VOD + ts)],
    ['md5(devVod+ts+sdk)', md5(devVod + ts + SDK_KEY)],
    ['md5(ts+devVod+sdk)', md5(ts + devVod + SDK_KEY)],
    ['md5(sdk+ts+devVod)', md5(SDK_KEY + ts + devVod)],
    ['md5(sdk+vod+ts)', md5(SDK_KEY + VOD + ts)],
    ['md5(vod+ts+sdk)', md5(VOD + ts + SDK_KEY)],
    ['md5(sdk+ts)', md5(SDK_KEY + ts)],
    ['md5(ts+sdk)', md5(ts + SDK_KEY)],
    ['md5(sdk+dev+ts)', md5(SDK_KEY + DEV_ID + ts)],
    ['md5(sdk+ts+dev)', md5(SDK_KEY + ts + DEV_ID)],
    ['md5(sdk+ts+vod)', md5(SDK_KEY + ts + VOD)],
    ['hmac(sdk,devVod+ts)', crypto.createHmac('md5', SDK_KEY).update(devVod + ts).digest('hex')],
    ['hmac(sdk,vod+ts)', crypto.createHmac('md5', SDK_KEY).update(VOD + ts).digest('hex')],
    ['md5(sdk+devVod+ts).up', md5(SDK_KEY + devVod + ts).toUpperCase()],
    ['md5(ck+devVod+ts)', md5('92b991dfcf878f362f6044f3d6e013255c0726617e4d17858890ecdab1d291c7' + devVod + ts)],
    ['md5(secret+sdk+vod+ts)', md5(SECRET + SDK_KEY + VOD + ts)],
    ['md5(sdk+secret+vod+ts)', md5(SDK_KEY + SECRET + VOD + ts)],
    ['sha256(sdk+devVod+ts)', crypto.createHash('sha256').update(SDK_KEY + devVod + ts).digest('hex')],
    ['md5(md5(sdk)+devVod+ts)', md5(md5(SDK_KEY) + devVod + ts)],
    ['md5(sdk+md5(devVod+ts))', md5(SDK_KEY + md5(devVod + ts))],
    ['md5(md5(sdk+devVod)+ts)', md5(md5(SDK_KEY + devVod) + ts)],
    // Try with package name
    ['md5(pkg+sdk+vod+ts)', md5('com.dramarush.shortin' + SDK_KEY + VOD + ts)],
    ['md5(sdk+pkg+vod+ts)', md5(SDK_KEY + 'com.dramarush.shortin' + VOD + ts)],
    // Try "63" param from load()
    ['md5(sdk+63+vod+ts)', md5(SDK_KEY + '63' + VOD + ts)],
    ['md5(63+sdk+vod+ts)', md5('63' + SDK_KEY + VOD + ts)],
  ];
}

console.log(`\nTesting sign algorithms with delays...\n`);

for (let i = 0; i < 26; i++) {
  const ts = Date.now().toString();
  const signs = makeSigns(ts);
  const [name, sign] = signs[i];
  
  try {
    const raw = await post('/api/vod/info_new', { vod_id: VOD, cur_time: ts, sign });
    const d = JSON.parse(aes(raw));
    const ok = d.code === 10000 ? '🎉' : '❌';
    console.log(`${ok} ${name} → ${d.code} ${(d.message||'').substring(0,30)}`);
    if (d.code === 10000) {
      console.log('\n🎉🎉🎉 SIGN CRACKED!');
      console.log('Algorithm:', name);
      const r = d.result;
      if (r?.vod_collection?.[0]?.vod_url) console.log('CDN URL:', r.vod_collection[0].vod_url);
      process.exit(0);
    }
  } catch (e) {
    console.log(`⚠️  ${name} → ${e.message}`);
  }
  
  await sleep(500); // Rate limit
}

console.log('\n❌ None worked. The sign uses a more complex algorithm inside the VM-protected native code.');
