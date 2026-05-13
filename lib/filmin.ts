/**
 * Filmin API Client (Triple-mode: Mobile + Web + P2P Streaming)
 *
 * Reverse-engineered from decompiled APK (com.dramarush.shortin)
 * and Freecine web player JS bundle at enbbu.k5ca.com
 *
 * THREE API systems:
 *  Mobile: 3DES secret + MD5 sign → used for search/channels/metadata
 *  Web:    MD5("ppcineweb123" + device + ts) → used for vod/info_web_get
 *  P2P:    Native ARM64 library (libpp_hls.so) via Android emulator → generates
 *          body sign for vod/info_new which returns real CDN URLs.
 *          CDN URLs are proxied through P2P server at localhost:P2P_PORT.
 *
 * Streaming Architecture:
 *  1. P2P server (Android emulator) generates sign for API auth
 *  2. vod/info_new returns CDN URLs (HLS m3u8)
 *  3. CDN URLs are proxied through P2P server for playback
 */

import * as crypto from "crypto";

// ===================== CONSTANTS =====================

const SECRET_B64 = "MxASAkl/yHTGg+/Tw1R7u96nGqkWsOZ2";
const DES3_KEY = "dsawdf634eebGFHITR5UT9kS0";
const DES3_IV = "32456738";
const AES_KEY = "0123456789123456";
const AES_IV = "2015030120123456";
const BASE_URL = "https://filmin.ajfysu.com";
const WEB_DEVICE_ID_SEED = "1111111";
const WEB_SIGN_PREFIX = "ppcineweb123";

// P2P Streaming constants
// The P2P server runs on the Android emulator via libpp_hls.so
const P2P_PORT = parseInt(process.env.FILMIN_P2P_PORT || "7000", 10);
const P2P_HOST = process.env.FILMIN_P2P_HOST || "127.0.0.1";
// Android emulator's device ID (from `adb shell settings get secure android_id`)
const ANDROID_DEVICE_ID = process.env.FILMIN_ANDROID_ID || "d3ceafd644f584c";

// ===================== CRYPTO =====================

function desedeDecrypt(base64Encrypted: string): string {
  const key = Buffer.from(DES3_KEY, "utf-8").subarray(0, 24);
  const iv = Buffer.from(DES3_IV, "utf-8");
  const encrypted = Buffer.from(base64Encrypted, "base64");
  const decipher = crypto.createDecipheriv("des-ede3-cbc", key, iv);
  decipher.setAutoPadding(true);
  let decrypted = decipher.update(encrypted, undefined, "utf-8");
  decrypted += decipher.final("utf-8");
  return decrypted;
}

function aesDecrypt(base64Encrypted: string): string {
  const key = Buffer.from(AES_KEY, "utf-8");
  const iv = Buffer.from(AES_IV, "utf-8");
  const encrypted = Buffer.from(base64Encrypted, "base64");
  const decipher = crypto.createDecipheriv("aes-128-cbc", key, iv);
  decipher.setAutoPadding(true);
  let decrypted = decipher.update(encrypted);
  decrypted = Buffer.concat([decrypted, decipher.final()]);
  return decrypted.toString("utf-8");
}

function md5(str: string): string {
  return crypto.createHash("md5").update(str).digest("hex");
}

function generateDeviceId(): string {
  const chars: string[] = [];
  for (let i = 0; i < 22; i++) {
    if (Math.random() < 0.5) {
      chars.push(String.fromCharCode(Math.floor(Math.random() * 10) + 48));
    } else {
      chars.push(String.fromCharCode(Math.floor(Math.random() * 6) + 97));
    }
  }
  return chars.join("");
}

// ===================== TYPES =====================

export interface FilminVod {
  id: number;
  vod_name: string;
  vod_pic: string;
  vod_year: string;
  vod_tag: string;
  vod_lang: string;
  vod_total: number;
  vod_serial: number;
  vod_isend: number;
  vod_director: string;
  vod_actor?: string;
  vod_writer: string;
  vod_blurb?: string;
  vod_douban_score: number;
  click_count: number;
  is_best: number;
  icon_type: number;
  vod_behind: string;
  vod_weekday: string;
  vod_nc_show_id: number;   // Internal Filmin show ID (NOT TMDB)
  vod_en?: string;
  production_country?: string;
  type_pid?: number;         // 1 = movie, 2 = TV/series
  vod_area?: string;
  audio_language_tag?: string;
  pianwei: number;
  piantou: number;
}

