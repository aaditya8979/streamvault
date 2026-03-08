/**
 * vidsrc_cc  : vidsrc.cc — 4K, best library ✓
 * autoembed  : autoembed.co — 1080p, wide library ✓
 * embed_su   : embed.su — classic/old Bollywood ✓
 */

export type EmbedProvider = "vidsrc_cc" | "autoembed" | "embed_su";

export interface Provider {
  id: EmbedProvider;
  label: string;
  badge: string;
  badgeColor: string;
  note: string;
  hindiNote: string;
}

export function movieEmbed(tmdbId: number, provider: EmbedProvider = "vidsrc_cc", hindiMode = false): string {
  switch (provider) {
    case "vidsrc_cc":
      return hindiMode
        ? `https://vidsrc.cc/v2/embed/movie/${tmdbId}?lang=hi`
        : `https://vidsrc.cc/v2/embed/movie/${tmdbId}`;
    case "autoembed":
      return hindiMode
        ? `https://autoembed.co/movie/tmdb/${tmdbId}?lang=hi`
        : `https://autoembed.co/movie/tmdb/${tmdbId}`;
    case "embed_su":
      return `https://embed.su/embed/movie/${tmdbId}`;
  }
}

export function tvEmbed(tmdbId: number, season: number, episode: number, provider: EmbedProvider = "vidsrc_cc", hindiMode = false): string {
  switch (provider) {
    case "vidsrc_cc":
      return hindiMode
        ? `https://vidsrc.cc/v2/embed/tv/${tmdbId}/${season}/${episode}?lang=hi`
        : `https://vidsrc.cc/v2/embed/tv/${tmdbId}/${season}/${episode}`;
    case "autoembed":
      return hindiMode
        ? `https://autoembed.co/tv/tmdb/${tmdbId}-${season}-${episode}?lang=hi`
        : `https://autoembed.co/tv/tmdb/${tmdbId}-${season}-${episode}`;
    case "embed_su":
      return `https://embed.su/embed/tv/${tmdbId}/${season}/${episode}`;
  }
}

export const PROVIDERS: Provider[] = [
  {
    id: "vidsrc_cc",
    label: "VidSrc CC",
    badge: "4K",
    badgeColor: "bg-purple-600",
    note: "Best quality ✓",
    hindiNote: "Hindi audio ✓",
  },
  {
    id: "autoembed",
    label: "AutoEmbed",
    badge: "1080p",
    badgeColor: "bg-blue-600",
    note: "Wide library ✓",
    hindiNote: "Hindi audio ✓",
  },
  {
    id: "embed_su",
    label: "EmbedSu",
    badge: "HD",
    badgeColor: "bg-green-600",
    note: "Classic & old films ✓",
    hindiNote: "Old Bollywood ✓",
  },
];