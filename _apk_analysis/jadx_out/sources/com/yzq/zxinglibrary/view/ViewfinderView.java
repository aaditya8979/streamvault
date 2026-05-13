package com.yzq.zxinglibrary.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.yzq.zxinglibrary.R$color;
import com.yzq.zxinglibrary.bean.ZxingConfig;
import fh.c;
import java.util.ArrayList;
import java.util.List;
import k8.j;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewfinderView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f59340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f59341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f59342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f59343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f59344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f59345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f59346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f59347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f59348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f59349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f59350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f59351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<j> f59352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<j> f59353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f59354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ZxingConfig f59355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f59356r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Rect f59357s;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewfinderView.this.f59354p = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewfinderView.this.invalidate();
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewfinderView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f59351m = -1;
        this.f59346h = ContextCompat.getColor(getContext(), R$color.viewfinder_mask);
        this.f59347i = ContextCompat.getColor(getContext(), R$color.result_view);
        this.f59348j = ContextCompat.getColor(getContext(), R$color.possible_result_points);
        this.f59352n = new ArrayList(10);
        this.f59353o = null;
    }

    public void b(j jVar) {
        List<j> list = this.f59352n;
        synchronized (list) {
            list.add(jVar);
            int size = list.size();
            if (size > 20) {
                list.subList(0, size - 10).clear();
            }
        }
    }

    public final int c(int i10) {
        return (int) TypedValue.applyDimension(1, i10, getResources().getDisplayMetrics());
    }

    public final void d(Canvas canvas, Rect rect) {
        if (this.f59351m != -1) {
            canvas.drawRect(rect, this.f59344f);
        }
        int iWidth = (int) (((double) ((int) (((double) rect.width()) * 0.07d))) * 0.2d);
        if (iWidth > 15) {
            iWidth = 15;
        }
        int i10 = rect.left;
        canvas.drawRect(i10 - iWidth, rect.top, i10, r3 + r0, this.f59343e);
        int i11 = rect.left;
        canvas.drawRect(i11 - iWidth, r3 - iWidth, i11 + r0, rect.top, this.f59343e);
        canvas.drawRect(rect.right, rect.top, r2 + iWidth, r3 + r0, this.f59343e);
        int i12 = rect.right;
        canvas.drawRect(i12 - r0, r3 - iWidth, i12 + iWidth, rect.top, this.f59343e);
        canvas.drawRect(r2 - iWidth, r3 - r0, rect.left, rect.bottom, this.f59343e);
        int i13 = rect.left;
        canvas.drawRect(i13 - iWidth, rect.bottom, i13 + r0, r3 + iWidth, this.f59343e);
        canvas.drawRect(rect.right, r3 - r0, r2 + iWidth, rect.bottom, this.f59343e);
        int i14 = rect.right;
        canvas.drawRect(i14 - r0, rect.bottom, i14 + iWidth, r12 + iWidth, this.f59343e);
    }

    public final void e(Canvas canvas, Rect rect, int i10, int i11) {
        this.f59341c.setColor(this.f59345g != null ? this.f59347i : this.f59346h);
        float f10 = i10;
        canvas.drawRect(0.0f, 0.0f, f10, rect.top, this.f59341c);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f59341c);
        canvas.drawRect(rect.right + 1, rect.top, f10, rect.bottom + 1, this.f59341c);
        canvas.drawRect(0.0f, rect.bottom + 1, f10, i11, this.f59341c);
    }

    public final void f(Canvas canvas, Rect rect) {
        float f10 = rect.left;
        int i10 = this.f59354p;
        canvas.drawLine(f10, i10, rect.right, i10, this.f59342d);
    }

    public void g() {
        Bitmap bitmap = this.f59345g;
        this.f59345g = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    public final void h() {
        if (this.f59356r == null) {
            Rect rect = this.f59357s;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(rect.top, rect.bottom);
            this.f59356r = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(3000L);
            this.f59356r.setInterpolator(new DecelerateInterpolator());
            this.f59356r.setRepeatMode(1);
            this.f59356r.setRepeatCount(-1);
            this.f59356r.addUpdateListener(new a());
            this.f59356r.start();
        }
    }

    public final void i() {
        this.f59341c = new Paint(1);
        Paint paint = new Paint(1);
        this.f59343e = paint;
        paint.setColor(this.f59349k);
        this.f59343e.setStyle(Paint.Style.FILL);
        this.f59343e.setStrokeWidth(c(1));
        if (this.f59351m != -1) {
            Paint paint2 = new Paint(1);
            this.f59344f = paint2;
            paint2.setColor(ContextCompat.getColor(getContext(), this.f59355q.getFrameLineColor()));
            this.f59344f.setStrokeWidth(c(1));
            this.f59344f.setStyle(Paint.Style.STROKE);
        }
        Paint paint3 = new Paint(1);
        this.f59342d = paint3;
        paint3.setStrokeWidth(c(2));
        this.f59342d.setStyle(Paint.Style.FILL);
        this.f59342d.setDither(true);
        this.f59342d.setColor(this.f59350l);
    }

    public void j() {
        ValueAnimator valueAnimator = this.f59356r;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f59356r.cancel();
            this.f59356r = null;
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        c cVar = this.f59340b;
        if (cVar == null) {
            return;
        }
        this.f59357s = cVar.c();
        Rect rectD = this.f59340b.d();
        if (this.f59357s == null || rectD == null) {
            return;
        }
        h();
        e(canvas, this.f59357s, canvas.getWidth(), canvas.getHeight());
        d(canvas, this.f59357s);
        if (this.f59345g == null) {
            f(canvas, this.f59357s);
        } else {
            this.f59341c.setAlpha(160);
            canvas.drawBitmap(this.f59345g, (Rect) null, this.f59357s, this.f59341c);
        }
    }

    public void setCameraManager(c cVar) {
        this.f59340b = cVar;
    }

    public void setZxingConfig(ZxingConfig zxingConfig) {
        this.f59355q = zxingConfig;
        this.f59349k = ContextCompat.getColor(getContext(), zxingConfig.getReactColor());
        if (zxingConfig.getFrameLineColor() != -1) {
            this.f59351m = ContextCompat.getColor(getContext(), zxingConfig.getFrameLineColor());
        }
        this.f59350l = ContextCompat.getColor(getContext(), zxingConfig.getScanLineColor());
        i();
    }
}
