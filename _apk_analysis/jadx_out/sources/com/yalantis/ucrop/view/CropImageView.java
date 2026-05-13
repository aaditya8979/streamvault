package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalantis.ucrop.R$styleable;
import com.yalantis.ucrop.view.TransformImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import sf.c;
import wf.g;

/* JADX INFO: loaded from: classes7.dex */
public class CropImageView extends TransformImageView {
    public float A;
    public int B;
    public int C;
    public long D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f53812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Matrix f53813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f53814u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f53815v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f53816w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f53817x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Runnable f53818y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f53819z;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<CropImageView> f53820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f53821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f53822d = System.currentTimeMillis();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f53823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f53824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f53825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f53826h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f53827i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f53828j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f53829k;

        public a(CropImageView cropImageView, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.f53820b = new WeakReference<>(cropImageView);
            this.f53821c = j10;
            this.f53823e = f10;
            this.f53824f = f11;
            this.f53825g = f12;
            this.f53826h = f13;
            this.f53827i = f14;
            this.f53828j = f15;
            this.f53829k = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = this.f53820b.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.f53821c, System.currentTimeMillis() - this.f53822d);
            float fB = wf.b.b(fMin, 0.0f, this.f53825g, this.f53821c);
            float fB2 = wf.b.b(fMin, 0.0f, this.f53826h, this.f53821c);
            float fA = wf.b.a(fMin, 0.0f, this.f53828j, this.f53821c);
            if (fMin < this.f53821c) {
                float[] fArr = cropImageView.f53872c;
                cropImageView.i(fB - (fArr[0] - this.f53823e), fB2 - (fArr[1] - this.f53824f));
                if (!this.f53829k) {
                    cropImageView.C(this.f53827i + fA, cropImageView.f53812s.centerX(), cropImageView.f53812s.centerY());
                }
                if (cropImageView.u()) {
                    return;
                }
                cropImageView.post(this);
            }
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<CropImageView> f53830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f53831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f53832d = System.currentTimeMillis();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f53833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f53834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f53835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f53836h;

