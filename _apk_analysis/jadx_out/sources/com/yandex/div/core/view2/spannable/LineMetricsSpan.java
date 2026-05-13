package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LineMetricsSpan.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LineMetricsSpan implements LineBackgroundSpan {

    @NotNull
    private final Paint linePaint;

    public LineMetricsSpan() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(false);
        paint.setStrokeWidth(0.0f);
        this.linePaint = paint;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(@NotNull Canvas canvas, @NotNull Paint paint, int i10, int i11, int i12, int i13, int i14, @NotNull CharSequence charSequence, int i15, int i16, int i17) {
        this.linePaint.setColor(-16764855);
        float f10 = i12;
        float f11 = i10;
        float f12 = i11;
        canvas.drawLine(f11, f10, f12, f10, this.linePaint);
        this.linePaint.setColor(-557312);
        this.linePaint.setPathEffect(new DashPathEffect(new float[]{8.0f, 4.0f, 1.0f, 4.0f}, 0.0f));
        float f13 = f10 + ((i14 - i12) / 2.0f);
        canvas.drawLine(f11, f13, f12, f13, this.linePaint);
        this.linePaint.setColor(-2742232);
        this.linePaint.setPathEffect(null);
        float f14 = i13 - 1;
        canvas.drawLine(f11, f14, f12, f14, this.linePaint);
        this.linePaint.setColor(-213175);
        float f15 = i14 - 1;
        canvas.drawLine(f11, f15, f12, f15, this.linePaint);
    }
}
