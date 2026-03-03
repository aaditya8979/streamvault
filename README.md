# StreamVault v3

🎬 Movies & TV streaming platform — Next.js 15, 100% client-side TMDB fetching, iframe embed players.

## Why v3 is different

| Old approach (v1/v2) | New approach (v3) |
|---|---|
| Server-side TMDB fetch → timeout errors | Client-side TMDB fetch → zero server timeouts |
| HLS.js + Consumet → complex, often fails | Iframe embeds → always works, 4 providers |
| AbortController conflicts with Next.js | No AbortController anywhere |
| 33 files, complex | 14 files, clean |

## Setup (1 minute)

**1. Get a free TMDB API key:**
→ [themoviedb.org/settings/api](https://www.themoviedb.org/settings/api) → Developer → copy "API Key (v3 auth)"

**2. Create `.env.local`:**
```
NEXT_PUBLIC_TMDB_KEY=paste_your_key_here
```

**3. Run:**
```bash
npm install
npm run dev
```

Open http://localhost:3000 ✅

## Deploy to Vercel

```bash
vercel
```
Add `NEXT_PUBLIC_TMDB_KEY` in Vercel → Project → Settings → Environment Variables.

## How streaming works

The app uses 4 embed providers. If Server 1 doesn't work, click Server 2, 3, or 4:

| Server | Provider | URL Pattern |
|---|---|---|
| Server 1 | vidsrc.xyz | vidsrc.xyz/embed/movie?tmdb=ID |
| Server 2 | 2embed.cc | 2embed.cc/embed/ID |
| Server 3 | embed.su | embed.su/embed/movie/ID |
| Server 4 | smashy.stream | player.smashy.stream/movie/ID |

## Features

- 🏠 Homepage with hero carousel + 7 content rows
- 🎬 Movie detail pages with cast, trailer link, recommendations
- 📺 TV show pages with season list and episode browser
- 🔍 Real-time search (⌘K)
- ▶️ 4 streaming server fallback
- 📱 Fully responsive
- ⚡ Instant loading (client-side fetching, no server bottlenecks)
