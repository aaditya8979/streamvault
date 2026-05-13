package io.bidmachine.iab.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes3.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f69353g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f69354h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f69355i = {ViewCompat.MEASURED_STATE_MASK};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f69356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f69359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f69360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69361f;

    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float[] f69362a = {0.0f, 1.0E-4f, 2.0E-4f, 5.0E-4f, 9.0E-4f, 0.0014f, 0.002f, 0.0027f, 0.0036f, 0.0046f, 0.0058f, 0.0071f, 0.0085f, 0.0101f, 0.0118f, 0.0137f, 0.0158f, 0.018f, 0.0205f, 0.0231f, 0.0259f, 0.0289f, 0.0321f, 0.0355f, 0.0391f, 0.043f, 0.0471f, 0.0514f, 0.056f, 0.0608f, 0.066f, 0.0714f, 0.0771f, 0.083f, 0.0893f, 0.0959f, 0.1029f, 0.1101f, 0.1177f, 0.1257f, 0.1339f, 0.1426f, 0.1516f, 0.161f, 0.1707f, 0.1808f, 0.1913f, 0.2021f, 0.2133f, 0.2248f, 0.2366f, 0.2487f, 0.2611f, 0.2738f, 0.2867f, 0.2998f, 0.3131f, 0.3265f, 0.34f, 0.3536f, 0.3673f, 0.381f, 0.3946f, 0.4082f, 0.4217f, 0.4352f, 0.4485f, 0.4616f, 0.4746f, 0.4874f, 0.5f, 0.5124f, 0.5246f, 0.5365f, 0.5482f, 0.5597f, 0.571f, 0.582f, 0.5928f, 0.6033f, 0.6136f, 0.6237f, 0.6335f, 0.6431f, 0.6525f, 0.6616f, 0.6706f, 0.6793f, 0.6878f, 0.6961f, 0.7043f, 0.7122f, 0.7199f, 0.7275f, 0.7349f, 0.7421f, 0.7491f, 0.7559f, 0.7626f, 0.7692f, 0.7756f, 0.7818f, 0.7879f, 0.7938f, 0.7996f, 0.8053f, 0.8108f, 0.8162f, 0.8215f, 0.8266f, 0.8317f, 0.8366f, 0.8414f, 0.8461f, 0.8507f, 0.8551f, 0.8595f, 0.8638f, 0.8679f, 0.872f, 0.876f, 0.8798f, 0.8836f, 0.8873f, 0.8909f, 0.8945f, 0.8979f, 0.9013f, 0.9046f, 0.9078f, 0.9109f, 0.9139f, 0.9169f, 0.9198f, 0.9227f, 0.9254f, 0.9281f, 0.9307f, 0.9333f, 0.9358f, 0.9382f, 0.9406f, 0.9429f, 0.9452f, 0.9474f, 0.9495f, 0.9516f, 0.9536f, 0.9556f, 0.9575f, 0.9594f, 0.9612f, 0.9629f, 0.9646f, 0.9663f, 0.9679f, 0.9695f, 0.971f, 0.9725f, 0.9739f, 0.9753f, 0.9766f, 0.9779f, 0.9791f, 0.9803f, 0.9815f, 0.9826f, 0.9837f, 0.9848f, 0.9858f, 0.9867f, 0.9877f, 0.9885f, 0.9894f, 0.9902f, 0.991f, 0.9917f, 0.9924f, 0.9931f, 0.9937f, 0.9944f, 0.9949f, 0.9955f, 0.996f, 0.9964f, 0.9969f, 0.9973f, 0.9977f, 0.998f, 0.9984f, 0.9986f, 0.9989f, 0.9991f, 0.9993f, 0.9995f, 0.9997f, 0.9998f, 0.9999f, 0.9999f, 1.0f, 1.0f};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f69363b = 1.0f / 200;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f69362a;
            int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
            float f11 = this.f69363b;
            float f12 = (f10 - (iMin * f11)) / f11;
            float[] fArr2 = this.f69362a;
            float f13 = fArr2[iMin];
            return f13 + (f12 * (fArr2[iMin + 1] - f13));
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f69364a;

        public b(d dVar) {
            this.f69364a = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressDrawable.this.b(fFloatValue, this.f69364a);
            CircularProgressDrawable.this.a(fFloatValue, this.f69364a, false);
            CircularProgressDrawable.this.invalidateSelf();
        }
    }

    public class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f69366a;

        public c(d dVar) {
            this.f69366a = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            CircularProgressDrawable.this.a(1.0f, this.f69366a, true);
            this.f69366a.m();
            this.f69366a.k();
            if (!CircularProgressDrawable.this.f69361f) {
                CircularProgressDrawable.this.f69360e += 1.0f;
            } else {
                CircularProgressDrawable.this.f69361f = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            CircularProgressDrawable.this.f69360e = 0.0f;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f69369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f69370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f69371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Paint f69372e;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f69377j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f69378k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f69379l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f69380m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f69381n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f69382o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f69384q;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f69373f = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f69374g = 0.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f69375h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f69376i = 5.0f;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f69383p = 255;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f69368a = new RectF();

        public d() {
            Paint paint = new Paint();
            this.f69369b = paint;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f69370c = paint2;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.f69371d = paint3;
            paint3.setColor(0);
            Paint paint4 = new Paint();
            this.f69372e = paint4;
            paint4.setColor(0);
        }

        public int a() {
            return this.f69383p;
        }

        public void a(float f10) {
            this.f69382o = f10;
        }

        public void a(int i10) {
            this.f69383p = i10;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f69368a;
            float f10 = this.f69382o;
            float fMin = (this.f69376i / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - (this.f69376i / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f69373f;
            float f12 = this.f69375h;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f69374g + f12) * 360.0f) - f13;
            this.f69369b.setColor(this.f69384q);
            this.f69369b.setAlpha(this.f69383p);
            float f15 = this.f69376i / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f69371d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f69369b);
        }

        public void a(ColorFilter colorFilter) {
            this.f69369b.setColorFilter(colorFilter);
        }

        public void a(Paint.Cap cap) {
            this.f69369b.setStrokeCap(cap);
        }

        public void a(int[] iArr) {
            this.f69377j = iArr;
            d(0);
        }

        public int b() {
            return this.f69371d.getColor();
        }

        public void b(float f10) {
            this.f69374g = f10;
        }

        public void b(int i10) {
            this.f69371d.setColor(i10);
        }

        public float c() {
            return this.f69374g;
        }

        public void c(float f10) {
            this.f69375h = f10;
        }

        public void c(int i10) {
            this.f69384q = i10;
        }

        public int d() {
            return this.f69377j[e()];
        }

        public void d(float f10) {
            this.f69373f = f10;
        }

        public void d(int i10) {
            this.f69378k = i10;
            this.f69384q = this.f69377j[i10];
        }

        public int e() {
            return (this.f69378k + 1) % this.f69377j.length;
        }

        public void e(float f10) {
            this.f69376i = f10;
            this.f69369b.setStrokeWidth(f10);
        }

        public float f() {
            return this.f69373f;
        }

        public int g() {
            return this.f69377j[this.f69378k];
        }

        public float h() {
            return this.f69380m;
        }

        public float i() {
            return this.f69381n;
        }

        public float j() {
            return this.f69379l;
        }

        public void k() {
            d(e());
        }

        public void l() {
            this.f69379l = 0.0f;
            this.f69380m = 0.0f;
            this.f69381n = 0.0f;
            d(0.0f);
            b(0.0f);
            c(0.0f);
        }

        public void m() {
            this.f69379l = this.f69373f;
            this.f69380m = this.f69374g;
            this.f69381n = this.f69375h;
        }
    }

    public CircularProgressDrawable(@NonNull Context context) {
        this.f69356a = context.getResources();
        d dVar = new d();
        this.f69357b = dVar;
        dVar.a(f69355i);
        setStrokeWidth(2.5f);
        a();
    }

    private int a(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void a() {
        d dVar = this.f69357b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f69353g);
        valueAnimatorOfFloat.addListener(new c(dVar));
        this.f69359d = valueAnimatorOfFloat;
    }

    private void a(float f10) {
        this.f69358c = f10;
    }

    private void a(float f10, float f11, float f12, float f13) {
        d dVar = this.f69357b;
        float f14 = this.f69356a.getDisplayMetrics().density;
        dVar.e(f11 * f14);
        dVar.a(f10 * f14);
        dVar.d(0);
    }

    private void a(float f10, d dVar) {
        b(f10, dVar);
        float fFloor = (float) (Math.floor(dVar.i() / 0.8f) + 1.0d);
        dVar.d(dVar.j() + (((dVar.h() - 0.01f) - dVar.j()) * f10));
        dVar.b(dVar.h());
        dVar.c(dVar.i() + ((fFloor - dVar.i()) * f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f10, d dVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f69361f) {
            a(f10, dVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fI = dVar.i();
            if (f10 < 0.5f) {
                interpolation = dVar.j();
                interpolation2 = (f69354h.getInterpolation(f10 / 0.5f) * 0.79f) + interpolation + 0.01f;
            } else {
                float fJ = dVar.j() + 0.79f;
                interpolation = fJ - (((1.0f - f69354h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fJ;
            }
            float f11 = fI + (0.20999998f * f10);
            float f12 = (f10 + this.f69360e) * 216.0f;
            dVar.d(interpolation);
            dVar.b(interpolation2);
            dVar.c(f11);
            a(f12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f10, d dVar) {
        dVar.c(f10 > 0.75f ? a((f10 - 0.75f) / 0.25f, dVar.g(), dVar.d()) : dVar.g());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f69358c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f69357b.a(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f69357b.a();
    }

    public int getBackgroundColor() {
        return this.f69357b.b();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getStrokeWidth() {
        return this.f69357b.f69376i;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f69359d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f69357b.a(i10);
        invalidateSelf();
    }

    public void setBackgroundColor(int i10) {
        this.f69357b.b(i10);
        invalidateSelf();
    }

    public void setCenterRadius(float f10) {
        this.f69357b.a(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f69357b.a(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(int... iArr) {
        this.f69357b.a(iArr);
        this.f69357b.d(0);
        invalidateSelf();
    }

    public void setStrokeCap(Paint.Cap cap) {
        this.f69357b.a(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f10) {
        this.f69357b.e(f10);
        invalidateSelf();
    }

    public void setStyle(int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (i10 == 0) {
            f10 = 11.0f;
            f11 = 3.0f;
            f12 = 12.0f;
            f13 = 6.0f;
        } else {
            f10 = 7.5f;
            f11 = 2.5f;
            f12 = 10.0f;
            f13 = 5.0f;
        }
        a(f10, f11, f12, f13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j10;
        this.f69359d.cancel();
        this.f69357b.m();
        if (this.f69357b.c() != this.f69357b.f()) {
            this.f69361f = true;
            animator = this.f69359d;
            j10 = 666;
        } else {
            this.f69357b.d(0);
            this.f69357b.l();
            animator = this.f69359d;
            j10 = 1332;
        }
        animator.setDuration(j10);
        this.f69359d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f69359d.cancel();
        a(0.0f);
        this.f69357b.d(0);
        this.f69357b.l();
        invalidateSelf();
    }
}
