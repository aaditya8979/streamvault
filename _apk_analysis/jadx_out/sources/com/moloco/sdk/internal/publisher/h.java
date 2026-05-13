package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    public static final class a implements InterstitialAdShowListener, AdShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdShowListener f46646a;

        public a(InterstitialAdShowListener interstitialAdShowListener) {
            this.f46646a = g0.a(interstitialAdShowListener);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            tn.p.k(molocoAd, "molocoAd");
            this.f46646a.onAdClicked(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            tn.p.k(molocoAd, "molocoAd");
            this.f46646a.onAdHidden(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            tn.p.k(molocoAdError, "molocoAdError");
            this.f46646a.onAdShowFailed(molocoAdError);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            tn.p.k(molocoAd, "molocoAd");
            this.f46646a.onAdShowSuccess(molocoAd);
        }
    }

    @NotNull
    public static final InterstitialAd a(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, @NotNull q0<InterstitialAdShowListener> q0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull a0 a0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(str, "adUnitId");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(lVar, "persistentHttpRequest");
        tn.p.k(q0Var, "adDataHolder");
        tn.p.k(e0Var, "watermark");
        tn.p.k(a0Var, "adCreateLoadTimeoutManager");
        tn.p.k(aVar2, "metricsRecorder");
        return new f(new u(context, rVar, aVar, str, lVar, w0Var, new sn.l() { // from class: com.moloco.sdk.internal.publisher.g
            @Override // sn.l
            public final Object invoke(Object obj) {
                return h.d((com.moloco.sdk.internal.ortb.model.y) obj);
            }
        }, q0Var, AdFormatType.INTERSTITIAL, e0Var, a0Var, aVar2));
    }

    @NotNull
    public static final InterstitialAdShowListener c(@Nullable InterstitialAdShowListener interstitialAdShowListener) {
        return new a(interstitialAdShowListener);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p d(com.moloco.sdk.internal.ortb.model.y yVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVarJ;
        return (yVar == null || (pVarJ = com.moloco.sdk.internal.h.j(yVar)) == null) ? com.moloco.sdk.internal.h.i() : pVarJ;
    }
}
