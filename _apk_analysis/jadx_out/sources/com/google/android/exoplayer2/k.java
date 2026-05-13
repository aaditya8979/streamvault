package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.b;
import com.google.android.exoplayer2.c;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.l;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.s;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.exoplayer2.w;
import com.google.common.collect.ImmutableList;
import com.ironsource.C3978d4;
import d6.g2;
import d6.h2;
import d6.k1;
import d6.o1;
import d6.v1;
import d6.x0;
import d6.x1;
import e6.q1;
import e6.s1;
import e7.c0;
import e7.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import s7.e0;
import s7.m0;
import s7.p;

/* JADX INFO: compiled from: ExoPlayerImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends com.google.android.exoplayer2.d implements j {
    public final com.google.android.exoplayer2.c A;
    public final a0 B;
    public final g2 C;
    public final h2 D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public x1 L;
    public e7.c0 M;
    public boolean N;
    public v.b O;
    public q P;
    public q Q;

    @Nullable
    public m R;

    @Nullable
    public m S;

    @Nullable
    public AudioTrack T;

    @Nullable
    public Object U;

    @Nullable
    public Surface V;

    @Nullable
    public SurfaceHolder W;

    @Nullable
    public SphericalGLSurfaceView X;
    public boolean Y;

    @Nullable
    public TextureView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f21632a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7.b0 f21633b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f21634b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v.b f21635c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public e0 f21636c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s7.g f21637d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @Nullable
    public g6.e f21638d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f21639e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @Nullable
    public g6.e f21640e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f21641f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f21642f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y[] f21643g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.a f21644g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q7.a0 f21645h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f21646h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s7.m f21647i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f21648i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l.f f21649j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public g7.f f21650j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f21651k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f21652k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s7.p<v.d> f21653l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f21654l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet<j.a> f21655m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @Nullable
    public s7.c0 f21656m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0.b f21657n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f21658n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<e> f21659o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f21660o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f21661p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public i f21662p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i.a f21663q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public t7.x f21664q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e6.a f21665r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public q f21666r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Looper f21667s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public o1 f21668s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r7.d f21669t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f21670t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f21671u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f21672u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f21673v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f21674v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s7.d f21675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f21676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f21677y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.google.android.exoplayer2.b f21678z;

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    @RequiresApi(31)
    public static final class b {
        @DoNotInline
        public static s1 a(Context context, k kVar, boolean z10) {
            q1 q1VarA0 = q1.A0(context);
            if (q1VarA0 == null) {
                s7.q.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new s1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                kVar.r0(q1VarA0);
            }
            return new s1(q1VarA0.H0());
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public final class c implements t7.v, com.google.android.exoplayer2.audio.b, g7.o, v6.d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.b, c.b, b.InterfaceC0299b, a0.b, j.a {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(v.d dVar) {
            dVar.m(k.this.P);
        }

        @Override // t7.v
        public void a(m mVar, @Nullable g6.g gVar) {
            k.this.R = mVar;
            k.this.f21665r.a(mVar, gVar);
        }

        @Override // t7.v
        public void b(g6.e eVar) {
            k.this.f21665r.b(eVar);
            k.this.R = null;
            k.this.f21638d0 = null;
        }

        @Override // t7.v
        public void c(final t7.x xVar) {
            k.this.f21664q0 = xVar;
            k.this.f21653l.l(25, new p.a() { // from class: d6.t0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).c(xVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.b
        public void d(m mVar, @Nullable g6.g gVar) {
            k.this.S = mVar;
            k.this.f21665r.d(mVar, gVar);
        }

        @Override // v6.d
        public void e(final Metadata metadata) {
            k kVar = k.this;
            kVar.f21666r0 = kVar.f21666r0.b().I(metadata).F();
            q qVarU0 = k.this.u0();
            if (!qVarU0.equals(k.this.P)) {
                k.this.P = qVarU0;
                k.this.f21653l.i(14, new p.a() { // from class: d6.m0
                    @Override // s7.p.a
                    public final void invoke(Object obj) {
                        this.f59658a.x((v.d) obj);
                    }
                });
            }
            k.this.f21653l.i(28, new p.a() { // from class: d6.n0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).e(metadata);
                }
            });
            k.this.f21653l.f();
        }

        @Override // com.google.android.exoplayer2.c.b
        public void executePlayerCommand(int i10) {
            boolean playWhenReady = k.this.getPlayWhenReady();
            k.this.F1(playWhenReady, i10, k.G0(playWhenReady, i10));
        }

        @Override // com.google.android.exoplayer2.j.a
        public void f(boolean z10) {
            k.this.I1();
        }

        @Override // g7.o
        public void g(final g7.f fVar) {
            k.this.f21650j0 = fVar;
            k.this.f21653l.l(27, new p.a() { // from class: d6.r0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).g(fVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.b
        public void h(g6.e eVar) {
            k.this.f21665r.h(eVar);
            k.this.S = null;
            k.this.f21640e0 = null;
        }

        @Override // com.google.android.exoplayer2.audio.b
        public void i(g6.e eVar) {
            k.this.f21640e0 = eVar;
            k.this.f21665r.i(eVar);
        }

        @Override // t7.v
        public void j(g6.e eVar) {
            k.this.f21638d0 = eVar;
            k.this.f21665r.j(eVar);
        }

        @Override // com.google.android.exoplayer2.b.InterfaceC0299b
        public void onAudioBecomingNoisy() {
            k.this.F1(false, -1, 3);
        }

        @Override // com.google.android.exoplayer2.audio.b
        public void onAudioCodecError(Exception exc) {
            k.this.f21665r.onAudioCodecError(exc);
        }

        @Override // com.google.android.exoplayer2.audio.b
        public void onAudioDecoderInitialized(String str, long j10, long j11) {
            k.this.f21665r.onAudioDecoderInitialized(str, j10, j11);
        }

        @Override // com.google.android.exoplayer2.audio.b
        public void onAudioDecoderReleased(String str) {
            k.this.f21665r.onAudioDecoderReleased(str);
        }

        @Override // com.google.android.exoplayer2.audio.b
        public void onAudioPositionAdvancing(long j10) {
            k.this.f21665r.onAudioPositionAdvancing(j10);
        }

        @Override // com.google.android.exoplayer2.audio.b
        public void onAudioSinkError(Exception exc) {
            k.this.f21665r.onAudioSinkError(exc);
        }

        @Override // com.google.android.exoplayer2.audio.b
        public void onAudioUnderrun(int i10, long j10, long j11) {
            k.this.f21665r.onAudioUnderrun(i10, j10, j11);
        }

        @Override // g7.o
        public void onCues(final List<g7.b> list) {
            k.this.f21653l.l(27, new p.a() { // from class: d6.o0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).onCues(list);
                }
            });
        }

        @Override // t7.v
        public void onDroppedFrames(int i10, long j10) {
            k.this.f21665r.onDroppedFrames(i10, j10);
        }

        @Override // t7.v
        public void onRenderedFirstFrame(Object obj, long j10) {
            k.this.f21665r.onRenderedFirstFrame(obj, j10);
            if (k.this.U == obj) {
                k.this.f21653l.l(26, new p.a() { // from class: d6.s0
                    @Override // s7.p.a
                    public final void invoke(Object obj2) {
                        ((v.d) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.audio.b
        public void onSkipSilenceEnabledChanged(final boolean z10) {
            if (k.this.f21648i0 == z10) {
                return;
            }
            k.this.f21648i0 = z10;
            k.this.f21653l.l(23, new p.a() { // from class: d6.u0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
        }

        @Override // com.google.android.exoplayer2.a0.b
        public void onStreamTypeChanged(int i10) {
            final i iVarX0 = k.x0(k.this.B);
            if (iVarX0.equals(k.this.f21662p0)) {
                return;
            }
            k.this.f21662p0 = iVarX0;
            k.this.f21653l.l(29, new p.a() { // from class: d6.p0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).A(iVarX0);
                }
            });
        }

        @Override // com.google.android.exoplayer2.a0.b
        public void onStreamVolumeChanged(final int i10, final boolean z10) {
            k.this.f21653l.l(30, new p.a() { // from class: d6.q0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).onDeviceVolumeChanged(i10, z10);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            k.this.A1(surfaceTexture);
            k.this.o1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            k.this.B1(null);
            k.this.o1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            k.this.o1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // t7.v
        public void onVideoCodecError(Exception exc) {
            k.this.f21665r.onVideoCodecError(exc);
        }

        @Override // t7.v
        public void onVideoDecoderInitialized(String str, long j10, long j11) {
            k.this.f21665r.onVideoDecoderInitialized(str, j10, j11);
        }

        @Override // t7.v
        public void onVideoDecoderReleased(String str) {
            k.this.f21665r.onVideoDecoderReleased(str);
        }

        @Override // t7.v
        public void onVideoFrameProcessingOffset(long j10, int i10) {
            k.this.f21665r.onVideoFrameProcessingOffset(j10, i10);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.b
        public void onVideoSurfaceCreated(Surface surface) {
            k.this.B1(surface);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.b
        public void onVideoSurfaceDestroyed(Surface surface) {
            k.this.B1(null);
        }

        @Override // com.google.android.exoplayer2.c.b
        public void setVolumeMultiplier(float f10) {
            k.this.v1();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            k.this.o1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (k.this.Y) {
                k.this.B1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (k.this.Y) {
                k.this.B1(null);
            }
            k.this.o1(0, 0);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class d implements t7.i, u7.a, w.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public t7.i f21680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public u7.a f21681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public t7.i f21682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public u7.a f21683e;

        public d() {
        }

        @Override // t7.i
        public void a(long j10, long j11, m mVar, @Nullable MediaFormat mediaFormat) {
            t7.i iVar = this.f21682d;
            if (iVar != null) {
                iVar.a(j10, j11, mVar, mediaFormat);
            }
            t7.i iVar2 = this.f21680b;
            if (iVar2 != null) {
                iVar2.a(j10, j11, mVar, mediaFormat);
            }
        }

        @Override // com.google.android.exoplayer2.w.b
        public void handleMessage(int i10, @Nullable Object obj) {
            if (i10 == 7) {
                this.f21680b = (t7.i) obj;
                return;
            }
            if (i10 == 8) {
                this.f21681c = (u7.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f21682d = null;
                this.f21683e = null;
            } else {
                this.f21682d = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f21683e = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // u7.a
        public void onCameraMotion(long j10, float[] fArr) {
            u7.a aVar = this.f21683e;
            if (aVar != null) {
                aVar.onCameraMotion(j10, fArr);
            }
            u7.a aVar2 = this.f21681c;
            if (aVar2 != null) {
                aVar2.onCameraMotion(j10, fArr);
            }
        }

        @Override // u7.a
        public void onCameraMotionReset() {
            u7.a aVar = this.f21683e;
            if (aVar != null) {
                aVar.onCameraMotionReset();
            }
            u7.a aVar2 = this.f21681c;
            if (aVar2 != null) {
                aVar2.onCameraMotionReset();
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class e implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f21684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c0 f21685b;

        public e(Object obj, c0 c0Var) {
            this.f21684a = obj;
            this.f21685b = c0Var;
        }

        @Override // d6.k1
        public c0 getTimeline() {
            return this.f21685b;
        }

        @Override // d6.k1
        public Object getUid() {
            return this.f21684a;
        }
    }

    static {
        x0.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public k(j.b bVar, @Nullable v vVar) {
        s7.g gVar = new s7.g();
        this.f21637d = gVar;
        try {
            s7.q.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.2] [" + m0.f79491e + C3978d4.j.f31385e);
            Context applicationContext = bVar.f21606a.getApplicationContext();
            this.f21639e = applicationContext;
            e6.a aVarApply = bVar.f21614i.apply(bVar.f21607b);
            this.f21665r = aVarApply;
            this.f21656m0 = bVar.f21616k;
            this.f21644g0 = bVar.f21617l;
            this.f21632a0 = bVar.f21622q;
            this.f21634b0 = bVar.f21623r;
            this.f21648i0 = bVar.f21621p;
            this.E = bVar.f21630y;
            c cVar = new c();
            this.f21676x = cVar;
            d dVar = new d();
            this.f21677y = dVar;
            Handler handler = new Handler(bVar.f21615j);
            y[] yVarArrA = bVar.f21609d.get().a(handler, cVar, cVar, cVar, cVar);
            this.f21643g = yVarArrA;
            s7.a.g(yVarArrA.length > 0);
            q7.a0 a0Var = bVar.f21611f.get();
            this.f21645h = a0Var;
            this.f21663q = bVar.f21610e.get();
            r7.d dVar2 = bVar.f21613h.get();
            this.f21669t = dVar2;
            this.f21661p = bVar.f21624s;
            this.L = bVar.f21625t;
            this.f21671u = bVar.f21626u;
            this.f21673v = bVar.f21627v;
            this.N = bVar.f21631z;
            Looper looper = bVar.f21615j;
            this.f21667s = looper;
            s7.d dVar3 = bVar.f21607b;
            this.f21675w = dVar3;
            v vVar2 = vVar == null ? this : vVar;
            this.f21641f = vVar2;
            this.f21653l = new s7.p<>(looper, dVar3, new p.b() { // from class: d6.y
                @Override // s7.p.b
                public final void a(Object obj, s7.l lVar) {
                    this.f59721a.P0((v.d) obj, lVar);
                }
            });
            this.f21655m = new CopyOnWriteArraySet<>();
            this.f21659o = new ArrayList();
            this.M = new c0.a(0);
            q7.b0 b0Var = new q7.b0(new v1[yVarArrA.length], new q7.r[yVarArrA.length], d0.f21420c, null);
            this.f21633b = b0Var;
            this.f21657n = new c0.b();
            v.b bVarE = new v.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).d(29, a0Var.e()).e();
            this.f21635c = bVarE;
            this.O = new v.b.a().b(bVarE).a(4).a(10).e();
            this.f21647i = dVar3.createHandler(looper, null);
            l.f fVar = new l.f() { // from class: d6.e0
                @Override // com.google.android.exoplayer2.l.f
                public final void a(l.e eVar) {
                    this.f59609a.R0(eVar);
                }
            };
            this.f21649j = fVar;
            this.f21668s0 = o1.j(b0Var);
            aVarApply.n(vVar2, looper);
            int i10 = m0.f79487a;
            l lVar = new l(yVarArrA, a0Var, b0Var, bVar.f21612g.get(), dVar2, this.F, this.G, aVarApply, this.L, bVar.f21628w, bVar.f21629x, this.N, looper, dVar3, fVar, i10 < 31 ? new s1() : b.a(applicationContext, this, bVar.A));
            this.f21651k = lVar;
            this.f21646h0 = 1.0f;
            this.F = 0;
            q qVar = q.H;
            this.P = qVar;
            this.Q = qVar;
            this.f21666r0 = qVar;
            this.f21670t0 = -1;
            if (i10 < 21) {
                this.f21642f0 = M0(0);
            } else {
                this.f21642f0 = m0.C(applicationContext);
            }
            this.f21650j0 = g7.f.f62171d;
            this.f21652k0 = true;
            f(aVarApply);
            dVar2.b(new Handler(looper), aVarApply);
            s0(cVar);
            long j10 = bVar.f21608c;
            if (j10 > 0) {
                lVar.r(j10);
            }
            com.google.android.exoplayer2.b bVar2 = new com.google.android.exoplayer2.b(bVar.f21606a, handler, cVar);
            this.f21678z = bVar2;
            bVar2.b(bVar.f21620o);
            com.google.android.exoplayer2.c cVar2 = new com.google.android.exoplayer2.c(bVar.f21606a, handler, cVar);
            this.A = cVar2;
            cVar2.m(bVar.f21618m ? this.f21644g0 : null);
            a0 a0Var2 = new a0(bVar.f21606a, handler, cVar);
            this.B = a0Var2;
            a0Var2.h(m0.a0(this.f21644g0.f21269d));
            g2 g2Var = new g2(bVar.f21606a);
            this.C = g2Var;
            g2Var.a(bVar.f21619n != 0);
            h2 h2Var = new h2(bVar.f21606a);
            this.D = h2Var;
            h2Var.a(bVar.f21619n == 2);
            this.f21662p0 = x0(a0Var2);
            this.f21664q0 = t7.x.f85194f;
            this.f21636c0 = e0.f79453c;
            a0Var.i(this.f21644g0);
            u1(1, 10, Integer.valueOf(this.f21642f0));
            u1(2, 10, Integer.valueOf(this.f21642f0));
            u1(1, 3, this.f21644g0);
            u1(2, 4, Integer.valueOf(this.f21632a0));
            u1(2, 5, Integer.valueOf(this.f21634b0));
            u1(1, 9, Boolean.valueOf(this.f21648i0));
            u1(2, 7, dVar);
            u1(6, 8, dVar);
            gVar.e();
        } catch (Throwable th2) {
            this.f21637d.e();
            throw th2;
        }
    }

    public static int G0(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    public static long K0(o1 o1Var) {
        c0.d dVar = new c0.d();
        c0.b bVar = new c0.b();
        o1Var.f59665a.l(o1Var.f59666b.f60899a, bVar);
        return o1Var.f59667c == -9223372036854775807L ? o1Var.f59665a.r(bVar.f21389d, dVar).f() : bVar.q() + o1Var.f59667c;
    }

    public static boolean N0(o1 o1Var) {
        return o1Var.f59669e == 3 && o1Var.f59676l && o1Var.f59677m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(v.d dVar, s7.l lVar) {
        dVar.G(this.f21641f, new v.c(lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(final l.e eVar) {
        this.f21647i.post(new Runnable() { // from class: d6.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f59586b.Q0(eVar);
            }
        });
    }

    public static /* synthetic */ void S0(v.d dVar) {
        dVar.q(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(v.d dVar) {
        dVar.z(this.O);
    }

    public static /* synthetic */ void Y0(o1 o1Var, int i10, v.d dVar) {
        dVar.l(o1Var.f59665a, i10);
    }

    public static /* synthetic */ void Z0(int i10, v.e eVar, v.e eVar2, v.d dVar) {
        dVar.onPositionDiscontinuity(i10);
        dVar.k(eVar, eVar2, i10);
    }

    public static /* synthetic */ void b1(o1 o1Var, v.d dVar) {
        dVar.p(o1Var.f59670f);
    }

    public static /* synthetic */ void c1(o1 o1Var, v.d dVar) {
        dVar.q(o1Var.f59670f);
    }

    public static /* synthetic */ void d1(o1 o1Var, v.d dVar) {
        dVar.E(o1Var.f59673i.f78029d);
    }

    public static /* synthetic */ void f1(o1 o1Var, v.d dVar) {
        dVar.onLoadingChanged(o1Var.f59671g);
        dVar.onIsLoadingChanged(o1Var.f59671g);
    }

    public static /* synthetic */ void g1(o1 o1Var, v.d dVar) {
        dVar.onPlayerStateChanged(o1Var.f59676l, o1Var.f59669e);
    }

    public static /* synthetic */ void h1(o1 o1Var, v.d dVar) {
        dVar.onPlaybackStateChanged(o1Var.f59669e);
    }

    public static /* synthetic */ void i1(o1 o1Var, int i10, v.d dVar) {
        dVar.onPlayWhenReadyChanged(o1Var.f59676l, i10);
    }

    public static /* synthetic */ void j1(o1 o1Var, v.d dVar) {
        dVar.onPlaybackSuppressionReasonChanged(o1Var.f59677m);
    }

    public static /* synthetic */ void k1(o1 o1Var, v.d dVar) {
        dVar.onIsPlayingChanged(N0(o1Var));
    }

    public static /* synthetic */ void l1(o1 o1Var, v.d dVar) {
        dVar.f(o1Var.f59678n);
    }

    public static i x0(a0 a0Var) {
        return new i(0, a0Var.d(), a0Var.c());
    }

    public final w A0(w.b bVar) {
        int iE0 = E0();
        l lVar = this.f21651k;
        c0 c0Var = this.f21668s0.f59665a;
        if (iE0 == -1) {
            iE0 = 0;
        }
        return new w(lVar, bVar, c0Var, iE0, this.f21675w, lVar.y());
    }

    public final void A1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        B1(surface);
        this.V = surface;
    }

    public final Pair<Boolean, Integer> B0(o1 o1Var, o1 o1Var2, boolean z10, int i10, boolean z11, boolean z12) {
        c0 c0Var = o1Var2.f59665a;
        c0 c0Var2 = o1Var.f59665a;
        if (c0Var2.u() && c0Var.u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (c0Var2.u() != c0Var.u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (c0Var.r(c0Var.l(o1Var2.f59666b.f60899a, this.f21657n).f21389d, this.f21419a).f21402b.equals(c0Var2.r(c0Var2.l(o1Var.f59666b.f60899a, this.f21657n).f21389d, this.f21419a).f21402b)) {
            return (z10 && i10 == 0 && o1Var2.f59666b.f60902d < o1Var.f59666b.f60902d) ? new Pair<>(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    public final void B1(@Nullable Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        y[] yVarArr = this.f21643g;
        int length = yVarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            y yVar = yVarArr[i10];
            if (yVar.getTrackType() == 2) {
                arrayList.add(A0(yVar).m(1).l(obj).k());
            }
            i10++;
        }
        Object obj2 = this.U;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((w) it.next()).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z10) {
            D1(false, ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
        }
    }

    public boolean C0() {
        J1();
        return this.f21668s0.f59679o;
    }

    public void C1(@Nullable SurfaceHolder surfaceHolder) {
        J1();
        if (surfaceHolder == null) {
            v0();
            return;
        }
        s1();
        this.Y = true;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.f21676x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            B1(null);
            o1(0, 0);
        } else {
            B1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            o1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final long D0(o1 o1Var) {
        return o1Var.f59665a.u() ? m0.w0(this.f21674v0) : o1Var.f59666b.b() ? o1Var.f59682r : p1(o1Var.f59665a, o1Var.f59666b, o1Var.f59682r);
    }

    public final void D1(boolean z10, @Nullable ExoPlaybackException exoPlaybackException) {
        o1 o1VarB;
        if (z10) {
            o1VarB = q1(0, this.f21659o.size()).e(null);
        } else {
            o1 o1Var = this.f21668s0;
            o1VarB = o1Var.b(o1Var.f59666b);
            o1VarB.f59680p = o1VarB.f59682r;
            o1VarB.f59681q = 0L;
        }
        o1 o1VarG = o1VarB.g(1);
        if (exoPlaybackException != null) {
            o1VarG = o1VarG.e(exoPlaybackException);
        }
        o1 o1Var2 = o1VarG;
        this.H++;
        this.f21651k.d1();
        G1(o1Var2, 0, 1, false, o1Var2.f59665a.u() && !this.f21668s0.f59665a.u(), 4, D0(o1Var2), -1, false);
    }

    public final int E0() {
        if (this.f21668s0.f59665a.u()) {
            return this.f21670t0;
        }
        o1 o1Var = this.f21668s0;
        return o1Var.f59665a.l(o1Var.f59666b.f60899a, this.f21657n).f21389d;
    }

    public final void E1() {
        v.b bVar = this.O;
        v.b bVarE = m0.E(this.f21641f, this.f21635c);
        this.O = bVarE;
        if (bVarE.equals(bVar)) {
            return;
        }
        this.f21653l.i(13, new p.a() { // from class: d6.d0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                this.f59599a.X0((v.d) obj);
            }
        });
    }

    @Nullable
    public final Pair<Object, Long> F0(c0 c0Var, c0 c0Var2) {
        long contentPosition = getContentPosition();
        if (c0Var.u() || c0Var2.u()) {
            boolean z10 = !c0Var.u() && c0Var2.u();
            int iE0 = z10 ? -1 : E0();
            if (z10) {
                contentPosition = -9223372036854775807L;
            }
            return n1(c0Var2, iE0, contentPosition);
        }
        Pair<Object, Long> pairN = c0Var.n(this.f21419a, this.f21657n, getCurrentMediaItemIndex(), m0.w0(contentPosition));
        Object obj = ((Pair) m0.j(pairN)).first;
        if (c0Var2.f(obj) != -1) {
            return pairN;
        }
        Object objV0 = l.v0(this.f21419a, this.f21657n, this.F, this.G, obj, c0Var, c0Var2);
        if (objV0 == null) {
            return n1(c0Var2, -1, -9223372036854775807L);
        }
        c0Var2.l(objV0, this.f21657n);
        int i10 = this.f21657n.f21389d;
        return n1(c0Var2, i10, c0Var2.r(i10, this.f21419a).e());
    }

    public final void F1(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        o1 o1Var = this.f21668s0;
        if (o1Var.f59676l == z11 && o1Var.f59677m == i12) {
            return;
        }
        this.H++;
        o1 o1VarD = o1Var.d(z11, i12);
        this.f21651k.M0(z11, i12);
        G1(o1VarD, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final void G1(final o1 o1Var, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13, boolean z12) {
        o1 o1Var2 = this.f21668s0;
        this.f21668s0 = o1Var;
        boolean z13 = !o1Var2.f59665a.equals(o1Var.f59665a);
        Pair<Boolean, Integer> pairB0 = B0(o1Var, o1Var2, z11, i12, z13, z12);
        boolean zBooleanValue = ((Boolean) pairB0.first).booleanValue();
        final int iIntValue = ((Integer) pairB0.second).intValue();
        q qVarU0 = this.P;
        if (zBooleanValue) {
            pVar = o1Var.f59665a.u() ? null : o1Var.f59665a.r(o1Var.f59665a.l(o1Var.f59666b.f60899a, this.f21657n).f21389d, this.f21419a).f21404d;
            this.f21666r0 = q.H;
        }
        if (zBooleanValue || !o1Var2.f59674j.equals(o1Var.f59674j)) {
            this.f21666r0 = this.f21666r0.b().J(o1Var.f59674j).F();
            qVarU0 = u0();
        }
        boolean z14 = !qVarU0.equals(this.P);
        this.P = qVarU0;
        boolean z15 = o1Var2.f59676l != o1Var.f59676l;
        boolean z16 = o1Var2.f59669e != o1Var.f59669e;
        if (z16 || z15) {
            I1();
        }
        boolean z17 = o1Var2.f59671g;
        boolean z18 = o1Var.f59671g;
        boolean z19 = z17 != z18;
        if (z19) {
            H1(z18);
        }
        if (z13) {
            this.f21653l.i(0, new p.a() { // from class: d6.k0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.Y0(o1Var, i10, (v.d) obj);
                }
            });
        }
        if (z11) {
            final v.e eVarJ0 = J0(i12, o1Var2, i13);
            final v.e eVarI0 = I0(j10);
            this.f21653l.i(11, new p.a() { // from class: d6.s
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.Z0(i12, eVarJ0, eVarI0, (v.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f21653l.i(1, new p.a() { // from class: d6.t
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).I(pVar, iIntValue);
                }
            });
        }
        if (o1Var2.f59670f != o1Var.f59670f) {
            this.f21653l.i(10, new p.a() { // from class: d6.u
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.b1(o1Var, (v.d) obj);
                }
            });
            if (o1Var.f59670f != null) {
                this.f21653l.i(10, new p.a() { // from class: d6.v
                    @Override // s7.p.a
                    public final void invoke(Object obj) {
                        com.google.android.exoplayer2.k.c1(o1Var, (v.d) obj);
                    }
                });
            }
        }
        q7.b0 b0Var = o1Var2.f59673i;
        q7.b0 b0Var2 = o1Var.f59673i;
        if (b0Var != b0Var2) {
            this.f21645h.f(b0Var2.f78030e);
            this.f21653l.i(2, new p.a() { // from class: d6.w
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.d1(o1Var, (v.d) obj);
                }
            });
        }
        if (z14) {
            final q qVar = this.P;
            this.f21653l.i(14, new p.a() { // from class: d6.x
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).m(qVar);
                }
            });
        }
        if (z19) {
            this.f21653l.i(3, new p.a() { // from class: d6.z
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.f1(o1Var, (v.d) obj);
                }
            });
        }
        if (z16 || z15) {
            this.f21653l.i(-1, new p.a() { // from class: d6.a0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.g1(o1Var, (v.d) obj);
                }
            });
        }
        if (z16) {
            this.f21653l.i(4, new p.a() { // from class: d6.b0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.h1(o1Var, (v.d) obj);
                }
            });
        }
        if (z15) {
            this.f21653l.i(5, new p.a() { // from class: d6.l0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.i1(o1Var, i11, (v.d) obj);
                }
            });
        }
        if (o1Var2.f59677m != o1Var.f59677m) {
            this.f21653l.i(6, new p.a() { // from class: d6.o
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.j1(o1Var, (v.d) obj);
                }
            });
        }
        if (N0(o1Var2) != N0(o1Var)) {
            this.f21653l.i(7, new p.a() { // from class: d6.p
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.k1(o1Var, (v.d) obj);
                }
            });
        }
        if (!o1Var2.f59678n.equals(o1Var.f59678n)) {
            this.f21653l.i(12, new p.a() { // from class: d6.q
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.l1(o1Var, (v.d) obj);
                }
            });
        }
        if (z10) {
            this.f21653l.i(-1, new p.a() { // from class: d6.r
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).onSeekProcessed();
                }
            });
        }
        E1();
        this.f21653l.f();
        if (o1Var2.f59679o != o1Var.f59679o) {
            Iterator<j.a> it = this.f21655m.iterator();
            while (it.hasNext()) {
                it.next().f(o1Var.f59679o);
            }
        }
    }

    @Override // com.google.android.exoplayer2.v
    @Nullable
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public ExoPlaybackException getPlayerError() {
        J1();
        return this.f21668s0.f59670f;
    }

    public final void H1(boolean z10) {
        s7.c0 c0Var = this.f21656m0;
        if (c0Var != null) {
            if (z10 && !this.f21658n0) {
                c0Var.a(0);
                this.f21658n0 = true;
            } else {
                if (z10 || !this.f21658n0) {
                    return;
                }
                c0Var.b(0);
                this.f21658n0 = false;
            }
        }
    }

    public final v.e I0(long j10) {
        int iF;
        p pVar;
        Object obj;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        Object obj2 = null;
        if (this.f21668s0.f59665a.u()) {
            iF = -1;
            pVar = null;
            obj = null;
        } else {
            o1 o1Var = this.f21668s0;
            Object obj3 = o1Var.f59666b.f60899a;
            o1Var.f59665a.l(obj3, this.f21657n);
            iF = this.f21668s0.f59665a.f(obj3);
            obj = obj3;
            obj2 = this.f21668s0.f59665a.r(currentMediaItemIndex, this.f21419a).f21402b;
            pVar = this.f21419a.f21404d;
        }
        long jQ0 = m0.Q0(j10);
        long jQ02 = this.f21668s0.f59666b.b() ? m0.Q0(K0(this.f21668s0)) : jQ0;
        i.b bVar = this.f21668s0.f59666b;
        return new v.e(obj2, currentMediaItemIndex, pVar, obj, iF, jQ0, jQ02, bVar.f60900b, bVar.f60901c);
    }

    public final void I1() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.C.b(getPlayWhenReady() && !C0());
                this.D.b(getPlayWhenReady());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    public final v.e J0(int i10, o1 o1Var, int i11) {
        int i12;
        int iF;
        Object obj;
        p pVar;
        Object obj2;
        long jK0;
        long jK02;
        c0.b bVar = new c0.b();
        if (o1Var.f59665a.u()) {
            i12 = i11;
            iF = -1;
            obj = null;
            pVar = null;
            obj2 = null;
        } else {
            Object obj3 = o1Var.f59666b.f60899a;
            o1Var.f59665a.l(obj3, bVar);
            int i13 = bVar.f21389d;
            i12 = i13;
            obj2 = obj3;
            iF = o1Var.f59665a.f(obj3);
            obj = o1Var.f59665a.r(i13, this.f21419a).f21402b;
            pVar = this.f21419a.f21404d;
        }
        if (i10 == 0) {
            if (o1Var.f59666b.b()) {
                i.b bVar2 = o1Var.f59666b;
                jK0 = bVar.e(bVar2.f60900b, bVar2.f60901c);
                jK02 = K0(o1Var);
            } else {
                jK0 = o1Var.f59666b.f60903e != -1 ? K0(this.f21668s0) : bVar.f21391f + bVar.f21390e;
                jK02 = jK0;
            }
        } else if (o1Var.f59666b.b()) {
            jK0 = o1Var.f59682r;
            jK02 = K0(o1Var);
        } else {
            jK0 = bVar.f21391f + o1Var.f59682r;
            jK02 = jK0;
        }
        long jQ0 = m0.Q0(jK0);
        long jQ02 = m0.Q0(jK02);
        i.b bVar3 = o1Var.f59666b;
        return new v.e(obj, i12, pVar, obj2, iF, jQ0, jQ02, bVar3.f60900b, bVar3.f60901c);
    }

    public final void J1() {
        this.f21637d.b();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String strZ = m0.z("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.f21652k0) {
                throw new IllegalStateException(strZ);
            }
            s7.q.j("ExoPlayerImpl", strZ, this.f21654l0 ? null : new IllegalStateException());
            this.f21654l0 = true;
        }
    }

    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final void Q0(l.e eVar) {
        long j10;
        boolean z10;
        long jP1;
        int i10 = this.H - eVar.f21726c;
        this.H = i10;
        boolean z11 = true;
        if (eVar.f21727d) {
            this.I = eVar.f21728e;
            this.J = true;
        }
        if (eVar.f21729f) {
            this.K = eVar.f21730g;
        }
        if (i10 == 0) {
            c0 c0Var = eVar.f21725b.f59665a;
            if (!this.f21668s0.f59665a.u() && c0Var.u()) {
                this.f21670t0 = -1;
                this.f21674v0 = 0L;
                this.f21672u0 = 0;
            }
            if (!c0Var.u()) {
                List<c0> listK = ((d6.s1) c0Var).K();
                s7.a.g(listK.size() == this.f21659o.size());
                for (int i11 = 0; i11 < listK.size(); i11++) {
                    this.f21659o.get(i11).f21685b = listK.get(i11);
                }
            }
            if (this.J) {
                if (eVar.f21725b.f59666b.equals(this.f21668s0.f59666b) && eVar.f21725b.f59668d == this.f21668s0.f59682r) {
                    z11 = false;
                }
                if (z11) {
                    if (c0Var.u() || eVar.f21725b.f59666b.b()) {
                        jP1 = eVar.f21725b.f59668d;
                    } else {
                        o1 o1Var = eVar.f21725b;
                        jP1 = p1(c0Var, o1Var.f59666b, o1Var.f59668d);
                    }
                    j10 = jP1;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.J = false;
            G1(eVar.f21725b, 1, this.K, false, z10, this.I, j10, -1, false);
        }
    }

    public final int M0(int i10) {
        AudioTrack audioTrack = this.T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.T.getAudioSessionId();
    }

    @Override // com.google.android.exoplayer2.j
    public void a(com.google.android.exoplayer2.source.i iVar) {
        J1();
        w1(Collections.singletonList(iVar));
    }

    @Override // com.google.android.exoplayer2.v
    public void b(u uVar) {
        J1();
        if (uVar == null) {
            uVar = u.f22484e;
        }
        if (this.f21668s0.f59678n.equals(uVar)) {
            return;
        }
        o1 o1VarF = this.f21668s0.f(uVar);
        this.H++;
        this.f21651k.O0(uVar);
        G1(o1VarF, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.v
    public void c(v.d dVar) {
        s7.a.e(dVar);
        this.f21653l.k(dVar);
    }

    @Override // com.google.android.exoplayer2.v
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        J1();
        w0(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.v
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        J1();
        if (textureView == null || textureView != this.Z) {
            return;
        }
        v0();
    }

    @Override // com.google.android.exoplayer2.v
    public void d(final q7.y yVar) {
        J1();
        if (!this.f21645h.e() || yVar.equals(this.f21645h.b())) {
            return;
        }
        this.f21645h.j(yVar);
        this.f21653l.l(19, new p.a() { // from class: d6.j0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((v.d) obj).s(yVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v
    public void f(v.d dVar) {
        this.f21653l.c((v.d) s7.a.e(dVar));
    }

    @Override // com.google.android.exoplayer2.v
    public Looper getApplicationLooper() {
        return this.f21667s;
    }

    @Override // com.google.android.exoplayer2.v
    public v.b getAvailableCommands() {
        J1();
        return this.O;
    }

    @Override // com.google.android.exoplayer2.v
    public long getContentBufferedPosition() {
        J1();
        if (this.f21668s0.f59665a.u()) {
            return this.f21674v0;
        }
        o1 o1Var = this.f21668s0;
        if (o1Var.f59675k.f60902d != o1Var.f59666b.f60902d) {
            return o1Var.f59665a.r(getCurrentMediaItemIndex(), this.f21419a).g();
        }
        long j10 = o1Var.f59680p;
        if (this.f21668s0.f59675k.b()) {
            o1 o1Var2 = this.f21668s0;
            c0.b bVarL = o1Var2.f59665a.l(o1Var2.f59675k.f60899a, this.f21657n);
            long jI = bVarL.i(this.f21668s0.f59675k.f60900b);
            j10 = jI == Long.MIN_VALUE ? bVarL.f21390e : jI;
        }
        o1 o1Var3 = this.f21668s0;
        return m0.Q0(p1(o1Var3.f59665a, o1Var3.f59675k, j10));
    }

    @Override // com.google.android.exoplayer2.v
    public long getContentPosition() {
        J1();
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        o1 o1Var = this.f21668s0;
        o1Var.f59665a.l(o1Var.f59666b.f60899a, this.f21657n);
        o1 o1Var2 = this.f21668s0;
        return o1Var2.f59667c == -9223372036854775807L ? o1Var2.f59665a.r(getCurrentMediaItemIndex(), this.f21419a).e() : this.f21657n.p() + m0.Q0(this.f21668s0.f59667c);
    }

    @Override // com.google.android.exoplayer2.v
    public int getCurrentAdGroupIndex() {
        J1();
        if (isPlayingAd()) {
            return this.f21668s0.f59666b.f60900b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.v
    public int getCurrentAdIndexInAdGroup() {
        J1();
        if (isPlayingAd()) {
            return this.f21668s0.f59666b.f60901c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.v
    public g7.f getCurrentCues() {
        J1();
        return this.f21650j0;
    }

    @Override // com.google.android.exoplayer2.v
    public int getCurrentMediaItemIndex() {
        J1();
        int iE0 = E0();
        if (iE0 == -1) {
            return 0;
        }
        return iE0;
    }

    @Override // com.google.android.exoplayer2.v
    public int getCurrentPeriodIndex() {
        J1();
        if (this.f21668s0.f59665a.u()) {
            return this.f21672u0;
        }
        o1 o1Var = this.f21668s0;
        return o1Var.f59665a.f(o1Var.f59666b.f60899a);
    }

    @Override // com.google.android.exoplayer2.v
    public long getCurrentPosition() {
        J1();
        return m0.Q0(D0(this.f21668s0));
    }

    @Override // com.google.android.exoplayer2.v
    public c0 getCurrentTimeline() {
        J1();
        return this.f21668s0.f59665a;
    }

    @Override // com.google.android.exoplayer2.v
    public d0 getCurrentTracks() {
        J1();
        return this.f21668s0.f59673i.f78029d;
    }

    @Override // com.google.android.exoplayer2.v
    public long getDuration() {
        J1();
        if (!isPlayingAd()) {
            return g();
        }
        o1 o1Var = this.f21668s0;
        i.b bVar = o1Var.f59666b;
        o1Var.f59665a.l(bVar.f60899a, this.f21657n);
        return m0.Q0(this.f21657n.e(bVar.f60900b, bVar.f60901c));
    }

    @Override // com.google.android.exoplayer2.v
    public long getMaxSeekToPreviousPosition() {
        J1();
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.v
    public q getMediaMetadata() {
        J1();
        return this.P;
    }

    @Override // com.google.android.exoplayer2.v
    public boolean getPlayWhenReady() {
        J1();
        return this.f21668s0.f59676l;
    }

    @Override // com.google.android.exoplayer2.v
    public u getPlaybackParameters() {
        J1();
        return this.f21668s0.f59678n;
    }

    @Override // com.google.android.exoplayer2.v
    public int getPlaybackState() {
        J1();
        return this.f21668s0.f59669e;
    }

    @Override // com.google.android.exoplayer2.v
    public int getPlaybackSuppressionReason() {
        J1();
        return this.f21668s0.f59677m;
    }

    @Override // com.google.android.exoplayer2.v
    public int getRepeatMode() {
        J1();
        return this.F;
    }

    @Override // com.google.android.exoplayer2.v
    public long getSeekBackIncrement() {
        J1();
        return this.f21671u;
    }

    @Override // com.google.android.exoplayer2.v
    public long getSeekForwardIncrement() {
        J1();
        return this.f21673v;
    }

    @Override // com.google.android.exoplayer2.v
    public boolean getShuffleModeEnabled() {
        J1();
        return this.G;
    }

    @Override // com.google.android.exoplayer2.v
    public long getTotalBufferedDuration() {
        J1();
        return m0.Q0(this.f21668s0.f59681q);
    }

    @Override // com.google.android.exoplayer2.v
    public q7.y getTrackSelectionParameters() {
        J1();
        return this.f21645h.b();
    }

    @Override // com.google.android.exoplayer2.v
    public t7.x getVideoSize() {
        J1();
        return this.f21664q0;
    }

    @Override // com.google.android.exoplayer2.v
    public boolean isPlayingAd() {
        J1();
        return this.f21668s0.f59666b.b();
    }

    @Override // com.google.android.exoplayer2.d
    public void k() {
        J1();
        t1(getCurrentMediaItemIndex(), -9223372036854775807L, true);
    }

    public final o1 m1(o1 o1Var, c0 c0Var, @Nullable Pair<Object, Long> pair) {
        s7.a.a(c0Var.u() || pair != null);
        c0 c0Var2 = o1Var.f59665a;
        o1 o1VarI = o1Var.i(c0Var);
        if (c0Var.u()) {
            i.b bVarK = o1.k();
            long jW0 = m0.w0(this.f21674v0);
            o1 o1VarB = o1VarI.c(bVarK, jW0, jW0, jW0, 0L, i0.f60875e, this.f21633b, ImmutableList.of()).b(bVarK);
            o1VarB.f59680p = o1VarB.f59682r;
            return o1VarB;
        }
        Object obj = o1VarI.f59666b.f60899a;
        boolean z10 = !obj.equals(((Pair) m0.j(pair)).first);
        i.b bVar = z10 ? new i.b(pair.first) : o1VarI.f59666b;
        long jLongValue = ((Long) pair.second).longValue();
        long jW02 = m0.w0(getContentPosition());
        if (!c0Var2.u()) {
            jW02 -= c0Var2.l(obj, this.f21657n).q();
        }
        if (z10 || jLongValue < jW02) {
            s7.a.g(!bVar.b());
            o1 o1VarB2 = o1VarI.c(bVar, jLongValue, jLongValue, jLongValue, 0L, z10 ? i0.f60875e : o1VarI.f59672h, z10 ? this.f21633b : o1VarI.f59673i, z10 ? ImmutableList.of() : o1VarI.f59674j).b(bVar);
            o1VarB2.f59680p = jLongValue;
            return o1VarB2;
        }
        if (jLongValue == jW02) {
            int iF = c0Var.f(o1VarI.f59675k.f60899a);
            if (iF == -1 || c0Var.j(iF, this.f21657n).f21389d != c0Var.l(bVar.f60899a, this.f21657n).f21389d) {
                c0Var.l(bVar.f60899a, this.f21657n);
                long jE = bVar.b() ? this.f21657n.e(bVar.f60900b, bVar.f60901c) : this.f21657n.f21390e;
                o1VarI = o1VarI.c(bVar, o1VarI.f59682r, o1VarI.f59682r, o1VarI.f59668d, jE - o1VarI.f59682r, o1VarI.f59672h, o1VarI.f59673i, o1VarI.f59674j).b(bVar);
                o1VarI.f59680p = jE;
            }
        } else {
            s7.a.g(!bVar.b());
            long jMax = Math.max(0L, o1VarI.f59681q - (jLongValue - jW02));
            long j10 = o1VarI.f59680p;
            if (o1VarI.f59675k.equals(o1VarI.f59666b)) {
                j10 = jLongValue + jMax;
            }
            o1VarI = o1VarI.c(bVar, jLongValue, jLongValue, jLongValue, jMax, o1VarI.f59672h, o1VarI.f59673i, o1VarI.f59674j);
            o1VarI.f59680p = j10;
        }
        return o1VarI;
    }

    @Nullable
    public final Pair<Object, Long> n1(c0 c0Var, int i10, long j10) {
        if (c0Var.u()) {
            this.f21670t0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f21674v0 = j10;
            this.f21672u0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= c0Var.t()) {
            i10 = c0Var.e(this.G);
            j10 = c0Var.r(i10, this.f21419a).e();
        }
        return c0Var.n(this.f21419a, this.f21657n, i10, m0.w0(j10));
    }

    public final void o1(final int i10, final int i11) {
        if (i10 == this.f21636c0.b() && i11 == this.f21636c0.a()) {
            return;
        }
        this.f21636c0 = new e0(i10, i11);
        this.f21653l.l(24, new p.a() { // from class: d6.n
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((v.d) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
    }

    public final long p1(c0 c0Var, i.b bVar, long j10) {
        c0Var.l(bVar.f60899a, this.f21657n);
        return j10 + this.f21657n.q();
    }

    @Override // com.google.android.exoplayer2.v
    public void prepare() {
        J1();
        boolean playWhenReady = getPlayWhenReady();
        int iP = this.A.p(playWhenReady, 2);
        F1(playWhenReady, iP, G0(playWhenReady, iP));
        o1 o1Var = this.f21668s0;
        if (o1Var.f59669e != 1) {
            return;
        }
        o1 o1VarE = o1Var.e(null);
        o1 o1VarG = o1VarE.g(o1VarE.f59665a.u() ? 4 : 2);
        this.H++;
        this.f21651k.f0();
        G1(o1VarG, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final o1 q1(int i10, int i11) {
        boolean z10 = false;
        s7.a.a(i10 >= 0 && i11 >= i10 && i11 <= this.f21659o.size());
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        c0 currentTimeline = getCurrentTimeline();
        int size = this.f21659o.size();
        this.H++;
        r1(i10, i11);
        c0 c0VarY0 = y0();
        o1 o1VarM1 = m1(this.f21668s0, c0VarY0, F0(currentTimeline, c0VarY0));
        int i12 = o1VarM1.f59669e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && currentMediaItemIndex >= o1VarM1.f59665a.t()) {
            z10 = true;
        }
        if (z10) {
            o1VarM1 = o1VarM1.g(4);
        }
        this.f21651k.k0(i10, i11, this.M);
        return o1VarM1;
    }

    public void r0(e6.b bVar) {
        this.f21665r.w((e6.b) s7.a.e(bVar));
    }

    public final void r1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f21659o.remove(i12);
        }
        this.M = this.M.cloneAndRemove(i10, i11);
    }

    @Override // com.google.android.exoplayer2.v
    public void release() {
        AudioTrack audioTrack;
        s7.q.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.2] [" + m0.f79491e + "] [" + x0.b() + C3978d4.j.f31385e);
        J1();
        if (m0.f79487a < 21 && (audioTrack = this.T) != null) {
            audioTrack.release();
            this.T = null;
        }
        this.f21678z.b(false);
        this.B.g();
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.f21651k.h0()) {
            this.f21653l.l(10, new p.a() { // from class: d6.g0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    com.google.android.exoplayer2.k.S0((v.d) obj);
                }
            });
        }
        this.f21653l.j();
        this.f21647i.removeCallbacksAndMessages(null);
        this.f21669t.d(this.f21665r);
        o1 o1VarG = this.f21668s0.g(1);
        this.f21668s0 = o1VarG;
        o1 o1VarB = o1VarG.b(o1VarG.f59666b);
        this.f21668s0 = o1VarB;
        o1VarB.f59680p = o1VarB.f59682r;
        this.f21668s0.f59681q = 0L;
        this.f21665r.release();
        this.f21645h.g();
        s1();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        if (this.f21658n0) {
            ((s7.c0) s7.a.e(this.f21656m0)).b(0);
            this.f21658n0 = false;
        }
        this.f21650j0 = g7.f.f62171d;
        this.f21660o0 = true;
    }

    public void s0(j.a aVar) {
        this.f21655m.add(aVar);
    }

    public final void s1() {
        if (this.X != null) {
            A0(this.f21677y).m(10000).l(null).k();
            this.X.i(this.f21676x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f21676x) {
                s7.q.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f21676x);
            this.W = null;
        }
    }

    @Override // com.google.android.exoplayer2.v
    public void seekTo(int i10, long j10) {
        J1();
        t1(i10, j10, false);
    }

    @Override // com.google.android.exoplayer2.v
    public void setMediaItems(List<p> list, boolean z10) {
        J1();
        x1(z0(list), z10);
    }

    @Override // com.google.android.exoplayer2.v
    public void setPlayWhenReady(boolean z10) {
        J1();
        int iP = this.A.p(z10, getPlaybackState());
        F1(z10, iP, G0(z10, iP));
    }

    @Override // com.google.android.exoplayer2.v
    public void setRepeatMode(final int i10) {
        J1();
        if (this.F != i10) {
            this.F = i10;
            this.f21651k.Q0(i10);
            this.f21653l.i(8, new p.a() { // from class: d6.i0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).onRepeatModeChanged(i10);
                }
            });
            E1();
            this.f21653l.f();
        }
    }

    @Override // com.google.android.exoplayer2.v
    public void setShuffleModeEnabled(final boolean z10) {
        J1();
        if (this.G != z10) {
            this.G = z10;
            this.f21651k.T0(z10);
            this.f21653l.i(9, new p.a() { // from class: d6.f0
                @Override // s7.p.a
                public final void invoke(Object obj) {
                    ((v.d) obj).onShuffleModeEnabledChanged(z10);
                }
            });
            E1();
            this.f21653l.f();
        }
    }

    @Override // com.google.android.exoplayer2.v
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        J1();
        if (surfaceView instanceof t7.h) {
            s1();
            B1(surfaceView);
            z1(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                C1(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            s1();
            this.X = (SphericalGLSurfaceView) surfaceView;
            A0(this.f21677y).m(10000).l(this.X).k();
            this.X.d(this.f21676x);
            B1(this.X.getVideoSurface());
            z1(surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.v
    public void setVideoTextureView(@Nullable TextureView textureView) {
        J1();
        if (textureView == null) {
            v0();
            return;
        }
        s1();
        this.Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            s7.q.i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f21676x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            B1(null);
            o1(0, 0);
        } else {
            A1(surfaceTexture);
            o1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.v
    public void setVolume(float f10) {
        J1();
        final float fO = m0.o(f10, 0.0f, 1.0f);
        if (this.f21646h0 == fO) {
            return;
        }
        this.f21646h0 = fO;
        v1();
        this.f21653l.l(22, new p.a() { // from class: d6.h0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((v.d) obj).onVolumeChanged(fO);
            }
        });
    }

    public final List<s.c> t0(int i10, List<com.google.android.exoplayer2.source.i> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            s.c cVar = new s.c(list.get(i11), this.f21661p);
            arrayList.add(cVar);
            this.f21659o.add(i11 + i10, new e(cVar.f22210b, cVar.f22209a.P()));
        }
        this.M = this.M.cloneAndInsert(i10, arrayList.size());
        return arrayList;
    }

    public final void t1(int i10, long j10, boolean z10) {
        this.f21665r.notifySeekStarted();
        c0 c0Var = this.f21668s0.f59665a;
        if (i10 < 0 || (!c0Var.u() && i10 >= c0Var.t())) {
            throw new IllegalSeekPositionException(c0Var, i10, j10);
        }
        this.H++;
        if (isPlayingAd()) {
            s7.q.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            l.e eVar = new l.e(this.f21668s0);
            eVar.b(1);
            this.f21649j.a(eVar);
            return;
        }
        int i11 = getPlaybackState() != 1 ? 2 : 1;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        o1 o1VarM1 = m1(this.f21668s0.g(i11), c0Var, n1(c0Var, i10, j10));
        this.f21651k.x0(c0Var, i10, m0.w0(j10));
        G1(o1VarM1, 0, 1, true, true, 1, D0(o1VarM1), currentMediaItemIndex, z10);
    }

    public final q u0() {
        c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.u()) {
            return this.f21666r0;
        }
        return this.f21666r0.b().H(currentTimeline.r(getCurrentMediaItemIndex(), this.f21419a).f21404d.f22036f).F();
    }

    public final void u1(int i10, int i11, @Nullable Object obj) {
        for (y yVar : this.f21643g) {
            if (yVar.getTrackType() == i10) {
                A0(yVar).m(i11).l(obj).k();
            }
        }
    }

    public void v0() {
        J1();
        s1();
        B1(null);
        o1(0, 0);
    }

    public final void v1() {
        u1(1, 2, Float.valueOf(this.f21646h0 * this.A.g()));
    }

    public void w0(@Nullable SurfaceHolder surfaceHolder) {
        J1();
        if (surfaceHolder == null || surfaceHolder != this.W) {
            return;
        }
        v0();
    }

    public void w1(List<com.google.android.exoplayer2.source.i> list) {
        J1();
        x1(list, true);
    }

    public void x1(List<com.google.android.exoplayer2.source.i> list, boolean z10) {
        J1();
        y1(list, -1, -9223372036854775807L, z10);
    }

    public final c0 y0() {
        return new d6.s1(this.f21659o, this.M);
    }

    public final void y1(List<com.google.android.exoplayer2.source.i> list, int i10, long j10, boolean z10) {
        int iE;
        long j11;
        int iE0 = E0();
        long currentPosition = getCurrentPosition();
        this.H++;
        if (!this.f21659o.isEmpty()) {
            r1(0, this.f21659o.size());
        }
        List<s.c> listT0 = t0(0, list);
        c0 c0VarY0 = y0();
        if (!c0VarY0.u() && i10 >= c0VarY0.t()) {
            throw new IllegalSeekPositionException(c0VarY0, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            iE = c0VarY0.e(this.G);
        } else if (i10 == -1) {
            iE = iE0;
            j11 = currentPosition;
        } else {
            iE = i10;
            j11 = j10;
        }
        o1 o1VarM1 = m1(this.f21668s0, c0VarY0, n1(c0VarY0, iE, j11));
        int i11 = o1VarM1.f59669e;
        if (iE != -1 && i11 != 1) {
            i11 = (c0VarY0.u() || iE >= c0VarY0.t()) ? 4 : 2;
        }
        o1 o1VarG = o1VarM1.g(i11);
        this.f21651k.J0(listT0, iE, m0.w0(j11), this.M);
        G1(o1VarG, 0, 1, false, (this.f21668s0.f59666b.f60899a.equals(o1VarG.f59666b.f60899a) || this.f21668s0.f59665a.u()) ? false : true, 4, D0(o1VarG), -1, false);
    }

    public final List<com.google.android.exoplayer2.source.i> z0(List<p> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f21663q.c(list.get(i10)));
        }
        return arrayList;
    }

    public final void z1(SurfaceHolder surfaceHolder) {
        this.Y = false;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.f21676x);
        Surface surface = this.W.getSurface();
        if (surface == null || !surface.isValid()) {
            o1(0, 0);
        } else {
            Rect surfaceFrame = this.W.getSurfaceFrame();
            o1(surfaceFrame.width(), surfaceFrame.height());
        }
    }
}