export interface FilminEpisode {
  id: number;
  title: string;
  source_id: number;
  vod_id: number;
  collection: number;
  vod_url: string;           // Placeholder for web clients
  down_url: string;          // Placeholder for web clients
  type: number;
  duration: string;          // "00:52:38" format
  is_p2p: number;
  is_ad: number;
  vod_duration: number;      // Duration in seconds
}

export interface FilminSeriesInfo {
  vod_id: number;
  series: string;            // "Season 1", "Season 2"
  default: boolean;
}

export interface FilminAudioOption {
  type: number;
  type_name: string;         // "Original", "Dub"
}

export interface FilminVodDetail extends FilminVod {
  vod_collection: FilminEpisode[];
  series_info: FilminSeriesInfo[];
  audio_type: number;
  audio_type_option: FilminAudioOption[];
  vod_duration_free: number;
}

export interface FilminChannel {
  id: number;
  channel_name: string;
  vod_type_id: number;
}

export interface FilminChannelModule {
  module_id: number;
  module_name: string;
  type: number;
  is_title: number;
  block_list: {
    id: number;
    data_id: number;
    jump_type: number;
    jump_url: string;
    banner_pic: string;
    topic_id: number;
    content: string;
    vod_info: FilminVod | null;
  }[];
}

export interface FilminHotSearch {
  name: string;
  vod_id: number;
  hot_type: number;
  vod_total: number;
  vod_serial: number;
  vod_year: string;
  vod_name: string;
  vod_pic: string;
  vod_isend: number;
  vod_director: string;
  click_count: number;
}

export interface FilminCategory {
  id: number;
  sort: number;
  name: string;
  msg: { name: string; data: string[] }[];
}

// ===================== CLIENT =====================

export class FilminClient {
  private decryptedSecret: string;
  private mobileDeviceId: string;
  private webDeviceId: string;
  private androidDeviceId: string;
  private token: string = "";
  private p2pAvailable: boolean = false;

  constructor() {
    this.decryptedSecret = desedeDecrypt(SECRET_B64);
    this.androidDeviceId = ANDROID_DEVICE_ID;
    // Use the android device ID for mobile API calls (must match P2P sign)
    this.mobileDeviceId = this.androidDeviceId;
    this.webDeviceId = md5(WEB_DEVICE_ID_SEED);
  }

  // ─── Mobile API headers (for search/channels/metadata) ──────────

  private makeMobileHeaders(): Record<string, string> {
    const curTime = Date.now().toString();
    const sign = md5(this.decryptedSecret + this.mobileDeviceId + curTime).toUpperCase();
    return {
      "User-Agent": "okhttp/4.11.0",
      "app_id": "filmin",
      "package_name": "com.dramarush.shortin",
      "version": "40000",
      "sys_platform": "2",
      "mob_mfr": "google",
      "mobmodel": "Pixel 7",
      "sysrelease": "14",
      "device_id": this.mobileDeviceId,
      "gaid": "",
      "channel_code": "google",
      "androidid": this.mobileDeviceId,
      "cur_time": curTime,
      "token": this.token,
      "sign": sign,
      "is_vvv": "0",
      "is_language": "en",
      "is_display": "1",
      "app_language": "en",
      "en_al": "0",
      "Content-Type": "application/x-www-form-urlencoded",
    };
  }

  // ─── Web API headers (for vod/info_web_get) ─────────────────────

  private makeWebHeaders(): Record<string, string> {
    const curTime = Date.now().toString();
    const sign = md5(WEB_SIGN_PREFIX + this.webDeviceId + curTime).toUpperCase();
    return {
      "User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7)",
      "app_id": "ppcineweb",
      "channel_code": "ppcinewebb_1000",
      "device_id": this.webDeviceId,
      "cur_time": curTime,
      "sign": sign,
      "token": "",
      "version": "30006",
      "sys_platform": "3",
      "mobmodel": "",
      "sysrelease": "",
      "mob_mfr": "",
      "app_language": "en",
      "domain": "enbbu.k5ca.com",
      "en_al": "0",
    };
  }

  // ─── Low-level API calls ────────────────────────────────────────

  private async mobileApiCall<T = unknown>(
    endpoint: string,
    params: Record<string, string> = {}
  ): Promise<{ code: number; message: string; result: T }> {
    const resp = await fetch(BASE_URL + endpoint, {
      method: "POST",
      headers: this.makeMobileHeaders(),
      body: new URLSearchParams(params).toString(),
    });

    const raw = await resp.text();
    if (!raw || raw === "error1" || !raw.match(/^[A-Za-z0-9+/=\s]+$/)) {
      throw new Error(`API error: ${raw || "empty response"}`);
    }

    const decrypted = aesDecrypt(raw.trim());
    return JSON.parse(decrypted);
  }

