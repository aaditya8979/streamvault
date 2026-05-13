package io.bidmachine.iab.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class CircularProgressBar extends ProgressBar implements IabElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CircularProgressDrawable f69351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f69352b;

    public CircularProgressBar(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f69352b = paint;
        paint.setColor(0);
        a(context);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f69352b = paint;
        paint.setColor(0);
        a(context);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Paint paint = new Paint(1);
        this.f69352b = paint;
        paint.setColor(0);
        a(context);
    }

    public void a(Context context) {
        float f10 = getResources().getDisplayMetrics().density;
        int iDpToPx = Utils.dpToPx(context, 8.0f);
        setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        this.f69351a = circularProgressDrawable;
        circularProgressDrawable.setStrokeWidth(f10 * 4.0f);
        this.f69351a.setColorSchemeColors(SupportMenu.CATEGORY_MASK);
        this.f69351a.setStrokeCap(Paint.Cap.ROUND);
        setIndeterminateDrawable(this.f69351a);
        setIndeterminate(true);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, this.f69352b);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f69351a.setCenterRadius((Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - this.f69351a.getStrokeWidth());
    }

    public void setColorSchemeColors(int... iArr) {
        this.f69351a.setColorSchemeColors(iArr);
    }

    public void setProgressBackgroundColor(int i10) {
        this.f69352b.setColor(i10);
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        this.f69351a.setStrokeWidth(iabElementStyle.getStrokeWidth(getContext()).floatValue());
        this.f69351a.setColorSchemeColors(iabElementStyle.getStrokeColor().intValue());
        this.f69352b.setColor(iabElementStyle.getFillColor().intValue());
        postInvalidate();
    }
}
