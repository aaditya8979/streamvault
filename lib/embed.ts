/**
 * vidlink    : vidlink.pro — Current community favorite, fast, clean UI ✓
 * embed_su   : embed.su — Fastest for brand new releases ✓
 * vidsrc_pro : vidsrc.pro — Cleaner, stable version of VidSrc ✓
 */

export type EmbedProvider = "filmin" | "vidsrc_cc";

export interface Provider {
  id: EmbedProvider;
  label: string;
  badge: string;
  badgeColor: string;
  note: string;
  hindiNote: string;
}

export function movieEmbed(tmdbId: number, provider: EmbedProvider = "filmin", hindiMode = false): string {
  switch (provider) {
    case "filmin":
      return `/api/filmin?action=play&id=${tmdbId}&type=movie&tmdb=1`;
    case "vidsrc_cc":
      return hindiMode
        ? `https://vidsrc.pro/embed/movie/${tmdbId}?lang=hi`
        : `https://vidsrc.pro/embed/movie/${tmdbId}`;
  }
}

export function tvEmbed(tmdbId: number, season: number, episode: number, provider: EmbedProvider = "filmin", hindiMode = false): string {
  switch (provider) {
    case "filmin":
      return `/api/filmin?action=play&id=${tmdbId}&type=tv&s=${season}&e=${episode}&tmdb=1`;
    case "vidsrc_cc":
      return hindiMode
        ? `https://vidsrc.pro/embed/tv/${tmdbId}/${season}/${episode}?lang=hi`
        : `https://vidsrc.pro/embed/tv/${tmdbId}/${season}/${episode}`;
  }
}

export const PROVIDERS: Provider[] = [
  {
    id: "filmin",
    label: "Filmin P2P",
    badge: "PREMIUM",
    badgeColor: "bg-red-600",
    note: "High Quality · Multi-Audio ✓",
    hindiNote: "Hindi/Tamil/Telugu available ✓",
  },
  {
    id: "vidsrc_cc",
    label: "VidSrc CC",
    badge: "SPEED",
    badgeColor: "bg-purple-600",
    note: "Fast Global CDN ✓",
    hindiNote: "Hindi audio support ✓",
  },
];