  private async webApiGet<T = unknown>(
    endpoint: string
  ): Promise<{ code: number; message: string; result: T }> {
    const resp = await fetch(BASE_URL + endpoint, {
      method: "GET",
      headers: this.makeWebHeaders(),
    });

    const raw = await resp.text();
    if (!raw || raw === "error1" || !raw.match(/^[A-Za-z0-9+/=\s]+$/)) {
      throw new Error(`Web API error: ${raw || "empty response"}`);
    }

    const decrypted = aesDecrypt(raw.trim());
    return JSON.parse(decrypted);
  }

  // ─── Session management ─────────────────────────────────────────

  /** Initialize session and obtain auth token */
  async init(): Promise<void> {
    const result = await this.mobileApiCall<{
      user_info: { token: string; user_id: number };
    }>("/api/public/init", { invited_by: "" });
    this.token = result.result.user_info.token;
  }

  /** Ensure we have a valid token */
  private async ensureInit(): Promise<void> {
    if (!this.token) {
      await this.init();
    }
  }

  // ─── Content Discovery (Mobile API) ─────────────────────────────

  /** Get trending/hot search titles */
  async getHotSearch(): Promise<FilminHotSearch[]> {
    await this.ensureInit();
    const result = await this.mobileApiCall<FilminHotSearch[]>("/api/search/hot_search");
    return result.result;
  }

  /** Get recommended videos */
  async getRecommended(page = 1): Promise<FilminVod[]> {
    await this.ensureInit();
    const result = await this.mobileApiCall<FilminVod[]>("/api/search/recommend", {
      page: page.toString(),
    });
    return result.result;
  }

  /** Search by keyword (param is 'kw', not 'keyword') */
  async search(kw: string, page = 1): Promise<FilminVod[]> {
    await this.ensureInit();
    const result = await this.mobileApiCall<FilminVod[]>("/api/search/result", {
      kw,
      page: page.toString(),
    });
    return result.result;
  }

  /** Browse by content type (type_id: 1=movies, 2=TV shows) */
  async browse(typeId: number, page = 1): Promise<FilminVod[]> {
    await this.ensureInit();
    const result = await this.mobileApiCall<FilminVod[]>("/api/search/screen", {
      type_id: typeId.toString(),
      page: page.toString(),
    });
    return result.result;
  }

  /** Get content categories (Movies, TV Shows, Anime) */
  async getCategories(): Promise<FilminCategory[]> {
    await this.ensureInit();
    const result = await this.mobileApiCall<FilminCategory[]>("/api/type/get_list");
    return result.result;
  }

  /** Get channel list */
  async getChannels(): Promise<FilminChannel[]> {
    await this.ensureInit();
    const result = await this.mobileApiCall<FilminChannel[]>("/api/channel/get_list", {
      type: "1",
    });
    return result.result;
  }

  /** Get channel content (browse page with modules/banners) */
  async getChannelContent(channelId: number, page = 1): Promise<FilminChannelModule[]> {
    await this.ensureInit();
    const result = await this.mobileApiCall<FilminChannelModule[]>("/api/channel/get_info", {
      channel_id: channelId.toString(),
      page: page.toString(),
    });
    return result.result;
  }

  // ─── VOD Detail (Web API — metadata only) ─────────────────────

  /**
   * Get full VOD detail including episodes, series info, and audio options.
   * Uses the web API endpoint which returns metadata (URLs are placeholders).
   */
  async getVodInfo(vodId: number, audioType = 0): Promise<FilminVodDetail> {
    const now = new Date();
    const dateStr =
      now.getFullYear() +
      String(now.getMonth() + 1).padStart(2, "0") +
      String(now.getDate()).padStart(2, "0");
    const dateHour =
      dateStr +
      String(now.getHours()).padStart(2, "0") +
      Math.floor(now.getMinutes() / 10);

    const result = await this.webApiGet<FilminVodDetail>(
      `/api/vod/info_web_get?vod_id=${vodId}&audio_type=${audioType}&date=${dateHour}`
    );

    if (result.code !== 10000) {
      throw new Error(`VOD info failed: code=${result.code} msg=${result.message}`);
    }

    return result.result;
  }

  // ─── P2P Streaming (Direct CDN Access) ─────────────────────────

