package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    default void onAdClosed(@NotNull Map<String, Object> map) {
        onAdClosed();
    }

    void onAdEnded();

    default void onAdEnded(@NotNull Map<String, Object> map) {
        onAdEnded();
    }

    void onAdStarted();

    default void onAdStarted(@NotNull Map<String, Object> map) {
        onAdStarted();
    }

    void onAdVisible();

    default void onAdVisible(@NotNull Map<String, Object> map) {
        onAdVisible();
    }
}
