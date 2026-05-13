package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ui.l0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultTimeBar extends View implements l0 {
    public final float A;
    public int B;
    public long C;
    public int D;
    public Rect E;
    public ValueAnimator F;
    public float G;
    public boolean H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public long M;
    public int N;

    @Nullable
    public long[] O;

    @Nullable
    public boolean[] P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f22504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f22505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f22506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f22507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f22508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f22509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f22510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f22511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f22512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f22513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Drawable f22514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f22515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f22516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f22517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f22518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f22519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f22520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f22521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f22522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f22523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final StringBuilder f22524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Formatter f22525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Runnable f22526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArraySet<l0.a> f22527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Point f22528z;

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i10, @Nullable AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i10, @Nullable AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f22504b = new Rect();
        this.f22505c = new Rect();
        this.f22506d = new Rect();
        this.f22507e = new Rect();
        Paint paint = new Paint();
        this.f22508f = paint;
        Paint paint2 = new Paint();
        this.f22509g = paint2;
        Paint paint3 = new Paint();
        this.f22510h = paint3;
        Paint paint4 = new Paint();
        this.f22511i = paint4;
        Paint paint5 = new Paint();
        this.f22512j = paint5;
        Paint paint6 = new Paint();
        this.f22513k = paint6;
        paint6.setAntiAlias(true);
        this.f22527y = new CopyOnWriteArraySet<>();
        this.f22528z = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.A = f10;
        this.f22523u = d(f10, -50);
        int iD = d(f10, 4);
        int iD2 = d(f10, 26);
        int iD3 = d(f10, 4);
        int iD4 = d(f10, 12);
        int iD5 = d(f10, 0);
        int iD6 = d(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.DefaultTimeBar, i10, i11);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.DefaultTimeBar_scrubber_drawable);
                this.f22514l = drawable;
                if (drawable != null) {
                    p(drawable);
                    iD2 = Math.max(drawable.getMinimumHeight(), iD2);
                }
                this.f22515m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_bar_height, iD);
                this.f22516n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_touch_target_height, iD2);
                this.f22517o = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_bar_gravity, 0);
                this.f22518p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_ad_marker_width, iD3);
                this.f22519q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_enabled_size, iD4);
                this.f22520r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_disabled_size, iD5);
                this.f22521s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_dragged_size, iD6);
                int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_played_color, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_scrubber_color, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_buffered_color, io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
                int i15 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_unplayed_color, io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
                int i16 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_ad_marker_color, io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
                int i17 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_played_ad_marker_color, io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_PLAYED_AD_MARKER_COLOR);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.f22515m = iD;
            this.f22516n = iD2;
            this.f22517o = 0;
            this.f22518p = iD3;
            this.f22519q = iD4;
            this.f22520r = iD5;
            this.f22521s = iD6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
            paint3.setColor(io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
            paint4.setColor(io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
            paint5.setColor(io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_PLAYED_AD_MARKER_COLOR);
            this.f22514l = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f22524v = sb2;
        this.f22525w = new Formatter(sb2, Locale.getDefault());
        this.f22526x = new Runnable() { // from class: com.google.android.exoplayer2.ui.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f22737b.j();
            }
        };
        Drawable drawable2 = this.f22514l;
        if (drawable2 != null) {
            this.f22522t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f22522t = (Math.max(this.f22520r, Math.max(this.f22519q, this.f22521s)) + 1) / 2;
        }
        this.G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.F = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f22739b.k(valueAnimator2);
            }
        });
        this.K = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int d(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.C;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.K;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / ((long) this.B);
    }

    private String getProgressText() {
        return s7.m0.b0(this.f22524v, this.f22525w, this.L);
    }

    private long getScrubberPosition() {
        if (this.f22505c.width() <= 0 || this.K == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f22507e.width()) * this.K) / ((long) this.f22505c.width());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        v(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(ValueAnimator valueAnimator) {
        this.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f22504b);
    }

    public static int m(float f10, int i10) {
        return (int) (i10 / f10);
    }

    public static boolean q(Drawable drawable, int i10) {
        return s7.m0.f79487a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void update() {
        this.f22506d.set(this.f22505c);
        this.f22507e.set(this.f22505c);
        long j10 = this.I ? this.J : this.L;
        if (this.K > 0) {
            int iWidth = (int) ((((long) this.f22505c.width()) * this.M) / this.K);
            Rect rect = this.f22506d;
            Rect rect2 = this.f22505c;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f22505c.width()) * j10) / this.K);
            Rect rect3 = this.f22507e;
            Rect rect4 = this.f22505c;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f22506d;
            int i10 = this.f22505c.left;
            rect5.right = i10;
            this.f22507e.right = i10;
        }
        invalidate(this.f22504b);
    }

    @Override // com.google.android.exoplayer2.ui.l0
    public void a(l0.a aVar) {
        s7.a.e(aVar);
        this.f22527y.add(aVar);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        w();
    }

    public final void e(Canvas canvas) {
        if (this.K <= 0) {
            return;
        }
        Rect rect = this.f22507e;
        int iP = s7.m0.p(rect.right, rect.left, this.f22505c.right);
        int iCenterY = this.f22507e.centerY();
        if (this.f22514l == null) {
            canvas.drawCircle(iP, iCenterY, (int) ((((this.I || isFocused()) ? this.f22521s : isEnabled() ? this.f22519q : this.f22520r) * this.G) / 2.0f), this.f22513k);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.G)) / 2;
        int intrinsicHeight = ((int) (this.f22514l.getIntrinsicHeight() * this.G)) / 2;
        this.f22514l.setBounds(iP - intrinsicWidth, iCenterY - intrinsicHeight, iP + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f22514l.draw(canvas);
    }

    public final void f(Canvas canvas) {
        int iHeight = this.f22505c.height();
        int iCenterY = this.f22505c.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.K <= 0) {
            Rect rect = this.f22505c;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f22510h);
            return;
        }
        Rect rect2 = this.f22506d;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f22505c.left, i12), this.f22507e.right);
        int i13 = this.f22505c.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f22510h);
        }
        int iMax2 = Math.max(i11, this.f22507e.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f22509g);
        }
        if (this.f22507e.width() > 0) {
            Rect rect3 = this.f22507e;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f22508f);
        }
        if (this.N == 0) {
            return;
        }
        long[] jArr = (long[]) s7.a.e(this.O);
        boolean[] zArr = (boolean[]) s7.a.e(this.P);
        int i14 = this.f22518p / 2;
        for (int i15 = 0; i15 < this.N; i15++) {
            int iWidth = ((int) ((((long) this.f22505c.width()) * s7.m0.q(jArr[i15], 0L, this.K)) / this.K)) - i14;
            Rect rect4 = this.f22505c;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f22518p, Math.max(0, iWidth)), iCenterY, r10 + this.f22518p, i10, zArr[i15] ? this.f22512j : this.f22511i);
        }
    }

    public void g(long j10) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.F.setFloatValues(this.G, 0.0f);
        this.F.setDuration(j10);
        this.F.start();
    }

    @Override // com.google.android.exoplayer2.ui.l0
    public long getPreferredUpdateDelay() {
        int iM = m(this.A, this.f22505c.width());
        if (iM != 0) {
            long j10 = this.K;
            if (j10 != 0 && j10 != -9223372036854775807L) {
                return j10 / ((long) iM);
            }
        }
        return Long.MAX_VALUE;
    }

    public void h(boolean z10) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = z10;
        this.G = 0.0f;
        invalidate(this.f22504b);
    }

    public final boolean i(float f10, float f11) {
        return this.f22504b.contains((int) f10, (int) f11);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22514l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void l(float f10) {
        Rect rect = this.f22507e;
        Rect rect2 = this.f22505c;
        rect.right = s7.m0.p((int) f10, rect2.left, rect2.right);
    }

    public final Point n(MotionEvent motionEvent) {
        this.f22528z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f22528z;
    }

    public final boolean o(long j10) {
        long j11 = this.K;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.I ? this.J : this.L;
        long jQ = s7.m0.q(j12 + j10, 0L, j11);
        if (jQ == j12) {
            return false;
        }
        if (this.I) {
            x(jQ);
        } else {
            u(jQ);
        }
        update();
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        f(canvas);
        e(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, @Nullable Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.I || z10) {
            return;
        }
        v(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.K <= 0) {
            return;
        }
        if (s7.m0.f79487a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.o(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f22526x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f22526x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.I
            if (r0 == 0) goto L30
            r5 = 0
            r4.v(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int iMax;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.H ? 0 : this.f22522t;
        if (this.f22517o == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f22516n;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f22515m;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f22516n) / 2;
            iMax = (i15 - this.f22515m) / 2;
        }
        this.f22504b.set(paddingLeft, paddingBottom, paddingRight, this.f22516n + paddingBottom);
        Rect rect = this.f22505c;
        Rect rect2 = this.f22504b;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f22515m + iMax);
        if (s7.m0.f79487a >= 29) {
            r(i14, i15);
        }
        update();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f22516n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f22516n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        w();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f22514l;
        if (drawable == null || !q(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.n(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.I
            if (r8 == 0) goto L76
            int r8 = r7.f22523u
            if (r0 >= r8) goto L3a
            int r8 = r7.D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.l(r8)
            goto L40
        L3a:
            r7.D = r2
            float r8 = (float) r2
            r7.l(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.x(r0)
            r7.update()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.I
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.v(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.i(r8, r0)
            if (r0 == 0) goto L76
            r7.l(r8)
            long r0 = r7.getScrubberPosition()
            r7.u(r0)
            r7.update()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(Drawable drawable) {
        return s7.m0.f79487a >= 23 && q(drawable, getLayoutDirection());
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, @Nullable Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.K <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (o(-getPositionIncrement())) {
                v(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (o(getPositionIncrement())) {
                v(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @RequiresApi(29)
    public final void r(int i10, int i11) {
        Rect rect = this.E;
        if (rect != null && rect.width() == i10 && this.E.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.E = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    public void s() {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = false;
        this.G = 1.0f;
        invalidate(this.f22504b);
    }

    @Override // com.google.android.exoplayer2.ui.l0
    public void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i10) {
        s7.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.N = i10;
        this.O = jArr;
        this.P = zArr;
        update();
    }

    public void setAdMarkerColor(@ColorInt int i10) {
        this.f22511i.setColor(i10);
        invalidate(this.f22504b);
    }

    public void setBufferedColor(@ColorInt int i10) {
        this.f22509g.setColor(i10);
        invalidate(this.f22504b);
    }

    @Override // com.google.android.exoplayer2.ui.l0
    public void setBufferedPosition(long j10) {
        if (this.M == j10) {
            return;
        }
        this.M = j10;
        update();
    }

    @Override // com.google.android.exoplayer2.ui.l0
    public void setDuration(long j10) {
        if (this.K == j10) {
            return;
        }
        this.K = j10;
        if (this.I && j10 == -9223372036854775807L) {
            v(true);
        }
        update();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.l0
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.I || z10) {
            return;
        }
        v(true);
    }

    public void setKeyCountIncrement(int i10) {
        s7.a.a(i10 > 0);
        this.B = i10;
        this.C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        s7.a.a(j10 > 0);
        this.B = -1;
        this.C = j10;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i10) {
        this.f22512j.setColor(i10);
        invalidate(this.f22504b);
    }

    public void setPlayedColor(@ColorInt int i10) {
        this.f22508f.setColor(i10);
        invalidate(this.f22504b);
    }

    @Override // com.google.android.exoplayer2.ui.l0
    public void setPosition(long j10) {
        if (this.L == j10) {
            return;
        }
        this.L = j10;
        setContentDescription(getProgressText());
        update();
    }

    public void setScrubberColor(@ColorInt int i10) {
        this.f22513k.setColor(i10);
        invalidate(this.f22504b);
    }

    public void setUnplayedColor(@ColorInt int i10) {
        this.f22510h.setColor(i10);
        invalidate(this.f22504b);
    }

    public void t(long j10) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = false;
        this.F.setFloatValues(this.G, 1.0f);
        this.F.setDuration(j10);
        this.F.start();
    }

    public final void u(long j10) {
        this.J = j10;
        this.I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<l0.a> it = this.f22527y.iterator();
        while (it.hasNext()) {
            it.next().t(this, j10);
        }
    }

    public final void v(boolean z10) {
        removeCallbacks(this.f22526x);
        this.I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<l0.a> it = this.f22527y.iterator();
        while (it.hasNext()) {
            it.next().o(this, this.J, z10);
        }
    }

    public final void w() {
        Drawable drawable = this.f22514l;
        if (drawable != null && drawable.isStateful() && this.f22514l.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void x(long j10) {
        if (this.J == j10) {
            return;
        }
        this.J = j10;
        Iterator<l0.a> it = this.f22527y.iterator();
        while (it.hasNext()) {
            it.next().r(this, j10);
        }
    }
}
