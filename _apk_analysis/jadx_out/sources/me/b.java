package me;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ProgressDrawable.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends a implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ValueAnimator f74123f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74120c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74121d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74122e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Path f74124g = new Path();

    public b() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, 3600);
        this.f74123f = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(10000L);
        this.f74123f.setInterpolator(null);
        this.f74123f.setRepeatCount(-1);
        this.f74123f.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f10 = iWidth;
        float fMax = Math.max(1.0f, f10 / 22.0f);
        if (this.f74120c != iWidth || this.f74121d != iHeight) {
            this.f74124g.reset();
            float f11 = f10 - fMax;
            float f12 = iHeight / 2.0f;
            this.f74124g.addCircle(f11, f12, fMax, Path.Direction.CW);
            float f13 = f10 - (5.0f * fMax);
            this.f74124g.addRect(f13, f12 - fMax, f11, f12 + fMax, Path.Direction.CW);
            this.f74124g.addCircle(f13, f12, fMax, Path.Direction.CW);
            this.f74120c = iWidth;
            this.f74121d = iHeight;
        }
        canvas.save();
        float f14 = f10 / 2.0f;
        float f15 = iHeight / 2.0f;
        canvas.rotate(this.f74122e, f14, f15);
        for (int i10 = 0; i10 < 12; i10++) {
            this.f74119b.setAlpha((i10 + 5) * 17);
            canvas.rotate(30.0f, f14, f15);
            canvas.drawPath(this.f74124g, this.f74119b);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f74123f.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f74122e = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f74123f.isRunning()) {
            return;
        }
        this.f74123f.addUpdateListener(this);
        this.f74123f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f74123f.isRunning()) {
            this.f74123f.removeAllListeners();
            this.f74123f.removeAllUpdateListeners();
            this.f74123f.cancel();
        }
    }
}
