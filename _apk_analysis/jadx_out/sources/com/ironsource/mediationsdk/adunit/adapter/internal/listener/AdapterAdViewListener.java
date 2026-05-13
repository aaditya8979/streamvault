package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    default void onAdLeftApplication(Map<String, Object> map) {
        onAdLeftApplication();
    }

    void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams);

    default void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        onAdLoadSuccess(view, layoutParams);
    }

    void onAdScreenDismissed();

    default void onAdScreenDismissed(Map<String, Object> map) {
        onAdScreenDismissed();
    }

    void onAdScreenPresented();

    default void onAdScreenPresented(Map<String, Object> map) {
        onAdScreenPresented();
    }
}
