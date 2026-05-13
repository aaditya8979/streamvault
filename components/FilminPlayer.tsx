"use client";
import { useState, useEffect, useRef, useCallback } from "react";
import Hls from "hls.js";

/* ── Compact SVG icons ───────────────────────────────────────────────── */
const I = ({ d, s = 18 }: { d: string; s?: number }) => (
  <svg width={s} height={s} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth={2.5} strokeLinecap="round" strokeLinejoin="round"><path d={d} /></svg>
);
const FI = ({ d, s = 18 }: { d: string; s?: number }) => (
  <svg width={s} height={s} viewBox="0 0 24 24" fill="currentColor"><path d={d} /></svg>
);

/* ── Types ────────────────────────────────────────────────────────────── */
interface AudioOption { type: number; type_name: string }
interface SubtitleTrack { lang: string; label: string; url: string }
interface EmbeddedTrack { index: number; lang: string; label: string; codec?: string }
interface EmbeddedTracks { audio: EmbeddedTrack[]; subtitles: { index: number; lang: string; label: string }[] }
interface Props {
  streamUrl: string;
  title: string;
  mediaId?: string;
  audioOptions?: AudioOption[];
  currentAudioType?: number;
  onAudioChange?: (t: number) => void;
  subtitleTracks?: SubtitleTrack[];
  onNext?: () => void;
  poster?: string;
  embeddedTracks?: EmbeddedTracks;
}

const fmt = (s: number) => {
  if (!isFinite(s) || s < 0) return "0:00";
  const h = Math.floor(s / 3600), m = Math.floor((s % 3600) / 60), sec = Math.floor(s % 60);
  return h > 0 ? `${h}:${String(m).padStart(2, "0")}:${String(sec).padStart(2, "0")}` : `${m}:${String(sec).padStart(2, "0")}`;
};

