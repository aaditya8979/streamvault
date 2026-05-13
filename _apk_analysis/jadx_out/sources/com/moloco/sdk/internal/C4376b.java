package com.moloco.sdk.internal;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.publisher.o0;
import com.moloco.sdk.internal.publisher.q0;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: renamed from: com.moloco.sdk.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class C4376b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Init$SDKInitResponse f45920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f45921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.f0 f45922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final bn.g f45923d;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.b$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f45925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f45926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var, Context context) {
            super(1, p.a.class, "createVastController", "createNativeAd$createVastController(Lcom/moloco/sdk/internal/AdFactoryImpl;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/Ad;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/AdController;", 0);
            this.f45925b = w0Var;
            this.f45926c = context;
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
            tn.p.k(aVar, "p0");
            return C4376b.j(C4376b.this, this.f45925b, this.f45926c, aVar);
        }
    }

    public C4376b(@NotNull Init$SDKInitResponse init$SDKInitResponse, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull com.moloco.sdk.internal.services.f0 f0Var) {
        tn.p.k(init$SDKInitResponse, "initResponse");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(f0Var, "clickthroughService");
        this.f45920a = init$SDKInitResponse;
        this.f45921b = aVar;
        this.f45922c = f0Var;
        this.f45923d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.f
            @Override // sn.a
            public final Object invoke() {
                return Boolean.valueOf(C4376b.i(this.f46032b));
            }
        });
    }

    public static final boolean i(C4376b c4376b) {
        return c4376b.f45920a.j();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a j(C4376b c4376b, w0 w0Var, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b(aVar, w0Var, context, c4376b.f45921b, true, Boolean.FALSE, 0, 0, 0, false, false, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l(false, false, false, false, null, null, null).a(w0Var, null));
    }

    @Override // com.moloco.sdk.internal.e
    @NotNull
    public Banner a(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull com.moloco.sdk.internal.a aVar, @NotNull m mVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(str, "adUnitId");
        tn.p.k(c0Var, "viewVisibilityTracker");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        tn.p.k(a0Var, "adCreateLoadTimeoutManager");
        tn.p.k(aVar, "viewLifecycleOwnerSingleton");
        tn.p.k(mVar, "bannerSize");
        tn.p.k(aVar2, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.l.b(context, rVar, this.f45921b, str, h(), w0Var, e0Var, a0Var, aVar, mVar, this.f45922c, aVar2);
    }

    @Override // com.moloco.sdk.internal.e
    @NotNull
    public InterstitialAd b(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(str, "adUnitId");
        tn.p.k(c0Var, "viewVisibilityTracker");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(lVar, "persistentHttpRequest");
        tn.p.k(e0Var, "watermark");
        tn.p.k(a0Var, "adCreateLoadTimeoutManager");
        tn.p.k(aVar, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.h.a(context, rVar, this.f45921b, str, w0Var, lVar, (64 & 64) != 0 ? new q0(null, null, null, null, null, 31, null) : null, e0Var, a0Var, aVar);
    }

    @Override // com.moloco.sdk.internal.e
    @NotNull
    public Banner c(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull com.moloco.sdk.internal.a aVar, @NotNull m mVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(str, "adUnitId");
        tn.p.k(c0Var, "viewVisibilityTracker");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        tn.p.k(a0Var, "adCreateLoadTimeoutManager");
        tn.p.k(aVar, "viewLifecycleOwnerSingleton");
        tn.p.k(mVar, "bannerSize");
        tn.p.k(aVar2, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.l.b(context, rVar, this.f45921b, str, h(), w0Var, e0Var, a0Var, aVar, mVar, this.f45922c, aVar2);
    }

    @Override // com.moloco.sdk.internal.e
    @NotNull
    public RewardedInterstitialAd d(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar, @NotNull com.moloco.sdk.internal.services.config.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(str, "adUnitId");
        tn.p.k(c0Var, "viewVisibilityTracker");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(lVar, "persistentHttpRequest");
        tn.p.k(e0Var, "watermark");
        tn.p.k(a0Var, "adCreateLoadTimeoutManager");
        tn.p.k(aVar, "metricsRecorder");
        tn.p.k(aVar2, "configService");
        return com.moloco.sdk.internal.publisher.w.a(context, rVar, this.f45921b, str, w0Var, lVar, (64 & 64) != 0 ? new q0(null, null, null, null, null, 31, null) : null, e0Var, a0Var, aVar, aVar2);
    }

    @Override // com.moloco.sdk.internal.e
    @NotNull
    public Banner e(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull com.moloco.sdk.internal.a aVar, @NotNull m mVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(str, "adUnitId");
        tn.p.k(c0Var, "viewVisibilityTracker");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        tn.p.k(a0Var, "adCreateLoadTimeoutManager");
        tn.p.k(aVar, "viewLifecycleOwnerSingleton");
        tn.p.k(mVar, "bannerSize");
        tn.p.k(aVar2, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.l.b(context, rVar, this.f45921b, str, h(), w0Var, e0Var, a0Var, aVar, mVar, this.f45922c, aVar2);
    }

    @Override // com.moloco.sdk.internal.e
    @NotNull
    public NativeAd f(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.internal.services.b0 b0Var, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, @NotNull com.moloco.sdk.internal.a aVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull com.moloco.sdk.internal.services.j jVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(b0Var, "audioService");
        tn.p.k(str, "adUnitId");
        tn.p.k(c0Var, "viewVisibilityTracker");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(lVar, "persistentHttpRequest");
        tn.p.k(aVar, "viewLifecycleOwnerSingleton");
        tn.p.k(e0Var, "watermark");
        tn.p.k(a0Var, "adCreateLoadTimeoutManager");
        tn.p.k(jVar, "timeProvider");
        tn.p.k(aVar2, "metricsRecorder");
        return new com.moloco.sdk.internal.publisher.nativead.b(str, new com.moloco.sdk.internal.publisher.nativead.c(context, str, new com.moloco.sdk.internal.publisher.o(com.moloco.sdk.internal.ortb.d.a(), o0.a()), new com.moloco.sdk.internal.publisher.nativead.parser.a(), a0Var, aVar2, jVar), new com.moloco.sdk.internal.publisher.nativead.a(context, c0Var, aVar, e0Var, new a(w0Var, context)), rVar, this.f45921b, w0Var, lVar, a0Var, aVar2);
    }

    public final boolean h() {
        return ((Boolean) this.f45923d.getValue()).booleanValue();
    }
}
