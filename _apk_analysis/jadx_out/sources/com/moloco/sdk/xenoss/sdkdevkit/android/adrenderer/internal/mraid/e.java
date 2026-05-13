package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f48314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final r f48315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public sn.a<bn.r> f48316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public sn.l<? super String, bn.r> f48317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, bn.r> f48318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final w0 f48319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f48320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final y f48321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f48322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final l0 f48323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f48324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public t f48325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final u f48326n;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$loadAndReadyMraid$2", f = "MraidBaseAd.kt", l = {172}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super com.moloco.sdk.internal.g0<n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48327a;

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return e.this.new a(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n nVar;
            Object objG = in.a.g();
            int i10 = this.f48327a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                y yVarC = e.this.C();
                String str = e.this.f48314b;
                this.f48327a = 1;
                obj = yVarC.a(str, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            com.moloco.sdk.internal.g0 g0Var = (com.moloco.sdk.internal.g0) obj;
            boolean z10 = g0Var instanceof g0.a;
            if (z10) {
                return g0Var;
            }
            y yVarC2 = e.this.C();
            e eVar = e.this;
            yVarC2.k(false, false, false, false, true);
            yVarC2.d(eVar.f48315c);
            yVarC2.a(eVar.f48326n.x().getValue().booleanValue());
            yVarC2.e(eVar.f48326n.s().getValue().a());
            eVar.g0(t.f48436c);
            eVar.P();
            eVar.R();
            eVar.S();
            yVarC2.j();
            e eVar2 = e.this;
            if (g0Var instanceof g0.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, eVar2.f48322j, "Mraid Html data successfully loaded", null, false, 12, null);
                nVar = (n) ((g0.b) g0Var).a();
            } else {
                if (!z10) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar2.f48322j, "Mraid Html data load failed.", null, false, 12, null);
                nVar = new n(null, 1, null);
            }
            eVar2.f48324l = nVar;
            return g0Var;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToErrors$1", f = "MraidBaseAd.kt", l = {60}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48329a;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48331a;

            static {
                int[] iArr = new int[r.values().length];
                try {
                    iArr[r.f48431c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r.f48430b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f48331a = iArr;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$b$b, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToErrors$1$error$1", f = "MraidBaseAd.kt", l = {}, m = "invokeSuspend")
        public static final class C0610b extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, hn.c<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48332a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f48333b;

            public C0610b(hn.c<? super C0610b> cVar) {
                super(2, cVar);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar, hn.c<? super Boolean> cVar) {
                return ((C0610b) create(dVar, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                C0610b c0610b = new C0610b(cVar);
                c0610b.f48333b = obj;
                return c0610b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f48332a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return jn.a.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.f48333b) != null);
            }
        }

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return e.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48329a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> uVarW = e.this.C().w();
                C0610b c0610b = new C0610b(null);
                this.f48329a = 1;
                obj = go.f.w(uVarW, c0610b, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
            if (dVar != null) {
                e eVar = e.this;
                int i11 = a.f48331a[eVar.f48315c.ordinal()];
                if (i11 == 1) {
                    eVar.E().invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.E().invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.a(dVar));
                }
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToMraidJsCommands$1", f = "MraidBaseAd.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<e0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48335b;

        public c(hn.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(e0 e0Var, hn.c<? super bn.r> cVar) {
            return ((c) create(e0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = e.this.new c(cVar);
            cVar2.f48335b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48334a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            e0 e0Var = (e0) this.f48335b;
            if (tn.p.f(e0Var, e0.a.f48345c)) {
                e.this.I();
            } else if (e0Var instanceof e0.d) {
                e.this.a0((e0.d) e0Var);
            } else if (!(e0Var instanceof e0.f)) {
                if (e0Var instanceof e0.c) {
                    e.this.Z((e0.c) e0Var);
                } else {
                    e.this.C().n(e0Var, "unsupported command: " + e0Var.b());
                }
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToVisualMetricsChanges$1", f = "MraidBaseAd.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<Boolean, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f48338b;

        public d(hn.c<? super d> cVar) {
            super(2, cVar);
        }

        public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
            return ((d) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            d dVar = e.this.new d(cVar);
            dVar.f48338b = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super bn.r> cVar) {
            return a(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48337a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            e.this.C().a(this.f48338b);
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$e, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToVisualMetricsChanges$2", f = "MraidBaseAd.kt", l = {}, m = "invokeSuspend")
    public static final class C0611e extends SuspendLambda implements sn.p<u.a, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48341b;

        public C0611e(hn.c<? super C0611e> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(u.a aVar, hn.c<? super bn.r> cVar) {
            return ((C0611e) create(aVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C0611e c0611e = e.this.new C0611e(cVar);
            c0611e.f48341b = obj;
            return c0611e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48340a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            e.this.C().e(((u.a) this.f48341b).a());
            return bn.r.f5635a;
        }
    }

    public e(@NotNull Context context, @NotNull String str, @NotNull r rVar, @NotNull sn.a<bn.r> aVar, @NotNull sn.l<? super String, bn.r> lVar, @NotNull sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, bn.r> lVar2, @NotNull w0 w0Var, boolean z10, @NotNull y yVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "adm");
        tn.p.k(rVar, "mraidPlacementType");
        tn.p.k(aVar, "onShowListenerClick");
        tn.p.k(lVar, "onClickthroughClick");
        tn.p.k(lVar2, "onError");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(yVar, "mraidBridge");
        this.f48314b = str;
        this.f48315c = rVar;
        this.f48316d = aVar;
        this.f48317e = lVar;
        this.f48318f = lVar2;
        this.f48319g = w0Var;
        this.f48320h = z10;
        this.f48321i = yVar;
        this.f48322j = "MraidBaseAd";
        l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f48323k = l0VarA;
        this.f48326n = new u(yVar.c(), context, l0VarA);
    }

    public /* synthetic */ e(Context context, String str, r rVar, sn.a aVar, sn.l lVar, sn.l lVar2, w0 w0Var, boolean z10, y yVar, int i10, tn.i iVar) {
        this(context, str, rVar, (i10 & 8) != 0 ? new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q
            @Override // sn.a
            public final Object invoke() {
                return e.o0();
            }
        } : aVar, (i10 & 16) != 0 ? new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s
            @Override // sn.l
            public final Object invoke(Object obj) {
                return e.d0((String) obj);
            }
        } : lVar, (i10 & 32) != 0 ? new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.x
            @Override // sn.l
            public final Object invoke(Object obj) {
                return e.T((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj);
            }
        } : lVar2, w0Var, (i10 & 128) != 0 ? false : z10, yVar);
    }

    public static final bn.r T(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
        tn.p.k(dVar, "it");
        return bn.r.f5635a;
    }

    public static final bn.r d0(String str) {
        tn.p.k(str, "it");
        return bn.r.f5635a;
    }

    public static final bn.r o0() {
        return bn.r.f5635a;
    }

    @NotNull
    public final y C() {
        return this.f48321i;
    }

    @NotNull
    public final sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, bn.r> E() {
        return this.f48318f;
    }

    @NotNull
    public final sn.a<bn.r> H() {
        return this.f48316d;
    }

    public final void I() {
        if (this.f48326n.x().getValue().booleanValue()) {
            p0();
        } else {
            this.f48321i.n(e0.a.f48345c, "Can't close ad when mraid container is not visible to the user");
        }
    }

    public void J() {
    }

    public final void P() {
        p000do.i.d(this.f48323k, null, null, new b(null), 3, null);
    }

    public final void R() {
        go.f.D(go.f.G(this.f48321i.v(), new c(null)), this.f48323k);
    }

    public final void S() {
        go.f.D(go.f.G(this.f48326n.x(), new d(null)), this.f48323k);
        go.f.D(go.f.G(this.f48326n.s(), new C0611e(null)), this.f48323k);
    }

    public final void Z(e0.c cVar) {
        if (this.f48320h) {
            this.f48321i.n(cVar, "expand() is force blocked for the current ad");
            return;
        }
        if (!this.f48326n.x().getValue().booleanValue()) {
            this.f48321i.n(cVar, "Can't expand() when mraid container is not visible to the user");
            return;
        }
        if (this.f48325m != t.f48436c) {
            this.f48321i.n(cVar, "In order to expand() mraid ad, container must be in Default view state");
            return;
        }
        if (this.f48315c == r.f48431c) {
            this.f48321i.n(cVar, "expand() is not supported for interstitials");
        } else if (cVar.c() != null) {
            this.f48321i.n(cVar, "Two-part expand is not supported yet");
        } else {
            J();
            g0(t.f48438e);
        }
    }

    public final void a0(e0.d dVar) {
        if (!this.f48326n.x().getValue().booleanValue()) {
            this.f48321i.n(dVar, "Can't open links when mraid container is not visible to the user");
            return;
        }
        sn.l<? super String, bn.r> lVar = this.f48317e;
        String string = dVar.c().toString();
        tn.p.j(string, "toString(...)");
        lVar.invoke(string);
    }

    public final void b0(@NotNull sn.a<bn.r> aVar) {
        tn.p.k(aVar, "<set-?>");
        this.f48316d = aVar;
    }

    public final void c0(@NotNull sn.l<? super String, bn.r> lVar) {
        tn.p.k(lVar, "<set-?>");
        this.f48317e = lVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f48323k, null, 1, null);
        this.f48321i.destroy();
        this.f48326n.destroy();
    }

    @Nullable
    public final Object f0(@NotNull hn.c<? super com.moloco.sdk.internal.g0<n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> cVar) {
        return p000do.i.b(this.f48323k, null, null, new a(null), 3, null).N(cVar);
    }

    public final void g0(t tVar) {
        this.f48325m = tVar;
        if (tVar != null) {
            this.f48321i.g(tVar);
        }
    }

    public final void h0(@NotNull sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, bn.r> lVar) {
        tn.p.k(lVar, "<set-?>");
        this.f48318f = lVar;
    }

    public void p0() {
        if (this.f48325m == t.f48438e) {
            g0(t.f48436c);
        }
    }
}
