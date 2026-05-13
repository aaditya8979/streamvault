package e4;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.trackselection.DefaultTrackSelector;
import e4.a;
import e4.c;
import e4.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: SimpleExoPlayer.java */
/* JADX INFO: loaded from: classes10.dex */
public class u0 extends d implements n0.d, n0.c {
    public int A;

    @Nullable
    public i4.d B;

    @Nullable
    public i4.d C;
    public int D;
    public g4.c E;
    public float F;

    @Nullable
    public e5.r G;
    public List<n5.b> H;
    public boolean I;

    @Nullable
    public a6.w J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0[] f60266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f60267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f60268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f60269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet<b6.i> f60270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet<g4.e> f60271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet<n5.j> f60272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet<w4.d> f60273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArraySet<b6.q> f60274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArraySet<com.google.android.exoplayer.audio.a> f60275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y5.c f60276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f4.a f60277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4.a f60278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e4.c f60279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w0 f60280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0 f60281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Format f60282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Format f60283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public b6.e f60284t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Surface f60285u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f60286v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f60287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public SurfaceHolder f60288x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public TextureView f60289y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f60290z;

    /* JADX INFO: compiled from: SimpleExoPlayer.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f60291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s0 f60292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a6.c f60293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public w5.d f60294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g0 f60295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public y5.c f60296f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public f4.a f60297g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Looper f60298h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f60299i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f60300j;

        public b(Context context, s0 s0Var) {
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
            h hVar = new h();
            y5.k kVarK = y5.k.k(context);
            Looper looperN = a6.k0.N();
            a6.c cVar = a6.c.f3524a;
            this(context, s0Var, defaultTrackSelector, hVar, kVarK, looperN, new f4.a(cVar), true, cVar);
        }

        public b(Context context, s0 s0Var, w5.d dVar, g0 g0Var, y5.c cVar, Looper looper, f4.a aVar, boolean z10, a6.c cVar2) {
            this.f60291a = context;
            this.f60292b = s0Var;
            this.f60294d = dVar;
            this.f60295e = g0Var;
            this.f60296f = cVar;
            this.f60298h = looper;
            this.f60297g = aVar;
            this.f60299i = z10;
            this.f60293c = cVar2;
        }

        public u0 a() {
            a6.a.f(!this.f60300j);
            this.f60300j = true;
            return new u0(this.f60291a, this.f60292b, this.f60294d, this.f60295e, this.f60296f, this.f60297g, this.f60293c, this.f60298h);
        }

        public b b(w5.d dVar) {
            a6.a.f(!this.f60300j);
            this.f60294d = dVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: SimpleExoPlayer.java */
    public final class c implements b6.q, com.google.android.exoplayer.audio.a, n5.j, w4.d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, c.b, a.b, n0.b {
        public c() {
        }

        @Override // e4.c.b
        public void executePlayerCommand(int i10) {
            u0 u0Var = u0.this;
            u0Var.d0(u0Var.getPlayWhenReady(), i10);
        }

