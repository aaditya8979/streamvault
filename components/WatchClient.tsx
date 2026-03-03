"use client";
import { useState, useEffect, useCallback } from "react";
import Image from "next/image";
import Link from "next/link";
import { ArrowLeft, ChevronDown, ChevronUp, SkipForward, Loader2, AlertTriangle, Tv } from "lucide-react";
import { tmdb, IMG, rating, type TVDetail, type MovieDetail, type Episode, type SeasonDetail } from "@/lib/tmdb";
import { PROVIDERS, movieEmbed, tvEmbed, type EmbedProvider } from "@/lib/embed";
import clsx from "clsx";

// ─── Player ───────────────────────────────────────────────────────────────
function Player({ src, title }: { src: string; title: string }) {
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(false);

  useEffect(() => { setLoading(true); setError(false); }, [src]);

  return (
    <div className="relative w-full aspect-video bg-black rounded-none md:rounded-xl overflow-hidden">
      {loading && !error && (
        <div className="absolute inset-0 flex flex-col items-center justify-center gap-3 bg-zinc-950 z-10">
          <Loader2 className="w-8 h-8 text-zinc-600 animate-spin" />
          <p className="text-zinc-500 text-sm">Loading player…</p>
        </div>
      )}
      {error && (
        <div className="absolute inset-0 flex flex-col items-center justify-center gap-3 bg-zinc-950 z-10">
          <AlertTriangle className="w-8 h-8 text-yellow-500" />
          <p className="text-zinc-400 text-sm">This source didn&apos;t load — try another server</p>
        </div>
      )}
      <iframe
        key={src}
        src={src}
        title={title}
        className="absolute inset-0 w-full h-full"
        allowFullScreen
        allow="autoplay; fullscreen; picture-in-picture; encrypted-media"
        sandbox="allow-scripts allow-same-origin allow-presentation"
        onLoad={() => setLoading(false)}
        onError={() => { setLoading(false); setError(true); }}
        referrerPolicy="no-referrer"
      />
    </div>
  );
}

// ─── Episode List ─────────────────────────────────────────────────────────
function EpisodeList({ episodes, currentEp, onSelect }: {
  episodes: Episode[];
  currentEp: number;
  onSelect: (ep: Episode) => void;
}) {
  return (
    <div className="space-y-1">
      {episodes.map(ep => (
        <button key={ep.id} onClick={() => onSelect(ep)}
          className={clsx(
            "w-full flex items-start gap-3 p-3 rounded-xl text-left transition-all",
            ep.episode_number === currentEp
              ? "bg-red-600/15 border border-red-600/30 text-white"
              : "hover:bg-zinc-800 text-zinc-400 hover:text-white border border-transparent"
          )}>
          <span className={clsx("font-mono text-sm font-bold w-8 flex-shrink-0 pt-0.5",
            ep.episode_number === currentEp ? "text-red-400" : "text-zinc-600")}>
            {ep.episode_number}
          </span>
          <div className="flex-1 min-w-0">
            <p className="text-sm font-semibold leading-snug line-clamp-1">{ep.name}</p>
            {ep.overview && <p className="text-xs text-zinc-600 mt-0.5 line-clamp-2">{ep.overview}</p>}
          </div>
        </button>
      ))}
    </div>
  );
}

