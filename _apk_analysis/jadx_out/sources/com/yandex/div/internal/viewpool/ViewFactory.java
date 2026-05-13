package com.yandex.div.internal.viewpool;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface ViewFactory<T extends View> {
    @NotNull
    T createView();
}
