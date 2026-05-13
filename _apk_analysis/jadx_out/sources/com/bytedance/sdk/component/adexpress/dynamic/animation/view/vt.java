package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.yu.ra;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes8.dex */
public final class vt extends ImageView implements IAnimation {
    private float fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private ra f12211le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private float f12212lh;
    public lh ouw;
    private float vt;
    private float yu;

    public vt(Context context) {
        super(context);
        this.ouw = new lh();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final ra getBrickNativeValue() {
        return this.f12211le;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getMarqueeValue() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getRippleValue() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getShineValue() {
        return this.f12212lh;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getStretchValue() {
        return this.fkw;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ra raVar;
        super.onDraw(canvas);
        this.ouw.ouw(canvas, this, this);
        if (getRippleValue() == 0.0f || (raVar = this.f12211le) == null || raVar.vt() <= 0) {
            return;
        }
        ((ViewGroup) getParent()).setClipChildren(false);
        ((ViewGroup) getParent().getParent()).setClipChildren(false);
    }

    @Override // android.widget.ImageView, android.view.View
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
        this.ouw.ouw(this, i10, i11);
    }

    public final void setBrickNativeValue(ra raVar) {
        this.f12211le = raVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setMarqueeValue(float f10) {
        this.yu = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setRippleValue(float f10) {
        this.vt = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setShineValue(float f10) {
        this.f12212lh = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setStretchValue(float f10) {
        this.fkw = f10;
        this.ouw.ouw(this, f10);
    }
}
