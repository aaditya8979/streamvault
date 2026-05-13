package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.ImpressionData;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@MainThread
public interface NativeAdEventListener {
    void onAdClicked();

    void onImpression(@Nullable ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
