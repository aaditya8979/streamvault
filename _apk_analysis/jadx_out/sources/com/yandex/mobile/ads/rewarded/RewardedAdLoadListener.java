package com.yandex.mobile.ads.rewarded;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@MainThread
public interface RewardedAdLoadListener {
    void onAdFailedToLoad(@NotNull AdRequestError adRequestError);

    void onAdLoaded(@NotNull RewardedAd rewardedAd);
}
