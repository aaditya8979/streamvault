package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f22489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f22490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22492e;

    public interface b {
        void onAspectRatioUpdated(float f10, float f11, boolean z10);
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f22493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f22494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22496e;

        public c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f22493b = f10;
            this.f22494c = f11;
            this.f22495d = z10;
            if (this.f22496e) {
                return;
            }
            this.f22496e = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22496e = false;
            if (AspectRatioFrameLayout.this.f22490c == null) {
                return;
            }
            AspectRatioFrameLayout.this.f22490c.onAspectRatioUpdated(this.f22493b, this.f22494c, this.f22495d);
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22492e = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.f22492e = typedArrayObtainStyledAttributes.getInt(R$styleable.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f22489b = new c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getResizeMode() {
        return this.f22492e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f22491d <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f22491d / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f22489b.a(this.f22491d, f14, false);
            return;
        }
        int i12 = this.f22492e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f22491d;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f22491d;
                    } else {
                        f11 = this.f22491d;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f22491d;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f22491d;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f22491d;
            measuredWidth = (int) (f13 * f10);
        }
        this.f22489b.a(this.f22491d, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f22491d != f10) {
            this.f22491d = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable b bVar) {
        this.f22490c = bVar;
    }

    public void setResizeMode(int i10) {
        if (this.f22492e != i10) {
            this.f22492e = i10;
            requestLayout();
        }
    }
}
