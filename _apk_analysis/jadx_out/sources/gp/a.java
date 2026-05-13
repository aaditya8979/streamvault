package gp;

import android.annotation.SuppressLint;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: AndroidDisplayer.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends fp.a<Canvas, Typeface> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Canvas f62670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f62673h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Camera f62666a = new Camera();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matrix f62667b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0773a f62668c = new C0773a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f62669d = new i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f62674i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f62675j = 160;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f62676k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f62677l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f62678m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f62679n = 2048;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f62680o = 2048;

    /* JADX INFO: renamed from: gp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidDisplayer.java */
    public static class C0773a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f62681a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextPaint f62683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextPaint f62684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f62685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Paint f62686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Paint f62687g;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f62702v;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<Float, Float> f62682b = new HashMap(10);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f62688h = 4;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f62689i = 4.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f62690j = 3.5f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f62691k = 1.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f62692l = 1.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f62693m = 204;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f62694n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f62695o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f62696p = true;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f62697q = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f62698r = false;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f62699s = false;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f62700t = true;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f62701u = true;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f62703w = fp.b.f61772a;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f62704x = 1.0f;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f62705y = false;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f62706z = 0;
        public int A = 0;

        public C0773a() {
            TextPaint textPaint = new TextPaint();
            this.f62683c = textPaint;
            textPaint.setStrokeWidth(this.f62690j);
            this.f62684d = new TextPaint(textPaint);
            this.f62685e = new Paint();
            Paint paint = new Paint();
            this.f62686f = paint;
            paint.setStrokeWidth(this.f62688h);
            this.f62686f.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f62687g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f62687g.setStrokeWidth(4.0f);
        }

        public void f(fp.c cVar, Paint paint, boolean z10) {
            if (this.f62702v) {
                if (z10) {
                    paint.setStyle(this.f62699s ? Paint.Style.FILL : Paint.Style.FILL_AND_STROKE);
                    paint.setColor(cVar.f61782i & ViewCompat.MEASURED_SIZE_MASK);
                    paint.setAlpha(this.f62699s ? (int) (this.f62693m * (this.f62703w / fp.b.f61772a)) : this.f62703w);
                } else {
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(cVar.f61779f & ViewCompat.MEASURED_SIZE_MASK);
                    paint.setAlpha(this.f62703w);
                }
            } else if (z10) {
                paint.setStyle(this.f62699s ? Paint.Style.FILL : Paint.Style.FILL_AND_STROKE);
                paint.setColor(cVar.f61782i & ViewCompat.MEASURED_SIZE_MASK);
                paint.setAlpha(this.f62699s ? this.f62693m : fp.b.f61772a);
            } else {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(cVar.f61779f & ViewCompat.MEASURED_SIZE_MASK);
                paint.setAlpha(fp.b.f61772a);
            }
            if (cVar.getType() == 7) {
                paint.setAlpha(cVar.c());
            }
        }

        public final void g(fp.c cVar, Paint paint) {
            if (this.f62705y) {
                Float fValueOf = this.f62682b.get(Float.valueOf(cVar.f61784k));
                if (fValueOf == null || this.f62681a != this.f62704x) {
                    float f10 = this.f62704x;
                    this.f62681a = f10;
                    fValueOf = Float.valueOf(cVar.f61784k * f10);
                    this.f62682b.put(Float.valueOf(cVar.f61784k), fValueOf);
                }
                paint.setTextSize(fValueOf.floatValue());
            }
        }

        public void h() {
            this.f62682b.clear();
        }

        public void i(boolean z10) {
            this.f62697q = this.f62696p;
            this.f62695o = this.f62694n;
            this.f62699s = this.f62698r;
            this.f62701u = this.f62700t;
        }

        public Paint j(fp.c cVar) {
            this.f62687g.setColor(cVar.f61785l);
            return this.f62687g;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.text.TextPaint k(fp.c r4, boolean r5) {
            /*
                r3 = this;
                if (r5 == 0) goto L5
                android.text.TextPaint r5 = r3.f62683c
                goto Lc
            L5:
                android.text.TextPaint r5 = r3.f62684d
                android.text.TextPaint r0 = r3.f62683c
                r5.set(r0)
            Lc:
                float r0 = r4.f61784k
                r5.setTextSize(r0)
                r3.g(r4, r5)
                boolean r0 = r3.f62695o
                if (r0 == 0) goto L28
                float r0 = r3.f62689i
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto L28
                int r4 = r4.f61782i
                if (r4 != 0) goto L24
                goto L28
            L24:
                r5.setShadowLayer(r0, r1, r1, r4)
                goto L2b
            L28:
                r5.clearShadowLayer()
            L2b:
                boolean r4 = r3.f62701u
                r5.setAntiAlias(r4)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: gp.a.C0773a.k(fp.c, boolean):android.text.TextPaint");
        }

        public float l() {
            boolean z10 = this.f62695o;
            if (z10 && this.f62697q) {
                return Math.max(this.f62689i, this.f62690j);
            }
            if (z10) {
                return this.f62689i;
            }
            if (this.f62697q) {
                return this.f62690j;
            }
            return 0.0f;
        }

        public Paint m(fp.c cVar) {
            this.f62686f.setColor(cVar.f61783j);
            return this.f62686f;
        }

        public boolean n(fp.c cVar) {
            return (this.f62697q || this.f62699s) && this.f62690j > 0.0f && cVar.f61782i != 0;
        }

        public void o(float f10, float f11, int i10) {
            if (this.f62691k == f10 && this.f62692l == f11 && this.f62693m == i10) {
                return;
            }
            if (f10 <= 1.0f) {
                f10 = 1.0f;
            }
            this.f62691k = f10;
            if (f11 <= 1.0f) {
                f11 = 1.0f;
            }
            this.f62692l = f11;
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 > 255) {
                i10 = 255;
            }
            this.f62693m = i10;
        }

        public void p(float f10) {
            this.f62705y = f10 != 1.0f;
            this.f62704x = f10;
        }

        public void q(float f10) {
            this.f62689i = f10;
        }

        public void r(float f10) {
            this.f62683c.setStrokeWidth(f10);
            this.f62690j = f10;
        }
    }

    @SuppressLint({"NewApi"})
    public static final int A(Canvas canvas) {
        return canvas.getMaximumBitmapWidth();
    }

    private void update(Canvas canvas) {
        this.f62670e = canvas;
        if (canvas != null) {
            this.f62671f = canvas.getWidth();
            this.f62672g = canvas.getHeight();
            if (this.f62678m) {
                this.f62679n = A(canvas);
                this.f62680o = z(canvas);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static final int z(Canvas canvas) {
        return canvas.getMaximumBitmapHeight();
    }

    public final synchronized TextPaint B(fp.c cVar, boolean z10) {
        return this.f62668c.k(cVar, z10);
    }

    public float C() {
        return this.f62668c.l();
    }

    public final void D(Paint paint) {
        int alpha = paint.getAlpha();
        int i10 = fp.b.f61772a;
        if (alpha != i10) {
            paint.setAlpha(i10);
        }
    }

    public final void E(Canvas canvas) {
        canvas.restore();
    }

    public final int F(fp.c cVar, Canvas canvas, float f10, float f11) {
        this.f62666a.save();
        float f12 = this.f62673h;
        if (f12 != 0.0f) {
            this.f62666a.setLocation(0.0f, 0.0f, f12);
        }
        this.f62666a.rotateY(-cVar.f61781h);
        this.f62666a.rotateZ(-cVar.f61780g);
        this.f62666a.getMatrix(this.f62667b);
        this.f62667b.preTranslate(-f10, -f11);
        this.f62667b.postTranslate(f10, f11);
        this.f62666a.restore();
        int iSave = canvas.save();
        canvas.concat(this.f62667b);
        return iSave;
    }

    public final void G(fp.c cVar, float f10, float f11) {
        int i10 = cVar.f61786m;
        float f12 = f10 + (i10 * 2);
        float f13 = f11 + (i10 * 2);
        if (cVar.f61785l != 0) {
            float f14 = 8;
            f12 += f14;
            f13 += f14;
        }
        cVar.f61788o = f12 + C();
        cVar.f61789p = f13;
    }

    @Override // fp.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void u(Canvas canvas) {
        update(canvas);
    }

    public void I(float f10) {
        this.f62668c.r(f10);
    }

    public void J(float f10, float f11, int i10) {
        this.f62668c.o(f10, f11, i10);
    }

    public void K(float f10) {
        this.f62668c.q(f10);
    }

    @Override // fp.l
    public void a(float f10) {
        float fMax = Math.max(f10, getWidth() / 682.0f) * 25.0f;
        this.f62677l = (int) fMax;
        if (f10 > 1.0f) {
            this.f62677l = (int) (fMax * f10);
        }
    }

    @Override // fp.l
    public void b(int i10, float[] fArr) {
        if (i10 != -1) {
            if (i10 == 0) {
                C0773a c0773a = this.f62668c;
                c0773a.f62694n = false;
                c0773a.f62696p = false;
                c0773a.f62698r = false;
                return;
            }
            if (i10 == 1) {
                C0773a c0773a2 = this.f62668c;
                c0773a2.f62694n = true;
                c0773a2.f62696p = false;
                c0773a2.f62698r = false;
                K(fArr[0]);
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                C0773a c0773a3 = this.f62668c;
                c0773a3.f62694n = false;
                c0773a3.f62696p = false;
                c0773a3.f62698r = true;
                J(fArr[0], fArr[1], (int) fArr[2]);
                return;
            }
        }
        C0773a c0773a4 = this.f62668c;
        c0773a4.f62694n = false;
        c0773a4.f62696p = true;
        c0773a4.f62698r = false;
        I(fArr[0]);
    }

    @Override // fp.l
    public void c(float f10, int i10, float f11) {
        this.f62674i = f10;
        this.f62675j = i10;
        this.f62676k = f11;
    }

    @Override // fp.l
    public int d() {
        return this.f62675j;
    }

    @Override // fp.l
    public float e() {
        return this.f62676k;
    }

    @Override // fp.l
    public void f(int i10) {
        this.f62668c.f62706z = i10;
    }

    @Override // fp.l
    public void g(fp.c cVar, boolean z10) {
        TextPaint textPaintB = B(cVar, z10);
        if (this.f62668c.f62697q) {
            this.f62668c.f(cVar, textPaintB, true);
        }
        w(cVar, textPaintB, z10);
        if (this.f62668c.f62697q) {
            this.f62668c.f(cVar, textPaintB, false);
        }
    }

    @Override // fp.l
    public float getDensity() {
        return this.f62674i;
    }

    @Override // fp.l
    public int getHeight() {
        return this.f62672g;
    }

    @Override // fp.l
    public int getMargin() {
        return this.f62668c.f62706z;
    }

    @Override // fp.l
    public int getWidth() {
        return this.f62671f;
    }

    @Override // fp.l
    public int h() {
        return this.f62680o;
    }

    @Override // fp.l
    public int i(fp.c cVar) {
        Paint paint;
        boolean z10;
        boolean z11;
        float fL = cVar.l();
        float fG = cVar.g();
        if (this.f62670e == null) {
            return 0;
        }
        Paint paint2 = null;
        int i10 = 1;
        if (cVar.getType() != 7) {
            paint = null;
            z10 = false;
        } else {
            if (cVar.c() == fp.b.f61773b) {
                return 0;
            }
            if (cVar.f61780g == 0.0f && cVar.f61781h == 0.0f) {
                z11 = false;
            } else {
                F(cVar, this.f62670e, fG, fL);
                z11 = true;
            }
            if (cVar.c() != fp.b.f61772a) {
                paint2 = this.f62668c.f62685e;
                paint2.setAlpha(cVar.c());
            }
            paint = paint2;
            z10 = z11;
        }
        if (paint != null && paint.getAlpha() == fp.b.f61773b) {
            return 0;
        }
        if (!this.f62669d.b(cVar, this.f62670e, fG, fL, paint, this.f62668c.f62683c)) {
            if (paint != null) {
                this.f62668c.f62683c.setAlpha(paint.getAlpha());
                this.f62668c.f62684d.setAlpha(paint.getAlpha());
            } else {
                D(this.f62668c.f62683c);
            }
            r(cVar, this.f62670e, fG, fL, false);
            i10 = 2;
        }
        if (z10) {
            E(this.f62670e);
        }
        return i10;
    }

    @Override // fp.a, fp.l
    public boolean isHardwareAccelerated() {
        return this.f62678m;
    }

    @Override // fp.l
    public void j(boolean z10) {
        this.f62678m = z10;
    }

    @Override // fp.l
    public int k() {
        return this.f62668c.A;
    }

    @Override // fp.l
    public void l(fp.c cVar, boolean z10) {
        b bVar = this.f62669d;
        if (bVar != null) {
            bVar.e(cVar, z10);
        }
    }

    @Override // fp.l
    public int m() {
        return this.f62677l;
    }

    @Override // fp.l
    public int n() {
        return this.f62679n;
    }

    @Override // fp.l
    public void o(int i10, int i11) {
        this.f62671f = i10;
        this.f62672g = i11;
        this.f62673h = (float) (((double) (i10 / 2.0f)) / Math.tan(0.4799655442984406d));
    }

    @Override // fp.l
    public void p(fp.c cVar) {
        b bVar = this.f62669d;
        if (bVar != null) {
            bVar.f(cVar);
        }
    }

    @Override // fp.a
    public void q() {
        this.f62669d.a();
        this.f62668c.h();
    }

    @Override // fp.a
    public b s() {
        return this.f62669d;
    }

    @Override // fp.a
    public void v(float f10) {
        this.f62668c.p(f10);
    }

    public final void w(fp.c cVar, TextPaint textPaint, boolean z10) {
        this.f62669d.d(cVar, textPaint, z10);
        G(cVar, cVar.f61788o, cVar.f61789p);
    }

    @Override // fp.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public synchronized void r(fp.c cVar, Canvas canvas, float f10, float f11, boolean z10) {
        b bVar = this.f62669d;
        if (bVar != null) {
            bVar.c(cVar, canvas, f10, f11, z10, this.f62668c);
        }
    }

    @Override // fp.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Canvas t() {
        return this.f62670e;
    }
}
