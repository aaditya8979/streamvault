package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import go.f;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
public final class M extends B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Context f47885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f47886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 f47887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final w0 f47888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f47889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final K f47890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final i f47891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f47892o;

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastBannerView$listenToPlayerEvents$1", f = "VastBannerView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47894b;

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, hn.c<? super bn.r> cVar) {
            return ((a) create(bVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            a aVar = M.this.new a(cVar);
            aVar.f47894b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47893a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f47894b;
            if (tn.p.f(bVar, b.i.f49998a)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 adShowListener = M.this.getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.a(true);
                }
            } else if (!tn.p.f(bVar, b.j.f49999a)) {
                if (tn.p.f(bVar, b.c.f49992a)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 adShowListener2 = M.this.getAdShowListener();
                    if (adShowListener2 != null) {
                        adShowListener2.a(false);
                    }
                } else if (tn.p.f(bVar, b.a.f49990a)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 adShowListener3 = M.this.getAdShowListener();
                    if (adShowListener3 != null) {
                        adShowListener3.b();
                    }
                } else if (bVar instanceof b.f) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 adShowListener4 = M.this.getAdShowListener();
                    if (adShowListener4 != null) {
                        adShowListener4.a(((b.f) bVar).a());
                    }
                } else if (!tn.p.f(bVar, b.g.f49996a) && !tn.p.f(bVar, b.C0658b.f49991a) && !tn.p.f(bVar, b.d.f49993a) && !tn.p.f(bVar, b.h.f49997a) && !tn.p.f(bVar, b.e.f49994a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 d0Var, @NotNull w0 w0Var, @NotNull p000do.l0 l0Var, @NotNull K k10) {
        super(context, l0Var);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(d0Var, "options");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(l0Var, "scope");
        tn.p.k(k10, "adLoader");
        this.f47885h = context;
        this.f47886i = aVar;
        this.f47887j = d0Var;
        this.f47888k = w0Var;
        this.f47889l = l0Var;
        this.f47890m = k10;
        setTag("MolocoVastBannerView");
        this.f47891n = i.f47726a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        super.destroy();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f47892o;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f47892o = null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    @NotNull
    public K getAdLoader() {
        return this.f47890m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    @NotNull
    public i getCreativeType() {
        return this.f47891n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void s() {
        com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> g0VarC = getAdLoader().c();
        if (g0VarC instanceof g0.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((g0.a) g0VarC).a();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 adShowListener = getAdShowListener();
            if (adShowListener != null) {
                adShowListener.a(cVar);
                return;
            }
            return;
        }
        if (!(g0VarC instanceof g0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVarB = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((g0.b) g0VarC).a(), this.f47888k, this.f47885h, this.f47886i, this.f47887j.i(), this.f47887j.g(), this.f47887j.h(), this.f47887j.e(), this.f47887j.f(), this.f47887j.d(), this.f47887j.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l(false, false, false, false, null, null, null).a(this.f47888k, null));
        this.f47892o = aVarB;
        setAdView(this.f47887j.j().mo2invoke(this.f47885h, aVarB));
        x();
        aVarB.d();
    }

    public final void x() {
        go.d<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> dVarA;
        go.d dVarG;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f47892o;
        if (aVar == null || (dVarA = aVar.a()) == null || (dVarG = f.G(dVarA, new a(null))) == null) {
            return;
        }
        f.D(dVarG, this.f47889l);
    }
}
