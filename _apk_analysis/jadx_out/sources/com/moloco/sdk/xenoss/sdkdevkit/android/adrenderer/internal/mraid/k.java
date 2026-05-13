package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C3978d4;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
public final class k implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public sn.a<bn.r> f48394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l0 f48395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final WebView f48396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o f48397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g f48398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final go.k<l> f48399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final go.p<l> f48400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final go.u<e0.f> f48401j;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidFullscreenContentControllerImpl$onEvent$1", f = "MraidFullscreenContentController.kt", l = {106}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48402a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f48404c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f48404c = lVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return k.this.new a(this.f48404c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48402a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.k kVar = k.this.f48399h;
                l lVar = this.f48404c;
                this.f48402a = 1;
                if (kVar.emit(lVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    public static final class b implements go.d<e0.f> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go.d f48405b;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ go.e f48406b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k$b$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidFullscreenContentControllerImpl$special$$inlined$mapNotNull$1$2", f = "MraidFullscreenContentController.kt", l = {52}, m = "emit")
            public static final class C0612a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f48407a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f48408b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f48409c;

                public C0612a(hn.c cVar) {
                    super(cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f48407a = obj;
                    this.f48408b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(go.e eVar) {
                this.f48406b = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // go.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, hn.c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.b.a.C0612a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.b.a.C0612a) r0
                    int r1 = r0.f48408b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f48408b = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f48407a
                    java.lang.Object r1 = in.a.g()
                    int r2 = r0.f48408b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.c.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.c.b(r6)
                    go.e r6 = r4.f48406b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0 r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0) r5
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0.f
                    if (r2 == 0) goto L3f
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0$f r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0.f) r5
                    goto L40
                L3f:
                    r5 = 0
                L40:
                    if (r5 == 0) goto L4b
                    r0.f48408b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    bn.r r5 = bn.r.f5635a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.b.a.emit(java.lang.Object, hn.c):java.lang.Object");
            }
        }

        public b(go.d dVar) {
            this.f48405b = dVar;
        }

        @Override // go.d
        public Object collect(go.e<? super e0.f> eVar, hn.c cVar) {
            Object objCollect = this.f48405b.collect(new a(eVar), cVar);
            return objCollect == in.a.g() ? objCollect : bn.r.f5635a;
        }
    }

    public k(boolean z10, sn.a<bn.r> aVar, l0 l0Var, int i10, WebView webView, go.p<? extends e0> pVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar) {
        tn.p.k(aVar, "closeFullscreenAdRepresentation");
        tn.p.k(l0Var, "scope");
        tn.p.k(webView, "webView");
        tn.p.k(pVar, "mraidJsCommands");
        this.f48393b = z10;
        this.f48394c = aVar;
        this.f48395d = l0Var;
        this.f48396e = webView;
        this.f48397f = oVar;
        this.f48398g = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h.a(i10, l0Var);
        go.k<l> kVarB = go.q.b(0, 0, null, 7, null);
        this.f48399h = kVarB;
        this.f48400i = kVarB;
        this.f48401j = go.f.M(new b(pVar), l0Var, kotlinx.coroutines.flow.a.f73397a.c(), null);
    }

    public /* synthetic */ k(boolean z10, sn.a aVar, l0 l0Var, int i10, WebView webView, go.p pVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar, int i11, tn.i iVar) {
        this(z10, (i11 & 2) != 0 ? new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c0
            @Override // sn.a
            public final Object invoke() {
                return k.H();
            }
        } : aVar, l0Var, i10, webView, pVar, (i11 & 64) != 0 ? null : oVar, null);
    }

    public /* synthetic */ k(boolean z10, sn.a aVar, l0 l0Var, int i10, WebView webView, go.p pVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar, tn.i iVar) {
        this(z10, aVar, l0Var, i10, webView, pVar, oVar);
    }

    public static final bn.r H() {
        return bn.r.f5635a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0
    public void B() {
        G(l.f48411a);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVarC = C();
        if (oVarC != null) {
            oVarC.c("");
        }
    }

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o C() {
        return this.f48397f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0
    @NotNull
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public go.p<l> a() {
        return this.f48400i;
    }

    public final kotlinx.coroutines.g G(l lVar) {
        return p000do.i.d(this.f48395d, null, null, new a(lVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.f48393b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0
    @NotNull
    public WebView c() {
        return this.f48396e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0
    public void c(@NotNull String str, @NotNull a.AbstractC0696a.f fVar) {
        tn.p.k(str, "clickThroughUrl");
        tn.p.k(fVar, C3978d4.i.L);
        j(fVar);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVarC = C();
        if (oVarC != null) {
            oVarC.a(str);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        this.f48394c.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0
    @NotNull
    public go.u<e0.f> e() {
        return this.f48401j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0
    public void f(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar) {
        this.f48397f = oVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void j(@NotNull a.AbstractC0696a.f fVar) {
        tn.p.k(fVar, C3978d4.i.L);
        G(l.f48412b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public go.u<d.a> l() {
        return this.f48398g.l();
    }
}
