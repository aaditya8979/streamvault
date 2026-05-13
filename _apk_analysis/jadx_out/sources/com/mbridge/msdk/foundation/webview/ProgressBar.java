package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes8.dex */
public class ProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f38218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f38221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f38222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f38223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f38225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f38226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f38227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f38228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f38229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f38230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f38231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f38232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f38233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f38234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f38235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f38236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f38237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f38238u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f38239v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f38240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f38241x;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.f38218a = new a();
        this.f38224g = 25L;
        this.f38225h = new Handler(Looper.getMainLooper());
        this.f38228k = false;
        this.f38231n = 0.95f;
        this.f38232o = false;
        this.f38234q = new Rect();
        a(context);
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38218a = new a();
        this.f38224g = 25L;
        this.f38225h = new Handler(Looper.getMainLooper());
        this.f38228k = false;
        this.f38231n = 0.95f;
        this.f38232o = false;
        this.f38234q = new Rect();
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
    }

    private void a(Canvas canvas, float f10) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f38237t) {
            float f11 = this.f38223f;
            float f12 = this.f38236s * 0.5f;
            int i10 = (int) ((1.0f - (f11 / f12)) * 255.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (f11 > f12) {
                setVisible(false);
            }
            Drawable drawable3 = this.f38235r;
            if (drawable3 != null) {
                drawable3.setAlpha(i10);
            }
            Drawable drawable4 = this.f38222e;
            if (drawable4 != null) {
                drawable4.setAlpha(i10);
            }
            Drawable drawable5 = this.f38233p;
            if (drawable5 != null) {
                drawable5.setAlpha(i10);
            }
            canvas.save();
            canvas.translate(this.f38223f, 0.0f);
        }
        if (this.f38235r != null && this.f38233p != null) {
            Drawable drawable6 = this.f38235r;
            drawable6.setBounds(0, 0, (int) (this.f38234q.width() - (this.f38233p.getIntrinsicWidth() * 0.05f)), drawable6.getIntrinsicHeight());
            this.f38235r.draw(canvas);
        }
        if (this.f38237t && (drawable2 = this.f38222e) != null && this.f38233p != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f38222e;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f38222e.draw(canvas);
            canvas.restore();
        }
        if (this.f38233p != null) {
            canvas.save();
            canvas.translate(this.f38234q.width() - getWidth(), 0.0f);
            this.f38233p.draw(canvas);
            canvas.restore();
        }
        if (!this.f38237t && Math.abs(this.f38219b - this.f38231n) < 1.0E-5f && (drawable = this.f38226i) != null) {
            int i11 = (int) (this.f38227j + (f10 * 0.2f * this.f38236s));
            this.f38227j = i11;
            if (i11 + drawable.getIntrinsicWidth() >= this.f38234q.width()) {
                this.f38227j = -this.f38226i.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f38227j, 0.0f);
            this.f38226i.draw(canvas);
            canvas.restore();
        }
        if (this.f38237t) {
            canvas.restore();
        }
    }

    private float getVelocity() {
        if (this.f38237t) {
            return this.f38229l ? 1.0f : 0.4f;
        }
        if (this.f38241x < 2000) {
            return this.f38239v == 1 ? this.f38229l ? 1.0f : 0.4f : this.f38238u == 1 ? this.f38229l ? 0.4f : 0.2f : this.f38229l ? 0.2f : 0.05f;
        }
        return 0.05f;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f38228k) {
            this.f38228k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f38232o ? 0L : jCurrentTimeMillis - this.f38230m;
        this.f38221d = Math.abs(j10 / 1000.0f);
        this.f38230m = jCurrentTimeMillis;
        this.f38241x += j10;
        float velocity = getVelocity();
        this.f38220c = velocity;
        float f10 = this.f38219b + (velocity * this.f38221d);
        this.f38219b = f10;
        if (!this.f38237t) {
            float f11 = this.f38231n;
            if (f10 > f11) {
                this.f38219b = f11;
            }
        }
        this.f38234q.right = (int) (this.f38219b * this.f38236s);
        this.f38225h.removeCallbacksAndMessages(null);
        this.f38225h.postDelayed(this.f38218a, this.f38224g);
        super.draw(canvas);
        a(canvas, this.f38221d);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    public float getProgress() {
        return this.f38219b;
    }

    public void initResource(boolean z10) {
        if (z10 || (this.f38226i == null && this.f38233p == null && this.f38235r == null && this.f38222e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f38226i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f38226i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f38233p = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f38233p.getIntrinsicHeight());
            }
            this.f38235r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f38222e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f38236s = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f38228k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.f38226i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f38233p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z10) {
        this.f38232o = z10;
        if (z10) {
            return;
        }
        this.f38230m = System.currentTimeMillis();
    }

    public void setProgress(float f10, boolean z10) {
        if (!z10 || f10 < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressBarListener(c cVar) {
    }

    public void setProgressState(int i10) {
        if (i10 == 5) {
            this.f38238u = 1;
            this.f38239v = 0;
            this.f38240w = 0;
            this.f38241x = 0L;
            return;
        }
        if (i10 == 6) {
            this.f38239v = 1;
            if (this.f38240w == 1) {
                startEndAnimation();
            }
            this.f38241x = 0L;
            return;
        }
        if (i10 == 7) {
            startEndAnimation();
        } else {
            if (i10 != 8) {
                return;
            }
            this.f38240w = 1;
            if (this.f38239v == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void setVisible(boolean z10) {
        if (!z10) {
            setVisibility(4);
            return;
        }
        this.f38229l = true;
        this.f38230m = System.currentTimeMillis();
        this.f38221d = 0.0f;
        this.f38241x = 0L;
        this.f38237t = false;
        this.f38223f = 0.0f;
        this.f38219b = 0.0f;
        this.f38236s = getMeasuredWidth();
        this.f38232o = false;
        this.f38238u = 0;
        this.f38239v = 0;
        this.f38240w = 0;
        Drawable drawable = this.f38226i;
        if (drawable != null) {
            this.f38227j = -drawable.getIntrinsicWidth();
        } else {
            this.f38227j = 0;
        }
        Drawable drawable2 = this.f38235r;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f38222e;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f38233p;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    public void startEndAnimation() {
        if (this.f38237t) {
            return;
        }
        this.f38237t = true;
        this.f38223f = 0.0f;
    }
}
