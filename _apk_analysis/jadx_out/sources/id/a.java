package id;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MaterialProgressDrawable.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends Drawable implements Animatable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Interpolator f64072k = new LinearInterpolator();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Interpolator f64073l = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f64074m = {ViewCompat.MEASURED_STATE_MASK};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Animation> f64075b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f64076c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f64077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f64078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animation f64079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f64080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f64081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f64082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f64083j;

    /* JADX INFO: renamed from: id.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MaterialProgressDrawable.java */
    public class C0787a extends Animation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f64084b;

        public C0787a(c cVar) {
            this.f64084b = cVar;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            a aVar = a.this;
            if (aVar.f64083j) {
                aVar.a(f10, this.f64084b);
                return;
            }
            float fC = aVar.c(this.f64084b);
            c cVar = this.f64084b;
            float f11 = cVar.f64099l;
            float f12 = cVar.f64098k;
            float f13 = cVar.f64100m;
            a.this.l(f10, cVar);
            if (f10 <= 0.5f) {
                this.f64084b.f64091d = f12 + ((0.8f - fC) * a.f64073l.getInterpolation(f10 / 0.5f));
            }
            if (f10 > 0.5f) {
                this.f64084b.f64092e = f11 + ((0.8f - fC) * a.f64073l.getInterpolation((f10 - 0.5f) / 0.5f));
            }
            a.this.f(f13 + (0.25f * f10));
            a aVar2 = a.this;
            aVar2.g((f10 * 216.0f) + ((aVar2.f64080g / 5.0f) * 1080.0f));
        }
    }

    /* JADX INFO: compiled from: MaterialProgressDrawable.java */
    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f64086b;

        public b(c cVar) {
            this.f64086b = cVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            this.f64086b.j();
            this.f64086b.f();
            c cVar = this.f64086b;
            cVar.f64091d = cVar.f64092e;
            a aVar = a.this;
            if (!aVar.f64083j) {
                aVar.f64080g = (aVar.f64080g + 1.0f) % 5.0f;
                return;
            }
            aVar.f64083j = false;
            animation.setDuration(1332L);
            a.this.k(false);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.this.f64080g = 0.0f;
        }
    }

    /* JADX INFO: compiled from: MaterialProgressDrawable.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f64088a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f64089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f64090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f64091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f64092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f64093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f64094g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f64095h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f64096i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f64097j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f64098k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f64099l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f64100m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f64101n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Path f64102o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f64103p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public double f64104q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f64105r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f64106s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f64107t;

        public c() {
            Paint paint = new Paint();
            this.f64089b = paint;
            Paint paint2 = new Paint();
            this.f64090c = paint2;
            this.f64091d = 0.0f;
            this.f64092e = 0.0f;
            this.f64093f = 0.0f;
            this.f64094g = 5.0f;
            this.f64095h = 2.5f;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f64088a;
            rectF.set(rect);
            float f10 = this.f64095h;
            rectF.inset(f10, f10);
            float f11 = this.f64091d;
            float f12 = this.f64093f;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f64092e + f12) * 360.0f) - f13;
            if (f14 != 0.0f) {
                this.f64089b.setColor(this.f64107t);
                canvas.drawArc(rectF, f13, f14, false, this.f64089b);
            }
            b(canvas, f13, f14, rect);
        }

        public final void b(Canvas canvas, float f10, float f11, Rect rect) {
            if (this.f64101n) {
                Path path = this.f64102o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f64102o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f12 = (((int) this.f64095h) / 2) * this.f64103p;
                float fCos = (float) ((this.f64104q * Math.cos(0.0d)) + ((double) rect.exactCenterX()));
                float fSin = (float) ((this.f64104q * Math.sin(0.0d)) + ((double) rect.exactCenterY()));
                this.f64102o.moveTo(0.0f, 0.0f);
                this.f64102o.lineTo(this.f64105r * this.f64103p, 0.0f);
                Path path3 = this.f64102o;
                float f13 = this.f64105r;
                float f14 = this.f64103p;
                path3.lineTo((f13 * f14) / 2.0f, this.f64106s * f14);
                this.f64102o.offset(fCos - f12, fSin);
                this.f64102o.close();
                this.f64090c.setColor(this.f64107t);
                canvas.rotate((f10 + f11) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f64102o, this.f64090c);
            }
        }

        public int c() {
            return this.f64096i[d()];
        }

        public final int d() {
            return (this.f64097j + 1) % this.f64096i.length;
        }

        public int e() {
            return this.f64096i[this.f64097j];
        }

        public void f() {
            h(d());
        }

        public void g() {
            this.f64098k = 0.0f;
            this.f64099l = 0.0f;
            this.f64100m = 0.0f;
            this.f64091d = 0.0f;
            this.f64092e = 0.0f;
            this.f64093f = 0.0f;
        }

        public void h(int i10) {
            this.f64097j = i10;
            this.f64107t = this.f64096i[i10];
        }

        public void i(int i10, int i11) {
            float fMin = Math.min(i10, i11);
            double d10 = this.f64104q;
            this.f64095h = (float) ((d10 <= 0.0d || fMin < 0.0f) ? Math.ceil(this.f64094g / 2.0f) : ((double) (fMin / 2.0f)) - d10);
        }

        public void j() {
            this.f64098k = this.f64091d;
            this.f64099l = this.f64092e;
            this.f64100m = this.f64093f;
        }
    }

    public a(View view) {
        this.f64078e = view;
        e(f64074m);
        m(1);
        j();
    }

    public void a(float f10, c cVar) {
        l(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.f64100m / 0.8f) + 1.0d);
        float fC = c(cVar);
        float f11 = cVar.f64098k;
        float f12 = cVar.f64099l;
        i(f11 + (((f12 - fC) - f11) * f10), f12);
        float f13 = cVar.f64100m;
        f(f13 + ((fFloor - f13) * f10));
    }

    public final int b(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    public float c(c cVar) {
        return (float) Math.toRadians(((double) cVar.f64094g) / (cVar.f64104q * 6.283185307179586d));
    }

    public void d(float f10) {
        c cVar = this.f64076c;
        if (cVar.f64103p != f10) {
            cVar.f64103p = f10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.rotate(this.f64077d, bounds.exactCenterX(), bounds.exactCenterY());
        this.f64076c.a(canvas, bounds);
        canvas.restoreToCount(iSave);
    }

    public void e(@ColorInt int... iArr) {
        c cVar = this.f64076c;
        cVar.f64096i = iArr;
        cVar.h(0);
    }

    public void f(float f10) {
        this.f64076c.f64093f = f10;
        invalidateSelf();
    }

    public void g(float f10) {
        this.f64077d = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f64082i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f64081h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(int i10, int i11, float f10, float f11, float f12, float f13) {
        float f14 = Resources.getSystem().getDisplayMetrics().density;
        this.f64081h = i10 * f14;
        this.f64082i = i11 * f14;
        this.f64076c.h(0);
        float f15 = f11 * f14;
        this.f64076c.f64089b.setStrokeWidth(f15);
        c cVar = this.f64076c;
        cVar.f64094g = f15;
        cVar.f64104q = f10 * f14;
        cVar.f64105r = (int) (f12 * f14);
        cVar.f64106s = (int) (f13 * f14);
        cVar.i((int) this.f64081h, (int) this.f64082i);
        invalidateSelf();
    }

    public void i(float f10, float f11) {
        c cVar = this.f64076c;
        cVar.f64091d = f10;
        cVar.f64092e = f11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        List<Animation> list = this.f64075b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animation animation = list.get(i10);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        c cVar = this.f64076c;
        C0787a c0787a = new C0787a(cVar);
        c0787a.setRepeatCount(-1);
        c0787a.setRepeatMode(1);
        c0787a.setInterpolator(f64072k);
        c0787a.setAnimationListener(new b(cVar));
        this.f64079f = c0787a;
    }

    public void k(boolean z10) {
        c cVar = this.f64076c;
        if (cVar.f64101n != z10) {
            cVar.f64101n = z10;
            invalidateSelf();
        }
    }

    public void l(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.f64107t = b((f10 - 0.75f) / 0.25f, cVar.e(), cVar.c());
        }
    }

    public void m(int i10) {
        if (i10 == 0) {
            h(56, 56, 12.5f, 3.0f, 12.0f, 6.0f);
        } else {
            h(40, 40, 8.75f, 2.5f, 10.0f, 5.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f64076c.f64089b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f64079f.reset();
        this.f64076c.j();
        c cVar = this.f64076c;
        if (cVar.f64092e != cVar.f64091d) {
            this.f64083j = true;
            this.f64079f.setDuration(666L);
            this.f64078e.startAnimation(this.f64079f);
        } else {
            cVar.h(0);
            this.f64076c.g();
            this.f64079f.setDuration(1332L);
            this.f64078e.startAnimation(this.f64079f);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f64078e.clearAnimation();
        this.f64076c.h(0);
        this.f64076c.g();
        k(false);
        g(0.0f);
    }
}
