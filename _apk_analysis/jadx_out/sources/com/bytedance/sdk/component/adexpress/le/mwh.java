package com.bytedance.sdk.component.adexpress.le;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"AppCompatCustomView"})
public final class mwh extends ImageView {
    private float bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f12368cf;
    private boolean fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f12369jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f12370le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f12371lh;
    private boolean mwh;
    private Movie ouw;
    private float pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private float f12372ra;
    private volatile boolean ryl;
    private int tlj;
    private long vt;
    private AnimatedImageDrawable yu;

    public mwh(Context context) {
        super(context);
        boolean z10 = Build.VERSION.SDK_INT >= 28;
        this.fkw = z10;
        this.f12370le = false;
        this.mwh = true;
        this.f12369jg = true;
        if (z10) {
            return;
        }
        setLayerType(1, null);
    }

    private void ouw() {
        if (this.ouw == null || this.fkw || !this.mwh) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void ouw(Canvas canvas) {
        Movie movie = this.ouw;
        if (movie == null) {
            return;
        }
        movie.setTime(this.f12371lh);
        float f10 = this.bly;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.ouw.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.ouw;
            float f11 = this.f12372ra;
            float f12 = this.bly;
            movie2.draw(canvas, f11 / f12, this.pno / f12);
        }
        canvas.restore();
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
            this.yu = animatedImageDrawable;
            if (!this.ryl) {
                animatedImageDrawable.start();
            }
            if (!this.f12369jg) {
                animatedImageDrawable.setRepeatCount(0);
            }
        }
        ouw();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.ouw == null || this.fkw) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.ryl) {
                ouw(canvas);
                return;
            }
            if (this.ouw != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.vt == 0) {
                    this.vt = jUptimeMillis;
                }
                int iDuration = this.ouw.duration();
                if (iDuration == 0) {
                    iDuration = 1000;
                }
                if (this.f12369jg || Math.abs(iDuration - this.f12371lh) >= 60) {
                    this.f12371lh = (int) ((jUptimeMillis - this.vt) % ((long) iDuration));
                } else {
                    this.f12371lh = iDuration;
                    this.ryl = true;
                }
            }
            ouw(canvas);
            ouw();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.lh("GifView", "onDraw->Throwable->", th2);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.ouw != null && !this.fkw) {
            this.f12372ra = (getWidth() - this.tlj) / 2.0f;
            this.pno = (getHeight() - this.f12368cf) / 2.0f;
        }
        this.mwh = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (this.fkw || (movie = this.ouw) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.ouw.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i10) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i10))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i11) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i11))) ? 1.0f : iHeight / size);
        this.bly = fMax;
        int i12 = (int) (iWidth * fMax);
        this.tlj = i12;
        int i13 = (int) (iHeight * fMax);
        this.f12368cf = i13;
        setMeasuredDimension(i12, i13);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public final void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.ouw != null) {
            this.mwh = i10 == 1;
            ouw();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (this.ouw != null) {
            this.mwh = i10 == 0;
            ouw();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.ouw != null) {
            this.mwh = i10 == 0;
            ouw();
        }
    }

    public final void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.f12369jg = z10;
        if (z10) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.yu) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ko.lh("GifView", "setRepeatConfig error", e10);
        }
    }
}
