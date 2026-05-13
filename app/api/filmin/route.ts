/**
 * Filmin API proxy — exposes Filmin search/browse/streaming with TMDB cross-referencing.
 * 
 * Endpoints:
 *   GET /api/filmin?action=search&q=invincible
 *   GET /api/filmin?action=hot
 *   GET /api/filmin?action=browse&type=1|2   (1=movies, 2=TV)
 *   GET /api/filmin?action=vod&id=555064
 *   GET /api/filmin?action=channels
 *   GET /api/filmin?action=stream&id=555064     — CDN URLs via P2P sign
 *   GET /api/filmin?action=play&id=555064&ep=1  — Direct playback URL
 *   GET /api/filmin?action=status                — P2P server status
 */
import { NextRequest, NextResponse } from "next/server";
import { getFilminClient, FilminClient } from "../../../lib/filmin";

function vodToJson(v: { id: number; vod_name: string; vod_pic: string; vod_year: string; vod_area: string; vod_remarks: string; type_id: number; type_name: string }) {
  const mediaType = FilminClient.getMediaType(v);
  const tmdbQuery = FilminClient.getTmdbSearchQuery(v);
  return {
    filmin_id: v.id,
    media_type: mediaType,
    tmdb_search: tmdbQuery,
    title: v.vod_name,
    year: v.vod_year,
    score: v.vod_douban_score,
    poster: FilminClient.imageUrl(v.vod_pic),
    tags: v.vod_tag,
    lang: v.vod_lang,
    episodes_total: v.vod_total,
    episodes_aired: v.vod_serial,
  };
}

