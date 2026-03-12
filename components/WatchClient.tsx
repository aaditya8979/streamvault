"use client";
import { useState, useEffect, useCallback, useRef } from "react";
import Image from "next/image";
import Link from "next/link";
import {
  ArrowLeft, ChevronDown, ChevronUp, SkipForward,
  Loader2, AlertTriangle, Maximize, Minimize, Tv,
} from "lucide-react";
import { tmdb, IMG, rating, type TVDetail, type MovieDetail, type Episode, type SeasonDetail } from "@/lib/tmdb";
import { PROVIDERS, movieEmbed, tvEmbed, type EmbedProvider } from "@/lib/embed";
import clsx from "clsx";

// ─── Hindi mode toggle ─────────────────────────────────────────────────────
function HindiToggle({ on, onChange }: { on: boolean; onChange: (v: boolean) => void }) {
  return (
    <button
      onClick={() => onChange(!on)}
      className={clsx(
        "flex items-center gap-2 px-4 py-2 rounded-xl font-semibold text-sm border-2 transition-all duration-200 select-none",
        on
          ? "bg-orange-500 border-orange-400 text-white shadow-lg shadow-orange-500/30 scale-105"
          : "bg-zinc-900 border-zinc-700 text-zinc-400 hover:border-orange-500/50 hover:text-orange-400"
      )}
    >
      {/* Devanagari 'Ha' as icon */}
      <span className="text-base leading-none font-black">ह</span>
      <span>{on ? "हिंदी ON" : "हिंदी Mode"}</span>
      {on && (
        <span className="ml-1 px-1.5 py-0.5 text-[10px] bg-white/20 rounded font-bold tracking-wide">
          LIVE
        </span>
      )}
    </button>
  );
}

// ─── Server bar ────────────────────────────────────────────────────────────
function ServerBar({
  provider, onProviderChange, hindiMode, onHindiChange, mediaType,
}: {
  provider: EmbedProvider;
  onProviderChange: (p: EmbedProvider) => void;
  hindiMode: boolean;
  onHindiChange: (v: boolean) => void;
  mediaType: "movie" | "tv";
}) {
  return (
    <div className="px-3 py-3 border-b border-zinc-900 bg-zinc-950 space-y-3">

      {/* Hindi toggle */}
      <div className="flex items-center gap-3 flex-wrap">
        <HindiToggle on={hindiMode} onChange={onHindiChange} />
        <p className="text-xs text-zinc-500 leading-snug max-w-xs">
          {hindiMode
            ? "🟠 Hindi audio/dub requested. Switch server if not working."
            : "Switch to Hindi dubbed audio for any movie or show."}
        </p>
      </div>

      {/* Server buttons */}
      <div className="flex items-center gap-2 flex-wrap">
        <span className="text-[11px] font-bold text-zinc-600 uppercase tracking-wider w-14 flex-shrink-0">Server</span>
        {PROVIDERS.map(p => {
          const active = provider === p.id;
          return (
            <button
              key={p.id}
              onClick={() => onProviderChange(p.id)}
              title={hindiMode ? p.hindiNote : p.note}
              className={clsx(
                "flex items-center gap-1.5 px-3 py-1.5 rounded-lg text-sm font-medium border transition-all",
                active
                  ? "bg-zinc-100 text-zinc-900 border-zinc-100 shadow"
                  : "bg-zinc-900 text-zinc-400 border-zinc-800 hover:bg-zinc-800 hover:text-white"
              )}
            >
              <span className={clsx(
                "text-[10px] font-bold px-1.5 py-0.5 rounded text-white leading-none",
                p.badgeColor
              )}>
                {p.badge}
              </span>
              {p.label}
            </button>
          );
        })}
      </div>

      {/* Indian TV notice */}
      {mediaType === "tv" && (
        <div className="flex items-start gap-2 text-xs bg-zinc-800/60 border border-zinc-700/50 rounded-lg px-3 py-2">
          <span className="text-zinc-400 text-sm leading-none flex-shrink-0 mt-0.5">📺</span>
          <span className="text-zinc-500">
            <strong className="text-zinc-300">Anupama · TMKOC · Indian serials</strong> are
            exclusively on <strong className="text-zinc-300">Hotstar / JioCinema / SonyLiv</strong> due
            to Indian broadcast licensing — no free embed server carries this content.
            International &amp; dubbed Indian shows work on all servers above.
          </span>
        </div>
      )}

      {/* Hindi mode tip */}
      {hindiMode && (
        <div className="flex items-start gap-2 text-xs text-orange-300/70 bg-orange-500/5 border border-orange-500/10 rounded-lg px-3 py-2">
          <span className="text-orange-400 text-base leading-none flex-shrink-0">💡</span>
          <span>
            <strong className="text-orange-300">AutoEmbed</strong> has the best Hindi audio support.
            If still in English, the dub may not be available for this title.
          </span>
        </div>
      )}
    </div>
  );
}

