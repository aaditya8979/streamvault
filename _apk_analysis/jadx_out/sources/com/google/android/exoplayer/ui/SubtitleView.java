package com.google.android.exoplayer.ui;

import a6.k0;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;
import n5.b;
import n5.j;
import x5.c;

/* JADX INFO: loaded from: classes4.dex */
public final class SubtitleView extends View implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f20973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<b> f20974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f20976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n5.a f20979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f20980i;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20973b = new ArrayList();
        this.f20975d = 0;
        this.f20976e = 0.0533f;
        this.f20977f = true;
        this.f20978g = true;
        this.f20979h = n5.a.f75118g;
        this.f20980i = 0.08f;
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private n5.a getUserCaptionStyleV19() {
        return n5.a.a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    @TargetApi(19)
    public final boolean a() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).isEnabled();
    }

    public final float b(b bVar, int i10, int i11) {
        int i12 = bVar.f75138n;
        if (i12 != Integer.MIN_VALUE) {
            float f10 = bVar.f75139o;
            if (f10 != -3.4028235E38f) {
                return Math.max(c(i12, f10, i10, i11), 0.0f);
            }
        }
        return 0.0f;
    }

    public final float c(int i10, float f10, int i11, int i12) {
        float f11;
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }

    public void d(float f10, boolean z10) {
        e(z10 ? 1 : 0, f10);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<b> list = this.f20974c;
        int i10 = 0;
        int size = list == null ? 0 : list.size();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i11 = paddingBottom - paddingTop;
        float fC = c(this.f20975d, this.f20976e, height, i11);
        if (fC <= 0.0f) {
            return;
        }
        while (i10 < size) {
            b bVar = this.f20974c.get(i10);
            int i12 = paddingBottom;
            int i13 = width;
            this.f20973b.get(i10).b(bVar, this.f20977f, this.f20978g, this.f20979h, fC, b(bVar, height, i11), this.f20980i, canvas, paddingLeft, paddingTop, i13, i12);
            i10++;
            i11 = i11;
            paddingBottom = i12;
            width = i13;
            paddingLeft = paddingLeft;
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, float f10) {
        if (this.f20975d == i10 && this.f20976e == f10) {
            return;
        }
        this.f20975d = i10;
        this.f20976e = f10;
        invalidate();
    }

    public void f() {
        setStyle((k0.f3574a < 19 || !a() || isInEditMode()) ? n5.a.f75118g : getUserCaptionStyleV19());
    }

    public void g() {
        setFractionalTextSize(((k0.f3574a < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    @Override // n5.j
    public void onCues(List<b> list) {
        setCues(list);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        if (this.f20978g == z10) {
            return;
        }
        this.f20978g = z10;
        invalidate();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        if (this.f20977f == z10 && this.f20978g == z10) {
            return;
        }
        this.f20977f = z10;
        this.f20978g = z10;
        invalidate();
    }

    public void setBottomPaddingFraction(float f10) {
        if (this.f20980i == f10) {
            return;
        }
        this.f20980i = f10;
        invalidate();
    }

    public void setCues(@Nullable List<b> list) {
        if (this.f20974c == list) {
            return;
        }
        this.f20974c = list;
        int size = list == null ? 0 : list.size();
        while (this.f20973b.size() < size) {
            this.f20973b.add(new c(getContext()));
        }
        invalidate();
    }

    public void setFractionalTextSize(float f10) {
        d(f10, false);
    }

    public void setStyle(n5.a aVar) {
        if (this.f20979h == aVar) {
            return;
        }
        this.f20979h = aVar;
        invalidate();
    }
}
