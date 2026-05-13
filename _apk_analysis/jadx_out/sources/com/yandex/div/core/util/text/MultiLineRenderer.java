package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTextRangesBackgroundRenderer.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MultiLineRenderer extends DivTextRangesBackgroundRenderer {

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final View view;

    public MultiLineRenderer(@NotNull View view, @NotNull ExpressionResolver expressionResolver) {
        this.view = view;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(@NotNull Canvas canvas, @NotNull Layout layout, int i10, int i11, int i12, int i13, @Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground) {
        int paragraphDirection = layout.getParagraphDirection(i10);
        float lineLeft = paragraphDirection == -1 ? layout.getLineLeft(i10) : layout.getLineRight(i10);
        int lineBottom = getLineBottom(layout, i10);
        int lineTop = getLineTop(layout, i10);
        BackgroundDrawer backgroundDrawer = new BackgroundDrawer(this.view.getResources().getDisplayMetrics(), divTextRangeBorder, divTextRangeBackground, canvas, this.resolver);
        backgroundDrawer.drawBackgroundStart(i12, lineTop, (int) lineLeft, lineBottom);
        for (int i14 = i10 + 1; i14 < i11; i14++) {
            backgroundDrawer.drawBackgroundMiddle((int) layout.getLineLeft(i14), getLineTop(layout, i14), (int) layout.getLineRight(i14), getLineBottom(layout, i14));
        }
        backgroundDrawer.drawBackgroundEnd((int) (paragraphDirection == -1 ? layout.getLineRight(i10) : layout.getLineLeft(i10)), getLineTop(layout, i11), i13, getLineBottom(layout, i11));
    }
}
