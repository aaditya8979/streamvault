package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabElement;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.Utils;

/* JADX INFO: loaded from: classes2.dex */
public class LinearCountdownView extends View implements IabElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f69752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f69753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69756e;

    public LinearCountdownView(@NonNull Context context) {
        super(context);
        this.f69752a = new Paint(1);
        this.f69753b = 0.0f;
        this.f69754c = 15.0f;
        this.f69755d = Assets.MAIN_ASSETS_COLOR;
        this.f69756e = 0;
        a();
    }

    public LinearCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69752a = new Paint(1);
        this.f69753b = 0.0f;
        this.f69754c = 15.0f;
        this.f69755d = Assets.MAIN_ASSETS_COLOR;
        this.f69756e = 0;
        a();
    }

    private void a() {
        this.f69754c = Utils.dpToPx(getContext(), 4.0f);
    }

    public void changePercentage(float f10) {
        this.f69753b = f10;
        postInvalidate();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLineColor() {
        return this.f69755d;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f69752a.setStrokeWidth(this.f69754c);
        this.f69752a.setColor(this.f69756e);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f69752a);
        this.f69752a.setColor(this.f69755d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f69753b) / 100.0f), measuredHeight, this.f69752a);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        this.f69755d = iabElementStyle.getStrokeColor().intValue();
        this.f69756e = iabElementStyle.getFillColor().intValue();
        this.f69754c = iabElementStyle.getStrokeWidth(getContext()).floatValue();
        setAlpha(iabElementStyle.getOpacity().floatValue());
        postInvalidate();
    }
}
