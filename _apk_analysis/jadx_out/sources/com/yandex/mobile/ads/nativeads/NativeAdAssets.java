package com.yandex.mobile.ads.nativeads;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface NativeAdAssets {
    @Nullable
    String getBody();

    @Nullable
    String getCallToAction();

    @Nullable
    String getDomain();

    @Nullable
    NativeAdImage getIcon();

    @Nullable
    Float getRating();

    @Nullable
    String getTitle();
}
