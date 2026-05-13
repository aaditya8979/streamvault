package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;

/* JADX INFO: compiled from: ComponentVideoPlayer.java */
/* JADX INFO: loaded from: classes8.dex */
public class b implements Player.EventListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f36628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f36630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SimpleExoPlayer f36631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaSource f36632i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.dynamic.baseview.video.a f36634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SurfaceHolder f36635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f36636m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36624a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36625b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36626c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36627d = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f36633j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f36637n = new a();

    /* JADX INFO: compiled from: ComponentVideoPlayer.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long duration;
            try {
                if (b.this.f36631h == null || !b.this.b()) {
                    return;
                }
                b bVar = b.this;
                bVar.f36628e = bVar.f36631h.getCurrentPosition();
                float f10 = b.this.f36628e % 1000;
                int iRound = Math.round(b.this.f36628e / 1000.0f);
                q0.c("ComponentVideoPlayer", "currentPosition:" + iRound + " mCurrentPosition:" + b.this.f36628e);
                if (b.this.f36631h == null || b.this.f36631h.getDuration() <= 0) {
                    duration = 0;
                } else {
                    duration = b.this.f36631h.getDuration() / 1000;
                    if (f10 > 0.0f && f10 < 500.0f) {
                        iRound++;
                    }
                }
                if (iRound >= 0 && duration > 0) {
                    long j10 = iRound;
                    if (j10 < 1 + duration && b.this.f36634k != null) {
                        b.this.f36634k.a(j10, duration);
                    }
                }
                b.this.f36624a = false;
                b.this.f36633j.postDelayed(this, 1000L);
            } catch (Exception e10) {
                q0.b("ComponentVideoPlayer", e10.getMessage());
            }
        }
    }

    private void a() {
        try {
            this.f36633j.removeCallbacks(this.f36637n);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    private void b(String str) {
        if (this.f36634k != null) {
            this.f36634k.onPlayError(str);
        }
    }

    private void r() {
        try {
            a();
            this.f36633j.post(this.f36637n);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void a(float f10) {
        try {
            if (b()) {
                this.f36631h.setPlaybackParameters(new PlaybackParameters(f10));
            } else {
                this.f36631h.setPlaybackParameters(new PlaybackParameters(f10));
                this.f36631h.stop();
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void a(float f10, float f11) {
        try {
            SimpleExoPlayer simpleExoPlayer = this.f36631h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(f11);
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void a(int i10) {
        long j10 = i10;
        try {
            this.f36628e = j10;
            if (!this.f36625b) {
                q0.a("ComponentVideoPlayer", "seekTo return mHasPrepare false");
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.f36631h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j10);
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void a(long j10) {
        try {
            if (this.f36625b) {
                r();
            } else {
                this.f36631h.prepare(this.f36632i);
            }
            this.f36631h.seekTo(j10);
            this.f36631h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public void a(Context context, SurfaceHolder surfaceHolder) {
        try {
            this.f36630g = context;
            this.f36635l = surfaceHolder;
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void a(SurfaceHolder surfaceHolder) {
        Player.VideoComponent videoComponent;
        try {
            SimpleExoPlayer simpleExoPlayer = this.f36631h;
            if (simpleExoPlayer == null || (videoComponent = simpleExoPlayer.getVideoComponent()) == null) {
                return;
            }
            videoComponent.setVideoSurfaceHolder(surfaceHolder);
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
            b(th2.toString());
        }
    }

    public void a(com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        this.f36634k = aVar;
    }

    public boolean a(String str) {
        try {
            this.f36625b = false;
            b(str);
            return true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            return true;
        }
    }

    public void b(int i10) {
        this.f36627d = i10;
    }

    public boolean b() {
        return this.f36631h.getPlaybackState() == 3 && this.f36631h.getPlayWhenReady();
    }

    public long c() {
        return this.f36628e;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            b("play url is illegal");
            return;
        }
        try {
            this.f36631h = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(this.f36630g), new DefaultTrackSelector(), new DefaultLoadControl());
            this.f36632i = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f36630g, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str));
            this.f36631h.setRepeatMode(0);
            this.f36631h.prepare(this.f36632i);
            this.f36631h.addListener(this);
            SurfaceHolder surfaceHolder = this.f36635l;
            if (surfaceHolder != null) {
                a(surfaceHolder);
            }
            c cVar = new c(this.f36630g, this.f36631h);
            this.f36636m = cVar;
            cVar.a(str, this.f36634k, this.f36627d);
        } catch (Throwable unused) {
            b("Player init error");
        }
    }

    public int d() {
        SimpleExoPlayer simpleExoPlayer = this.f36631h;
        if (simpleExoPlayer != null) {
            return (int) (simpleExoPlayer.getDuration() / 1000);
        }
        return 0;
    }

    public float e() {
        SimpleExoPlayer simpleExoPlayer = this.f36631h;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getVolume();
        }
        return 0.0f;
    }

    public boolean f() {
        return this.f36625b;
    }

    public boolean g() {
        return this.f36624a;
    }

    public boolean h() {
        return this.f36631h != null && b();
    }

    public boolean i() {
        return this.f36629f;
    }

    public void j() {
        SimpleExoPlayer simpleExoPlayer = this.f36631h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(0.0f);
        this.f36629f = true;
    }

    public void k() {
        try {
            this.f36624a = true;
            this.f36628e = 0L;
            if (this.f36634k != null) {
                this.f36634k.onPlayCompleted();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void l() {
        try {
            this.f36625b = true;
            if (this.f36631h != null && !this.f36626c) {
                this.f36626c = true;
                if (this.f36634k != null) {
                    this.f36634k.a(this.f36631h.getDuration() / 1000);
                }
            }
            r();
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void m() {
        try {
            if (this.f36625b && this.f36631h != null && b()) {
                this.f36631h.setPlayWhenReady(false);
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void n() {
        try {
            if (this.f36625b) {
                r();
            } else {
                this.f36631h.prepare(this.f36632i);
            }
            this.f36631h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public void o() {
        SimpleExoPlayer simpleExoPlayer;
        try {
            if (this.f36625b || (simpleExoPlayer = this.f36631h) == null) {
                return;
            }
            simpleExoPlayer.prepare(this.f36632i);
            this.f36625b = true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("ComponentVideoPlayer", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        c cVar = this.f36636m;
        if ((cVar == null || !cVar.a(exoPlaybackException)) && exoPlaybackException != null) {
            int i10 = exoPlaybackException.type;
            String message = i10 != 0 ? i10 != 1 ? i10 != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException." : "Play error, because have a RendererException." : "Play error, because have a SourceException.";
            if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
                message = exoPlaybackException.getCause().getMessage();
            }
            q0.b("ComponentVideoPlayer", "onPlayerError : " + message);
            a(message);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Buffering");
            return;
        }
        if (i10 == 3) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : READY");
            l();
        } else {
            if (i10 != 4) {
                return;
            }
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Ended : PLAY ENDED");
            a();
            k();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, @Nullable Object obj, int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void p() {
        try {
            a();
            if (this.f36631h != null) {
                s();
                this.f36631h.removeListener(this);
                this.f36631h.release();
                this.f36634k = null;
            }
            c cVar = this.f36636m;
            if (cVar != null) {
                cVar.c();
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void q() {
        SimpleExoPlayer simpleExoPlayer = this.f36631h;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(simpleExoPlayer.getCurrentPosition() - 500);
        }
    }

    public void s() {
        try {
            if (this.f36625b && this.f36631h != null && b()) {
                this.f36631h.stop();
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void t() {
        SimpleExoPlayer simpleExoPlayer = this.f36631h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(1.0f);
        this.f36629f = false;
    }
}
