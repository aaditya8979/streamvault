package com.mgs.carparking.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.mgs.carparking.R$styleable;

/* JADX INFO: loaded from: classes3.dex */
public class PieProgressBar extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f45075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45079f;

    public PieProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PieProgressBar(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45078e = 0;
        this.f45075b = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PieProgressBar);
        this.f45076c = typedArrayObtainStyledAttributes.getColor(2, Color.parseColor("#ffffff"));
        this.f45077d = typedArrayObtainStyledAttributes.getColor(1, Color.parseColor("#ffffff"));
        this.f45079f = typedArrayObtainStyledAttributes.getInt(0, 100);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getMaxProgress() {
        return this.f45079f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2;
        this.f45075b.setColor(this.f45077d);
        this.f45075b.setStyle(Paint.Style.STROKE);
        this.f45075b.setStrokeWidth(1.0f);
        canvas.drawCircle(width, width, width, this.f45075b);
        this.f45075b.setStyle(Paint.Style.FILL);
        this.f45075b.setColor(this.f45077d);
        float f10 = (width + width) - 3.0f;
        canvas.drawArc(new RectF(3.0f, 3.0f, f10, f10), -90.0f, (this.f45078e * 360) / this.f45079f, true, this.f45075b);
    }

    public void setMaxProgress(int i10) {
        if (i10 > 0) {
            this.f45079f = i10;
        }
    }

    public void setProgress(int i10) {
        int i11 = this.f45079f;
        if (i10 > i11) {
            i10 = i11;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        this.f45078e = i10;
        invalidate();
    }
}
