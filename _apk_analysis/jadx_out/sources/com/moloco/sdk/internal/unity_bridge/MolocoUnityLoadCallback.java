package com.moloco.sdk.internal.unity_bridge;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface MolocoUnityLoadCallback {
    void onAdLoadFailed(@NotNull String str, @NotNull String str2);

    void onAdLoadSuccess(@NotNull String str);
}
