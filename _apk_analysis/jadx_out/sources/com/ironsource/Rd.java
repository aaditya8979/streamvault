package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Rd implements U<RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Tf f30350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final RewardedAdLoaderListener f30351b;

    public Rd(@NotNull Tf tf2, @NotNull RewardedAdLoaderListener rewardedAdLoaderListener) {
        tn.p.k(tf2, "threadManager");
        tn.p.k(rewardedAdLoaderListener, "publisherListener");
        this.f30350a = tf2;
        this.f30351b = rewardedAdLoaderListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Rd rd2, IronSourceError ironSourceError) {
        tn.p.k(rd2, "this$0");
        tn.p.k(ironSourceError, "$error");
        rd2.f30351b.onRewardedAdLoadFailed(ironSourceError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd rewardedAd, Rd rd2) {
        tn.p.k(rewardedAd, "$adObject");
        tn.p.k(rd2, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + rewardedAd.getAdInfo());
        rd2.f30351b.onRewardedAdLoaded(rewardedAd);
    }

    @Override // com.ironsource.U
    public void a(@NotNull final RewardedAd rewardedAd) {
        tn.p.k(rewardedAd, "adObject");
        this.f30350a.a(new Runnable() { // from class: com.ironsource.ij
            @Override // java.lang.Runnable
            public final void run() {
                Rd.a(rewardedAd, this);
            }
        });
    }

    @Override // com.ironsource.U
    public void b(@NotNull final IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + ironSourceError);
        this.f30350a.a(new Runnable() { // from class: com.ironsource.jj
            @Override // java.lang.Runnable
            public final void run() {
                Rd.a(this.f32093b, ironSourceError);
            }
        });
    }
}