// ─── Player ────────────────────────────────────────────────────────────────
const AUTO_REFRESH_MS = 23 * 60 * 1000;

function Player({ src, title }: { src: string; title: string }) {
  const containerRef = useRef<HTMLDivElement>(null);
  const [loading, setLoading]       = useState(true);
  const [error, setError]           = useState(false);
  const [isFullscreen, setIsFullscreen] = useState(false);
  const [iframeKey, setIframeKey]   = useState(0);
  // activated: true after first click — overlay disappears permanently,
  // all subsequent clicks go directly to the iframe with zero interception
  const [activated, setActivated]   = useState(false);

  const resetPlayer = () => {
    setLoading(true);
    setError(false);
    setActivated(false);
    setIframeKey(k => k + 1);
  };

  useEffect(() => { resetPlayer(); }, [src]); // src change intentionally resets player

  useEffect(() => {
    const t = setInterval(() => { if (!document.hidden) resetPlayer(); }, AUTO_REFRESH_MS);
    return () => clearInterval(t);
  }, [src]); // restart timer when src changes

  useEffect(() => {
    const fn = () => { if (!document.hidden) resetPlayer(); };
    document.addEventListener("visibilitychange", fn);
    return () => document.removeEventListener("visibilitychange", fn);
  }, []); // mount/unmount only

  useEffect(() => {
    const fn = () => setIsFullscreen(!!document.fullscreenElement);
    document.addEventListener("fullscreenchange", fn);
    return () => document.removeEventListener("fullscreenchange", fn);
  }, []);

  const toggleFullscreen = useCallback(async () => {
    const el = containerRef.current;
    if (!el) return;
    if (!document.fullscreenElement) {
      try { await el.requestFullscreen(); } catch {}
    } else {
      try { await document.exitFullscreen(); } catch {}
    }
  }, []);

  useEffect(() => {
    const fn = (e: KeyboardEvent) => {
      if ((e.key === "f" || e.key === "F") && !["INPUT","TEXTAREA"].includes((e.target as HTMLElement).tagName))
        toggleFullscreen();
    };
    document.addEventListener("keydown", fn);
    return () => document.removeEventListener("keydown", fn);
  }, [toggleFullscreen]);

  return (
    <div
      ref={containerRef}
      className={clsx(
        "relative w-full bg-black",
        isFullscreen ? "fixed inset-0 z-[9999]" : "aspect-video"
      )}
    >
      {/* Loading */}
      {loading && !error && (
        <div className="absolute inset-0 flex flex-col items-center justify-center gap-3 bg-zinc-950 z-10 pointer-events-none">
          <Loader2 className="w-8 h-8 text-zinc-500 animate-spin" />
          <p className="text-zinc-500 text-sm">Loading player…</p>
        </div>
      )}

      {/* Error */}
      {error && (
        <div className="absolute inset-0 flex flex-col items-center justify-center gap-4 bg-zinc-950/95 z-20">
          <AlertTriangle className="w-10 h-10 text-yellow-500" />
          <p className="text-white font-bold">Stream couldn't load</p>
          <button onClick={resetPlayer}
            className="flex items-center gap-2 px-5 py-2.5 bg-white text-black rounded-xl font-bold text-sm hover:bg-zinc-200 active:scale-95 transition-all">
            <Loader2 className="w-4 h-4" /> Reconnect
          </button>
          <p className="text-xs text-zinc-600">Or choose a different server below</p>
        </div>
      )}

      {/* Iframe — plays fully, no sandbox */}
      <iframe
        key={`${src}-${iframeKey}`}
        src={src}
        title={title}
        className="absolute inset-0 w-full h-full border-0"
        allowFullScreen
        allow="autoplay; fullscreen; picture-in-picture; encrypted-media; gyroscope; accelerometer"
        onLoad={() => { setLoading(false); setError(false); }}
        onError={() => { setLoading(false); setError(true); }}
        referrerPolicy="no-referrer"
      />

      {/* ── First-click redirect absorber ──────────────────────────────────
          The ONLY problem: embed providers fire an ad-redirect on the very
          first click inside the iframe. This overlay catches that one click,
          then removes itself completely. Every click after goes straight to
          the native iframe player — volume, progress, settings, everything. */}
      {!activated && !error && !loading && (
        <div
          className="absolute inset-0 z-10 cursor-pointer flex items-center justify-center"
          onClick={() => setActivated(true)}
        >
          <div className="bg-black/60 backdrop-blur-sm border border-white/10 rounded-2xl px-8 py-5 flex flex-col items-center gap-2">
            <div className="w-14 h-14 rounded-full bg-white/10 border border-white/20 flex items-center justify-center">
              <span className="text-3xl ml-1">▶</span>
            </div>
            <p className="text-white text-sm font-semibold mt-1">Click to play</p>
            <p className="text-zinc-500 text-xs">Controls available after playback starts</p>
          </div>
        </div>
      )}

      {/* Fullscreen button */}
      {!error && (
        <button
          onClick={toggleFullscreen}
          title={isFullscreen ? "Exit fullscreen (F)" : "Fullscreen (F)"}
          className="absolute top-2.5 right-2.5 z-30 p-2 rounded-lg bg-black/60 hover:bg-black/90 text-white border border-white/20 backdrop-blur-sm transition-all hover:scale-105"
        >
          {isFullscreen ? <Minimize className="w-4 h-4" /> : <Maximize className="w-4 h-4" />}
        </button>
      )}

      <AutoRefreshBadge src={src} iframeKey={iframeKey} />
    </div>
  );
}

