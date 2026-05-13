package com.unity3d.mediation.interstitial;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public interface LevelPlayInterstitialAdListener {
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
}
