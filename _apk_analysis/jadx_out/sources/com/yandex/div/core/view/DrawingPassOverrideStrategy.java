package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DrawingPassOverrideStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
public interface DrawingPassOverrideStrategy {

    /* JADX INFO: compiled from: DrawingPassOverrideStrategy.kt */
    public static final class Safe extends SafeDrawingPassOverrideStrategy {

        @NotNull
        public static final Safe INSTANCE = new Safe();

        private Safe() {
        }
    }

    boolean overrideDrawingPass(@NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener, boolean z10);
}
