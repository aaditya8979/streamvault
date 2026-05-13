package com.yandex.mobile.ads.banner;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@MainThread
public interface BannerAdEventListener {
    void onAdClicked();

    void onAdFailedToLoad(@NotNull AdRequestError adRequestError);

    void onAdLoaded();

    void onImpression(@Nullable ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
