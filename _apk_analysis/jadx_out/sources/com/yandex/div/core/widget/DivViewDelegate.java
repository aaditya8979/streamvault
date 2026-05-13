package com.yandex.div.core.widget;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivViewDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface DivViewDelegate {
    void buildDrawingCache(boolean z10);

    @NotNull
    Drawable invalidateDrawable(@NotNull Drawable drawable);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    boolean onVisibilityChanged(@NotNull View view, int i10);

    void unscheduleDrawable(@Nullable Drawable drawable);
}
