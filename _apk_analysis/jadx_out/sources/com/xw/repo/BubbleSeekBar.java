package com.xw.repo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.xw.repo.bubbleseekbar.R$color;
import com.xw.repo.bubbleseekbar.R$styleable;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes12.dex */
public class BubbleSeekBar extends View {
    public boolean A;
    public long B;
    public boolean C;
    public long D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public boolean Q;
    public SparseArray<String> R;
    public float S;
    public boolean T;
    public k U;
    public float V;
    public float W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Paint f53670a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f53671b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Rect f53672b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f53673c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public WindowManager f53674c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f53675d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public i f53676d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f53677e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f53678e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53679f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f53680f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53681g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f53682g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53683h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f53684h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53685i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public WindowManager.LayoutParams f53686i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53687j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int[] f53688j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f53689k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f53690k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f53691l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f53692l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f53693m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f53694m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f53695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f53696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f53697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f53698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f53699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f53700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f53701t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f53702u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f53703v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f53704w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f53705x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f53706y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f53707z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.requestLayout();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.f53690k0 = false;
            BubbleSeekBar.this.z();
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            BubbleSeekBar.this.O = false;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BubbleSeekBar.this.O = false;
            BubbleSeekBar.this.invalidate();
        }
    }

    public class d implements Runnable {

        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (!BubbleSeekBar.this.C) {
                    BubbleSeekBar.this.G();
                }
                BubbleSeekBar.this.O = false;
                BubbleSeekBar.this.invalidate();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!BubbleSeekBar.this.C) {
                    BubbleSeekBar.this.G();
                }
                BubbleSeekBar.this.O = false;
                BubbleSeekBar.this.invalidate();
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.f53676d0.animate().alpha(BubbleSeekBar.this.C ? 1.0f : 0.0f).setDuration(BubbleSeekBar.this.B).setListener(new a()).start();
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BubbleSeekBar.this.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f53675d = bubbleSeekBar.C();
            if (BubbleSeekBar.this.E) {
                BubbleSeekBar.this.M();
            } else {
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                bubbleSeekBar2.f53684h0 = bubbleSeekBar2.B();
                BubbleSeekBar.this.f53686i0.x = (int) (BubbleSeekBar.this.f53684h0 + 0.5f);
                if (BubbleSeekBar.this.f53676d0.getParent() != null) {
                    BubbleSeekBar.this.f53674c0.updateViewLayout(BubbleSeekBar.this.f53676d0, BubbleSeekBar.this.f53686i0);
                }
                BubbleSeekBar.this.f53676d0.a(BubbleSeekBar.this.f53705x ? String.valueOf(BubbleSeekBar.this.getProgressFloat()) : String.valueOf(BubbleSeekBar.this.getProgress()));
            }
            BubbleSeekBar.this.invalidate();
            if (BubbleSeekBar.this.U != null) {
                k kVar = BubbleSeekBar.this.U;
                BubbleSeekBar bubbleSeekBar3 = BubbleSeekBar.this;
                kVar.b(bubbleSeekBar3, bubbleSeekBar3.getProgress(), BubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (!BubbleSeekBar.this.E && !BubbleSeekBar.this.C) {
                BubbleSeekBar.this.G();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f53675d = bubbleSeekBar.C();
            BubbleSeekBar.this.O = false;
            BubbleSeekBar.this.f53690k0 = true;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!BubbleSeekBar.this.E && !BubbleSeekBar.this.C) {
                BubbleSeekBar.this.G();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f53675d = bubbleSeekBar.C();
            BubbleSeekBar.this.O = false;
            BubbleSeekBar.this.f53690k0 = true;
            BubbleSeekBar.this.invalidate();
            if (BubbleSeekBar.this.U != null) {
                k kVar = BubbleSeekBar.this.U;
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                kVar.a(bubbleSeekBar2, bubbleSeekBar2.getProgress(), BubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BubbleSeekBar.this.f53674c0.addView(BubbleSeekBar.this.f53676d0, BubbleSeekBar.this.f53686i0);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.N();
            BubbleSeekBar.this.Q = true;
        }
    }

    public class i extends View {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Paint f53717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Path f53718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RectF f53719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Rect f53720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f53721f;

        public i(BubbleSeekBar bubbleSeekBar, Context context) {
            this(bubbleSeekBar, context, null);
        }

        public i(BubbleSeekBar bubbleSeekBar, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public i(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f53721f = "";
            Paint paint = new Paint();
            this.f53717b = paint;
            paint.setAntiAlias(true);
            this.f53717b.setTextAlign(Paint.Align.CENTER);
            this.f53718c = new Path();
            this.f53719d = new RectF();
            this.f53720e = new Rect();
        }

        public void a(String str) {
            if (str == null || this.f53721f.equals(str)) {
                return;
            }
            this.f53721f = str;
            invalidate();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.f53718c.reset();
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() - (BubbleSeekBar.this.f53678e0 / 3.0f);
            this.f53718c.moveTo(measuredWidth, measuredHeight);
            float measuredWidth2 = (float) (((double) (getMeasuredWidth() / 2.0f)) - ((Math.sqrt(3.0d) / 2.0d) * ((double) BubbleSeekBar.this.f53678e0)));
            float f10 = BubbleSeekBar.this.f53678e0 * 1.5f;
            this.f53718c.quadTo(measuredWidth2 - qf.a.a(2), f10 - qf.a.a(2), measuredWidth2, f10);
            this.f53718c.arcTo(this.f53719d, 150.0f, 240.0f);
            this.f53718c.quadTo(((float) (((double) (getMeasuredWidth() / 2.0f)) + ((Math.sqrt(3.0d) / 2.0d) * ((double) BubbleSeekBar.this.f53678e0)))) + qf.a.a(2), f10 - qf.a.a(2), measuredWidth, measuredHeight);
            this.f53718c.close();
            this.f53717b.setColor(BubbleSeekBar.this.G);
            canvas.drawPath(this.f53718c, this.f53717b);
            this.f53717b.setTextSize(BubbleSeekBar.this.H);
            this.f53717b.setColor(BubbleSeekBar.this.I);
            Paint paint = this.f53717b;
            String str = this.f53721f;
            paint.getTextBounds(str, 0, str.length(), this.f53720e);
            Paint.FontMetrics fontMetrics = this.f53717b.getFontMetrics();
            float f11 = BubbleSeekBar.this.f53678e0;
            float f12 = fontMetrics.descent;
            canvas.drawText(this.f53721f, getMeasuredWidth() / 2.0f, (f11 + ((f12 - fontMetrics.ascent) / 2.0f)) - f12, this.f53717b);
        }

        @Override // android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            setMeasuredDimension(BubbleSeekBar.this.f53678e0 * 3, BubbleSeekBar.this.f53678e0 * 3);
            this.f53719d.set((getMeasuredWidth() / 2.0f) - BubbleSeekBar.this.f53678e0, 0.0f, (getMeasuredWidth() / 2.0f) + BubbleSeekBar.this.f53678e0, BubbleSeekBar.this.f53678e0 * 2);
        }
    }

    public interface j {
        @NonNull
        SparseArray<String> a(int i10, @NonNull SparseArray<String> sparseArray);
    }

    public interface k {
        void a(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10);

        void b(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10);

        void c(BubbleSeekBar bubbleSeekBar, int i10, float f10);
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f53700s = -1;
        this.R = new SparseArray<>();
        this.f53688j0 = new int[2];
        this.f53690k0 = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BubbleSeekBar, i10, 0);
        this.f53671b = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_min, 0.0f);
        this.f53673c = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_max, 100.0f);
        this.f53675d = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_progress, this.f53671b);
        this.f53677e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_is_float_type, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_track_size, qf.a.a(2));
        this.f53679f = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_second_track_size, dimensionPixelSize + qf.a.a(2));
        this.f53681g = dimensionPixelSize2;
        this.f53683h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius, dimensionPixelSize2 + qf.a.a(2));
        this.f53685i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius_on_dragging, this.f53681g * 2);
        this.f53693m = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_count, 10);
        this.f53687j = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_track_color, ContextCompat.getColor(context, R$color.colorPrimary));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_second_track_color, ContextCompat.getColor(context, R$color.colorAccent));
        this.f53689k = color;
        this.f53691l = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_color, color);
        this.f53697p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_text, false);
        this.f53698q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_section_text_size, qf.a.c(14));
        this.f53699r = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_section_text_color, this.f53687j);
        this.f53707z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_seek_step_section, false);
        this.A = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_seek_by_section, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_text_position, -1);
        if (integer == 0) {
            this.f53700s = 0;
        } else if (integer == 1) {
            this.f53700s = 1;
        } else if (integer == 2) {
            this.f53700s = 2;
        } else {
            this.f53700s = -1;
        }
        this.f53701t = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_text_interval, 1);
        this.f53702u = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_thumb_text, false);
        this.f53703v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_text_size, qf.a.c(14));
        this.f53704w = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_text_color, this.f53689k);
        this.G = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_color, this.f53689k);
        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_bubble_text_size, qf.a.c(14));
        this.I = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_text_color, -1);
        this.f53695n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_mark, false);
        this.f53696o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_auto_adjust_section_mark, false);
        this.f53705x = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_progress_in_float, false);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_anim_duration, -1);
        this.B = integer2 < 0 ? 200L : integer2;
        this.f53706y = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_touch_to_seek, false);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_always_show_bubble, false);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_always_show_bubble_delay, 0);
        this.D = integer3 < 0 ? 0L : integer3;
        this.E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_hide_bubble, false);
        this.F = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_rtl, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f53670a0 = paint;
        paint.setAntiAlias(true);
        this.f53670a0.setStrokeCap(Paint.Cap.ROUND);
        this.f53670a0.setTextAlign(Paint.Align.CENTER);
        this.f53672b0 = new Rect();
        this.P = qf.a.a(2);
        H();
        if (this.E) {
            return;
        }
        this.f53674c0 = (WindowManager) context.getSystemService("window");
        i iVar = new i(this, context);
        this.f53676d0 = iVar;
        iVar.a(this.f53705x ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f53686i0 = layoutParams;
        layoutParams.gravity = BadgeDrawable.TOP_START;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.flags = 524328;
        if (qf.a.b() || Build.VERSION.SDK_INT >= 25) {
            this.f53686i0.type = 2;
        } else {
            this.f53686i0.type = 2005;
        }
        D();
    }

    public final float A(float f10) {
        float f11 = this.V;
        if (f10 <= f11) {
            return f11;
        }
        float f12 = this.W;
        if (f10 >= f12) {
            return f12;
        }
        float f13 = 0.0f;
        int i10 = 0;
        while (i10 <= this.f53693m) {
            float f14 = this.N;
            f13 = (i10 * f14) + this.V;
            if (f13 <= f10 && f10 - f13 <= f14) {
                break;
            }
            i10++;
        }
        float f15 = f10 - f13;
        float f16 = this.N;
        return f15 <= f16 / 2.0f ? f13 : ((i10 + 1) * f16) + this.V;
    }

    public final float B() {
        return this.F ? this.f53680f0 - ((this.M * (this.f53675d - this.f53671b)) / this.J) : this.f53680f0 + ((this.M * (this.f53675d - this.f53671b)) / this.J);
    }

    public final float C() {
        float f10;
        float f11;
        if (this.F) {
            f10 = ((this.W - this.L) * this.J) / this.M;
            f11 = this.f53671b;
        } else {
            f10 = ((this.L - this.V) * this.J) / this.M;
            f11 = this.f53671b;
        }
        return f10 + f11;
    }

    public final void D() {
        String strE;
        String strE2;
        this.f53670a0.setTextSize(this.H);
        if (this.f53705x) {
            strE = E(this.F ? this.f53673c : this.f53671b);
        } else {
            strE = this.F ? this.f53677e ? E(this.f53673c) : String.valueOf((int) this.f53673c) : this.f53677e ? E(this.f53671b) : String.valueOf((int) this.f53671b);
        }
        this.f53670a0.getTextBounds(strE, 0, strE.length(), this.f53672b0);
        int iWidth = (this.f53672b0.width() + (this.P * 2)) >> 1;
        if (this.f53705x) {
            strE2 = E(this.F ? this.f53671b : this.f53673c);
        } else {
            strE2 = this.F ? this.f53677e ? E(this.f53671b) : String.valueOf((int) this.f53671b) : this.f53677e ? E(this.f53673c) : String.valueOf((int) this.f53673c);
        }
        this.f53670a0.getTextBounds(strE2, 0, strE2.length(), this.f53672b0);
        int iWidth2 = (this.f53672b0.width() + (this.P * 2)) >> 1;
        int iA = qf.a.a(14);
        this.f53678e0 = iA;
        this.f53678e0 = Math.max(iA, Math.max(iWidth, iWidth2)) + this.P;
    }

    public final String E(float f10) {
        return String.valueOf(F(f10));
    }

    public final float F(float f10) {
        return BigDecimal.valueOf(f10).setScale(1, 4).floatValue();
    }

    public final void G() {
        i iVar = this.f53676d0;
        if (iVar == null) {
            return;
        }
        iVar.setVisibility(8);
        if (this.f53676d0.getParent() != null) {
            this.f53674c0.removeViewImmediate(this.f53676d0);
        }
    }

    public final void H() {
        if (this.f53671b == this.f53673c) {
            this.f53671b = 0.0f;
            this.f53673c = 100.0f;
        }
        float f10 = this.f53671b;
        float f11 = this.f53673c;
        if (f10 > f11) {
            this.f53673c = f10;
            this.f53671b = f11;
        }
        float f12 = this.f53675d;
        float f13 = this.f53671b;
        if (f12 < f13) {
            this.f53675d = f13;
        }
        float f14 = this.f53675d;
        float f15 = this.f53673c;
        if (f14 > f15) {
            this.f53675d = f15;
        }
        int i10 = this.f53681g;
        int i11 = this.f53679f;
        if (i10 < i11) {
            this.f53681g = i11 + qf.a.a(2);
        }
        int i12 = this.f53683h;
        int i13 = this.f53681g;
        if (i12 <= i13) {
            this.f53683h = i13 + qf.a.a(2);
        }
        int i14 = this.f53685i;
        int i15 = this.f53681g;
        if (i14 <= i15) {
            this.f53685i = i15 * 2;
        }
        if (this.f53693m <= 0) {
            this.f53693m = 10;
        }
        float f16 = this.f53673c - this.f53671b;
        this.J = f16;
        float f17 = f16 / this.f53693m;
        this.K = f17;
        if (f17 < 1.0f) {
            this.f53677e = true;
        }
        if (this.f53677e) {
            this.f53705x = true;
        }
        int i16 = this.f53700s;
        if (i16 != -1) {
            this.f53697p = true;
        }
        if (this.f53697p) {
            if (i16 == -1) {
                this.f53700s = 0;
            }
            if (this.f53700s == 2) {
                this.f53695n = true;
            }
        }
        if (this.f53701t < 1) {
            this.f53701t = 1;
        }
        I();
        if (this.f53707z) {
            this.A = false;
            this.f53696o = false;
        }
        if (this.f53696o && !this.f53695n) {
            this.f53696o = false;
        }
        if (this.A) {
            float f18 = this.f53671b;
            this.f53692l0 = f18;
            if (this.f53675d != f18) {
                this.f53692l0 = this.K;
            }
            this.f53695n = true;
            this.f53696o = true;
        }
        if (this.E) {
            this.C = false;
        }
        if (this.C) {
            setProgress(this.f53675d);
        }
        this.f53703v = (this.f53677e || this.A || (this.f53697p && this.f53700s == 2)) ? this.f53698q : this.f53703v;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e A[PHI: r5
      0x004e: PHI (r5v3 float) = (r5v2 float), (r5v2 float), (r5v2 float), (r5v7 float) binds: [B:26:0x0049, B:27:0x004b, B:19:0x002e, B:25:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            r8 = this;
            int r0 = r8.f53700s
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L9
            r0 = r3
            goto La
        L9:
            r0 = r2
        La:
            int r4 = r8.f53701t
            if (r4 <= r3) goto L14
            int r4 = r8.f53693m
            int r4 = r4 % r1
            if (r4 != 0) goto L14
            goto L15
        L14:
            r3 = r2
        L15:
            int r1 = r8.f53693m
            if (r2 > r1) goto L71
            boolean r4 = r8.F
            if (r4 == 0) goto L25
            float r5 = r8.f53673c
            float r6 = r8.K
            float r7 = (float) r2
            float r6 = r6 * r7
            float r5 = r5 - r6
            goto L2c
        L25:
            float r5 = r8.f53671b
            float r6 = r8.K
            float r7 = (float) r2
            float r6 = r6 * r7
            float r5 = r5 + r6
        L2c:
            if (r0 == 0) goto L49
            if (r3 == 0) goto L4e
            int r1 = r8.f53701t
            int r1 = r2 % r1
            if (r1 != 0) goto L6e
            if (r4 == 0) goto L40
            float r1 = r8.f53673c
            float r4 = r8.K
            float r5 = (float) r2
            float r4 = r4 * r5
            float r1 = r1 - r4
            goto L47
        L40:
            float r1 = r8.f53671b
            float r4 = r8.K
            float r5 = (float) r2
            float r4 = r4 * r5
            float r1 = r1 + r4
        L47:
            r5 = r1
            goto L4e
        L49:
            if (r2 == 0) goto L4e
            if (r2 == r1) goto L4e
            goto L6e
        L4e:
            android.util.SparseArray<java.lang.String> r1 = r8.R
            boolean r4 = r8.f53677e
            if (r4 == 0) goto L59
            java.lang.String r4 = r8.E(r5)
            goto L6b
        L59:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = (int) r5
            r4.append(r5)
            java.lang.String r5 = ""
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L6b:
            r1.put(r2, r4)
        L6e:
            int r2 = r2 + 1
            goto L15
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xw.repo.BubbleSeekBar.I():void");
    }

    public final boolean J(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float f10 = (this.M / this.J) * (this.f53675d - this.f53671b);
        float f11 = this.F ? this.W - f10 : this.V + f10;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        return ((motionEvent.getX() - f11) * (motionEvent.getX() - f11)) + ((motionEvent.getY() - measuredHeight) * (motionEvent.getY() - measuredHeight)) <= (this.V + ((float) qf.a.a(8))) * (this.V + ((float) qf.a.a(8)));
    }

    public final boolean K(MotionEvent motionEvent) {
        return isEnabled() && motionEvent.getX() >= ((float) getPaddingLeft()) && motionEvent.getX() <= ((float) (getMeasuredWidth() - getPaddingRight())) && motionEvent.getY() >= ((float) getPaddingTop()) && motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    public final void L() {
        Window window;
        getLocationInWindow(this.f53688j0);
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            if (view.getMeasuredWidth() > 0) {
                int[] iArr = this.f53688j0;
                iArr[0] = iArr[0] % view.getMeasuredWidth();
            }
        }
        if (this.F) {
            this.f53680f0 = (this.f53688j0[0] + this.W) - (this.f53676d0.getMeasuredWidth() / 2.0f);
        } else {
            this.f53680f0 = (this.f53688j0[0] + this.V) - (this.f53676d0.getMeasuredWidth() / 2.0f);
        }
        this.f53684h0 = B();
        float measuredHeight = this.f53688j0[1] - this.f53676d0.getMeasuredHeight();
        this.f53682g0 = measuredHeight;
        this.f53682g0 = measuredHeight - qf.a.a(24);
        if (qf.a.b()) {
            this.f53682g0 -= qf.a.a(4);
        }
        Context context = getContext();
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (window.getAttributes().flags & 1024) == 0) {
            return;
        }
        Resources system = Resources.getSystem();
        this.f53682g0 += system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public final float M() {
        float f10 = this.f53675d;
        if (!this.A || !this.T) {
            return f10;
        }
        float f11 = this.K / 2.0f;
        if (this.f53706y) {
            if (f10 == this.f53671b || f10 == this.f53673c) {
                return f10;
            }
            for (int i10 = 0; i10 <= this.f53693m; i10++) {
                float f12 = this.K;
                float f13 = i10 * f12;
                if (f13 < f10 && f13 + f12 >= f10) {
                    return f11 + f13 > f10 ? f13 : f13 + f12;
                }
            }
        }
        float f14 = this.f53692l0;
        if (f10 >= f14) {
            if (f10 < f11 + f14) {
                return f14;
            }
            float f15 = f14 + this.K;
            this.f53692l0 = f15;
            return f15;
        }
        if (f10 >= f14 - f11) {
            return f14;
        }
        float f16 = f14 - this.K;
        this.f53692l0 = f16;
        return f16;
    }

    public final void N() {
        i iVar = this.f53676d0;
        if (iVar == null || iVar.getParent() != null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f53686i0;
        layoutParams.x = (int) (this.f53684h0 + 0.5f);
        layoutParams.y = (int) (this.f53682g0 + 0.5f);
        this.f53676d0.setAlpha(0.0f);
        this.f53676d0.setVisibility(0);
        this.f53676d0.animate().alpha(1.0f).setDuration(this.f53706y ? 0L : this.B).setListener(new g()).start();
        this.f53676d0.a(this.f53705x ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
    }

    public float getMax() {
        return this.f53673c;
    }

    public float getMin() {
        return this.f53671b;
    }

    public k getOnProgressChangedListener() {
        return this.U;
    }

    public int getProgress() {
        return Math.round(M());
    }

    public float getProgressFloat() {
        return F(M());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        G();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0258  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xw.repo.BubbleSeekBar.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.E) {
            return;
        }
        L();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iMax = this.f53685i * 2;
        if (this.f53702u) {
            this.f53670a0.setTextSize(this.f53703v);
            this.f53670a0.getTextBounds("j", 0, 1, this.f53672b0);
            iMax += this.f53672b0.height();
        }
        if (this.f53697p && this.f53700s >= 1) {
            this.f53670a0.setTextSize(this.f53698q);
            this.f53670a0.getTextBounds("j", 0, 1, this.f53672b0);
            iMax = Math.max(iMax, (this.f53685i * 2) + this.f53672b0.height());
        }
        setMeasuredDimension(View.resolveSize(qf.a.a(BaseTransientBottomBar.ANIMATION_FADE_DURATION), i10), iMax + (this.P * 2));
        this.V = getPaddingLeft() + this.f53685i;
        this.W = (getMeasuredWidth() - getPaddingRight()) - this.f53685i;
        if (this.f53697p) {
            this.f53670a0.setTextSize(this.f53698q);
            int i12 = this.f53700s;
            if (i12 == 0) {
                String str = this.R.get(0);
                this.f53670a0.getTextBounds(str, 0, str.length(), this.f53672b0);
                this.V += this.f53672b0.width() + this.P;
                String str2 = this.R.get(this.f53693m);
                this.f53670a0.getTextBounds(str2, 0, str2.length(), this.f53672b0);
                this.W -= this.f53672b0.width() + this.P;
            } else if (i12 >= 1) {
                String str3 = this.R.get(0);
                this.f53670a0.getTextBounds(str3, 0, str3.length(), this.f53672b0);
                this.V = getPaddingLeft() + Math.max(this.f53685i, this.f53672b0.width() / 2.0f) + this.P;
                String str4 = this.R.get(this.f53693m);
                this.f53670a0.getTextBounds(str4, 0, str4.length(), this.f53672b0);
                this.W = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f53685i, this.f53672b0.width() / 2.0f)) - this.P;
            }
        } else if (this.f53702u && this.f53700s == -1) {
            this.f53670a0.setTextSize(this.f53703v);
            String str5 = this.R.get(0);
            this.f53670a0.getTextBounds(str5, 0, str5.length(), this.f53672b0);
            this.V = getPaddingLeft() + Math.max(this.f53685i, this.f53672b0.width() / 2.0f) + this.P;
            String str6 = this.R.get(this.f53693m);
            this.f53670a0.getTextBounds(str6, 0, str6.length(), this.f53672b0);
            this.W = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f53685i, this.f53672b0.width() / 2.0f)) - this.P;
        }
        float f10 = this.W - this.V;
        this.M = f10;
        this.N = (f10 * 1.0f) / this.f53693m;
        if (this.E) {
            return;
        }
        this.f53676d0.measure(i10, i11);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f53675d = bundle.getFloat("progress");
        super.onRestoreInstanceState(bundle.getParcelable("save_instance"));
        i iVar = this.f53676d0;
        if (iVar != null) {
            iVar.a(this.f53705x ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        }
        setProgress(this.f53675d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("save_instance", super.onSaveInstanceState());
        bundle.putFloat("progress", this.f53675d);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xw.repo.BubbleSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        if (this.E || !this.C) {
            return;
        }
        if (i10 != 0) {
            G();
        } else if (this.Q) {
            N();
        }
        super.onVisibilityChanged(view, i10);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setBubbleColor(@ColorInt int i10) {
        if (this.G != i10) {
            this.G = i10;
            i iVar = this.f53676d0;
            if (iVar != null) {
                iVar.invalidate();
            }
        }
    }

    public void setCustomSectionTextArray(@NonNull j jVar) {
        this.R = jVar.a(this.f53693m, this.R);
        for (int i10 = 0; i10 <= this.f53693m; i10++) {
            if (this.R.get(i10) == null) {
                this.R.put(i10, "");
            }
        }
        this.f53702u = false;
        requestLayout();
        invalidate();
    }

    public void setOnProgressChangedListener(k kVar) {
        this.U = kVar;
    }

    public void setProgress(float f10) {
        this.f53675d = f10;
        k kVar = this.U;
        if (kVar != null) {
            kVar.b(this, getProgress(), getProgressFloat(), false);
            this.U.a(this, getProgress(), getProgressFloat(), false);
        }
        if (!this.E) {
            this.f53684h0 = B();
        }
        if (this.C) {
            G();
            postDelayed(new h(), this.D);
        }
        if (this.A) {
            this.T = false;
        }
        postInvalidate();
    }

    public void setSecondTrackColor(@ColorInt int i10) {
        if (this.f53689k != i10) {
            this.f53689k = i10;
            invalidate();
        }
    }

    public void setThumbColor(@ColorInt int i10) {
        if (this.f53691l != i10) {
            this.f53691l = i10;
            invalidate();
        }
    }

    public void setTrackColor(@ColorInt int i10) {
        if (this.f53687j != i10) {
            this.f53687j = i10;
            invalidate();
        }
    }

    public final void z() {
        float f10 = 0.0f;
        int i10 = 0;
        while (i10 <= this.f53693m) {
            float f11 = this.N;
            f10 = (i10 * f11) + this.V;
            float f12 = this.L;
            if (f10 <= f12 && f12 - f10 <= f11) {
                break;
            } else {
                i10++;
            }
        }
        boolean z10 = BigDecimal.valueOf((double) this.L).setScale(1, 4).floatValue() == f10;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = null;
        if (!z10) {
            float f13 = this.L;
            float f14 = f13 - f10;
            float f15 = this.N;
            valueAnimatorOfFloat = f14 <= f15 / 2.0f ? ValueAnimator.ofFloat(f13, f10) : ValueAnimator.ofFloat(f13, ((i10 + 1) * f15) + this.V);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new e());
        }
        if (!this.E) {
            i iVar = this.f53676d0;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = this.C ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(iVar, (Property<i, Float>) property, fArr);
            if (z10) {
                animatorSet.setDuration(this.B).play(objectAnimatorOfFloat);
            } else {
                animatorSet.setDuration(this.B).playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
            }
        } else if (!z10) {
            animatorSet.setDuration(this.B).playTogether(valueAnimatorOfFloat);
        }
        animatorSet.addListener(new f());
        animatorSet.start();
    }
}
