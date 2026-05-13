package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
public final class y extends B<m> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Context f50899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f50900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.t f50901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final i f50902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m f50903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final x f50904m;

    public /* synthetic */ class a extends FunctionReferenceImpl implements sn.l<hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d>>, Object> {
        public a(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d>> cVar) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m) this.receiver).f0(cVar);
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements sn.a<bn.r> {
        public b(Object obj) {
            super(0, obj, y.class, "detachMraidViewFromAdViewWrapper", "detachMraidViewFromAdViewWrapper()V", 0);
        }

        public final void a() {
            ((y) this.receiver).y();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements sn.a<bn.r> {
        public c(Object obj) {
            super(0, obj, y.class, "attachMraidViewToAdViewWrapper", "attachMraidViewToAdViewWrapper()V", 0);
        }

        public final void a() {
            ((y) this.receiver).x();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull Context context, @NotNull String str, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.t tVar, @NotNull p000do.l0 l0Var) {
        super(context, l0Var);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "adm");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        tn.p.k(tVar, "webViewWrapper");
        tn.p.k(l0Var, "scope");
        this.f50899h = context;
        this.f50900i = e0Var;
        this.f50901j = tVar;
        setTag("MolocoMraidBannerView");
        this.f50902k = i.f47727b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m mVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m(context, str, new b(this), new c(this), new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1
            @Override // sn.a
            public final Object invoke() {
                return y.w(this.f47941b);
            }
        }, new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return y.t(this.f47987b, (d) obj);
            }
        }, true, w0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.z.a(context, l0Var, false), null, null, 1536, null);
        this.f50903l = mVar;
        this.f50904m = new x(l0Var, null, b.a.f47629a.a(), new a(mVar));
    }

    public /* synthetic */ y(Context context, String str, w0 w0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.t tVar, p000do.l0 l0Var, int i10, tn.i iVar) {
        this(context, str, w0Var, e0Var, (i10 & 16) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.t() : tVar, l0Var);
    }

    public static final bn.r t(y yVar, d dVar) {
        tn.p.k(dVar, "it");
        m adShowListener = yVar.getAdShowListener();
        if (adShowListener != null) {
            adShowListener.a(e.a(dVar));
        }
        return bn.r.f5635a;
    }

    public static final bn.r w(y yVar) {
        m adShowListener = yVar.getAdShowListener();
        if (adShowListener != null) {
            adShowListener.b();
        }
        return bn.r.f5635a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        super.destroy();
        this.f50903l.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    @NotNull
    public x getAdLoader() {
        return this.f50904m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    @NotNull
    public i getCreativeType() {
        return this.f50902k;
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
        FrameLayout frameLayoutA = this.f50901j.a(this.f50899h, this.f50903l.c());
        this.f50900i.a(frameLayoutA);
        setAdView(frameLayoutA);
    }

    public final void x() {
        s();
    }

    public final void y() {
        setAdView(null);
    }
}
