package com.yandex.div.internal.viewpool;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewPool.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ViewPool {
    @NotNull
    <T extends View> T obtain(@NotNull String str);

    <T extends View> void register(@NotNull String str, @NotNull ViewFactory<T> viewFactory, int i10);
}
