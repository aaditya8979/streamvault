package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public final class bly extends View {
    private Paint fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f12352le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final RectF f12353lh;
    private int ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Paint f12354ra;
    private int vt;
    private Paint yu;

    public bly(Context context) {
        super(context);
        this.f12353lh = new RectF();
        Paint paint = new Paint();
        this.yu = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f12354ra = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.fkw = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f12353lh;
        int i10 = this.f12352le;
        canvas.drawRoundRect(rectF, i10, i10, this.fkw);
        RectF rectF2 = this.f12353lh;
        int i11 = this.f12352le;
        canvas.drawRoundRect(rectF2, i11, i11, this.yu);
        int i12 = this.ouw;
        int i13 = this.vt;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.f12354ra);
        int i14 = this.ouw;
        int i15 = this.vt;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.f12354ra);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.ouw = i10;
        this.vt = i11;
        RectF rectF = this.f12353lh;
        int i14 = this.pno;
        rectF.set(i14, i14, i10 - i14, i11 - i14);
    }

    public final void setBgColor(int i10) {
        this.fkw.setStyle(Paint.Style.FILL);
        this.fkw.setColor(i10);
    }

    public final void setDislikeColor(int i10) {
        this.f12354ra.setColor(i10);
    }

    public final void setDislikeWidth(int i10) {
        this.f12354ra.setStrokeWidth(i10);
    }

    public final void setRadius(int i10) {
        this.f12352le = i10;
    }

    public final void setStrokeColor(int i10) {
        this.yu.setStyle(Paint.Style.STROKE);
        this.yu.setColor(i10);
    }

    public final void setStrokeWidth(int i10) {
        this.yu.setStrokeWidth(i10);
        this.pno = i10;
    }
}
