package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Circle.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Circle implements SingleIndicatorDrawer {

    @NotNull
    private final IndicatorParams$Style params;

    @NotNull
    private final Paint paint = new Paint();

    @NotNull
    private final RectF rect = new RectF();

    public Circle(@NotNull IndicatorParams$Style indicatorParams$Style) {
        this.params = indicatorParams$Style;
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(@NotNull Canvas canvas, float f10, float f11, @NotNull IndicatorParams$ItemSize indicatorParams$ItemSize, int i10, float f12, int i11) {
        p.i(indicatorParams$ItemSize, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.ItemSize.Circle");
        IndicatorParams$ItemSize.Circle circle = (IndicatorParams$ItemSize.Circle) indicatorParams$ItemSize;
        this.paint.setColor(i10);
        RectF rectF = this.rect;
        rectF.left = f10 - circle.getRadius();
        rectF.top = f11 - circle.getRadius();
        rectF.right = f10 + circle.getRadius();
        rectF.bottom = f11 + circle.getRadius();
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), circle.getRadius(), this.paint);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(@NotNull Canvas canvas, @NotNull RectF rectF) {
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, this.paint);
    }
}
