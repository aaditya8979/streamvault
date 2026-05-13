package com.scwang.smart.refresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.kernel.R$id;
import com.scwang.smart.refresh.layout.kernel.R$string;
import com.scwang.smart.refresh.layout.kernel.R$styleable;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"RestrictedApi"})
public class SmartRefreshLayout extends ViewGroup implements oe.f, NestedScrollingParent {
    public static qe.b P0;
    public static qe.c Q0;
    public static qe.d R0;
    public static ViewGroup.MarginLayoutParams S0 = new ViewGroup.MarginLayoutParams(-1, -1);
    public Interpolator A;
    public Handler A0;
    public int[] B;
    public oe.e B0;
    public boolean C;
    public RefreshState C0;
    public boolean D;
    public RefreshState D0;
    public boolean E;
    public long E0;
    public boolean F;
    public int F0;
    public boolean G;
    public int G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public boolean J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public MotionEvent M0;
    public boolean N;
    public Runnable N0;
    public boolean O;
    public ValueAnimator O0;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f53245a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53246b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f53247b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53248c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public qe.g f53249c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53250d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public qe.e f53251d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53252e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public qe.f f53253e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53254f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public qe.i f53255f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53256g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f53257g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53258h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f53259h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f53260i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int[] f53261i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f53262j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public NestedScrollingChildHelper f53263j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f53264k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public NestedScrollingParentHelper f53265k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f53266l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f53267l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f53268m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public pe.a f53269m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f53270n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f53271n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f53272o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public pe.a f53273o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f53274p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f53275p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f53276q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f53277q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f53278r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f53279r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f53280s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f53281s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f53282t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f53283t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f53284u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f53285u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f53286v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f53287v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f53288w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public oe.a f53289w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f53290x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public oe.a f53291x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Scroller f53292y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public oe.b f53293y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public VelocityTracker f53294z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Paint f53295z0;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f53296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public pe.b f53297b;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f53296a = 0;
            this.f53297b = null;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f53296a = 0;
            this.f53297b = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmartRefreshLayout_Layout);
            this.f53296a = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_Layout_layout_srlBackgroundColor, this.f53296a);
            int i10 = R$styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f53297b = pe.b.f77290i[typedArrayObtainStyledAttributes.getInt(i10, pe.b.f77285d.f77291a)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53298a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f53298a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53298a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53298a[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53298a[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53298a[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53298a[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53298a[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53298a[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f53298a[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f53298a[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f53298a[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f53298a[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f53299b;

        public b(boolean z10) {
            this.f53299b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.setStateDirectLoading(this.f53299b);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f53301b;

        public c(boolean z10) {
            this.f53301b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.E0 = System.currentTimeMillis();
                SmartRefreshLayout.this.D(RefreshState.Refreshing);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                qe.g gVar = smartRefreshLayout.f53249c0;
                if (gVar != null) {
                    if (this.f53301b) {
                        gVar.d(smartRefreshLayout);
                    }
                } else if (smartRefreshLayout.f53253e0 == null) {
                    smartRefreshLayout.t(3000);
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                oe.a aVar = smartRefreshLayout2.f53289w0;
                if (aVar != null) {
                    float f10 = smartRefreshLayout2.f53279r0;
                    if (f10 < 10.0f) {
                        f10 *= smartRefreshLayout2.f53267l0;
                    }
                    aVar.d(smartRefreshLayout2, smartRefreshLayout2.f53267l0, (int) f10);
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                qe.f fVar = smartRefreshLayout3.f53253e0;
                if (fVar == null || !(smartRefreshLayout3.f53289w0 instanceof oe.d)) {
                    return;
                }
                if (this.f53301b) {
                    fVar.d(smartRefreshLayout3);
                }
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                float f11 = smartRefreshLayout4.f53279r0;
                if (f11 < 10.0f) {
                    f11 *= smartRefreshLayout4.f53267l0;
                }
                smartRefreshLayout4.f53253e0.p((oe.d) smartRefreshLayout4.f53289w0, smartRefreshLayout4.f53267l0, (int) f11);
            }
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RefreshState refreshState;
            RefreshState refreshState2;
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.O0 = null;
                if (smartRefreshLayout.f53248c == 0 && (refreshState = smartRefreshLayout.C0) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                    smartRefreshLayout.D(refreshState2);
                    return;
                }
                RefreshState refreshState3 = smartRefreshLayout.C0;
                if (refreshState3 != smartRefreshLayout.D0) {
                    smartRefreshLayout.setViceState(refreshState3);
                }
            }
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.B0.e(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            qe.e eVar = smartRefreshLayout.f53251d0;
            if (eVar != null) {
                eVar.a(smartRefreshLayout);
            } else if (smartRefreshLayout.f53253e0 == null) {
                smartRefreshLayout.o(2000);
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            qe.f fVar = smartRefreshLayout2.f53253e0;
            if (fVar != null) {
                fVar.a(smartRefreshLayout2);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f53306b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f53307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f53308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f53309e;

        public g(int i10, Boolean bool, boolean z10) {
            this.f53307c = i10;
            this.f53308d = bool;
            this.f53309e = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = this.f53306b;
            if (i10 == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                RefreshState refreshState = smartRefreshLayout.C0;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.D0 == RefreshState.Refreshing) {
                    smartRefreshLayout.D0 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.O0;
                    if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.O0.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.O0 = null;
                        if (smartRefreshLayout2.B0.a(0) == null) {
                            SmartRefreshLayout.this.D(refreshState2);
                        } else {
                            SmartRefreshLayout.this.D(RefreshState.PullDownCanceled);
                        }
                    } else if (refreshState == RefreshState.Refreshing && smartRefreshLayout.f53289w0 != null && smartRefreshLayout.f53293y0 != null) {
                        this.f53306b = i10 + 1;
                        smartRefreshLayout.A0.postDelayed(this, this.f53307c);
                        SmartRefreshLayout.this.D(RefreshState.RefreshFinish);
                        if (this.f53308d == Boolean.FALSE) {
                            SmartRefreshLayout.this.J(false);
                        }
                    }
                }
                if (this.f53308d == Boolean.TRUE) {
                    SmartRefreshLayout.this.J(true);
                    return;
                }
                return;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int iJ = smartRefreshLayout3.f53289w0.j(smartRefreshLayout3, this.f53309e);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            qe.f fVar = smartRefreshLayout4.f53253e0;
            if (fVar != null) {
                oe.a aVar = smartRefreshLayout4.f53289w0;
                if (aVar instanceof oe.d) {
                    fVar.o((oe.d) aVar, this.f53309e);
                }
            }
            if (iJ < Integer.MAX_VALUE) {
                SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                if (smartRefreshLayout5.f53272o || smartRefreshLayout5.f53259h0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.f53272o) {
                        float f10 = smartRefreshLayout6.f53266l;
                        smartRefreshLayout6.f53262j = f10;
                        smartRefreshLayout6.f53252e = 0;
                        smartRefreshLayout6.f53272o = false;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout6.f53264k, (f10 + smartRefreshLayout6.f53248c) - (smartRefreshLayout6.f53246b * 2), 0));
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout7.f53264k, smartRefreshLayout7.f53266l + smartRefreshLayout7.f53248c, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f53259h0) {
                        smartRefreshLayout8.f53257g0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout8.f53264k, smartRefreshLayout8.f53266l, 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        smartRefreshLayout9.f53259h0 = false;
                        smartRefreshLayout9.f53252e = 0;
                    }
                }
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i11 = smartRefreshLayout10.f53248c;
                if (i11 <= 0) {
                    if (i11 < 0) {
                        smartRefreshLayout10.i(0, iJ, smartRefreshLayout10.A, smartRefreshLayout10.f53256g);
                        return;
                    } else {
                        smartRefreshLayout10.B0.e(0, false);
                        SmartRefreshLayout.this.B0.g(RefreshState.None);
                        return;
                    }
                }
                ValueAnimator valueAnimatorI = smartRefreshLayout10.i(0, iJ, smartRefreshLayout10.A, smartRefreshLayout10.f53256g);
                SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerC = smartRefreshLayout11.P ? smartRefreshLayout11.f53293y0.c(smartRefreshLayout11.f53248c) : null;
                if (valueAnimatorI == null || animatorUpdateListenerC == null) {
                    return;
                }
                valueAnimatorI.addUpdateListener(animatorUpdateListenerC);
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f53311b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f53312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f53313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f53314e;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f53316b;

            /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$h$a$a, reason: collision with other inner class name */
            public class C0704a extends AnimatorListenerAdapter {
                public C0704a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (animator == null || animator.getDuration() != 0) {
                        h hVar = h.this;
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.K0 = false;
                        if (hVar.f53313d) {
                            smartRefreshLayout.J(true);
                        }
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        if (smartRefreshLayout2.C0 == RefreshState.LoadFinish) {
                            smartRefreshLayout2.D(RefreshState.None);
                        }
                    }
                }
            }

            public a(int i10) {
                this.f53316b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerC;
                ValueAnimator valueAnimatorA;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.O || this.f53316b >= 0) {
                    animatorUpdateListenerC = null;
                } else {
                    animatorUpdateListenerC = smartRefreshLayout.f53293y0.c(smartRefreshLayout.f53248c);
                    if (animatorUpdateListenerC != null) {
                        animatorUpdateListenerC.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                    }
                }
                C0704a c0704a = new C0704a();
                h hVar = h.this;
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i10 = smartRefreshLayout2.f53248c;
                if (i10 > 0) {
                    valueAnimatorA = smartRefreshLayout2.B0.a(0);
                } else {
                    if (animatorUpdateListenerC != null || i10 == 0) {
                        ValueAnimator valueAnimator = smartRefreshLayout2.O0;
                        if (valueAnimator != null) {
                            valueAnimator.setDuration(0L);
                            SmartRefreshLayout.this.O0.cancel();
                            SmartRefreshLayout.this.O0 = null;
                        }
                        SmartRefreshLayout.this.B0.e(0, false);
                        SmartRefreshLayout.this.B0.g(RefreshState.None);
                    } else if (hVar.f53313d && smartRefreshLayout2.I) {
                        int i11 = smartRefreshLayout2.f53271n0;
                        if (i10 >= (-i11)) {
                            smartRefreshLayout2.D(RefreshState.None);
                        } else {
                            valueAnimatorA = smartRefreshLayout2.B0.a(-i11);
                        }
                    } else {
                        valueAnimatorA = smartRefreshLayout2.B0.a(0);
                    }
                    valueAnimatorA = null;
                }
                if (valueAnimatorA != null) {
                    valueAnimatorA.addListener(c0704a);
                } else {
                    c0704a.onAnimationEnd(null);
                }
            }
        }

        public h(int i10, boolean z10, boolean z11) {
            this.f53312c = i10;
            this.f53313d = z10;
            this.f53314e = z11;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.h.run():void");
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f53319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f53320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f53321d;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.O0 == null || smartRefreshLayout.f53289w0 == null) {
                    return;
                }
                smartRefreshLayout.B0.e(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.O0 = null;
                    if (smartRefreshLayout.f53289w0 == null) {
                        smartRefreshLayout.B0.g(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.C0;
                    RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.B0.g(refreshState2);
                    }
                    SmartRefreshLayout.this.setStateRefreshing(!r5.f53321d);
                }
            }
        }

        public i(float f10, int i10, boolean z10) {
            this.f53319b = f10;
            this.f53320c = i10;
            this.f53321d = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.D0 != RefreshState.Refreshing) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.O0;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.O0.cancel();
                SmartRefreshLayout.this.O0 = null;
            }
            SmartRefreshLayout.this.f53264k = r0.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.B0.g(RefreshState.PullDownToRefresh);
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            int i10 = smartRefreshLayout2.f53267l0;
            float f10 = i10 == 0 ? smartRefreshLayout2.f53283t0 : i10;
            float f11 = this.f53319b;
            if (f11 < 10.0f) {
                f11 *= f10;
            }
            smartRefreshLayout2.O0 = ValueAnimator.ofInt(smartRefreshLayout2.f53248c, (int) f11);
            SmartRefreshLayout.this.O0.setDuration(this.f53320c);
            SmartRefreshLayout.this.O0.setInterpolator(new se.b(se.b.f79723b));
            SmartRefreshLayout.this.O0.addUpdateListener(new a());
            SmartRefreshLayout.this.O0.addListener(new b());
            SmartRefreshLayout.this.O0.start();
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f53327d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f53330g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f53325b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f53326c = 10;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f53329f = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f53328e = AnimationUtils.currentAnimationTimeMillis();

        public j(float f10, int i10) {
            this.f53330g = f10;
            this.f53327d = i10;
            SmartRefreshLayout.this.A0.postDelayed(this, this.f53326c);
            if (f10 > 0.0f) {
                SmartRefreshLayout.this.B0.g(RefreshState.PullDownToRefresh);
            } else {
                SmartRefreshLayout.this.B0.g(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.N0 != this || smartRefreshLayout.C0.isFinishing) {
                return;
            }
            if (Math.abs(smartRefreshLayout.f53248c) < Math.abs(this.f53327d)) {
                double d10 = this.f53330g;
                this.f53325b = this.f53325b + 1;
                this.f53330g = (float) (d10 * Math.pow(0.949999988079071d, r4 * 2));
            } else if (this.f53327d != 0) {
                double d11 = this.f53330g;
                this.f53325b = this.f53325b + 1;
                this.f53330g = (float) (d11 * Math.pow(0.44999998807907104d, r4 * 2));
            } else {
                double d12 = this.f53330g;
                this.f53325b = this.f53325b + 1;
                this.f53330g = (float) (d12 * Math.pow(0.8500000238418579d, r4 * 2));
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f10 = this.f53330g * (((jCurrentAnimationTimeMillis - this.f53328e) * 1.0f) / 1000.0f);
            if (Math.abs(f10) >= 1.0f) {
                this.f53328e = jCurrentAnimationTimeMillis;
                float f11 = this.f53329f + f10;
                this.f53329f = f11;
                SmartRefreshLayout.this.C(f11);
                SmartRefreshLayout.this.A0.postDelayed(this, this.f53326c);
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState = smartRefreshLayout2.D0;
            boolean z10 = refreshState.isDragging;
            if (z10 && refreshState.isHeader) {
                smartRefreshLayout2.B0.g(RefreshState.PullDownCanceled);
            } else if (z10 && refreshState.isFooter) {
                smartRefreshLayout2.B0.g(RefreshState.PullUpCanceled);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.N0 = null;
            if (Math.abs(smartRefreshLayout3.f53248c) >= Math.abs(this.f53327d)) {
                int iMin = Math.min(Math.max((int) se.b.i(Math.abs(SmartRefreshLayout.this.f53248c - this.f53327d)), 30), 100) * 10;
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                smartRefreshLayout4.i(this.f53327d, 0, smartRefreshLayout4.A, iMin);
            }
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f53332b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f53335e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f53333c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f53334d = 10;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f53336f = 0.98f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f53337g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f53338h = AnimationUtils.currentAnimationTimeMillis();

        public k(float f10) {
            this.f53335e = f10;
            this.f53332b = SmartRefreshLayout.this.f53248c;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Runnable a() {
            /*
                r11 = this;
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                com.scwang.smart.refresh.layout.constant.RefreshState r1 = r0.C0
                boolean r2 = r1.isFinishing
                r3 = 0
                if (r2 == 0) goto La
                return r3
            La:
                int r2 = r0.f53248c
                if (r2 == 0) goto La7
                boolean r1 = r1.isOpening
                if (r1 != 0) goto L26
                boolean r1 = r0.U
                if (r1 == 0) goto L59
                boolean r1 = r0.I
                if (r1 == 0) goto L59
                boolean r1 = r0.V
                if (r1 == 0) goto L59
                boolean r1 = r0.D
                boolean r0 = r0.y(r1)
                if (r0 == 0) goto L59
            L26:
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                com.scwang.smart.refresh.layout.constant.RefreshState r1 = r0.C0
                com.scwang.smart.refresh.layout.constant.RefreshState r2 = com.scwang.smart.refresh.layout.constant.RefreshState.Loading
                if (r1 == r2) goto L42
                boolean r1 = r0.U
                if (r1 == 0) goto L4b
                boolean r1 = r0.I
                if (r1 == 0) goto L4b
                boolean r1 = r0.V
                if (r1 == 0) goto L4b
                boolean r1 = r0.D
                boolean r0 = r0.y(r1)
                if (r0 == 0) goto L4b
            L42:
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                int r1 = r0.f53248c
                int r0 = r0.f53271n0
                int r0 = -r0
                if (r1 < r0) goto L59
            L4b:
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                com.scwang.smart.refresh.layout.constant.RefreshState r1 = r0.C0
                com.scwang.smart.refresh.layout.constant.RefreshState r2 = com.scwang.smart.refresh.layout.constant.RefreshState.Refreshing
                if (r1 != r2) goto La7
                int r1 = r0.f53248c
                int r0 = r0.f53267l0
                if (r1 <= r0) goto La7
            L59:
                r0 = 0
                com.scwang.smart.refresh.layout.SmartRefreshLayout r1 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                int r1 = r1.f53248c
                float r2 = r11.f53335e
                r4 = r1
            L61:
                int r5 = r1 * r4
                if (r5 <= 0) goto La7
                double r5 = (double) r2
                float r2 = r11.f53336f
                double r7 = (double) r2
                int r0 = r0 + 1
                int r2 = r11.f53334d
                int r2 = r2 * r0
                float r2 = (float) r2
                r9 = 1092616192(0x41200000, float:10.0)
                float r2 = r2 / r9
                double r9 = (double) r2
                double r7 = java.lang.Math.pow(r7, r9)
                double r5 = r5 * r7
                float r2 = (float) r5
                int r5 = r11.f53334d
                float r5 = (float) r5
                r6 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 * r6
                r7 = 1148846080(0x447a0000, float:1000.0)
                float r5 = r5 / r7
                float r5 = r5 * r2
                float r7 = java.lang.Math.abs(r5)
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 >= 0) goto La3
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                com.scwang.smart.refresh.layout.constant.RefreshState r1 = r0.C0
                boolean r2 = r1.isOpening
                if (r2 == 0) goto La2
                com.scwang.smart.refresh.layout.constant.RefreshState r2 = com.scwang.smart.refresh.layout.constant.RefreshState.Refreshing
                if (r1 != r2) goto L9b
                int r5 = r0.f53267l0
                if (r4 > r5) goto La2
            L9b:
                if (r1 == r2) goto La7
                int r0 = r0.f53271n0
                int r0 = -r0
                if (r4 >= r0) goto La7
            La2:
                return r3
            La3:
                float r4 = (float) r4
                float r4 = r4 + r5
                int r4 = (int) r4
                goto L61
            La7:
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                r11.f53337g = r0
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                android.os.Handler r0 = r0.A0
                int r1 = r11.f53334d
                long r1 = (long) r1
                r0.postDelayed(r11, r1)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.k.a():java.lang.Runnable");
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.N0 != this || smartRefreshLayout.C0.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j10 = jCurrentAnimationTimeMillis - this.f53338h;
            float fPow = (float) (((double) this.f53335e) * Math.pow(this.f53336f, (jCurrentAnimationTimeMillis - this.f53337g) / (1000.0f / this.f53334d)));
            this.f53335e = fPow;
            float f10 = fPow * ((j10 * 1.0f) / 1000.0f);
            if (Math.abs(f10) <= 1.0f) {
                SmartRefreshLayout.this.N0 = null;
                return;
            }
            this.f53338h = jCurrentAnimationTimeMillis;
            int i10 = (int) (this.f53332b + f10);
            this.f53332b = i10;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.f53248c * i10 > 0) {
                smartRefreshLayout2.B0.e(i10, true);
                SmartRefreshLayout.this.A0.postDelayed(this, this.f53334d);
                return;
            }
            smartRefreshLayout2.N0 = null;
            smartRefreshLayout2.B0.e(0, true);
            se.b.d(SmartRefreshLayout.this.f53293y0.g(), (int) (-this.f53335e));
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (!smartRefreshLayout3.K0 || f10 <= 0.0f) {
                return;
            }
            smartRefreshLayout3.K0 = false;
        }
    }

    public class l implements oe.e {
        public l() {
        }

        @Override // oe.e
        public ValueAnimator a(int i10) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.i(i10, 0, smartRefreshLayout.A, smartRefreshLayout.f53256g);
        }

        @Override // oe.e
        public oe.e b(@NonNull oe.a aVar, int i10) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f53295z0 == null && i10 != 0) {
                smartRefreshLayout.f53295z0 = new Paint();
            }
            if (aVar.equals(SmartRefreshLayout.this.f53289w0)) {
                SmartRefreshLayout.this.F0 = i10;
            } else if (aVar.equals(SmartRefreshLayout.this.f53291x0)) {
                SmartRefreshLayout.this.G0 = i10;
            }
            return this;
        }

        @Override // oe.e
        @NonNull
        public oe.f c() {
            return SmartRefreshLayout.this;
        }

        @Override // oe.e
        public oe.e d() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.C0 == RefreshState.TwoLevel) {
                smartRefreshLayout.B0.g(RefreshState.TwoLevelFinish);
                if (SmartRefreshLayout.this.f53248c == 0) {
                    e(0, false);
                    SmartRefreshLayout.this.D(RefreshState.None);
                } else {
                    a(0).setDuration(SmartRefreshLayout.this.f53254f);
                }
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
        @Override // oe.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public oe.e e(int r19, boolean r20) {
            /*
                Method dump skipped, instruction units count: 913
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.l.e(int, boolean):oe.e");
        }

        @Override // oe.e
        public oe.e f(@NonNull oe.a aVar) {
            if (aVar.equals(SmartRefreshLayout.this.f53289w0)) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                pe.a aVar2 = smartRefreshLayout.f53269m0;
                if (aVar2.f77284b) {
                    smartRefreshLayout.f53269m0 = aVar2.c();
                }
            } else if (aVar.equals(SmartRefreshLayout.this.f53291x0)) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                pe.a aVar3 = smartRefreshLayout2.f53273o0;
                if (aVar3.f77284b) {
                    smartRefreshLayout2.f53273o0 = aVar3.c();
                }
            }
            return this;
        }

        @Override // oe.e
        public oe.e g(@NonNull RefreshState refreshState) {
            switch (a.f53298a[refreshState.ordinal()]) {
                case 1:
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    RefreshState refreshState2 = smartRefreshLayout.C0;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f53248c == 0) {
                        smartRefreshLayout.D(refreshState3);
                    } else if (smartRefreshLayout.f53248c != 0) {
                        a(0);
                    }
                    break;
                case 2:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.C0.isOpening && smartRefreshLayout2.y(smartRefreshLayout2.C)) {
                        SmartRefreshLayout.this.D(RefreshState.PullDownToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.y(smartRefreshLayout3.D)) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        RefreshState refreshState4 = smartRefreshLayout4.C0;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout4.U || !smartRefreshLayout4.I || !smartRefreshLayout4.V)) {
                            smartRefreshLayout4.D(RefreshState.PullUpToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout5.C0.isOpening && smartRefreshLayout5.y(smartRefreshLayout5.C)) {
                        SmartRefreshLayout.this.D(RefreshState.PullDownCanceled);
                        g(RefreshState.None);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.y(smartRefreshLayout6.D)) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout7.C0.isOpening && (!smartRefreshLayout7.U || !smartRefreshLayout7.I || !smartRefreshLayout7.V)) {
                            smartRefreshLayout7.D(RefreshState.PullUpCanceled);
                            g(RefreshState.None);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpCanceled);
                    break;
                case 6:
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout8.C0.isOpening && smartRefreshLayout8.y(smartRefreshLayout8.C)) {
                        SmartRefreshLayout.this.D(RefreshState.ReleaseToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.y(smartRefreshLayout9.D)) {
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        RefreshState refreshState5 = smartRefreshLayout10.C0;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout10.U || !smartRefreshLayout10.I || !smartRefreshLayout10.V)) {
                            smartRefreshLayout10.D(RefreshState.ReleaseToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout11.C0.isOpening && smartRefreshLayout11.y(smartRefreshLayout11.C)) {
                        SmartRefreshLayout.this.D(RefreshState.ReleaseToTwoLevel);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout12.C0.isOpening && smartRefreshLayout12.y(smartRefreshLayout12.C)) {
                        SmartRefreshLayout.this.D(RefreshState.RefreshReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout13.C0.isOpening && smartRefreshLayout13.y(smartRefreshLayout13.D)) {
                        SmartRefreshLayout.this.D(RefreshState.LoadReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    SmartRefreshLayout.this.setStateRefreshing(true);
                    break;
                case 12:
                    SmartRefreshLayout.this.setStateLoading(true);
                    break;
                default:
                    SmartRefreshLayout.this.D(refreshState);
                    break;
            }
            return null;
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53254f = 300;
        this.f53256g = 300;
        this.f53268m = 0.5f;
        this.f53270n = 'n';
        this.f53278r = -1;
        this.f53280s = -1;
        this.f53282t = -1;
        this.f53284u = -1;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
        this.N = false;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.f53245a0 = false;
        this.f53247b0 = false;
        this.f53261i0 = new int[2];
        this.f53263j0 = new NestedScrollingChildHelper(this);
        this.f53265k0 = new NestedScrollingParentHelper(this);
        pe.a aVar = pe.a.f77270c;
        this.f53269m0 = aVar;
        this.f53273o0 = aVar;
        this.f53279r0 = 2.5f;
        this.f53281s0 = 2.5f;
        this.f53283t0 = 1.0f;
        this.f53285u0 = 1.0f;
        this.f53287v0 = 0.16666667f;
        this.B0 = new l();
        RefreshState refreshState = RefreshState.None;
        this.C0 = refreshState;
        this.D0 = refreshState;
        this.E0 = 0L;
        this.F0 = 0;
        this.G0 = 0;
        this.K0 = false;
        this.L0 = false;
        this.M0 = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0 = new Handler(Looper.getMainLooper());
        this.f53292y = new Scroller(context);
        this.f53294z = VelocityTracker.obtain();
        this.f53258h = context.getResources().getDisplayMetrics().heightPixels;
        this.A = new se.b(se.b.f79723b);
        this.f53246b = viewConfiguration.getScaledTouchSlop();
        this.f53286v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f53288w = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f53271n0 = se.b.c(60.0f);
        this.f53267l0 = se.b.c(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmartRefreshLayout);
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_android_clipToPadding)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_android_clipChildren)) {
            super.setClipChildren(false);
        }
        qe.d dVar = R0;
        if (dVar != null) {
            dVar.a(context, this);
        }
        this.f53268m = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlDragRate, this.f53268m);
        this.f53279r0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlHeaderMaxDragRate, this.f53279r0);
        this.f53281s0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlFooterMaxDragRate, this.f53281s0);
        this.f53283t0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlHeaderTriggerRate, this.f53283t0);
        this.f53285u0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlFooterTriggerRate, this.f53285u0);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableRefresh, this.C);
        this.f53256g = typedArrayObtainStyledAttributes.getInt(R$styleable.SmartRefreshLayout_srlReboundDuration, this.f53256g);
        int i10 = R$styleable.SmartRefreshLayout_srlEnableLoadMore;
        this.D = typedArrayObtainStyledAttributes.getBoolean(i10, this.D);
        int i11 = R$styleable.SmartRefreshLayout_srlHeaderHeight;
        this.f53267l0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i11, this.f53267l0);
        int i12 = R$styleable.SmartRefreshLayout_srlFooterHeight;
        this.f53271n0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i12, this.f53271n0);
        this.f53275p0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SmartRefreshLayout_srlHeaderInsetStart, this.f53275p0);
        this.f53277q0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SmartRefreshLayout_srlFooterInsetStart, this.f53277q0);
        this.S = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlDisableContentWhenRefresh, this.S);
        this.T = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlDisableContentWhenLoading, this.T);
        int i13 = R$styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent;
        this.G = typedArrayObtainStyledAttributes.getBoolean(i13, this.G);
        int i14 = R$styleable.SmartRefreshLayout_srlEnableFooterTranslationContent;
        this.H = typedArrayObtainStyledAttributes.getBoolean(i14, this.H);
        this.J = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnablePreviewInEditMode, this.J);
        this.M = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableAutoLoadMore, this.M);
        this.K = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableOverScrollBounce, this.K);
        this.N = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnablePureScrollMode, this.N);
        this.O = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.O);
        this.P = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, this.P);
        this.Q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, this.Q);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.I);
        this.I = z10;
        this.I = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData, z10);
        this.E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, this.E);
        this.F = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, this.F);
        this.L = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableOverScrollDrag, this.L);
        this.f53278r = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFixedHeaderViewId, this.f53278r);
        this.f53280s = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFixedFooterViewId, this.f53280s);
        this.f53282t = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlHeaderTranslationViewId, this.f53282t);
        this.f53284u = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFooterTranslationViewId, this.f53284u);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableNestedScrolling, this.R);
        this.R = z11;
        this.f53263j0.setNestedScrollingEnabled(z11);
        this.W = this.W || typedArrayObtainStyledAttributes.hasValue(i10);
        this.f53245a0 = this.f53245a0 || typedArrayObtainStyledAttributes.hasValue(i13);
        this.f53247b0 = this.f53247b0 || typedArrayObtainStyledAttributes.hasValue(i14);
        this.f53269m0 = typedArrayObtainStyledAttributes.hasValue(i11) ? pe.a.f77276i : this.f53269m0;
        this.f53273o0 = typedArrayObtainStyledAttributes.hasValue(i12) ? pe.a.f77276i : this.f53273o0;
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.B = new int[]{color2, color};
            } else {
                this.B = new int[]{color2};
            }
        } else if (color != 0) {
            this.B = new int[]{0, color};
        }
        if (this.N && !this.W && !this.D) {
            this.D = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setDefaultRefreshFooterCreator(@NonNull qe.b bVar) {
        P0 = bVar;
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull qe.c cVar) {
        Q0 = cVar;
    }

    public static void setDefaultRefreshInitializer(@NonNull qe.d dVar) {
        R0 = dVar;
    }

    public boolean A() {
        return this.C0 == RefreshState.Loading;
    }

    public boolean B() {
        return this.C0 == RefreshState.Refreshing;
    }

    public void C(float f10) {
        RefreshState refreshState;
        float f11 = (!this.f53259h0 || this.Q || f10 >= 0.0f || this.f53293y0.e()) ? f10 : 0.0f;
        if (f11 > this.f53258h * 5 && getTag() == null) {
            int i10 = R$id.srl_tag;
            if (getTag(i10) == null) {
                float f12 = this.f53266l;
                int i11 = this.f53258h;
                if (f12 < i11 / 6.0f && this.f53264k < i11 / 16.0f) {
                    Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
                    setTag(i10, "你这么死拉，臣妾做不到啊！");
                }
            }
        }
        RefreshState refreshState2 = this.C0;
        if (refreshState2 == RefreshState.TwoLevel && f11 > 0.0f) {
            this.B0.e(Math.min((int) f11, getMeasuredHeight()), true);
        } else if (refreshState2 == RefreshState.Refreshing && f11 >= 0.0f) {
            int i12 = this.f53267l0;
            if (f11 < i12) {
                this.B0.e((int) f11, true);
            } else {
                float f13 = this.f53279r0;
                if (f13 < 10.0f) {
                    f13 *= i12;
                }
                double d10 = f13 - i12;
                int iMax = Math.max((this.f53258h * 4) / 3, getHeight());
                int i13 = this.f53267l0;
                double d11 = iMax - i13;
                double dMax = Math.max(0.0f, (f11 - i13) * this.f53268m);
                double d12 = -dMax;
                if (d11 == 0.0d) {
                    d11 = 1.0d;
                }
                this.B0.e(((int) Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / d11)), dMax)) + this.f53267l0, true);
            }
        } else if (f11 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.I && this.U && this.V && y(this.D)) || (this.M && !this.U && y(this.D))))) {
            int i14 = this.f53271n0;
            if (f11 > (-i14)) {
                this.B0.e((int) f11, true);
            } else {
                float f14 = this.f53281s0;
                if (f14 < 10.0f) {
                    f14 *= i14;
                }
                double d13 = f14 - i14;
                int iMax2 = Math.max((this.f53258h * 4) / 3, getHeight());
                int i15 = this.f53271n0;
                double d14 = iMax2 - i15;
                double d15 = -Math.min(0.0f, (i15 + f11) * this.f53268m);
                double d16 = -d15;
                if (d14 == 0.0d) {
                    d14 = 1.0d;
                }
                this.B0.e(((int) (-Math.min(d13 * (1.0d - Math.pow(100.0d, d16 / d14)), d15))) - this.f53271n0, true);
            }
        } else if (f11 >= 0.0f) {
            float f15 = this.f53279r0;
            double d17 = f15 < 10.0f ? this.f53267l0 * f15 : f15;
            double dMax2 = Math.max(this.f53258h / 2, getHeight());
            double dMax3 = Math.max(0.0f, this.f53268m * f11);
            double d18 = -dMax3;
            if (dMax2 == 0.0d) {
                dMax2 = 1.0d;
            }
            this.B0.e((int) Math.min(d17 * (1.0d - Math.pow(100.0d, d18 / dMax2)), dMax3), true);
        } else {
            float f16 = this.f53281s0;
            double d19 = f16 < 10.0f ? this.f53271n0 * f16 : f16;
            double dMax4 = Math.max(this.f53258h / 2, getHeight());
            double d20 = -Math.min(0.0f, this.f53268m * f11);
            this.B0.e((int) (-Math.min(d19 * (1.0d - Math.pow(100.0d, (-d20) / (dMax4 == 0.0d ? 1.0d : dMax4))), d20)), true);
        }
        if (!this.M || this.U || !y(this.D) || f11 >= 0.0f || (refreshState = this.C0) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.T) {
            this.N0 = null;
            this.B0.a(-this.f53271n0);
        }
        setStateDirectLoading(false);
        this.A0.postDelayed(new f(), this.f53256g);
    }

    public void D(RefreshState refreshState) {
        RefreshState refreshState2 = this.C0;
        if (refreshState2 == refreshState) {
            if (this.D0 != refreshState2) {
                this.D0 = refreshState2;
                return;
            }
            return;
        }
        this.C0 = refreshState;
        this.D0 = refreshState;
        oe.a aVar = this.f53289w0;
        oe.a aVar2 = this.f53291x0;
        qe.f fVar = this.f53253e0;
        if (aVar != null) {
            aVar.b(this, refreshState2, refreshState);
        }
        if (aVar2 != null) {
            aVar2.b(this, refreshState2, refreshState);
        }
        if (fVar != null) {
            fVar.b(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.K0 = false;
        }
    }

    public void E() {
        RefreshState refreshState = this.C0;
        if (refreshState == RefreshState.TwoLevel) {
            if (this.f53290x <= -1000 || this.f53248c <= getHeight() / 2) {
                if (this.f53272o) {
                    this.B0.d();
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimatorA = this.B0.a(getHeight());
                if (valueAnimatorA != null) {
                    valueAnimatorA.setDuration(this.f53254f);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState == refreshState2 || (this.I && this.U && this.V && this.f53248c < 0 && y(this.D))) {
            int i10 = this.f53248c;
            int i11 = this.f53271n0;
            if (i10 < (-i11)) {
                this.B0.a(-i11);
                return;
            } else {
                if (i10 > 0) {
                    this.B0.a(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = this.C0;
        RefreshState refreshState4 = RefreshState.Refreshing;
        if (refreshState3 == refreshState4) {
            int i12 = this.f53248c;
            int i13 = this.f53267l0;
            if (i12 > i13) {
                this.B0.a(i13);
                return;
            } else {
                if (i12 < 0) {
                    this.B0.a(0);
                    return;
                }
                return;
            }
        }
        if (refreshState3 == RefreshState.PullDownToRefresh) {
            this.B0.g(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState3 == RefreshState.PullUpToLoad) {
            this.B0.g(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToRefresh) {
            this.B0.g(refreshState4);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToLoad) {
            this.B0.g(refreshState2);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToTwoLevel) {
            this.B0.g(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState3 == RefreshState.RefreshReleased) {
            if (this.O0 == null) {
                this.B0.a(this.f53267l0);
            }
        } else if (refreshState3 == RefreshState.LoadReleased) {
            if (this.O0 == null) {
                this.B0.a(-this.f53271n0);
            }
        } else {
            if (refreshState3 == RefreshState.LoadFinish || this.f53248c == 0) {
                return;
            }
            this.B0.a(0);
        }
    }

    public oe.f F() {
        return J(false);
    }

    public oe.f G(boolean z10) {
        this.W = true;
        this.D = z10;
        return this;
    }

    public oe.f H(boolean z10) {
        this.K = z10;
        return this;
    }

    public oe.f I(boolean z10) {
        this.C = z10;
        return this;
    }

    public oe.f J(boolean z10) {
        RefreshState refreshState = this.C0;
        if (refreshState == RefreshState.Refreshing && z10) {
            w();
        } else if (refreshState == RefreshState.Loading && z10) {
            r();
        } else if (this.U != z10) {
            this.U = z10;
            oe.a aVar = this.f53291x0;
            if (aVar instanceof oe.c) {
                if (((oe.c) aVar).a(z10)) {
                    this.V = true;
                    if (this.U && this.I && this.f53248c > 0 && this.f53291x0.getSpinnerStyle() == pe.b.f77285d && y(this.D) && z(this.C, this.f53289w0)) {
                        this.f53291x0.getView().setTranslationY(this.f53248c);
                    }
                } else {
                    this.V = false;
                    new RuntimeException("Footer:" + this.f53291x0 + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
                }
            }
        }
        return this;
    }

    public oe.f K(qe.e eVar) {
        this.f53251d0 = eVar;
        this.D = this.D || !(this.W || eVar == null);
        return this;
    }

    public oe.f L(qe.g gVar) {
        this.f53249c0 = gVar;
        return this;
    }

    public oe.f M(@ColorInt int... iArr) {
        oe.a aVar = this.f53289w0;
        if (aVar != null) {
            aVar.setPrimaryColors(iArr);
        }
        oe.a aVar2 = this.f53291x0;
        if (aVar2 != null) {
            aVar2.setPrimaryColors(iArr);
        }
        this.B = iArr;
        return this;
    }

    public oe.f N(@NonNull oe.c cVar) {
        return O(cVar, 0, 0);
    }

    public oe.f O(@NonNull oe.c cVar, int i10, int i11) {
        oe.a aVar;
        oe.a aVar2 = this.f53291x0;
        if (aVar2 != null) {
            super.removeView(aVar2.getView());
        }
        this.f53291x0 = cVar;
        this.K0 = false;
        this.G0 = 0;
        this.V = false;
        this.I0 = false;
        this.f53273o0 = pe.a.f77270c;
        this.D = !this.W || this.D;
        if (i10 == 0) {
            i10 = -1;
        }
        if (i11 == 0) {
            i11 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i10, i11);
        ViewGroup.LayoutParams layoutParams2 = cVar.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.f53291x0.getSpinnerStyle().f77292b) {
            super.addView(this.f53291x0.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.f53291x0.getView(), 0, layoutParams);
        }
        int[] iArr = this.B;
        if (iArr != null && (aVar = this.f53291x0) != null) {
            aVar.setPrimaryColors(iArr);
        }
        return this;
    }

    public oe.f P(@NonNull oe.d dVar) {
        return Q(dVar, 0, 0);
    }

    public oe.f Q(@NonNull oe.d dVar, int i10, int i11) {
        oe.a aVar;
        oe.a aVar2 = this.f53289w0;
        if (aVar2 != null) {
            super.removeView(aVar2.getView());
        }
        this.f53289w0 = dVar;
        this.F0 = 0;
        this.H0 = false;
        this.f53269m0 = pe.a.f77270c;
        if (i10 == 0) {
            i10 = -1;
        }
        if (i11 == 0) {
            i11 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i10, i11);
        ViewGroup.LayoutParams layoutParams2 = dVar.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.f53289w0.getSpinnerStyle().f77292b) {
            super.addView(this.f53289w0.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.f53289w0.getView(), 0, layoutParams);
        }
        int[] iArr = this.B;
        if (iArr != null && (aVar = this.f53289w0) != null) {
            aVar.setPrimaryColors(iArr);
        }
        return this;
    }

    public boolean R(float f10) {
        if (f10 == 0.0f) {
            f10 = this.f53290x;
        }
        if (Math.abs(f10) > this.f53286v) {
            int i10 = this.f53248c;
            if (i10 * f10 < 0.0f) {
                RefreshState refreshState = this.C0;
                if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading || (i10 < 0 && this.U)) {
                    this.N0 = new k(f10).a();
                    return true;
                }
                if (refreshState.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f10 < 0.0f && ((this.K && (this.D || this.L)) || ((this.C0 == RefreshState.Loading && i10 >= 0) || (this.M && y(this.D))))) || (f10 > 0.0f && ((this.K && this.C) || this.L || (this.C0 == RefreshState.Refreshing && this.f53248c <= 0)))) {
                this.L0 = false;
                this.f53292y.fling(0, 0, 0, (int) (-f10), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.f53292y.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    @Override // oe.f
    public oe.f a(@ColorRes int... iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = ContextCompat.getColor(getContext(), iArr[i10]);
        }
        M(iArr2);
        return this;
    }

    @Override // oe.f
    public oe.f b(boolean z10) {
        setNestedScrollingEnabled(z10);
        return this;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f53292y.getCurrY();
        if (this.f53292y.computeScrollOffset()) {
            int finalY = this.f53292y.getFinalY();
            if ((finalY >= 0 || !((this.C || this.L) && this.f53293y0.h())) && (finalY <= 0 || !((this.D || this.L) && this.f53293y0.e()))) {
                this.L0 = true;
                invalidate();
            } else {
                if (this.L0) {
                    j(finalY > 0 ? -this.f53292y.getCurrVelocity() : this.f53292y.getCurrVelocity());
                }
                this.f53292y.forceFinished(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
    
        if (r2.isFooter == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        Paint paint;
        Paint paint2;
        oe.b bVar = this.f53293y0;
        View view2 = bVar != null ? bVar.getView() : null;
        oe.a aVar = this.f53289w0;
        if (aVar != null && aVar.getView() == view) {
            if (!y(this.C) || (!this.J && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getTop() + view2.getPaddingTop() + this.f53248c, view.getTop());
                int i10 = this.F0;
                if (i10 != 0 && (paint2 = this.f53295z0) != null) {
                    paint2.setColor(i10);
                    if (this.f53289w0.getSpinnerStyle().f77293c) {
                        iMax = view.getBottom();
                    } else if (this.f53289w0.getSpinnerStyle() == pe.b.f77285d) {
                        iMax = view.getBottom() + this.f53248c;
                    }
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), iMax, this.f53295z0);
                }
                if ((this.E && this.f53289w0.getSpinnerStyle() == pe.b.f77287f) || this.f53289w0.getSpinnerStyle().f77293c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        oe.a aVar2 = this.f53291x0;
        if (aVar2 != null && aVar2.getView() == view) {
            if (!y(this.D) || (!this.J && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f53248c, view.getBottom());
                int i11 = this.G0;
                if (i11 != 0 && (paint = this.f53295z0) != null) {
                    paint.setColor(i11);
                    if (this.f53291x0.getSpinnerStyle().f77293c) {
                        iMin = view.getTop();
                    } else if (this.f53291x0.getSpinnerStyle() == pe.b.f77285d) {
                        iMin = view.getTop() + this.f53248c;
                    }
                    canvas.drawRect(0.0f, iMin, getWidth(), view.getBottom(), this.f53295z0);
                }
                if ((this.F && this.f53291x0.getSpinnerStyle() == pe.b.f77287f) || this.f53291x0.getSpinnerStyle().f77293c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // oe.f
    @NonNull
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f53265k0.getNestedScrollAxes();
    }

    @Nullable
    public oe.c getRefreshFooter() {
        oe.a aVar = this.f53291x0;
        if (aVar instanceof oe.c) {
            return (oe.c) aVar;
        }
        return null;
    }

    @Nullable
    public oe.d getRefreshHeader() {
        oe.a aVar = this.f53289w0;
        if (aVar instanceof oe.d) {
            return (oe.d) aVar;
        }
        return null;
    }

    @NonNull
    public RefreshState getState() {
        return this.C0;
    }

    public ValueAnimator i(int i10, int i11, Interpolator interpolator, int i12) {
        if (this.f53248c == i10) {
            return null;
        }
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.O0.cancel();
            this.O0 = null;
        }
        this.N0 = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f53248c, i10);
        this.O0 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i12);
        this.O0.setInterpolator(interpolator);
        this.O0.addListener(new d());
        this.O0.addUpdateListener(new e());
        this.O0.setStartDelay(i11);
        this.O0.start();
        return this.O0;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.R && (this.L || this.C || this.D);
    }

    public void j(float f10) {
        RefreshState refreshState;
        if (this.O0 == null) {
            if (f10 > 0.0f && ((refreshState = this.C0) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                this.N0 = new j(f10, this.f53267l0);
                return;
            }
            if (f10 < 0.0f && (this.C0 == RefreshState.Loading || ((this.I && this.U && this.V && y(this.D)) || (this.M && !this.U && y(this.D) && this.C0 != RefreshState.Refreshing)))) {
                this.N0 = new j(f10, -this.f53271n0);
            } else if (this.f53248c == 0 && this.K) {
                this.N0 = new j(f10, 0);
            }
        }
    }

    public boolean k() {
        return l(this.J0 ? 0 : 400, this.f53256g, (this.f53279r0 + this.f53283t0) / 2.0f, false);
    }

    public boolean l(int i10, int i11, float f10, boolean z10) {
        if (this.C0 != RefreshState.None || !y(this.C)) {
            return false;
        }
        i iVar = new i(f10, i11, z10);
        setViceState(RefreshState.Refreshing);
        if (i10 > 0) {
            this.A0.postDelayed(iVar, i10);
            return true;
        }
        iVar.run();
        return true;
    }

    public boolean m() {
        return l(this.J0 ? 0 : 400, this.f53256g, (this.f53279r0 + this.f53283t0) / 2.0f, true);
    }

    public oe.f n() {
        return q(true);
    }

    public oe.f o(int i10) {
        return p(i10, true, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        oe.a aVar;
        qe.c cVar;
        super.onAttachedToWindow();
        boolean z10 = true;
        this.J0 = true;
        if (!isInEditMode()) {
            if (this.f53289w0 == null && (cVar = Q0) != null) {
                oe.d dVarA = cVar.a(getContext(), this);
                if (dVarA == null) {
                    throw new RuntimeException("DefaultRefreshHeaderCreator can not return null");
                }
                P(dVarA);
            }
            if (this.f53291x0 == null) {
                qe.b bVar = P0;
                if (bVar != null) {
                    oe.c cVarA = bVar.a(getContext(), this);
                    if (cVarA == null) {
                        throw new RuntimeException("DefaultRefreshFooterCreator can not return null");
                    }
                    N(cVarA);
                }
            } else {
                if (!this.D && this.W) {
                    z10 = false;
                }
                this.D = z10;
            }
            if (this.f53293y0 == null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    oe.a aVar2 = this.f53289w0;
                    if ((aVar2 == null || childAt != aVar2.getView()) && ((aVar = this.f53291x0) == null || childAt != aVar.getView())) {
                        this.f53293y0 = new te.a(childAt);
                    }
                }
            }
            if (this.f53293y0 == null) {
                int iC = se.b.c(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R$string.srl_content_empty);
                super.addView(textView, 0, new LayoutParams(-1, -1));
                te.a aVar3 = new te.a(textView);
                this.f53293y0 = aVar3;
                aVar3.getView().setPadding(iC, iC, iC, iC);
            }
            View viewFindViewById = findViewById(this.f53278r);
            View viewFindViewById2 = findViewById(this.f53280s);
            this.f53293y0.f(this.f53255f0);
            this.f53293y0.b(this.Q);
            this.f53293y0.j(this.B0, viewFindViewById, viewFindViewById2);
            if (this.f53248c != 0) {
                D(RefreshState.None);
                oe.b bVar2 = this.f53293y0;
                this.f53248c = 0;
                bVar2.d(0, this.f53282t, this.f53284u);
            }
        }
        int[] iArr = this.B;
        if (iArr != null) {
            oe.a aVar4 = this.f53289w0;
            if (aVar4 != null) {
                aVar4.setPrimaryColors(iArr);
            }
            oe.a aVar5 = this.f53291x0;
            if (aVar5 != null) {
                aVar5.setPrimaryColors(this.B);
            }
        }
        oe.b bVar3 = this.f53293y0;
        if (bVar3 != null) {
            super.bringChildToFront(bVar3.getView());
        }
        oe.a aVar6 = this.f53289w0;
        if (aVar6 != null && aVar6.getSpinnerStyle().f77292b) {
            super.bringChildToFront(this.f53289w0.getView());
        }
        oe.a aVar7 = this.f53291x0;
        if (aVar7 == null || !aVar7.getSpinnerStyle().f77292b) {
            return;
        }
        super.bringChildToFront(this.f53291x0.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J0 = false;
        this.W = true;
        this.N0 = null;
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.O0.removeAllUpdateListeners();
            this.O0.setDuration(0L);
            this.O0.cancel();
            this.O0 = null;
        }
        oe.a aVar = this.f53289w0;
        if (aVar != null && this.C0 == RefreshState.Refreshing) {
            aVar.j(this, false);
        }
        oe.a aVar2 = this.f53291x0;
        if (aVar2 != null && this.C0 == RefreshState.Loading) {
            aVar2.j(this, false);
        }
        if (this.f53248c != 0) {
            this.B0.e(0, true);
        }
        RefreshState refreshState = this.C0;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2) {
            D(refreshState2);
        }
        Handler handler = this.A0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.K0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFinishInflate() {
        /*
            r11 = this;
            super.onFinishInflate()
            int r0 = super.getChildCount()
            r1 = 3
            if (r0 > r1) goto L9e
            r2 = -1
            r3 = 0
            r5 = r2
            r4 = r3
            r6 = r4
        Lf:
            r7 = 2
            r8 = 1
            if (r4 >= r0) goto L33
            android.view.View r9 = super.getChildAt(r4)
            boolean r10 = se.b.e(r9)
            if (r10 == 0) goto L24
            if (r6 < r7) goto L21
            if (r4 != r8) goto L24
        L21:
            r5 = r4
            r6 = r7
            goto L30
        L24:
            boolean r7 = r9 instanceof oe.a
            if (r7 != 0) goto L30
            if (r6 >= r8) goto L30
            if (r4 <= 0) goto L2e
            r6 = r8
            goto L2f
        L2e:
            r6 = r3
        L2f:
            r5 = r4
        L30:
            int r4 = r4 + 1
            goto Lf
        L33:
            if (r5 < 0) goto L4d
            te.a r4 = new te.a
            android.view.View r6 = super.getChildAt(r5)
            r4.<init>(r6)
            r11.f53293y0 = r4
            if (r5 != r8) goto L48
            if (r0 != r1) goto L45
            goto L46
        L45:
            r7 = r2
        L46:
            r1 = r3
            goto L4f
        L48:
            if (r0 != r7) goto L4d
            r1 = r2
            r7 = r8
            goto L4f
        L4d:
            r1 = r2
            r7 = r1
        L4f:
            r4 = r3
        L50:
            if (r4 >= r0) goto L9d
            android.view.View r5 = super.getChildAt(r4)
            if (r4 == r1) goto L8b
            if (r4 == r7) goto L65
            if (r1 != r2) goto L65
            oe.a r6 = r11.f53289w0
            if (r6 != 0) goto L65
            boolean r6 = r5 instanceof oe.d
            if (r6 == 0) goto L65
            goto L8b
        L65:
            if (r4 == r7) goto L6d
            if (r7 != r2) goto L9a
            boolean r6 = r5 instanceof oe.c
            if (r6 == 0) goto L9a
        L6d:
            boolean r6 = r11.D
            if (r6 != 0) goto L78
            boolean r6 = r11.W
            if (r6 != 0) goto L76
            goto L78
        L76:
            r6 = r3
            goto L79
        L78:
            r6 = r8
        L79:
            r11.D = r6
            boolean r6 = r5 instanceof oe.c
            if (r6 == 0) goto L82
            oe.c r5 = (oe.c) r5
            goto L88
        L82:
            te.b r6 = new te.b
            r6.<init>(r5)
            r5 = r6
        L88:
            r11.f53291x0 = r5
            goto L9a
        L8b:
            boolean r6 = r5 instanceof oe.d
            if (r6 == 0) goto L92
            oe.d r5 = (oe.d) r5
            goto L98
        L92:
            te.c r6 = new te.c
            r6.<init>(r5)
            r5 = r6
        L98:
            r11.f53289w0 = r5
        L9a:
            int r4 = r4 + 1
            goto L50
        L9d:
            return
        L9e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "最多只支持3个子View，Most only support three sub view"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.onFinishInflate():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = super.getChildAt(i14);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(R$id.srl_tag))) {
                oe.b bVar = this.f53293y0;
                if (bVar != null && bVar.getView() == childAt) {
                    boolean z11 = isInEditMode() && this.J && y(this.C) && this.f53289w0 != null;
                    View view = this.f53293y0.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : S0;
                    int i15 = marginLayoutParams.leftMargin + paddingLeft;
                    int i16 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i15;
                    int measuredHeight = view.getMeasuredHeight() + i16;
                    if (z11 && z(this.G, this.f53289w0)) {
                        int i17 = this.f53267l0;
                        i16 += i17;
                        measuredHeight += i17;
                    }
                    view.layout(i15, i16, measuredWidth, measuredHeight);
                }
                oe.a aVar = this.f53289w0;
                if (aVar != null && aVar.getView() == childAt) {
                    boolean z12 = isInEditMode() && this.J && y(this.C);
                    View view2 = this.f53289w0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : S0;
                    int i18 = marginLayoutParams2.leftMargin;
                    int i19 = marginLayoutParams2.topMargin + this.f53275p0;
                    int measuredWidth2 = view2.getMeasuredWidth() + i18;
                    int measuredHeight2 = view2.getMeasuredHeight() + i19;
                    if (!z12 && this.f53289w0.getSpinnerStyle() == pe.b.f77285d) {
                        int i20 = this.f53267l0;
                        i19 -= i20;
                        measuredHeight2 -= i20;
                    }
                    view2.layout(i18, i19, measuredWidth2, measuredHeight2);
                }
                oe.a aVar2 = this.f53291x0;
                if (aVar2 != null && aVar2.getView() == childAt) {
                    boolean z13 = isInEditMode() && this.J && y(this.D);
                    View view3 = this.f53291x0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : S0;
                    pe.b spinnerStyle = this.f53291x0.getSpinnerStyle();
                    int i21 = marginLayoutParams3.leftMargin;
                    int measuredHeight3 = (marginLayoutParams3.topMargin + getMeasuredHeight()) - this.f53277q0;
                    if (this.U && this.V && this.I && this.f53293y0 != null && this.f53291x0.getSpinnerStyle() == pe.b.f77285d && y(this.D)) {
                        View view4 = this.f53293y0.getView();
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (spinnerStyle == pe.b.f77289h) {
                        measuredHeight3 = marginLayoutParams3.topMargin - this.f53277q0;
                    } else {
                        if (z13 || spinnerStyle == pe.b.f77288g || spinnerStyle == pe.b.f77287f) {
                            iMax = this.f53271n0;
                        } else if (spinnerStyle.f77293c && this.f53248c < 0) {
                            iMax = Math.max(y(this.D) ? -this.f53248c : 0, 0);
                        }
                        measuredHeight3 -= iMax;
                    }
                    view3.layout(i21, measuredHeight3, view3.getMeasuredWidth() + i21, view3.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f10, float f11, boolean z10) {
        return this.f53263j0.dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f10, float f11) {
        return (this.K0 && f11 > 0.0f) || R(-f11) || this.f53263j0.dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        int i12 = this.f53257g0;
        int i13 = 0;
        if (i11 * i12 > 0) {
            if (Math.abs(i11) > Math.abs(this.f53257g0)) {
                int i14 = this.f53257g0;
                this.f53257g0 = 0;
                i13 = i14;
            } else {
                this.f53257g0 -= i11;
                i13 = i11;
            }
            C(this.f53257g0);
        } else if (i11 > 0 && this.K0) {
            int i15 = i12 - i11;
            this.f53257g0 = i15;
            C(i15);
            i13 = i11;
        }
        this.f53263j0.dispatchNestedPreScroll(i10, i11 - i13, iArr, null);
        iArr[1] = iArr[1] + i13;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13) {
        qe.i iVar;
        ViewParent parent;
        qe.i iVar2;
        boolean zDispatchNestedScroll = this.f53263j0.dispatchNestedScroll(i10, i11, i12, i13, this.f53261i0);
        int i14 = i13 + this.f53261i0[1];
        if ((i14 < 0 && ((this.C || this.L) && (this.f53257g0 != 0 || (iVar2 = this.f53255f0) == null || iVar2.b(this.f53293y0.getView())))) || (i14 > 0 && ((this.D || this.L) && (this.f53257g0 != 0 || (iVar = this.f53255f0) == null || iVar.a(this.f53293y0.getView()))))) {
            RefreshState refreshState = this.D0;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.B0.g(i14 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zDispatchNestedScroll && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i15 = this.f53257g0 - i14;
            this.f53257g0 = i15;
            C(i15);
        }
        if (!this.K0 || i11 >= 0) {
            return;
        }
        this.K0 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10) {
        this.f53265k0.onNestedScrollAccepted(view, view2, i10);
        this.f53263j0.startNestedScroll(i10 & 2);
        this.f53257g0 = this.f53248c;
        this.f53259h0 = true;
        x(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i10) {
        return (isEnabled() && isNestedScrollingEnabled() && (i10 & 2) != 0) && (this.L || this.C || this.D);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
        this.f53265k0.onStopNestedScroll(view);
        this.f53259h0 = false;
        this.f53257g0 = 0;
        E();
        this.f53263j0.stopNestedScroll();
    }

    public oe.f p(int i10, boolean z10, boolean z11) {
        int i11 = i10 >> 16;
        int i12 = (i10 << 16) >> 16;
        h hVar = new h(i11, z11, z10);
        if (i12 > 0) {
            this.A0.postDelayed(hVar, i12);
        } else {
            hVar.run();
        }
        return this;
    }

    public oe.f q(boolean z10) {
        return p(z10 ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E0))), 300) << 16 : 0, z10, false);
    }

    public oe.f r() {
        return p(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E0))), 300) << 16, true, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (ViewCompat.isNestedScrollingEnabled(this.f53293y0.g())) {
            this.f53276q = z10;
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public oe.f s() {
        return v(true);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.R = z10;
        this.f53263j0.setNestedScrollingEnabled(z10);
    }

    public void setStateDirectLoading(boolean z10) {
        RefreshState refreshState = this.C0;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.E0 = System.currentTimeMillis();
            this.K0 = true;
            D(refreshState2);
            qe.e eVar = this.f53251d0;
            if (eVar != null) {
                if (z10) {
                    eVar.a(this);
                }
            } else if (this.f53253e0 == null) {
                o(2000);
            }
            oe.a aVar = this.f53291x0;
            if (aVar != null) {
                float f10 = this.f53281s0;
                if (f10 < 10.0f) {
                    f10 *= this.f53271n0;
                }
                aVar.d(this, this.f53271n0, (int) f10);
            }
            qe.f fVar = this.f53253e0;
            if (fVar == null || !(this.f53291x0 instanceof oe.c)) {
                return;
            }
            if (z10) {
                fVar.a(this);
            }
            float f11 = this.f53281s0;
            if (f11 < 10.0f) {
                f11 *= this.f53271n0;
            }
            this.f53253e0.m((oe.c) this.f53291x0, this.f53271n0, (int) f11);
        }
    }

    public void setStateLoading(boolean z10) {
        b bVar = new b(z10);
        D(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorA = this.B0.a(-this.f53271n0);
        if (valueAnimatorA != null) {
            valueAnimatorA.addListener(bVar);
        }
        oe.a aVar = this.f53291x0;
        if (aVar != null) {
            float f10 = this.f53281s0;
            if (f10 < 10.0f) {
                f10 *= this.f53271n0;
            }
            aVar.e(this, this.f53271n0, (int) f10);
        }
        qe.f fVar = this.f53253e0;
        if (fVar != null) {
            oe.a aVar2 = this.f53291x0;
            if (aVar2 instanceof oe.c) {
                float f11 = this.f53281s0;
                if (f11 < 10.0f) {
                    f11 *= this.f53271n0;
                }
                fVar.l((oe.c) aVar2, this.f53271n0, (int) f11);
            }
        }
        if (valueAnimatorA == null) {
            bVar.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z10) {
        c cVar = new c(z10);
        D(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorA = this.B0.a(this.f53267l0);
        if (valueAnimatorA != null) {
            valueAnimatorA.addListener(cVar);
        }
        oe.a aVar = this.f53289w0;
        if (aVar != null) {
            float f10 = this.f53279r0;
            if (f10 < 10.0f) {
                f10 *= this.f53267l0;
            }
            aVar.e(this, this.f53267l0, (int) f10);
        }
        qe.f fVar = this.f53253e0;
        if (fVar != null) {
            oe.a aVar2 = this.f53289w0;
            if (aVar2 instanceof oe.d) {
                float f11 = this.f53279r0;
                if (f11 < 10.0f) {
                    f11 *= this.f53267l0;
                }
                fVar.q((oe.d) aVar2, this.f53267l0, (int) f11);
            }
        }
        if (valueAnimatorA == null) {
            cVar.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.C0;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            D(RefreshState.None);
        }
        if (this.D0 != refreshState) {
            this.D0 = refreshState;
        }
    }

    public oe.f t(int i10) {
        return u(i10, true, Boolean.FALSE);
    }

    public oe.f u(int i10, boolean z10, Boolean bool) {
        int i11 = i10 >> 16;
        int i12 = (i10 << 16) >> 16;
        g gVar = new g(i11, bool, z10);
        if (i12 > 0) {
            this.A0.postDelayed(gVar, i12);
        } else {
            gVar.run();
        }
        return this;
    }

    public oe.f v(boolean z10) {
        return z10 ? u(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E0))), 300) << 16, true, Boolean.FALSE) : u(0, false, null);
    }

    public oe.f w() {
        return u(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E0))), 300) << 16, true, Boolean.TRUE);
    }

    public boolean x(int i10) {
        if (i10 == 0) {
            if (this.O0 != null) {
                RefreshState refreshState = this.C0;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                if (refreshState == RefreshState.PullDownCanceled) {
                    this.B0.g(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    this.B0.g(RefreshState.PullUpToLoad);
                }
                this.O0.setDuration(0L);
                this.O0.cancel();
                this.O0 = null;
            }
            this.N0 = null;
        }
        return this.O0 != null;
    }

    public boolean y(boolean z10) {
        return z10 && !this.N;
    }

    public boolean z(boolean z10, @Nullable oe.a aVar) {
        return z10 || this.N || aVar == null || aVar.getSpinnerStyle() == pe.b.f77287f;
    }
}
