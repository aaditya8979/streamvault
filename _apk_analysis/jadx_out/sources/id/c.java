package id;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ProgressDrawable.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends b implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ValueAnimator f64113f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64110c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64111d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64112e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Path f64114g = new Path();

    public c() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, 3600);
        this.f64113f = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(10000L);
        this.f64113f.setInterpolator(null);
        this.f64113f.setRepeatCount(-1);
        this.f64113f.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f10 = iWidth;
        float fMax = Math.max(1.0f, f10 / 22.0f);
        if (this.f64110c != iWidth || this.f64111d != iHeight) {
            this.f64114g.reset();
            float f11 = f10 - fMax;
            float f12 = iHeight / 2.0f;
            this.f64114g.addCircle(f11, f12, fMax, Path.Direction.CW);
            float f13 = f10 - (5.0f * fMax);
            this.f64114g.addRect(f13, f12 - fMax, f11, f12 + fMax, Path.Direction.CW);
            this.f64114g.addCircle(f13, f12, fMax, Path.Direction.CW);
            this.f64110c = iWidth;
            this.f64111d = iHeight;
        }
        canvas.save();
        float f14 = f10 / 2.0f;
        float f15 = iHeight / 2.0f;
        canvas.rotate(this.f64112e, f14, f15);
        for (int i10 = 0; i10 < 12; i10++) {
            this.f64109b.setAlpha((i10 + 5) * 17);
            canvas.rotate(30.0f, f14, f15);
            canvas.drawPath(this.f64114g, this.f64109b);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f64113f.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f64112e = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f64113f.isRunning()) {
            return;
        }
        this.f64113f.addUpdateListener(this);
        this.f64113f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f64113f.isRunning()) {
            this.f64113f.removeAllListeners();
            this.f64113f.removeAllUpdateListeners();
            this.f64113f.cancel();
        }
    }
}
