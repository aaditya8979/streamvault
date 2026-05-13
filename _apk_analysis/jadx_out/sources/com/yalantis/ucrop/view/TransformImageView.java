package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import rf.c;
import wf.e;
import wf.g;
import wf.j;

/* JADX INFO: loaded from: classes11.dex */
public class TransformImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f53871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f53872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f53873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Matrix f53874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f53877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f53878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f53879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f53880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f53881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f53882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f53883n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f53884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Uri f53885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f53886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public tf.b f53887r;

    public class a implements c.a<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f53888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f53889b;

        public a(Uri uri, Uri uri2) {
            this.f53888a = uri;
            this.f53889b = uri2;
        }

        @Override // rf.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            if (bitmap == null) {
                TransformImageView.this.n(this.f53888a, this.f53889b);
            } else {
                TransformImageView.this.j(bitmap.copy(bitmap.getConfig(), true), new tf.b(0, 0, 0), this.f53888a, this.f53889b);
            }
        }
    }

    public class b implements sf.b {
        public b() {
        }

        @Override // sf.b
        public void a(@NonNull Bitmap bitmap, @NonNull tf.b bVar, @NonNull Uri uri, @Nullable Uri uri2) {
            TransformImageView.this.j(bitmap, bVar, uri, uri2);
        }

        @Override // sf.b
        public void onFailure(@NonNull Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            c cVar = TransformImageView.this.f53877h;
            if (cVar != null) {
                cVar.b(exc);
            }
        }
    }

    public interface c {
        void a();

        void b(@NonNull Exception exc);

        void c(float f10);

        void d(float f10);
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f53871b = new float[8];
        this.f53872c = new float[2];
        this.f53873d = new float[9];
        this.f53874e = new Matrix();
        this.f53880k = false;
        this.f53881l = false;
        this.f53882m = 0;
        e();
    }

    public float b(@NonNull Matrix matrix) {
        return (float) (-(Math.atan2(d(matrix, 1), d(matrix, 0)) * 57.29577951308232d));
    }

    public float c(@NonNull Matrix matrix) {
        return (float) Math.sqrt(Math.pow(d(matrix, 0), 2.0d) + Math.pow(d(matrix, 3), 2.0d));
    }

    public float d(@NonNull Matrix matrix, @IntRange(from = 0, to = 9) int i10) {
        matrix.getValues(this.f53873d);
        return this.f53873d[i10];
    }

    public void e() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void f() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.f53878i = g.b(rectF);
        this.f53879j = g.a(rectF);
        this.f53881l = true;
        c cVar = this.f53877h;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void g(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f53874e.postRotate(f10, f11, f12);
            setImageMatrix(this.f53874e);
            c cVar = this.f53877h;
            if (cVar != null) {
                cVar.d(b(this.f53874e));
            }
        }
    }

    public float getCurrentAngle() {
        return b(this.f53874e);
    }

    public float getCurrentScale() {
        return c(this.f53874e);
    }

    public tf.b getExifInfo() {
        return this.f53887r;
    }

    public String getImageInputPath() {
        return this.f53883n;
    }

    public Uri getImageInputUri() {
        return this.f53885p;
    }

    public String getImageOutputPath() {
        return this.f53884o;
    }

    public Uri getImageOutputUri() {
        return this.f53886q;
    }

    public int getMaxBitmapSize() {
        if (this.f53882m <= 0) {
            this.f53882m = wf.a.a(getContext());
        }
        return this.f53882m;
    }

    @Nullable
    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof e)) {
            return null;
        }
        return ((e) getDrawable()).a();
    }

    public void h(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f53874e.postScale(f10, f10, f11, f12);
            setImageMatrix(this.f53874e);
            c cVar = this.f53877h;
            if (cVar != null) {
                cVar.c(c(this.f53874e));
            }
        }
    }

    public void i(float f10, float f11) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        this.f53874e.postTranslate(f10, f11);
        setImageMatrix(this.f53874e);
    }

    public void j(@NonNull Bitmap bitmap, @NonNull tf.b bVar, @NonNull Uri uri, @Nullable Uri uri2) {
        this.f53885p = uri;
        this.f53886q = uri2;
        this.f53883n = j.j(uri.toString()) ? uri.toString() : uri.getPath();
        this.f53884o = uri2 != null ? j.j(uri2.toString()) ? uri2.toString() : uri2.getPath() : null;
        this.f53887r = bVar;
        this.f53880k = true;
        setImageBitmap(bitmap);
    }

    public void k(@NonNull Uri uri, @Nullable Uri uri2, boolean z10) {
        if (rf.b.f78903a == null || !z10) {
            n(uri, uri2);
        } else {
            m(uri, uri2);
        }
    }

    public final void l() {
        this.f53874e.mapPoints(this.f53871b, this.f53878i);
        this.f53874e.mapPoints(this.f53872c, this.f53879j);
    }

    public final void m(@NonNull Uri uri, @Nullable Uri uri2) {
        int[] iArrI = wf.a.i(getContext(), uri);
        if (iArrI[0] <= 0 || iArrI[1] <= 0) {
            n(uri, uri2);
        } else {
            rf.b.f78903a.b(getContext(), uri, iArrI[0], iArrI[1], new a(uri, uri2));
        }
    }

    public final void n(@NonNull Uri uri, @Nullable Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        wf.a.e(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new b());
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 || (this.f53880k && !this.f53881l)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f53875f = width - paddingLeft;
            this.f53876g = height - paddingTop;
            f();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new e(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f53874e.set(matrix);
        l();
    }

    public void setMaxBitmapSize(int i10) {
        this.f53882m = i10;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(c cVar) {
        this.f53877h = cVar;
    }
}
