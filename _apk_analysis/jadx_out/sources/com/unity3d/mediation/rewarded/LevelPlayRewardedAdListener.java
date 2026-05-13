package com.unity3d.mediation.rewarded;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
public interface LevelPlayRewardedAdListener {
    default void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        p.k(levelPlayAdInfo, "adInfo");
    }

    default void onAdClosed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        p.k(levelPlayAdInfo, "adInfo");
    }

    default void onAdDisplayFailed(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        p.k(levelPlayAdError, "error");
        p.k(levelPlayAdInfo, "adInfo");
    }

    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        p.k(levelPlayAdInfo, "adInfo");
    }

    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdRewarded(@NotNull LevelPlayReward levelPlayReward, @NotNull LevelPlayAdInfo levelPlayAdInfo);
}
