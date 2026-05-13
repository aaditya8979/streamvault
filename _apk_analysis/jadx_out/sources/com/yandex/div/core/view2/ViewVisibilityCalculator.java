package com.yandex.div.core.view2;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewVisibilityCalculator.kt */
/* JADX INFO: loaded from: classes3.dex */
public class ViewVisibilityCalculator {

    @NotNull
    private final Rect visibleRect = new Rect();

    @IntRange(from = 0, to = 100)
    @MainThread
    public int calculateVisibilityPercentage(@NotNull View view) {
        if (!view.isShown() || !view.getGlobalVisibleRect(this.visibleRect)) {
            return 0;
        }
        return ((this.visibleRect.width() * this.visibleRect.height()) * 100) / (view.getWidth() * view.getHeight());
    }

    @MainThread
    public boolean isViewFullyVisible(@NotNull View view) {
        return view.isShown() && view.getGlobalVisibleRect(this.visibleRect) && view.getWidth() == this.visibleRect.width() && view.getHeight() == this.visibleRect.height();
    }
}
