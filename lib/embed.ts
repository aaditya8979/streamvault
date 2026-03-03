/**
 * Embed URL builders — no API keys, no HLS.js, no Consumet.
 * Just reliable iframes. Multiple providers for fallback.
 */

// 1. Strictly define our 4 working providers
export type EmbedProvider = "vidsrcme" | "autoembed" | "smashy" | "vidsrcpm";

// 2. Movie URLs
export function movieEmbed(tmdbId: number, provider: EmbedProvider = "vidsrcme"): string {
  switch (provider) {
    case "vidsrcme":  return `https://vidsrc.me/embed/movie?tmdb=${tmdbId}`;
    case "autoembed": return `https://player.autoembed.cc/embed/movie/${tmdbId}`;
    case "smashy":    return `https://player.smashy.stream/movie/${tmdbId}`;
    case "vidsrcpm":  return `https://vidsrc.pm/embed/movie?tmdb=${tmdbId}`;
    default:          return `https://vidsrc.me/embed/movie?tmdb=${tmdbId}`;
  }
}

// 3. TV Show URLs (Fixed endpoints to specifically request TV data)
export function tvEmbed(tmdbId: number, season: number, episode: number, provider: EmbedProvider = "vidsrcme"): string {
  switch (provider) {
    case "vidsrcme":  return `https://vidsrc.me/embed/tv?tmdb=${tmdbId}&season=${season}&episode=${episode}`;
    case "autoembed": return `https://player.autoembed.cc/embed/tv/${tmdbId}/${season}/${episode}`;
    case "smashy":    return `https://player.smashy.stream/tv/${tmdbId}?s=${season}&e=${episode}`;
    case "vidsrcpm":  return `https://vidsrc.pm/embed/tv?tmdb=${tmdbId}&season=${season}&episode=${episode}`;
    default:          return `https://vidsrc.me/embed/tv?tmdb=${tmdbId}&season=${season}&episode=${episode}`;
  }
}

// 4. UI Labels for your Server Switcher
export const PROVIDERS: { id: EmbedProvider; label: string }[] = [
  { id: "vidsrcme",   label: "Server 1 (VidSrc Me)" },
  { id: "autoembed",  label: "Server 2 (AutoEmbed)" },
  { id: "smashy",     label: "Server 3 (SmashyStream)" },
  { id: "vidsrcpm",   label: "Server 4 (VidSrc PM)" },
];