  /**
   * Check if the P2P server (Android emulator) is available.
   */
  async checkP2P(): Promise<boolean> {
    try {
      const resp = await fetch(`http://${P2P_HOST}:${P2P_PORT}/control?msg=verify&device_id=test&ts=0`, {
        signal: AbortSignal.timeout(30000), // Increased for high system load
      });
      this.p2pAvailable = resp.ok;
      return this.p2pAvailable;
    } catch {
      this.p2pAvailable = false;
      return false;
    }
  }

  /**
   * Get P2P sign for a specific VOD from the native signing server.
   * The sign authenticates the vod/info_new API request.
   * @param vodId - The Filmin VOD ID
   * @param timestamp - Timestamp string (milliseconds)
   * @returns The sign string (32-char uppercase hex)
   */
  async getP2PSign(vodId: number, timestamp: string): Promise<string> {
    const verifyUrl = `http://${P2P_HOST}:${P2P_PORT}/control?msg=verify&device_id=${this.androidDeviceId}${vodId}&ts=${timestamp}`;
    const resp = await fetch(verifyUrl, { signal: AbortSignal.timeout(30000) }); // Increased for high system load
    if (!resp.ok) throw new Error(`P2P verify failed: ${resp.status}`);
    return (await resp.text()).trim();
  }

  /**
   * Get VOD stream info with REAL CDN URLs via P2P-signed API call.
   * Requires the Android emulator P2P server to be running.
   * @param vodId - The Filmin VOD ID
   * @param audioType - Audio type (0 = default)
   * @returns VOD detail with real CDN URLs in vod_collection[].vod_url
   */
  async getStreamInfo(vodId: number, audioType = 0): Promise<FilminVodDetail> {
    await this.ensureInit();

    const ts = Date.now().toString();
    const sign = await this.getP2PSign(vodId, ts);

    const result = await this.mobileApiCall<FilminVodDetail>(
      "/api/vod/info_new",
      {
        vod_id: vodId.toString(),
        cur_time: ts,
        sign,
        audio_type: audioType.toString(),
      }
    );

    if (result.code !== 10000) {
      throw new Error(`Stream info failed: code=${result.code} msg=${result.message}`);
    }

    return result.result;
  }

  /**
   * Discover all audio options using the web API (which reveals dub tracks
   * that the mobile P2P-signed API doesn't expose).
   */
  async getAudioOptions(vodId: number): Promise<FilminAudioOption[]> {
    const now = new Date();
    const dateParam = `${now.getFullYear()}${String(now.getMonth()+1).padStart(2,"0")}${String(now.getDate()).padStart(2,"0")}${String(now.getHours()).padStart(2,"0")}${Math.floor(now.getMinutes()/10)}`;
    
    // Try multiple audio_types via web API to find all options
    let bestOptions: FilminAudioOption[] = [];
    for (const at of [0, 1, 2, 3]) {
      try {
        const info = await this.webApiGet<FilminVodDetail>(
          `/api/vod/info_web_get?vod_id=${vodId}&audio_type=${at}&date=${dateParam}`
        );
        if (info.result?.audio_type_option && info.result.audio_type_option.length > bestOptions.length) {
          bestOptions = info.result.audio_type_option;
        }
        if (bestOptions.length >= 3) break; // Found enough options
      } catch { /* skip */ }
    }
    return bestOptions;
  }

  /**
   * Generate a playback URL for a given CDN URL.
   * Routes through the P2P proxy which handles CDN authentication.
   * @param cdnUrl - The raw CDN URL from vod_collection[].vod_url
   * @returns Proxied URL that can be played directly in a video player
   */
  static getStreamUrl(cdnUrl: string): string {
    if (!cdnUrl) return "";
    const b64 = Buffer.from(cdnUrl).toString("base64");
    return `http://${P2P_HOST}:${P2P_PORT}/resource.mp4?src=${b64}`;
  }

  // ─── TMDB Cross-Reference ──────────────────────────────────────

  /**
   * Determine if a VOD is a movie (type_pid=1) or TV show (type_pid=2).
   * Falls back to episode count heuristic.
   */
  static getMediaType(vod: FilminVod | FilminVodDetail): "movie" | "tv" {
    if (vod.type_pid === 1) return "movie";
    if (vod.type_pid === 2) return "tv";
    // Heuristic: single episode = movie
    return vod.vod_total <= 1 ? "movie" : "tv";
  }

