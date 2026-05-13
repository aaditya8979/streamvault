package com.yandex.div.internal.widget;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TransientView.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface TransientView {
    boolean isTransient();

    void transitionFinished(@NotNull View view);

    void transitionStarted(@NotNull View view);
}
