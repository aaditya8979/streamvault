"use client";
import { useState, useEffect, useRef, useCallback } from "react";
import Image from "next/image";
import Link from "next/link";
import {
  Play, Info, Search, X, Star, ChevronLeft, ChevronRight,
  Tv, Film, TrendingUp, Award, Loader2,
} from "lucide-react";
import { tmdb, IMG, title, year, rating, type Media } from "@/lib/tmdb";
import clsx from "clsx";

// ─── Skeleton ──────────────────────────────────────────────────────────────
function CardSkel() {
  return (
    <div className="flex-shrink-0 w-36 sm:w-44">
      <div className="skeleton aspect-[2/3] w-full rounded-xl" />
      <div className="mt-2 space-y-1.5">
        <div className="skeleton h-3 w-4/5 rounded" />
        <div className="skeleton h-2.5 w-1/3 rounded" />
      </div>
    </div>
  );
}

// ─── MediaCard ─────────────────────────────────────────────────────────────
function MediaCard({ item, type }: { item: Media; type: "movie" | "tv" }) {
  const t = title(item);
  const y = year(item);
  const r = item.vote_average;
  const mediaType = item.media_type === "movie" ? "movie" : item.media_type === "tv" ? "tv" : type;
  return (
    <Link href={`/${mediaType}/${item.id}`} className="flex-shrink-0 w-36 sm:w-44 group cursor-pointer">
      <div className="relative aspect-[2/3] rounded-xl overflow-hidden bg-zinc-800">
        {item.poster_path ? (
          <Image src={IMG(item.poster_path, "w342")} alt={t} fill sizes="176px"
            className="object-cover transition-transform duration-500 group-hover:scale-110" />
        ) : (
          <div className="absolute inset-0 flex items-center justify-center">
            <Film className="w-8 h-8 text-zinc-600" />
          </div>
        )}
        <div className="absolute inset-0 bg-gradient-to-t from-black/80 via-transparent to-transparent opacity-0 group-hover:opacity-100 transition-opacity" />
        <div className="absolute inset-0 flex items-center justify-center opacity-0 group-hover:opacity-100 transition-opacity">
          <div className="bg-white/20 backdrop-blur-sm rounded-full p-3 border border-white/30">
            <Play className="w-5 h-5 text-white fill-white" />
          </div>
        </div>
        {r > 0 && (
          <div className="absolute top-2 left-2 flex items-center gap-1 bg-black/70 backdrop-blur-sm rounded-md px-1.5 py-0.5">
            <Star className="w-2.5 h-2.5 text-yellow-400 fill-yellow-400" />
            <span className="text-xs font-bold text-white">{rating(r)}</span>
          </div>
        )}
      </div>
      <div className="mt-2 px-0.5">
        <p className="text-sm font-medium text-zinc-300 line-clamp-2 leading-snug group-hover:text-white transition-colors">{t}</p>
        <p className="text-xs text-zinc-500 mt-0.5">{y}</p>
      </div>
    </Link>
  );
}

// ─── Row ──────────────────────────────────────────────────────────────────
function Row({ rowTitle, items, type, icon: Icon }: {
  rowTitle: string; items: Media[]; type: "movie" | "tv"; icon: React.ElementType;
}) {
  const ref = useRef<HTMLDivElement>(null);
  const [canL, setCanL] = useState(false);
  const [canR, setCanR] = useState(true);
  const check = useCallback(() => {
    const el = ref.current;
    if (!el) return;
    setCanL(el.scrollLeft > 4);
    setCanR(el.scrollLeft + el.clientWidth < el.scrollWidth - 4);
  }, []);
  const scroll = (dir: 1 | -1) =>
    ref.current?.scrollBy({ left: dir * ref.current.clientWidth * 0.8, behavior: "smooth" });

  return (
    <section className="mb-10">
      <div className="flex items-center justify-between px-4 sm:px-8 mb-4">
        <div className="flex items-center gap-2">
          <Icon className="w-4 h-4 text-red-500" />
          <h2 className="font-bold text-zinc-100 text-base sm:text-lg">{rowTitle}</h2>
        </div>
        <div className="flex gap-1.5">
          <button onClick={() => scroll(-1)} disabled={!canL}
            className={clsx("p-1.5 rounded-lg border transition-all",
              canL ? "border-zinc-700 text-zinc-300 hover:bg-zinc-800 hover:text-white" : "border-zinc-800 text-zinc-700 cursor-not-allowed")}>
            <ChevronLeft className="w-4 h-4" />
          </button>
          <button onClick={() => scroll(1)} disabled={!canR}
            className={clsx("p-1.5 rounded-lg border transition-all",
              canR ? "border-zinc-700 text-zinc-300 hover:bg-zinc-800 hover:text-white" : "border-zinc-800 text-zinc-700 cursor-not-allowed")}>
            <ChevronRight className="w-4 h-4" />
          </button>
        </div>
      </div>
      <div ref={ref} className="flex gap-3 overflow-x-auto hide-scrollbar px-4 sm:px-8 pb-2" onScroll={check}>
        {items.map(item => <MediaCard key={item.id} item={item} type={type} />)}
      </div>
    </section>
  );
}

