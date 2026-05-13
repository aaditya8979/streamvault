package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class MBRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f36920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f36921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f36930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f36931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f36935p;

    public MBRotationView(Context context) {
        super(context);
        this.f36924e = 40;
        this.f36925f = 20;
        this.f36926g = 0;
        this.f36927h = 0;
        this.f36929j = 0;
        this.f36930k = 0.5f;
        this.f36931l = 0.9f;
        this.f36932m = true;
        this.f36933n = false;
        this.f36934o = false;
        this.f36935p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36924e = 40;
        this.f36925f = 20;
        this.f36926g = 0;
        this.f36927h = 0;
        this.f36929j = 0;
        this.f36930k = 0.5f;
        this.f36931l = 0.9f;
        this.f36932m = true;
        this.f36933n = false;
        this.f36934o = false;
        this.f36935p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36924e = 40;
        this.f36925f = 20;
        this.f36926g = 0;
        this.f36927h = 0;
        this.f36929j = 0;
        this.f36930k = 0.5f;
        this.f36931l = 0.9f;
        this.f36932m = true;
        this.f36933n = false;
        this.f36934o = false;
        this.f36935p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void a() {
        this.f36920a = new Camera();
        this.f36921b = new Matrix();
        setWillNotDraw(false);
    }

    private void a(int i10) {
        int i11 = this.f36924e;
        int i12 = this.f36928i - (i10 / i11);
        this.f36926g = i10 % i11;
        b(i12);
        invalidate();
    }

    private void a(int i10, int i11, int i12) {
        if (i12 == 0) {
            float f10 = (-i10) / 2;
            this.f36920a.translate(f10, 0.0f, 0.0f);
            float f11 = -i11;
            this.f36920a.rotateY(f11);
            this.f36920a.translate(f10, 0.0f, 0.0f);
            this.f36920a.translate(f10, 0.0f, 0.0f);
            this.f36920a.rotateY(f11);
            this.f36920a.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i12 == 1) {
            float f12 = i10 / 2;
            this.f36920a.translate(f12, 0.0f, 0.0f);
            this.f36920a.rotateY(i11);
            this.f36920a.translate(f12, 0.0f, 0.0f);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f36920a.rotateY(0.0f);
        } else {
            float f13 = (-i10) / 2;
            this.f36920a.translate(f13, 0.0f, 0.0f);
            this.f36920a.rotateY(-i11);
            this.f36920a.translate(f13, 0.0f, 0.0f);
        }
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i10 = ((this.f36926g * this.f36923d) / 2) / this.f36924e;
        b(canvas, i10, width, 0);
        b(canvas, i10, width, 1);
        if (Math.abs(this.f36926g) > this.f36924e / 2) {
            b(canvas, i10, width, 3);
            b(canvas, i10, width, 2);
        } else {
            b(canvas, i10, width, 2);
            b(canvas, i10, width, 3);
        }
    }

    private void a(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f36920a.save();
        this.f36921b.reset();
        float f10 = i10;
        this.f36920a.translate(0.0f, f10, 0.0f);
        this.f36920a.rotateX(this.f36926g);
        this.f36920a.translate(0.0f, f10, 0.0f);
        if (i10 == 0) {
            if (this.f36934o) {
                b(this.f36922c, this.f36924e, i12);
            } else {
                b(-this.f36922c, -this.f36924e, i12);
            }
        } else if (i10 > 0) {
            b(this.f36922c, this.f36924e, i12);
        } else if (i10 < 0) {
            b(-this.f36922c, -this.f36924e, i12);
        }
        this.f36920a.getMatrix(this.f36921b);
        this.f36920a.restore();
        this.f36921b.preTranslate((-getWidth()) / 2, -i11);
        this.f36921b.postTranslate(getWidth() / 2, i11);
        canvas.concat(this.f36921b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int i10 = this.f36926g - 1;
        this.f36926g = i10;
        this.f36928i = this.f36927h;
        a(i10);
        if (this.f36932m) {
            postDelayed(this.f36935p, 1000 / this.f36925f);
        }
    }

    private void b(int i10) {
        this.f36927h = i10;
        int iC = Math.abs(this.f36926g) > this.f36924e / 2 ? c(2) : c(3);
        if (this.f36929j != iC) {
            this.f36929j = iC;
        }
    }

    private void b(int i10, int i11, int i12) {
        float f10 = (-i10) / 2.0f;
        if (i12 == 0) {
            this.f36920a.translate(0.0f, f10, 0.0f);
            float f11 = -i11;
            this.f36920a.rotateX(f11);
            this.f36920a.translate(0.0f, f10, 0.0f);
            this.f36920a.translate(0.0f, f10, 0.0f);
            this.f36920a.rotateX(f11);
            this.f36920a.translate(0.0f, f10, 0.0f);
            return;
        }
        if (i12 == 1) {
            this.f36920a.translate(0.0f, f10, 0.0f);
            this.f36920a.rotateX(i11);
            this.f36920a.translate(0.0f, f10, 0.0f);
        } else if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f36920a.rotateX(0.0f);
        } else {
            this.f36920a.translate(0.0f, f10, 0.0f);
            this.f36920a.rotateX(-i11);
            this.f36920a.translate(0.0f, f10, 0.0f);
        }
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i10 = ((this.f36926g * this.f36922c) / 2) / this.f36924e;
        a(canvas, i10, height, 0);
        a(canvas, i10, height, 1);
        if (Math.abs(this.f36926g) > this.f36924e / 2) {
            a(canvas, i10, height, 3);
            a(canvas, i10, height, 2);
        } else {
            a(canvas, i10, height, 2);
            a(canvas, i10, height, 3);
        }
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f36920a.save();
        this.f36921b.reset();
        float f10 = i10;
        this.f36920a.translate(f10, 0.0f, 0.0f);
        this.f36920a.rotateY(this.f36926g);
        this.f36920a.translate(f10, 0.0f, 0.0f);
        if (i10 == 0) {
            if (this.f36934o) {
                a(this.f36923d, this.f36924e, i12);
            } else {
                a(-this.f36923d, -this.f36924e, i12);
            }
        } else if (i10 > 0) {
            a(this.f36923d, this.f36924e, i12);
        } else if (i10 < 0) {
            a(-this.f36923d, -this.f36924e, i12);
        }
        this.f36920a.getMatrix(this.f36921b);
        this.f36920a.restore();
        this.f36921b.preTranslate(-i11, (-getHeight()) / 2);
        this.f36921b.postTranslate(i11, getHeight() / 2);
        canvas.concat(this.f36921b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            i11 = this.f36934o ? this.f36927h - 2 : this.f36927h + 2;
        } else if (i10 != 1) {
            if (i10 != 2) {
                i11 = i10 != 3 ? 0 : this.f36927h;
            } else if (this.f36934o) {
                i12 = this.f36927h;
                i11 = i12 - 1;
            } else {
                i13 = this.f36927h;
                i11 = i13 + 1;
            }
        } else if (this.f36934o) {
            i13 = this.f36927h;
            i11 = i13 + 1;
        } else {
            i12 = this.f36927h;
            i11 = i12 - 1;
        }
        int childCount = i11 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f36933n) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        float f10 = i14;
        float f11 = this.f36930k;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        int i16 = i13 - i11;
        float f12 = i16;
        float f13 = this.f36931l;
        int i17 = (int) (((1.0f - f13) * f12) / 2.0f);
        this.f36922c = (int) (f12 * f13);
        this.f36923d = (int) (f10 * f11);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            childAt.layout(i15, i17, i14 - i15, i16 - i17);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i19 = layoutParams.width;
            int i20 = this.f36923d;
            if (i19 != i20) {
                layoutParams.width = i20;
                layoutParams.height = this.f36922c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setAutoscroll(boolean z10) {
        if (z10) {
            postDelayed(this.f36935p, 1000 / this.f36925f);
        }
        this.f36932m = z10;
    }

    public void setHeightRatio(float f10) {
        this.f36931l = f10;
    }

    public void setRotateV(boolean z10) {
        this.f36933n = z10;
        invalidate();
    }

    public void setWidthRatio(float f10) {
        this.f36930k = f10;
    }
}
