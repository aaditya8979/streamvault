package com.ruffian.library.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import je.a;

/* JADX INFO: loaded from: classes12.dex */
public class RImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f51457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f51458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f51459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f51460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f51461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f51462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f51464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f51465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView.ScaleType f51466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f51467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorFilter f51468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PorterDuff.Mode f51469n;

    public RImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51457b = -1.0f;
        this.f51458c = 0.0f;
        this.f51459d = 0.0f;
        this.f51460e = 0.0f;
        this.f51461f = 0.0f;
        this.f51462g = 0.0f;
        this.f51463h = ViewCompat.MEASURED_STATE_MASK;
        this.f51464i = false;
        this.f51469n = PorterDuff.Mode.SRC_ATOP;
        b(context, attributeSet);
    }

    public final void a() {
        if (this.f51465j == null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                return;
            }
            Drawable background = getBackground();
            if (background == null) {
                setImageBitmap(Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ALPHA_8));
            } else {
                background.setBounds(0, 0, measuredWidth, measuredHeight);
                setImageDrawable(background);
            }
        }
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RImageView);
        this.f51464i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RImageView_is_circle, false);
        this.f51457b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_corner_radius, -1);
        this.f51458c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_corner_radius_top_left, 0);
        this.f51459d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_corner_radius_top_right, 0);
        this.f51460e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_corner_radius_bottom_left, 0);
        this.f51461f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_corner_radius_bottom_right, 0);
        this.f51462g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_border_width, 0);
        this.f51463h = typedArrayObtainStyledAttributes.getColor(R$styleable.RImageView_border_color, ViewCompat.MEASURED_STATE_MASK);
        attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "tint", 0);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "tintMode", 0);
        if (attributeIntValue != 0) {
            this.f51469n = g(attributeIntValue);
        }
        setImageTintList(getImageTintList());
        typedArrayObtainStyledAttributes.recycle();
        f();
    }

    public final Drawable c() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.f51467l;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception unused) {
                this.f51467l = 0;
            }
        }
        return a.c(drawable);
    }

    public void d() {
        Drawable drawable;
        ColorFilter colorFilter = this.f51468m;
        if (colorFilter == null || (drawable = this.f51465j) == null) {
            return;
        }
        drawable.setColorFilter(colorFilter);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public final void e(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof a) {
            ((a) drawable).e(scaleType, this.f51462g, this.f51463h, this.f51464i, this.f51457b, this.f51458c, this.f51459d, this.f51460e, this.f51461f);
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                e(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public final void f() {
        e(this.f51465j, this.f51466k);
        d();
    }

    public final PorterDuff.Mode g(int i10) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return PorterDuff.Mode.SRC_ATOP;
        }
    }

    public int getBorderColor() {
        return this.f51463h;
    }

    public float getBorderWidth() {
        return this.f51462g;
    }

    public float getCorner() {
        return this.f51457b;
    }

    public float getCornerBottomLeft() {
        return this.f51460e;
    }

    public float getCornerBottomRight() {
        return this.f51461f;
    }

    public float getCornerTopLeft() {
        return this.f51458c;
    }

    public float getCornerTopRight() {
        return this.f51459d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f51467l = 0;
        this.f51465j = a.b(bitmap);
        f();
        super.setImageDrawable(this.f51465j);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f51467l = 0;
        this.f51465j = a.c(drawable);
        f();
        super.setImageDrawable(this.f51465j);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int i10) {
        if (this.f51467l != i10) {
            this.f51467l = i10;
            this.f51465j = c();
            f();
            super.setImageDrawable(this.f51465j);
        }
    }

    @Override // android.widget.ImageView
    public void setImageTintList(@Nullable ColorStateList colorStateList) {
        super.setImageTintList(colorStateList);
        if (colorStateList != null) {
            this.f51468m = new PorterDuffColorFilter(colorStateList.getDefaultColor(), this.f51469n);
        }
        d();
    }

    @Override // android.widget.ImageView
    public void setImageTintMode(@Nullable PorterDuff.Mode mode) {
        super.setImageTintMode(mode);
        this.f51469n = mode;
        d();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        if (this.f51466k != scaleType) {
            this.f51466k = scaleType;
            f();
            invalidate();
        }
    }
}