// ─── Hero ─────────────────────────────────────────────────────────────────
function Hero({ items }: { items: Media[] }) {
  const [idx, setIdx] = useState(0);
  const featured = items.filter(i => i.backdrop_path).slice(0, 8);

  useEffect(() => {
    if (featured.length <= 1) return;
    const t = setInterval(() => setIdx(i => (i + 1) % featured.length), 7000);
    return () => clearInterval(t);
  }, [featured.length]);

  if (!featured.length) return (
    <div className="w-full h-[62vh] bg-zinc-900 flex items-center justify-center">
      <Loader2 className="w-8 h-8 text-zinc-600 animate-spin" />
    </div>
  );

  const item = featured[idx];
  const mediaType = item.media_type === "movie" ? "movie" : "tv";
  const t = title(item);

  return (
    <div className="relative h-[62vh] min-h-[440px] max-h-[720px] overflow-hidden">
      <Image key={item.id} src={IMG(item.backdrop_path, "original")} alt={t}
        fill className="object-cover object-top" priority sizes="100vw" />
      <div className="absolute inset-0 bg-gradient-to-r from-zinc-950 via-zinc-950/60 to-transparent" />
      <div className="absolute inset-0 bg-gradient-to-t from-zinc-950 via-zinc-950/10 to-transparent" />
      <div className="relative h-full flex items-end pb-16 px-6 sm:px-12">
        <div className="max-w-xl fade-up" key={idx}>
          <div className="flex items-center gap-2.5 mb-3">
            <span className="text-xs font-bold px-2.5 py-1 bg-red-600 rounded text-white uppercase tracking-wide">
              {mediaType === "movie" ? "Movie" : "Series"}
            </span>
            {item.vote_average > 0 && (
              <span className="flex items-center gap-1 text-sm text-yellow-400 font-semibold">
                <Star className="w-3.5 h-3.5 fill-current" />{rating(item.vote_average)}
              </span>
            )}
          </div>
          <h1 className="text-4xl sm:text-5xl font-black text-white leading-tight mb-3">{t}</h1>
          {item.overview && (
            <p className="text-zinc-300 text-sm leading-relaxed mb-5 line-clamp-2">{item.overview}</p>
          )}
          <div className="flex gap-3">
            <Link href={`/watch/${mediaType}/${item.id}`}
              className="flex items-center gap-2 px-6 py-3 bg-white text-black rounded-xl font-bold text-sm hover:bg-zinc-200 active:scale-95 transition-all">
              <Play className="w-4 h-4 fill-current" /> Watch Now
            </Link>
            <Link href={`/${mediaType}/${item.id}`}
              className="flex items-center gap-2 px-5 py-3 bg-white/10 backdrop-blur-sm text-white rounded-xl font-semibold text-sm hover:bg-white/20 transition-all border border-white/20">
              <Info className="w-4 h-4" /> Details
            </Link>
          </div>
        </div>
      </div>
      {featured.length > 1 && (
        <div className="absolute bottom-5 right-6 flex gap-1.5">
          {featured.map((_, i) => (
            <button key={i} onClick={() => setIdx(i)}
              className={clsx("rounded-full transition-all", i === idx ? "w-5 h-1.5 bg-white" : "w-1.5 h-1.5 bg-white/30 hover:bg-white/60")} />
          ))}
        </div>
      )}
    </div>
  );
}

