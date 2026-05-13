package com.mgs.carparking.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.mgs.carparking.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public class CircularImageView extends ImageView {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f45043u = CircularImageView.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f45051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f45052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f45053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BitmapShader f45055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f45056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Paint f45057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Paint f45058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Paint f45059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorFilter f45060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f45061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap f45062t;

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45062t = null;
        b(context, attributeSet, i10);
        this.f45061s = context;
    }

    public Bitmap a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            Log.i(f45043u, "Bitmap drawable!");
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (OutOfMemoryError unused) {
                Log.e(f45043u, "Encountered OutOfMemoryError while generating bitmap!");
            }
        }
        return null;
    }

    public final void b(Context context, AttributeSet attributeSet, int i10) {
        Paint paint = new Paint();
        this.f45057o = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f45058p = paint2;
        paint2.setAntiAlias(true);
        this.f45058p.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.f45059q = paint3;
        paint3.setAntiAlias(true);
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircularImageView, i10, 0);
        this.f45044b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f45045c = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.f45050h = typedArrayObtainStyledAttributes.getBoolean(7, false);
        if (this.f45044b) {
            setBorderWidth(typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f)));
            setBorderColor(typedArrayObtainStyledAttributes.getColor(1, -1));
        }
        if (this.f45045c) {
            int i11 = (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
            setSelectorColor(typedArrayObtainStyledAttributes.getColor(4, 0));
            setSelectorStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, i11));
            setSelectorStrokeColor(typedArrayObtainStyledAttributes.getColor(5, -16776961));
        }
        if (this.f45050h) {
            this.f45051i = typedArrayObtainStyledAttributes.getFloat(11, 4.0f);
            this.f45052j = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            this.f45053k = typedArrayObtainStyledAttributes.getFloat(10, 2.0f);
            this.f45054l = typedArrayObtainStyledAttributes.getColor(8, ViewCompat.MEASURED_STATE_MASK);
            setShadowEnabled(true);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int c(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            size = this.f45048f;
        }
        return size + 2;
    }

    public final int d(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return (mode == 1073741824 || mode == Integer.MIN_VALUE) ? size : this.f45048f;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            this.f45046d = false;
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45046d = true;
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            this.f45046d = false;
        }
        invalidate();
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e() {
        if (this.f45056n == null) {
            return;
        }
        Bitmap bitmap = this.f45056n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f45055m = new BitmapShader(bitmap, tileMode, tileMode);
        if (this.f45048f == this.f45056n.getWidth() && this.f45048f == this.f45056n.getHeight()) {
            return;
        }
        Matrix matrix = new Matrix();
        float width = this.f45048f / this.f45056n.getWidth();
        matrix.setScale(width, width);
        this.f45055m.setLocalMatrix(matrix);
    }

    public final void f() {
        float f10 = this.f45050h ? this.f45051i : 0.0f;
        this.f45058p.setShadowLayer(f10, this.f45052j, this.f45053k, this.f45054l);
        this.f45059q.setShadowLayer(f10, this.f45052j, this.f45053k, this.f45054l);
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f45046d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        Bitmap bitmap = this.f45056n;
        if (bitmap == null || bitmap.getHeight() == 0 || this.f45056n.getWidth() == 0) {
            return;
        }
        int i13 = this.f45048f;
        int width = getWidth() < getHeight() ? getWidth() : getHeight();
        this.f45048f = width;
        if (i13 != width) {
            e();
        }
        this.f45057o.setShader(this.f45055m);
        int i14 = this.f45048f;
        int i15 = i14 / 2;
        if (this.f45045c && this.f45046d) {
            i11 = this.f45049g;
            i12 = (i14 - (i11 * 2)) / 2;
            this.f45057o.setColorFilter(this.f45060r);
            float f10 = i12 + i11;
            canvas.drawCircle(f10, f10, (((this.f45048f - r2) / 2) + i11) - 4.0f, this.f45059q);
        } else {
            if (!this.f45044b) {
                this.f45057o.setColorFilter(null);
                i10 = 0;
                float f11 = i15 + i10;
                canvas.drawCircle(f11, f11, (this.f45048f - (i10 * 2)) / 2, this.f45057o);
            }
            i11 = this.f45047e;
            i12 = (i14 - (i11 * 2)) / 2;
            this.f45057o.setColorFilter(null);
            float f12 = (i11 / 2) + 0;
            int i16 = this.f45048f;
            canvas.drawArc(new RectF(f12, f12, i16 - r2, i16 - r2), 360.0f, 360.0f, false, this.f45058p);
        }
        int i17 = i11;
        i15 = i12;
        i10 = i17;
        float f112 = i15 + i10;
        canvas.drawCircle(f112, f112, (this.f45048f - (i10 * 2)) / 2, this.f45057o);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(d(i10), c(i11));
    }

    public void setBorderColor(int i10) {
        Paint paint = this.f45058p;
        if (paint != null) {
            paint.setColor(i10);
        }
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.f45047e = i10;
        Paint paint = this.f45058p;
        if (paint != null) {
            paint.setStrokeWidth(i10);
        }
        requestLayout();
        invalidate();
    }

    public void setIconModeEnabled(boolean z10) {
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f45056n = bitmap;
        if (this.f45048f > 0) {
            e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f45056n = a(getDrawable());
        if (this.f45048f > 0) {
            e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f45056n = a(getDrawable());
        if (this.f45048f > 0) {
            e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f45056n = a(getDrawable());
        if (this.f45048f > 0) {
            e();
        }
    }

    public void setSelectorColor(int i10) {
        this.f45060r = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
        invalidate();
    }

    public void setSelectorStrokeColor(int i10) {
        Paint paint = this.f45059q;
        if (paint != null) {
            paint.setColor(i10);
        }
        invalidate();
    }

    public void setSelectorStrokeWidth(int i10) {
        this.f45049g = i10;
        requestLayout();
        invalidate();
    }

    public void setShadowEnabled(boolean z10) {
        this.f45050h = z10;
        f();
    }
}
