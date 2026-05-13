package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.i;
import io.bidmachine.rendering.internal.s;
import io.bidmachine.rendering.model.AppearanceParams;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends View implements io.bidmachine.rendering.internal.e, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f70645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f70646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.f70645a = new Paint(1);
        this.f70647c = i.f70455c;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLineBackgroundColor$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLineColor$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLinePaint$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPercent$annotations() {
    }

    @Override // io.bidmachine.rendering.internal.s
    public void a(long j10, long j11, float f10) {
        this.f70646b = f10;
        postInvalidate();
    }

    @Override // io.bidmachine.rendering.internal.e
    public void a(AppearanceParams appearanceParams) {
        p.k(appearanceParams, "appearanceParams");
        Integer fillColor = appearanceParams.getFillColor();
        if (fillColor != null) {
            this.f70648d = fillColor.intValue();
        }
        Integer strokeColor = appearanceParams.getStrokeColor();
        if (strokeColor != null) {
            this.f70647c = strokeColor.intValue();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int getLineBackgroundColor() {
        return this.f70648d;
    }

    public final int getLineColor() {
        return this.f70647c;
    }

    @NotNull
    public final Paint getLinePaint() {
        return this.f70645a;
    }

    public final float getPercent() {
        return this.f70646b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        p.k(canvas, "canvas");
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f70645a.setColor(this.f70648d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f70645a);
        this.f70645a.setColor(this.f70647c);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f70646b) / 100), measuredHeight, this.f70645a);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f70645a.setStrokeWidth(getMeasuredHeight());
    }

    public final void setLineBackgroundColor(int i10) {
        this.f70648d = i10;
    }

    public final void setLineColor(int i10) {
        this.f70647c = i10;
    }

    public final void setPercent(float f10) {
        this.f70646b = f10;
    }
}
