package com.yalantis.ucrop.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;
import com.yalantis.ucrop.R$styleable;
import sf.d;
import wf.c;
import wf.g;

/* JADX INFO: loaded from: classes2.dex */
public class OverlayView extends View {
    public int A;
    public boolean B;
    public d C;
    public ValueAnimator D;
    public boolean E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f53840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f53841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f53844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f53845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f53848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f53849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f53850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f53851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f53852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f53853o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Path f53854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Paint f53855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Paint f53856r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Paint f53857s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Paint f53858t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f53859u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f53860v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f53861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f53862x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f53863y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f53864z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (OverlayView.this.C != null) {
                OverlayView.this.C.b(OverlayView.this.f53840b);
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f53866b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f53867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f53868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ RectF f53869e;

        public b(int i10, int i11, RectF rectF) {
            this.f53867c = i10;
            this.f53868d = i11;
            this.f53869e = rectF;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = this.f53867c * ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float fFloatValue2 = this.f53868d * ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RectF rectF = OverlayView.this.f53840b;
            RectF rectF2 = this.f53869e;
            rectF.set(new RectF(rectF2.left + fFloatValue, rectF2.top + fFloatValue2, rectF2.right + fFloatValue, rectF2.bottom + fFloatValue2));
            OverlayView.this.n();
            OverlayView.this.postInvalidate();
            if (OverlayView.this.C != null) {
                OverlayView.this.C.a(this.f53867c * (((Float) valueAnimator.getAnimatedValue()).floatValue() - this.f53866b), this.f53868d * (((Float) valueAnimator.getAnimatedValue()).floatValue() - this.f53866b));
            }
            this.f53866b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f53840b = new RectF();
        this.f53841c = new RectF();
        this.f53849k = null;
        this.f53854p = new Path();
        this.f53855q = new Paint(1);
        this.f53856r = new Paint(1);
        this.f53857s = new Paint(1);
        this.f53858t = new Paint(1);
        this.f53859u = 0;
        this.f53860v = -1.0f;
        this.f53861w = -1.0f;
        this.f53862x = -1;
        this.f53863y = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.f53864z = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_min_size);
        this.A = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        g();
    }

    public void d(@NonNull Canvas canvas) {
        if (this.f53851m) {
            if (this.f53849k == null && !this.f53840b.isEmpty()) {
                this.f53849k = new float[(this.f53846h * 4) + (this.f53847i * 4)];
                int i10 = 0;
                for (int i11 = 0; i11 < this.f53846h; i11++) {
                    float[] fArr = this.f53849k;
                    int i12 = i10 + 1;
                    RectF rectF = this.f53840b;
                    fArr[i10] = rectF.left;
                    int i13 = i12 + 1;
                    float f10 = i11 + 1.0f;
                    float fHeight = rectF.height() * (f10 / (this.f53846h + 1));
                    RectF rectF2 = this.f53840b;
                    fArr[i12] = fHeight + rectF2.top;
                    float[] fArr2 = this.f53849k;
                    int i14 = i13 + 1;
                    fArr2[i13] = rectF2.right;
                    i10 = i14 + 1;
                    fArr2[i14] = (rectF2.height() * (f10 / (this.f53846h + 1))) + this.f53840b.top;
                }
                for (int i15 = 0; i15 < this.f53847i; i15++) {
                    float[] fArr3 = this.f53849k;
                    int i16 = i10 + 1;
                    float f11 = i15 + 1.0f;
                    float fWidth = this.f53840b.width() * (f11 / (this.f53847i + 1));
                    RectF rectF3 = this.f53840b;
                    fArr3[i10] = fWidth + rectF3.left;
                    float[] fArr4 = this.f53849k;
                    int i17 = i16 + 1;
                    fArr4[i16] = rectF3.top;
                    int i18 = i17 + 1;
                    float fWidth2 = rectF3.width() * (f11 / (this.f53847i + 1));
                    RectF rectF4 = this.f53840b;
                    fArr4[i17] = fWidth2 + rectF4.left;
                    i10 = i18 + 1;
                    this.f53849k[i18] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f53849k;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f53856r);
            }
        }
        if (this.f53850l) {
            canvas.drawRect(this.f53840b, this.f53857s);
        }
        if (this.f53859u != 0) {
            canvas.save();
            this.f53841c.set(this.f53840b);
            this.f53841c.inset(this.A, -r1);
            canvas.clipRect(this.f53841c, Region.Op.DIFFERENCE);
            this.f53841c.set(this.f53840b);
            this.f53841c.inset(-r1, this.A);
            canvas.clipRect(this.f53841c, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f53840b, this.f53858t);
            canvas.restore();
        }
    }

