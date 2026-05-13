package com.mgs.carparking.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes8.dex */
public class OvalImageView extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f45074b;

    public OvalImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45074b = new float[]{a(4.0f), a(4.0f), a(4.0f), a(4.0f), 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public OvalImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45074b = new float[]{a(4.0f), a(4.0f), a(4.0f), a(4.0f), 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public int a(float f10) {
        return (int) ((f10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f45074b, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }
}
