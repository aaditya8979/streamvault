package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SingleIndicatorDrawer.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface SingleIndicatorDrawer {
    void draw(@NotNull Canvas canvas, float f10, float f11, @NotNull IndicatorParams$ItemSize indicatorParams$ItemSize, int i10, float f12, int i11);

    void drawSelected(@NotNull Canvas canvas, @NotNull RectF rectF);
}
