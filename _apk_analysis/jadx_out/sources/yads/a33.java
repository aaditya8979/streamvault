package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a33 extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f87561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f87562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87564d;

    public a33(@NotNull Context context) {
        super(context);
        this.f87561a = new Rect();
        this.f87562b = new Paint();
        this.f87563c = kl3.a(getContext(), 1.0f);
        this.f87564d = kl3.a(getContext(), 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iA = kl3.a(getCurrentTextColor(), 85.0f);
        Paint paint = this.f87562b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f87563c);
        paint.setColor(iA);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i10 = 0; i10 < lineCount; i10++) {
            int lineBounds = getLineBounds(i10, this.f87561a);
            int lineStart = layout.getLineStart(i10);
            int lineEnd = layout.getLineEnd(i10);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(lineEnd - 1) + (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal);
            float f10 = lineBounds + this.f87564d;
            canvas.drawLine(primaryHorizontal, f10, primaryHorizontal2, f10, paint);
        }
        super.onDraw(canvas);
    }
}