export default function FilminPlayer({ streamUrl, title, mediaId, audioOptions, currentAudioType, onAudioChange, subtitleTracks, onNext, poster, embeddedTracks }: Props) {
  const vRef = useRef<HTMLVideoElement>(null);
  const wRef = useRef<HTMLDivElement>(null);
  const hlsRef = useRef<Hls | null>(null);
  const hideTimer = useRef<ReturnType<typeof setTimeout>>(undefined);

  const [playing, setPlaying] = useState(false);
  const [time, setTime] = useState(0);
  const [dur, setDur] = useState(0);
  const [buf, setBuf] = useState(0);
  const [vol, setVol] = useState(1);
  const [muted, setMuted] = useState(false);
  const [full] = useState(false);
  const [loading, setLoading] = useState(true);
  const [err, setErr] = useState<string | null>(null);
  const [ui, setUi] = useState(true);
  const [menu, setMenu] = useState<"a" | "s" | "q" | null>(null);
  const [levels, setLevels] = useState<{ h: number; b: number }[]>([]);
  const [lvl, setLvl] = useState(-1);
  const [sub, setSub] = useState<string | null>(null);
  const [mp4Audio, setMp4Audio] = useState<{i:number;lang:string;label:string}[]>([]);
  const [mp4AudioIdx, setMp4AudioIdx] = useState(0);
  const [mp4Subs, setMp4Subs] = useState<{i:number;lang:string;label:string}[]>([]);
  const [probing, setProbing] = useState(false);
  const [brightness, setBrightness] = useState(100);
  const [gesture, setGesture] = useState<{ type: "v" | "b", val: number } | null>(null);
  const gestTimer = useRef<ReturnType<typeof setTimeout> | null>(null);
  const touchStart = useRef<{ x: number, y: number, v: number, b: number } | null>(null);
  const saveTimer = useRef<ReturnType<typeof setTimeout> | null>(null);
  const resumeKey = mediaId ? `sv_resume_${mediaId}` : null;
  
  const LANGS: Record<string,string> = {hin:"Hindi",eng:"English",en:"English",kor:"Korean",ko:"Korean",spa:"Spanish",es:"Spanish",fra:"French",fr:"French",jpn:"Japanese",ja:"Japanese",zho:"Chinese",zh:"Chinese",ara:"Arabic",por:"Portuguese",deu:"German",de:"German",ita:"Italian",it:"Italian",rus:"Russian",ru:"Russian",tam:"Tamil",tel:"Telugu",mal:"Malayalam",ben:"Bengali",kan:"Kannada",mar:"Marathi",und:"Unknown"};

  /* ── Controls visibility ───────────────────────────────────── */
  const flash = useCallback(() => {
    setUi(true);
    if (hideTimer.current) clearTimeout(hideTimer.current);
    hideTimer.current = setTimeout(() => { if (vRef.current && !vRef.current.paused) setUi(false); }, 3000);
  }, []);

  const safePlay = (v: HTMLVideoElement) => {
    const p = v.play();
    if (p !== undefined) p.catch(e => {
      if (e.name !== "AbortError") console.warn("Playback error:", e);
    });
  };

  useEffect(() => {
    if (!playing) { setUi(true); if (hideTimer.current) clearTimeout(hideTimer.current); } else flash();
    return () => { if (hideTimer.current) clearTimeout(hideTimer.current); };
  }, [playing, flash]);

  /* ── Stream setup ──────────────────────────────────────────── */
  useEffect(() => {
    const v = vRef.current;
    if (!v || !streamUrl) return;
    setLoading(true); setErr(null);

    const isMP4 = streamUrl.includes(".mp4") || streamUrl.includes("resource.mp4") || (streamUrl.includes("/api/filmin/hls") && decodeURIComponent(streamUrl).includes(".mp4"));
    if (isMP4) {
      v.src = streamUrl;
      const ok = () => {
        setLoading(false);
        // Auto-resume: restore saved position
        if (resumeKey) {
          try {
            const raw = localStorage.getItem(resumeKey);
            if (raw) {
              let pos = 0;
              try { pos = JSON.parse(raw).time; } catch { pos = parseFloat(raw); }
              if (pos > 5 && pos < v.duration - 30) {
                v.currentTime = pos;
                console.log(`[Resume] Restored to ${Math.floor(pos)}s`);
              }
            }
          } catch {}
        }
        safePlay(v);
      };
      const fail = () => { 
        console.warn("[FilminPlayer] MP4 load failed.");
        setErr("Video failed to load"); 
        setLoading(false); 
      };
      v.addEventListener("loadedmetadata", ok);
      v.addEventListener("error", fail);
      return () => { v.removeEventListener("loadedmetadata", ok); v.removeEventListener("error", fail); v.src = ""; };
    }
    if (Hls.isSupported()) {
      const hls = new Hls({ enableWorker: true, maxBufferLength: 30, maxMaxBufferLength: 60, startLevel: -1 });
      hlsRef.current = hls;
      hls.loadSource(streamUrl);
      hls.attachMedia(v);
      hls.on(Hls.Events.MANIFEST_PARSED, (_, d) => { setLevels(d.levels.map(l => ({ h: l.height, b: l.bitrate }))); setLoading(false); safePlay(v); });
      hls.on(Hls.Events.AUDIO_TRACKS_UPDATED, (_, d) => {
        setMp4Audio(current => {
          if (current.length > 0) return current;
          return d.audioTracks.map((t, i) => ({
            i, 
            lang: t.lang || "und", 
            label: t.name || (t.lang ? LANGS[t.lang as keyof typeof LANGS] : null) || `Track ${i+1}`
          }));
        });
      });
      hls.on(Hls.Events.LEVEL_SWITCHED, (_, d) => setLvl(d.level));
      hls.on(Hls.Events.ERROR, (_, d) => { if (d.fatal) { if (d.type === Hls.ErrorTypes.NETWORK_ERROR) hls.startLoad(); else if (d.type === Hls.ErrorTypes.MEDIA_ERROR) hls.recoverMediaError(); else { setErr("Stream failed"); setLoading(false); } } });
      return () => { hls.destroy(); hlsRef.current = null; };
    } else if (v.canPlayType("application/vnd.apple.mpegurl")) {
      v.src = streamUrl;
      v.addEventListener("loadedmetadata", () => { setLoading(false); safePlay(v); });
      return () => { v.src = ""; };
    }
    setErr("HLS not supported"); setLoading(false);
  // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [streamUrl]);

  /* ── Video events ──────────────────────────────────────────── */
  useEffect(() => {
    const v = vRef.current; if (!v) return;
    const h = {
      play: () => setPlaying(true), pause: () => setPlaying(false),
      timeupdate: () => setTime(v.currentTime), durationchange: () => setDur(v.duration),
      waiting: () => setLoading(true), canplay: () => setLoading(false),
      progress: () => { if (v.buffered.length > 0) setBuf(v.buffered.end(v.buffered.length - 1)); },
      ended: () => { setPlaying(false); onNext?.(); },
    };
    Object.entries(h).forEach(([e, f]) => v.addEventListener(e, f));
    return () => { Object.entries(h).forEach(([e, f]) => v.removeEventListener(e, f)); };
  }, [onNext]);

  /* ── Use server-provided embedded tracks ── */
  useEffect(() => {
    if (embeddedTracks && (embeddedTracks.audio.length > 0 || embeddedTracks.subtitles.length > 0)) {
      const audio = (embeddedTracks.audio || []).map((t, i) => ({
        i, lang: t.lang, label: t.label || LANGS[t.lang] || `Track ${i+1} (${t.lang})`
      }));
      setMp4Audio(audio);
      const subs = (embeddedTracks.subtitles || []).map((t, i) => ({
        i, lang: t.lang, label: t.label || LANGS[t.lang] || `Sub ${i+1} (${t.lang})`
      }));
      setMp4Subs(subs);
      setProbing(false);

      // AUTO-SELECT HINDI: Root Fix for your specific requirement
      const hindiIdx = audio.findIndex(t => t.lang === 'hin' || t.label.toLowerCase().includes('hindi'));
      if (hindiIdx !== -1 && mp4AudioIdx === 0) {
        console.log(`[FilminPlayer] Auto-selecting Hindi at index ${hindiIdx}`);
        setMp4AudioIdx(hindiIdx);
        if (hlsRef.current) hlsRef.current.audioTrack = hindiIdx;
      }
    }
  // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [embeddedTracks]);

  /* ── Handle touch gestures ── */
  const handleTouch = (e: React.TouchEvent) => {
    const v = vRef.current; if (!v) return;
    const t = e.touches[0];
    const rect = v.getBoundingClientRect();
    const x = t.clientX - rect.left;
    const y = t.clientY - rect.top;
    
    if (e.type === "touchstart") {
      touchStart.current = { x, y, v: v.volume, b: brightness };
      setUi(true);
    } else if (e.type === "touchmove" && touchStart.current) {
      const dy = (touchStart.current.y - y) / rect.height * 100;
      const isLeft = touchStart.current.x < rect.width / 2;
      
      if (isLeft) {
        const newVol = Math.max(0, Math.min(1, touchStart.current.v + (dy / 100)));
        v.volume = newVol;
        setVol(newVol);
        setMuted(newVol === 0);
        setGesture({ type: "v", val: Math.round(newVol * 100) });
      } else {
        const newBri = Math.max(10, Math.min(100, touchStart.current.b + dy));
        setBrightness(newBri);
        setGesture({ type: "b", val: Math.round(newBri) });
      }
      if (gestTimer.current) clearTimeout(gestTimer.current);
      gestTimer.current = setTimeout(() => setGesture(null), 1000);
    }
  };

  /* ── Hook into Safari's native audioTracks API ── */
  useEffect(() => {
    const v = vRef.current;
    if (!v || mp4Audio.length < 2) return;
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    const vAny = v as any;
    const syncTracks = () => {
      const at = vAny.audioTracks;
      if (at && at.length > 1) { for (let j = 0; j < at.length; j++) at[j].enabled = (j === mp4AudioIdx); }
      if (hlsRef.current && hlsRef.current.audioTracks.length > 1) { if (hlsRef.current.audioTrack !== mp4AudioIdx) hlsRef.current.audioTrack = mp4AudioIdx; }
    };
    syncTracks();
    const handler = () => syncTracks();
    if (vAny.audioTracks) {
      vAny.audioTracks.addEventListener?.('addtrack', handler);
      vAny.audioTracks.addEventListener?.('change', handler);
    }
    v.addEventListener('loadedmetadata', syncTracks);
    v.addEventListener('canplay', syncTracks);
    return () => {
      if (vAny.audioTracks) {
        vAny.audioTracks.removeEventListener?.('addtrack', handler);
        vAny.audioTracks.removeEventListener?.('change', handler);
      }
      v.removeEventListener('loadedmetadata', syncTracks);
      v.removeEventListener('canplay', syncTracks);
    };
  }, [mp4Audio, mp4AudioIdx]);

  /* ── Auto-save position every 5s ─────────────────────────── */
  useEffect(() => {
    if (!resumeKey) return;
    saveTimer.current = setInterval(() => {
      const v = vRef.current;
      if (v && v.currentTime > 5 && !v.paused) {
        try { 
          localStorage.setItem(resumeKey, JSON.stringify({
            time: v.currentTime,
            updated: Date.now()
          })); 
        } catch {}
      }
    }, 5000);
    return () => { if (saveTimer.current) clearInterval(saveTimer.current); };
  }, [resumeKey]);

  /* ── Keyboard ──────────────────────────────────────────────── */
  useEffect(() => {
    const fn = (e: KeyboardEvent) => {
      if (["INPUT", "TEXTAREA"].includes((e.target as HTMLElement).tagName)) return;
      const v = vRef.current; if (!v) return;
      switch (e.key) {
        case " ": case "k": e.preventDefault(); if (v.paused) { safePlay(v); } else { v.pause(); } flash(); break;
        case "f": e.preventDefault(); toggleFs(); break;
        case "m": e.preventDefault(); v.muted = !v.muted; setMuted(v.muted); flash(); break;
        case "ArrowLeft": e.preventDefault(); v.currentTime = Math.max(0, v.currentTime - 10); flash(); break;
        case "ArrowRight": e.preventDefault(); v.currentTime = Math.min(v.duration, v.currentTime + 10); flash(); break;
        case "ArrowUp": e.preventDefault(); { const nv = Math.min(1, v.volume + 0.05); v.volume = nv; setVol(nv); } flash(); break;
        case "ArrowDown": e.preventDefault(); { const nv = Math.max(0, v.volume - 0.05); v.volume = nv; setVol(nv); } flash(); break;
      }
    };
    document.addEventListener("keydown", fn);
    return () => document.removeEventListener("keydown", fn);
  // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [flash]);

  /* ── Fullscreen ────────────────────────────────────────────── */
  const toggleFs = useCallback(async () => {
    const el = wRef.current; if (!el) return;
    if (!document.fullscreenElement) { try { await el.requestFullscreen(); } catch {} } else { try { await document.exitFullscreen(); } catch {} }
  }, []);

  const pct = dur > 0 ? (time / dur) * 100 : 0;
  const bufPct = dur > 0 ? (buf / dur) * 100 : 0;
  const B: React.CSSProperties = { background: "none", border: "none", color: "rgba(255,255,255,0.85)", cursor: "pointer", padding: "6px", borderRadius: 6, display: "inline-flex", alignItems: "center", justifyContent: "center", gap: 4, fontSize: 11, fontWeight: 600, minWidth: 32, minHeight: 32, transition: "background 0.2s" };
  const BA: React.CSSProperties = { ...B, background: "rgba(229,9,20,0.2)", color: "#f87171" };

  const rootStyle: React.CSSProperties = full
    ? { position: "fixed", inset: 0, zIndex: 9999, width: "100%", height: "100%", background: "#000", userSelect: "none", fontFamily: "Inter,sans-serif" }
    : { position: "relative", width: "100%", background: "#000", aspectRatio: "16/9", overflow: "hidden", userSelect: "none", fontFamily: "Inter,sans-serif", borderRadius: 12, boxShadow: "0 20px 50px rgba(0,0,0,0.5)" };

  return (
    <div ref={wRef} style={rootStyle} onMouseMove={flash} onTouchStart={handleTouch} onTouchMove={handleTouch} onTouchEnd={() => touchStart.current = null}
      onClick={(e) => { if (!(e.target as HTMLElement).closest("[data-p]")) { const v = vRef.current; if (v) { if (v.paused) { v.play(); } else { v.pause(); } } flash(); } }}
      onDoubleClick={(e) => { if (!(e.target as HTMLElement).closest("[data-p]")) toggleFs(); }}>

      <style>{`
        @keyframes spin{to{transform:rotate(360deg)}}
        input[type=range]::-webkit-slider-thumb { -webkit-appearance: none; height: 12px; width: 12px; border-radius: 50%; background: #e50914; cursor: pointer; border: 2px solid white; box-shadow: 0 0 5px rgba(0,0,0,0.5); }
        .menu-item:hover { background: rgba(255,255,255,0.05) !important; }
      `}</style>

      <video ref={vRef} style={{ position: "absolute", inset: 0, width: "100%", height: "100%" }} playsInline poster={poster}>
        {subtitleTracks?.map(st => <track key={st.lang} kind="subtitles" src={st.url} srcLang={st.lang} label={st.label} />)}
      </video>

      {/* Brightness Overlay */}
      <div style={{ position: "absolute", inset: 0, background: "#000", opacity: (100 - brightness) / 100, pointerEvents: "none", zIndex: 1 }} />

      {/* Gesture Feedback */}
      {gesture && (
        <div style={{ position: "absolute", top: "50%", left: "50%", transform: "translate(-50%, -50%)", zIndex: 100, pointerEvents: "none" }}>
          <div style={{ background: "rgba(15,15,15,0.8)", backdropFilter: "blur(24px)", border: "1px solid rgba(255,255,255,0.12)", borderRadius: "28px", padding: "24px 32px", display: "flex", flexDirection: "column", alignItems: "center", gap: 16, boxShadow: "0 25px 70px rgba(0,0,0,0.7)", minWidth: 140 }}>
            <div style={{ padding: 12, background: "rgba(255,255,255,0.05)", borderRadius: "50%" }}>
              {gesture.type === "v" ? (
                <svg width={32} height={32} viewBox="0 0 24 24" fill="none" stroke="white" strokeWidth={2}><path d="M11 5L6 9H2v6h4l5 4V5z"/><path d="M19.07 4.93a10 10 0 0 1 0 14.14M15.54 8.46a5 5 0 0 1 0 7.07"/></svg>
              ) : (
                <svg width={32} height={32} viewBox="0 0 24 24" fill="none" stroke="white" strokeWidth={2}><circle cx="12" cy="12" r="5"/><path d="M12 1v2M12 21v2M4.22 4.22l1.42 1.42M18.36 18.36l1.42 1.42M1 12h2M21 12h2M4.22 19.78l1.42-1.42M18.36 5.64l1.42-1.42"/></svg>
              )}
            </div>
            <div style={{ fontSize: 24, fontWeight: 900, color: "white", letterSpacing: -1 }}>{gesture.val}%</div>
            <div style={{ width: 100, height: 4, background: "rgba(255,255,255,0.1)", borderRadius: 2, overflow: "hidden" }}>
              <div style={{ width: `${gesture.val}%`, height: "100%", background: "#e50914", boxShadow: "0 0 10px #e50914" }} />
            </div>
          </div>
        </div>
      )}

      {/* Spinner */}
      {(loading || probing) && !err && (
        <div style={{ position: "absolute", inset: 0, display: "flex", alignItems: "center", justifyContent: "center", zIndex: 8, pointerEvents: "none", background: probing ? "rgba(0,0,0,0.2)" : "transparent" }}>
          <div style={{ display: "flex", flexDirection: "column", alignItems: "center", gap: 12 }}>
            <svg width={40} height={40} viewBox="0 0 24 24" fill="none" stroke="white" strokeWidth={2} style={{ animation: "spin 1s linear infinite", filter: "drop-shadow(0 0 8px rgba(0,0,0,0.5))" }}><path d="M21 12a9 9 0 11-6.219-8.56" /></svg>
            {probing && <span style={{ color: "white", fontSize: 11, fontWeight: 600, textShadow: "0 2px 4px rgba(0,0,0,0.5)" }}>Discovering Tracks...</span>}
          </div>
        </div>
      )}

      {/* Error */}
      {err && (
        <div style={{ position: "absolute", inset: 0, display: "flex", flexDirection: "column", alignItems: "center", justifyContent: "center", zIndex: 8, background: "rgba(0,0,0,0.85)", gap: 16 }}>
          <div style={{ padding: 16, background: "rgba(229,9,20,0.1)", borderRadius: "50%" }}>
            <FI d="M12 9v2m0 4h.01m-6.938 4h13.856c1.54 0 2.502-1.667 1.732-3L13.732 4c-.77-1.333-2.694-1.333-3.464 0L3.34 16c-.77 1.333.192 3 1.732 3z" s={32} />
          </div>
          <span style={{ color: "#f87171", fontSize: 16, fontWeight: 700 }}>{err}</span>
          <button onClick={(e) => { e.stopPropagation(); setErr(null); setLoading(true); const v = vRef.current; if (v && v.src) { v.load(); } hlsRef.current?.startLoad(); }}
            style={{ ...B, border: "1px solid rgba(255,255,255,0.2)", padding: "10px 30px", borderRadius: 10, background: "rgba(255,255,255,0.1)", backdropFilter: "blur(10px)" }}>Retry Playback</button>
        </div>
      )}

      {/* Top Bar */}
      <div style={{ position: "absolute", top: 0, left: 0, right: 0, padding: 30, background: "linear-gradient(to bottom, rgba(0,0,0,0.8), transparent)", display: "flex", alignItems: "center", gap: 20, zIndex: 20, transform: ui ? "translateY(0)" : "translateY(-20px)", opacity: ui ? 1 : 0, transition: "all 0.4s cubic-bezier(0.4, 0, 0.2, 1)", pointerEvents: ui ? "auto" : "none" }}>
        <div style={{ flex: 1 }}>
          <div style={{ fontSize: 14, color: "rgba(255,255,255,0.5)", fontWeight: 600, letterSpacing: 1, textTransform: "uppercase", marginBottom: 4 }}>Now Playing</div>
          <div style={{ fontSize: 24, fontWeight: 800, color: "white", letterSpacing: -0.5 }}>{title}</div>
          <div style={{ display: "flex", gap: 10, marginTop: 10 }}>
            {mp4Audio.length > 1 && (
              <div style={{ background: "rgba(229,9,20,0.2)", color: "#f87171", padding: "4px 8px", borderRadius: 4, fontSize: 10, fontWeight: 800, border: "1px solid rgba(229,9,20,0.3)", display: "flex", alignItems: "center", gap: 5 }}>
                <svg width={12} height={12} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth={3}><path d="M12 1a3 3 0 0 0-3 3v8a3 3 0 0 0 6 0V4a3 3 0 0 0-3-3z"/><path d="M19 10v2a7 7 0 0 1-14 0v-2"/></svg>
                MULTI-AUDIO ({mp4Audio.length})
              </div>
            )}
            {mp4Subs.length > 0 && (
              <div style={{ background: "rgba(255,255,255,0.1)", color: "white", padding: "4px 8px", borderRadius: 4, fontSize: 10, fontWeight: 800, border: "1px solid rgba(255,255,255,0.1)" }}>
                SUBTITLES ({mp4Subs.length})
              </div>
            )}
            <div style={{ background: "rgba(255,255,255,0.1)", color: "white", padding: "4px 8px", borderRadius: 4, fontSize: 10, fontWeight: 800, border: "1px solid rgba(255,255,255,0.1)" }}>
              {streamUrl.includes(".m3u8") ? "HLS" : "MP4"}
            </div>
          </div>
        </div>
      </div>

      {/* Center play */}
      {!playing && !loading && !err && (
        <div style={{ position: "absolute", inset: 0, display: "flex", alignItems: "center", justifyContent: "center", zIndex: 8, pointerEvents: "none" }}>
          <button onClick={() => vRef.current && safePlay(vRef.current)} 
            style={{ width: 72, height: 72, borderRadius: "50%", background: "rgba(255,255,255,0.1)", backdropFilter: "blur(12px)", border: "1px solid rgba(255,255,255,0.25)", display: "flex", alignItems: "center", justifyContent: "center", paddingLeft: 6, boxShadow: "0 10px 30px rgba(0,0,0,0.3)", cursor: "pointer", pointerEvents: "auto" }}>
            <FI d="M8 5v14l11-7z" s={32} />
          </button>
        </div>
      )}

      {/* ── Controls ──────────────────────────────────────── */}
      <div data-p style={{ position: "absolute", inset: 0, zIndex: 10, display: "flex", flexDirection: "column", justifyContent: "flex-end", opacity: ui ? 1 : 0, transition: "opacity 0.4s cubic-bezier(0.4, 0, 0.2, 1)", pointerEvents: ui ? "auto" : "none" }}
        onClick={(e) => e.stopPropagation()}>
        {/* Gradient */}
        <div style={{ position: "absolute", inset: 0, background: "linear-gradient(0deg,rgba(0,0,0,0.9) 0%,rgba(0,0,0,0.4) 30%,transparent 70%)", pointerEvents: "none" }} />

        <div style={{ position: "relative", padding: "0 20px 16px", zIndex: 5 }}>
          {/* Title */}
          <div style={{ color: "rgba(255,255,255,0.8)", fontSize: 14, fontWeight: 700, marginBottom: 12, overflow: "hidden", textOverflow: "ellipsis", whiteSpace: "nowrap", textShadow: "0 2px 4px rgba(0,0,0,0.5)" }}>{title}</div>

          {/* Seek bar */}
          <div style={{ position: "relative", height: 20, marginBottom: 8, cursor: "pointer", display: "flex", alignItems: "center" }}>
            <div style={{ position: "absolute", left: 0, right: 0, height: 4, borderRadius: 2, background: "rgba(255,255,255,0.15)" }} />
            <div style={{ position: "absolute", left: 0, height: 4, borderRadius: 2, background: "rgba(255,255,255,0.2)", width: `${bufPct}%` }} />
            <div style={{ position: "absolute", left: 0, height: 4, borderRadius: 2, background: "#e50914", width: `${pct}%`, boxShadow: "0 0 10px rgba(229,9,20,0.5)" }} />
            <input type="range" min={0} max={dur || 1} step={0.5} value={time}
              onInput={(e) => { const v = vRef.current; if (v) v.currentTime = parseFloat((e.target as HTMLInputElement).value); }}
              onChange={() => {}} style={{ position: "absolute", inset: 0, width: "100%", height: "100%", opacity: 0, cursor: "pointer", margin: 0, zIndex: 3 }} />
            <div style={{ position: "absolute", left: `${pct}%`, top: "50%", transform: "translate(-50%,-50%)", width: 14, height: 14, borderRadius: "50%", background: "#e50914", border: "2px solid #fff", boxShadow: "0 0 8px rgba(0,0,0,0.5)", zIndex: 2, pointerEvents: "none" }} />
          </div>

          {/* Controls row */}
          <div style={{ display: "flex", alignItems: "center", gap: 10 }}>
            {/* Play */}
            <button style={B} onClick={() => { const v = vRef.current; if (v) { if (v.paused) { safePlay(v); } else { v.pause(); } } }}>
              {playing
                ? <svg width={18} height={18} viewBox="0 0 24 24" fill="currentColor"><rect x="6" y="4" width="4" height="16" rx="1"/><rect x="14" y="4" width="4" height="16" rx="1"/></svg>
                : <svg width={18} height={18} viewBox="0 0 24 24" fill="currentColor"><path d="M8 5v14l11-7z"/></svg>}
            </button>

            {/* -10s */}
            <button style={B} onClick={() => { const v = vRef.current; if (v) { v.currentTime = Math.max(0, v.currentTime - 10); flash(); } }}>
              <div style={{ position: "relative", display: "flex", alignItems: "center", justifyContent: "center" }}>
                <svg width={20} height={20} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth={2}><path d="M1 4v6h6M3.51 15a9 9 0 105.64-8.36L3 12" /></svg>
                <span style={{ position: "absolute", fontSize: 7, fontWeight: 900, top: 7 }}>10</span>
              </div>
            </button>

            {/* +10s */}
            <button style={B} onClick={() => { const v = vRef.current; if (v) { v.currentTime = Math.min(v.duration || 0, v.currentTime + 10); flash(); } }}>
              <div style={{ position: "relative", display: "flex", alignItems: "center", justifyContent: "center" }}>
                <svg width={20} height={20} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth={2}><path d="M23 4v6h-6M20.49 15a9 9 0 11-5.64-8.36L21 12" /></svg>
                <span style={{ position: "absolute", fontSize: 7, fontWeight: 900, top: 7 }}>10</span>
              </div>
            </button>

            {/* Volume */}
            <div style={{ display: "flex", alignItems: "center", gap: 4 }}>
              <button style={B} onClick={() => { const v = vRef.current; if (v) { v.muted = !muted; setMuted(!muted); } }}>
                {muted || vol === 0
                  ? <I d="M11 5L6 9H2v6h4l5 4V5zM23 9l-6 6M17 9l6 6" s={18} />
                  : <I d="M11 5L6 9H2v6h4l5 4V5zM15.54 8.46a5 5 0 010 7.07" s={18} />}
              </button>
              <input type="range" min={0} max={1} step={0.02} value={muted ? 0 : vol}
                onChange={(e) => { const n = parseFloat(e.target.value); setVol(n); if (vRef.current) vRef.current.volume = n; if (n > 0) setMuted(false); }}
                style={{ width: 70, height: 4, cursor: "pointer", accentColor: "#e50914", margin: 0 }} />
            </div>

            {/* Time */}
            <span style={{ color: "rgba(255,255,255,0.6)", fontSize: 12, fontWeight: 600, fontFamily: "monospace", marginLeft: 8 }}>{fmt(time)} <span style={{ opacity: 0.5 }}>/</span> {fmt(dur)}</span>

            <div style={{ flex: 1 }} />

            {/* Audio Track Menu */}
            <div style={{ position: "relative" }}>
              <button style={menu === "a" ? BA : B} onClick={() => setMenu(menu === "a" ? null : "a")}>
                <svg width={18} height={18} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth={2} strokeLinecap="round" strokeLinejoin="round"><path d="M12 1a3 3 0 0 0-3 3v8a3 3 0 0 0 6 0V4a3 3 0 0 0-3-3z"/><path d="M19 10v2a7 7 0 0 1-14 0v-2"/><line x1="12" y1="19" x2="12" y2="23"/><line x1="8" y1="23" x2="16" y2="23"/></svg>
                <span style={{ maxWidth: 80, overflow: "hidden", textOverflow: "ellipsis", whiteSpace: "nowrap" }}>
                  {mp4Audio.length > 0 ? (mp4Audio[mp4AudioIdx]?.label || "Audio") : (audioOptions?.find(a => a.type === currentAudioType)?.type_name || "Audio")}
                </span>
              </button>
              {menu === "a" && (
                <div style={{ position: "absolute", bottom: "100%", right: 0, marginBottom: 10, background: "rgba(15,15,15,0.9)", backdropFilter: "blur(20px)", border: "1px solid rgba(255,255,255,0.1)", borderRadius: 12, overflow: "hidden", minWidth: 160, boxShadow: "0 10px 40px rgba(0,0,0,0.8)" }}>
                  <div style={{ padding: "10px 14px", fontSize: 10, fontWeight: 800, color: "rgba(255,255,255,0.4)", textTransform: "uppercase", letterSpacing: 1.5, borderBottom: "1px solid rgba(255,255,255,0.08)" }}>Audio Selection</div>
                  
                  {/* API Options (Server Side) */}
                  {audioOptions && audioOptions.length > 0 && (
                    <div style={{ borderBottom: mp4Audio.length > 0 ? "1px solid rgba(255,255,255,0.08)" : "none" }}>
                      <div style={{ padding: "8px 14px 4px", fontSize: 9, color: "rgba(255,255,255,0.3)", fontWeight: 700 }}>AVAILABLE ON SERVER</div>
                      {audioOptions.map(o => (
                        <button key={o.type} className="menu-item"
                          style={{ width: "100%", padding: "10px 14px", border: "none", background: o.type === currentAudioType ? "rgba(229,9,20,0.15)" : "transparent", color: o.type === currentAudioType ? "#f87171" : "rgba(255,255,255,0.9)", cursor: "pointer", fontSize: 13, textAlign: "left", display: "flex", alignItems: "center", gap: 10, transition: "all 0.2s" }}
                          onClick={() => { onAudioChange?.(o.type); setMenu(null); }}>
                          <div style={{ width: 6, height: 6, borderRadius: "50%", background: o.type === currentAudioType ? "#e50914" : "rgba(255,255,255,0.1)" }} />
                          {o.type_name}
                        </button>
                      ))}
                    </div>
                  )}

                  {/* Internal Tracks (Container Side) */}
                  {mp4Audio.length > 0 && (
                    <div>
                      <div style={{ padding: "8px 14px 4px", fontSize: 9, color: "rgba(255,255,255,0.3)", fontWeight: 700 }}>EMBEDDED IN FILE</div>
                      {mp4Audio.map(t => (
                        <button key={t.i} className="menu-item"
                          style={{ width: "100%", padding: "10px 14px", border: "none", background: t.i === mp4AudioIdx ? "rgba(229,9,20,0.15)" : "transparent", color: t.i === mp4AudioIdx ? "#f87171" : "rgba(255,255,255,0.9)", cursor: "pointer", fontSize: 13, textAlign: "left", display: "flex", alignItems: "center", gap: 10, transition: "all 0.2s" }}
                          onClick={() => {
                            const v = vRef.current; if (!v) return;
                            setMp4AudioIdx(t.i);
                            
                            // Native switch
                            // eslint-disable-next-line @typescript-eslint/no-explicit-any
                            const at = (v as any).audioTracks;
                            if (at) { for (let j = 0; j < at.length; j++) at[j].enabled = (j === t.i); }
                            
                            // HLS.js switch
                            if (hlsRef.current) hlsRef.current.audioTrack = t.i;
                            
                            setMenu(null);
                          }}>
                          <div style={{ width: 6, height: 6, borderRadius: "50%", background: t.i === mp4AudioIdx ? "#e50914" : "rgba(255,255,255,0.1)" }} />
                          {t.label}
                        </button>
                      ))}
                    </div>
                  )}

                  {!audioOptions?.length && !mp4Audio.length && (
                    <div style={{ padding: "12px 14px", fontSize: 12, color: "rgba(255,255,255,0.3)", fontStyle: "italic" }}>Single audio track</div>
                  )}
                </div>
              )}
            </div>

            {/* Subtitles Menu */}
            <div style={{ position: "relative" }}>
              <button style={menu === "s" || sub ? BA : B} onClick={() => setMenu(menu === "s" ? null : "s")}>
                <svg width={18} height={18} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth={2} strokeLinecap="round" strokeLinejoin="round"><path d="M21 15a2 2 0 0 1-2 2H7l-4 4V5a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2z"/></svg>
                <span style={{ maxWidth: 80, overflow: "hidden", textOverflow: "ellipsis", whiteSpace: "nowrap" }}>
                  {sub ? (mp4Subs.find(s => s.lang === sub)?.label || subtitleTracks?.find(s => s.lang === sub)?.label || "Subs On") : "Subs Off"}
                </span>
              </button>
              {menu === "s" && (
                <div style={{ position: "absolute", bottom: "100%", right: 0, marginBottom: 10, background: "rgba(15,15,15,0.9)", backdropFilter: "blur(20px)", border: "1px solid rgba(255,255,255,0.1)", borderRadius: 12, overflow: "hidden", minWidth: 160, boxShadow: "0 10px 40px rgba(0,0,0,0.8)" }}>
                  <div style={{ padding: "10px 14px", fontSize: 10, fontWeight: 800, color: "rgba(255,255,255,0.4)", textTransform: "uppercase", letterSpacing: 1.5, borderBottom: "1px solid rgba(255,255,255,0.08)" }}>Subtitles Selection</div>
                  
                  <button className="menu-item" style={{ width: "100%", padding: "10px 14px", border: "none", background: !sub ? "rgba(229,9,20,0.15)" : "transparent", color: !sub ? "#f87171" : "rgba(255,255,255,0.9)", cursor: "pointer", fontSize: 13, textAlign: "left", display: "flex", alignItems: "center", gap: 10 }}
                    onClick={() => {
                      const v = vRef.current;
                      if (v?.textTracks) { for (let i = 0; i < v.textTracks.length; i++) v.textTracks[i].mode = "disabled"; }
                      setSub(null); setMenu(null);
                    }}>
                    <div style={{ width: 6, height: 6, borderRadius: "50%", background: !sub ? "#e50914" : "rgba(255,255,255,0.1)" }} /> Off
                  </button>

                  {/* Internal Tracks (Container Side) */}
                  {mp4Subs.length > 0 && (
                    <div style={{ borderBottom: subtitleTracks?.length ? "1px solid rgba(255,255,255,0.08)" : "none" }}>
                      <div style={{ padding: "8px 14px 4px", fontSize: 9, color: "rgba(255,255,255,0.3)", fontWeight: 700 }}>EMBEDDED IN FILE</div>
                      {mp4Subs.map(st => (
                        <button key={st.i} className="menu-item" style={{ width: "100%", padding: "10px 14px", border: "none", background: sub === st.lang ? "rgba(229,9,20,0.15)" : "transparent", color: sub === st.lang ? "#f87171" : "rgba(255,255,255,0.9)", cursor: "pointer", fontSize: 13, textAlign: "left", display: "flex", alignItems: "center", gap: 10 }}
                          onClick={() => {
                            const v = vRef.current;
                            if (v?.textTracks) { for (let i = 0; i < v.textTracks.length; i++) v.textTracks[i].mode = (i === st.i) ? "showing" : "disabled"; }
                            setSub(st.lang); setMenu(null);
                          }}>
                          <div style={{ width: 6, height: 6, borderRadius: "50%", background: sub === st.lang ? "#e50914" : "rgba(255,255,255,0.1)" }} /> {st.label}
                        </button>
                      ))}
                    </div>
                  )}

                  {/* External Tracks (API Side) */}
                  {subtitleTracks && subtitleTracks.length > 0 && (
                    <div>
                      <div style={{ padding: "8px 14px 4px", fontSize: 9, color: "rgba(255,255,255,0.3)", fontWeight: 700 }}>EXTERNAL SUBTITLES</div>
                      {subtitleTracks.map(st => (
                        <button key={st.lang} className="menu-item" style={{ width: "100%", padding: "10px 14px", border: "none", background: sub === st.lang ? "rgba(229,9,20,0.15)" : "transparent", color: sub === st.lang ? "#f87171" : "rgba(255,255,255,0.9)", cursor: "pointer", fontSize: 13, textAlign: "left", display: "flex", alignItems: "center", gap: 10 }}
                          onClick={() => { setSub(st.lang); setMenu(null); }}>
                          <div style={{ width: 6, height: 6, borderRadius: "50%", background: sub === st.lang ? "#e50914" : "rgba(255,255,255,0.1)" }} /> {st.label}
                        </button>
                      ))}
                    </div>
                  )}
                </div>
              )}
            </div>

            {/* Quality Menu */}
            {levels.length > 1 && (
              <div style={{ position: "relative" }}>
                <button style={menu === "q" ? BA : B} onClick={() => setMenu(menu === "q" ? null : "q")}>
                  <svg width={18} height={18} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth={2} strokeLinecap="round" strokeLinejoin="round"><path d="M12 20a8 8 0 1 0 0-16 8 8 0 0 0 0 16z"/><circle cx="12" cy="12" r="3"/></svg>
                  <span>{lvl === -1 ? "Auto" : levels[lvl]?.h + "p"}</span>
                </button>
                {menu === "q" && (
                  <div style={{ position: "absolute", bottom: "100%", right: 0, marginBottom: 10, background: "rgba(15,15,15,0.9)", backdropFilter: "blur(20px)", border: "1px solid rgba(255,255,255,0.1)", borderRadius: 12, overflow: "hidden", minWidth: 140, boxShadow: "0 10px 40px rgba(0,0,0,0.8)" }}>
                    <div style={{ padding: "10px 14px", fontSize: 10, fontWeight: 800, color: "rgba(255,255,255,0.4)", textTransform: "uppercase", letterSpacing: 1.5, borderBottom: "1px solid rgba(255,255,255,0.08)" }}>Quality</div>
                    <button className="menu-item" style={{ width: "100%", padding: "10px 14px", border: "none", background: lvl === -1 ? "rgba(229,9,20,0.15)" : "transparent", color: lvl === -1 ? "#f87171" : "rgba(255,255,255,0.9)", cursor: "pointer", fontSize: 13, textAlign: "left", display: "flex", alignItems: "center", gap: 10 }}
                      onClick={() => { setLvl(-1); if (hlsRef.current) hlsRef.current.currentLevel = -1; setMenu(null); }}>
                      <div style={{ width: 6, height: 6, borderRadius: "50%", background: lvl === -1 ? "#e50914" : "rgba(255,255,255,0.1)" }} /> Auto
                    </button>
                    {levels.map((l, i) => (
                      <button key={i} className="menu-item" style={{ width: "100%", padding: "10px 14px", border: "none", background: lvl === i ? "rgba(229,9,20,0.15)" : "transparent", color: lvl === i ? "#f87171" : "rgba(255,255,255,0.9)", cursor: "pointer", fontSize: 13, textAlign: "left", display: "flex", alignItems: "center", gap: 10 }}
                        onClick={() => { setLvl(i); if (hlsRef.current) hlsRef.current.currentLevel = i; setMenu(null); }}>
                        <div style={{ width: 6, height: 6, borderRadius: "50%", background: lvl === i ? "#e50914" : "rgba(255,255,255,0.1)" }} /> {l.h}p
                      </button>
                    ))}
                  </div>
                )}
              </div>
            )}

            {/* Fullscreen */}
            <button style={B} onClick={toggleFs}>
              {full ? <I d="M8 3v3a2 2 0 01-2 2H3m18 0h-3a2 2 0 01-2-2V3m0 18v-3a2 2 0 012-2h3M3 16h3a2 2 0 012 2v3" s={18} /> : <I d="M15 3h6v6M9 21H3v-6M21 15v6h-6M3 9V3h6" s={18} />}
            </button>
          </div>
        </div>
      </div>
    </div>
  );
}
