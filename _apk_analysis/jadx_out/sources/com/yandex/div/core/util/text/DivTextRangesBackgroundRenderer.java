package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTextRangesBackgroundRenderer.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DivTextRangesBackgroundRenderer {
    private final int getLineBottomWithoutSpacing(Layout layout, int i10) {
        int lineBottom = layout.getLineBottom(i10);
        boolean z10 = true;
        boolean z11 = i10 == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if (spacingAdd == 0.0f) {
            if (spacingMultiplier == 1.0f) {
                z10 = false;
            }
        }
        if (!z10 || z11) {
            return lineBottom;
        }
        if (Float.compare(spacingMultiplier, 1.0f) != 0) {
            float lineHeight = getLineHeight(layout, i10);
            spacingAdd = lineHeight - ((lineHeight - spacingAdd) / spacingMultiplier);
        }
        return (int) (lineBottom - spacingAdd);
    }

    private final int getLineHeight(Layout layout, int i10) {
        return layout.getLineTop(i10 + 1) - layout.getLineTop(i10);
    }

    public abstract void draw(@NotNull Canvas canvas, @NotNull Layout layout, int i10, int i11, int i12, int i13, @Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground);

    public final int getLineBottom(@NotNull Layout layout, int i10) {
        int lineBottomWithoutSpacing = getLineBottomWithoutSpacing(layout, i10);
        return i10 == layout.getLineCount() + (-1) ? lineBottomWithoutSpacing - layout.getBottomPadding() : lineBottomWithoutSpacing;
    }

    public final int getLineTop(@NotNull Layout layout, int i10) {
        int lineTop = layout.getLineTop(i10);
        return i10 == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }
}