  /**
   * Build a TMDB search query from Filmin VOD metadata.
   * Since vod_nc_show_id is an internal ID (NOT TMDB), we
   * cross-reference by title + year against TMDB's search API.
   */
  static getTmdbSearchQuery(vod: FilminVod | FilminVodDetail): { query: string; year?: string; type: "movie" | "tv" } {
    // Strip season suffix: "Invincible - Season 4" → "Invincible"
    const cleanTitle = vod.vod_name.replace(/\s*-\s*Season\s*\d+/i, "").trim();
    return {
      query: cleanTitle,
      year: vod.vod_year || undefined,
      type: FilminClient.getMediaType(vod),
    };
  }

  /**
   * Extract season number from vod_area field (e.g., "Season 4" → 4).
   * Returns 1 as default.
   */
  static getSeasonNumber(vod: FilminVod | FilminVodDetail): number {
    const match = vod.vod_area?.match(/Season\s*(\d+)/i);
    return match ? parseInt(match[1], 10) : 1;
  }

  // ─── Helpers ───────────────────────────────────────────────────

  /** Get image URL (handles CDN domain) */
  static imageUrl(path: string): string {
    if (path.startsWith("http")) return path;
    return `https://0000.k0j5n7.com${path}`;
  }

  // ─── MP4 Track Probe ─────────────────────────────────────────

  /** ISO 639-2/T language code → human-readable label */
  private static readonly LANG_MAP: Record<string, string> = {
    und:"Undetermined",eng:"English",hin:"Hindi",kor:"Korean",jpn:"Japanese",
    cmn:"Mandarin",zho:"Chinese",chi:"Chinese",spa:"Spanish",fra:"French",
    fre:"French",por:"Portuguese",rus:"Russian",tam:"Tamil",tel:"Telugu",
    ben:"Bengali",urd:"Urdu",tha:"Thai",vie:"Vietnamese",ind:"Indonesian",
    ara:"Arabic",tur:"Turkish",ita:"Italian",deu:"German",ger:"German",
    pol:"Polish",nld:"Dutch",swe:"Swedish",dan:"Danish",nor:"Norwegian",
    fin:"Finnish",pan:"Punjabi",guj:"Gujarati",mar:"Marathi",kan:"Kannada",
    ori:"Odia",mal:"Malayalam",msa:"Malay",fil:"Filipino",tgl:"Tagalog",
    ron:"Romanian",hun:"Hungarian",ces:"Czech",cze:"Czech",ukr:"Ukrainian",
    ell:"Greek",gre:"Greek",heb:"Hebrew",per:"Persian",fas:"Persian",
    mya:"Burmese",khm:"Khmer",lao:"Lao",kat:"Georgian",
  };

  /**
   * Probe an MP4 file via its proxy URL to discover embedded audio/subtitle tracks.
   * Uses HTTP Range requests to only fetch the moov atom (typically 1-10MB).
   * 
   * Strategy:
   *  1. Fetch first 1KB to find moov atom position + size
   *  2. Fetch the full moov atom
   *  3. Parse all trak boxes to extract handler type + language
   */
  static async probeMP4Tracks(proxyUrl: string): Promise<{
    audio: { index: number; lang: string; label: string; codec: string }[];
    subtitles: { index: number; lang: string; label: string }[];
  }> {
    const result = { audio: [] as any[], subtitles: [] as any[] };

    try {
      // Phase 1: Small fetch to find moov position and size
      const r1 = await fetch(proxyUrl, {
        headers: { Range: "bytes=0-4095" },
        signal: AbortSignal.timeout(10000),
      });
      if (!r1.ok && r1.status !== 206) throw new Error(`HTTP ${r1.status}`);
      const buf1 = Buffer.from(await r1.arrayBuffer());
      if (buf1.length < 16) return result;

      // Walk top-level boxes to find moov
      let moovOffset = -1;
      let moovSize = 0;
      let pos = 0;
      while (pos < buf1.length - 8) {
        const sz = buf1.readUInt32BE(pos);
        const tp = buf1.toString("ascii", pos + 4, pos + 8);
        if (sz < 8) break;
        if (tp === "moov") {
          moovOffset = pos;
          moovSize = sz;
          break;
        }
        pos += sz;
      }

      if (moovOffset < 0 || moovSize < 100) {
        // moov not in first 4KB — try finding it at end of file
        const cr = r1.headers.get("content-range") || "";
        const totalMatch = cr.match(/\/(\d+)/);
        if (totalMatch) {
          const total = parseInt(totalMatch[1]);
          const tailSize = Math.min(10 * 1024 * 1024, total);
          const tailStart = total - tailSize;
          const r2 = await fetch(proxyUrl, {
            headers: { Range: `bytes=${tailStart}-${total - 1}` },
            signal: AbortSignal.timeout(15000),
          });
          const buf2 = Buffer.from(await r2.arrayBuffer());
          // Scan for moov signature
          for (let i = 0; i < buf2.length - 8; i++) {
            if (buf2[i+4] === 0x6D && buf2[i+5] === 0x6F && buf2[i+6] === 0x6F && buf2[i+7] === 0x76) {
              moovOffset = 0; // relative to buf2
              moovSize = buf2.readUInt32BE(i);
              // Parse from this buffer directly
              return FilminClient.parseMoovTracks(buf2.subarray(i));
            }
          }
        }
        return result;
      }

      // Phase 2: Fetch the full moov atom
      const fetchEnd = moovOffset + moovSize;
      const r3 = await fetch(proxyUrl, {
        headers: { Range: `bytes=0-${fetchEnd + 100}` },
        signal: AbortSignal.timeout(20000),
      });
      if (!r3.ok && r3.status !== 206) throw new Error(`HTTP ${r3.status}`);
      const fullBuf = Buffer.from(await r3.arrayBuffer());

      return FilminClient.parseMoovTracks(fullBuf.subarray(moovOffset));
    } catch (e) {
      console.error("[probeMP4Tracks] Error:", (e as Error).message);
      return result;
    }
  }

