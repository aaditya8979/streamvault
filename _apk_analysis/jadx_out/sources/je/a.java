package je;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: RoundDrawable.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f72402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f72405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f72406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f72407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f72408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f72409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Path f72410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f72411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f72412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f72413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f72414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f72415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView.ScaleType f72416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f72417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f72418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f72419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f72420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f72421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float[] f72422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f72423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f72424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f72425x;

    /* JADX INFO: renamed from: je.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RoundDrawable.java */
    public static /* synthetic */ class C0853a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72426a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f72426a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72426a[ImageView.ScaleType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72426a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72426a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72426a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72426a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72426a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public a(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f72405d = rectF;
        this.f72408g = new RectF();
        this.f72409h = new RectF();
        this.f72410i = new Path();
        this.f72411j = new RectF();
        this.f72412k = new RectF();
        this.f72413l = new RectF();
        this.f72414m = true;
        this.f72415n = new Matrix();
        this.f72416o = ImageView.ScaleType.FIT_CENTER;
        this.f72417p = -1.0f;
        this.f72418q = 0.0f;
        this.f72419r = 0.0f;
        this.f72420s = 0.0f;
        this.f72421t = 0.0f;
        this.f72422u = new float[8];
        this.f72423v = 0.0f;
        this.f72424w = ViewCompat.MEASURED_STATE_MASK;
        this.f72425x = true;
        this.f72402a = bitmap;
        int width = bitmap.getWidth();
        this.f72403b = width;
        int height = bitmap.getHeight();
        this.f72404c = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint(1);
        this.f72406e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint(1);
        this.f72407f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        f();
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static a b(Bitmap bitmap) {
        if (bitmap != null) {
            return new a(bitmap);
        }
        return null;
    }

    public static Drawable c(Drawable drawable) {
        if (drawable == null || (drawable instanceof a)) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap bitmapA = a(drawable);
            return bitmapA != null ? new a(bitmapA) : drawable;
        }
        Drawable.ConstantState constantState = drawable.mutate().getConstantState();
        if (constantState != null) {
            drawable = constantState.newDrawable();
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i10 = 0; i10 < numberOfLayers; i10++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), c(layerDrawable.getDrawable(i10)));
        }
        return layerDrawable;
    }

    public static Matrix.ScaleToFit d(ImageView.ScaleType scaleType) {
        int i10 = C0853a.f72426a[scaleType.ordinal()];
        return i10 != 4 ? i10 != 5 ? i10 != 6 ? i10 != 7 ? Matrix.ScaleToFit.CENTER : Matrix.ScaleToFit.FILL : Matrix.ScaleToFit.START : Matrix.ScaleToFit.END : Matrix.ScaleToFit.CENTER;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f72414m) {
            Bitmap bitmap = this.f72402a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(this.f72415n);
            this.f72406e.setShader(bitmapShader);
            this.f72414m = false;
        }
        if (!this.f72425x) {
            i();
            canvas.drawPath(this.f72410i, this.f72406e);
            if (this.f72423v > 0.0f) {
                g();
                canvas.drawPath(this.f72410i, this.f72407f);
                return;
            }
            return;
        }
        float fWidth = this.f72409h.width() / 2.0f;
        RectF rectF = this.f72409h;
        float f10 = fWidth + rectF.left;
        float fHeight = rectF.height() / 2.0f;
        RectF rectF2 = this.f72409h;
        canvas.drawCircle(f10, fHeight + rectF2.top, Math.min(Math.min(this.f72404c, this.f72403b), Math.min(rectF2.width() / 2.0f, this.f72409h.height() / 2.0f)), this.f72406e);
        if (this.f72423v > 0.0f) {
            float fWidth2 = this.f72408g.width() / 2.0f;
            RectF rectF3 = this.f72408g;
            float f11 = fWidth2 + rectF3.left;
            float fHeight2 = rectF3.height() / 2.0f;
            RectF rectF4 = this.f72408g;
            canvas.drawCircle(f11, fHeight2 + rectF4.top, Math.min(Math.min(this.f72404c, this.f72403b), Math.min(rectF4.width() / 2.0f, this.f72408g.height() / 2.0f)), this.f72407f);
        }
    }

    public void e(ImageView.ScaleType scaleType, float f10, int i10, boolean z10, float f11, float f12, float f13, float f14, float f15) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f72416o != scaleType) {
            this.f72416o = scaleType;
        }
        this.f72423v = f10;
        this.f72424w = i10;
        f();
        this.f72425x = z10;
        this.f72417p = f11;
        this.f72418q = f12;
        this.f72419r = f13;
        this.f72420s = f14;
        this.f72421t = f15;
        h();
        j();
        invalidateSelf();
    }

    public final void f() {
        this.f72407f.setColor(this.f72424w);
        this.f72407f.setStrokeWidth(this.f72423v);
    }

    public final void g() {
        this.f72410i.reset();
        this.f72410i.addRoundRect(this.f72408g, this.f72422u, Path.Direction.CCW);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h() {
        float f10 = this.f72417p;
        int i10 = 0;
        if (f10 < 0.0f) {
            if (f10 < 0.0f) {
                float[] fArr = this.f72422u;
                float f11 = this.f72418q;
                fArr[0] = f11;
                fArr[1] = f11;
                float f12 = this.f72419r;
                fArr[2] = f12;
                fArr[3] = f12;
                float f13 = this.f72421t;
                fArr[4] = f13;
                fArr[5] = f13;
                float f14 = this.f72420s;
                fArr[6] = f14;
                fArr[7] = f14;
                return;
            }
            return;
        }
        while (true) {
            float[] fArr2 = this.f72422u;
            if (i10 >= fArr2.length) {
                return;
            }
            fArr2[i10] = this.f72417p;
            i10++;
        }
    }

    public final void i() {
        this.f72410i.reset();
        this.f72410i.addRoundRect(this.f72409h, this.f72422u, Path.Direction.CCW);
    }

    public final void j() {
        float fMin;
        float fHeight;
        int i10;
        float fWidth;
        float fWidth2;
        float fHeight2;
        float f10 = this.f72423v / 2.0f;
        this.f72412k.set(this.f72413l);
        int i11 = C0853a.f72426a[this.f72416o.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                float fMin2 = Math.min(this.f72412k.height(), this.f72405d.height());
                float fMin3 = Math.min(this.f72412k.width(), this.f72405d.width());
                float fHeight3 = (this.f72412k.height() - this.f72405d.height()) / 2.0f;
                float fWidth3 = (this.f72412k.width() - this.f72405d.width()) / 2.0f;
                float f11 = fHeight3 > 0.0f ? fHeight3 : 0.0f;
                fWidth = fWidth3 > 0.0f ? fWidth3 : 0.0f;
                RectF rectF = new RectF(fWidth, f11, fMin3 + fWidth, fMin2 + f11);
                this.f72411j = rectF;
                boolean z10 = this.f72425x;
                rectF.inset(z10 ? this.f72423v : f10, z10 ? this.f72423v : f10);
                this.f72415n.reset();
                this.f72415n.postTranslate(((int) (fWidth3 + 0.5f)) + f10, ((int) (fHeight3 + 0.5f)) + f10);
            } else if (i11 == 3) {
                this.f72411j.set(this.f72412k);
                RectF rectF2 = this.f72411j;
                boolean z11 = this.f72425x;
                rectF2.inset(z11 ? this.f72423v : f10, z11 ? this.f72423v : f10);
                if (this.f72403b * this.f72411j.height() > this.f72411j.width() * this.f72404c) {
                    fWidth2 = this.f72411j.height() / this.f72404c;
                    fWidth = (this.f72411j.width() - (this.f72403b * fWidth2)) * 0.5f;
                    fHeight2 = 0.0f;
                } else {
                    fWidth2 = this.f72411j.width() / this.f72403b;
                    fHeight2 = (this.f72411j.height() - (this.f72404c * fWidth2)) * 0.5f;
                }
                this.f72415n.reset();
                this.f72415n.setScale(fWidth2, fWidth2);
                this.f72415n.postTranslate(((int) (fWidth + 0.5f)) + f10, ((int) (fHeight2 + 0.5f)) + f10);
            } else if (i11 != 7) {
                RectF rectF3 = this.f72412k;
                boolean z12 = this.f72425x;
                rectF3.inset(z12 ? this.f72423v : f10, z12 ? this.f72423v : f10);
                this.f72411j.set(this.f72405d);
                this.f72415n.setRectToRect(this.f72405d, this.f72412k, d(this.f72416o));
                this.f72415n.mapRect(this.f72411j);
                this.f72415n.setRectToRect(this.f72405d, this.f72411j, Matrix.ScaleToFit.FILL);
            } else {
                RectF rectF4 = this.f72412k;
                boolean z13 = this.f72425x;
                rectF4.inset(z13 ? this.f72423v : f10, z13 ? this.f72423v : f10);
                this.f72411j.set(this.f72412k);
                this.f72415n.reset();
                this.f72415n.setRectToRect(this.f72405d, this.f72411j, Matrix.ScaleToFit.FILL);
            }
        } else {
            if (this.f72403b > this.f72412k.width() || this.f72404c > this.f72412k.height()) {
                fMin = Math.min(this.f72412k.width() / this.f72403b, this.f72412k.height() / this.f72404c);
                if (this.f72412k.height() < this.f72412k.width()) {
                    fHeight = this.f72412k.height();
                    i10 = this.f72403b;
                } else if (this.f72412k.height() > this.f72412k.width()) {
                    fHeight = this.f72404c * fMin;
                    fWidth = this.f72412k.width();
                } else {
                    fHeight = this.f72404c * fMin;
                    i10 = this.f72403b;
                }
                fWidth = i10 * fMin;
            } else {
                fMin = 1.0f;
                fHeight = this.f72404c;
                fWidth = this.f72403b;
            }
            float fWidth4 = (int) (((this.f72412k.width() - (this.f72403b * fMin)) * 0.5f) + 0.5f);
            float fHeight4 = (int) (((this.f72412k.height() - (this.f72404c * fMin)) * 0.5f) + 0.5f);
            RectF rectF5 = new RectF(fWidth4, fHeight4, fWidth + fWidth4, fHeight + fHeight4);
            this.f72411j = rectF5;
            boolean z14 = this.f72425x;
            rectF5.inset(z14 ? this.f72423v : f10, z14 ? this.f72423v : f10);
            this.f72415n.reset();
            this.f72415n.setScale(fMin, fMin);
            this.f72415n.postTranslate(fWidth4, fHeight4);
        }
        if (this.f72425x) {
            RectF rectF6 = this.f72408g;
            RectF rectF7 = this.f72411j;
            rectF6.set(rectF7.left - f10, rectF7.top - f10, rectF7.right + f10, rectF7.bottom + f10);
        } else {
            this.f72408g.set(this.f72413l);
            this.f72408g.inset(f10, f10);
        }
        this.f72409h.set(this.f72411j);
        this.f72414m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f72413l.set(rect);
        j();
        h();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f72406e.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f72406e.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
