package com.moloco.sdk.publisher;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface MolocoAdapterBannerListener extends BannerAdShowListener {
    void onAdLoadFailed(@NotNull MolocoAdError molocoAdError);

    void onAdLoaded(@NotNull MolocoAd molocoAd, @NotNull Banner banner);
}
