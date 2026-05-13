package com.bytedance.adsdk.ugeno.bly.le;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.ouw.pno;
import com.bytedance.adsdk.ugeno.ouw.ra;
import com.bytedance.adsdk.ugeno.yu;

/* JADX INFO: loaded from: classes12.dex */
public final class ouw extends TextView implements IAnimation, ra {
    private float fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f11596le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private pno f11597lh;
    public yu ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private float f11598ra;
    private float vt;
    private float yu;

    public ouw(Context context) {
        super(context);
        this.yu = -1.0f;
        this.f11596le = 1.0f;
        this.f11598ra = 0.0f;
        this.f11597lh = new pno(this);
    }

    private int ouw(CharSequence charSequence, TextPaint textPaint, int i10, float f10) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f10);
        return new StaticLayout(charSequence, textPaint2, i10, Layout.Alignment.ALIGN_NORMAL, this.f11596le, this.f11598ra, true).getHeight();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(canvas);
        }
    }

    public final float getBorderRadius() {
        return this.f11597lh.ouw;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRipple() {
        return this.vt;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRubIn() {
        return this.f11597lh.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getShine() {
        return this.f11597lh.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getStretch() {
        return this.f11597lh.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ouw(canvas, this);
            this.ouw.ouw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.fkw();
        }
        if (z10 && this.yu > 0.0f) {
            int compoundPaddingLeft = ((i12 - i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            int compoundPaddingBottom = ((i13 - i11) - getCompoundPaddingBottom()) - getCompoundPaddingTop();
            CharSequence text = getText();
            if (text != null && text.length() != 0 && compoundPaddingBottom > 0 && compoundPaddingLeft > 0 && this.fkw != 0.0f) {
                TextPaint paint = getPaint();
                float fMax = this.fkw;
                int iOuw = ouw(text, paint, compoundPaddingLeft, fMax);
                while (iOuw > compoundPaddingBottom && fMax > this.yu) {
                    Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.yu);
                    fMax = Math.max(fMax - 1.0f, this.yu);
                    iOuw = ouw(text, paint, compoundPaddingLeft, fMax);
                }
                Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
                setTextSize(0, fMax);
                setLineSpacing(this.f11598ra, this.f11596le);
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrOuw = yuVar.ouw(i10, i11);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i10, i11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f11597lh.ouw(i10);
    }

    public final void setBorderRadius(float f10) {
        pno pnoVar = this.f11597lh;
        if (pnoVar != null) {
            pnoVar.ouw(f10);
        }
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.f11596le = f11;
        this.f11598ra = f10;
    }

    public final void setMinTextSize(float f10) {
        this.yu = f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public final void setRipple(float f10) {
        this.vt = f10;
        pno pnoVar = this.f11597lh;
        if (pnoVar != null) {
            pnoVar.vt(f10);
        }
        postInvalidate();
    }

    public final void setRubIn(float f10) {
        pno pnoVar = this.f11597lh;
        if (pnoVar != null) {
            pnoVar.fkw(f10);
        }
    }

    public final void setShine(float f10) {
        pno pnoVar = this.f11597lh;
        if (pnoVar != null) {
            pnoVar.lh(f10);
        }
    }

    public final void setStretch(float f10) {
        pno pnoVar = this.f11597lh;
        if (pnoVar != null) {
            pnoVar.yu(f10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(float f10) {
        super.setTextSize(f10);
        this.fkw = getTextSize();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.fkw = getTextSize();
    }
}