    public void e(@NonNull Canvas canvas) {
        canvas.save();
        if (this.f53852n) {
            canvas.clipPath(this.f53854p, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f53840b, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f53853o);
        canvas.restore();
        if (this.f53852n) {
            canvas.drawCircle(this.f53840b.centerX(), this.f53840b.centerY(), Math.min(this.f53840b.width(), this.f53840b.height()) / 2.0f, this.f53855q);
        }
    }

    public final int f(float f10, float f11) {
        double d10 = this.f53863y;
        int i10 = -1;
        for (int i11 = 0; i11 < 8; i11 += 2) {
            double dSqrt = Math.sqrt(Math.pow(f10 - this.f53844f[i11], 2.0d) + Math.pow(f11 - this.f53844f[i11 + 1], 2.0d));
            if (dSqrt < d10) {
                i10 = i11 / 2;
                d10 = dSqrt;
            }
        }
        if (this.f53859u == 1 && i10 < 0 && this.f53840b.contains(f10, f11)) {
            return 4;
        }
        return i10;
    }

    public void g() {
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.f53840b;
    }

    public int getFreestyleCropMode() {
        return this.f53859u;
    }

    public d getOverlayViewChangeListener() {
        return this.C;
    }

    public final void h(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R$color.ucrop_color_default_crop_frame));
        this.f53857s.setStrokeWidth(dimensionPixelSize);
        this.f53857s.setColor(color);
        this.f53857s.setStyle(Paint.Style.STROKE);
        this.f53858t.setStrokeWidth(dimensionPixelSize * 3);
        this.f53858t.setColor(color);
        this.f53858t.setStyle(Paint.Style.STROKE);
    }

    public final void i(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R$color.ucrop_color_default_crop_grid));
        this.f53856r.setStrokeWidth(dimensionPixelSize);
        this.f53856r.setColor(color);
        this.f53846h = typedArray.getInt(R$styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.f53847i = typedArray.getInt(R$styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    public void j(@NonNull TypedArray typedArray) {
        this.f53852n = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R$color.ucrop_color_default_dimmed));
        this.f53853o = color;
        this.f53855q.setColor(color);
        this.f53855q.setStyle(Paint.Style.STROKE);
        this.f53855q.setStrokeWidth(c.a(getContext(), 1.0f));
        h(typedArray);
        this.f53850l = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_show_frame, true);
        i(typedArray);
        this.f53851m = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_show_grid, true);
    }

    public void k() {
        int i10 = this.f53842d;
        float f10 = this.f53848j;
        int i11 = (int) (i10 / f10);
        int i12 = this.f53843e;
        if (i11 > i12) {
            int i13 = (i10 - ((int) (i12 * f10))) / 2;
            this.f53840b.set(getPaddingLeft() + i13, getPaddingTop(), getPaddingLeft() + r1 + i13, getPaddingTop() + this.f53843e);
        } else {
            int i14 = (i12 - i11) / 2;
            this.f53840b.set(getPaddingLeft(), getPaddingTop() + i14, getPaddingLeft() + this.f53842d, getPaddingTop() + i11 + i14);
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.b(this.f53840b);
        }
        n();
    }

    public final void l() {
        Point point = new Point((getRight() + getLeft()) / 2, (getTop() + getBottom()) / 2);
        int iCenterY = (int) (point.y - this.f53840b.centerY());
        int iCenterX = (int) (point.x - this.f53840b.centerX());
        RectF rectF = new RectF(this.f53840b);
        new RectF(this.f53840b).offset(iCenterX, iCenterY);
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.D = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        this.D.setInterpolator(new OvershootInterpolator(1.0f));
        this.D.addListener(new a());
        this.D.addUpdateListener(new b(iCenterX, iCenterY, rectF));
        this.D.start();
    }

    public final void m(float f10, float f11) {
        this.f53841c.set(this.f53840b);
        int i10 = this.f53862x;
        if (i10 == 0) {
            RectF rectF = this.f53841c;
            RectF rectF2 = this.f53840b;
            rectF.set(f10, f11, rectF2.right, rectF2.bottom);
        } else if (i10 == 1) {
            RectF rectF3 = this.f53841c;
            RectF rectF4 = this.f53840b;
            rectF3.set(rectF4.left, f11, f10, rectF4.bottom);
        } else if (i10 == 2) {
            RectF rectF5 = this.f53841c;
            RectF rectF6 = this.f53840b;
            rectF5.set(rectF6.left, rectF6.top, f10, f11);
        } else if (i10 == 3) {
            RectF rectF7 = this.f53841c;
            RectF rectF8 = this.f53840b;
            rectF7.set(f10, rectF8.top, rectF8.right, f11);
        } else if (i10 == 4) {
            this.f53841c.offset(f10 - this.f53860v, f11 - this.f53861w);
            if (this.f53841c.left <= getLeft() || this.f53841c.top <= getTop() || this.f53841c.right >= getRight() || this.f53841c.bottom >= getBottom()) {
                return;
            }
            this.f53840b.set(this.f53841c);
            n();
            postInvalidate();
            return;
        }
        boolean z10 = this.f53841c.height() >= ((float) this.f53864z);
        boolean z11 = this.f53841c.width() >= ((float) this.f53864z);
        RectF rectF9 = this.f53840b;
        rectF9.set(z11 ? this.f53841c.left : rectF9.left, z10 ? this.f53841c.top : rectF9.top, z11 ? this.f53841c.right : rectF9.right, z10 ? this.f53841c.bottom : rectF9.bottom);
        if (z10 || z11) {
            n();
            postInvalidate();
        }
    }

    public final void n() {
        this.f53844f = g.b(this.f53840b);
        this.f53845g = g.a(this.f53840b);
        this.f53849k = null;
        this.f53854p.reset();
        this.f53854p.addCircle(this.f53840b.centerX(), this.f53840b.centerY(), Math.min(this.f53840b.width(), this.f53840b.height()) / 2.0f, Path.Direction.CW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f53842d = width - paddingLeft;
            this.f53843e = height - paddingTop;
            if (this.E) {
                this.E = false;
                setTargetAspectRatio(this.f53848j);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f53840b.isEmpty() && this.f53859u != 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int iF = f(x10, y10);
                this.f53862x = iF;
                boolean z10 = iF != -1;
                if (!z10) {
                    this.f53860v = -1.0f;
                    this.f53861w = -1.0f;
                } else if (this.f53860v < 0.0f) {
                    this.f53860v = x10;
                    this.f53861w = y10;
                }
                return z10;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.f53862x != -1) {
                float fMin = Math.min(Math.max(x10, getPaddingLeft()), getWidth() - getPaddingRight());
                float fMin2 = Math.min(Math.max(y10, getPaddingTop()), getHeight() - getPaddingBottom());
                m(fMin, fMin2);
                this.f53860v = fMin;
                this.f53861w = fMin2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.f53860v = -1.0f;
                this.f53861w = -1.0f;
                this.f53862x = -1;
                d dVar = this.C;
                if (dVar != null) {
                    dVar.b(this.f53840b);
                }
                if (this.B) {
                    l();
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z10) {
        this.f53852n = z10;
    }

    public void setCircleStrokeColor(@ColorInt int i10) {
        this.f53855q.setColor(i10);
    }

    public void setCropFrameColor(@ColorInt int i10) {
        this.f53857s.setColor(i10);
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i10) {
        this.f53857s.setStrokeWidth(i10);
    }

    public void setCropGridColor(@ColorInt int i10) {
        this.f53856r.setColor(i10);
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i10) {
        this.f53847i = i10;
        this.f53849k = null;
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i10) {
        this.f53846h = i10;
        this.f53849k = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i10) {
        this.f53856r.setStrokeWidth(i10);
    }

    public void setDimmedColor(@ColorInt int i10) {
        this.f53853o = i10;
    }

    public void setDimmedStrokeWidth(@IntRange(from = 0) int i10) {
        this.f53855q.setStrokeWidth(i10);
    }

    public void setDragSmoothToCenter(boolean z10) {
        this.B = z10;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z10) {
        this.f53859u = z10 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i10) {
        this.f53859u = i10;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(d dVar) {
        this.C = dVar;
    }

    public void setShowCropFrame(boolean z10) {
        this.f53850l = z10;
    }

    public void setShowCropGrid(boolean z10) {
        this.f53851m = z10;
    }

    public void setTargetAspectRatio(float f10) {
        this.f53848j = f10;
        if (this.f53842d <= 0) {
            this.E = true;
        } else {
            k();
            postInvalidate();
        }
    }
}
