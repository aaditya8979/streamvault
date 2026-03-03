/**
 * TMDB Client — runs entirely in the browser.
 * No server. No timeouts. No AbortController conflicts.
 * Just plain fetch from the client with the public API key.
 */

const KEY = () => {
  const k = process.env.NEXT_PUBLIC_TMDB_KEY;
  if (!k) throw new Error("Add NEXT_PUBLIC_TMDB_KEY to .env.local");
  return k;
};

const BASE = "https://api.themoviedb.org/3";
export const IMG = (path: string | null, w = "w500") =>
  path ? `https://image.tmdb.org/t/p/${w}${path}` : "/no-image.svg";

async function get<T>(path: string, params: Record<string, string | number> = {}): Promise<T> {
  const url = new URL(`${BASE}${path}`);
  url.searchParams.set("api_key", KEY());
  url.searchParams.set("include_adult", "false");
  for (const [k, v] of Object.entries(params)) url.searchParams.set(k, String(v));
  const res = await fetch(url.toString());
  if (!res.ok) throw new Error(`TMDB ${res.status}: ${path}`);
  return res.json();
}

// ─── Types ──────────────────────────────────────────────────────────────────

export interface Media {
  id: number;
  title?: string;
  name?: string;
  poster_path: string | null;
  backdrop_path: string | null;
  overview: string;
  vote_average: number;
  release_date?: string;
  first_air_date?: string;
  media_type?: "movie" | "tv";
  genre_ids?: number[];
}

export interface MovieDetail {
  id: number;
  imdb_id: string | null;
  title: string;
  tagline: string;
  overview: string;
  poster_path: string | null;
  backdrop_path: string | null;
  release_date: string;
  vote_average: number;
  vote_count: number;
  runtime: number | null;
  genres: { id: number; name: string }[];
  status: string;
  credits: { cast: Cast[]; crew: Crew[] };
  videos: { results: Video[] };
  recommendations: { results: Media[] };
}

export interface TVDetail {
  id: number;
  name: string;
  tagline: string;
  overview: string;
  poster_path: string | null;
  backdrop_path: string | null;
  first_air_date: string;
  vote_average: number;
  vote_count: number;
  number_of_seasons: number;
  number_of_episodes: number;
  genres: { id: number; name: string }[];
  status: string;
  seasons: Season[];
  credits: { cast: Cast[]; crew: Crew[] };
  videos: { results: Video[] };
  recommendations: { results: Media[] };
}

export interface Season {
  id: number;
  name: string;
  season_number: number;
  episode_count: number;
  poster_path: string | null;
}

export interface Episode {
  id: number;
  name: string;
  overview: string;
  episode_number: number;
  season_number: number;
  still_path: string | null;
  runtime: number | null;
}

export interface SeasonDetail {
  season_number: number;
  episodes: Episode[];
}

export interface Cast { id: number; name: string; character: string; profile_path: string | null; }
export interface Crew { id: number; name: string; job: string; }
export interface Video { key: string; site: string; type: string; }
export interface Page<T> { results: T[]; total_pages: number; total_results: number; }

// ─── API functions (all client-side) ────────────────────────────────────────

export const tmdb = {
  trending: () => get<Page<Media>>("/trending/all/week"),
  trendingMovies: () => get<Page<Media>>("/trending/movie/week"),
  trendingTV: () => get<Page<Media>>("/trending/tv/week"),
  popular: (type: "movie" | "tv") => get<Page<Media>>(`/${type}/popular`),
  topRated: (type: "movie" | "tv") => get<Page<Media>>(`/${type}/top_rated`),
  nowPlaying: () => get<Page<Media>>("/movie/now_playing"),
  search: (q: string, page = 1) => get<Page<Media>>("/search/multi", { query: q, page }),
  movie: (id: number) => get<MovieDetail>(`/movie/${id}`, { append_to_response: "credits,videos,recommendations" }),
  tv: (id: number) => get<TVDetail>(`/tv/${id}`, { append_to_response: "credits,videos,recommendations" }),
  season: (id: number, s: number) => get<SeasonDetail>(`/tv/${id}/season/${s}`),
};

// ─── Helpers ──────────────────────────────────────────────────────────────────

export const title = (m: Pick<Media, "title" | "name">) => m.title ?? m.name ?? "Unknown";
export const year = (m: Pick<Media, "release_date" | "first_air_date">) => {
  const d = m.release_date ?? m.first_air_date;
  return d ? new Date(d).getFullYear().toString() : "";
};
export const rating = (n: number) => n.toFixed(1);
export const runtime = (min: number | null) => {
  if (!min) return "";
  return min >= 60 ? `${Math.floor(min / 60)}h ${min % 60}m` : `${min}m`;
};
