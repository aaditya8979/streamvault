package com.bytedance.sdk.component.adexpress.le;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public final class vm extends View {
    private float bly;
    public Animator.AnimatorListener fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f12397le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f12398lh;
    public ValueAnimator ouw;
    private Paint pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private float f12399ra;
    private int tlj;
    public ValueAnimator vt;
    public float yu;

    public vm(Context context, int i10) {
        super(context);
        this.f12398lh = 300L;
        this.bly = 0.0f;
        this.tlj = i10;
        Paint paint = new Paint(1);
        this.pno = paint;
        paint.setStyle(Paint.Style.FILL);
        this.pno.setColor(this.tlj);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f12397le, this.f12399ra, this.bly, this.pno);
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
        this.f12397le = i10 / 2.0f;
        this.f12399ra = i11 / 2.0f;
        this.yu = (float) (Math.hypot(i10, i11) / 2.0d);
    }

    public final void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.fkw = animatorListener;
    }
}