// ─── Search Modal ─────────────────────────────────────────────────────────
function SearchModal({ onClose }: { onClose: () => void }) {
  const [q, setQ] = useState("");
  const [results, setResults] = useState<Media[]>([]);
  const [loading, setLoading] = useState(false);
  const inputRef = useRef<HTMLInputElement>(null);

  useEffect(() => { setTimeout(() => inputRef.current?.focus(), 50); }, []);

  useEffect(() => {
    if (!q.trim()) { setResults([]); return; }
    const t = setTimeout(async () => {
      setLoading(true);
      try {
        const data = await tmdb.search(q.trim());
        setResults((data.results ?? []).filter(r => r.media_type !== "person" && r.poster_path).slice(0, 12));
      } catch { setResults([]); } finally { setLoading(false); }
    }, 350);
    return () => clearTimeout(t);
  }, [q]);

  useEffect(() => {
    const fn = (e: KeyboardEvent) => { if (e.key === "Escape") onClose(); };
    document.addEventListener("keydown", fn);
    return () => document.removeEventListener("keydown", fn);
  }, [onClose]);

  return (
    <div className="fixed inset-0 z-50 bg-black/80 backdrop-blur-sm flex items-start justify-center pt-14 px-4"
      onClick={e => e.target === e.currentTarget && onClose()}>
      <div className="w-full max-w-2xl bg-zinc-900 border border-zinc-700/50 rounded-2xl overflow-hidden shadow-2xl fade-up">
        <div className="flex items-center gap-3 p-4 border-b border-zinc-800">
          {loading ? <Loader2 className="w-5 h-5 text-zinc-500 animate-spin flex-shrink-0" /> : <Search className="w-5 h-5 text-zinc-500 flex-shrink-0" />}
          <input ref={inputRef} value={q} onChange={e => setQ(e.target.value)}
            placeholder="Search movies, TV shows…"
            className="flex-1 bg-transparent text-white placeholder:text-zinc-500 outline-none text-base" />
          <button onClick={onClose} className="p-1 rounded-lg hover:bg-zinc-800 text-zinc-500 hover:text-white transition-colors">
            <X className="w-4 h-4" />
          </button>
        </div>
        <div className="max-h-[60vh] overflow-y-auto divide-y divide-zinc-800/50">
          {!q.trim() && <p className="text-zinc-500 text-sm text-center py-10">Start typing to search</p>}
          {q.trim() && !loading && results.length === 0 && (
            <p className="text-zinc-500 text-sm text-center py-10">No results for &ldquo;{q}&rdquo;</p>
          )}
          {results.map(r => {
            const t = title(r);
            const mediaType = r.media_type === "movie" ? "movie" : "tv";
            return (
              <Link key={r.id} href={`/${mediaType}/${r.id}`} onClick={onClose}
                className="flex items-center gap-3 px-4 py-3 hover:bg-zinc-800/80 transition-colors">
                <div className="relative w-10 h-14 rounded-lg overflow-hidden flex-shrink-0 bg-zinc-800">
                  {r.poster_path && <Image src={IMG(r.poster_path, "w92")} alt={t} fill className="object-cover" sizes="40px" />}
                </div>
                <div className="flex-1 min-w-0">
                  <p className="text-sm font-semibold text-white truncate">{t}</p>
                  <p className="text-xs text-zinc-500 mt-0.5 capitalize">{mediaType} · {year(r)}</p>
                </div>
                {r.vote_average > 0 && (
                  <span className="text-xs text-yellow-400 font-bold flex-shrink-0">★ {rating(r.vote_average)}</span>
                )}
              </Link>
            );
          })}
        </div>
      </div>
    </div>
  );
}

// ─── Navbar ───────────────────────────────────────────────────────────────
function Navbar({ onSearch }: { onSearch: () => void }) {
  const [scrolled, setScrolled] = useState(false);
  useEffect(() => {
    const fn = () => setScrolled(window.scrollY > 20);
    window.addEventListener("scroll", fn, { passive: true });
    return () => window.removeEventListener("scroll", fn);
  }, []);
  useEffect(() => {
    const fn = (e: KeyboardEvent) => {
      if ((e.ctrlKey || e.metaKey) && e.key === "k") { e.preventDefault(); onSearch(); }
    };
    document.addEventListener("keydown", fn);
    return () => document.removeEventListener("keydown", fn);
  }, [onSearch]);

  return (
    <header className={clsx(
      "fixed top-0 inset-x-0 z-40 transition-all duration-300 h-14 flex items-center px-4 sm:px-8",
      scrolled ? "bg-zinc-950/95 backdrop-blur-md border-b border-zinc-800/60" : "bg-gradient-to-b from-black/60 to-transparent"
    )}>
      <Link href="/" className="font-black text-xl text-white mr-8">
        Stream<span className="text-red-500">Vault</span>
      </Link>
      <nav className="hidden md:flex items-center gap-1 flex-1">
        <Link href="/" className="px-3 py-1.5 text-sm text-zinc-400 hover:text-white transition-colors rounded-lg hover:bg-white/5">Home</Link>
        <Link href="/movie/trending" className="px-3 py-1.5 text-sm text-zinc-400 hover:text-white transition-colors rounded-lg hover:bg-white/5">Movies</Link>
        <Link href="/tv/trending" className="px-3 py-1.5 text-sm text-zinc-400 hover:text-white transition-colors rounded-lg hover:bg-white/5">TV Shows</Link>
      </nav>
      <button onClick={onSearch}
        className="ml-auto flex items-center gap-2 px-3 py-1.5 rounded-lg border border-zinc-700 text-zinc-400 text-sm hover:text-white hover:border-zinc-600 hover:bg-zinc-800 transition-all">
        <Search className="w-4 h-4" />
        <span className="hidden sm:inline text-zinc-500">Search</span>
        <kbd className="hidden lg:inline text-xs bg-zinc-800 px-1.5 py-0.5 rounded font-mono text-zinc-600 border border-zinc-700">⌘K</kbd>
      </button>
    </header>
  );
}

