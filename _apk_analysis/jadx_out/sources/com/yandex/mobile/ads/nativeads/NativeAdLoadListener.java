package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@MainThread
public interface NativeAdLoadListener {
    void onAdFailedToLoad(@NotNull AdRequestError adRequestError);

    void onAdLoaded(@NotNull NativeAd nativeAd);
}
