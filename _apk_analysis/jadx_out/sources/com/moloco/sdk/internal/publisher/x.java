package com.moloco.sdk.internal.publisher;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@VisibleForTesting
public final class x implements RewardedInterstitialAdShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RewardedInterstitialAdShowListener f47051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final sn.a<Boolean> f47053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f47054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f47055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final sn.a<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> f47056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f47057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f47058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f47059i;

    /* JADX WARN: Multi-variable type inference failed */
    public x(@NotNull RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, boolean z10, @NotNull sn.a<Boolean> aVar, @NotNull String str, boolean z11, @NotNull sn.a<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> aVar2, @NotNull com.moloco.sdk.acm.recorder.a aVar3) {
        tn.p.k(rewardedInterstitialAdShowListener, "listenerTracker");
        tn.p.k(aVar, "isAdForciblyClosed");
        tn.p.k(str, "adUnitId");
        tn.p.k(aVar2, "getCreativeType");
        tn.p.k(aVar3, "metricsRecorder");
        this.f47051a = rewardedInterstitialAdShowListener;
        this.f47052b = z10;
        this.f47053c = aVar;
        this.f47054d = str;
        this.f47055e = z11;
        this.f47056f = aVar2;
        this.f47057g = aVar3;
        this.f47058h = "RewardedInterstitialAdShowListenerImpl";
    }

    public void a() {
        if (!this.f47055e) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f47058h, "onCloseOrSkipButtonShown called - skip button shown but reward requires user click (feature flag disabled)", null, false, 12, null);
        } else {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f47058h, "onCloseOrSkipButtonShown called - granting reward as skip button is now available (feature flag enabled)", null, false, 12, null);
            b(MolocoAdKt.createAdInfo$default(this.f47054d, null, null, 6, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.moloco.sdk.publisher.MolocoAd r9) {
        /*
            r8 = this;
            boolean r0 = r8.f47059i
            if (r0 == 0) goto L11
            com.moloco.sdk.internal.MolocoLogger r1 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r2 = r8.f47058h
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r3 = "issuing of reward is already handled"
            com.moloco.sdk.internal.MolocoLogger.debug$default(r1, r2, r3, r4, r5, r6)
            return
        L11:
            r0 = 1
            r8.f47059i = r0
            sn.a<java.lang.Boolean> r0 = r8.f47053c
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = tn.p.f(r0, r1)
            if (r0 == 0) goto L7a
            sn.a<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> r0 = r8.f47056f
            java.lang.Object r0 = r0.invoke()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) r0
            com.moloco.sdk.internal.MolocoLogger r1 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r2 = r8.f47058h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "issuing of reward... creativeType: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r5 = 4
            r6 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.acm.recorder.a r1 = r8.f47057g
            com.moloco.sdk.acm.b r2 = new com.moloco.sdk.acm.b
            com.moloco.sdk.internal.client_metrics_data.b r3 = com.moloco.sdk.internal.client_metrics_data.b.X
            java.lang.String r3 = r3.c()
            r2.<init>(r3)
            com.moloco.sdk.internal.client_metrics_data.d r3 = com.moloco.sdk.internal.client_metrics_data.d.f45975h
            java.lang.String r3 = r3.c()
            if (r0 == 0) goto L6d
            java.lang.String r0 = r0.name()
            if (r0 == 0) goto L6d
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            tn.p.j(r0, r4)
            if (r0 != 0) goto L6f
        L6d:
            java.lang.String r0 = "unknown"
        L6f:
            com.moloco.sdk.acm.b r0 = r2.e(r3, r0)
            r1.b(r0)
            r8.onUserRewarded(r9)
            goto L86
        L7a:
            com.moloco.sdk.internal.MolocoLogger r2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r3 = r8.f47058h
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r4 = "reward can't be issued: ad was forcibly closed or ad was missing"
            com.moloco.sdk.internal.MolocoLogger.debug$default(r2, r3, r4, r5, r6, r7)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.x.b(com.moloco.sdk.publisher.MolocoAd):void");
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f47051a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        b(molocoAd);
        this.f47051a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(@NotNull MolocoAdError molocoAdError) {
        tn.p.k(molocoAdError, "molocoAdError");
        this.f47051a.onAdShowFailed(molocoAdError);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f47051a.onAdShowSuccess(molocoAd);
        if (this.f47052b) {
            onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        b(molocoAd);
        this.f47051a.onRewardedVideoCompleted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f47051a.onRewardedVideoStarted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f47051a.onUserRewarded(molocoAd);
    }
}
