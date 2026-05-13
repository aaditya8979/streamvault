package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeVideoBridge;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18953a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f18960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f18961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Surface f18962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceHolder f18963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18964l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HandlerThread f18966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f18967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f18968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f18969q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.enums.b f18954b = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18955c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18956d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18957e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18958f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18959g = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18965m = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18970r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18971s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18972t = 0;

    public p(Context context, n nVar, Handler handler) {
        this.f18953a = context;
        this.f18961i = nVar;
        this.f18960h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f18966n = handlerThread;
        handlerThread.start();
        this.f18967o = new Handler(this.f18966n.getLooper());
        this.f18969q = new b(this);
    }

    public static void a(p pVar) {
        if (pVar.a()) {
            pVar.f18971s = super.getVideoWidth();
            pVar.f18972t = super.getVideoHeight();
            pVar.f18970r = super.getDuration();
        }
    }

    public static void a(p pVar, Surface surface) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setSurface called with %s", pVar.b(), surface);
        try {
            pVar.safedk_mediaplayer_p_MediaPlayerSetSurface_baf035e053cd0323964903e8d61e6fe2(surface);
            if (surface == null) {
                IAlog.a("%s setSurface with null! current surface cleared", pVar.b());
            } else {
                IAlog.a("%s setSurface - replacing surface!", pVar.b());
            }
            IAlog.e(strB + "timelog: setSurface took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setSurface threw exception!", pVar.b());
        }
    }

    public static void a(p pVar, SurfaceHolder surfaceHolder) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setDisplay called with %s", pVar.b(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.a("%s setDisplay with null! current display cleared", pVar.b());
            } else {
                IAlog.a("%s setDisplay - replacing surface holder!", pVar.b());
            }
            IAlog.e(strB + "timelog: setDisplayInternal took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setDisplay threw exception!", pVar.b());
        }
    }

    public static void b(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.release();
        IAlog.e(strB + "timelog: release took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public static void c(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = pVar.f18954b;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress) {
            pVar.safedk_mediaplayer_p_MediaPlayerStart_f43709012b568879f46c903aa7e85cf6();
            pVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
        } else {
            IAlog.a("%s Start called in wrong mState! %s", pVar.b(), bVar);
            if (pVar.f18954b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
                pVar.f18955c = true;
            }
        }
        IAlog.e(strB + "timelog: start took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public static void d(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.a("%s paused called cannot set to pause, canceled", pVar.b());
        }
        IAlog.e(strB + "timelog: delayed pause took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    private void safedk_mediaplayer_p_MediaPlayerSetSurface_baf035e053cd0323964903e8d61e6fe2(Surface surface) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/fyber/inneractive/sdk/player/mediaplayer/p;->safedk_mediaplayer_p_MediaPlayerSetSurface_baf035e053cd0323964903e8d61e6fe2(Landroid/view/Surface;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetSurface: player " + this + ", surface " + surface + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetSurface: " + e10.getMessage());
            }
        }
        super.setSurface(surface);
    }

    private void safedk_mediaplayer_p_MediaPlayerStart_f43709012b568879f46c903aa7e85cf6() throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/fyber/inneractive/sdk/player/mediaplayer/p;->safedk_mediaplayer_p_MediaPlayerStart_f43709012b568879f46c903aa7e85cf6()V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: " + this + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                CreativeInfoManager.a(com.safedk.android.utils.g.f53142p, this);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: " + e10.getMessage());
            }
        }
        super.start();
    }

    private void safedk_mediaplayer_p_MediaPlayerStop_1a4f9cb0ba4b60a5eec058e0c59d0088() throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/fyber/inneractive/sdk/player/mediaplayer/p;->safedk_mediaplayer_p_MediaPlayerStop_1a4f9cb0ba4b60a5eec058e0c59d0088()V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStop: " + this + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.g.f53142p, this);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerStop: " + e10.getMessage());
            }
        }
        super.stop();
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%s updatePlayerState - %s", b(), bVar);
        if (this.f18954b == bVar) {
            IAlog.a("%s updatePlayerState - mState didn't change!", b());
            return;
        }
        IAlog.a("%s updatePlayerState - changing from %s to %s", b(), this.f18954b, bVar);
        this.f18954b = bVar;
        this.f18960h.post(new d(this, bVar));
    }

    public final void a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f18966n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f18966n.isInterrupted() && (handler2 = this.f18967o) != null) {
            handler2.post(runnable);
        }
        if ((this.f18971s == 0 || this.f18972t == 0 || this.f18970r == 0) && (handler = this.f18967o) != null) {
            handler.post(this.f18969q);
        }
    }

    public final void a(String str) {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f18958f = false;
        this.f18959g = false;
        if (isPlaying()) {
            IAlog.a("%s loadUri stopping play before refresh", b());
            stop();
        }
        this.f18964l = System.currentTimeMillis();
        e();
        IAlog.a("%s calling setDataSource with %s", b(), str);
        try {
            DTExchangeVideoBridge.MediaPlayerSetDataSource(this, str);
            IAlog.a("%s setDataSource succeeded, calling prepareAsync", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e10) {
                IAlog.b("%s prepareAsync failed with illegal mState exception: %s", b(), e10.getMessage());
                this.f18965m++;
                if (this.f18965m < 5) {
                    a(str);
                }
                this.f18965m = 0;
            }
            IAlog.e(strB + "timelog: loadUri took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e11) {
            IAlog.b("%s error setting data source %s", b(), str);
            IAlog.b("%s exception message: %s", b(), e11.getMessage());
        }
    }

    public final boolean a() {
        return (this.f18954b == com.fyber.inneractive.sdk.player.enums.b.Idle || this.f18954b == com.fyber.inneractive.sdk.player.enums.b.Preparing) ? false : true;
    }

    public final String b() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ": ";
    }

    public final void c() {
        if (this.f18959g) {
            if (!this.f18958f) {
                IAlog.a("%sGot prepared only, waiting for video size", b());
                if (this.f18968p == null) {
                    this.f18968p = new c(this);
                }
                r.f19556b.postDelayed(this.f18968p, 2000L);
                return;
            }
            IAlog.a("%sMedia load time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f18964l));
            this.f18970r = super.getDuration();
            a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
            if (this.f18956d) {
                d();
            }
        }
    }

    public final void d() {
        this.f18956d = true;
        if (a()) {
            a(new l(this));
        } else {
            IAlog.a("%s mute called when player is not ready!", b());
        }
        IAlog.a("%s mute", b());
    }

    public final void e() {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = this.f18954b;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Idle;
        if (bVar == bVar2) {
            IAlog.a("%s reset called, but player is already resetted. Do nothing", b());
            return;
        }
        a(bVar2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.e(strB + "timelog: reset took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    @Override // android.media.MediaPlayer
    public final int getCurrentPosition() {
        if (a()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer
    public final int getDuration() {
        return this.f18970r;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoHeight() {
        return this.f18972t;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoWidth() {
        return this.f18971s;
    }

    @Override // android.media.MediaPlayer
    public final boolean isPlaying() {
        return a() && this.f18954b != com.fyber.inneractive.sdk.player.enums.b.Paused && super.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/mediaplayer/p;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.g.f53142p, mediaPlayer);
        safedk_p_onCompletion_c2edc5526db825297a33bec5b2811602(mediaPlayer);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.f("%s onError code = %d code2 = %d", b(), Integer.valueOf(i10), Integer.valueOf(i11));
        e();
        this.f18960h.post(new a(this, i10, i11));
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("%s onPrepared %s gotPrepared = %s", b(), this, Boolean.valueOf(this.f18959g));
        IAlog.a("%sMedia prepare time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f18964l));
        if (this.f18954b != com.fyber.inneractive.sdk.player.enums.b.Preparing && this.f18954b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.f("%s onPrepared: previous error encountered. Aborting", b());
        } else if (this.f18959g) {
            IAlog.a("%s onPrepared called again??? We are already prepared", b());
        } else {
            this.f18959g = true;
            c();
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.a("%s onSeekComplete called current position = %d", b(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f18954b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.a("%s onSeekComplete called when Story is not seeking", b());
            return;
        }
        if (this.f18956d) {
            d();
        }
        if (!this.f18955c) {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = false", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Paused);
        } else {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = true", b());
            this.f18954b = com.fyber.inneractive.sdk.player.enums.b.Paused;
            start();
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.a("%s onVideoSizeChanged %d, %d", b(), Integer.valueOf(i10), Integer.valueOf(i11));
        if (this.f18958f) {
            return;
        }
        c cVar = this.f18968p;
        if (cVar != null) {
            r.f19556b.removeCallbacks(cVar);
            IAlog.a("%s onVideoSizeChanged cancelling prepared runnable", b());
        }
        this.f18958f = true;
        if (i10 == 0 || i11 == 0) {
            IAlog.f("%s onVideoSizeChanged - Invalid video size!", b());
            onError(this, 0, 0);
        } else {
            IAlog.a("%sMedia got video size time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f18964l));
            this.f18971s = i10;
            this.f18972t = i11;
            c();
        }
    }

    @Override // android.media.MediaPlayer
    public final void pause() {
        if (this.f18954b != com.fyber.inneractive.sdk.player.enums.b.Idle && this.f18954b != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f18954b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Paused;
            if (bVar != bVar2 && this.f18954b != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                a(bVar2);
                if (a()) {
                    a(new k(this));
                } else {
                    IAlog.a("%s paused called when player is not ready!", b());
                }
                IAlog.a("%s pause", b());
                return;
            }
        }
        IAlog.a("%s paused called when player is in mState: %s ignoring", b(), this.f18954b);
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        if (!this.f18957e) {
            a(new g(this));
        }
        this.f18961i = null;
        this.f18969q = null;
        this.f18957e = true;
        IAlog.a("%s release called", b());
    }

    @Override // android.media.MediaPlayer
    public final void reset() {
        IAlog.a("%s reset called", b());
        c cVar = this.f18968p;
        if (cVar != null) {
            r.f19556b.removeCallbacks(cVar);
        }
        a(new h(this));
    }

    public void safedk_p_onCompletion_c2edc5526db825297a33bec5b2811602(MediaPlayer mediaPlayer) {
        a(com.fyber.inneractive.sdk.player.enums.b.Completed);
    }

    @Override // android.media.MediaPlayer
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.a("%s setDisplay called", b());
        if (!a()) {
            IAlog.a("%s setDisplay called when player is not ready!", b());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f18963k;
        if (surfaceHolder2 != null && surfaceHolder2.equals(surfaceHolder)) {
            IAlog.a("%s setDisplay called with existing surface. ignoring!", b());
        } else {
            this.f18963k = surfaceHolder;
            a(new e(this, surfaceHolder));
        }
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    @Override // android.media.MediaPlayer
    public final void setSurface(Surface surface) {
        IAlog.a("%s setSurface called", b());
        Surface surface2 = this.f18962j;
        if (surface2 != null && surface2.equals(surface)) {
            IAlog.a("%s setSurface called with existing surface. ignoring!", b());
        } else {
            this.f18962j = surface;
            a(new f(this, surface));
        }
    }

    @Override // android.media.MediaPlayer
    public final void start() {
        IAlog.a("%s Start called", b());
        if (!a()) {
            IAlog.a("%s MediaPlayer: Start called when player is not ready! - mState = %s", b(), this.f18954b);
            return;
        }
        if (this.f18954b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            this.f18955c = true;
        } else if (isPlaying()) {
            IAlog.a("%s MediaPlayer: Start called when player is already playing. do nothing", b());
        } else {
            a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
            a(new i(this));
        }
    }

    @Override // android.media.MediaPlayer
    public final void stop() {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a()) {
            safedk_mediaplayer_p_MediaPlayerStop_1a4f9cb0ba4b60a5eec058e0c59d0088();
        }
        IAlog.a("%s stop called", b());
        IAlog.e(strB + "timelog: stop took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}
