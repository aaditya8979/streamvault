package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes12.dex */
public class RoundedImageView extends ImageView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Shader.TileMode f35304p = Shader.TileMode.CLAMP;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ImageView.ScaleType[] f35305q = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f35306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f35307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f35308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorFilter f35310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f35312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView.ScaleType f35317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Shader.TileMode f35318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Shader.TileMode f35319o;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35320a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f35320a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35320a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35320a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35320a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35320a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35320a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35320a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f35306b = fArr;
        this.f35308d = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.f35309e = 0.0f;
        this.f35310f = null;
        this.f35311g = false;
        this.f35313i = false;
        this.f35314j = false;
        this.f35315k = false;
        this.f35317m = ImageView.ScaleType.FIT_CENTER;
        Shader.TileMode tileMode = f35304p;
        this.f35318n = tileMode;
        this.f35319o = tileMode;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundedImageView, i10, 0);
        int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.RoundedImageView_android_scaleType, -1);
        if (i11 >= 0) {
            setScaleType(f35305q[i11]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_corner_radius, -1);
        fArr[0] = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_corner_radius_top_left, -1);
        fArr[1] = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_corner_radius_top_right, -1);
        fArr[2] = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_corner_radius_bottom_right, -1);
        fArr[3] = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_corner_radius_bottom_left, -1);
        int length = fArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            float[] fArr2 = this.f35306b;
            if (fArr2[i12] < 0.0f) {
                fArr2[i12] = 0.0f;
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.f35306b.length;
            for (int i13 = 0; i13 < length2; i13++) {
                this.f35306b[i13] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_border_width, -1);
        this.f35309e = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f35309e = 0.0f;
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.RoundedImageView_riv_border_color);
        this.f35308d = colorStateList;
        if (colorStateList == null) {
            this.f35308d = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.f35315k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RoundedImageView_riv_mutate_background, false);
        this.f35314j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RoundedImageView_riv_oval, false);
        int i14 = typedArrayObtainStyledAttributes.getInt(R$styleable.RoundedImageView_riv_tile_mode, -2);
        if (i14 != -2) {
            setTileModeX(b(i14));
            setTileModeY(b(i14));
        }
        int i15 = typedArrayObtainStyledAttributes.getInt(R$styleable.RoundedImageView_riv_tile_mode_x, -2);
        if (i15 != -2) {
            setTileModeX(b(i15));
        }
        int i16 = typedArrayObtainStyledAttributes.getInt(R$styleable.RoundedImageView_riv_tile_mode_y, -2);
        if (i16 != -2) {
            setTileModeY(b(i16));
        }
        g();
        f(true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static Shader.TileMode b(int i10) {
        if (i10 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i10 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i10 != 2) {
            return null;
        }
        return Shader.TileMode.MIRROR;
    }

    public final void a() {
        Drawable drawable = this.f35312h;
        if (drawable == null || !this.f35311g) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f35312h = drawableMutate;
        if (this.f35313i) {
            drawableMutate.setColorFilter(this.f35310f);
        }
    }

    public final Drawable c() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.f35316l;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f35316l, e10);
                this.f35316l = 0;
            }
        }
        return bb.a.e(drawable);
    }

    public void d(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f35306b;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        g();
        f(false);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public final void e(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof bb.a) {
            bb.a aVar = (bb.a) drawable;
            aVar.l(this.f35317m).i(this.f35309e).h(this.f35308d).k(this.f35314j).m(this.f35318n).n(this.f35319o);
            float[] fArr = this.f35306b;
            if (fArr != null) {
                aVar.j(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            a();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                e(layerDrawable.getDrawable(i10));
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f35315k) {
            if (z10) {
                this.f35307c = bb.a.e(this.f35307c);
            }
            e(this.f35307c);
        }
    }

    public final void g() {
        e(this.f35312h);
    }

    @ColorInt
    public int getBorderColor() {
        return this.f35308d.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f35308d;
    }

    public float getBorderWidth() {
        return this.f35309e;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f10 : this.f35306b) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f35317m;
    }

    public Shader.TileMode getTileModeX() {
        return this.f35318n;
    }

    public Shader.TileMode getTileModeY() {
        return this.f35319o;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f35307c = drawable;
        f(true);
        super.setBackgroundDrawable(this.f35307c);
    }

    public void setBorderColor(@ColorInt int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f35308d.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.f35308d = colorStateList;
        g();
        f(false);
        if (this.f35309e > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.f35309e == f10) {
            return;
        }
        this.f35309e = f10;
        g();
        f(false);
        invalidate();
    }

    public void setBorderWidth(@DimenRes int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f35310f != colorFilter) {
            this.f35310f = colorFilter;
            this.f35313i = true;
            this.f35311g = true;
            a();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        d(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(@DimenRes int i10) {
        float dimension = getResources().getDimension(i10);
        d(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f35316l = 0;
        this.f35312h = bb.a.d(bitmap);
        g();
        super.setImageDrawable(this.f35312h);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f35316l = 0;
        this.f35312h = bb.a.e(drawable);
        g();
        super.setImageDrawable(this.f35312h);
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i10) {
        if (this.f35316l != i10) {
            this.f35316l = i10;
            this.f35312h = c();
            g();
            super.setImageDrawable(this.f35312h);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z10) {
        this.f35314j = z10;
        g();
        f(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f35317m != scaleType) {
            this.f35317m = scaleType;
            switch (a.f35320a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            g();
            f(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f35318n == tileMode) {
            return;
        }
        this.f35318n = tileMode;
        g();
        f(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f35319o == tileMode) {
            return;
        }
        this.f35319o = tileMode;
        g();
        f(false);
        invalidate();
    }
}
