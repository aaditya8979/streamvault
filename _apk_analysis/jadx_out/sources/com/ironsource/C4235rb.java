package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4235rb {

    /* JADX INFO: renamed from: com.ironsource.rb$a */
    public static final class a implements InterfaceC3985db {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LevelPlayRewardedAdListener f33422a;

        public a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.f33422a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + levelPlayAdInfo);
            this.f33422a.onAdClicked(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdClosed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + levelPlayAdInfo);
            this.f33422a.onAdClosed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdDisplayFailed(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdError, "error");
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + levelPlayAdInfo + " error: " + levelPlayAdError);
            this.f33422a.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + levelPlayAdInfo);
            this.f33422a.onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + levelPlayAdInfo);
            this.f33422a.onAdInfoChanged(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
            tn.p.k(levelPlayAdError, "error");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + levelPlayAdError);
            this.f33422a.onAdLoadFailed(levelPlayAdError);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + levelPlayAdInfo);
            this.f33422a.onAdLoaded(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdRewarded(@NotNull LevelPlayReward levelPlayReward, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayReward, "reward");
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + levelPlayReward + " adInfo: " + levelPlayAdInfo);
            this.f33422a.onAdRewarded(levelPlayReward, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3985db b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}
