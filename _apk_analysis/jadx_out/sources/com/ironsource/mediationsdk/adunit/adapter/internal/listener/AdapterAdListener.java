package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AdapterAdListener {
    void onAdClicked();

    default void onAdClicked(@NotNull Map<String, Object> map) {
        onAdClicked();
    }

    void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i10, String str);

    default void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i10, String str, @NotNull Map<String, Object> map) {
        onAdLoadFailed(adapterErrorType, i10, str);
    }

    void onAdLoadSuccess();

    default void onAdLoadSuccess(@NotNull Map<String, Object> map) {
        onAdLoadSuccess();
    }

    void onAdOpened();

    default void onAdOpened(@NotNull Map<String, Object> map) {
        onAdOpened();
    }

    void onAdShowFailed(int i10, String str);

    default void onAdShowFailed(int i10, String str, @NotNull Map<String, Object> map) {
        onAdShowFailed(i10, str);
    }
}
