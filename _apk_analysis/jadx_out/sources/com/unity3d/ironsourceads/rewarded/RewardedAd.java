package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.Nd;
import com.ironsource.Od;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class RewardedAd implements Od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Nd f53457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private RewardedAdListener f53458b;

    public RewardedAd(@NotNull Nd nd2) {
        p.k(nd2, "rewardedAdInternal");
        this.f53457a = nd2;
        nd2.a(this);
    }

    @NotNull
    public final RewardedAdInfo getAdInfo() {
        return this.f53457a.b();
    }

    @Nullable
    public final RewardedAdListener getListener() {
        return this.f53458b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f53457a.d();
    }

    @Override // com.ironsource.Od
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f53458b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdClicked() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdClicked adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f53458b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdDismissed() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdDismissed adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f53458b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdFailedToShow(@NotNull IronSourceError ironSourceError) {
        p.k(ironSourceError, "error");
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdFailedToShow error: " + ironSourceError + " adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f53458b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, ironSourceError);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdShown() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f53458b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Od
    public void onUserEarnedReward() {
        IronLog.CALLBACK.info("RewardedAdListener onUserEarnedReward adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f53458b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(@Nullable RewardedAdListener rewardedAdListener) {
        this.f53458b = rewardedAdListener;
    }

    public final void show(@NotNull Activity activity) {
        p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        IronLog.API.info();
        this.f53457a.a(activity);
    }
}
