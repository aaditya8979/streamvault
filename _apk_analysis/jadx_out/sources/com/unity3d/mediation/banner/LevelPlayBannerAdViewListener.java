package com.unity3d.mediation.banner;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public interface LevelPlayBannerAdViewListener {
    default void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        p.k(levelPlayAdInfo, "adInfo");
    }

    default void onAdCollapsed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        p.k(levelPlayAdInfo, "adInfo");
    }

    default void onAdDisplayFailed(@NotNull LevelPlayAdInfo levelPlayAdInfo, @NotNull LevelPlayAdError levelPlayAdError) {
        p.k(levelPlayAdInfo, "adInfo");
        p.k(levelPlayAdError, "error");
    }

    default void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        p.k(levelPlayAdInfo, "adInfo");
    }

    default void onAdExpanded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        p.k(levelPlayAdInfo, "adInfo");
    }

    default void onAdLeftApplication(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        p.k(levelPlayAdInfo, "adInfo");
    }

    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
