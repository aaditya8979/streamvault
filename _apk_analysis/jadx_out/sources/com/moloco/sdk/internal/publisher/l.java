package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p000do.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    public /* synthetic */ class a extends FunctionReferenceImpl implements sn.v<Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, C4381e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, com.moloco.sdk.internal.a, com.moloco.sdk.internal.services.f0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s, B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46661a = new a();

        public a() {
            super(8, l.class, "createXenossAggregatedBanner", "createXenossAggregatedBanner(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService;Lcom/moloco/sdk/internal/ortb/model/Bid;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/Watermark;Lcom/moloco/sdk/internal/ViewLifecycleOwner;Lcom/moloco/sdk/internal/services/ClickthroughService;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/ButtonTracker;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/XenossBannerView;", 1);
        }

        @Override // sn.v
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o> invoke(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, C4381e c4381e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 w0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, com.moloco.sdk.internal.a aVar2, com.moloco.sdk.internal.services.f0 f0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar) {
            tn.p.k(context, "p0");
            tn.p.k(aVar, "p1");
            tn.p.k(c4381e, "p2");
            tn.p.k(w0Var, "p3");
            tn.p.k(e0Var, "p4");
            tn.p.k(aVar2, "p5");
            tn.p.k(f0Var, "p6");
            tn.p.k(sVar, "p7");
            return l.f(context, aVar, c4381e, w0Var, e0Var, aVar2, f0Var, sVar);
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46662a = new b();

        public b() {
            super(1, l.class, "createXenossAggregatedAdShowListener", "createXenossAggregatedAdShowListener(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/VastAdShowListener;)Lcom/moloco/sdk/internal/publisher/BannerKt$createXenossAggregatedAdShowListener$1;", 1);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var) {
            tn.p.k(c0Var, "p0");
            return l.e(c0Var);
        }
    }

    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 f46663a;

        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var) {
            this.f46663a = c0Var;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void a() {
            this.f46663a.a();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            tn.p.k(cVar, "internalShowError");
            this.f46663a.a(cVar);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0
        public void a(boolean z10) {
            this.f46663a.a(z10);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
        public void b() {
            this.f46663a.b();
        }
    }

    @NotNull
    public static final Banner b(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull String str, boolean z10, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull a0 a0Var, @NotNull com.moloco.sdk.internal.a aVar2, @NotNull com.moloco.sdk.internal.m mVar, @NotNull com.moloco.sdk.internal.services.f0 f0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar3) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(str, "adUnitId");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        tn.p.k(a0Var, "adCreateLoadTimeoutManager");
        tn.p.k(aVar2, "viewLifecycleOwnerSingleton");
        tn.p.k(mVar, "bannerSize");
        tn.p.k(f0Var, "clickthroughService");
        tn.p.k(aVar3, "metricsRecorder");
        return new m(context, rVar, aVar, str, z10, w0Var, a.f46661a, b.f46662a, e0Var, a0Var, aVar2, mVar, f0Var, aVar3);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p d(com.moloco.sdk.internal.ortb.model.y yVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVarD;
        return (yVar == null || (pVarD = com.moloco.sdk.internal.h.d(yVar)) == null) ? com.moloco.sdk.internal.h.c() : pVarD;
    }

    public static final c e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var) {
        return new c(c0Var);
    }

    public static final B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o> f(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, C4381e c4381e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 w0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, com.moloco.sdk.internal.a aVar2, com.moloco.sdk.internal.services.f0 f0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b(context, aVar, null, c4381e, d(c4381e.f().e()), w0Var, e0Var, aVar2, kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain().plus(j2.b(null, 1, null))), f0Var, sVar);
    }
}