function AutoRefreshBadge({ src, iframeKey }: { src: string; iframeKey: number }) {
  const [secsLeft, setSecsLeft] = useState(AUTO_REFRESH_MS / 1000);
  useEffect(() => {
    setSecsLeft(AUTO_REFRESH_MS / 1000);
    const t = setInterval(() => setSecsLeft(s => Math.max(0, s - 1)), 1000);
    return () => clearInterval(t);
  }, [src, iframeKey]);
  if (secsLeft > 120) return null;
  const mins = Math.floor(secsLeft / 60);
  const secs = secsLeft % 60;
  return (
    <div className="absolute bottom-14 left-1/2 -translate-x-1/2 z-30 pointer-events-none">
      <div className="bg-black/80 backdrop-blur-sm text-zinc-400 text-xs px-3 py-1.5 rounded-full border border-zinc-700 flex items-center gap-2">
        <Loader2 className="w-3 h-3 animate-spin" />
        Stream refreshing in {mins}:{String(secs).padStart(2, "0")}
      </div>
    </div>
  );
}

// ─── Episode list ──────────────────────────────────────────────────────────
function EpisodeList({ episodes, currentEp, onSelect }: {
  episodes: Episode[];
  currentEp: number;
  onSelect: (ep: Episode) => void;
}) {
  if (!episodes.length) return (
    <div className="py-8 text-center text-zinc-600 text-sm">No episodes found</div>
  );
  return (
    <div className="space-y-1">
      {episodes.map(ep => {
        const active = ep.episode_number === currentEp;
        return (
          <button key={ep.id} onClick={() => onSelect(ep)}
            className={clsx(
              "w-full flex items-start gap-3 p-3 rounded-xl text-left transition-all",
              active ? "bg-red-600/15 border border-red-600/30" : "hover:bg-zinc-800/80 border border-transparent"
            )}>
            <span className={clsx("font-mono text-sm font-bold w-8 flex-shrink-0 pt-0.5",
              active ? "text-red-400" : "text-zinc-600")}>
              {String(ep.episode_number).padStart(2, "0")}
            </span>
            <div className="flex-1 min-w-0">
              <p className={clsx("text-sm font-semibold leading-snug line-clamp-1",
                active ? "text-white" : "text-zinc-300")}>
                {ep.name}
              </p>
              {ep.runtime && <p className="text-xs text-zinc-600 mt-0.5">{ep.runtime}m</p>}
              {ep.overview && <p className="text-xs text-zinc-600 mt-0.5 line-clamp-2">{ep.overview}</p>}
            </div>
          </button>
        );
      })}
    </div>
  );
}