export async function GET(req: NextRequest) {
  const action = req.nextUrl.searchParams.get("action");

  try {
    const client = getFilminClient();

    switch (action) {
      case "search": {
        const q = req.nextUrl.searchParams.get("q");
        if (!q) return NextResponse.json({ error: "Missing ?q= param" }, { status: 400 });
        const results = await client.search(q);
        return NextResponse.json({ results: results.map(vodToJson) });
      }

      case "hot": {
        const hot = await client.getHotSearch();
        return NextResponse.json({
          results: hot.map((h) => ({
            filmin_id: h.vod_id,
            title: h.vod_name,
            year: h.vod_year,
            poster: FilminClient.imageUrl(h.vod_pic),
            click_count: h.click_count,
          })),
        });
      }

      case "browse": {
        const typeId = parseInt(req.nextUrl.searchParams.get("type") || "2", 10);
        const page = parseInt(req.nextUrl.searchParams.get("page") || "1", 10);
        const results = await client.browse(typeId, page);
        return NextResponse.json({ results: results.map(vodToJson) });
      }

      case "vod": {
        const id = req.nextUrl.searchParams.get("id");
        if (!id) return NextResponse.json({ error: "Missing ?id= param" }, { status: 400 });
        const audioType = parseInt(req.nextUrl.searchParams.get("audio") || "0", 10);
        const detail = await client.getVodInfo(parseInt(id, 10), audioType);
        const tmdbQuery = FilminClient.getTmdbSearchQuery(detail);
        return NextResponse.json({
          filmin_id: detail.id,
          media_type: FilminClient.getMediaType(detail),
          tmdb_search: tmdbQuery,
          title: detail.vod_name,
          year: detail.vod_year,
          score: detail.vod_douban_score,
          poster: FilminClient.imageUrl(detail.vod_pic),
          tags: detail.vod_tag,
          actors: detail.vod_actor,
          director: detail.vod_director,
          blurb: detail.vod_blurb,
          audio_options: detail.audio_type_option,
          series: detail.series_info,
          episodes: detail.vod_collection.map((ep) => ({
            id: ep.id,
            number: ep.collection,
            title: ep.title,
            duration: ep.duration,
            duration_seconds: ep.vod_duration,
          })),
        });
      }

      case "stream": {
        // Get REAL CDN URLs via P2P-signed API call
        const id = req.nextUrl.searchParams.get("id");
        if (!id) return NextResponse.json({ error: "Missing ?id= param" }, { status: 400 });
        const audioType = parseInt(req.nextUrl.searchParams.get("audio") || "0", 10);

        const detail = await client.getStreamInfo(parseInt(id, 10), audioType);
        return NextResponse.json({
          filmin_id: detail.id,
          title: detail.vod_name,
          episodes: detail.vod_collection.map((ep) => ({
            id: ep.id,
            number: ep.collection,
            title: ep.title,
            duration: ep.duration,
            duration_seconds: ep.vod_duration,
            cdn_url: ep.vod_url,
            stream_url: FilminClient.getStreamUrl(ep.vod_url),
            is_p2p: ep.is_p2p,
          })),
          audio_options: detail.audio_type_option,
          series: detail.series_info,
        });
      }

      case "play": {
        // Get a single episode's playback URL (redirect or JSON)
        // This endpoint now supports BOTH Filmin IDs and TMDB IDs
        const id = req.nextUrl.searchParams.get("id");
        const type = req.nextUrl.searchParams.get("type") || "movie";
        const epNum = parseInt(req.nextUrl.searchParams.get("ep") || "1", 10);
        const audioType = parseInt(req.nextUrl.searchParams.get("audio") || "0", 10);
        
        if (!id) return NextResponse.json({ error: "Missing ?id= param" }, { status: 400 });

        let filminId: number;

        // Only resolve via TMDB when explicitly requested with tmdb=1
        const isTmdb = req.nextUrl.searchParams.get("tmdb") === "1";

        if (isTmdb) {
          // Resolve TMDB ID to Filmin ID
          const tmdbKey = process.env.NEXT_PUBLIC_TMDB_KEY;
          const tmdbResp = await fetch(`https://api.themoviedb.org/3/${type}/${id}?api_key=${tmdbKey}`);
          if (!tmdbResp.ok) throw new Error("TMDB lookup failed");
          const tmdbData = await tmdbResp.json();
          const title = tmdbData.title || tmdbData.name;

          // Search Filmin and prefer m3u8 results over MP4
          const searchResults = await client.search(title);
          const typeMatches = searchResults.filter(r => {
            const rType = FilminClient.getMediaType(r);
            return rType === type && (r.vod_name.includes(title) || title.includes(r.vod_name));
          });

          // Try each match — pick the first one with m3u8 CDN URLs
          let match = typeMatches[0] || searchResults[0];
          for (const candidate of typeMatches) {
            try {
              const info = await client.getStreamInfo(candidate.id, audioType);
              const ep1 = info.vod_collection[0];
              if (ep1 && ep1.vod_url.includes(".m3u8")) {
                match = candidate;
                break; // Found an HLS source — use it
              }
            } catch { /* skip failed lookups */ }
          }

          if (!match) return NextResponse.json({ error: "Content not found on Filmin" }, { status: 404 });
          filminId = match.id;
        } else {
          filminId = parseInt(id, 10);
        }

        // Discover all audio options via web API (reveals dub tracks the P2P API hides)
        const allAudioOptions = await client.getAudioOptions(filminId);
        
        // Fetch stream info for the requested audio type
        const detail = await client.getStreamInfo(filminId, audioType || 1);
        const episode = detail.vod_collection.find((e) => e.collection === epNum) || detail.vod_collection[0];
        
        if (!episode) {
          return NextResponse.json({ error: `Episode ${epNum} not found` }, { status: 404 });
        }

        const streamUrl = FilminClient.getStreamUrl(episode.vod_url);
        const isHLS = episode.vod_url.includes(".m3u8");

        // Probe embedded tracks from the MP4 container — NON-BLOCKING for fast startup
        let embeddedTracks: { audio: { index: number; lang: string; label: string; codec: string }[]; subtitles: { index: number; lang: string; label: string }[] } = { audio: [], subtitles: [] };
        const probeKey = `probe_${episode.vod_url}`;
        const g = globalThis as unknown as { __trackCache?: Record<string, { audio: { index: number; lang: string; label: string; codec: string }[]; subtitles: { index: number; lang: string; label: string }[] }> };
        const cached = g.__trackCache?.[probeKey];
        if (cached) {
          embeddedTracks = cached;
        } else if (!isHLS && streamUrl) {
          // Fire probe in background — don't block the response
          FilminClient.probeMP4Tracks(streamUrl).then(tracks => {
            if (!g.__trackCache) g.__trackCache = {};
            g.__trackCache[probeKey] = tracks;
            console.log(`[filmin/play] Background probe found ${tracks.audio.length} audio, ${tracks.subtitles.length} subs`);
          }).catch(e => {
            console.error("[filmin/play] Background probe failed:", (e as Error).message);
          });
        }

        // If format=json, return JSON; otherwise redirect to stream
        const format = req.nextUrl.searchParams.get("format");
        if (format === "json") {
          return NextResponse.json({
            title: detail.vod_name,
            filmin_id: filminId,
            episode: epNum,
            duration: episode.duration,
            cdn_url: episode.vod_url,
            stream_url: `/api/filmin/hls?url=${encodeURIComponent(streamUrl)}`,
            audio_options: allAudioOptions,
            audio_language_tag: detail.audio_language_tag || "",
            embedded_tracks: embeddedTracks,
          });
        }

        // Redirect to stream URL
        return NextResponse.redirect(streamUrl);
      }

      case "status": {
        // Check P2P server availability
        const p2pOk = await client.checkP2P();
        return NextResponse.json({
          p2p_available: p2pOk,
          p2p_host: process.env.FILMIN_P2P_HOST || "127.0.0.1",
          p2p_port: parseInt(process.env.FILMIN_P2P_PORT || "7000", 10),
          message: p2pOk
            ? "P2P server online — streaming available"
            : "P2P server offline — start the Android emulator",
        });
      }

      case "channels": {
        const channels = await client.getChannels();
        return NextResponse.json({ channels });
      }

      default:
        return NextResponse.json(
          { error: "Use ?action=search|hot|browse|vod|stream|play|channels|status" },
          { status: 400 }
        );
    }
  } catch (err) {
    const message = err instanceof Error ? err.message : "Unknown error";
    return NextResponse.json({ error: message }, { status: 500 });
  }
}
