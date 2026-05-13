package io.bidmachine.rendering.internal;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends Drawable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f70600u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final ImageView.ScaleType f70601v = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f70602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f70603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f70604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f70605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f70606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f70607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f70608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f70609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f70610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Matrix f70611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f70612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Shader.TileMode f70613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Shader.TileMode f70614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f70615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f70616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean[] f70617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f70618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f70619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ColorStateList f70620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView.ScaleType f70621t;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70622a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f70622a = iArr;
        }
    }

    public u(Bitmap bitmap) {
        tn.p.k(bitmap, "bitmap");
        this.f70602a = bitmap;
        this.f70603b = new RectF();
        this.f70604c = new RectF();
        int width = bitmap.getWidth();
        this.f70605d = width;
        int height = bitmap.getHeight();
        this.f70606e = height;
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, width, height);
        this.f70607f = rectF;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f70608g = paint;
        this.f70609h = new RectF();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f70610i = paint2;
        this.f70611j = new Matrix();
        this.f70612k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f70613l = tileMode;
        this.f70614m = tileMode;
        this.f70615n = true;
        this.f70617p = new boolean[]{true, true, true, true};
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        tn.p.j(colorStateListValueOf, "valueOf(DEFAULT_BORDER_COLOR)");
        this.f70620s = colorStateListValueOf;
        this.f70621t = f70601v;
        paint2.setColor(colorStateListValueOf.getColorForState(getState(), 0));
        paint2.setStrokeWidth(this.f70619r);
    }

    private final void a() {
        float fWidth;
        float fWidth2;
        Matrix matrix;
        RectF rectF;
        RectF rectF2;
        Matrix.ScaleToFit scaleToFit;
        int i10 = b.f70622a[this.f70621t.ordinal()];
        if (i10 == 1) {
            this.f70609h.set(this.f70603b);
            RectF rectF3 = this.f70609h;
            float f10 = this.f70619r / 2;
            rectF3.inset(f10, f10);
            this.f70611j.reset();
            this.f70611j.setTranslate(((this.f70609h.width() - this.f70605d) * 0.5f) + 0.5f, ((this.f70609h.height() - this.f70606e) * 0.5f) + 0.5f);
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 5) {
                    this.f70609h.set(this.f70607f);
                    matrix = this.f70611j;
                    rectF = this.f70607f;
                    rectF2 = this.f70603b;
                    scaleToFit = Matrix.ScaleToFit.END;
                } else if (i10 == 6) {
                    this.f70609h.set(this.f70607f);
                    matrix = this.f70611j;
                    rectF = this.f70607f;
                    rectF2 = this.f70603b;
                    scaleToFit = Matrix.ScaleToFit.START;
                } else if (i10 != 7) {
                    this.f70609h.set(this.f70607f);
                    matrix = this.f70611j;
                    rectF = this.f70607f;
                    rectF2 = this.f70603b;
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                } else {
                    this.f70609h.set(this.f70603b);
                    RectF rectF4 = this.f70609h;
                    float f11 = this.f70619r / 2;
                    rectF4.inset(f11, f11);
                    this.f70611j.reset();
                    this.f70611j.setRectToRect(this.f70607f, this.f70609h, Matrix.ScaleToFit.FILL);
                }
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
            } else {
                this.f70611j.reset();
                float fMin = (((float) this.f70605d) > this.f70603b.width() || ((float) this.f70606e) > this.f70603b.height()) ? Math.min(this.f70603b.width() / this.f70605d, this.f70603b.height() / this.f70606e) : 1.0f;
                float fWidth3 = ((this.f70603b.width() - (this.f70605d * fMin)) * 0.5f) + 0.5f;
                float fHeight = ((this.f70603b.height() - (this.f70606e * fMin)) * 0.5f) + 0.5f;
                this.f70611j.setScale(fMin, fMin);
                this.f70611j.postTranslate(fWidth3, fHeight);
                this.f70609h.set(this.f70607f);
            }
            this.f70611j.mapRect(this.f70609h);
            RectF rectF5 = this.f70609h;
            float f12 = this.f70619r / 2;
            rectF5.inset(f12, f12);
            this.f70611j.setRectToRect(this.f70607f, this.f70609h, Matrix.ScaleToFit.FILL);
        } else {
            this.f70609h.set(this.f70603b);
            RectF rectF6 = this.f70609h;
            float f13 = 2;
            float f14 = this.f70619r / f13;
            rectF6.inset(f14, f14);
            this.f70611j.reset();
            float fHeight2 = 0.0f;
            if (this.f70605d * this.f70609h.height() > this.f70609h.width() * this.f70606e) {
                fWidth = this.f70609h.height() / this.f70606e;
                fWidth2 = (this.f70609h.width() - (this.f70605d * fWidth)) * 0.5f;
            } else {
                fWidth = this.f70609h.width() / this.f70605d;
                fWidth2 = 0.0f;
                fHeight2 = (this.f70609h.height() - (this.f70606e * fWidth)) * 0.5f;
            }
            this.f70611j.setScale(fWidth, fWidth);
            Matrix matrix2 = this.f70611j;
            float f15 = this.f70619r / f13;
            matrix2.postTranslate(((int) (fWidth2 + 0.5f)) + f15, ((int) (fHeight2 + 0.5f)) + f15);
        }
        this.f70604c.set(this.f70609h);
        this.f70615n = true;
    }

    private final void a(Canvas canvas) {
        if (a(this.f70617p) || this.f70616o == 0.0f) {
            return;
        }
        RectF rectF = this.f70604c;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f70604c.height() + f11;
        float f12 = this.f70616o;
        if (!this.f70617p[0]) {
            this.f70612k.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.f70612k, this.f70608g);
        }
        if (!this.f70617p[1]) {
            this.f70612k.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.f70612k, this.f70608g);
        }
        if (!this.f70617p[2]) {
            this.f70612k.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.f70612k, this.f70608g);
        }
        if (this.f70617p[3]) {
            return;
        }
        this.f70612k.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.f70612k, this.f70608g);
    }

    private final boolean a(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private final void b(Canvas canvas) {
        float f10;
        if (a(this.f70617p) || this.f70616o == 0.0f) {
            return;
        }
        RectF rectF = this.f70604c;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float fWidth = rectF.width() + f11;
        float fHeight = f12 + this.f70604c.height();
        float f13 = this.f70616o;
        float f14 = this.f70619r / 2;
        if (!this.f70617p[0]) {
            canvas.drawLine(f11 - f14, f12, f11 + f13, f12, this.f70610i);
            canvas.drawLine(f11, f12 - f14, f11, f12 + f13, this.f70610i);
        }
        if (!this.f70617p[1]) {
            canvas.drawLine((fWidth - f13) - f14, f12, fWidth, f12, this.f70610i);
            canvas.drawLine(fWidth, f12 - f14, fWidth, f12 + f13, this.f70610i);
        }
        if (this.f70617p[2]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine((fWidth - f13) - f14, fHeight, fWidth + f14, fHeight, this.f70610i);
            canvas.drawLine(fWidth, fHeight - f10, fWidth, fHeight, this.f70610i);
        }
        if (this.f70617p[3]) {
            return;
        }
        canvas.drawLine(f11 - f14, fHeight, f11 + f10, fHeight, this.f70610i);
        canvas.drawLine(f11, fHeight - f10, f11, fHeight, this.f70610i);
    }

    private final boolean b(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final u a(float f10) {
        this.f70619r = f10;
        this.f70610i.setStrokeWidth(f10);
        return this;
    }

    public final u a(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (hashSet.isEmpty()) {
                this.f70616o = 0.0f;
            } else {
                float fFloatValue = ((Number) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.f70616o = fFloatValue;
                }
            }
            boolean[] zArr = this.f70617p;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
        }
        return this;
    }

    public final u a(int i10) {
        return a(ColorStateList.valueOf(i10));
    }

    public final u a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            tn.p.j(colorStateList, "valueOf(0)");
        }
        this.f70620s = colorStateList;
        this.f70610i.setColor(colorStateList.getColorForState(getState(), 0));
        return this;
    }

    public final u a(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = f70601v;
        }
        if (this.f70621t != scaleType) {
            this.f70621t = scaleType;
            a();
        }
        return this;
    }

    public final u b(float f10) {
        a(f10, f10, f10, f10);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF;
        Paint paint;
        tn.p.k(canvas, "canvas");
        if (this.f70615n) {
            BitmapShader bitmapShader = new BitmapShader(this.f70602a, this.f70613l, this.f70614m);
            Shader.TileMode tileMode = this.f70613l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f70614m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f70611j);
            }
            this.f70608g.setShader(bitmapShader);
            this.f70615n = false;
        }
        if (this.f70618q) {
            if (this.f70619r > 0.0f) {
                canvas.drawOval(this.f70604c, this.f70608g);
                rectF = this.f70609h;
                paint = this.f70610i;
            } else {
                rectF = this.f70604c;
                paint = this.f70608g;
            }
            canvas.drawOval(rectF, paint);
            return;
        }
        if (!b(this.f70617p)) {
            canvas.drawRect(this.f70604c, this.f70608g);
            if (this.f70619r > 0.0f) {
                canvas.drawRect(this.f70609h, this.f70610i);
                return;
            }
            return;
        }
        float f10 = this.f70616o;
        if (this.f70619r <= 0.0f) {
            canvas.drawRoundRect(this.f70604c, f10, f10, this.f70608g);
            a(canvas);
        } else {
            canvas.drawRoundRect(this.f70604c, f10, f10, this.f70608g);
            canvas.drawRoundRect(this.f70609h, f10, f10, this.f70610i);
            a(canvas);
            b(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f70608g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f70608g.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f70606e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f70605d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f70620s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        tn.p.k(rect, "bounds");
        super.onBoundsChange(rect);
        this.f70603b.set(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        tn.p.k(iArr, "state");
        int colorForState = this.f70620s.getColorForState(iArr, 0);
        if (this.f70610i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f70610i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f70608g.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f70608g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f70608g.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f70608g.setFilterBitmap(z10);
        invalidateSelf();
    }
}
