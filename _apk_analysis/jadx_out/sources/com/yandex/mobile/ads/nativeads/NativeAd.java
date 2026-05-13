package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@MainThread
public interface NativeAd {
    void bindNativeAd(@NotNull NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    @NotNull
    NativeAdAssets getAdAssets();

    void setNativeAdEventListener(@Nullable NativeAdEventListener nativeAdEventListener);
}
