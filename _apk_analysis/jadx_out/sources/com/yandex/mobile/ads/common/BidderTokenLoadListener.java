package com.yandex.mobile.ads.common;

import androidx.annotation.MainThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface BidderTokenLoadListener {
    @MainThread
    void onBidderTokenFailedToLoad(@NotNull String str);

    @MainThread
    void onBidderTokenLoaded(@NotNull String str);
}
