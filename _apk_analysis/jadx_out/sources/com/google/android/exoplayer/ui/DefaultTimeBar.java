package com.google.android.exoplayer.ui;

import a6.k0;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import chuangyuan.ycj.videolibrary.R$styleable;
import com.google.android.exoplayer.ui.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultTimeBar extends View implements com.google.android.exoplayer.ui.a {
    public int A;
    public int[] B;
    public Point C;
    public boolean D;
    public long E;
    public long F;
    public long G;
    public long H;
    public int I;
    public long[] J;
    public boolean[] K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f20878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f20879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f20880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f20881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f20882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f20883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f20884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f20885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f20886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f20887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Drawable f20888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f20889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f20890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f20891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f20892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f20893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f20894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f20895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f20896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final StringBuilder f20897u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Formatter f20898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f20899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet<a.InterfaceC0295a> f20900x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f20901y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f20902z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultTimeBar.this.s(false);
        }
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        boolean z10;
        super(context, attributeSet);
        this.f20878b = new Rect();
        this.f20879c = new Rect();
        this.f20880d = new Rect();
        this.f20881e = new Rect();
        Paint paint = new Paint();
        this.f20882f = paint;
        Paint paint2 = new Paint();
        this.f20883g = paint2;
        Paint paint3 = new Paint();
        this.f20884h = paint3;
        Paint paint4 = new Paint();
        this.f20885i = paint4;
        Paint paint5 = new Paint();
        this.f20886j = paint5;
        Paint paint6 = new Paint();
        this.f20887k = paint6;
        paint6.setAntiAlias(true);
        this.f20900x = new CopyOnWriteArraySet<>();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f20896t = d(displayMetrics, -50);
        int iD = d(displayMetrics, 4);
        int iD2 = d(displayMetrics, 26);
        int iD3 = d(displayMetrics, 4);
        int iD4 = d(displayMetrics, 12);
        int iD5 = d(displayMetrics, 0);
        int iD6 = d(displayMetrics, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.DefaultTimeBar, 0, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.DefaultTimeBar_scrubber_drawable);
                this.f20888l = drawable;
                if (drawable != null) {
                    p(drawable);
                    iD2 = Math.max(drawable.getMinimumHeight(), iD2);
                }
                this.f20889m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_bar_height, iD);
                this.f20890n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_touch_target_height, iD2);
                this.f20891o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_ad_marker_width, iD3);
                this.f20892p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_enabled_size, iD4);
                this.f20893q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_disabled_size, iD5);
                this.f20894r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_dragged_size, iD6);
                int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_played_color, -1);
                int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_scrubber_color, i(i10));
                int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_buffered_color, g(i10));
                int i13 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_unplayed_color, j(i10));
                int i14 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_ad_marker_color, io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
                int i15 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_played_ad_marker_color, h(i14));
                paint.setColor(i10);
                paint6.setColor(i11);
                paint2.setColor(i12);
                paint3.setColor(i13);
                paint4.setColor(i14);
                paint5.setColor(i15);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.f20889m = iD;
            this.f20890n = iD2;
            this.f20891o = iD3;
            this.f20892p = iD4;
            this.f20893q = iD5;
            this.f20894r = iD6;
            paint.setColor(-1);
            paint6.setColor(i(-1));
            paint2.setColor(g(-1));
            paint3.setColor(j(-1));
            paint4.setColor(io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
            this.f20888l = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f20897u = sb2;
        this.f20898v = new Formatter(sb2, Locale.getDefault());
        this.f20899w = new a();
        Drawable drawable2 = this.f20888l;
        if (drawable2 != null) {
            z10 = true;
            this.f20895s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            z10 = true;
            this.f20895s = (Math.max(this.f20893q, Math.max(this.f20892p, this.f20894r)) + 1) / 2;
        }
        this.F = -9223372036854775807L;
        this.f20902z = -9223372036854775807L;
        this.f20901y = 20;
        setFocusable(z10);
        if (k0.f3574a >= 16) {
            l();
        }
    }

    public static int d(DisplayMetrics displayMetrics, int i10) {
        return (int) ((i10 * displayMetrics.density) + 0.5f);
    }

    public static int g(int i10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (-872415232);
    }

    private long getPositionIncrement() {
        long j10 = this.f20902z;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.F;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / ((long) this.f20901y);
    }

    private String getProgressText() {
        return k0.V(this.f20897u, this.f20898v, this.G);
    }

    private long getScrubberPosition() {
        if (this.f20879c.width() <= 0 || this.F == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f20881e.width()) * this.F) / ((long) this.f20879c.width());
    }

    public static int h(int i10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | 855638016;
    }

    public static int i(int i10) {
        return i10 | ViewCompat.MEASURED_STATE_MASK;
    }

    public static int j(int i10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | 855638016;
    }

    public static boolean q(Drawable drawable, int i10) {
        return k0.f3574a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void update() {
        this.f20880d.set(this.f20879c);
        this.f20881e.set(this.f20879c);
        long j10 = this.D ? this.E : this.G;
        if (this.F > 0) {
            int iWidth = (int) ((((long) this.f20879c.width()) * this.H) / this.F);
            Rect rect = this.f20880d;
            Rect rect2 = this.f20879c;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f20879c.width()) * j10) / this.F);
            Rect rect3 = this.f20881e;
            Rect rect4 = this.f20879c;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f20880d;
            int i10 = this.f20879c.left;
            rect5.right = i10;
            this.f20881e.right = i10;
        }
        invalidate(this.f20878b);
    }

    @Override // com.google.android.exoplayer.ui.a
    public void a(a.InterfaceC0295a interfaceC0295a) {
        this.f20900x.add(interfaceC0295a);
    }

    public boolean b() {
        return true;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        t();
    }

    public final void e(Canvas canvas) {
        if (this.F <= 0) {
            return;
        }
        Rect rect = this.f20881e;
        int iQ = k0.q(rect.right, rect.left, this.f20879c.right);
        int iCenterY = this.f20881e.centerY();
        Drawable drawable = this.f20888l;
        if (drawable == null) {
            canvas.drawCircle(iQ, iCenterY, ((this.D || isFocused()) ? this.f20894r : isEnabled() ? this.f20892p : this.f20893q) / 2, this.f20887k);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = this.f20888l.getIntrinsicHeight() / 2;
        this.f20888l.setBounds(iQ - intrinsicWidth, iCenterY - intrinsicHeight, iQ + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f20888l.draw(canvas);
    }

    public final void f(Canvas canvas) {
        int iHeight = this.f20879c.height();
        int iCenterY = this.f20879c.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.F <= 0) {
            Rect rect = this.f20879c;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f20884h);
            return;
        }
        Rect rect2 = this.f20880d;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f20879c.left, i12), this.f20881e.right);
        int i13 = this.f20879c.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f20884h);
        }
        int iMax2 = Math.max(i11, this.f20881e.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f20883g);
        }
        if (this.f20881e.width() > 0) {
            Rect rect3 = this.f20881e;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f20882f);
        }
        int i14 = this.f20891o / 2;
        for (int i15 = 0; i15 < this.I; i15++) {
            int iWidth = ((int) ((((long) this.f20879c.width()) * k0.r(this.J[i15], 0L, this.F)) / this.F)) - i14;
            Rect rect4 = this.f20879c;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f20891o, Math.max(0, iWidth)), iCenterY, r7 + this.f20891o, i10, this.K[i15] ? this.f20886j : this.f20885i);
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f20888l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final boolean k(float f10, float f11) {
        return this.f20878b.contains((int) f10, (int) f11);
    }

    @TargetApi(16)
    public final void l() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public final void m(float f10) {
        Rect rect = this.f20881e;
        Rect rect2 = this.f20879c;
        rect.right = k0.q((int) f10, rect2.left, rect2.right);
    }

    public final Point n(MotionEvent motionEvent) {
        if (this.B == null) {
            this.B = new int[2];
            this.C = new Point();
        }
        getLocationOnScreen(this.B);
        this.C.set(((int) motionEvent.getRawX()) - this.B[0], ((int) motionEvent.getRawY()) - this.B[1]);
        return this.C;
    }

    public final boolean o(long j10) {
        if (this.F <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        long jR = k0.r(scrubberPosition + j10, 0L, this.F);
        this.E = jR;
        if (jR == scrubberPosition) {
            return false;
        }
        if (!this.D) {
            r();
        }
        Iterator<a.InterfaceC0295a> it = this.f20900x.iterator();
        while (it.hasNext()) {
            it.next().c(this, this.E);
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
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(DefaultTimeBar.class.getName());
    }

    @Override // android.view.View
    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DefaultTimeBar.class.getCanonicalName());
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.F <= 0) {
            return;
        }
        int i10 = k0.f3574a;
        if (i10 >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else if (i10 >= 16) {
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
            if (r0 == 0) goto L36
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
            goto L36
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.o(r0)
            if (r0 == 0) goto L36
            java.lang.Runnable r5 = r4.f20899w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f20899w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.D
            if (r0 == 0) goto L36
            java.lang.Runnable r5 = r4.f20899w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f20899w
            r5.run()
            return r3
        L36:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = ((i13 - i11) - this.f20890n) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int i15 = this.f20890n;
        int i16 = ((i15 - this.f20889m) / 2) + i14;
        this.f20878b.set(paddingLeft, i14, paddingRight, i15 + i14);
        Rect rect = this.f20879c;
        Rect rect2 = this.f20878b;
        int i17 = rect2.left;
        int i18 = this.f20895s;
        rect.set(i17 + i18, i16, rect2.right - i18, this.f20889m + i16);
        update();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f20890n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f20890n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        t();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f20888l;
        if (drawable == null || !q(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
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
            if (r0 == 0) goto L90
            long r2 = r7.F
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L90
        L11:
            android.graphics.Point r0 = r7.n(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L75
            r5 = 3
            if (r3 == r4) goto L66
            r6 = 2
            if (r3 == r6) goto L29
            if (r3 == r5) goto L66
            goto L90
        L29:
            boolean r8 = r7.D
            if (r8 == 0) goto L90
            int r8 = r7.f20896t
            if (r0 >= r8) goto L3b
            int r8 = r7.A
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m(r8)
            goto L41
        L3b:
            r7.A = r2
            float r8 = (float) r2
            r7.m(r8)
        L41:
            long r0 = r7.getScrubberPosition()
            r7.E = r0
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer.ui.a$a> r8 = r7.f20900x
            java.util.Iterator r8 = r8.iterator()
        L4d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r8.next()
            com.google.android.exoplayer.ui.a$a r0 = (com.google.android.exoplayer.ui.a.InterfaceC0295a) r0
            long r1 = r7.E
            r0.c(r7, r1)
            goto L4d
        L5f:
            r7.update()
            r7.invalidate()
            return r4
        L66:
            boolean r0 = r7.D
            if (r0 == 0) goto L90
            int r8 = r8.getAction()
            if (r8 != r5) goto L71
            r1 = r4
        L71:
            r7.s(r1)
            return r4
        L75:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.k(r8, r0)
            if (r0 == 0) goto L90
            r7.m(r8)
            r7.r()
            long r0 = r7.getScrubberPosition()
            r7.E = r0
            r7.update()
            r7.invalidate()
            return r4
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(Drawable drawable) {
        return k0.f3574a >= 23 && q(drawable, getLayoutDirection());
    }

    @Override // android.view.View
    @TargetApi(16)
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.F <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (o(-getPositionIncrement())) {
                s(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (o(getPositionIncrement())) {
                s(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public final void r() {
        this.D = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<a.InterfaceC0295a> it = this.f20900x.iterator();
        while (it.hasNext()) {
            it.next().d(this, getScrubberPosition());
        }
    }

    public final void s(boolean z10) {
        this.D = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<a.InterfaceC0295a> it = this.f20900x.iterator();
        while (it.hasNext()) {
            it.next().f(this, getScrubberPosition(), z10);
        }
    }

    @Override // com.google.android.exoplayer.ui.a
    public void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i10) {
        a6.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.I = i10;
        this.J = jArr;
        this.K = zArr;
        update();
    }

    public void setAdMarkerColor(@ColorInt int i10) {
        this.f20885i.setColor(i10);
        invalidate(this.f20878b);
    }

    public void setBufferedColor(@ColorInt int i10) {
        this.f20883g.setColor(i10);
        invalidate(this.f20878b);
    }

    @Override // com.google.android.exoplayer.ui.a
    public void setBufferedPosition(long j10) {
        this.H = j10;
        update();
    }

    @Override // com.google.android.exoplayer.ui.a
    public void setDuration(long j10) {
        this.F = j10;
        if (this.D && j10 == -9223372036854775807L) {
            s(true);
        }
        update();
    }

    @Override // android.view.View, com.google.android.exoplayer.ui.a
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.D || z10) {
            return;
        }
        s(true);
    }

    public void setKeyCountIncrement(int i10) {
        a6.a.a(i10 > 0);
        this.f20901y = i10;
        this.f20902z = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        a6.a.a(j10 > 0);
        this.f20901y = -1;
        this.f20902z = j10;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i10) {
        this.f20886j.setColor(i10);
        invalidate(this.f20878b);
    }

    public void setPlayedColor(@ColorInt int i10) {
        this.f20882f.setColor(i10);
        invalidate(this.f20878b);
    }

    @Override // com.google.android.exoplayer.ui.a
    public void setPosition(long j10) {
        this.G = j10;
        setContentDescription(getProgressText());
        update();
    }

    public void setScrubberColor(@ColorInt int i10) {
        this.f20887k.setColor(i10);
        invalidate(this.f20878b);
    }

    public void setUnplayedColor(@ColorInt int i10) {
        this.f20884h.setColor(i10);
        invalidate(this.f20878b);
    }

    public final void t() {
        Drawable drawable = this.f20888l;
        if (drawable != null && drawable.isStateful() && this.f20888l.setState(getDrawableState())) {
            invalidate();
        }
    }
}