  /**
   * Parse a moov atom buffer to extract track metadata.
   */
  private static parseMoovTracks(moovBuf: Buffer): {
    audio: { index: number; lang: string; label: string; codec: string }[];
    subtitles: { index: number; lang: string; label: string }[];
  } {
    const tracks: { handler: string; lang: string; codec: string }[] = [];
    const len = moovBuf.length;

    function parse(start: number, end: number, inTrak: boolean, track: { handler: string; lang: string; codec: string } | null) {
      let pos = start;
      while (pos < end - 8 && pos < len - 8) {
        const sz = moovBuf.readUInt32BE(pos);
        if (sz < 8 || pos + sz > len) break;
        const tp = moovBuf.toString("ascii", pos + 4, pos + 8);

        if (tp === "moov" || tp === "mdia" || tp === "minf" || tp === "stbl" || tp === "edts" || tp === "udta") {
          parse(pos + 8, pos + sz, inTrak, track);
        } else if (tp === "trak") {
          const t = { handler: "", lang: "", codec: "" };
          parse(pos + 8, pos + sz, true, t);
          if (t.handler) tracks.push(t);
        } else if (tp === "hdlr" && inTrak && track) {
          if (pos + 20 < len) {
            track.handler = moovBuf.toString("ascii", pos + 16, pos + 20);
          }
        } else if (tp === "mdhd" && inTrak && track) {
          const ver = moovBuf[pos + 8];
          const langOffset = ver === 0 ? pos + 28 : pos + 40;
          if (langOffset + 2 <= len) {
            const lc = moovBuf.readUInt16BE(langOffset);
            const c1 = String.fromCharCode(((lc >> 10) & 0x1F) + 0x60);
            const c2 = String.fromCharCode(((lc >> 5) & 0x1F) + 0x60);
            const c3 = String.fromCharCode((lc & 0x1F) + 0x60);
            track.lang = c1 + c2 + c3;
          }
        } else if (tp === "stsd" && inTrak && track) {
          if (pos + 24 < len) {
            track.codec = moovBuf.toString("ascii", pos + 20, pos + 24);
          }
        }
        pos += sz;
      }
    }

    parse(0, len, false, null);

    let audioIdx = 0;
    let subIdx = 0;
    const audio = tracks
      .filter(t => t.handler === "soun")
      .map(t => ({
        index: audioIdx++,
        lang: t.lang,
        label: FilminClient.LANG_MAP[t.lang] || t.lang.toUpperCase(),
        codec: t.codec,
      }));

    const subtitles = tracks
      .filter(t => /sbtl|text|subt/.test(t.handler))
      .map(t => ({
        index: subIdx++,
        lang: t.lang,
        label: FilminClient.LANG_MAP[t.lang] || t.lang.toUpperCase(),
      }));

    return { audio, subtitles };
  }
}

// Singleton instance
let _client: FilminClient | null = null;

export function getFilminClient(): FilminClient {
  if (!_client) {
    _client = new FilminClient();
  }
  return _client;
}
