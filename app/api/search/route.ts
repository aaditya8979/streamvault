// Optional server-side search proxy (not required - client can search directly)
import { NextRequest, NextResponse } from "next/server";

export async function GET(req: NextRequest) {
  const q = req.nextUrl.searchParams.get("q");
  if (!q) return NextResponse.json({ results: [] });
  const key = process.env.NEXT_PUBLIC_TMDB_KEY;
  const res = await fetch(
    `https://api.themoviedb.org/3/search/multi?api_key=${key}&query=${encodeURIComponent(q)}&include_adult=false`
  );
  const data = await res.json();
  return NextResponse.json(data);
}