// ─── Main ─────────────────────────────────────────────────────────────────
export default function WatchClient({
  type, id, season: initSeason, episode: initEpisode,
}: { type: "movie" | "tv"; id: number; season: number; episode: number }) {

  const [provider, setProvider]   = useState<EmbedProvider>("vidsrc_cc");
  const [hindiMode, setHindiMode] = useState(false);
  const [season, setSeason]       = useState(initSeason);
  const [episode, setEpisode]     = useState(initEpisode);

  const [showData,    setShowData]    = useState<TVDetail | null>(null);
  const [movieData,   setMovieData]   = useState<MovieDetail | null>(null);
  const [seasonDetail,setSeasonDetail]= useState<SeasonDetail | null>(null);
  const [loadingShow, setLoadingShow] = useState(type === "tv");
  const [loadingSeason,setLoadingSeason] = useState(type === "tv");
  const [seasonOpen,  setSeasonOpen]  = useState(false);

  useEffect(() => {
    if (type === "movie") { tmdb.movie(id).then(setMovieData).catch(() => {}); return; }
    setLoadingShow(true);
    tmdb.tv(id).then(setShowData).catch(() => {}).finally(() => setLoadingShow(false));
  }, [type, id]);

  const loadSeason = useCallback((s: number) => {
    if (type !== "tv") return;
    setLoadingSeason(true);
    tmdb.season(id, s).then(setSeasonDetail).catch(() => setSeasonDetail(null)).finally(() => setLoadingSeason(false));
  }, [type, id]);

  useEffect(() => { if (type === "tv") loadSeason(season); }, [type, season, loadSeason]);

  const handleHindiChange = (v: boolean) => {
    setHindiMode(v);
    if (v) setProvider("autoembed");
    else    setProvider("vidsrc_cc");
  };

  // Cycle to next provider — used when an episode shows error 233011
  const tryNextServer = useCallback(() => {
    setProvider(current => {
      const ids = PROVIDERS.map(p => p.id);
      const idx = ids.indexOf(current);
      return ids[(idx + 1) % ids.length];
    });
  }, []);

  const providerIds = PROVIDERS.map(p => p.id);

  const embedUrl = type === "movie"
    ? movieEmbed(id, provider, hindiMode)
    : tvEmbed(id, season, episode, provider, hindiMode);

  const titleStr   = type === "movie" ? (movieData?.title ?? "Movie") : (showData?.name ?? "TV Show");
  const watchTitle = type === "movie" ? titleStr : `${titleStr} S${String(season).padStart(2,"0")}E${String(episode).padStart(2,"0")}`;
  const posterPath = type === "movie" ? movieData?.poster_path : showData?.poster_path;

  const validSeasons      = showData?.seasons.filter(s => s.season_number > 0) ?? [];
  const currentEpisodeObj = seasonDetail?.episodes.find(e => e.episode_number === episode);
  const nextEpisode       = seasonDetail?.episodes.find(e => e.episode_number === episode + 1);

  const goNext = () => {
    if (nextEpisode) { setEpisode(nextEpisode.episode_number); return; }
    if (showData && season < showData.number_of_seasons) {
      const ns = season + 1; setSeason(ns); setEpisode(1); loadSeason(ns);
    }
  };

  return (
    <div className="min-h-screen bg-zinc-950 flex flex-col">

      {/* ── Top bar ─────────────────────────────────────────────────── */}
      <div className="flex items-center gap-3 px-3 sm:px-5 py-2.5 border-b border-zinc-900 bg-zinc-950/95 backdrop-blur-sm flex-shrink-0 sticky top-0 z-40">
        <Link href={`/${type}/${id}`}
          className="p-2 rounded-lg text-zinc-500 hover:text-white hover:bg-zinc-800 transition-colors flex-shrink-0">
          <ArrowLeft className="w-4 h-4" />
        </Link>
        {posterPath && (
          <div className="relative w-7 h-10 rounded overflow-hidden flex-shrink-0">
            <Image src={IMG(posterPath, "w92")} alt={titleStr} fill className="object-cover" sizes="28px" />
          </div>
        )}
        <div className="flex-1 min-w-0">
          <p className="text-white font-semibold text-sm truncate leading-tight">{titleStr}</p>
          {type === "tv" && (
            <p className="text-xs text-zinc-500 leading-tight">
              S{season} E{episode}{currentEpisodeObj ? ` · ${currentEpisodeObj.name}` : ""}
            </p>
          )}
        </div>
        {/* Hindi pill in topbar so it's always visible */}
        {hindiMode && (
          <span className="flex-shrink-0 px-2 py-1 bg-orange-500/20 border border-orange-500/30 text-orange-400 text-xs font-bold rounded-lg">
            ह हिंदी
          </span>
        )}
        {type === "tv" && (
          <button
            onClick={goNext}
            disabled={!nextEpisode && !(showData && season < showData.number_of_seasons)}
            className={clsx(
              "flex items-center gap-1.5 px-3 py-1.5 rounded-lg text-xs font-medium border transition-all flex-shrink-0",
              nextEpisode || (showData && season < showData.number_of_seasons)
                ? "border-zinc-700 bg-zinc-800 text-zinc-300 hover:text-white hover:bg-zinc-700"
                : "border-zinc-800 text-zinc-700 cursor-not-allowed"
            )}>
            <SkipForward className="w-3.5 h-3.5" /> Next Ep
          </button>
        )}
      </div>

      {/* ── Main layout ──────────────────────────────────────────────── */}
      <div className="flex flex-col xl:flex-row flex-1 min-h-0">

        {/* Left: Player + controls */}
        <div className="flex-1 flex flex-col min-w-0">
          <Player src={embedUrl} title={watchTitle} />

          {/* ── "Not working?" quick-switch strip ──────────────────────
              Error 233011 = this episode has no source on current server.
              One click tries the next server automatically. */}
          <div className="flex items-center justify-between px-3 py-2 bg-zinc-900/80 border-b border-zinc-800/60">
            <p className="text-xs text-zinc-500 flex items-center gap-1.5">
              <span className="text-yellow-500">⚠</span>
              Seeing <span className="font-mono text-zinc-400">Error 233011</span>
              ? This episode has no source on current server.
            </p>
            <button
              onClick={tryNextServer}
              className="flex items-center gap-1.5 px-3 py-1.5 bg-zinc-800 hover:bg-zinc-700 border border-zinc-700 hover:border-zinc-500 text-zinc-300 hover:text-white text-xs font-semibold rounded-lg transition-all active:scale-95"
            >
              Try next server →
              <span className="px-1.5 py-0.5 bg-zinc-700 rounded text-zinc-400 font-mono text-[10px]">
                {PROVIDERS[(providerIds.indexOf(provider) + 1) % PROVIDERS.length]?.label}
              </span>
            </button>
          </div>

          <ServerBar
            provider={provider} onProviderChange={setProvider}
            hindiMode={hindiMode} onHindiChange={handleHindiChange}
            mediaType={type}
          />

          {/* Info panel */}
          <div className="px-4 py-4 flex-1">
            {type === "movie" && movieData ? (
              <>
                <h1 className="font-bold text-xl text-white mb-1.5">{movieData.title}</h1>
                <div className="flex flex-wrap items-center gap-x-4 gap-y-1 text-sm mb-3">
                  {movieData.vote_average > 0 && <span className="text-yellow-400 font-bold">★ {rating(movieData.vote_average)}</span>}
                  {movieData.release_date && <span className="text-zinc-500">{new Date(movieData.release_date).getFullYear()}</span>}
                  {movieData.runtime && <span className="text-zinc-500">{Math.floor(movieData.runtime/60)}h {movieData.runtime%60}m</span>}
                  <div className="flex flex-wrap gap-2">
                    {movieData.genres.slice(0, 3).map(g => (
                      <span key={g.id} className="px-2 py-0.5 text-xs bg-zinc-800 text-zinc-400 rounded border border-zinc-700">{g.name}</span>
                    ))}
                  </div>
                </div>
                {movieData.overview && <p className="text-zinc-400 text-sm leading-relaxed">{movieData.overview}</p>}
              </>
            ) : type === "tv" && showData ? (
              <>
                <h1 className="font-bold text-xl text-white mb-1">{showData.name}</h1>
                <div className="flex items-center gap-3 text-sm mb-2">
                  {showData.vote_average > 0 && <span className="text-yellow-400 font-bold">★ {rating(showData.vote_average)}</span>}
                  <span className="text-zinc-500">{showData.number_of_seasons} Season{showData.number_of_seasons !== 1 ? "s" : ""}</span>
                  <span className={clsx("px-2 py-0.5 text-xs rounded font-semibold",
                    showData.status === "Returning Series" ? "bg-emerald-600/20 text-emerald-400" : "bg-zinc-800 text-zinc-500")}>
                    {showData.status}
                  </span>
                </div>
                {showData.overview && <p className="text-zinc-400 text-sm leading-relaxed line-clamp-3">{showData.overview}</p>}
              </>
            ) : (
              <div className="flex items-center gap-2 text-zinc-600 text-sm">
                <Loader2 className="w-4 h-4 animate-spin" /> Loading info…
              </div>
            )}
          </div>
        </div>

        {/* Right: TV episode sidebar */}
        {type === "tv" && (
          <div className="xl:w-80 xl:flex-shrink-0 xl:border-l xl:border-zinc-900 flex flex-col max-h-[520px] xl:max-h-[calc(100vh-52px)] xl:sticky xl:top-[52px] overflow-hidden">

            {/* Season dropdown */}
            <div className="flex-shrink-0 border-b border-zinc-900">
              <button onClick={() => setSeasonOpen(v => !v)}
                className="w-full flex items-center justify-between px-4 py-3.5 hover:bg-zinc-900/60 transition-colors">
                <div className="flex items-center gap-2">
                  <Tv className="w-4 h-4 text-red-500 flex-shrink-0" />
                  <span className="font-semibold text-white text-sm">
                    {loadingShow ? "Loading…" : `Season ${season}`}
                  </span>
                  {seasonDetail && <span className="text-xs text-zinc-600">· {seasonDetail.episodes.length} eps</span>}
                </div>
                {seasonOpen ? <ChevronUp className="w-4 h-4 text-zinc-600" /> : <ChevronDown className="w-4 h-4 text-zinc-600" />}
              </button>

              {seasonOpen && validSeasons.length > 0 && (
                <div className="border-t border-zinc-900 max-h-52 overflow-y-auto bg-zinc-900/50">
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

            {/* Episode list */}
            <div className="flex-1 overflow-y-auto p-2">
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
          </div>
        )}
      </div>
    </div>
  );
}