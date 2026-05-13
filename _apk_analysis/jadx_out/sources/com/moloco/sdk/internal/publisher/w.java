package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class w {
    @NotNull
    public static final RewardedInterstitialAd a(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, @NotNull q0<RewardedInterstitialAdShowListener> q0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull a0 a0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar2, @NotNull com.moloco.sdk.internal.services.config.a aVar3) {
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
        tn.p.k(aVar3, "configService");
        return new r(new u(context, rVar, aVar, str, lVar, w0Var, new sn.l() { // from class: com.moloco.sdk.internal.publisher.t
            @Override // sn.l
            public final Object invoke(Object obj) {
                return w.c((com.moloco.sdk.internal.ortb.model.y) obj);
            }
        }, q0Var, AdFormatType.REWARDED, e0Var, a0Var, aVar2), str, aVar3, aVar2);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p c(com.moloco.sdk.internal.ortb.model.y yVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVarJ;
        return (yVar == null || (pVarJ = com.moloco.sdk.internal.h.j(yVar)) == null) ? com.moloco.sdk.internal.h.i() : pVarJ;
    }
}
