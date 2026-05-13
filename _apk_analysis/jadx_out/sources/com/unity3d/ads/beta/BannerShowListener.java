package com.unity3d.ads.beta;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BannerShowListener.kt */
/* JADX INFO: loaded from: classes.dex */
public interface BannerShowListener {
    void unityAdsBannerDidClick(@NotNull BannerAd bannerAd);

    void unityAdsBannerDidFailShow(@NotNull BannerAd bannerAd, @NotNull UnityAdsError unityAdsError);

    void unityAdsBannerImpression(@NotNull BannerAd bannerAd);
}
