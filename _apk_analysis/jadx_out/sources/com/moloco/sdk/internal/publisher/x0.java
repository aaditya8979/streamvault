package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.MolocoAd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface x0 {
    void a();

    void a(@NotNull com.moloco.sdk.internal.c0 c0Var);

    void onAdClicked(@NotNull MolocoAd molocoAd);

    void onAdHidden(@NotNull MolocoAd molocoAd);

    void onAdShowSuccess(@NotNull MolocoAd molocoAd);
}
