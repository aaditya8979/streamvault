package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import com.applovin.impl.adview.e;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Paint f7771e = new Paint(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Paint f7772f = new Paint(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f7773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Path f7774d;

    public j(Context context) {
        super(context);
        this.f7773c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f7771e.setARGB(80, 0, 0, 0);
        Paint paint = f7772f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    private void a() {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f7773c;
            if (i10 >= fArr.length) {
                Path path = new Path();
                this.f7774d = path;
                float[] fArr2 = this.f7773c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f7774d;
                float[] fArr3 = this.f7773c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f7774d;
                float[] fArr4 = this.f7773c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f7774d;
                float[] fArr5 = this.f7773c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f7774d;
                float[] fArr6 = this.f7773c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f7774d;
                float[] fArr7 = this.f7773c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
            fArr[i10] = fArr[i10] * 0.3f * this.f7748a;
            i10++;
        }
    }

    @Override // com.applovin.impl.adview.e
    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        a();
    }

    @Override // com.applovin.impl.adview.e, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53127a, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getStrokeWidth() {
        return this.f7748a * 2.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f7771e);
        Paint paint = f7772f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f7774d, paint);
    }

    @Override // com.applovin.impl.adview.e, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
