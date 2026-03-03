"use client";
import { useState, useEffect } from "react";
import Image from "next/image";
import Link from "next/link";
import { ArrowLeft, Star, Loader2, Film } from "lucide-react";
import { tmdb, IMG, title, year, rating, type Media } from "@/lib/tmdb";

export default function BrowseClient({ type }: { type: "movie" | "tv" }) {
  const [items, setItems] = useState<Media[]>([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    async function load() {
      try {
        const [trending, popular, topRated] = await Promise.allSettled([
          type === "movie" ? tmdb.trendingMovies() : tmdb.trendingTV(),
          tmdb.popular(type),
          tmdb.topRated(type),
        ]);
        const v = (r: PromiseSettledResult<{ results: Media[] }>) =>
          r.status === "fulfilled" ? r.value.results : [];
        const all = [...v(trending), ...v(popular), ...v(topRated)];
        const unique = all.filter((m, i, s) => s.findIndex(x => x.id === m.id) === i && m.poster_path);
        setItems(unique.sort((a, b) => b.vote_average - a.vote_average));
      } finally { setLoading(false); }
    }
    load();
  }, [type]);

  const label = type === "movie" ? "Movies" : "TV Shows";

  return (
    <div className="min-h-screen bg-zinc-950">
      <div className="sticky top-0 z-40 bg-zinc-950/95 backdrop-blur-sm border-b border-zinc-900 px-4 sm:px-8 py-4 flex items-center gap-4">
        <Link href="/" className="p-2 rounded-lg text-zinc-500 hover:text-white hover:bg-zinc-800 transition-colors">
          <ArrowLeft className="w-4 h-4" />
        </Link>
        <h1 className="font-black text-xl text-white">{label}</h1>
        {!loading && <span className="text-zinc-500 text-sm">{items.length} titles</span>}
      </div>
      {loading ? (
        <div className="flex items-center justify-center py-24">
          <Loader2 className="w-8 h-8 text-zinc-600 animate-spin" />
        </div>
      ) : (
        <div className="px-4 sm:px-8 py-6 grid grid-cols-2 sm:grid-cols-3 md:grid-cols-4 lg:grid-cols-5 xl:grid-cols-6 2xl:grid-cols-7 gap-4">
          {items.map((item, i) => {
            const t = title(item);
            return (
              <Link key={item.id} href={`/${type}/${item.id}`} className="group">
                <div className="relative aspect-[2/3] rounded-xl overflow-hidden bg-zinc-800">
                  {item.poster_path ? (
                    <Image src={IMG(item.poster_path, "w342")} alt={t} fill
                      sizes="(max-width: 640px) 50vw, (max-width: 1024px) 33vw, 200px"
                      className="object-cover group-hover:scale-105 transition-transform duration-500"
                      priority={i < 14} />
                  ) : (
                    <div className="absolute inset-0 flex items-center justify-center">
                      <Film className="w-8 h-8 text-zinc-600" />
                    </div>
                  )}
                  {item.vote_average > 0 && (
                    <div className="absolute top-2 left-2 flex items-center gap-1 bg-black/70 rounded px-1.5 py-0.5">
                      <Star className="w-2.5 h-2.5 text-yellow-400 fill-yellow-400" />
                      <span className="text-xs font-bold text-white">{rating(item.vote_average)}</span>
                    </div>
                  )}
                </div>
                <p className="mt-2 text-sm text-zinc-400 group-hover:text-white transition-colors line-clamp-2 leading-snug">{t}</p>
                <p className="text-xs text-zinc-600 mt-0.5">{year(item)}</p>
              </Link>
            );
          })}
        </div>
      )}
    </div>
  );
}
