/**
 * Media Proxy — streams content from the P2P server to the browser.
 *
 * For m3u8 manifests: buffers the small text to rewrite segment URLs.
 * For binary content (TS segments / MP4): STREAMS directly without buffering.
 *
 * Usage:
 *   GET /api/filmin/hls?url=http://127.0.0.1:7000/resource.mp4?src=...
 */
import { NextRequest, NextResponse } from "next/server";

const P2P_HOST = process.env.FILMIN_P2P_HOST || "127.0.0.1";
const P2P_PORT = parseInt(process.env.FILMIN_P2P_PORT || "7000", 10);

export const dynamic = "force-dynamic";

export async function GET(req: NextRequest) {
  const targetUrl = req.nextUrl.searchParams.get("url");

  if (!targetUrl) {
    return NextResponse.json({ error: "Missing ?url= param" }, { status: 400 });
  }

  try {
    let fetchUrl = targetUrl;

    // If it's a relative path, make it absolute against P2P server
    if (!fetchUrl.startsWith("http")) {
      fetchUrl = `http://${P2P_HOST}:${P2P_PORT}/${fetchUrl}`;
    }

    // Forward browser's Range header to upstream
    const range = req.headers.get("range");
    const fetchHeaders: Record<string, string> = { "User-Agent": "StreamVault/1.0" };
    if (range) fetchHeaders["Range"] = range;

    const resp = await fetch(fetchUrl, {
      signal: AbortSignal.timeout(120000),
      headers: fetchHeaders,
    });

    if (!resp.ok && resp.status !== 206) {
      return new NextResponse(`Upstream error: ${resp.status}`, { status: resp.status || 502 });
    }

    const contentType = resp.headers.get("content-type") || "application/octet-stream";
    const isManifest = contentType.includes("mpegurl") || targetUrl.includes(".m3u8");

    // ── M3U8 Manifest: buffer small text and rewrite segment URLs ─────
    if (isManifest) {
      const text = await resp.text();

      // Rewrite segment URLs so they also go through our proxy
      // Handles both relative paths (from P2P) and absolute URLs (from CDN)
      const baseDir = fetchUrl.substring(0, fetchUrl.lastIndexOf("/") + 1);

      const manifest = text.replace(
        /^(?!#)(.+\.ts.*)$/gm,
        (match) => {
          const segUrl = match.startsWith("http") ? match : baseDir + match;
          return `/api/filmin/hls?url=${encodeURIComponent(segUrl)}`;
        }
      );

      return new NextResponse(manifest, {
        headers: {
          "Content-Type": "application/vnd.apple.mpegurl",
          "Cache-Control": "no-cache",
          "Access-Control-Allow-Origin": "*",
        },
      });
    }

    // ── Binary content (TS segments, MP4): STREAM with chunked transfer ───
    const headers: Record<string, string> = {
      "Content-Type": contentType,
      "Access-Control-Allow-Origin": "*",
      "Access-Control-Allow-Headers": "Range",
      "Accept-Ranges": "bytes",
      "Cache-Control": targetUrl.includes(".ts") ? "public, max-age=3600" : "no-cache",
    };

    // For Range requests (seeking), forward Content-Range and Content-Length
    const cr = resp.headers.get("content-range");
    if (cr) headers["Content-Range"] = cr;

    const cl = resp.headers.get("content-length");
    if (cl) headers["Content-Length"] = cl;

    // Use a standard Response to avoid Next.js 15 pipe issues
    return new Response(resp.body, {
      status: resp.status === 206 ? 206 : 200,
      headers,
    });

  } catch (err) {
    const message = err instanceof Error ? err.message : "Proxy error";
    return NextResponse.json({ error: message }, { status: 502 });
  }
}
