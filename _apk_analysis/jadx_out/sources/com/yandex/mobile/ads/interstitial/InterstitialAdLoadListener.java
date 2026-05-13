package com.yandex.mobile.ads.interstitial;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@MainThread
public interface InterstitialAdLoadListener {
    void onAdFailedToLoad(@NotNull AdRequestError adRequestError);

    void onAdLoaded(@NotNull InterstitialAd interstitialAd);
}
