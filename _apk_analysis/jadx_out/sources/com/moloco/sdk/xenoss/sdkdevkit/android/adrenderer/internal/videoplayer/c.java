package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.content.Context;
import android.os.Looper;
import android.view.InflateException;
import androidx.annotation.MainThread;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import bn.r;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.v;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import go.l;
import go.u;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k;
import p000do.l0;
import p000do.s0;
import r7.h;
import sn.p;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@MainThread
public final class c implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f50699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final n f50701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f50702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final l0 f50703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> f50704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> f50705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> f50706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> f50707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> f50708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> f50709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final StyledPlayerView f50710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f50711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f50712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Looper f50713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public j f50714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b f50715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f50716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final d f50717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f50718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f50719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.g f50720w;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.SimplifiedExoPlayer$1", f = "SimplifiedExoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50722b;

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, hn.c<? super r> cVar) {
            return ((a) create(aVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            a aVar = c.this.new a(cVar);
            aVar.f50722b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50721a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f50722b).d()) {
                c.this.x();
            } else {
                kotlinx.coroutines.g gVar = c.this.f50720w;
                if (gVar != null) {
                    g.a.a(gVar, null, 1, null);
                }
            }
            return r.f5635a;
        }
    }

    public static final class b implements sn.l<Throwable, r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f50724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C0688c f50725c;

        public b(j jVar, C0688c c0688c) {
            this.f50724b = jVar;
            this.f50725c = c0688c;
        }

        public final void a(Throwable th2) {
            this.f50724b.c(this.f50725c);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
            a(th2);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c$c, reason: collision with other inner class name */
    public static final class C0688c implements v.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f50726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f50727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k<r> f50728d;

        /* JADX WARN: Multi-variable type inference failed */
        public C0688c(int i10, j jVar, k<? super r> kVar) {
            this.f50726b = i10;
            this.f50727c = jVar;
            this.f50728d = kVar;
        }

        @Override // com.google.android.exoplayer2.v.d
        public void onPlaybackStateChanged(int i10) {
            if (i10 == this.f50726b) {
                this.f50727c.c(this);
                k<r> kVar = this.f50728d;
                Result.a aVar = Result.Companion;
                kVar.resumeWith(Result.m7534constructorimpl(r.f5635a));
            }
        }
    }

    public static final class d implements v.d {
        public d() {
        }

        @Override // com.google.android.exoplayer2.v.d
        public void onIsPlayingChanged(boolean z10) {
            super.onIsPlayingChanged(z10);
            j jVarT = c.this.T();
            long duration = jVarT != null ? jVarT.getDuration() : 0L;
            j jVarT2 = c.this.T();
            c.this.f50706i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(z10, true, duration - (jVarT2 != null ? jVarT2.getCurrentPosition() : 0L) > 0));
        }

        @Override // com.google.android.exoplayer2.v.d
        public void onPlaybackStateChanged(int i10) {
            super.onPlaybackStateChanged(i10);
            if (i10 == 4) {
                c cVar = c.this;
                j jVarT = c.this.T();
                cVar.G(new i.a(jVarT != null ? jVarT.getDuration() : 1L));
                c.this.l();
            }
        }

        @Override // com.google.android.exoplayer2.v.d
        public void q(PlaybackException playbackException) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar;
            tn.p.k(playbackException, "error");
            super.q(playbackException);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.error$default(molocoLogger, c.this.f50702e, "Exoplayer error (streaming enabled = " + c.this.f50700c + ')', playbackException, false, 8, null);
            if (c.this.f50700c && (bVar = c.this.f50715r) != null && bVar.i()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) c.this.f50704g.getValue();
                if ((iVar instanceof i.a) || (iVar instanceof i.c)) {
                    MolocoLogger.info$default(molocoLogger, c.this.f50702e, "Ignoring exoplayer streaming error as the user has viewed some of the ad already", null, false, 12, null);
                    return;
                } else {
                    if (!(iVar instanceof i.d) && !tn.p.f(iVar, i.b.f50545a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MolocoLogger.info$default(molocoLogger, c.this.f50702e, "Exoplayer streaming failed before any playback started, so report that as error", null, false, 12, null);
                }
            }
            c.this.f50708k.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f48120a);
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements sn.a<r> {
        public e(Object obj) {
            super(0, obj, c.class, "initOrResumeExoPlayer", "initOrResumeExoPlayer()V", 0);
        }

        public final void a() {
            ((c) this.receiver).W();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ r invoke() {
            a();
            return r.f5635a;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements sn.a<r> {
        public f(Object obj) {
            super(0, obj, c.class, "disposeExoPlayer", "disposeExoPlayer()V", 0);
        }

        public final void a() {
            ((c) this.receiver).R();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ r invoke() {
            a();
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.SimplifiedExoPlayer$startPlaybackProgressJob$1", f = "SimplifiedExoPlayer.kt", l = {328}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50730a;

        public g(hn.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return c.this.new g(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50730a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            do {
                j jVarT = c.this.T();
                if (jVarT != null) {
                    c.this.G(new i.c(jVarT.getCurrentPosition(), jVarT.getDuration()));
                }
                this.f50730a = 1;
            } while (s0.a(500L, this) != objG);
            return objG;
        }
    }

    public c(@NotNull Context context, boolean z10, @NotNull n nVar, @NotNull Lifecycle lifecycle) {
        StyledPlayerView styledPlayerView;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(nVar, "mediaCacheRepository");
        tn.p.k(lifecycle, "lifecycle");
        this.f50699b = context;
        this.f50700c = z10;
        this.f50701d = nVar;
        this.f50702e = "SimplifiedExoPlayer";
        this.f50703f = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> lVarA = go.v.a(i.b.f50545a);
        this.f50704g = lVarA;
        this.f50705h = lVarA;
        l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> lVarA2 = go.v.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(false, false, false, 6, null));
        this.f50706i = lVarA2;
        this.f50707j = lVarA2;
        l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> lVarA3 = go.v.a(null);
        this.f50708k = lVarA3;
        this.f50709l = lVarA3;
        try {
            styledPlayerView = new StyledPlayerView(context);
            styledPlayerView.setUseController(false);
        } catch (InflateException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f50702e, "ExoPlayerView could not be instantiated.", e10, false, 8, null);
            this.f50708k.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f48121b);
            styledPlayerView = null;
        }
        this.f50710m = styledPlayerView;
        this.f50713p = Looper.getMainLooper();
        go.f.D(go.f.G(isPlaying(), new a(null)), this.f50703f);
        this.f50717t = new d();
        this.f50718u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g(lifecycle, new e(this), new f(this));
    }

    public static final r7.h z(String str, c cVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b(str, cVar.f50701d);
        cVar.f50715r = bVar;
        return bVar;
    }

    public final void A(j jVar, final String str) {
        if (str == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f50702e, "URI Source is empty", null, false, 12, null);
            return;
        }
        try {
            if (this.f50700c) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f50702e, "Streaming is enabled", null, false, 12, null);
                com.google.android.exoplayer2.source.d dVar = new com.google.android.exoplayer2.source.d(new h.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d
                    @Override // r7.h.a
                    public final r7.h createDataSource() {
                        return c.z(str, this);
                    }
                });
                com.google.android.exoplayer2.p pVarD = com.google.android.exoplayer2.p.d(str);
                tn.p.j(pVarD, "fromUri(...)");
                jVar.a(dVar.c(pVarD));
            } else {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f50702e, "Streaming is disabled", null, false, 12, null);
                jVar.e(com.google.android.exoplayer2.p.d(str));
            }
            jVar.prepare();
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f50702e, "ExoPlayer setMediaItem exception", e10, false, 8, null);
            this.f50708k.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f48122c);
        }
    }

    public final void B(j jVar, boolean z10) {
        jVar.setVolume(z10 ? 0.0f : 1.0f);
    }

    public final void F(j jVar) {
        B(jVar, s());
        A(jVar, U());
        jVar.seekTo(this.f50719v);
        if (this.f50716s) {
            jVar.play();
        } else {
            jVar.pause();
        }
    }

    public final void G(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        this.f50704g.setValue(iVar);
    }

    public final void I(j jVar) {
        this.f50719v = jVar.getCurrentPosition();
    }

    public final void R() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f50702e, "Disposing exo player", null, false, 12, null);
        StyledPlayerView styledPlayerViewN = N();
        if (styledPlayerViewN != null) {
            styledPlayerViewN.B();
            styledPlayerViewN.setPlayer(null);
        }
        j jVar = this.f50714q;
        long duration = jVar != null ? jVar.getDuration() : 0L;
        j jVar2 = this.f50714q;
        boolean z10 = duration - (jVar2 != null ? jVar2.getCurrentPosition() : 0L) > 0;
        j jVar3 = this.f50714q;
        if (jVar3 != null) {
            I(jVar3);
            jVar3.c(this.f50717t);
            jVar3.release();
        }
        this.f50714q = null;
        this.f50706i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(false, false, z10));
    }

    @MainThread
    @Nullable
    public final j T() {
        return this.f50714q;
    }

    @Nullable
    public String U() {
        return this.f50711n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    @MainThread
    @Nullable
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public StyledPlayerView N() {
        return this.f50710m;
    }

    public final void W() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f50702e, "Init exo player", null, false, 12, null);
        StyledPlayerView styledPlayerViewN = N();
        if (styledPlayerViewN == null) {
            return;
        }
        if (this.f50714q == null) {
            j jVarE = new j.b(this.f50699b).j(this.f50713p).k(true).e();
            tn.p.j(jVarE, "build(...)");
            styledPlayerViewN.setPlayer(jVarE);
            this.f50714q = jVarE;
            jVarE.setPlayWhenReady(false);
            jVarE.f(this.f50717t);
            F(jVarE);
            if (tn.p.f(o().getValue(), i.b.f50545a)) {
                G(new i.d(jVarE.getDuration()));
            }
        }
        styledPlayerViewN.C();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    @Nullable
    public Object a(@NotNull hn.c<? super r> cVar) {
        Object objY;
        j jVar = this.f50714q;
        return (jVar == null || (objY = y(jVar, 3, cVar)) != in.a.g()) ? r.f5635a : objY;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    public void a(@Nullable String str) {
        this.f50711n = str;
        j jVar = this.f50714q;
        if (jVar != null) {
            A(jVar, str);
        }
        l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    public void b(boolean z10) {
        this.f50712o = z10;
        j jVar = this.f50714q;
        if (jVar != null) {
            B(jVar, z10);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f50703f, null, 1, null);
        this.f50718u.destroy();
        R();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    @NotNull
    public u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> f() {
        return this.f50709l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    @NotNull
    public u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> isPlaying() {
        return this.f50707j;
    }

    public final void l() {
        this.f50716s = false;
        this.f50719v = 0L;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    @NotNull
    public u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> o() {
        return this.f50705h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    public void pause() {
        this.f50716s = false;
        j jVar = this.f50714q;
        if (jVar != null) {
            jVar.pause();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    public void play() {
        this.f50716s = true;
        j jVar = this.f50714q;
        if (jVar != null) {
            jVar.play();
        }
    }

    public boolean s() {
        return this.f50712o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    public void seekTo(long j10) {
        this.f50719v = j10;
        j jVar = this.f50714q;
        if (jVar != null) {
            jVar.seekTo(j10);
        }
    }

    public final void x() {
        kotlinx.coroutines.g gVar = this.f50720w;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.f50720w = p000do.i.d(this.f50703f, null, null, new g(null), 3, null);
    }

    public final Object y(j jVar, int i10, hn.c<? super r> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        C0688c c0688c = new C0688c(i10, jVar, cVar2);
        jVar.f(c0688c);
        cVar2.P(new b(jVar, c0688c));
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB == in.a.g() ? objB : r.f5635a;
    }
}
