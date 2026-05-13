package bb;

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
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.HashSet;

/* JADX INFO: compiled from: RoundedDrawable.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f5539a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f5540b = new RectF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f5541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f5542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f5543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f5546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f5547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f5548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f5549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Shader.TileMode f5550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Shader.TileMode f5551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f5553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean[] f5554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f5556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f5557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView.ScaleType f5558t;

    /* JADX INFO: renamed from: bb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RoundedDrawable.java */
    public static /* synthetic */ class C0123a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5559a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f5559a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5559a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5559a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5559a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5559a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5559a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5559a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public a(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f5541c = rectF;
        this.f5546h = new RectF();
        this.f5548j = new Matrix();
        this.f5549k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f5550l = tileMode;
        this.f5551m = tileMode;
        this.f5552n = true;
        this.f5553o = 0.0f;
        this.f5554p = new boolean[]{true, true, true, true};
        this.f5555q = false;
        this.f5556r = 0.0f;
        this.f5557s = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.f5558t = ImageView.ScaleType.FIT_CENTER;
        this.f5542d = bitmap;
        int width = bitmap.getWidth();
        this.f5544f = width;
        int height = bitmap.getHeight();
        this.f5545g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f5543e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f5547i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f5557s.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.f5556r);
    }

    public static boolean a(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static Bitmap c(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public static a d(Bitmap bitmap) {
        if (bitmap != null) {
            return new a(bitmap);
        }
        return null;
    }

    public static Drawable e(Drawable drawable) {
        if (drawable == null || (drawable instanceof a)) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap bitmapC = c(drawable);
            return bitmapC != null ? new a(bitmapC) : drawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i10 = 0; i10 < numberOfLayers; i10++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), e(layerDrawable.getDrawable(i10)));
        }
        return layerDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f5552n) {
            BitmapShader bitmapShader = new BitmapShader(this.f5542d, this.f5550l, this.f5551m);
            Shader.TileMode tileMode = this.f5550l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f5551m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f5548j);
            }
            this.f5543e.setShader(bitmapShader);
            this.f5552n = false;
        }
        if (this.f5555q) {
            if (this.f5556r <= 0.0f) {
                canvas.drawOval(this.f5540b, this.f5543e);
                return;
            } else {
                canvas.drawOval(this.f5540b, this.f5543e);
                canvas.drawOval(this.f5546h, this.f5547i);
                return;
            }
        }
        if (!b(this.f5554p)) {
            canvas.drawRect(this.f5540b, this.f5543e);
            if (this.f5556r > 0.0f) {
                canvas.drawRect(this.f5546h, this.f5547i);
                return;
            }
            return;
        }
        float f10 = this.f5553o;
        if (this.f5556r <= 0.0f) {
            canvas.drawRoundRect(this.f5540b, f10, f10, this.f5543e);
            f(canvas);
        } else {
            canvas.drawRoundRect(this.f5540b, f10, f10, this.f5543e);
            canvas.drawRoundRect(this.f5546h, f10, f10, this.f5547i);
            f(canvas);
            g(canvas);
        }
    }

    public final void f(Canvas canvas) {
        if (a(this.f5554p) || this.f5553o == 0.0f) {
            return;
        }
        RectF rectF = this.f5540b;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f5540b.height() + f11;
        float f12 = this.f5553o;
        if (!this.f5554p[0]) {
            this.f5549k.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.f5549k, this.f5543e);
        }
        if (!this.f5554p[1]) {
            this.f5549k.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.f5549k, this.f5543e);
        }
        if (!this.f5554p[2]) {
            this.f5549k.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.f5549k, this.f5543e);
        }
        if (this.f5554p[3]) {
            return;
        }
        this.f5549k.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.f5549k, this.f5543e);
    }

    public final void g(Canvas canvas) {
        float f10;
        if (a(this.f5554p) || this.f5553o == 0.0f) {
            return;
        }
        RectF rectF = this.f5540b;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float fWidth = rectF.width() + f11;
        float fHeight = f12 + this.f5540b.height();
        float f13 = this.f5553o;
        float f14 = this.f5556r / 2.0f;
        if (!this.f5554p[0]) {
            canvas.drawLine(f11 - f14, f12, f11 + f13, f12, this.f5547i);
            canvas.drawLine(f11, f12 - f14, f11, f12 + f13, this.f5547i);
        }
        if (!this.f5554p[1]) {
            canvas.drawLine((fWidth - f13) - f14, f12, fWidth, f12, this.f5547i);
            canvas.drawLine(fWidth, f12 - f14, fWidth, f12 + f13, this.f5547i);
        }
        if (this.f5554p[2]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine((fWidth - f13) - f14, fHeight, fWidth + f14, fHeight, this.f5547i);
            canvas.drawLine(fWidth, fHeight - f10, fWidth, fHeight, this.f5547i);
        }
        if (this.f5554p[3]) {
            return;
        }
        canvas.drawLine(f11 - f14, fHeight, f11 + f10, fHeight, this.f5547i);
        canvas.drawLine(f11, fHeight - f10, f11, fHeight, this.f5547i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5543e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f5543e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5545g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5544f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public a h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5557s = colorStateList;
        this.f5547i.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public a i(float f10) {
        this.f5556r = f10;
        this.f5547i.setStrokeWidth(f10);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f5557s.isStateful();
    }

    public a j(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (hashSet.isEmpty()) {
            this.f5553o = 0.0f;
        } else {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + fFloatValue);
            }
            this.f5553o = fFloatValue;
        }
        boolean[] zArr = this.f5554p;
        zArr[0] = f10 > 0.0f;
        zArr[1] = f11 > 0.0f;
        zArr[2] = f12 > 0.0f;
        zArr[3] = f13 > 0.0f;
        return this;
    }

    public a k(boolean z10) {
        this.f5555q = z10;
        return this;
    }

    public a l(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f5558t != scaleType) {
            this.f5558t = scaleType;
            o();
        }
        return this;
    }

    public a m(Shader.TileMode tileMode) {
        if (this.f5550l != tileMode) {
            this.f5550l = tileMode;
            this.f5552n = true;
            invalidateSelf();
        }
        return this;
    }

    public a n(Shader.TileMode tileMode) {
        if (this.f5551m != tileMode) {
            this.f5551m = tileMode;
            this.f5552n = true;
            invalidateSelf();
        }
        return this;
    }

    public final void o() {
        float fWidth;
        float fHeight;
        int i10 = C0123a.f5559a[this.f5558t.ordinal()];
        if (i10 == 1) {
            this.f5546h.set(this.f5539a);
            RectF rectF = this.f5546h;
            float f10 = this.f5556r;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.f5548j.reset();
            this.f5548j.setTranslate((int) (((this.f5546h.width() - this.f5544f) * 0.5f) + 0.5f), (int) (((this.f5546h.height() - this.f5545g) * 0.5f) + 0.5f));
        } else if (i10 == 2) {
            this.f5546h.set(this.f5539a);
            RectF rectF2 = this.f5546h;
            float f11 = this.f5556r;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.f5548j.reset();
            float fWidth2 = 0.0f;
            if (this.f5544f * this.f5546h.height() > this.f5546h.width() * this.f5545g) {
                fWidth = this.f5546h.height() / this.f5545g;
                fHeight = 0.0f;
                fWidth2 = (this.f5546h.width() - (this.f5544f * fWidth)) * 0.5f;
            } else {
                fWidth = this.f5546h.width() / this.f5544f;
                fHeight = (this.f5546h.height() - (this.f5545g * fWidth)) * 0.5f;
            }
            this.f5548j.setScale(fWidth, fWidth);
            Matrix matrix = this.f5548j;
            float f12 = this.f5556r;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f12 / 2.0f), ((int) (fHeight + 0.5f)) + (f12 / 2.0f));
        } else if (i10 == 3) {
            this.f5548j.reset();
            float fMin = (((float) this.f5544f) > this.f5539a.width() || ((float) this.f5545g) > this.f5539a.height()) ? Math.min(this.f5539a.width() / this.f5544f, this.f5539a.height() / this.f5545g) : 1.0f;
            float fWidth3 = (int) (((this.f5539a.width() - (this.f5544f * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.f5539a.height() - (this.f5545g * fMin)) * 0.5f) + 0.5f);
            this.f5548j.setScale(fMin, fMin);
            this.f5548j.postTranslate(fWidth3, fHeight2);
            this.f5546h.set(this.f5541c);
            this.f5548j.mapRect(this.f5546h);
            RectF rectF3 = this.f5546h;
            float f13 = this.f5556r;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.f5548j.setRectToRect(this.f5541c, this.f5546h, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.f5546h.set(this.f5541c);
            this.f5548j.setRectToRect(this.f5541c, this.f5539a, Matrix.ScaleToFit.END);
            this.f5548j.mapRect(this.f5546h);
            RectF rectF4 = this.f5546h;
            float f14 = this.f5556r;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.f5548j.setRectToRect(this.f5541c, this.f5546h, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.f5546h.set(this.f5541c);
            this.f5548j.setRectToRect(this.f5541c, this.f5539a, Matrix.ScaleToFit.START);
            this.f5548j.mapRect(this.f5546h);
            RectF rectF5 = this.f5546h;
            float f15 = this.f5556r;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.f5548j.setRectToRect(this.f5541c, this.f5546h, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.f5546h.set(this.f5541c);
            this.f5548j.setRectToRect(this.f5541c, this.f5539a, Matrix.ScaleToFit.CENTER);
            this.f5548j.mapRect(this.f5546h);
            RectF rectF6 = this.f5546h;
            float f16 = this.f5556r;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.f5548j.setRectToRect(this.f5541c, this.f5546h, Matrix.ScaleToFit.FILL);
        } else {
            this.f5546h.set(this.f5539a);
            RectF rectF7 = this.f5546h;
            float f17 = this.f5556r;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.f5548j.reset();
            this.f5548j.setRectToRect(this.f5541c, this.f5546h, Matrix.ScaleToFit.FILL);
        }
        this.f5540b.set(this.f5546h);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f5539a.set(rect);
        o();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f5557s.getColorForState(iArr, 0);
        if (this.f5547i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f5547i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5543e.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5543e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f5543e.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f5543e.setFilterBitmap(z10);
        invalidateSelf();
    }
}