        public b(CropImageView cropImageView, long j10, float f10, float f11, float f12, float f13) {
            this.f53830b = new WeakReference<>(cropImageView);
            this.f53831c = j10;
            this.f53833e = f10;
            this.f53834f = f11;
            this.f53835g = f12;
            this.f53836h = f13;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = this.f53830b.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.f53831c, System.currentTimeMillis() - this.f53832d);
            float fA = wf.b.a(fMin, 0.0f, this.f53834f, this.f53831c);
            if (fMin >= this.f53831c) {
                cropImageView.y();
            } else {
                cropImageView.C(this.f53833e + fA, this.f53835g, this.f53836h);
                cropImageView.post(this);
            }
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f53812s = new RectF();
        this.f53813t = new Matrix();
        this.f53815v = 10.0f;
        this.f53818y = null;
        this.B = 0;
        this.C = 0;
        this.D = 500L;
    }

    public void A(float f10, float f11, float f12, long j10) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j10, currentScale, f10 - currentScale, f11, f12);
        this.f53818y = bVar;
        post(bVar);
    }

    public void B(float f10) {
        C(f10, this.f53812s.centerX(), this.f53812s.centerY());
    }

    public void C(float f10, float f11, float f12) {
        if (f10 <= getMaxScale()) {
            h(f10 / getCurrentScale(), f11, f12);
        }
    }

    public void D(float f10) {
        E(f10, this.f53812s.centerX(), this.f53812s.centerY());
    }

    public void E(float f10, float f11, float f12) {
        if (f10 >= getMinScale()) {
            h(f10 / getCurrentScale(), f11, f12);
        }
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void f() {
        super.f();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.f53814u == 0.0f) {
            this.f53814u = intrinsicWidth / intrinsicHeight;
        }
        int i10 = this.f53875f;
        float f10 = this.f53814u;
        int i11 = (int) (i10 / f10);
        int i12 = this.f53876g;
        if (i11 > i12) {
            this.f53812s.set((i10 - ((int) (i12 * f10))) / 2, 0.0f, r4 + r2, i12);
        } else {
            this.f53812s.set(0.0f, (i12 - i11) / 2, i10, i11 + r6);
        }
        r(intrinsicWidth, intrinsicHeight);
        z(intrinsicWidth, intrinsicHeight);
        c cVar = this.f53816w;
        if (cVar != null) {
            cVar.a(this.f53814u);
        }
        TransformImageView.c cVar2 = this.f53877h;
        if (cVar2 != null) {
            cVar2.c(getCurrentScale());
            this.f53877h.d(getCurrentAngle());
        }
    }

    @Nullable
    public c getCropBoundsChangeListener() {
        return this.f53816w;
    }

    public float getMaxScale() {
        return this.f53819z;
    }

    public float getMinScale() {
        return this.A;
    }

    public float getTargetAspectRatio() {
        return this.f53814u;
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void h(float f10, float f11, float f12) {
        if (f10 > 1.0f && getCurrentScale() * f10 <= getMaxScale()) {
            super.h(f10, f11, f12);
        } else {
            if (f10 >= 1.0f || getCurrentScale() * f10 < getMinScale()) {
                return;
            }
            super.h(f10, f11, f12);
        }
    }

    public final float[] p() {
        this.f53813t.reset();
        this.f53813t.setRotate(-getCurrentAngle());
        float[] fArr = this.f53871b;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        float[] fArrB = g.b(this.f53812s);
        this.f53813t.mapPoints(fArrCopyOf);
        this.f53813t.mapPoints(fArrB);
        RectF rectFD = g.d(fArrCopyOf);
        RectF rectFD2 = g.d(fArrB);
        float f10 = rectFD.left - rectFD2.left;
        float f11 = rectFD.top - rectFD2.top;
        float f12 = rectFD.right - rectFD2.right;
        float f13 = rectFD.bottom - rectFD2.bottom;
        float[] fArr2 = new float[4];
        if (f10 <= 0.0f) {
            f10 = 0.0f;
        }
        fArr2[0] = f10;
        if (f11 <= 0.0f) {
            f11 = 0.0f;
        }
        fArr2[1] = f11;
        if (f12 >= 0.0f) {
            f12 = 0.0f;
        }
        fArr2[2] = f12;
        if (f13 >= 0.0f) {
            f13 = 0.0f;
        }
        fArr2[3] = f13;
        this.f53813t.reset();
        this.f53813t.setRotate(getCurrentAngle());
        this.f53813t.mapPoints(fArr2);
        return fArr2;
    }

    public final void q() {
        if (getDrawable() == null) {
            return;
        }
        r(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
    }

    public final void r(float f10, float f11) {
        float fMin = Math.min(Math.min(this.f53812s.width() / f10, this.f53812s.width() / f11), Math.min(this.f53812s.height() / f11, this.f53812s.height() / f10));
        this.A = fMin;
        this.f53819z = fMin * this.f53815v;
    }

    public void s() {
        removeCallbacks(this.f53817x);
        removeCallbacks(this.f53818y);
    }

    public void setCropBoundsChangeListener(@Nullable c cVar) {
        this.f53816w = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.f53814u = rectF.width() / rectF.height();
        this.f53812s.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        q();
        y();
    }

    public void setImageToWrapCropBounds(boolean z10) {
        float f10;
        float fMax;
        float f11;
        if (!this.f53881l || u()) {
            return;
        }
        float[] fArr = this.f53872c;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float currentScale = getCurrentScale();
        float fCenterX = this.f53812s.centerX() - f12;
        float fCenterY = this.f53812s.centerY() - f13;
        this.f53813t.reset();
        this.f53813t.setTranslate(fCenterX, fCenterY);
        float[] fArr2 = this.f53871b;
        float[] fArrCopyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.f53813t.mapPoints(fArrCopyOf);
        boolean zV = v(fArrCopyOf);
        if (zV) {
            float[] fArrP = p();
            float f14 = -(fArrP[0] + fArrP[2]);
            f11 = -(fArrP[1] + fArrP[3]);
            f10 = f14;
            fMax = 0.0f;
        } else {
            RectF rectF = new RectF(this.f53812s);
            this.f53813t.reset();
            this.f53813t.setRotate(getCurrentAngle());
            this.f53813t.mapRect(rectF);
            float[] fArrC = g.c(this.f53871b);
            f10 = fCenterX;
            fMax = (Math.max(rectF.width() / fArrC[0], rectF.height() / fArrC[1]) * currentScale) - currentScale;
            f11 = fCenterY;
        }
        if (z10) {
            a aVar = new a(this, this.D, f12, f13, f10, f11, currentScale, fMax, zV);
            this.f53817x = aVar;
            post(aVar);
        } else {
            i(f10, f11);
            if (zV) {
                return;
            }
            C(currentScale + fMax, this.f53812s.centerX(), this.f53812s.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(@IntRange(from = 100) long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.D = j10;
    }

    public void setMaxResultImageSizeX(@IntRange(from = 10) int i10) {
        this.B = i10;
    }

    public void setMaxResultImageSizeY(@IntRange(from = 10) int i10) {
        this.C = i10;
    }

    public void setMaxScaleMultiplier(float f10) {
        this.f53815v = f10;
    }

    public void setTargetAspectRatio(float f10) {
        if (getDrawable() == null) {
            this.f53814u = f10;
            return;
        }
        if (f10 == 0.0f) {
            this.f53814u = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        } else {
            this.f53814u = f10;
        }
        c cVar = this.f53816w;
        if (cVar != null) {
            cVar.a(this.f53814u);
        }
    }

    public void t(@NonNull Bitmap.CompressFormat compressFormat, int i10, @Nullable sf.a aVar) {
        s();
        setImageToWrapCropBounds(false);
        tf.c cVar = new tf.c(this.f53812s, g.d(this.f53871b), getCurrentScale(), getCurrentAngle());
        tf.a aVar2 = new tf.a(this.B, this.C, compressFormat, i10, getImageInputPath(), getImageOutputPath(), getExifInfo());
        aVar2.j(getImageInputUri());
        aVar2.k(getImageOutputUri());
        new vf.a(getContext(), getViewBitmap(), cVar, aVar2, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public boolean u() {
        return v(this.f53871b);
    }

    public boolean v(float[] fArr) {
        this.f53813t.reset();
        this.f53813t.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        this.f53813t.mapPoints(fArrCopyOf);
        float[] fArrB = g.b(this.f53812s);
        this.f53813t.mapPoints(fArrB);
        return g.d(fArrCopyOf).contains(g.d(fArrB));
    }

    public void w(float f10) {
        g(f10, this.f53812s.centerX(), this.f53812s.centerY());
    }

    public void x(@NonNull TypedArray typedArray) {
        float fAbs = Math.abs(typedArray.getFloat(R$styleable.ucrop_UCropView_ucrop_aspect_ratio_x, 0.0f));
        float fAbs2 = Math.abs(typedArray.getFloat(R$styleable.ucrop_UCropView_ucrop_aspect_ratio_y, 0.0f));
        if (fAbs == 0.0f || fAbs2 == 0.0f) {
            this.f53814u = 0.0f;
        } else {
            this.f53814u = fAbs / fAbs2;
        }
    }

    public void y() {
        setImageToWrapCropBounds(true);
    }

    public final void z(float f10, float f11) {
        float fWidth = this.f53812s.width();
        float fHeight = this.f53812s.height();
        float fMax = Math.max(this.f53812s.width() / f10, this.f53812s.height() / f11);
        RectF rectF = this.f53812s;
        float f12 = ((fWidth - (f10 * fMax)) / 2.0f) + rectF.left;
        float f13 = ((fHeight - (f11 * fMax)) / 2.0f) + rectF.top;
        this.f53874e.reset();
        this.f53874e.postScale(fMax, fMax);
        this.f53874e.postTranslate(f12, f13);
        setImageMatrix(this.f53874e);
    }
}
