package com.moloco.sdk.internal.publisher;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 1)
@VisibleForTesting
public final class y implements RewardedInterstitialAdShowListener, AdShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdShowListener f47060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final RewardedInterstitialAdShowListener f47061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final sn.a<A> f47062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.h0 f47063d;

    public y(@Nullable RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, @NotNull sn.a<A> aVar, @NotNull com.moloco.sdk.internal.h0 h0Var) {
        tn.p.k(aVar, "provideSdkEvents");
        tn.p.k(h0Var, "sdkEventUrlTracker");
        this.f47060a = g0.a(rewardedInterstitialAdShowListener);
        this.f47061b = rewardedInterstitialAdShowListener;
        this.f47062c = aVar;
        this.f47063d = h0Var;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f47060a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f47060a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(@NotNull MolocoAdError molocoAdError) {
        tn.p.k(molocoAdError, "molocoAdError");
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f47061b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f47060a.onAdShowSuccess(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(@NotNull MolocoAd molocoAd) {
        String strI;
        tn.p.k(molocoAd, "molocoAd");
        A aInvoke = this.f47062c.invoke();
        if (aInvoke != null && (strI = aInvoke.i()) != null) {
            h0.a.a(this.f47063d, strI, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f47061b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoCompleted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(@NotNull MolocoAd molocoAd) {
        String strJ;
        tn.p.k(molocoAd, "molocoAd");
        A aInvoke = this.f47062c.invoke();
        if (aInvoke != null && (strJ = aInvoke.j()) != null) {
            h0.a.a(this.f47063d, strJ, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f47061b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(@NotNull MolocoAd molocoAd) {
        String strK;
        tn.p.k(molocoAd, "molocoAd");
        A aInvoke = this.f47062c.invoke();
        if (aInvoke != null && (strK = aInvoke.k()) != null) {
            h0.a.a(this.f47063d, strK, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f47061b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onUserRewarded(molocoAd);
        }
    }
}
