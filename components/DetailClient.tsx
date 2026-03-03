"use client";
import { useState, useEffect } from "react";
import Image from "next/image";
import Link from "next/link";
import { Play, Star, Clock, Calendar, ChevronRight, ArrowLeft, Loader2, Users, Film, Tv } from "lucide-react";
import { tmdb, IMG, rating, runtime, type MovieDetail, type TVDetail, type Media } from "@/lib/tmdb";
import clsx from "clsx";

function MediaCardSmall({ item, type }: { item: Media; type: "movie" | "tv" }) {
  const t = item.title ?? item.name ?? "";
  const mediaType = item.media_type ?? type;
  return (
    <Link href={`/${mediaType}/${item.id}`} className="flex-shrink-0 w-28 sm:w-36 group">
      <div className="relative aspect-[2/3] rounded-lg overflow-hidden bg-zinc-800">
        {item.poster_path
          ? <Image src={IMG(item.poster_path, "w342")} alt={t} fill sizes="144px" className="object-cover group-hover:scale-105 transition-transform duration-500" />
          : <div className="absolute inset-0 flex items-center justify-center"><Film className="w-6 h-6 text-zinc-600" /></div>
        }
        {item.vote_average > 0 && (
          <div className="absolute top-1.5 left-1.5 bg-black/70 rounded px-1 py-0.5 text-xs text-yellow-400 font-bold">
            ★{rating(item.vote_average)}
          </div>
        )}
      </div>
      <p className="mt-1.5 text-xs text-zinc-400 group-hover:text-white transition-colors line-clamp-2 leading-snug">{t}</p>
    </Link>
  );
}

