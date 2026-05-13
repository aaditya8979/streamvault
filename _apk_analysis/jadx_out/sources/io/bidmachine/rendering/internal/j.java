package io.bidmachine.rendering.internal;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.view.ViewCompat;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends Drawable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f70458o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final c f70459p = c.TOP_BOTTOM;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f70460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f70461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f70462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f70463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f70464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f70465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorFilter f70466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BlendModeColorFilter f70467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f70468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f70469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f70470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f70471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f70472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f70473n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public static final class b extends Drawable.ConstantState {
        private boolean A;
        private boolean B;
        private ColorStateList C;
        private BlendMode D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f70474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f70475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f70476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f70477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f70478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ColorStateList f70479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ColorStateList f70480g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ColorStateList[] f70481h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float[] f70482i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f70483j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f70484k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f70485l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f70486m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float[] f70487n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Rect f70488o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f70489p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f70490q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f70491r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private float f70492s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f70493t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f70494u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f70495v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private float f70496w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private float f70497x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f70498y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f70499z;

        public static final class a extends Lambda implements sn.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f70500a = new a();

            public a() {
                super(1);
            }

            @Override // sn.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(ColorStateList colorStateList) {
                if (colorStateList != null) {
                    return Integer.valueOf(colorStateList.getDefaultColor());
                }
                return null;
            }
        }

        public b(b bVar) {
            tn.p.k(bVar, "originalGradientState");
            this.f70483j = -1;
            this.f70489p = -1;
            this.f70490q = -1;
            this.f70491r = 3.0f;
            this.f70492s = 9.0f;
            this.f70493t = -1;
            this.f70494u = -1;
            this.f70496w = 0.5f;
            this.f70497x = 0.5f;
            this.f70498y = 0.5f;
            this.D = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.f70474a = bVar.f70474a;
            this.f70475b = bVar.f70475b;
            this.f70476c = bVar.f70476c;
            this.f70477d = bVar.f70477d;
            this.f70478e = bVar.f70478e;
            this.f70479f = bVar.f70479f;
            this.f70480g = bVar.f70480g;
            ColorStateList[] colorStateListArr = bVar.f70481h;
            if (colorStateListArr != null) {
                this.f70481h = (ColorStateList[]) colorStateListArr.clone();
            }
            float[] fArr = bVar.f70482i;
            if (fArr != null) {
                this.f70482i = (float[]) fArr.clone();
            }
            this.f70483j = bVar.f70483j;
            this.f70484k = bVar.f70484k;
            this.f70485l = bVar.f70485l;
            this.f70486m = bVar.f70486m;
            float[] fArr2 = bVar.f70487n;
            if (fArr2 != null) {
                this.f70487n = (float[]) fArr2.clone();
            }
            Rect rect = bVar.f70488o;
            if (rect != null) {
                this.f70488o = new Rect(rect);
            }
            this.f70489p = bVar.f70489p;
            this.f70490q = bVar.f70490q;
            this.f70491r = bVar.f70491r;
            this.f70492s = bVar.f70492s;
            this.f70493t = bVar.f70493t;
            this.f70494u = bVar.f70494u;
            this.f70495v = bVar.f70495v;
            this.f70496w = bVar.f70496w;
            this.f70497x = bVar.f70497x;
            this.f70498y = bVar.f70498y;
            this.f70499z = bVar.f70499z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
        }

        public b(c cVar, int[] iArr) {
            tn.p.k(cVar, "orientation");
            this.f70483j = -1;
            this.f70489p = -1;
            this.f70490q = -1;
            this.f70491r = 3.0f;
            this.f70492s = 9.0f;
            this.f70493t = -1;
            this.f70494u = -1;
            this.f70496w = 0.5f;
            this.f70497x = 0.5f;
            this.f70498y = 0.5f;
            this.D = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.f70478e = cVar;
            a(iArr);
        }

        public final int A() {
            return this.f70483j;
        }

        public final int B() {
            return this.f70494u;
        }

        public final float C() {
            return this.f70492s;
        }

        public final ColorStateList D() {
            return this.C;
        }

        public final int E() {
            return this.f70489p;
        }

        public final void a() {
            Boolean boolValueOf;
            boolean z10;
            boolean z11 = false;
            this.A = false;
            this.B = false;
            ColorStateList[] colorStateListArr = this.f70481h;
            if (colorStateListArr == null && this.f70479f == null) {
                return;
            }
            if (colorStateListArr != null) {
                int length = colorStateListArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        ColorStateList colorStateList = colorStateListArr[i10];
                        if (colorStateList != null && !k.a(colorStateList.getDefaultColor())) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                boolValueOf = Boolean.valueOf(z10);
            } else {
                boolValueOf = null;
            }
            if (tn.p.f(boolValueOf, Boolean.TRUE)) {
                return;
            }
            this.B = true;
            if (this.f70475b == 0 && this.f70486m <= 0.0f && this.f70487n == null) {
                z11 = true;
            }
            this.A = z11;
        }

        public final void a(float f10) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            this.f70486m = f10;
            this.f70487n = null;
            a();
        }

        public final void a(float f10, int i10) {
            this.f70498y = f10;
            this.f70499z = i10;
        }

        public final void a(int i10) {
            this.f70474a = i10;
        }

        public final void a(int i10, ColorStateList colorStateList, float f10, float f11) {
            this.f70483j = i10;
            this.f70480g = colorStateList;
            this.f70484k = f10;
            this.f70485l = f11;
            a();
        }

        public final void a(ColorStateList colorStateList) {
            this.f70481h = null;
            this.f70479f = colorStateList;
            a();
        }

        public final void a(BlendMode blendMode) {
            this.D = blendMode;
        }

        public final void a(boolean z10) {
            this.f70495v = z10;
        }

        public final void a(int[] iArr) {
            ColorStateList[] colorStateListArr;
            if (iArr != null) {
                colorStateListArr = this.f70481h;
                if (colorStateListArr == null || colorStateListArr.length != iArr.length) {
                    colorStateListArr = new ColorStateList[iArr.length];
                }
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(iArr[i10]);
                    tn.p.j(colorStateListValueOf, "valueOf(it)");
                    colorStateListArr[i10] = colorStateListValueOf;
                }
            } else {
                colorStateListArr = null;
            }
            this.f70481h = colorStateListArr;
            this.f70479f = null;
            a();
        }

        public final BlendMode b() {
            return this.D;
        }

        public final void b(int i10) {
            this.f70476c = i10;
        }

        public final void b(ColorStateList colorStateList) {
            this.C = colorStateList;
        }

        public final float c() {
            return this.f70496w;
        }

        public final float d() {
            return this.f70497x;
        }

        public final int e() {
            return this.f70474a;
        }

        public final int[] f() {
            ColorStateList[] colorStateListArr = this.f70481h;
            if (colorStateListArr != null) {
                return k.a(colorStateListArr, a.f70500a);
            }
            return null;
        }

        public final boolean g() {
            return this.f70495v;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i10 = this.f70474a;
            ColorStateList colorStateList = this.f70480g;
            int changingConfigurations = i10 | (colorStateList != null ? colorStateList.getChangingConfigurations() : 0);
            ColorStateList colorStateList2 = this.f70479f;
            int changingConfigurations2 = changingConfigurations | (colorStateList2 != null ? colorStateList2.getChangingConfigurations() : 0);
            ColorStateList colorStateList3 = this.C;
            return changingConfigurations2 | (colorStateList3 != null ? colorStateList3.getChangingConfigurations() : 0);
        }

        public final ColorStateList[] h() {
            return this.f70481h;
        }

        public final float i() {
            return this.f70498y;
        }

        public final int j() {
            return this.f70499z;
        }

        public final int k() {
            return this.f70476c;
        }

        public final int l() {
            return this.f70490q;
        }

        public final int m() {
            return this.f70493t;
        }

        public final float n() {
            return this.f70491r;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new j(this, (tn.i) null);
        }

        public final boolean o() {
            return this.A;
        }

        public final boolean p() {
            return this.B;
        }

        public final c q() {
            return this.f70478e;
        }

        public final Rect r() {
            return this.f70488o;
        }

        public final float[] s() {
            return this.f70482i;
        }

        public final float t() {
            return this.f70486m;
        }

        public final float[] u() {
            return this.f70487n;
        }

        public final int v() {
            return this.f70475b;
        }

        public final ColorStateList w() {
            return this.f70479f;
        }

        public final ColorStateList x() {
            return this.f70480g;
        }

        public final float y() {
            return this.f70485l;
        }

        public final float z() {
            return this.f70484k;
        }
    }

    public enum c {
        TOP_BOTTOM,
        TR_BL,
        RIGHT_LEFT,
        BR_TL,
        BOTTOM_TOP,
        BL_TR,
        LEFT_RIGHT,
        TL_BR
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70510a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f70510a = iArr;
        }
    }

    public j() {
        this(new b(f70459p, null));
    }

    private j(b bVar) {
        this.f70461b = new Path();
        this.f70462c = new RectF();
        this.f70463d = new Paint(1);
        this.f70468i = 255;
        this.f70472m = true;
        this.f70460a = bVar;
        d();
    }

    public /* synthetic */ j(b bVar, tn.i iVar) {
        this(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(c cVar, int[] iArr) {
        this(new b(cVar, iArr));
        tn.p.k(cVar, "orientation");
    }

    private final int a(int i10) {
        int i11 = this.f70468i;
        return (i10 * (i11 + (i11 >> 7))) >> 8;
    }

    private final BlendModeColorFilter a(BlendModeColorFilter blendModeColorFilter, ColorStateList colorStateList, BlendMode blendMode) {
        if (colorStateList == null || blendMode == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return blendModeColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        return (blendModeColorFilter != null && blendModeColorFilter.getColor() == colorForState && blendModeColorFilter.getMode() == blendMode) ? blendModeColorFilter : new BlendModeColorFilter(colorForState, blendMode);
    }

    private final Path a(b bVar) {
        Path path = this.f70471l;
        if (path != null && !this.f70472m) {
            return path;
        }
        this.f70472m = false;
        float level = (getLevel() * 360.0f) / 10000.0f;
        RectF rectF = new RectF(this.f70462c);
        float fWidth = rectF.width() / 2.0f;
        float fHeight = rectF.height() / 2.0f;
        float fB = bVar.B() != -1 ? bVar.B() : rectF.width() / bVar.C();
        float fM = bVar.m() != -1 ? bVar.m() : rectF.width() / bVar.n();
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(fWidth - fM, fHeight - fM);
        RectF rectF3 = new RectF(rectF2);
        float f10 = -fB;
        rectF3.inset(f10, f10);
        Path path2 = this.f70471l;
        if (path2 != null) {
            path2.reset();
        } else {
            path2 = new Path();
            this.f70471l = path2;
        }
        if (level >= 360.0f || level <= -360.0f) {
            path2.addOval(rectF3, Path.Direction.CW);
            path2.addOval(rectF2, Path.Direction.CCW);
        } else {
            path2.setFillType(Path.FillType.EVEN_ODD);
            float f11 = fWidth + fM;
            path2.moveTo(f11, fHeight);
            path2.lineTo(f11 + fB, fHeight);
            path2.arcTo(rectF3, 0.0f, level, false);
            path2.arcTo(rectF2, level, -level, false);
            path2.close();
        }
        path2.addOval(rectF3, Path.Direction.CW);
        path2.addOval(rectF2, Path.Direction.CCW);
        return path2;
    }

    private final void a() {
        b bVar = this.f70460a;
        if (this.f70472m) {
            b();
            this.f70461b.reset();
            float[] fArrU = bVar.u();
            if (fArrU != null) {
                this.f70461b.addRoundRect(this.f70462c, fArrU, Path.Direction.CW);
            }
            this.f70472m = false;
        }
    }

    public static /* synthetic */ void a(j jVar, float f10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = 0.5f;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        jVar.a(f10, i10);
    }

    public static /* synthetic */ void a(j jVar, int i10, int i11, float f10, float f11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f10 = 0.0f;
        }
        if ((i12 & 8) != 0) {
            f11 = 0.0f;
        }
        jVar.a(i10, i11, f10, f11);
    }

    private final void b(int i10, int i11, float f10, float f11) {
        Paint paint = this.f70465f;
        if (paint == null) {
            paint = new Paint(1);
            this.f70465f = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        paint.setStrokeWidth(i10);
        paint.setColor(i11);
        paint.setPathEffect(f10 > 0.0f ? new DashPathEffect(new float[]{f10, f11}, 0.0f) : null);
        this.f70470k = true;
        invalidateSelf();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0054. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean b() {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.rendering.internal.j.b():boolean");
    }

    private final boolean c() {
        Paint paint = this.f70465f;
        if (this.f70460a.A() < 0 || paint == null || k.a(paint.getColor())) {
            return this.f70460a.h() != null || k.a(this.f70463d.getColor());
        }
        return false;
    }

    private final void d() {
        b bVar = this.f70460a;
        ColorStateList colorStateListW = bVar.w();
        if (colorStateListW != null) {
            this.f70463d.setColor(colorStateListW.getColorForState(getState(), 0));
        } else if (bVar.h() == null) {
            this.f70463d.setColor(0);
        } else {
            this.f70463d.setColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.f70464e = bVar.r();
        int iA = bVar.A();
        if (iA >= 0) {
            Paint paint = this.f70465f;
            if (paint == null) {
                paint = new Paint(1);
                this.f70465f = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(iA);
            }
            ColorStateList colorStateListX = bVar.x();
            if (colorStateListX != null) {
                paint.setColor(colorStateListX.getColorForState(getState(), 0));
            }
            float fZ = bVar.z();
            if (fZ != 0.0f) {
                paint.setPathEffect(new DashPathEffect(new float[]{fZ, bVar.y()}, 0.0f));
            }
        }
        this.f70467h = a(this.f70467h, bVar.D(), bVar.b());
        this.f70470k = true;
        bVar.a();
    }

    public final void a(float f10) {
        this.f70460a.a(f10);
        this.f70472m = true;
        invalidateSelf();
    }

    public final void a(float f10, int i10) {
        this.f70460a.a(f10, i10);
        this.f70470k = true;
        invalidateSelf();
    }

    public final void a(int i10, int i11, float f10, float f11) {
        this.f70460a.a(i10, ColorStateList.valueOf(i11), f10, f11);
        b(i10, i11, f10, f11);
    }

    public final void b(int i10) {
        this.f70460a.a(ColorStateList.valueOf(i10));
        this.f70463d.setColor(i10);
        invalidateSelf();
    }

    public final void c(int i10) {
        this.f70460a.b(i10);
        this.f70470k = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        tn.p.k(canvas, "canvas");
        if (b()) {
            int alpha = this.f70463d.getAlpha();
            Paint paint9 = this.f70465f;
            int alpha2 = paint9 != null ? paint9.getAlpha() : 0;
            int iA = a(alpha);
            int iA2 = a(alpha2);
            Paint paint10 = this.f70465f;
            float strokeWidth = paint10 != null ? paint10.getStrokeWidth() : 0.0f;
            boolean z10 = iA2 > 0 && strokeWidth > 0.0f;
            boolean z11 = iA > 0;
            b bVar = this.f70460a;
            ColorFilter colorFilter = this.f70466g;
            if (colorFilter == null) {
                colorFilter = this.f70467h;
            }
            ColorFilter colorFilter2 = colorFilter;
            boolean z12 = z10 && z11 && bVar.v() != 2 && iA2 < 255 && (this.f70468i < 255 || colorFilter2 != null);
            if (z12) {
                Paint paint11 = this.f70469j;
                if (paint11 == null) {
                    paint11 = new Paint();
                    this.f70469j = paint11;
                }
                Paint paint12 = paint11;
                paint12.setDither(bVar.g());
                paint12.setAlpha(this.f70468i);
                paint12.setColorFilter(colorFilter2);
                RectF rectF = this.f70462c;
                canvas.saveLayer(rectF.left - strokeWidth, rectF.top - strokeWidth, rectF.right + strokeWidth, rectF.bottom + strokeWidth, paint12);
                this.f70463d.setColorFilter(null);
                Paint paint13 = this.f70465f;
                if (paint13 != null) {
                    paint13.setColorFilter(null);
                }
            } else {
                this.f70463d.setAlpha(iA);
                this.f70463d.setDither(bVar.g());
                this.f70463d.setColorFilter(colorFilter2);
                if (colorFilter2 != null && bVar.w() == null) {
                    this.f70463d.setColor(this.f70468i << 24);
                }
                if (z10 && (paint = this.f70465f) != null) {
                    paint.setAlpha(iA2);
                    paint.setDither(bVar.g());
                    paint.setColorFilter(colorFilter2);
                }
            }
            int iV = bVar.v();
            if (iV != 0) {
                if (iV == 1) {
                    canvas.drawOval(this.f70462c, this.f70463d);
                    if (z10 && (paint6 = this.f70465f) != null) {
                        canvas.drawOval(this.f70462c, paint6);
                    }
                } else if (iV == 2) {
                    RectF rectF2 = this.f70462c;
                    float fCenterY = rectF2.centerY();
                    if (z10 && (paint7 = this.f70465f) != null) {
                        canvas.drawLine(rectF2.left, fCenterY, rectF2.right, fCenterY, paint7);
                    }
                } else if (iV == 3) {
                    Path pathA = a(bVar);
                    canvas.drawPath(pathA, this.f70463d);
                    if (z10 && (paint8 = this.f70465f) != null) {
                        canvas.drawPath(pathA, paint8);
                    }
                }
            } else if (bVar.u() != null) {
                a();
                canvas.drawPath(this.f70461b, this.f70463d);
                if (z10 && (paint4 = this.f70465f) != null) {
                    canvas.drawPath(this.f70461b, paint4);
                }
            } else if (bVar.t() > 0.0f) {
                float fMin = (float) Math.min(bVar.t(), Math.min(this.f70462c.width(), this.f70462c.height()) * ((double) 0.5f));
                canvas.drawRoundRect(this.f70462c, fMin, fMin, this.f70463d);
                if (z10 && (paint3 = this.f70465f) != null) {
                    canvas.drawRoundRect(this.f70462c, fMin, fMin, paint3);
                }
            } else {
                if (this.f70463d.getColor() != 0 || colorFilter2 != null || this.f70463d.getShader() != null) {
                    canvas.drawRect(this.f70462c, this.f70463d);
                }
                if (z10 && (paint2 = this.f70465f) != null) {
                    canvas.drawRect(this.f70462c, paint2);
                }
            }
            if (z12) {
                canvas.restore();
                return;
            }
            this.f70463d.setAlpha(alpha);
            if (!z10 || (paint5 = this.f70465f) == null) {
                return;
            }
            paint5.setAlpha(alpha2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f70468i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f70460a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f70466g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        b bVar = this.f70460a;
        bVar.a(getChangingConfigurations());
        return bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f70460a.l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f70460a.E();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (this.f70468i == 255 && this.f70460a.o() && c()) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        tn.p.k(outline, "outline");
        b bVar = this.f70460a;
        Paint paint = this.f70465f;
        Rect bounds = getBounds();
        tn.p.j(bounds, "getBounds()");
        outline.setAlpha((bVar.p() && (this.f70460a.A() <= 0 || paint == null || paint.getAlpha() == this.f70463d.getAlpha())) ? a(this.f70463d.getAlpha()) / 255.0f : 0.0f);
        int iV = bVar.v();
        if (iV != 0) {
            if (iV == 1) {
                outline.setOval(bounds);
                return;
            } else {
                if (iV != 2) {
                    return;
                }
                float strokeWidth = paint != null ? paint.getStrokeWidth() * 0.5f : 1.0E-4f;
                float fCenterY = bounds.centerY();
                outline.setRect(bounds.left, (int) Math.floor(fCenterY - strokeWidth), bounds.right, (int) Math.ceil(fCenterY + strokeWidth));
                return;
            }
        }
        float[] fArrU = bVar.u();
        if (fArrU == null) {
            outline.setRoundRect(bounds, bVar.t() > 0.0f ? (float) Math.min(bVar.t(), Math.min(bounds.width(), bounds.height()) * ((double) 0.5f)) : 0.0f);
            return;
        }
        a();
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.f70461b);
        } else {
            outline.setRoundRect(bounds, cn.r.z0(fArrU));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        tn.p.k(rect, VastAttributes.PADDING);
        Rect rect2 = this.f70464e;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        b bVar = this.f70460a;
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateListW = bVar.w();
        if (colorStateListW != null && colorStateListW.isStateful()) {
            return true;
        }
        ColorStateList colorStateListX = bVar.x();
        if (colorStateListX != null && colorStateListX.isStateful()) {
            return true;
        }
        ColorStateList colorStateListD = bVar.D();
        return colorStateListD != null && colorStateListD.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (super.mutate() == this) {
            this.f70460a = new b(this.f70460a);
            d();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        tn.p.k(rect, "rect");
        super.onBoundsChange(rect);
        this.f70471l = null;
        this.f70472m = true;
        this.f70470k = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        super.onLevelChange(i10);
        this.f70470k = true;
        this.f70472m = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        ColorStateList colorStateListX;
        int colorForState;
        int colorForState2;
        tn.p.k(iArr, "stateSet");
        b bVar = this.f70460a;
        ColorStateList colorStateListW = bVar.w();
        if (colorStateListW == null || this.f70463d.getColor() == (colorForState2 = colorStateListW.getColorForState(iArr, 0))) {
            z10 = false;
        } else {
            this.f70463d.setColor(colorForState2);
            z10 = true;
        }
        Paint paint = this.f70465f;
        if (paint != null && (colorStateListX = bVar.x()) != null && paint.getColor() != (colorForState = colorStateListX.getColorForState(iArr, 0))) {
            paint.setColor(colorForState);
            z10 = true;
        }
        if (bVar.D() != null && bVar.b() != null) {
            this.f70467h = a(this.f70467h, bVar.D(), bVar.b());
        } else if (!z10) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f70468i != i10) {
            this.f70468i = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f70466g != colorFilter) {
            this.f70466g = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        if (this.f70460a.g() != z10) {
            this.f70460a.a(z10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.f70460a.a(blendMode);
        this.f70467h = a(this.f70467h, this.f70460a.D(), blendMode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f70460a.b(colorStateList);
        this.f70467h = a(this.f70467h, colorStateList, this.f70460a.b());
        invalidateSelf();
    }
}