        @Override // com.google.android.exoplayer.audio.a
        public void i(i4.d dVar) {
            u0.this.C = dVar;
            Iterator it = u0.this.f60275k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer.audio.a) it.next()).i(dVar);
            }
        }

        @Override // w4.d
        public void k(Metadata metadata) {
            Iterator it = u0.this.f60273i.iterator();
            while (it.hasNext()) {
                ((w4.d) it.next()).k(metadata);
            }
        }

        @Override // com.google.android.exoplayer.audio.a
        public void l(Format format) {
            u0.this.f60283s = format;
            Iterator it = u0.this.f60275k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer.audio.a) it.next()).l(format);
            }
        }

        @Override // e4.a.b
        public void onAudioBecomingNoisy() {
            u0.this.setPlayWhenReady(false);
        }

        @Override // com.google.android.exoplayer.audio.a
        public void onAudioDecoderInitialized(String str, long j10, long j11) {
            Iterator it = u0.this.f60275k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer.audio.a) it.next()).onAudioDecoderInitialized(str, j10, j11);
            }
        }

        @Override // com.google.android.exoplayer.audio.a
        public void onAudioSessionId(int i10) {
            if (u0.this.D == i10) {
                return;
            }
            u0.this.D = i10;
            for (g4.e eVar : u0.this.f60271g) {
                if (!u0.this.f60275k.contains(eVar)) {
                    eVar.onAudioSessionId(i10);
                }
            }
            Iterator it = u0.this.f60275k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer.audio.a) it.next()).onAudioSessionId(i10);
            }
        }

        @Override // com.google.android.exoplayer.audio.a
        public void onAudioSinkUnderrun(int i10, long j10, long j11) {
            Iterator it = u0.this.f60275k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer.audio.a) it.next()).onAudioSinkUnderrun(i10, j10, j11);
            }
        }

        @Override // n5.j
        public void onCues(List<n5.b> list) {
            u0.this.H = list;
            Iterator it = u0.this.f60272h.iterator();
            while (it.hasNext()) {
                ((n5.j) it.next()).onCues(list);
            }
        }

        @Override // b6.q
        public void onDroppedFrames(int i10, long j10) {
            Iterator it = u0.this.f60274j.iterator();
            while (it.hasNext()) {
                ((b6.q) it.next()).onDroppedFrames(i10, j10);
            }
        }

        @Override // e4.n0.b
        public void onLoadingChanged(boolean z10) {
            if (u0.this.J != null) {
                if (z10 && !u0.this.K) {
                    u0.this.J.a(0);
                    u0.this.K = true;
                } else {
                    if (z10 || !u0.this.K) {
                        return;
                    }
                    u0.this.J.b(0);
                    u0.this.K = false;
                }
            }
        }

        @Override // e4.n0.b
        public void onPlayerStateChanged(boolean z10, int i10) {
            u0.this.e0();
        }

        @Override // b6.q
        public void onRenderedFirstFrame(Surface surface) {
            if (u0.this.f60285u == surface) {
                Iterator it = u0.this.f60270f.iterator();
                while (it.hasNext()) {
                    ((b6.i) it.next()).onRenderedFirstFrame();
                }
            }
            Iterator it2 = u0.this.f60274j.iterator();
            while (it2.hasNext()) {
                ((b6.q) it2.next()).onRenderedFirstFrame(surface);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            u0.this.b0(new Surface(surfaceTexture), true);
            u0.this.R(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            u0.this.b0(null, true);
            u0.this.R(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            u0.this.R(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // b6.q
        public void onVideoDecoderInitialized(String str, long j10, long j11) {
            Iterator it = u0.this.f60274j.iterator();
            while (it.hasNext()) {
                ((b6.q) it.next()).onVideoDecoderInitialized(str, j10, j11);
            }
        }

        @Override // b6.q
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            for (b6.i iVar : u0.this.f60270f) {
                if (!u0.this.f60274j.contains(iVar)) {
                    iVar.onVideoSizeChanged(i10, i11, i12, f10);
                }
            }
            Iterator it = u0.this.f60274j.iterator();
            while (it.hasNext()) {
                ((b6.q) it.next()).onVideoSizeChanged(i10, i11, i12, f10);
            }
        }

        @Override // b6.q
        public void p(i4.d dVar) {
            Iterator it = u0.this.f60274j.iterator();
            while (it.hasNext()) {
                ((b6.q) it.next()).p(dVar);
            }
            u0.this.f60282r = null;
            u0.this.B = null;
        }

        @Override // com.google.android.exoplayer.audio.a
        public void r(i4.d dVar) {
            Iterator it = u0.this.f60275k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer.audio.a) it.next()).r(dVar);
            }
            u0.this.f60283s = null;
            u0.this.C = null;
            u0.this.D = 0;
        }

        @Override // b6.q
        public void s(i4.d dVar) {
            u0.this.B = dVar;
            Iterator it = u0.this.f60274j.iterator();
            while (it.hasNext()) {
                ((b6.q) it.next()).s(dVar);
            }
        }

        @Override // e4.c.b
        public void setVolumeMultiplier(float f10) {
            u0.this.W();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            u0.this.R(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            u0.this.b0(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            u0.this.b0(null, false);
            u0.this.R(0, 0);
        }

        @Override // b6.q
        public void t(Format format) {
            u0.this.f60282r = format;
            Iterator it = u0.this.f60274j.iterator();
            while (it.hasNext()) {
                ((b6.q) it.next()).t(format);
            }
        }
    }

    @Deprecated
    public u0(Context context, s0 s0Var, w5.d dVar, g0 g0Var, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, y5.c cVar, f4.a aVar2, a6.c cVar2, Looper looper) {
        this.f60276l = cVar;
        this.f60277m = aVar2;
        c cVar3 = new c();
        this.f60269e = cVar3;
        CopyOnWriteArraySet<b6.i> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f60270f = copyOnWriteArraySet;
        CopyOnWriteArraySet<g4.e> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f60271g = copyOnWriteArraySet2;
        this.f60272h = new CopyOnWriteArraySet<>();
        this.f60273i = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<b6.q> copyOnWriteArraySet3 = new CopyOnWriteArraySet<>();
        this.f60274j = copyOnWriteArraySet3;
        CopyOnWriteArraySet<com.google.android.exoplayer.audio.a> copyOnWriteArraySet4 = new CopyOnWriteArraySet<>();
        this.f60275k = copyOnWriteArraySet4;
        Handler handler = new Handler(looper);
        this.f60268d = handler;
        p0[] p0VarArrA = s0Var.a(handler, cVar3, cVar3, cVar3, cVar3, aVar);
        this.f60266b = p0VarArrA;
        this.F = 1.0f;
        this.D = 0;
        this.E = g4.c.f61933f;
        this.f60287w = 1;
        this.H = Collections.emptyList();
        t tVar = new t(p0VarArrA, dVar, g0Var, cVar, cVar2, looper);
        this.f60267c = tVar;
        aVar2.H(tVar);
        tVar.e(aVar2);
        tVar.e(cVar3);
        copyOnWriteArraySet3.add(aVar2);
        copyOnWriteArraySet.add(aVar2);
        copyOnWriteArraySet4.add(aVar2);
        copyOnWriteArraySet2.add(aVar2);
        K(aVar2);
        cVar.e(handler, aVar2);
        if (aVar instanceof DefaultDrmSessionManager) {
            ((DefaultDrmSessionManager) aVar).i(handler, aVar2);
        }
        this.f60278n = new e4.a(context, handler, cVar3);
        this.f60279o = new e4.c(context, handler, cVar3);
        this.f60280p = new w0(context);
        this.f60281q = new x0(context);
    }

    public u0(Context context, s0 s0Var, w5.d dVar, g0 g0Var, y5.c cVar, f4.a aVar, a6.c cVar2, Looper looper) {
        this(context, s0Var, dVar, g0Var, com.google.android.exoplayer.drm.a.a(), cVar, aVar, cVar2, looper);
    }

    public void J(f4.b bVar) {
        f0();
        this.f60277m.x(bVar);
    }

    public void K(w4.d dVar) {
        this.f60273i.add(dVar);
    }

    public void L() {
        f0();
        Y(null);
    }

    public void M(@Nullable SurfaceHolder surfaceHolder) {
        f0();
        if (surfaceHolder == null || surfaceHolder != this.f60288x) {
            return;
        }
        a0(null);
    }

    public Looper N() {
        return this.f60267c.w();
    }

    @Nullable
    public ExoPlaybackException O() {
        f0();
        return this.f60267c.z();
    }

    public l0 P() {
        f0();
        return this.f60267c.A();
    }

    public w5.d Q() {
        return this.f60267c.C();
    }

    public final void R(int i10, int i11) {
        if (i10 == this.f60290z && i11 == this.A) {
            return;
        }
        this.f60290z = i10;
        this.A = i11;
        Iterator<b6.i> it = this.f60270f.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceSizeChanged(i10, i11);
        }
    }

    public void S(e5.r rVar) {
        T(rVar, true, true);
    }

    public void T(e5.r rVar, boolean z10, boolean z11) {
        f0();
        e5.r rVar2 = this.G;
        if (rVar2 != null) {
            rVar2.f(this.f60277m);
            this.f60277m.G();
        }
        this.G = rVar;
        rVar.c(this.f60268d, this.f60277m);
        boolean playWhenReady = getPlayWhenReady();
        d0(playWhenReady, this.f60279o.n(playWhenReady, 2));
        this.f60267c.R(rVar, z10, z11);
    }

    public void U() {
        f0();
        this.f60278n.b(false);
        this.f60280p.a(false);
        this.f60281q.a(false);
        this.f60279o.h();
        this.f60267c.S();
        V();
        Surface surface = this.f60285u;
        if (surface != null) {
            if (this.f60286v) {
                surface.release();
            }
            this.f60285u = null;
        }
        e5.r rVar = this.G;
        if (rVar != null) {
            rVar.f(this.f60277m);
            this.G = null;
        }
        if (this.K) {
            ((a6.w) a6.a.e(this.J)).b(0);
            this.K = false;
        }
        this.f60276l.b(this.f60277m);
        this.H = Collections.emptyList();
        this.L = true;
    }

    public final void V() {
        TextureView textureView = this.f60289y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f60269e) {
                a6.m.h("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f60289y.setSurfaceTextureListener(null);
            }
            this.f60289y = null;
        }
        SurfaceHolder surfaceHolder = this.f60288x;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f60269e);
            this.f60288x = null;
        }
    }

    public final void W() {
        float f10 = this.F * this.f60279o.f();
        for (p0 p0Var : this.f60266b) {
            if (p0Var.getTrackType() == 1) {
                this.f60267c.v(p0Var).m(2).l(Float.valueOf(f10)).k();
            }
        }
    }

    public void X(@Nullable l0 l0Var) {
        f0();
        this.f60267c.U(l0Var);
    }

    public final void Y(@Nullable b6.e eVar) {
        for (p0 p0Var : this.f60266b) {
            if (p0Var.getTrackType() == 2) {
                this.f60267c.v(p0Var).m(8).l(eVar).k();
            }
        }
        this.f60284t = eVar;
    }

    public void Z(@Nullable Surface surface) {
        f0();
        V();
        if (surface != null) {
            L();
        }
        b0(surface, false);
        int i10 = surface != null ? -1 : 0;
        R(i10, i10);
    }

    @Override // e4.n0.d
    public void a(b6.i iVar) {
        this.f60270f.remove(iVar);
    }

    public void a0(@Nullable SurfaceHolder surfaceHolder) {
        f0();
        V();
        if (surfaceHolder != null) {
            L();
        }
        this.f60288x = surfaceHolder;
        if (surfaceHolder == null) {
            b0(null, false);
            R(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f60269e);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            b0(null, false);
            R(0, 0);
        } else {
            b0(surface, false);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            R(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // e4.n0.c
    public void b(n5.j jVar) {
        this.f60272h.remove(jVar);
    }

    public final void b0(@Nullable Surface surface, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : this.f60266b) {
            if (p0Var.getTrackType() == 2) {
                arrayList.add(this.f60267c.v(p0Var).m(1).l(surface).k());
            }
        }
        Surface surface2 = this.f60285u;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((o0) it.next()).a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f60286v) {
                this.f60285u.release();
            }
        }
        this.f60285u = surface;
        this.f60286v = z10;
    }

    @Override // e4.n0
    public void c(n0.b bVar) {
        f0();
        this.f60267c.c(bVar);
    }

    public void c0(float f10) {
        f0();
        float fP = a6.k0.p(f10, 0.0f, 1.0f);
        if (this.F == fP) {
            return;
        }
        this.F = fP;
        W();
        Iterator<g4.e> it = this.f60271g.iterator();
        while (it.hasNext()) {
            it.next().onVolumeChanged(fP);
        }
    }

    @Override // e4.n0.d
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        M(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // e4.n0.d
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        f0();
        if (textureView == null || textureView != this.f60289y) {
            return;
        }
        setVideoTextureView(null);
    }

    @Override // e4.n0.c
    public void d(n5.j jVar) {
        if (!this.H.isEmpty()) {
            jVar.onCues(this.H);
        }
        this.f60272h.add(jVar);
    }

    public final void d0(boolean z10, int i10) {
        int i11 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i11 = 1;
        }
        this.f60267c.T(z11, i11);
    }

    @Override // e4.n0
    public void e(n0.b bVar) {
        f0();
        this.f60267c.e(bVar);
    }

    public final void e0() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.f60280p.a(getPlayWhenReady());
                this.f60281q.a(getPlayWhenReady());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.f60280p.a(false);
        this.f60281q.a(false);
    }

    @Override // e4.n0.d
    public void f(b6.i iVar) {
        this.f60270f.add(iVar);
    }

    public final void f0() {
        if (Looper.myLooper() != N()) {
            a6.m.i("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.I ? null : new IllegalStateException());
            this.I = true;
        }
    }

    @Override // e4.n0
    public long getBufferedPosition() {
        f0();
        return this.f60267c.getBufferedPosition();
    }

    @Override // e4.n0
    public long getContentPosition() {
        f0();
        return this.f60267c.getContentPosition();
    }

    @Override // e4.n0
    public int getCurrentAdGroupIndex() {
        f0();
        return this.f60267c.getCurrentAdGroupIndex();
    }

    @Override // e4.n0
    public int getCurrentAdIndexInAdGroup() {
        f0();
        return this.f60267c.getCurrentAdIndexInAdGroup();
    }

    @Override // e4.n0
    public long getCurrentPosition() {
        f0();
        return this.f60267c.getCurrentPosition();
    }

    @Override // e4.n0
    public v0 getCurrentTimeline() {
        f0();
        return this.f60267c.getCurrentTimeline();
    }

    @Override // e4.n0
    public TrackGroupArray getCurrentTrackGroups() {
        f0();
        return this.f60267c.getCurrentTrackGroups();
    }

    @Override // e4.n0
    public w5.c getCurrentTrackSelections() {
        f0();
        return this.f60267c.getCurrentTrackSelections();
    }

    @Override // e4.n0
    public int getCurrentWindowIndex() {
        f0();
        return this.f60267c.getCurrentWindowIndex();
    }

    @Override // e4.n0
    public long getDuration() {
        f0();
        return this.f60267c.getDuration();
    }

    @Override // e4.n0
    public boolean getPlayWhenReady() {
        f0();
        return this.f60267c.getPlayWhenReady();
    }

    @Override // e4.n0
    public int getPlaybackState() {
        f0();
        return this.f60267c.getPlaybackState();
    }

    @Override // e4.n0
    public int getPlaybackSuppressionReason() {
        f0();
        return this.f60267c.getPlaybackSuppressionReason();
    }

    @Override // e4.n0
    public int getRendererType(int i10) {
        f0();
        return this.f60267c.getRendererType(i10);
    }

    @Override // e4.n0
    public int getRepeatMode() {
        f0();
        return this.f60267c.getRepeatMode();
    }

    @Override // e4.n0
    public boolean getShuffleModeEnabled() {
        f0();
        return this.f60267c.getShuffleModeEnabled();
    }

    @Override // e4.n0
    @Nullable
    public n0.c getTextComponent() {
        return this;
    }

    @Override // e4.n0
    public long getTotalBufferedDuration() {
        f0();
        return this.f60267c.getTotalBufferedDuration();
    }

    @Override // e4.n0
    @Nullable
    public n0.d getVideoComponent() {
        return this;
    }

    @Override // e4.n0
    public boolean isPlayingAd() {
        f0();
        return this.f60267c.isPlayingAd();
    }

    @Override // e4.n0
    public void seekTo(int i10, long j10) {
        f0();
        this.f60277m.F();
        this.f60267c.seekTo(i10, j10);
    }

    @Override // e4.n0
    public void setPlayWhenReady(boolean z10) {
        f0();
        d0(z10, this.f60279o.n(z10, getPlaybackState()));
    }

    @Override // e4.n0
    public void setRepeatMode(int i10) {
        f0();
        this.f60267c.setRepeatMode(i10);
    }

    @Override // e4.n0
    public void setShuffleModeEnabled(boolean z10) {
        f0();
        this.f60267c.setShuffleModeEnabled(z10);
    }

    @Override // e4.n0.d
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        a0(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // e4.n0.d
    public void setVideoTextureView(@Nullable TextureView textureView) {
        f0();
        V();
        if (textureView != null) {
            L();
        }
        this.f60289y = textureView;
        if (textureView == null) {
            b0(null, true);
            R(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            a6.m.h("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f60269e);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            b0(null, true);
            R(0, 0);
        } else {
            b0(new Surface(surfaceTexture), true);
            R(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // e4.n0
    public void stop(boolean z10) {
        f0();
        this.f60279o.n(getPlayWhenReady(), 1);
        this.f60267c.stop(z10);
        e5.r rVar = this.G;
        if (rVar != null) {
            rVar.f(this.f60277m);
            this.f60277m.G();
            if (z10) {
                this.G = null;
            }
        }
        this.H = Collections.emptyList();
    }
}
