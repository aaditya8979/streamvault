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
/* JADX INFO: loaded from: classes2.dex */
public final class SingleLineRenderer extends DivTextRangesBackgroundRenderer {

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final View view;

    public SingleLineRenderer(@NotNull View view, @NotNull ExpressionResolver expressionResolver) {
        this.view = view;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(@NotNull Canvas canvas, @NotNull Layout layout, int i10, int i11, int i12, int i13, @Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground) {
        new BackgroundDrawer(this.view.getResources().getDisplayMetrics(), divTextRangeBorder, divTextRangeBackground, canvas, this.resolver).drawBackground(Math.min(i12, i13), getLineTop(layout, i10), Math.max(i12, i13), getLineBottom(layout, i10));
    }
}