// ─── Main WatchClient ─────────────────────────────────────────────────────
export default function WatchClient({ type, id, season: initSeason, episode: initEpisode }:
  { type: "movie" | "tv"; id: number; season: number; episode: number }) {

  const [provider, setProvider] = useState<EmbedProvider>("vidsrcme");
  const [season, setSeason] = useState(initSeason);
  const [episode, setEpisode] = useState(initEpisode);
  const [showData, setShowData] = useState<TVDetail | null>(null);
  const [movieData, setMovieData] = useState<MovieDetail | null>(null);
  const [seasonDetail, setSeasonDetail] = useState<SeasonDetail | null>(null);
  const [loadingShow, setLoadingShow] = useState(type === "tv");
  const [loadingSeason, setLoadingSeason] = useState(type === "tv");
  const [seasonOpen, setSeasonOpen] = useState(false);
  const [episodesOpen, setEpisodesOpen] = useState(true);

  // Fetch metadata
  useEffect(() => {
    if (type === "movie") {
      tmdb.movie(id).then(setMovieData).catch(() => { });
      return;
    }
    setLoadingShow(true);
    tmdb.tv(id)
      .then(data => { setShowData(data); })
      .catch(() => { })
      .finally(() => setLoadingShow(false));
  }, [type, id]);

  // Fetch season episodes
  const loadSeason = useCallback((s: number) => {
    if (type !== "tv") return;
    setLoadingSeason(true);
    tmdb.season(id, s)
      .then(data => setSeasonDetail(data))
      .catch(() => setSeasonDetail(null))
      .finally(() => setLoadingSeason(false));
  }, [type, id]);

  useEffect(() => { if (type === "tv") loadSeason(season); }, [type, season, loadSeason]);

  const embedUrl = type === "movie"
    ? movieEmbed(id, provider)
    : tvEmbed(id, season, episode, provider);

  const titleStr = type === "movie"
    ? (movieData?.title ?? "Movie")
    : (showData?.name ?? "TV Show");

  const watchTitle = type === "movie"
    ? titleStr
    : `${titleStr} S${String(season).padStart(2, "0")}E${String(episode).padStart(2, "0")}`;

  const posterPath = type === "movie" ? movieData?.poster_path : showData?.poster_path;

  const validSeasons = showData?.seasons.filter(s => s.season_number > 0) ?? [];

  const currentEpisodeObj = seasonDetail?.episodes.find(e => e.episode_number === episode);
  const nextEpisode = seasonDetail?.episodes.find(e => e.episode_number === episode + 1);

  const goNext = () => {
    if (nextEpisode) setEpisode(nextEpisode.episode_number);
    else if (showData && season < showData.number_of_seasons) {
      const nextS = season + 1;
      setSeason(nextS);
      setEpisode(1);
      loadSeason(nextS);
    }
  };

  return (
    <div className="min-h-screen bg-zinc-950 flex flex-col">
      {/* Top bar */}
      <div className="flex items-center gap-3 px-4 sm:px-6 py-3 border-b border-zinc-900 bg-zinc-950 flex-shrink-0">
        <Link href={`/${type}/${id}`}
          className="flex items-center gap-1.5 p-2 rounded-lg text-zinc-500 hover:text-white hover:bg-zinc-800 transition-colors">
          <ArrowLeft className="w-4 h-4" />
        </Link>
        {posterPath && (
          <div className="relative w-8 h-11 rounded overflow-hidden flex-shrink-0">
            <Image src={IMG(posterPath, "w92")} alt={titleStr} fill className="object-cover" sizes="32px" />
          </div>
        )}
        <div className="flex-1 min-w-0">
          <p className="text-white font-semibold text-sm truncate">{titleStr}</p>
          {type === "tv" && (
            <p className="text-xs text-zinc-500">
              Season {season} · Episode {episode}
              {currentEpisodeObj && ` · ${currentEpisodeObj.name}`}
            </p>
          )}
        </div>
        {type === "tv" && nextEpisode && (
          <button onClick={goNext}
            className="flex items-center gap-1.5 px-3 py-1.5 bg-zinc-800 hover:bg-zinc-700 text-zinc-300 hover:text-white rounded-lg text-xs font-medium transition-colors border border-zinc-700">
            <SkipForward className="w-3.5 h-3.5" /> Next
          </button>
        )}
      </div>

      <div className="flex flex-col xl:flex-row flex-1 min-h-0">
        {/* Player column */}
        <div className="flex-1 flex flex-col">
          {/* Player */}
          <div className="w-full">
            <Player src={embedUrl} title={watchTitle} />
          </div>

          {/* Server selector */}
          <div className="px-4 py-3 border-b border-zinc-900 bg-zinc-950">
            <div className="flex items-center gap-3 flex-wrap">
              <span className="text-xs font-semibold text-zinc-500 uppercase tracking-wider">Source:</span>
              {PROVIDERS.map(p => (
                <button key={p.id} onClick={() => setProvider(p.id)}
                  className={clsx(
                    "px-4 py-1.5 rounded-lg text-sm font-medium border transition-all",
                    provider === p.id
                      ? "bg-red-600 text-white border-red-600 shadow-lg shadow-red-600/20"
                      : "bg-zinc-900 text-zinc-400 border-zinc-800 hover:bg-zinc-800 hover:text-white"
                  )}>
                  {p.label}
                </button>
              ))}
              <div className="flex items-center gap-1 ml-auto">
                <AlertTriangle className="w-3.5 h-3.5 text-yellow-600" />
                <span className="text-xs text-zinc-600">If one server fails, try another</span>
              </div>
            </div>
          </div>

          {/* Movie info */}
          {type === "movie" && movieData && (
            <div className="px-4 py-5 border-b border-zinc-900">
              <h1 className="font-bold text-xl text-white mb-1">{movieData.title}</h1>
              <div className="flex flex-wrap items-center gap-3 text-sm text-zinc-500 mb-3">
                {movieData.vote_average > 0 && <span className="text-yellow-400">★ {rating(movieData.vote_average)}</span>}
                {movieData.release_date && <span>{new Date(movieData.release_date).getFullYear()}</span>}
                {movieData.runtime && <span>{Math.floor(movieData.runtime / 60)}h {movieData.runtime % 60}m</span>}
                {movieData.genres.slice(0, 3).map(g => <span key={g.id} className="text-zinc-500">{g.name}</span>)}
              </div>
              {movieData.overview && <p className="text-zinc-400 text-sm leading-relaxed">{movieData.overview}</p>}
            </div>
          )}
        </div>

        {/* TV Sidebar */}
        {type === "tv" && (
          <div className="xl:w-80 xl:flex-shrink-0 xl:border-l xl:border-zinc-900 flex flex-col max-h-[600px] xl:max-h-none">
            {/* Season selector */}
            <div className="border-b border-zinc-900 flex-shrink-0">
              <button onClick={() => setSeasonOpen(!seasonOpen)}
                className="w-full flex items-center justify-between px-4 py-3.5 hover:bg-zinc-900 transition-colors">
                <div className="flex items-center gap-2">
                  <Tv className="w-4 h-4 text-zinc-500" />
                  <span className="font-semibold text-white text-sm">
                    {loadingShow ? "Loading…" : `Season ${season}`}
                  </span>
                  {seasonDetail && <span className="text-xs text-zinc-500">· {seasonDetail.episodes.length} episodes</span>}
                </div>
                {seasonOpen ? <ChevronUp className="w-4 h-4 text-zinc-500" /> : <ChevronDown className="w-4 h-4 text-zinc-500" />}
              </button>

              {seasonOpen && validSeasons.length > 0 && (
                <div className="border-t border-zinc-900 max-h-48 overflow-y-auto">
                  {validSeasons.map(s => (
                    <button key={s.id}
                      onClick={() => { setSeason(s.season_number); setEpisode(1); loadSeason(s.season_number); setSeasonOpen(false); }}
                      className={clsx(
                        "w-full flex items-center justify-between px-4 py-3 text-sm hover:bg-zinc-800 transition-colors",
                        s.season_number === season ? "text-red-400 bg-red-600/10" : "text-zinc-400"
                      )}>
                      <span className="font-medium">{s.name}</span>
                      <span className="text-zinc-600 text-xs">{s.episode_count} eps</span>
                    </button>
                  ))}
                </div>
              )}
            </div>

            {/* Episodes */}
            <div className="flex-1 overflow-y-auto">
              <button onClick={() => setEpisodesOpen(!episodesOpen)}
                className="w-full flex items-center justify-between px-4 py-3 border-b border-zinc-900 hover:bg-zinc-900 transition-colors flex-shrink-0">
                <span className="text-xs font-semibold text-zinc-500 uppercase tracking-wider">Episodes</span>
                {episodesOpen ? <ChevronUp className="w-3.5 h-3.5 text-zinc-600" /> : <ChevronDown className="w-3.5 h-3.5 text-zinc-600" />}
              </button>

              {episodesOpen && (
                <div className="p-2">
                  {loadingSeason ? (
                    <div className="flex items-center justify-center py-12">
                      <Loader2 className="w-6 h-6 text-zinc-600 animate-spin" />
                    </div>
                  ) : (
                    <EpisodeList
                      episodes={seasonDetail?.episodes ?? []}
                      currentEp={episode}
                      onSelect={ep => setEpisode(ep.episode_number)}
                    />
                  )}
                </div>
              )}
            </div>
          </div>
        )}
      </div>
    </div>
  );
}
