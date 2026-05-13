package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q implements com.fyber.inneractive.sdk.player.mediaplayer.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17182a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f17185d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.c f17187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17188g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f17190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextureView f17191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceTexture f17192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Surface f17193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f17194m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17196o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.enums.b f17186e = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17195n = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f17183b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f17184c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.h f17189h = new com.fyber.inneractive.sdk.player.h(this);

    public q(Context context) {
        this.f17182a = context.getApplicationContext();
        this.f17190i = new Handler(context.getMainLooper());
        a(true);
    }

    public static void a(q qVar, SurfaceTexture surfaceTexture) {
        boolean z10 = !surfaceTexture.equals(qVar.f17192k);
        SurfaceTexture surfaceTexture2 = qVar.f17192k;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        qVar.f17192k = surfaceTexture;
        Surface surface = qVar.f17193l;
        if (surface == null || z10) {
            if (surface != null) {
                surface.release();
            }
            qVar.f17193l = new Surface(qVar.f17192k);
        }
        qVar.a(qVar.f17193l);
    }

    public void a() {
        IAlog.a("%sdestroy started", IAlog.a(this));
        k();
        this.f17189h = null;
        com.fyber.inneractive.sdk.util.v.a(this.f17191j);
        this.f17191j = null;
        SurfaceTexture surfaceTexture = this.f17192k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f17192k = null;
        }
        Surface surface = this.f17193l;
        if (surface != null) {
            surface.release();
            this.f17193l = null;
        }
        this.f17190i.removeCallbacksAndMessages(null);
        this.f17183b.clear();
        this.f17187f = null;
        this.f17188g = true;
        IAlog.a("%sdestroy finished", IAlog.a(this));
    }

    public void a(int i10) {
        this.f17190i.post(new l(this, i10));
    }

    public abstract void a(int i10, boolean z10);

    public abstract void a(Surface surface);

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f17191j;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            this.f17191j = textureView;
            if (textureView != null) {
                i iVar = this.f17194m;
                if (iVar == null) {
                    iVar = new i(this);
                    this.f17194m = iVar;
                }
                textureView.setSurfaceTextureListener(iVar);
            }
            if (this.f17192k != null) {
                IAlog.a("%scalling setSurfaceTexture with cached texture", IAlog.a(this));
                if (this.f17191j.getSurfaceTexture() != null && this.f17191j.getSurfaceTexture().equals(this.f17192k)) {
                    IAlog.a("%scalling setSurfaceTexture with cached texture failed", IAlog.a(this));
                } else {
                    IAlog.a("%scalling setSurfaceTexture with cached texture success", IAlog.a(this));
                    this.f17191j.setSurfaceTexture(this.f17192k);
                }
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        if (bVar == this.f17186e) {
            return;
        }
        this.f17186e = bVar;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            com.fyber.inneractive.sdk.player.h hVar = this.f17189h;
            if (hVar != null && hVar.f18929b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                hVar.f18929b = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(hVar.f18930c, 100, 1000, TimeUnit.MILLISECONDS);
            }
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            k();
        }
        this.f17190i.post(new m(this, bVar));
    }

    public abstract void a(String str, int i10);

    public abstract void a(boolean z10);

    public abstract int b();

    public abstract void b(boolean z10);

    public abstract int c();

    public final void c(boolean z10) {
        com.fyber.inneractive.sdk.measurement.f fVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17187f;
        if (cVar == null || (fVar = cVar.f17096a.f18916e) == null) {
            return;
        }
        if (z10) {
            if (fVar.f16766c == null || !fVar.f16767d) {
                return;
            }
            IAlog.a("%s mute", "OMVideo");
            try {
                fVar.f16766c.volumeChange(0.0f);
                return;
            } catch (Throwable th2) {
                fVar.a(th2);
                return;
            }
        }
        if (fVar.f16766c == null || !fVar.f16767d) {
            return;
        }
        IAlog.a("%s unMute", "OMVideo");
        try {
            fVar.f16766c.volumeChange(1.0f);
        } catch (Throwable th3) {
            fVar.a(th3);
        }
    }

    public abstract String d();

    public abstract void d(boolean z10);

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public boolean h() {
        return this.f17186e == com.fyber.inneractive.sdk.player.enums.b.Playing;
    }

    public abstract void i();

    public abstract void j();

    public final void k() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        com.fyber.inneractive.sdk.player.h hVar = this.f17189h;
        if (hVar == null || (scheduledThreadPoolExecutor = hVar.f18929b) == null) {
            return;
        }
        scheduledThreadPoolExecutor.shutdownNow();
        hVar.f18929b = null;
    }
}
