package com.ironsource.mediationsdk.adunit.adapter.listener;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i10, @Nullable String str);

    default void onInitFailed(int i10, @Nullable String str, Map<String, Object> map) {
        onInitFailed(i10, str);
    }

    void onInitSuccess();

    default void onInitSuccess(Map<String, Object> map) {
        onInitSuccess();
    }
}