export default function DetailClient({ type, id }: { type: "movie" | "tv"; id: number }) {
  const [movie, setMovie] = useState<MovieDetail | null>(null);
  const [show, setShow] = useState<TVDetail | null>(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  useEffect(() => {
    setLoading(true);
    setError("");
    const p = type === "movie" ? tmdb.movie(id) : tmdb.tv(id);
    (p as Promise<MovieDetail | TVDetail>)
      .then(data => {
        if (type === "movie") setMovie(data as MovieDetail);
        else setShow(data as TVDetail);
      })
      .catch(e => setError(e.message))
      .finally(() => setLoading(false));
  }, [type, id]);

  if (loading) return (
    <div className="min-h-screen flex items-center justify-center">
      <Loader2 className="w-10 h-10 text-zinc-600 animate-spin" />
    </div>
  );
  if (error) return (
    <div className="min-h-screen flex flex-col items-center justify-center gap-4 text-center px-4">
      <p className="text-zinc-400">Failed to load: {error}</p>
      <p className="text-sm text-zinc-600">Make sure NEXT_PUBLIC_TMDB_KEY is set in .env.local</p>
      <Link href="/" className="px-4 py-2 bg-red-600 text-white rounded-lg text-sm">Go Home</Link>
    </div>
  );

  const data = type === "movie" ? movie! : show!;
  const titleStr = type === "movie" ? movie!.title : show!.name;
  const backdropPath = data.backdrop_path;
  const posterPath = data.poster_path;
  const overview = data.overview;
  const voteAvg = data.vote_average;
  const genres = data.genres;
  const director = data.credits.crew.find(c => c.job === "Director");
  const cast = data.credits.cast.slice(0, 10);
  const trailer = data.videos.results.find(v => v.type === "Trailer" && v.site === "YouTube");
  const recommendations = data.recommendations.results.filter(r => r.poster_path).slice(0, 15);

  const watchLink = type === "movie"
    ? `/watch/movie/${id}`
    : `/watch/tv/${id}?s=1&e=1`;

  return (
    <div className="min-h-screen bg-zinc-950">
      {/* Back */}
      <div className="fixed top-4 left-4 z-50">
        <Link href="/" className="flex items-center gap-1.5 px-3 py-2 bg-zinc-900/90 backdrop-blur-sm border border-zinc-800 text-zinc-400 hover:text-white rounded-xl text-sm transition-colors">
          <ArrowLeft className="w-4 h-4" /> Back
        </Link>
      </div>

      {/* Backdrop */}
      <div className="relative h-[50vh] min-h-[360px] overflow-hidden">
        {backdropPath ? (
          <Image src={IMG(backdropPath, "original")} alt={titleStr} fill className="object-cover object-top" priority sizes="100vw" />
        ) : <div className="absolute inset-0 bg-zinc-900" />}
        <div className="absolute inset-0 bg-gradient-to-t from-zinc-950 via-zinc-950/40 to-transparent" />
        <div className="absolute inset-0 bg-gradient-to-r from-zinc-950/80 to-transparent" />
      </div>

      {/* Content */}
      <div className="relative -mt-48 px-4 sm:px-8 lg:px-16 max-w-screen-xl mx-auto pb-20">
        <div className="flex flex-col md:flex-row gap-8">
          {/* Poster */}
          <div className="flex-shrink-0 w-44 sm:w-56 lg:w-64 mx-auto md:mx-0">
            <div className="relative aspect-[2/3] rounded-2xl overflow-hidden shadow-2xl border border-zinc-800">
              {posterPath
                ? <Image src={IMG(posterPath, "w500")} alt={titleStr} fill className="object-cover" priority sizes="256px" />
                : <div className="absolute inset-0 bg-zinc-800 flex items-center justify-center"><Film className="w-12 h-12 text-zinc-600" /></div>
              }
            </div>
          </div>

          {/* Info */}
          <div className="flex-1 pt-2 md:pt-36">
            <div className="flex flex-wrap gap-2 mb-3">
              {genres.map(g => (
                <span key={g.id} className="px-2.5 py-1 bg-zinc-800 text-zinc-400 text-xs rounded-lg border border-zinc-700">{g.name}</span>
              ))}
            </div>
            <h1 className="font-black text-3xl sm:text-4xl lg:text-5xl text-white leading-tight mb-2">{titleStr}</h1>

            <div className="flex flex-wrap items-center gap-4 mb-4 text-sm">
              {voteAvg > 0 && (
                <span className="flex items-center gap-1.5 text-yellow-400 font-bold">
                  <Star className="w-4 h-4 fill-current" />{rating(voteAvg)}
                </span>
              )}
              {type === "movie" && movie?.runtime && (
                <span className="flex items-center gap-1.5 text-zinc-400">
                  <Clock className="w-4 h-4" />{runtime(movie.runtime)}
                </span>
              )}
              {type === "tv" && show && (
                <span className="flex items-center gap-1.5 text-zinc-400">
                  <Tv className="w-4 h-4" />{show.number_of_seasons} Season{show.number_of_seasons !== 1 ? "s" : ""}
                </span>
              )}
              {(type === "movie" ? movie!.release_date : show!.first_air_date) && (
                <span className="flex items-center gap-1.5 text-zinc-400">
                  <Calendar className="w-4 h-4" />
                  {new Date(type === "movie" ? movie!.release_date : show!.first_air_date).getFullYear()}
                </span>
              )}
              {type === "tv" && show && (
                <span className={clsx("px-2 py-0.5 rounded text-xs font-semibold",
                  show.status === "Returning Series" ? "bg-emerald-500/20 text-emerald-400 border border-emerald-500/20" : "bg-zinc-800 text-zinc-400")}>
                  {show.status}
                </span>
              )}
            </div>

            <div className="flex flex-wrap gap-3 mb-6">
              <Link href={watchLink}
                className="inline-flex items-center gap-2 px-7 py-3 bg-white text-black rounded-xl font-bold text-sm hover:bg-zinc-200 active:scale-95 transition-all shadow-lg">
                <Play className="w-4 h-4 fill-current" /> {type === "movie" ? "Watch Now" : "Watch S1E1"}
              </Link>
              {trailer && (
                <a href={`https://youtube.com/watch?v=${trailer.key}`} target="_blank" rel="noopener noreferrer"
                  className="inline-flex items-center gap-2 px-5 py-3 bg-zinc-800 text-white rounded-xl font-medium text-sm hover:bg-zinc-700 transition-colors border border-zinc-700">
                  ▶ Trailer
                </a>
              )}
            </div>

            {overview && <p className="text-zinc-300 text-sm leading-relaxed max-w-2xl">{overview}</p>}
            {director && <p className="text-sm text-zinc-500 mt-3">Director: <span className="text-zinc-300">{director.name}</span></p>}
          </div>
        </div>

        {/* TV Seasons quick links */}
        {type === "tv" && show && show.seasons.filter(s => s.season_number > 0).length > 0 && (
          <section className="mt-12">
            <h2 className="font-bold text-lg text-white mb-4">Seasons</h2>
            <div className="flex flex-wrap gap-2">
              {show.seasons.filter(s => s.season_number > 0).map(s => (
                <Link key={s.id} href={`/watch/tv/${id}?s=${s.season_number}&e=1`}
                  className="flex items-center gap-2 px-4 py-2 bg-zinc-800 hover:bg-zinc-700 border border-zinc-700 text-white rounded-xl text-sm font-medium transition-colors">
                  Season {s.season_number}
                  <span className="text-zinc-500 text-xs">{s.episode_count}ep</span>
                  <ChevronRight className="w-3.5 h-3.5 text-zinc-500" />
                </Link>
              ))}
            </div>
          </section>
        )}

        {/* Cast */}
        {cast.length > 0 && (
          <section className="mt-12">
            <h2 className="font-bold text-lg text-white mb-4 flex items-center gap-2">
              <Users className="w-5 h-5 text-zinc-500" /> Cast
            </h2>
            <div className="flex gap-3 overflow-x-auto hide-scrollbar pb-2">
              {cast.map(m => (
                <div key={m.id} className="flex-shrink-0 w-20 text-center">
                  <div className="relative w-16 h-16 mx-auto rounded-full overflow-hidden bg-zinc-800 border border-zinc-700">
                    {m.profile_path
                      ? <Image src={IMG(m.profile_path, "w185")} alt={m.name} fill className="object-cover" sizes="64px" />
                      : <div className="absolute inset-0 flex items-center justify-center text-zinc-500 text-lg font-bold">{m.name[0]}</div>
                    }
                  </div>
                  <p className="text-xs font-medium text-zinc-300 mt-1.5 line-clamp-2 leading-tight">{m.name}</p>
                  <p className="text-xs text-zinc-600 line-clamp-1">{m.character}</p>
                </div>
              ))}
            </div>
          </section>
        )}

        {/* Recommendations */}
        {recommendations.length > 0 && (
          <section className="mt-12">
            <h2 className="font-bold text-lg text-white mb-4">More Like This</h2>
            <div className="flex gap-3 overflow-x-auto hide-scrollbar pb-2">
              {recommendations.map(r => <MediaCardSmall key={r.id} item={r} type={type} />)}
            </div>
          </section>
        )}
      </div>
    </div>
  );
}
