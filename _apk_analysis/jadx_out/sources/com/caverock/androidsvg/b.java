package com.caverock.androidsvg;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: compiled from: SVGAndroidRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HashSet<String> f14890i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f14891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SVG f14893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f14894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Stack<h> f14895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Stack<SVG.h0> f14896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Stack<Matrix> f14897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CSSParser.m f14898h = null;

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f14901c;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            f14901c = iArr;
            try {
                iArr[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14901c[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14901c[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            f14900b = iArr2;
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14900b[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14900b[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            f14899a = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14899a[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14899a[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14899a[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14899a[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14899a[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14899a[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14899a[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class C0272b implements SVG.w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14904c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f14909h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<c> f14902a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f14905d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f14906e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f14907f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14908g = -1;

        public C0272b(SVG.v vVar) {
            if (vVar == null) {
                return;
            }
            vVar.e(this);
            if (this.f14909h) {
                this.f14905d.b(this.f14902a.get(this.f14908g));
                this.f14902a.set(this.f14908g, this.f14905d);
                this.f14909h = false;
            }
            c cVar = this.f14905d;
            if (cVar != null) {
                this.f14902a.add(cVar);
            }
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void a(float f10, float f11, float f12, float f13) {
            this.f14905d.a(f10, f11);
            this.f14902a.add(this.f14905d);
            this.f14905d = b.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f14909h = false;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f14906e = true;
            this.f14907f = false;
            c cVar = this.f14905d;
            b.h(cVar.f14911a, cVar.f14912b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f14907f = true;
            this.f14909h = false;
        }

        public List<c> c() {
            return this.f14902a;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void close() {
            this.f14902a.add(this.f14905d);
            lineTo(this.f14903b, this.f14904c);
            this.f14909h = true;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f14907f || this.f14906e) {
                this.f14905d.a(f10, f11);
                this.f14902a.add(this.f14905d);
                this.f14906e = false;
            }
            this.f14905d = b.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f14909h = false;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void lineTo(float f10, float f11) {
            this.f14905d.a(f10, f11);
            this.f14902a.add(this.f14905d);
            b bVar = b.this;
            c cVar = this.f14905d;
            this.f14905d = bVar.new c(f10, f11, f10 - cVar.f14911a, f11 - cVar.f14912b);
            this.f14909h = false;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void moveTo(float f10, float f11) {
            if (this.f14909h) {
                this.f14905d.b(this.f14902a.get(this.f14908g));
                this.f14902a.set(this.f14908g, this.f14905d);
                this.f14909h = false;
            }
            c cVar = this.f14905d;
            if (cVar != null) {
                this.f14902a.add(cVar);
            }
            this.f14903b = f10;
            this.f14904c = f11;
            this.f14905d = b.this.new c(f10, f11, 0.0f, 0.0f);
            this.f14908g = this.f14902a.size();
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f14911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f14914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f14915e = false;

        public c(float f10, float f11, float f12, float f13) {
            this.f14913c = 0.0f;
            this.f14914d = 0.0f;
            this.f14911a = f10;
            this.f14912b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f14913c = (float) (((double) f12) / dSqrt);
                this.f14914d = (float) (((double) f13) / dSqrt);
            }
        }

        public void a(float f10, float f11) {
            float f12 = f10 - this.f14911a;
            float f13 = f11 - this.f14912b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f14913c;
            if (f12 != (-f14) || f13 != (-this.f14914d)) {
                this.f14913c = f14 + f12;
                this.f14914d += f13;
            } else {
                this.f14915e = true;
                this.f14913c = -f13;
                this.f14914d = f12;
            }
        }

        public void b(c cVar) {
            float f10 = cVar.f14913c;
            float f11 = this.f14913c;
            if (f10 == (-f11)) {
                float f12 = cVar.f14914d;
                if (f12 == (-this.f14914d)) {
                    this.f14915e = true;
                    this.f14913c = -f12;
                    this.f14914d = cVar.f14913c;
                    return;
                }
            }
            this.f14913c = f11 + f10;
            this.f14914d += cVar.f14914d;
        }

        public String toString() {
            return "(" + this.f14911a + StringUtils.COMMA + this.f14912b + Z7.f30794r + this.f14913c + StringUtils.COMMA + this.f14914d + ")";
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class d implements SVG.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Path f14917a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14919c;

        public d(SVG.v vVar) {
            if (vVar == null) {
                return;
            }
            vVar.e(this);
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void a(float f10, float f11, float f12, float f13) {
            this.f14917a.quadTo(f10, f11, f12, f13);
            this.f14918b = f12;
            this.f14919c = f13;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            b.h(this.f14918b, this.f14919c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f14918b = f13;
            this.f14919c = f14;
        }

        public Path c() {
            return this.f14917a;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void close() {
            this.f14917a.close();
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f14917a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f14918b = f14;
            this.f14919c = f15;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void lineTo(float f10, float f11) {
            this.f14917a.lineTo(f10, f11);
            this.f14918b = f10;
            this.f14919c = f11;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void moveTo(float f10, float f11) {
            this.f14917a.moveTo(f10, f11);
            this.f14918b = f10;
            this.f14919c = f11;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Path f14921e;

        public e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f14921e = path;
        }

        @Override // com.caverock.androidsvg.b.f, com.caverock.androidsvg.b.j
        public void b(String str) {
            if (b.this.Y0()) {
                if (b.this.f14894d.f14931b) {
                    b.this.f14891a.drawTextOnPath(str, this.f14921e, this.f14923b, this.f14924c, b.this.f14894d.f14933d);
                }
                if (b.this.f14894d.f14932c) {
                    b.this.f14891a.drawTextOnPath(str, this.f14921e, this.f14923b, this.f14924c, b.this.f14894d.f14934e);
                }
            }
            this.f14923b += b.this.f14894d.f14933d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14924c;

        public f(float f10, float f11) {
            super(b.this, null);
            this.f14923b = f10;
            this.f14924c = f11;
        }

        @Override // com.caverock.androidsvg.b.j
        public void b(String str) {
            b.y("TextSequence render", new Object[0]);
            if (b.this.Y0()) {
                if (b.this.f14894d.f14931b) {
                    b.this.f14891a.drawText(str, this.f14923b, this.f14924c, b.this.f14894d.f14933d);
                }
                if (b.this.f14894d.f14932c) {
                    b.this.f14891a.drawText(str, this.f14923b, this.f14924c, b.this.f14894d.f14934e);
                }
            }
            this.f14923b += b.this.f14894d.f14933d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f14928d;

        public g(float f10, float f11, Path path) {
            super(b.this, null);
            this.f14926b = f10;
            this.f14927c = f11;
            this.f14928d = path;
        }

        @Override // com.caverock.androidsvg.b.j
        public boolean a(SVG.w0 w0Var) {
            if (!(w0Var instanceof SVG.x0)) {
                return true;
            }
            b.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.caverock.androidsvg.b.j
        public void b(String str) {
            if (b.this.Y0()) {
                Path path = new Path();
                b.this.f14894d.f14933d.getTextPath(str, 0, str.length(), this.f14926b, this.f14927c, path);
                this.f14928d.addPath(path);
            }
            this.f14926b += b.this.f14894d.f14933d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SVG.Style f14930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f14932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f14933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f14934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SVG.b f14935f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public SVG.b f14936g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f14937h;

        public h() {
            Paint paint = new Paint();
            this.f14933d = paint;
            paint.setFlags(193);
            this.f14933d.setHinting(0);
            this.f14933d.setStyle(Paint.Style.FILL);
            this.f14933d.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.f14934e = paint2;
            paint2.setFlags(193);
            this.f14934e.setHinting(0);
            this.f14934e.setStyle(Paint.Style.STROKE);
            this.f14934e.setTypeface(Typeface.DEFAULT);
            this.f14930a = SVG.Style.a();
        }

        public h(h hVar) {
            this.f14931b = hVar.f14931b;
            this.f14932c = hVar.f14932c;
            this.f14933d = new Paint(hVar.f14933d);
            this.f14934e = new Paint(hVar.f14934e);
            SVG.b bVar = hVar.f14935f;
            if (bVar != null) {
                this.f14935f = new SVG.b(bVar);
            }
            SVG.b bVar2 = hVar.f14936g;
            if (bVar2 != null) {
                this.f14936g = new SVG.b(bVar2);
            }
            this.f14937h = hVar.f14937h;
            try {
                this.f14930a = (SVG.Style) hVar.f14930a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f14930a = SVG.Style.a();
            }
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RectF f14941d;

        public i(float f10, float f11) {
            super(b.this, null);
            this.f14941d = new RectF();
            this.f14939b = f10;
            this.f14940c = f11;
        }

        @Override // com.caverock.androidsvg.b.j
        public boolean a(SVG.w0 w0Var) {
            if (!(w0Var instanceof SVG.x0)) {
                return true;
            }
            SVG.x0 x0Var = (SVG.x0) w0Var;
            SVG.l0 l0VarU = w0Var.f14780a.u(x0Var.f14833o);
            if (l0VarU == null) {
                b.F("TextPath path reference '%s' not found", x0Var.f14833o);
                return false;
            }
            SVG.u uVar = (SVG.u) l0VarU;
            Path pathC = b.this.new d(uVar.f14818o).c();
            Matrix matrix = uVar.f14774n;
            if (matrix != null) {
                pathC.transform(matrix);
            }
            RectF rectF = new RectF();
            pathC.computeBounds(rectF, true);
            this.f14941d.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.b.j
        public void b(String str) {
            if (b.this.Y0()) {
                Rect rect = new Rect();
                b.this.f14894d.f14933d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f14939b, this.f14940c);
                this.f14941d.union(rectF);
            }
            this.f14939b += b.this.f14894d.f14933d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public abstract class j {
        public j() {
        }

        public /* synthetic */ j(b bVar, a aVar) {
            this();
        }

        public boolean a(SVG.w0 w0Var) {
            return true;
        }

        public abstract void b(String str);
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class k extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14944b;

        public k() {
            super(b.this, null);
            this.f14944b = 0.0f;
        }

        public /* synthetic */ k(b bVar, a aVar) {
            this();
        }

        @Override // com.caverock.androidsvg.b.j
        public void b(String str) {
            this.f14944b += b.this.f14894d.f14933d.measureText(str);
        }
    }

    public b(Canvas canvas, float f10) {
        this.f14891a = canvas;
        this.f14892b = f10;
    }

    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static synchronized void V() {
        HashSet<String> hashSet = new HashSet<>();
        f14890i = hashSet;
        hashSet.add("Structure");
        f14890i.add("BasicStructure");
        f14890i.add("ConditionalProcessing");
        f14890i.add("Image");
        f14890i.add("Style");
        f14890i.add("ViewportAttribute");
        f14890i.add("Shape");
        f14890i.add("BasicText");
        f14890i.add("PaintAttribute");
        f14890i.add("BasicPaintAttribute");
        f14890i.add("OpacityAttribute");
        f14890i.add("BasicGraphicsAttribute");
        f14890i.add("Marker");
        f14890i.add("Gradient");
        f14890i.add("Pattern");
        f14890i.add("Clip");
        f14890i.add("BasicClip");
        f14890i.add("Mask");
        f14890i.add("View");
    }

    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, SVG.w wVar) {
        float f17;
        SVG.w wVar2;
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f) {
            f17 = f15;
            wVar2 = wVar;
        } else {
            if (f13 != 0.0f) {
                float fAbs = Math.abs(f12);
                float fAbs2 = Math.abs(f13);
                double radians = Math.toRadians(((double) f14) % 360.0d);
                double dCos = Math.cos(radians);
                double dSin = Math.sin(radians);
                double d10 = ((double) (f10 - f15)) / 2.0d;
                double d11 = ((double) (f11 - f16)) / 2.0d;
                double d12 = (dCos * d10) + (dSin * d11);
                double d13 = ((-dSin) * d10) + (d11 * dCos);
                double d14 = fAbs * fAbs;
                double d15 = fAbs2 * fAbs2;
                double d16 = d12 * d12;
                double d17 = d13 * d13;
                double d18 = (d16 / d14) + (d17 / d15);
                if (d18 > 0.99999d) {
                    double dSqrt = Math.sqrt(d18) * 1.00001d;
                    fAbs = (float) (((double) fAbs) * dSqrt);
                    fAbs2 = (float) (dSqrt * ((double) fAbs2));
                    d14 = fAbs * fAbs;
                    d15 = fAbs2 * fAbs2;
                }
                double d19 = z10 == z11 ? -1.0d : 1.0d;
                double d20 = d14 * d15;
                double d21 = d14 * d17;
                double d22 = d15 * d16;
                double d23 = ((d20 - d21) - d22) / (d21 + d22);
                if (d23 < 0.0d) {
                    d23 = 0.0d;
                }
                double dSqrt2 = d19 * Math.sqrt(d23);
                double d24 = fAbs;
                double d25 = fAbs2;
                double d26 = ((d24 * d13) / d25) * dSqrt2;
                float f18 = fAbs;
                float f19 = fAbs2;
                double d27 = dSqrt2 * (-((d25 * d12) / d24));
                double d28 = (((double) (f10 + f15)) / 2.0d) + ((dCos * d26) - (dSin * d27));
                double d29 = (((double) (f11 + f16)) / 2.0d) + (dSin * d26) + (dCos * d27);
                double d30 = (d12 - d26) / d24;
                double d31 = (d13 - d27) / d25;
                double d32 = ((-d12) - d26) / d24;
                double d33 = ((-d13) - d27) / d25;
                double d34 = (d30 * d30) + (d31 * d31);
                double dAcos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
                double dV = ((d30 * d33) - (d31 * d32) >= 0.0d ? 1.0d : -1.0d) * v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
                if (!z11 && dV > 0.0d) {
                    dV -= 6.283185307179586d;
                } else if (z11 && dV < 0.0d) {
                    dV += 6.283185307179586d;
                }
                float[] fArrI = i(dAcos % 6.283185307179586d, dV % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(f18, f19);
                matrix.postRotate(f14);
                matrix.postTranslate((float) d28, (float) d29);
                matrix.mapPoints(fArrI);
                fArrI[fArrI.length - 2] = f15;
                fArrI[fArrI.length - 1] = f16;
                for (int i10 = 0; i10 < fArrI.length; i10 += 6) {
                    wVar.cubicTo(fArrI[i10], fArrI[i10 + 1], fArrI[i10 + 2], fArrI[i10 + 3], fArrI[i10 + 4], fArrI[i10 + 5]);
                }
                return;
            }
            wVar2 = wVar;
            f17 = f15;
        }
        wVar2.lineTo(f17, f16);
    }

    public static float[] i(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) iCeil);
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        for (int i11 = 0; i11 < iCeil; i11++) {
            double d14 = d10 + (((double) i11) * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            int i12 = i10 + 1;
            fArr[i10] = (float) (dCos - (dSin * dSin2));
            int i13 = i12 + 1;
            fArr[i12] = (float) (dSin2 + (dCos * dSin));
            d12 = d12;
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            int i14 = i13 + 1;
            fArr[i13] = (float) ((dSin * dSin3) + dCos2);
            int i15 = i14 + 1;
            fArr[i14] = (float) (dSin3 - (dSin * dCos2));
            int i16 = i15 + 1;
            fArr[i15] = (float) dCos2;
            i10 = i16 + 1;
            fArr[i16] = (float) dSin3;
        }
        return fArr;
    }

    public static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    public static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    public static int x(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (i11 << 24);
    }

    public static void y(String str, Object... objArr) {
    }

    public final boolean A() {
        Boolean bool = this.f14894d.f14930a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void A0(SVG.l0 l0Var) {
        if (l0Var instanceof SVG.s) {
            return;
        }
        S0();
        u(l0Var);
        if (l0Var instanceof SVG.d0) {
            x0((SVG.d0) l0Var);
        } else if (l0Var instanceof SVG.b1) {
            E0((SVG.b1) l0Var);
        } else if (l0Var instanceof SVG.q0) {
            B0((SVG.q0) l0Var);
        } else if (l0Var instanceof SVG.l) {
            q0((SVG.l) l0Var);
        } else if (l0Var instanceof SVG.n) {
            r0((SVG.n) l0Var);
        } else if (l0Var instanceof SVG.u) {
            t0((SVG.u) l0Var);
        } else if (l0Var instanceof SVG.a0) {
            w0((SVG.a0) l0Var);
        } else if (l0Var instanceof SVG.d) {
            o0((SVG.d) l0Var);
        } else if (l0Var instanceof SVG.i) {
            p0((SVG.i) l0Var);
        } else if (l0Var instanceof SVG.p) {
            s0((SVG.p) l0Var);
        } else if (l0Var instanceof SVG.z) {
            v0((SVG.z) l0Var);
        } else if (l0Var instanceof SVG.y) {
            u0((SVG.y) l0Var);
        } else if (l0Var instanceof SVG.u0) {
            D0((SVG.u0) l0Var);
        }
        R0();
    }

    public final void B(SVG.i0 i0Var, Path path) {
        SVG.m0 m0Var = this.f14894d.f14930a.f14673c;
        if (m0Var instanceof SVG.t) {
            SVG.l0 l0VarU = this.f14893c.u(((SVG.t) m0Var).f14815b);
            if (l0VarU instanceof SVG.x) {
                L(i0Var, path, (SVG.x) l0VarU);
                return;
            }
        }
        this.f14891a.drawPath(path, this.f14894d.f14933d);
    }

    public final void B0(SVG.q0 q0Var) {
        y("Switch render", new Object[0]);
        W0(this.f14894d, q0Var);
        if (A()) {
            Matrix matrix = q0Var.f14779o;
            if (matrix != null) {
                this.f14891a.concat(matrix);
            }
            p(q0Var);
            boolean zM0 = m0();
            K0(q0Var);
            if (zM0) {
                j0(q0Var);
            }
            U0(q0Var);
        }
    }

    public final void C(Path path) {
        h hVar = this.f14894d;
        if (hVar.f14930a.M != SVG.Style.VectorEffect.NonScalingStroke) {
            this.f14891a.drawPath(path, hVar.f14934e);
            return;
        }
        Matrix matrix = this.f14891a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f14891a.setMatrix(new Matrix());
        Shader shader = this.f14894d.f14934e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f14891a.drawPath(path2, this.f14894d.f14934e);
        this.f14891a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void C0(SVG.r0 r0Var, SVG.b bVar) {
        y("Symbol render", new Object[0]);
        if (bVar.f14723c == 0.0f || bVar.f14724d == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = r0Var.f14788o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f14653e;
        }
        W0(this.f14894d, r0Var);
        h hVar = this.f14894d;
        hVar.f14935f = bVar;
        if (!hVar.f14930a.f14693w.booleanValue()) {
            SVG.b bVar2 = this.f14894d.f14935f;
            O0(bVar2.f14721a, bVar2.f14722b, bVar2.f14723c, bVar2.f14724d);
        }
        SVG.b bVar3 = r0Var.f14800p;
        if (bVar3 != null) {
            this.f14891a.concat(o(this.f14894d.f14935f, bVar3, preserveAspectRatio));
            this.f14894d.f14936g = r0Var.f14800p;
        } else {
            Canvas canvas = this.f14891a;
            SVG.b bVar4 = this.f14894d.f14935f;
            canvas.translate(bVar4.f14721a, bVar4.f14722b);
        }
        boolean zM0 = m0();
        F0(r0Var, true);
        if (zM0) {
            j0(r0Var);
        }
        U0(r0Var);
    }

    public final float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    public final void D0(SVG.u0 u0Var) {
        y("Text render", new Object[0]);
        W0(this.f14894d, u0Var);
        if (A()) {
            Matrix matrix = u0Var.f14820s;
            if (matrix != null) {
                this.f14891a.concat(matrix);
            }
            List<SVG.o> list = u0Var.f14837o;
            float f10 = 0.0f;
            float fE = (list == null || list.size() == 0) ? 0.0f : u0Var.f14837o.get(0).e(this);
            List<SVG.o> list2 = u0Var.f14838p;
            float f11 = (list2 == null || list2.size() == 0) ? 0.0f : u0Var.f14838p.get(0).f(this);
            List<SVG.o> list3 = u0Var.f14839q;
            float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : u0Var.f14839q.get(0).e(this);
            List<SVG.o> list4 = u0Var.f14840r;
            if (list4 != null && list4.size() != 0) {
                f10 = u0Var.f14840r.get(0).f(this);
            }
            SVG.Style.TextAnchor textAnchorO = O();
            if (textAnchorO != SVG.Style.TextAnchor.Start) {
                float fN = n(u0Var);
                if (textAnchorO == SVG.Style.TextAnchor.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            if (u0Var.f14763h == null) {
                i iVar = new i(fE, f11);
                E(u0Var, iVar);
                RectF rectF = iVar.f14941d;
                u0Var.f14763h = new SVG.b(rectF.left, rectF.top, rectF.width(), iVar.f14941d.height());
            }
            U0(u0Var);
            r(u0Var);
            p(u0Var);
            boolean zM0 = m0();
            E(u0Var, new f(fE + fE2, f11 + f10));
            if (zM0) {
                j0(u0Var);
            }
        }
    }

    public final void E(SVG.w0 w0Var, j jVar) {
        if (A()) {
            Iterator<SVG.l0> it = w0Var.f14747i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                SVG.l0 next = it.next();
                if (next instanceof SVG.a1) {
                    jVar.b(T0(((SVG.a1) next).f14719c, z10, !it.hasNext()));
                } else {
                    l0(next, jVar);
                }
                z10 = false;
            }
        }
    }

    public final void E0(SVG.b1 b1Var) {
        y("Use render", new Object[0]);
        SVG.o oVar = b1Var.f14728s;
        if (oVar == null || !oVar.i()) {
            SVG.o oVar2 = b1Var.f14729t;
            if (oVar2 == null || !oVar2.i()) {
                W0(this.f14894d, b1Var);
                if (A()) {
                    SVG.l0 l0VarU = b1Var.f14780a.u(b1Var.f14725p);
                    if (l0VarU == null) {
                        F("Use reference '%s' not found", b1Var.f14725p);
                        return;
                    }
                    Matrix matrix = b1Var.f14779o;
                    if (matrix != null) {
                        this.f14891a.concat(matrix);
                    }
                    SVG.o oVar3 = b1Var.f14726q;
                    float fE = oVar3 != null ? oVar3.e(this) : 0.0f;
                    SVG.o oVar4 = b1Var.f14727r;
                    this.f14891a.translate(fE, oVar4 != null ? oVar4.f(this) : 0.0f);
                    p(b1Var);
                    boolean zM0 = m0();
                    i0(b1Var);
                    if (l0VarU instanceof SVG.d0) {
                        SVG.b bVarF0 = f0(null, null, b1Var.f14728s, b1Var.f14729t);
                        S0();
                        y0((SVG.d0) l0VarU, bVarF0);
                        R0();
                    } else if (l0VarU instanceof SVG.r0) {
                        SVG.o oVar5 = b1Var.f14728s;
                        if (oVar5 == null) {
                            oVar5 = new SVG.o(100.0f, SVG.Unit.percent);
                        }
                        SVG.o oVar6 = b1Var.f14729t;
                        if (oVar6 == null) {
                            oVar6 = new SVG.o(100.0f, SVG.Unit.percent);
                        }
                        SVG.b bVarF02 = f0(null, null, oVar5, oVar6);
                        S0();
                        C0((SVG.r0) l0VarU, bVarF02);
                        R0();
                    } else {
                        A0(l0VarU);
                    }
                    h0();
                    if (zM0) {
                        j0(b1Var);
                    }
                    U0(b1Var);
                }
            }
        }
    }

    public final void F0(SVG.h0 h0Var, boolean z10) {
        if (z10) {
            i0(h0Var);
        }
        Iterator<SVG.l0> it = h0Var.k().iterator();
        while (it.hasNext()) {
            A0(it.next());
        }
        if (z10) {
            h0();
        }
    }

    public final void G(SVG.w0 w0Var, StringBuilder sb2) {
        Iterator<SVG.l0> it = w0Var.f14747i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            SVG.l0 next = it.next();
            if (next instanceof SVG.w0) {
                G((SVG.w0) next, sb2);
            } else if (next instanceof SVG.a1) {
                sb2.append(T0(((SVG.a1) next).f14719c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public void G0(SVG svg, com.caverock.androidsvg.a aVar) {
        SVG.b bVar;
        PreserveAspectRatio preserveAspectRatio;
        if (aVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f14893c = svg;
        SVG.d0 d0VarP = svg.p();
        if (d0VarP == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (aVar.e()) {
            SVG.j0 j0VarJ = this.f14893c.j(aVar.f14888e);
            if (j0VarJ == null || !(j0VarJ instanceof SVG.c1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", aVar.f14888e));
                return;
            }
            SVG.c1 c1Var = (SVG.c1) j0VarJ;
            bVar = c1Var.f14800p;
            if (bVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", aVar.f14888e));
                return;
            }
            preserveAspectRatio = c1Var.f14788o;
        } else {
            bVar = aVar.f() ? aVar.f14887d : d0VarP.f14800p;
            preserveAspectRatio = aVar.c() ? aVar.f14885b : d0VarP.f14788o;
        }
        if (aVar.b()) {
            svg.a(aVar.f14884a);
        }
        if (aVar.d()) {
            CSSParser.m mVar = new CSSParser.m();
            this.f14898h = mVar;
            mVar.f14643a = svg.j(aVar.f14886c);
        }
        N0();
        u(d0VarP);
        S0();
        SVG.b bVar2 = new SVG.b(aVar.f14889f);
        SVG.o oVar = d0VarP.f14740s;
        if (oVar != null) {
            bVar2.f14723c = oVar.d(this, bVar2.f14723c);
        }
        SVG.o oVar2 = d0VarP.f14741t;
        if (oVar2 != null) {
            bVar2.f14724d = oVar2.d(this, bVar2.f14724d);
        }
        z0(d0VarP, bVar2, bVar, preserveAspectRatio);
        R0();
        if (aVar.b()) {
            svg.b();
        }
    }

    public final void H(SVG.j jVar, String str) {
        SVG.l0 l0VarU = jVar.f14780a.u(str);
        if (l0VarU == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(l0VarU instanceof SVG.j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (l0VarU == jVar) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.j jVar2 = (SVG.j) l0VarU;
        if (jVar.f14765i == null) {
            jVar.f14765i = jVar2.f14765i;
        }
        if (jVar.f14766j == null) {
            jVar.f14766j = jVar2.f14766j;
        }
        if (jVar.f14767k == null) {
            jVar.f14767k = jVar2.f14767k;
        }
        if (jVar.f14764h.isEmpty()) {
            jVar.f14764h = jVar2.f14764h;
        }
        try {
            if (jVar instanceof SVG.k0) {
                I((SVG.k0) jVar, (SVG.k0) l0VarU);
            } else {
                J((SVG.o0) jVar, (SVG.o0) l0VarU);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f14768l;
        if (str2 != null) {
            H(jVar, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
    
        if (r7 != 8) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(com.caverock.androidsvg.SVG.q r12, com.caverock.androidsvg.b.c r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.b.H0(com.caverock.androidsvg.SVG$q, com.caverock.androidsvg.b$c):void");
    }

    public final void I(SVG.k0 k0Var, SVG.k0 k0Var2) {
        if (k0Var.f14775m == null) {
            k0Var.f14775m = k0Var2.f14775m;
        }
        if (k0Var.f14776n == null) {
            k0Var.f14776n = k0Var2.f14776n;
        }
        if (k0Var.f14777o == null) {
            k0Var.f14777o = k0Var2.f14777o;
        }
        if (k0Var.f14778p == null) {
            k0Var.f14778p = k0Var2.f14778p;
        }
    }

    public final void I0(SVG.k kVar) {
        SVG.q qVar;
        SVG.q qVar2;
        SVG.q qVar3;
        int size;
        SVG.Style style = this.f14894d.f14930a;
        String str = style.f14695y;
        if (str == null && style.f14696z == null && style.A == null) {
            return;
        }
        if (str == null) {
            qVar = null;
        } else {
            SVG.l0 l0VarU = kVar.f14780a.u(str);
            if (l0VarU != null) {
                qVar = (SVG.q) l0VarU;
            } else {
                F("Marker reference '%s' not found", this.f14894d.f14930a.f14695y);
                qVar = null;
            }
        }
        String str2 = this.f14894d.f14930a.f14696z;
        if (str2 == null) {
            qVar2 = null;
        } else {
            SVG.l0 l0VarU2 = kVar.f14780a.u(str2);
            if (l0VarU2 != null) {
                qVar2 = (SVG.q) l0VarU2;
            } else {
                F("Marker reference '%s' not found", this.f14894d.f14930a.f14696z);
                qVar2 = null;
            }
        }
        String str3 = this.f14894d.f14930a.A;
        if (str3 == null) {
            qVar3 = null;
        } else {
            SVG.l0 l0VarU3 = kVar.f14780a.u(str3);
            if (l0VarU3 != null) {
                qVar3 = (SVG.q) l0VarU3;
            } else {
                F("Marker reference '%s' not found", this.f14894d.f14930a.A);
                qVar3 = null;
            }
        }
        List<c> listC = kVar instanceof SVG.u ? new C0272b(((SVG.u) kVar).f14818o).c() : kVar instanceof SVG.p ? k((SVG.p) kVar) : l((SVG.y) kVar);
        if (listC == null || (size = listC.size()) == 0) {
            return;
        }
        SVG.Style style2 = this.f14894d.f14930a;
        style2.A = null;
        style2.f14696z = null;
        style2.f14695y = null;
        if (qVar != null) {
            H0(qVar, listC.get(0));
        }
        if (qVar2 != null && listC.size() > 2) {
            c cVarN0 = listC.get(0);
            c cVar = listC.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                c cVar2 = listC.get(i10);
                cVarN0 = cVar.f14915e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(qVar2, cVarN0);
                cVar = cVar2;
            }
        }
        if (qVar3 != null) {
            H0(qVar3, listC.get(size - 1));
        }
    }

    public final void J(SVG.o0 o0Var, SVG.o0 o0Var2) {
        if (o0Var.f14791m == null) {
            o0Var.f14791m = o0Var2.f14791m;
        }
        if (o0Var.f14792n == null) {
            o0Var.f14792n = o0Var2.f14792n;
        }
        if (o0Var.f14793o == null) {
            o0Var.f14793o = o0Var2.f14793o;
        }
        if (o0Var.f14794p == null) {
            o0Var.f14794p = o0Var2.f14794p;
        }
        if (o0Var.f14795q == null) {
            o0Var.f14795q = o0Var2.f14795q;
        }
    }

    public final void J0(SVG.r rVar, SVG.i0 i0Var, SVG.b bVar) {
        float fE;
        float f10;
        y("Mask render", new Object[0]);
        Boolean bool = rVar.f14807o;
        boolean z10 = true;
        if (bool != null && bool.booleanValue()) {
            SVG.o oVar = rVar.f14811s;
            fE = oVar != null ? oVar.e(this) : bVar.f14723c;
            SVG.o oVar2 = rVar.f14812t;
            f10 = oVar2 != null ? oVar2.f(this) : bVar.f14724d;
        } else {
            SVG.o oVar3 = rVar.f14811s;
            float fD = oVar3 != null ? oVar3.d(this, 1.0f) : 1.2f;
            SVG.o oVar4 = rVar.f14812t;
            float fD2 = oVar4 != null ? oVar4.d(this, 1.0f) : 1.2f;
            fE = fD * bVar.f14723c;
            f10 = fD2 * bVar.f14724d;
        }
        if (fE == 0.0f || f10 == 0.0f) {
            return;
        }
        S0();
        h hVarM = M(rVar);
        this.f14894d = hVarM;
        hVarM.f14930a.f14684n = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.f14891a.save();
        Boolean bool2 = rVar.f14808p;
        if (bool2 != null && !bool2.booleanValue()) {
            z10 = false;
        }
        if (!z10) {
            this.f14891a.translate(bVar.f14721a, bVar.f14722b);
            this.f14891a.scale(bVar.f14723c, bVar.f14724d);
        }
        F0(rVar, false);
        this.f14891a.restore();
        if (zM0) {
            k0(i0Var, bVar);
        }
        R0();
    }

    public final void K(SVG.x xVar, String str) {
        SVG.l0 l0VarU = xVar.f14780a.u(str);
        if (l0VarU == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(l0VarU instanceof SVG.x)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (l0VarU == xVar) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.x xVar2 = (SVG.x) l0VarU;
        if (xVar.f14825q == null) {
            xVar.f14825q = xVar2.f14825q;
        }
        if (xVar.f14826r == null) {
            xVar.f14826r = xVar2.f14826r;
        }
        if (xVar.f14827s == null) {
            xVar.f14827s = xVar2.f14827s;
        }
        if (xVar.f14828t == null) {
            xVar.f14828t = xVar2.f14828t;
        }
        if (xVar.f14829u == null) {
            xVar.f14829u = xVar2.f14829u;
        }
        if (xVar.f14830v == null) {
            xVar.f14830v = xVar2.f14830v;
        }
        if (xVar.f14831w == null) {
            xVar.f14831w = xVar2.f14831w;
        }
        if (xVar.f14747i.isEmpty()) {
            xVar.f14747i = xVar2.f14747i;
        }
        if (xVar.f14800p == null) {
            xVar.f14800p = xVar2.f14800p;
        }
        if (xVar.f14788o == null) {
            xVar.f14788o = xVar2.f14788o;
        }
        String str2 = xVar2.f14832x;
        if (str2 != null) {
            K(xVar, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0(SVG.q0 q0Var) {
        Set<String> setF;
        String language = Locale.getDefault().getLanguage();
        SVG.k();
        for (SVG.l0 l0Var : q0Var.k()) {
            if (l0Var instanceof SVG.e0) {
                SVG.e0 e0Var = (SVG.e0) l0Var;
                if (e0Var.a() == null && ((setF = e0Var.f()) == null || (!setF.isEmpty() && setF.contains(language)))) {
                    Set<String> requiredFeatures = e0Var.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (f14890i == null) {
                            V();
                        }
                        if (requiredFeatures.isEmpty() || !f14890i.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> setE = e0Var.e();
                    if (setE != null) {
                        setE.isEmpty();
                    } else {
                        Set<String> setM = e0Var.m();
                        if (setM == null) {
                            A0(l0Var);
                            return;
                        }
                        setM.isEmpty();
                    }
                }
            }
        }
    }

    public final void L(SVG.i0 i0Var, Path path, SVG.x xVar) {
        float fE;
        float f10;
        float f11;
        float fE2;
        float f12;
        Boolean bool = xVar.f14825q;
        boolean z10 = bool != null && bool.booleanValue();
        String str = xVar.f14832x;
        if (str != null) {
            K(xVar, str);
        }
        if (z10) {
            SVG.o oVar = xVar.f14828t;
            fE = oVar != null ? oVar.e(this) : 0.0f;
            SVG.o oVar2 = xVar.f14829u;
            f11 = oVar2 != null ? oVar2.f(this) : 0.0f;
            SVG.o oVar3 = xVar.f14830v;
            fE2 = oVar3 != null ? oVar3.e(this) : 0.0f;
            SVG.o oVar4 = xVar.f14831w;
            f10 = oVar4 != null ? oVar4.f(this) : 0.0f;
        } else {
            SVG.o oVar5 = xVar.f14828t;
            float fD = oVar5 != null ? oVar5.d(this, 1.0f) : 0.0f;
            SVG.o oVar6 = xVar.f14829u;
            float fD2 = oVar6 != null ? oVar6.d(this, 1.0f) : 0.0f;
            SVG.o oVar7 = xVar.f14830v;
            float fD3 = oVar7 != null ? oVar7.d(this, 1.0f) : 0.0f;
            SVG.o oVar8 = xVar.f14831w;
            float fD4 = oVar8 != null ? oVar8.d(this, 1.0f) : 0.0f;
            SVG.b bVar = i0Var.f14763h;
            float f13 = bVar.f14721a;
            float f14 = bVar.f14723c;
            fE = (fD * f14) + f13;
            float f15 = bVar.f14722b;
            float f16 = bVar.f14724d;
            float f17 = fD3 * f14;
            f10 = fD4 * f16;
            f11 = (fD2 * f16) + f15;
            fE2 = f17;
        }
        if (fE2 == 0.0f || f10 == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = xVar.f14788o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f14653e;
        }
        S0();
        this.f14891a.clipPath(path);
        h hVar = new h();
        V0(hVar, SVG.Style.a());
        hVar.f14930a.f14693w = Boolean.FALSE;
        this.f14894d = N(xVar, hVar);
        SVG.b bVar2 = i0Var.f14763h;
        Matrix matrix = xVar.f14827s;
        if (matrix != null) {
            this.f14891a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (xVar.f14827s.invert(matrix2)) {
                SVG.b bVar3 = i0Var.f14763h;
                SVG.b bVar4 = i0Var.f14763h;
                SVG.b bVar5 = i0Var.f14763h;
                float[] fArr = {bVar3.f14721a, bVar3.f14722b, bVar3.b(), bVar4.f14722b, bVar4.b(), i0Var.f14763h.c(), bVar5.f14721a, bVar5.c()};
                matrix2.mapPoints(fArr);
                float f18 = fArr[0];
                float f19 = fArr[1];
                RectF rectF = new RectF(f18, f19, f18, f19);
                for (int i10 = 2; i10 <= 6; i10 += 2) {
                    float f20 = fArr[i10];
                    if (f20 < rectF.left) {
                        rectF.left = f20;
                    }
                    if (f20 > rectF.right) {
                        rectF.right = f20;
                    }
                    float f21 = fArr[i10 + 1];
                    if (f21 < rectF.top) {
                        rectF.top = f21;
                    }
                    if (f21 > rectF.bottom) {
                        rectF.bottom = f21;
                    }
                }
                float f22 = rectF.left;
                float f23 = rectF.top;
                bVar2 = new SVG.b(f22, f23, rectF.right - f22, rectF.bottom - f23);
            }
        }
        float fFloor = fE + (((float) Math.floor((bVar2.f14721a - fE) / fE2)) * fE2);
        float fB = bVar2.b();
        float fC = bVar2.c();
        SVG.b bVar6 = new SVG.b(0.0f, 0.0f, fE2, f10);
        boolean zM0 = m0();
        for (float fFloor2 = f11 + (((float) Math.floor((bVar2.f14722b - f11) / f10)) * f10); fFloor2 < fC; fFloor2 += f10) {
            float f24 = fFloor;
            while (f24 < fB) {
                bVar6.f14721a = f24;
                bVar6.f14722b = fFloor2;
                S0();
                if (this.f14894d.f14930a.f14693w.booleanValue()) {
                    f12 = fFloor;
                } else {
                    f12 = fFloor;
                    O0(bVar6.f14721a, bVar6.f14722b, bVar6.f14723c, bVar6.f14724d);
                }
                SVG.b bVar7 = xVar.f14800p;
                if (bVar7 != null) {
                    this.f14891a.concat(o(bVar6, bVar7, preserveAspectRatio));
                } else {
                    Boolean bool2 = xVar.f14826r;
                    boolean z11 = bool2 == null || bool2.booleanValue();
                    this.f14891a.translate(f24, fFloor2);
                    if (!z11) {
                        Canvas canvas = this.f14891a;
                        SVG.b bVar8 = i0Var.f14763h;
                        canvas.scale(bVar8.f14723c, bVar8.f14724d);
                    }
                }
                Iterator<SVG.l0> it = xVar.f14747i.iterator();
                while (it.hasNext()) {
                    A0(it.next());
                }
                R0();
                f24 += fE2;
                fFloor = f12;
            }
        }
        if (zM0) {
            j0(xVar);
        }
        R0();
    }

    public final void L0(SVG.x0 x0Var) {
        y("TextPath render", new Object[0]);
        W0(this.f14894d, x0Var);
        if (A() && Y0()) {
            SVG.l0 l0VarU = x0Var.f14780a.u(x0Var.f14833o);
            if (l0VarU == null) {
                F("TextPath reference '%s' not found", x0Var.f14833o);
                return;
            }
            SVG.u uVar = (SVG.u) l0VarU;
            Path pathC = new d(uVar.f14818o).c();
            Matrix matrix = uVar.f14774n;
            if (matrix != null) {
                pathC.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathC, false);
            SVG.o oVar = x0Var.f14834p;
            float fD = oVar != null ? oVar.d(this, pathMeasure.getLength()) : 0.0f;
            SVG.Style.TextAnchor textAnchorO = O();
            if (textAnchorO != SVG.Style.TextAnchor.Start) {
                float fN = n(x0Var);
                if (textAnchorO == SVG.Style.TextAnchor.Middle) {
                    fN /= 2.0f;
                }
                fD -= fN;
            }
            r((SVG.i0) x0Var.c());
            boolean zM0 = m0();
            E(x0Var, new e(pathC, fD, 0.0f));
            if (zM0) {
                j0(x0Var);
            }
        }
    }

    public final h M(SVG.l0 l0Var) {
        h hVar = new h();
        V0(hVar, SVG.Style.a());
        return N(l0Var, hVar);
    }

    public final boolean M0() {
        return this.f14894d.f14930a.f14684n.floatValue() < 1.0f || this.f14894d.f14930a.H != null;
    }

    public final h N(SVG.l0 l0Var, h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (l0Var instanceof SVG.j0) {
                arrayList.add(0, (SVG.j0) l0Var);
            }
            Object obj = l0Var.f14781b;
            if (obj == null) {
                break;
            }
            l0Var = (SVG.l0) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0(hVar, (SVG.j0) it.next());
        }
        h hVar2 = this.f14894d;
        hVar.f14936g = hVar2.f14936g;
        hVar.f14935f = hVar2.f14935f;
        return hVar;
    }

    public final void N0() {
        this.f14894d = new h();
        this.f14895e = new Stack<>();
        V0(this.f14894d, SVG.Style.a());
        h hVar = this.f14894d;
        hVar.f14935f = null;
        hVar.f14937h = false;
        this.f14895e.push(new h(hVar));
        this.f14897g = new Stack<>();
        this.f14896f = new Stack<>();
    }

    public final SVG.Style.TextAnchor O() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.f14894d.f14930a;
        if (style.f14691u == SVG.Style.TextDirection.LTR || (textAnchor = style.f14692v) == SVG.Style.TextAnchor.Middle) {
            return style.f14692v;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    public final void O0(float f10, float f11, float f12, float f13) {
        float fE = f12 + f10;
        float f14 = f13 + f11;
        SVG.c cVar = this.f14894d.f14930a.f14694x;
        if (cVar != null) {
            f10 += cVar.f14733d.e(this);
            f11 += this.f14894d.f14930a.f14694x.f14730a.f(this);
            fE -= this.f14894d.f14930a.f14694x.f14731b.e(this);
            f14 -= this.f14894d.f14930a.f14694x.f14732c.f(this);
        }
        this.f14891a.clipRect(f10, f11, fE, f14);
    }

    public final Path.FillType P() {
        SVG.Style.FillRule fillRule = this.f14894d.f14930a.G;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void P0(h hVar, boolean z10, SVG.m0 m0Var) {
        int i10;
        SVG.Style style = hVar.f14930a;
        float fFloatValue = (z10 ? style.f14675e : style.f14677g).floatValue();
        if (m0Var instanceof SVG.f) {
            i10 = ((SVG.f) m0Var).f14746b;
        } else if (!(m0Var instanceof SVG.g)) {
            return;
        } else {
            i10 = hVar.f14930a.f14685o.f14746b;
        }
        int iX = x(i10, fFloatValue);
        if (z10) {
            hVar.f14933d.setColor(iX);
        } else {
            hVar.f14934e.setColor(iX);
        }
    }

    public float Q() {
        return this.f14894d.f14933d.getTextSize();
    }

    public final void Q0(boolean z10, SVG.b0 b0Var) {
        if (z10) {
            if (W(b0Var.f14771e, 2147483648L)) {
                h hVar = this.f14894d;
                SVG.Style style = hVar.f14930a;
                SVG.m0 m0Var = b0Var.f14771e.I;
                style.f14673c = m0Var;
                hVar.f14931b = m0Var != null;
            }
            if (W(b0Var.f14771e, 4294967296L)) {
                this.f14894d.f14930a.f14675e = b0Var.f14771e.J;
            }
            if (W(b0Var.f14771e, 6442450944L)) {
                h hVar2 = this.f14894d;
                P0(hVar2, z10, hVar2.f14930a.f14673c);
                return;
            }
            return;
        }
        if (W(b0Var.f14771e, 2147483648L)) {
            h hVar3 = this.f14894d;
            SVG.Style style2 = hVar3.f14930a;
            SVG.m0 m0Var2 = b0Var.f14771e.I;
            style2.f14676f = m0Var2;
            hVar3.f14932c = m0Var2 != null;
        }
        if (W(b0Var.f14771e, 4294967296L)) {
            this.f14894d.f14930a.f14677g = b0Var.f14771e.J;
        }
        if (W(b0Var.f14771e, 6442450944L)) {
            h hVar4 = this.f14894d;
            P0(hVar4, z10, hVar4.f14930a.f14676f);
        }
    }

    public float R() {
        return this.f14894d.f14933d.getTextSize() / 2.0f;
    }

    public final void R0() {
        this.f14891a.restore();
        this.f14894d = this.f14895e.pop();
    }

    public SVG.b S() {
        h hVar = this.f14894d;
        SVG.b bVar = hVar.f14936g;
        return bVar != null ? bVar : hVar.f14935f;
    }

    public final void S0() {
        this.f14891a.save();
        this.f14895e.push(this.f14894d);
        this.f14894d = new h(this.f14894d);
    }

    public float T() {
        return this.f14892b;
    }

    public final String T0(String str, boolean z10, boolean z11) {
        if (this.f14894d.f14937h) {
            return str.replaceAll("[\\n\\t]", Z7.f30794r);
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", Z7.f30794r);
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", Z7.f30794r);
    }

    public final Path.FillType U() {
        SVG.Style.FillRule fillRule = this.f14894d.f14930a.f14674d;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void U0(SVG.i0 i0Var) {
        if (i0Var.f14781b == null || i0Var.f14763h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f14897g.peek().invert(matrix)) {
            SVG.b bVar = i0Var.f14763h;
            SVG.b bVar2 = i0Var.f14763h;
            SVG.b bVar3 = i0Var.f14763h;
            float[] fArr = {bVar.f14721a, bVar.f14722b, bVar.b(), bVar2.f14722b, bVar2.b(), i0Var.f14763h.c(), bVar3.f14721a, bVar3.c()};
            matrix.preConcat(this.f14891a.getMatrix());
            matrix.mapPoints(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
            RectF rectF = new RectF(f10, f11, f10, f11);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f12 = fArr[i10];
                if (f12 < rectF.left) {
                    rectF.left = f12;
                }
                if (f12 > rectF.right) {
                    rectF.right = f12;
                }
                float f13 = fArr[i10 + 1];
                if (f13 < rectF.top) {
                    rectF.top = f13;
                }
                if (f13 > rectF.bottom) {
                    rectF.bottom = f13;
                }
            }
            SVG.i0 i0Var2 = (SVG.i0) this.f14896f.peek();
            SVG.b bVar4 = i0Var2.f14763h;
            if (bVar4 == null) {
                i0Var2.f14763h = SVG.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.e(SVG.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    public final void V0(h hVar, SVG.Style style) {
        if (W(style, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            hVar.f14930a.f14685o = style.f14685o;
        }
        if (W(style, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            hVar.f14930a.f14684n = style.f14684n;
        }
        if (W(style, 1L)) {
            hVar.f14930a.f14673c = style.f14673c;
            SVG.m0 m0Var = style.f14673c;
            hVar.f14931b = (m0Var == null || m0Var == SVG.f.f14745d) ? false : true;
        }
        if (W(style, 4L)) {
            hVar.f14930a.f14675e = style.f14675e;
        }
        if (W(style, 6149L)) {
            P0(hVar, true, hVar.f14930a.f14673c);
        }
        if (W(style, 2L)) {
            hVar.f14930a.f14674d = style.f14674d;
        }
        if (W(style, 8L)) {
            hVar.f14930a.f14676f = style.f14676f;
            SVG.m0 m0Var2 = style.f14676f;
            hVar.f14932c = (m0Var2 == null || m0Var2 == SVG.f.f14745d) ? false : true;
        }
        if (W(style, 16L)) {
            hVar.f14930a.f14677g = style.f14677g;
        }
        if (W(style, 6168L)) {
            P0(hVar, false, hVar.f14930a.f14676f);
        }
        if (W(style, 34359738368L)) {
            hVar.f14930a.M = style.M;
        }
        if (W(style, 32L)) {
            SVG.Style style2 = hVar.f14930a;
            SVG.o oVar = style.f14678h;
            style2.f14678h = oVar;
            hVar.f14934e.setStrokeWidth(oVar.c(this));
        }
        if (W(style, 64L)) {
            hVar.f14930a.f14679i = style.f14679i;
            int i10 = a.f14900b[style.f14679i.ordinal()];
            if (i10 == 1) {
                hVar.f14934e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                hVar.f14934e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                hVar.f14934e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(style, 128L)) {
            hVar.f14930a.f14680j = style.f14680j;
            int i11 = a.f14901c[style.f14680j.ordinal()];
            if (i11 == 1) {
                hVar.f14934e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                hVar.f14934e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                hVar.f14934e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(style, 256L)) {
            hVar.f14930a.f14681k = style.f14681k;
            hVar.f14934e.setStrokeMiter(style.f14681k.floatValue());
        }
        if (W(style, 512L)) {
            hVar.f14930a.f14682l = style.f14682l;
        }
        if (W(style, 1024L)) {
            hVar.f14930a.f14683m = style.f14683m;
        }
        Typeface typefaceT = null;
        if (W(style, 1536L)) {
            SVG.o[] oVarArr = hVar.f14930a.f14682l;
            if (oVarArr == null) {
                hVar.f14934e.setPathEffect(null);
            } else {
                int length = oVarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fC = hVar.f14930a.f14682l[i13 % length].c(this);
                    fArr[i13] = fC;
                    f10 += fC;
                }
                if (f10 == 0.0f) {
                    hVar.f14934e.setPathEffect(null);
                } else {
                    float fC2 = hVar.f14930a.f14683m.c(this);
                    if (fC2 < 0.0f) {
                        fC2 = (fC2 % f10) + f10;
                    }
                    hVar.f14934e.setPathEffect(new DashPathEffect(fArr, fC2));
                }
            }
        }
        if (W(style, 16384L)) {
            float fQ = Q();
            hVar.f14930a.f14687q = style.f14687q;
            hVar.f14933d.setTextSize(style.f14687q.d(this, fQ));
            hVar.f14934e.setTextSize(style.f14687q.d(this, fQ));
        }
        if (W(style, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            hVar.f14930a.f14686p = style.f14686p;
        }
        if (W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (style.f14688r.intValue() == -1 && hVar.f14930a.f14688r.intValue() > 100) {
                SVG.Style style3 = hVar.f14930a;
                style3.f14688r = Integer.valueOf(style3.f14688r.intValue() - 100);
            } else if (style.f14688r.intValue() != 1 || hVar.f14930a.f14688r.intValue() >= 900) {
                hVar.f14930a.f14688r = style.f14688r;
            } else {
                SVG.Style style4 = hVar.f14930a;
                style4.f14688r = Integer.valueOf(style4.f14688r.intValue() + 100);
            }
        }
        if (W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            hVar.f14930a.f14689s = style.f14689s;
        }
        if (W(style, 106496L)) {
            if (hVar.f14930a.f14686p != null && this.f14893c != null) {
                SVG.k();
                for (String str : hVar.f14930a.f14686p) {
                    SVG.Style style5 = hVar.f14930a;
                    typefaceT = t(str, style5.f14688r, style5.f14689s);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                SVG.Style style6 = hVar.f14930a;
                typefaceT = t("serif", style6.f14688r, style6.f14689s);
            }
            hVar.f14933d.setTypeface(typefaceT);
            hVar.f14934e.setTypeface(typefaceT);
        }
        if (W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            hVar.f14930a.f14690t = style.f14690t;
            Paint paint = hVar.f14933d;
            SVG.Style.TextDecoration textDecoration = style.f14690t;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = hVar.f14933d;
            SVG.Style.TextDecoration textDecoration3 = style.f14690t;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            hVar.f14934e.setStrikeThruText(style.f14690t == textDecoration2);
            hVar.f14934e.setUnderlineText(style.f14690t == textDecoration4);
        }
        if (W(style, 68719476736L)) {
            hVar.f14930a.f14691u = style.f14691u;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            hVar.f14930a.f14692v = style.f14692v;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            hVar.f14930a.f14693w = style.f14693w;
        }
        if (W(style, 2097152L)) {
            hVar.f14930a.f14695y = style.f14695y;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            hVar.f14930a.f14696z = style.f14696z;
        }
        if (W(style, 8388608L)) {
            hVar.f14930a.A = style.A;
        }
        if (W(style, 16777216L)) {
            hVar.f14930a.B = style.B;
        }
        if (W(style, 33554432L)) {
            hVar.f14930a.C = style.C;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            hVar.f14930a.f14694x = style.f14694x;
        }
        if (W(style, 268435456L)) {
            hVar.f14930a.F = style.F;
        }
        if (W(style, 536870912L)) {
            hVar.f14930a.G = style.G;
        }
        if (W(style, 1073741824L)) {
            hVar.f14930a.H = style.H;
        }
        if (W(style, 67108864L)) {
            hVar.f14930a.D = style.D;
        }
        if (W(style, 134217728L)) {
            hVar.f14930a.E = style.E;
        }
        if (W(style, 8589934592L)) {
            hVar.f14930a.K = style.K;
        }
        if (W(style, 17179869184L)) {
            hVar.f14930a.L = style.L;
        }
        if (W(style, 137438953472L)) {
            hVar.f14930a.N = style.N;
        }
    }

    public final boolean W(SVG.Style style, long j10) {
        return (style.f14672b & j10) != 0;
    }

    public final void W0(h hVar, SVG.j0 j0Var) {
        hVar.f14930a.b(j0Var.f14781b == null);
        SVG.Style style = j0Var.f14771e;
        if (style != null) {
            V0(hVar, style);
        }
        if (this.f14893c.q()) {
            for (CSSParser.l lVar : this.f14893c.d()) {
                if (CSSParser.l(this.f14898h, lVar.f14640a, j0Var)) {
                    V0(hVar, lVar.f14641b);
                }
            }
        }
        SVG.Style style2 = j0Var.f14772f;
        if (style2 != null) {
            V0(hVar, style2);
        }
    }

    public final void X(boolean z10, SVG.b bVar, SVG.k0 k0Var) {
        float f10;
        float fD;
        float f11;
        float f12;
        String str = k0Var.f14768l;
        if (str != null) {
            H(k0Var, str);
        }
        Boolean bool = k0Var.f14765i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        h hVar = this.f14894d;
        Paint paint = z10 ? hVar.f14933d : hVar.f14934e;
        if (z11) {
            SVG.b bVarS = S();
            SVG.o oVar = k0Var.f14775m;
            float fE = oVar != null ? oVar.e(this) : 0.0f;
            SVG.o oVar2 = k0Var.f14776n;
            float f13 = oVar2 != null ? oVar2.f(this) : 0.0f;
            SVG.o oVar3 = k0Var.f14777o;
            float fE2 = oVar3 != null ? oVar3.e(this) : bVarS.f14723c;
            SVG.o oVar4 = k0Var.f14778p;
            f12 = fE2;
            f10 = fE;
            f11 = f13;
            fD = oVar4 != null ? oVar4.f(this) : 0.0f;
        } else {
            SVG.o oVar5 = k0Var.f14775m;
            float fD2 = oVar5 != null ? oVar5.d(this, 1.0f) : 0.0f;
            SVG.o oVar6 = k0Var.f14776n;
            float fD3 = oVar6 != null ? oVar6.d(this, 1.0f) : 0.0f;
            SVG.o oVar7 = k0Var.f14777o;
            float fD4 = oVar7 != null ? oVar7.d(this, 1.0f) : 1.0f;
            SVG.o oVar8 = k0Var.f14778p;
            f10 = fD2;
            fD = oVar8 != null ? oVar8.d(this, 1.0f) : 0.0f;
            f11 = fD3;
            f12 = fD4;
        }
        S0();
        this.f14894d = M(k0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f14721a, bVar.f14722b);
            matrix.preScale(bVar.f14723c, bVar.f14724d);
        }
        Matrix matrix2 = k0Var.f14766j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = k0Var.f14764h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f14894d.f14931b = false;
                return;
            } else {
                this.f14894d.f14932c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        float f14 = -1.0f;
        Iterator<SVG.l0> it = k0Var.f14764h.iterator();
        while (it.hasNext()) {
            SVG.c0 c0Var = (SVG.c0) it.next();
            Float f15 = c0Var.f14734h;
            float fFloatValue = f15 != null ? f15.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f14) {
                fArr[i10] = fFloatValue;
                f14 = fFloatValue;
            } else {
                fArr[i10] = f14;
            }
            S0();
            W0(this.f14894d, c0Var);
            SVG.Style style = this.f14894d.f14930a;
            SVG.f fVar = (SVG.f) style.D;
            if (fVar == null) {
                fVar = SVG.f.f14744c;
            }
            iArr[i10] = x(fVar.f14746b, style.E.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f12 && f11 == fD) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = k0Var.f14767k;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f11, f12, fD, iArr, fArr, tileMode);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f14894d.f14930a.f14675e.floatValue()));
    }

    public final void X0() {
        int iX;
        SVG.Style style = this.f14894d.f14930a;
        SVG.m0 m0Var = style.K;
        if (m0Var instanceof SVG.f) {
            iX = ((SVG.f) m0Var).f14746b;
        } else if (!(m0Var instanceof SVG.g)) {
            return;
        } else {
            iX = style.f14685o.f14746b;
        }
        Float f10 = style.L;
        if (f10 != null) {
            iX = x(iX, f10.floatValue());
        }
        this.f14891a.drawColor(iX);
    }

    public final Path Y(SVG.d dVar) {
        SVG.o oVar = dVar.f14735o;
        float fE = oVar != null ? oVar.e(this) : 0.0f;
        SVG.o oVar2 = dVar.f14736p;
        float f10 = oVar2 != null ? oVar2.f(this) : 0.0f;
        float fC = dVar.f14737q.c(this);
        float f11 = fE - fC;
        float f12 = f10 - fC;
        float f13 = fE + fC;
        float f14 = f10 + fC;
        if (dVar.f14763h == null) {
            float f15 = 2.0f * fC;
            dVar.f14763h = new SVG.b(f11, f12, f15, f15);
        }
        float f16 = 0.5522848f * fC;
        Path path = new Path();
        path.moveTo(fE, f12);
        float f17 = fE + f16;
        float f18 = f10 - f16;
        path.cubicTo(f17, f12, f13, f18, f13, f10);
        float f19 = f10 + f16;
        path.cubicTo(f13, f19, f17, f14, fE, f14);
        float f20 = fE - f16;
        path.cubicTo(f20, f14, f11, f19, f11, f10);
        path.cubicTo(f11, f18, f20, f12, fE, f12);
        path.close();
        return path;
    }

    public final boolean Y0() {
        Boolean bool = this.f14894d.f14930a.C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path Z(SVG.i iVar) {
        SVG.o oVar = iVar.f14759o;
        float fE = oVar != null ? oVar.e(this) : 0.0f;
        SVG.o oVar2 = iVar.f14760p;
        float f10 = oVar2 != null ? oVar2.f(this) : 0.0f;
        float fE2 = iVar.f14761q.e(this);
        float f11 = iVar.f14762r.f(this);
        float f12 = fE - fE2;
        float f13 = f10 - f11;
        float f14 = fE + fE2;
        float f15 = f10 + f11;
        if (iVar.f14763h == null) {
            iVar.f14763h = new SVG.b(f12, f13, fE2 * 2.0f, 2.0f * f11);
        }
        float f16 = fE2 * 0.5522848f;
        float f17 = 0.5522848f * f11;
        Path path = new Path();
        path.moveTo(fE, f13);
        float f18 = fE + f16;
        float f19 = f10 - f17;
        path.cubicTo(f18, f13, f14, f19, f14, f10);
        float f20 = f17 + f10;
        path.cubicTo(f14, f20, f18, f15, fE, f15);
        float f21 = fE - f16;
        path.cubicTo(f21, f15, f12, f20, f12, f10);
        path.cubicTo(f12, f19, f21, f13, fE, f13);
        path.close();
        return path;
    }

    public final Path a0(SVG.p pVar) {
        SVG.o oVar = pVar.f14796o;
        float fE = oVar == null ? 0.0f : oVar.e(this);
        SVG.o oVar2 = pVar.f14797p;
        float f10 = oVar2 == null ? 0.0f : oVar2.f(this);
        SVG.o oVar3 = pVar.f14798q;
        float fE2 = oVar3 == null ? 0.0f : oVar3.e(this);
        SVG.o oVar4 = pVar.f14799r;
        float f11 = oVar4 != null ? oVar4.f(this) : 0.0f;
        if (pVar.f14763h == null) {
            pVar.f14763h = new SVG.b(Math.min(fE, fE2), Math.min(f10, f11), Math.abs(fE2 - fE), Math.abs(f11 - f10));
        }
        Path path = new Path();
        path.moveTo(fE, f10);
        path.lineTo(fE2, f11);
        return path;
    }

    public final Path b0(SVG.y yVar) {
        Path path = new Path();
        float[] fArr = yVar.f14836o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = yVar.f14836o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (yVar instanceof SVG.z) {
            path.close();
        }
        if (yVar.f14763h == null) {
            yVar.f14763h = m(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Path c0(com.caverock.androidsvg.SVG.a0 r24) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.b.c0(com.caverock.androidsvg.SVG$a0):android.graphics.Path");
    }

    public final Path d0(SVG.u0 u0Var) {
        List<SVG.o> list = u0Var.f14837o;
        float f10 = 0.0f;
        float fE = (list == null || list.size() == 0) ? 0.0f : u0Var.f14837o.get(0).e(this);
        List<SVG.o> list2 = u0Var.f14838p;
        float f11 = (list2 == null || list2.size() == 0) ? 0.0f : u0Var.f14838p.get(0).f(this);
        List<SVG.o> list3 = u0Var.f14839q;
        float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : u0Var.f14839q.get(0).e(this);
        List<SVG.o> list4 = u0Var.f14840r;
        if (list4 != null && list4.size() != 0) {
            f10 = u0Var.f14840r.get(0).f(this);
        }
        if (this.f14894d.f14930a.f14692v != SVG.Style.TextAnchor.Start) {
            float fN = n(u0Var);
            if (this.f14894d.f14930a.f14692v == SVG.Style.TextAnchor.Middle) {
                fN /= 2.0f;
            }
            fE -= fN;
        }
        if (u0Var.f14763h == null) {
            i iVar = new i(fE, f11);
            E(u0Var, iVar);
            RectF rectF = iVar.f14941d;
            u0Var.f14763h = new SVG.b(rectF.left, rectF.top, rectF.width(), iVar.f14941d.height());
        }
        Path path = new Path();
        E(u0Var, new g(fE + fE2, f11 + f10, path));
        return path;
    }

    public final void e0(boolean z10, SVG.b bVar, SVG.o0 o0Var) {
        float f10;
        float fD;
        float f11;
        String str = o0Var.f14768l;
        if (str != null) {
            H(o0Var, str);
        }
        Boolean bool = o0Var.f14765i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        h hVar = this.f14894d;
        Paint paint = z10 ? hVar.f14933d : hVar.f14934e;
        if (z11) {
            SVG.o oVar = new SVG.o(50.0f, SVG.Unit.percent);
            SVG.o oVar2 = o0Var.f14791m;
            float fE = oVar2 != null ? oVar2.e(this) : oVar.e(this);
            SVG.o oVar3 = o0Var.f14792n;
            float f12 = oVar3 != null ? oVar3.f(this) : oVar.f(this);
            SVG.o oVar4 = o0Var.f14793o;
            fD = oVar4 != null ? oVar4.c(this) : oVar.c(this);
            f10 = fE;
            f11 = f12;
        } else {
            SVG.o oVar5 = o0Var.f14791m;
            float fD2 = oVar5 != null ? oVar5.d(this, 1.0f) : 0.5f;
            SVG.o oVar6 = o0Var.f14792n;
            float fD3 = oVar6 != null ? oVar6.d(this, 1.0f) : 0.5f;
            SVG.o oVar7 = o0Var.f14793o;
            f10 = fD2;
            fD = oVar7 != null ? oVar7.d(this, 1.0f) : 0.5f;
            f11 = fD3;
        }
        S0();
        this.f14894d = M(o0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f14721a, bVar.f14722b);
            matrix.preScale(bVar.f14723c, bVar.f14724d);
        }
        Matrix matrix2 = o0Var.f14766j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = o0Var.f14764h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f14894d.f14931b = false;
                return;
            } else {
                this.f14894d.f14932c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        float f13 = -1.0f;
        Iterator<SVG.l0> it = o0Var.f14764h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SVG.c0 c0Var = (SVG.c0) it.next();
            Float f14 = c0Var.f14734h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f14894d, c0Var);
            SVG.Style style = this.f14894d.f14930a;
            SVG.f fVar = (SVG.f) style.D;
            if (fVar == null) {
                fVar = SVG.f.f14744c;
            }
            iArr[i10] = x(fVar.f14746b, style.E.floatValue());
            i10++;
            R0();
        }
        if (fD == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = o0Var.f14767k;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fD, iArr, fArr, tileMode);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f14894d.f14930a.f14675e.floatValue()));
    }

    public final SVG.b f0(SVG.o oVar, SVG.o oVar2, SVG.o oVar3, SVG.o oVar4) {
        float fE = oVar != null ? oVar.e(this) : 0.0f;
        float f10 = oVar2 != null ? oVar2.f(this) : 0.0f;
        SVG.b bVarS = S();
        return new SVG.b(fE, f10, oVar3 != null ? oVar3.e(this) : bVarS.f14723c, oVar4 != null ? oVar4.f(this) : bVarS.f14724d);
    }

    @TargetApi(19)
    public final Path g0(SVG.i0 i0Var, boolean z10) {
        Path pathD0;
        Path pathJ;
        this.f14895e.push(this.f14894d);
        h hVar = new h(this.f14894d);
        this.f14894d = hVar;
        W0(hVar, i0Var);
        if (!A() || !Y0()) {
            this.f14894d = this.f14895e.pop();
            return null;
        }
        if (i0Var instanceof SVG.b1) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.b1 b1Var = (SVG.b1) i0Var;
            SVG.l0 l0VarU = i0Var.f14780a.u(b1Var.f14725p);
            if (l0VarU == null) {
                F("Use reference '%s' not found", b1Var.f14725p);
                this.f14894d = this.f14895e.pop();
                return null;
            }
            if (!(l0VarU instanceof SVG.i0)) {
                this.f14894d = this.f14895e.pop();
                return null;
            }
            pathD0 = g0((SVG.i0) l0VarU, false);
            if (pathD0 == null) {
                return null;
            }
            if (b1Var.f14763h == null) {
                b1Var.f14763h = m(pathD0);
            }
            Matrix matrix = b1Var.f14779o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (i0Var instanceof SVG.k) {
            SVG.k kVar = (SVG.k) i0Var;
            if (i0Var instanceof SVG.u) {
                pathD0 = new d(((SVG.u) i0Var).f14818o).c();
                if (i0Var.f14763h == null) {
                    i0Var.f14763h = m(pathD0);
                }
            } else {
                pathD0 = i0Var instanceof SVG.a0 ? c0((SVG.a0) i0Var) : i0Var instanceof SVG.d ? Y((SVG.d) i0Var) : i0Var instanceof SVG.i ? Z((SVG.i) i0Var) : i0Var instanceof SVG.y ? b0((SVG.y) i0Var) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (kVar.f14763h == null) {
                kVar.f14763h = m(pathD0);
            }
            Matrix matrix2 = kVar.f14774n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(i0Var instanceof SVG.u0)) {
                F("Invalid %s element found in clipPath definition", i0Var.n());
                return null;
            }
            SVG.u0 u0Var = (SVG.u0) i0Var;
            pathD0 = d0(u0Var);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = u0Var.f14820s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.f14894d.f14930a.F != null && (pathJ = j(i0Var, i0Var.f14763h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.f14894d = this.f14895e.pop();
        return pathD0;
    }

    public final void h0() {
        this.f14896f.pop();
        this.f14897g.pop();
    }

    public final void i0(SVG.h0 h0Var) {
        this.f14896f.push(h0Var);
        this.f14897g.push(this.f14891a.getMatrix());
    }

    @TargetApi(19)
    public final Path j(SVG.i0 i0Var, SVG.b bVar) {
        Path pathG0;
        SVG.l0 l0VarU = i0Var.f14780a.u(this.f14894d.f14930a.F);
        if (l0VarU == null) {
            F("ClipPath reference '%s' not found", this.f14894d.f14930a.F);
            return null;
        }
        SVG.e eVar = (SVG.e) l0VarU;
        this.f14895e.push(this.f14894d);
        this.f14894d = M(eVar);
        Boolean bool = eVar.f14743p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(bVar.f14721a, bVar.f14722b);
            matrix.preScale(bVar.f14723c, bVar.f14724d);
        }
        Matrix matrix2 = eVar.f14779o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.l0 l0Var : eVar.f14747i) {
            if ((l0Var instanceof SVG.i0) && (pathG0 = g0((SVG.i0) l0Var, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.f14894d.f14930a.F != null) {
            if (eVar.f14763h == null) {
                eVar.f14763h = m(path);
            }
            Path pathJ = j(eVar, eVar.f14763h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f14894d = this.f14895e.pop();
        return path;
    }

    public final void j0(SVG.i0 i0Var) {
        k0(i0Var, i0Var.f14763h);
    }

    public final List<c> k(SVG.p pVar) {
        SVG.o oVar = pVar.f14796o;
        float fE = oVar != null ? oVar.e(this) : 0.0f;
        SVG.o oVar2 = pVar.f14797p;
        float f10 = oVar2 != null ? oVar2.f(this) : 0.0f;
        SVG.o oVar3 = pVar.f14798q;
        float fE2 = oVar3 != null ? oVar3.e(this) : 0.0f;
        SVG.o oVar4 = pVar.f14799r;
        float f11 = oVar4 != null ? oVar4.f(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f12 = fE2 - fE;
        float f13 = f11 - f10;
        arrayList.add(new c(fE, f10, f12, f13));
        arrayList.add(new c(fE2, f11, f12, f13));
        return arrayList;
    }

    public final void k0(SVG.i0 i0Var, SVG.b bVar) {
        if (this.f14894d.f14930a.H != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f14891a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f14891a.saveLayer(null, paint2, 31);
            SVG.r rVar = (SVG.r) this.f14893c.u(this.f14894d.f14930a.H);
            J0(rVar, i0Var, bVar);
            this.f14891a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f14891a.saveLayer(null, paint3, 31);
            J0(rVar, i0Var, bVar);
            this.f14891a.restore();
            this.f14891a.restore();
        }
        R0();
    }

    public final List<c> l(SVG.y yVar) {
        int length = yVar.f14836o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = yVar.f14836o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = yVar.f14836o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f14911a, f13 - cVar.f14912b);
            f11 = f13;
            f10 = f12;
        }
        if (yVar instanceof SVG.z) {
            float[] fArr3 = yVar.f14836o;
            float f14 = fArr3[0];
            if (f10 != f14) {
                float f15 = fArr3[1];
                if (f11 != f15) {
                    cVar.a(f14, f15);
                    arrayList.add(cVar);
                    c cVar2 = new c(f14, f15, f14 - cVar.f14911a, f15 - cVar.f14912b);
                    cVar2.b((c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
        } else {
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final void l0(SVG.l0 l0Var, j jVar) {
        float f10;
        float f11;
        float fE;
        SVG.Style.TextAnchor textAnchorO;
        if (jVar.a((SVG.w0) l0Var)) {
            if (l0Var instanceof SVG.x0) {
                S0();
                L0((SVG.x0) l0Var);
                R0();
                return;
            }
            if (!(l0Var instanceof SVG.t0)) {
                if (l0Var instanceof SVG.s0) {
                    S0();
                    SVG.s0 s0Var = (SVG.s0) l0Var;
                    W0(this.f14894d, s0Var);
                    if (A()) {
                        r((SVG.i0) s0Var.c());
                        SVG.l0 l0VarU = l0Var.f14780a.u(s0Var.f14813o);
                        if (l0VarU == null || !(l0VarU instanceof SVG.w0)) {
                            F("Tref reference '%s' not found", s0Var.f14813o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            G((SVG.w0) l0VarU, sb2);
                            if (sb2.length() > 0) {
                                jVar.b(sb2.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            SVG.t0 t0Var = (SVG.t0) l0Var;
            W0(this.f14894d, t0Var);
            if (A()) {
                List<SVG.o> list = t0Var.f14837o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float f12 = 0.0f;
                if (z11) {
                    float fE2 = !z10 ? ((f) jVar).f14923b : t0Var.f14837o.get(0).e(this);
                    List<SVG.o> list2 = t0Var.f14838p;
                    f11 = (list2 == null || list2.size() == 0) ? ((f) jVar).f14924c : t0Var.f14838p.get(0).f(this);
                    List<SVG.o> list3 = t0Var.f14839q;
                    fE = (list3 == null || list3.size() == 0) ? 0.0f : t0Var.f14839q.get(0).e(this);
                    List<SVG.o> list4 = t0Var.f14840r;
                    if (list4 != null && list4.size() != 0) {
                        f12 = t0Var.f14840r.get(0).f(this);
                    }
                    f10 = f12;
                    f12 = fE2;
                } else {
                    f10 = 0.0f;
                    f11 = 0.0f;
                    fE = 0.0f;
                }
                if (z10 && (textAnchorO = O()) != SVG.Style.TextAnchor.Start) {
                    float fN = n(t0Var);
                    if (textAnchorO == SVG.Style.TextAnchor.Middle) {
                        fN /= 2.0f;
                    }
                    f12 -= fN;
                }
                r((SVG.i0) t0Var.c());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.f14923b = f12 + fE;
                    fVar.f14924c = f11 + f10;
                }
                boolean zM0 = m0();
                E(t0Var, jVar);
                if (zM0) {
                    j0(t0Var);
                }
            }
            R0();
        }
    }

    public final SVG.b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final boolean m0() {
        SVG.l0 l0VarU;
        if (!M0()) {
            return false;
        }
        this.f14891a.saveLayerAlpha(null, w(this.f14894d.f14930a.f14684n.floatValue()), 31);
        this.f14895e.push(this.f14894d);
        h hVar = new h(this.f14894d);
        this.f14894d = hVar;
        String str = hVar.f14930a.H;
        if (str != null && ((l0VarU = this.f14893c.u(str)) == null || !(l0VarU instanceof SVG.r))) {
            F("Mask reference '%s' not found", this.f14894d.f14930a.H);
            this.f14894d.f14930a.H = null;
        }
        return true;
    }

    public final float n(SVG.w0 w0Var) {
        k kVar = new k(this, null);
        E(w0Var, kVar);
        return kVar.f14944b;
    }

    public final c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.f14913c, cVar2.f14914d, cVar2.f14911a - cVar.f14911a, cVar2.f14912b - cVar.f14912b);
        if (fD == 0.0f) {
            fD = D(cVar2.f14913c, cVar2.f14914d, cVar3.f14911a - cVar2.f14911a, cVar3.f14912b - cVar2.f14912b);
        }
        if (fD > 0.0f) {
            return cVar2;
        }
        if (fD == 0.0f && (cVar2.f14913c > 0.0f || cVar2.f14914d >= 0.0f)) {
            return cVar2;
        }
        cVar2.f14913c = -cVar2.f14913c;
        cVar2.f14914d = -cVar2.f14914d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix o(com.caverock.androidsvg.SVG.b r10, com.caverock.androidsvg.SVG.b r11, com.caverock.androidsvg.PreserveAspectRatio r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9b
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9b
        Lf:
            float r1 = r10.f14723c
            float r2 = r11.f14723c
            float r1 = r1 / r2
            float r2 = r10.f14724d
            float r3 = r11.f14724d
            float r2 = r2 / r3
            float r3 = r11.f14721a
            float r3 = -r3
            float r4 = r11.f14722b
            float r4 = -r4
            com.caverock.androidsvg.PreserveAspectRatio r5 = com.caverock.androidsvg.PreserveAspectRatio.f14652d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f14721a
            float r10 = r10.f14722b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r5 = r12.b()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r6 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f14723c
            float r2 = r2 / r1
            float r5 = r10.f14724d
            float r5 = r5 / r1
            int[] r6 = com.caverock.androidsvg.b.a.f14899a
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L62;
                case 2: goto L62;
                case 3: goto L62;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L67
        L5e:
            float r7 = r11.f14723c
            float r7 = r7 - r2
            goto L66
        L62:
            float r7 = r11.f14723c
            float r7 = r7 - r2
            float r7 = r7 / r8
        L66:
            float r3 = r3 - r7
        L67:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L89
            r2 = 3
            if (r12 == r2) goto L85
            r2 = 5
            if (r12 == r2) goto L89
            r2 = 6
            if (r12 == r2) goto L85
            r2 = 7
            if (r12 == r2) goto L89
            r2 = 8
            if (r12 == r2) goto L85
            goto L8e
        L85:
            float r11 = r11.f14724d
            float r11 = r11 - r5
            goto L8d
        L89:
            float r11 = r11.f14724d
            float r11 = r11 - r5
            float r11 = r11 / r8
        L8d:
            float r4 = r4 - r11
        L8e:
            float r11 = r10.f14721a
            float r10 = r10.f14722b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.b.o(com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    public final void o0(SVG.d dVar) {
        y("Circle render", new Object[0]);
        SVG.o oVar = dVar.f14737q;
        if (oVar == null || oVar.i()) {
            return;
        }
        W0(this.f14894d, dVar);
        if (A() && Y0()) {
            Matrix matrix = dVar.f14774n;
            if (matrix != null) {
                this.f14891a.concat(matrix);
            }
            Path pathY = Y(dVar);
            U0(dVar);
            r(dVar);
            p(dVar);
            boolean zM0 = m0();
            if (this.f14894d.f14931b) {
                B(dVar, pathY);
            }
            if (this.f14894d.f14932c) {
                C(pathY);
            }
            if (zM0) {
                j0(dVar);
            }
        }
    }

    public final void p(SVG.i0 i0Var) {
        q(i0Var, i0Var.f14763h);
    }

    public final void p0(SVG.i iVar) {
        y("Ellipse render", new Object[0]);
        SVG.o oVar = iVar.f14761q;
        if (oVar == null || iVar.f14762r == null || oVar.i() || iVar.f14762r.i()) {
            return;
        }
        W0(this.f14894d, iVar);
        if (A() && Y0()) {
            Matrix matrix = iVar.f14774n;
            if (matrix != null) {
                this.f14891a.concat(matrix);
            }
            Path pathZ = Z(iVar);
            U0(iVar);
            r(iVar);
            p(iVar);
            boolean zM0 = m0();
            if (this.f14894d.f14931b) {
                B(iVar, pathZ);
            }
            if (this.f14894d.f14932c) {
                C(pathZ);
            }
            if (zM0) {
                j0(iVar);
            }
        }
    }

    public final void q(SVG.i0 i0Var, SVG.b bVar) {
        Path pathJ;
        if (this.f14894d.f14930a.F == null || (pathJ = j(i0Var, bVar)) == null) {
            return;
        }
        this.f14891a.clipPath(pathJ);
    }

    public final void q0(SVG.l lVar) {
        y("Group render", new Object[0]);
        W0(this.f14894d, lVar);
        if (A()) {
            Matrix matrix = lVar.f14779o;
            if (matrix != null) {
                this.f14891a.concat(matrix);
            }
            p(lVar);
            boolean zM0 = m0();
            F0(lVar, true);
            if (zM0) {
                j0(lVar);
            }
            U0(lVar);
        }
    }

    public final void r(SVG.i0 i0Var) {
        SVG.m0 m0Var = this.f14894d.f14930a.f14673c;
        if (m0Var instanceof SVG.t) {
            z(true, i0Var.f14763h, (SVG.t) m0Var);
        }
        SVG.m0 m0Var2 = this.f14894d.f14930a.f14676f;
        if (m0Var2 instanceof SVG.t) {
            z(false, i0Var.f14763h, (SVG.t) m0Var2);
        }
    }

    public final void r0(SVG.n nVar) {
        SVG.o oVar;
        String str;
        y("Image render", new Object[0]);
        SVG.o oVar2 = nVar.f14785s;
        if (oVar2 == null || oVar2.i() || (oVar = nVar.f14786t) == null || oVar.i() || (str = nVar.f14782p) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = nVar.f14788o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f14653e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            SVG.k();
            return;
        }
        SVG.b bVar = new SVG.b(0.0f, 0.0f, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.f14894d, nVar);
        if (A() && Y0()) {
            Matrix matrix = nVar.f14787u;
            if (matrix != null) {
                this.f14891a.concat(matrix);
            }
            SVG.o oVar3 = nVar.f14783q;
            float fE = oVar3 != null ? oVar3.e(this) : 0.0f;
            SVG.o oVar4 = nVar.f14784r;
            this.f14894d.f14935f = new SVG.b(fE, oVar4 != null ? oVar4.f(this) : 0.0f, nVar.f14785s.e(this), nVar.f14786t.e(this));
            if (!this.f14894d.f14930a.f14693w.booleanValue()) {
                SVG.b bVar2 = this.f14894d.f14935f;
                O0(bVar2.f14721a, bVar2.f14722b, bVar2.f14723c, bVar2.f14724d);
            }
            nVar.f14763h = this.f14894d.f14935f;
            U0(nVar);
            p(nVar);
            boolean zM0 = m0();
            X0();
            this.f14891a.save();
            this.f14891a.concat(o(this.f14894d.f14935f, bVar, preserveAspectRatio));
            this.f14891a.drawBitmap(bitmapS, 0.0f, 0.0f, new Paint(this.f14894d.f14930a.N != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.f14891a.restore();
            if (zM0) {
                j0(nVar);
            }
        }
    }

    public final Bitmap s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    public final void s0(SVG.p pVar) {
        y("Line render", new Object[0]);
        W0(this.f14894d, pVar);
        if (A() && Y0() && this.f14894d.f14932c) {
            Matrix matrix = pVar.f14774n;
            if (matrix != null) {
                this.f14891a.concat(matrix);
            }
            Path pathA0 = a0(pVar);
            U0(pVar);
            r(pVar);
            p(pVar);
            boolean zM0 = m0();
            C(pathA0);
            I0(pVar);
            if (zM0) {
                j0(pVar);
            }
        }
    }

    public final Typeface t(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        boolean z10 = fontStyle == SVG.Style.FontStyle.Italic;
        int i10 = num.intValue() > 500 ? z10 ? 3 : 1 : z10 ? 2 : 0;
        str.hashCode();
        switch (str) {
        }
        return Typeface.create(Typeface.SANS_SERIF, i10);
    }

    public final void t0(SVG.u uVar) {
        y("Path render", new Object[0]);
        if (uVar.f14818o == null) {
            return;
        }
        W0(this.f14894d, uVar);
        if (A() && Y0()) {
            h hVar = this.f14894d;
            if (hVar.f14932c || hVar.f14931b) {
                Matrix matrix = uVar.f14774n;
                if (matrix != null) {
                    this.f14891a.concat(matrix);
                }
                Path pathC = new d(uVar.f14818o).c();
                if (uVar.f14763h == null) {
                    uVar.f14763h = m(pathC);
                }
                U0(uVar);
                r(uVar);
                p(uVar);
                boolean zM0 = m0();
                if (this.f14894d.f14931b) {
                    pathC.setFillType(U());
                    B(uVar, pathC);
                }
                if (this.f14894d.f14932c) {
                    C(pathC);
                }
                I0(uVar);
                if (zM0) {
                    j0(uVar);
                }
            }
        }
    }

    public final void u(SVG.l0 l0Var) {
        Boolean bool;
        if ((l0Var instanceof SVG.j0) && (bool = ((SVG.j0) l0Var).f14770d) != null) {
            this.f14894d.f14937h = bool.booleanValue();
        }
    }

    public final void u0(SVG.y yVar) {
        y("PolyLine render", new Object[0]);
        W0(this.f14894d, yVar);
        if (A() && Y0()) {
            h hVar = this.f14894d;
            if (hVar.f14932c || hVar.f14931b) {
                Matrix matrix = yVar.f14774n;
                if (matrix != null) {
                    this.f14891a.concat(matrix);
                }
                if (yVar.f14836o.length < 2) {
                    return;
                }
                Path pathB0 = b0(yVar);
                U0(yVar);
                pathB0.setFillType(U());
                r(yVar);
                p(yVar);
                boolean zM0 = m0();
                if (this.f14894d.f14931b) {
                    B(yVar, pathB0);
                }
                if (this.f14894d.f14932c) {
                    C(pathB0);
                }
                I0(yVar);
                if (zM0) {
                    j0(yVar);
                }
            }
        }
    }

    public final void v0(SVG.z zVar) {
        y("Polygon render", new Object[0]);
        W0(this.f14894d, zVar);
        if (A() && Y0()) {
            h hVar = this.f14894d;
            if (hVar.f14932c || hVar.f14931b) {
                Matrix matrix = zVar.f14774n;
                if (matrix != null) {
                    this.f14891a.concat(matrix);
                }
                if (zVar.f14836o.length < 2) {
                    return;
                }
                Path pathB0 = b0(zVar);
                U0(zVar);
                r(zVar);
                p(zVar);
                boolean zM0 = m0();
                if (this.f14894d.f14931b) {
                    B(zVar, pathB0);
                }
                if (this.f14894d.f14932c) {
                    C(pathB0);
                }
                I0(zVar);
                if (zM0) {
                    j0(zVar);
                }
            }
        }
    }

    public final void w0(SVG.a0 a0Var) {
        y("Rect render", new Object[0]);
        SVG.o oVar = a0Var.f14715q;
        if (oVar == null || a0Var.f14716r == null || oVar.i() || a0Var.f14716r.i()) {
            return;
        }
        W0(this.f14894d, a0Var);
        if (A() && Y0()) {
            Matrix matrix = a0Var.f14774n;
            if (matrix != null) {
                this.f14891a.concat(matrix);
            }
            Path pathC0 = c0(a0Var);
            U0(a0Var);
            r(a0Var);
            p(a0Var);
            boolean zM0 = m0();
            if (this.f14894d.f14931b) {
                B(a0Var, pathC0);
            }
            if (this.f14894d.f14932c) {
                C(pathC0);
            }
            if (zM0) {
                j0(a0Var);
            }
        }
    }

    public final void x0(SVG.d0 d0Var) {
        z0(d0Var, f0(d0Var.f14738q, d0Var.f14739r, d0Var.f14740s, d0Var.f14741t), d0Var.f14800p, d0Var.f14788o);
    }

    public final void y0(SVG.d0 d0Var, SVG.b bVar) {
        z0(d0Var, bVar, d0Var.f14800p, d0Var.f14788o);
    }

    public final void z(boolean z10, SVG.b bVar, SVG.t tVar) {
        SVG.l0 l0VarU = this.f14893c.u(tVar.f14815b);
        if (l0VarU != null) {
            if (l0VarU instanceof SVG.k0) {
                X(z10, bVar, (SVG.k0) l0VarU);
                return;
            } else if (l0VarU instanceof SVG.o0) {
                e0(z10, bVar, (SVG.o0) l0VarU);
                return;
            } else {
                if (l0VarU instanceof SVG.b0) {
                    Q0(z10, (SVG.b0) l0VarU);
                    return;
                }
                return;
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = z10 ? "Fill" : "Stroke";
        objArr[1] = tVar.f14815b;
        F("%s reference '%s' not found", objArr);
        SVG.m0 m0Var = tVar.f14816c;
        if (m0Var != null) {
            P0(this.f14894d, z10, m0Var);
        } else if (z10) {
            this.f14894d.f14931b = false;
        } else {
            this.f14894d.f14932c = false;
        }
    }

    public final void z0(SVG.d0 d0Var, SVG.b bVar, SVG.b bVar2, PreserveAspectRatio preserveAspectRatio) {
        y("Svg render", new Object[0]);
        if (bVar.f14723c == 0.0f || bVar.f14724d == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = d0Var.f14788o) == null) {
            preserveAspectRatio = PreserveAspectRatio.f14653e;
        }
        W0(this.f14894d, d0Var);
        if (A()) {
            h hVar = this.f14894d;
            hVar.f14935f = bVar;
            if (!hVar.f14930a.f14693w.booleanValue()) {
                SVG.b bVar3 = this.f14894d.f14935f;
                O0(bVar3.f14721a, bVar3.f14722b, bVar3.f14723c, bVar3.f14724d);
            }
            q(d0Var, this.f14894d.f14935f);
            if (bVar2 != null) {
                this.f14891a.concat(o(this.f14894d.f14935f, bVar2, preserveAspectRatio));
                this.f14894d.f14936g = d0Var.f14800p;
            } else {
                Canvas canvas = this.f14891a;
                SVG.b bVar4 = this.f14894d.f14935f;
                canvas.translate(bVar4.f14721a, bVar4.f14722b);
            }
            boolean zM0 = m0();
            X0();
            F0(d0Var, true);
            if (zM0) {
                j0(d0Var);
            }
            U0(d0Var);
        }
    }
}