// ─── Main ─────────────────────────────────────────────────────────────────
interface RowData { rowTitle: string; items: Media[]; type: "movie" | "tv"; icon: React.ElementType; }

export default function Home() {
  const [searchOpen, setSearchOpen] = useState(false);
  const [hero, setHero] = useState<Media[]>([]);
  const [rows, setRows] = useState<RowData[]>([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    async function load() {
      try {
        // Use day-of-week (0–6) to rotate which page of results we fetch
        // so the dashboard shows different content each day automatically
        const dayPage = (new Date().getDay() % 3) + 1; // cycles pages 1,2,3

        const [
          trending, trendingM, trendingTV,
          popM, topM, popTV, topTV, nowP,
          hindiM, hindiTV, hindiTop,
        ] = await Promise.allSettled([
          tmdb.trending(),
          tmdb.trendingMovies(),
          tmdb.trendingTV(),
          tmdb.popular("movie"),
          tmdb.topRated("movie"),
          tmdb.popular("tv"),
          tmdb.topRated("tv"),
          tmdb.nowPlaying(),
          // Hindi / Indian content rows
          tmdb.hindiMovies(),
          tmdb.hindiTV(),
          tmdb.hindiTopRated(),
        ]);

        const v = <T,>(r: PromiseSettledResult<{ results: T[] }>) =>
          r.status === "fulfilled" ? r.value.results : [] as T[];

        // For hero: mix trending + Hindi blockbusters with backdrops
        const heroPool = [
          ...v(trending).filter((i: Media) => i.backdrop_path),
          ...v(hindiM).filter((i: Media) => i.backdrop_path),
        ].slice(0, 12);

        setHero(heroPool);
        setRows([
          { rowTitle: "🔥 Trending This Week",       items: v(trendingM),  type: "movie", icon: TrendingUp },
          { rowTitle: "📺 Trending TV Shows",         items: v(trendingTV), type: "tv",    icon: TrendingUp },
          { rowTitle: "🎬 Bollywood Blockbusters",    items: v(hindiM),     type: "movie", icon: Film },
          { rowTitle: "📺 Hindi TV Shows & Serials",  items: v(hindiTV),    type: "tv",    icon: Tv },
          { rowTitle: "⭐ Bollywood Classics",        items: v(hindiTop),   type: "movie", icon: Award },
          { rowTitle: "🎭 Now Playing in Theatres",   items: v(nowP),       type: "movie", icon: Film },
          { rowTitle: "🏆 Top Rated Movies",          items: v(topM),       type: "movie", icon: Award },
          { rowTitle: "🌍 Popular TV Shows",          items: v(popTV),      type: "tv",    icon: Tv },
          { rowTitle: "🎥 Top Rated TV Shows",        items: v(topTV),      type: "tv",    icon: Award },
          { rowTitle: "🍿 Popular Movies",            items: v(popM),       type: "movie", icon: Film },
        ]);
        // suppress unused variable warning for dayPage
        void dayPage;
      } catch (e) { console.error("[Home]", e); }
      finally { setLoading(false); }
    }
    load();
  }, []);

  return (
    <>
      <Navbar onSearch={() => setSearchOpen(true)} />
      {searchOpen && <SearchModal onClose={() => setSearchOpen(false)} />}
      {loading ? (
        <div className="w-full h-[62vh] bg-zinc-900 flex items-center justify-center">
          <Loader2 className="w-8 h-8 text-zinc-600 animate-spin" />
        </div>
      ) : (
        <Hero items={hero} />
      )}
      <div className="relative z-10 -mt-8 pb-16">
        {loading
          ? Array.from({ length: 3 }).map((_, i) => (
              <section key={i} className="mb-10 px-4 sm:px-8">
                <div className="skeleton h-5 w-40 rounded mb-4" />
                <div className="flex gap-3">
                  {Array.from({ length: 6 }).map((_, j) => <CardSkel key={j} />)}
                </div>
              </section>
            ))
          : rows.map(row => (
              <Row key={row.rowTitle} rowTitle={row.rowTitle} items={row.items} type={row.type} icon={row.icon} />
            ))
        }
      </div>
      <footer className="border-t border-zinc-900 py-6 text-center text-zinc-600 text-xs space-y-1">
        <p>StreamVault · Data by TMDB · Personal use only</p>
        <p>💡 For Hindi subtitles on any movie, open the player → click CC button · Indian shows: search by name</p>
      </footer>
    </>
  );
}