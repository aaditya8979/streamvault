package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
/* JADX INFO: loaded from: classes8.dex */
public final class g0 {
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StyledPlayerControlView f22745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final View f22746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ViewGroup f22747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ViewGroup f22748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ViewGroup f22749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final ViewGroup f22750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ViewGroup f22751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final ViewGroup f22752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final ViewGroup f22753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final View f22754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final View f22755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatorSet f22756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnimatorSet f22757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnimatorSet f22758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AnimatorSet f22759o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnimatorSet f22760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator f22761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ValueAnimator f22762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f22763s = new Runnable() { // from class: com.google.android.exoplayer2.ui.t
        @Override // java.lang.Runnable
        public final void run() {
            this.f22833b.c0();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f22764t = new Runnable() { // from class: com.google.android.exoplayer2.ui.z
        @Override // java.lang.Runnable
        public final void run() {
            this.f22839b.D();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f22765u = new Runnable() { // from class: com.google.android.exoplayer2.ui.a0
        @Override // java.lang.Runnable
        public final void run() {
            this.f22728b.H();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Runnable f22766v = new Runnable() { // from class: com.google.android.exoplayer2.ui.b0
        @Override // java.lang.Runnable
        public final void run() {
            this.f22736b.G();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f22767w = new Runnable() { // from class: com.google.android.exoplayer2.ui.c0
        @Override // java.lang.Runnable
        public final void run() {
            this.f22738b.E();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View.OnLayoutChangeListener f22768x = new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.d0
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f22740b.R(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };
    public boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f22770z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<View> f22769y = new ArrayList();

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (g0.this.f22746b != null) {
                g0.this.f22746b.setVisibility(4);
            }
            if (g0.this.f22747c != null) {
                g0.this.f22747c.setVisibility(4);
            }
            if (g0.this.f22749e != null) {
                g0.this.f22749e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(g0.this.f22754j instanceof DefaultTimeBar) || g0.this.A) {
                return;
            }
            ((DefaultTimeBar) g0.this.f22754j).g(250L);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (g0.this.f22746b != null) {
                g0.this.f22746b.setVisibility(0);
            }
            if (g0.this.f22747c != null) {
                g0.this.f22747c.setVisibility(0);
            }
            if (g0.this.f22749e != null) {
                g0.this.f22749e.setVisibility(g0.this.A ? 0 : 4);
            }
            if (!(g0.this.f22754j instanceof DefaultTimeBar) || g0.this.A) {
                return;
            }
            ((DefaultTimeBar) g0.this.f22754j).t(250L);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f22773b;

        public c(StyledPlayerControlView styledPlayerControlView) {
            this.f22773b = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.Z(1);
            if (g0.this.B) {
                this.f22773b.post(g0.this.f22763s);
                g0.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.Z(3);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f22775b;

        public d(StyledPlayerControlView styledPlayerControlView) {
            this.f22775b = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.Z(2);
            if (g0.this.B) {
                this.f22775b.post(g0.this.f22763s);
                g0.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.Z(3);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f22777b;

        public e(StyledPlayerControlView styledPlayerControlView) {
            this.f22777b = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.Z(2);
            if (g0.this.B) {
                this.f22777b.post(g0.this.f22763s);
                g0.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.Z(3);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.Z(4);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.Z(4);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (g0.this.f22750f != null) {
                g0.this.f22750f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (g0.this.f22752h != null) {
                g0.this.f22752h.setVisibility(0);
                g0.this.f22752h.setTranslationX(g0.this.f22752h.getWidth());
                g0.this.f22752h.scrollTo(g0.this.f22752h.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (g0.this.f22752h != null) {
                g0.this.f22752h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (g0.this.f22750f != null) {
                g0.this.f22750f.setVisibility(0);
            }
        }
    }

    public g0(StyledPlayerControlView styledPlayerControlView) {
        this.f22745a = styledPlayerControlView;
        this.f22746b = styledPlayerControlView.findViewById(R$id.exo_controls_background);
        this.f22747c = (ViewGroup) styledPlayerControlView.findViewById(R$id.exo_center_controls);
        this.f22749e = (ViewGroup) styledPlayerControlView.findViewById(R$id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(R$id.exo_bottom_bar);
        this.f22748d = viewGroup;
        this.f22753i = (ViewGroup) styledPlayerControlView.findViewById(R$id.exo_time);
        View viewFindViewById = styledPlayerControlView.findViewById(R$id.exo_progress);
        this.f22754j = viewFindViewById;
        this.f22750f = (ViewGroup) styledPlayerControlView.findViewById(R$id.exo_basic_controls);
        this.f22751g = (ViewGroup) styledPlayerControlView.findViewById(R$id.exo_extra_controls);
        this.f22752h = (ViewGroup) styledPlayerControlView.findViewById(R$id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = styledPlayerControlView.findViewById(R$id.exo_overflow_show);
        this.f22755k = viewFindViewById2;
        View viewFindViewById3 = styledPlayerControlView.findViewById(R$id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22742b.T(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22742b.T(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22743b.J(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22834b.K(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = styledPlayerControlView.getResources();
        int i10 = R$dimen.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i10) - resources.getDimension(R$dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i10);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f22756l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(styledPlayerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(N(0.0f, dimension, viewFindViewById)).with(N(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22757m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(styledPlayerControlView));
        animatorSet2.play(N(dimension, dimension2, viewFindViewById)).with(N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f22758n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(styledPlayerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(N(0.0f, dimension2, viewFindViewById)).with(N(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f22759o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(N(dimension, 0.0f, viewFindViewById)).with(N(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f22760p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(N(dimension2, 0.0f, viewFindViewById)).with(N(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f22761q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22837b.L(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f22762r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22838b.M(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    public static int B(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f22746b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f22747c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f22749e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f22746b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f22747c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f22749e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static ObjectAnimator N(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    public static int z(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(@Nullable View view) {
        return view != null && this.f22769y.contains(view);
    }

    public void C() {
        int i10 = this.f22770z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        V();
        if (!this.C) {
            E();
        } else if (this.f22770z == 1) {
            H();
        } else {
            D();
        }
    }

    public final void D() {
        this.f22758n.start();
    }

    public final void E() {
        Z(2);
    }

    public void F() {
        int i10 = this.f22770z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        V();
        E();
    }

    public final void G() {
        this.f22756l.start();
        U(this.f22765u, 2000L);
    }

    public final void H() {
        this.f22757m.start();
    }

    public boolean I() {
        return this.f22770z == 0 && this.f22745a.h0();
    }

    public void O() {
        this.f22745a.addOnLayoutChangeListener(this.f22768x);
    }

    public void P() {
        this.f22745a.removeOnLayoutChangeListener(this.f22768x);
    }

    public void Q(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f22746b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public final void R(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean zE0 = e0();
        if (this.A != zE0) {
            this.A = zE0;
            view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22835b.d0();
                }
            });
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (this.A || !z10) {
            return;
        }
        view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f22836b.S();
            }
        });
    }

    public final void S() {
        int i10;
        if (this.f22750f == null || this.f22751g == null) {
            return;
        }
        int width = (this.f22745a.getWidth() - this.f22745a.getPaddingLeft()) - this.f22745a.getPaddingRight();
        while (true) {
            if (this.f22751g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f22751g.getChildCount() - 2;
            View childAt = this.f22751g.getChildAt(childCount);
            this.f22751g.removeViewAt(childCount);
            this.f22750f.addView(childAt, 0);
        }
        View view = this.f22755k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f22753i);
        int childCount2 = this.f22750f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            iB += B(this.f22750f.getChildAt(i11));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f22752h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f22762r.isStarted()) {
                return;
            }
            this.f22761q.cancel();
            this.f22762r.start();
            return;
        }
        View view2 = this.f22755k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f22755k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f22750f.getChildAt(i12);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f22750f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f22751g.addView((View) arrayList.get(i10), this.f22751g.getChildCount() - 1);
        }
    }

    public final void T(View view) {
        W();
        if (view.getId() == R$id.exo_overflow_show) {
            this.f22761q.start();
        } else if (view.getId() == R$id.exo_overflow_hide) {
            this.f22762r.start();
        }
    }

    public final void U(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f22745a.postDelayed(runnable, j10);
        }
    }

    public void V() {
        this.f22745a.removeCallbacks(this.f22767w);
        this.f22745a.removeCallbacks(this.f22764t);
        this.f22745a.removeCallbacks(this.f22766v);
        this.f22745a.removeCallbacks(this.f22765u);
    }

    public void W() {
        if (this.f22770z == 3) {
            return;
        }
        V();
        int showTimeoutMs = this.f22745a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                U(this.f22767w, showTimeoutMs);
            } else if (this.f22770z == 1) {
                U(this.f22765u, 2000L);
            } else {
                U(this.f22766v, showTimeoutMs);
            }
        }
    }

    public void X(boolean z10) {
        this.C = z10;
    }

    public void Y(@Nullable View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f22769y.remove(view);
            return;
        }
        if (this.A && a0(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f22769y.add(view);
    }

    public final void Z(int i10) {
        int i11 = this.f22770z;
        this.f22770z = i10;
        if (i10 == 2) {
            this.f22745a.setVisibility(8);
        } else if (i11 == 2) {
            this.f22745a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f22745a.i0();
        }
    }

    public final boolean a0(View view) {
        int id2 = view.getId();
        return id2 == R$id.exo_bottom_bar || id2 == R$id.exo_prev || id2 == R$id.exo_next || id2 == R$id.exo_rew || id2 == R$id.exo_rew_with_amount || id2 == R$id.exo_ffwd || id2 == R$id.exo_ffwd_with_amount;
    }

    public void b0() {
        if (!this.f22745a.h0()) {
            this.f22745a.setVisibility(0);
            this.f22745a.s0();
            this.f22745a.n0();
        }
        c0();
    }

    public final void c0() {
        if (!this.C) {
            Z(0);
            W();
            return;
        }
        int i10 = this.f22770z;
        if (i10 == 1) {
            this.f22759o.start();
        } else if (i10 == 2) {
            this.f22760p.start();
        } else if (i10 == 3) {
            this.B = true;
        } else if (i10 == 4) {
            return;
        }
        W();
    }

    public final void d0() {
        ViewGroup viewGroup = this.f22749e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        if (this.f22754j != null) {
            int dimensionPixelSize = this.f22745a.getResources().getDimensionPixelSize(R$dimen.exo_styled_progress_margin_bottom);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f22754j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f22754j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f22754j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.A) {
                    defaultTimeBar.h(true);
                } else {
                    int i10 = this.f22770z;
                    if (i10 == 1) {
                        defaultTimeBar.h(false);
                    } else if (i10 != 3) {
                        defaultTimeBar.s();
                    }
                }
            }
        }
        for (View view2 : this.f22769y) {
            view2.setVisibility((this.A && a0(view2)) ? 4 : 0);
        }
    }

    public final boolean e0() {
        int width = (this.f22745a.getWidth() - this.f22745a.getPaddingLeft()) - this.f22745a.getPaddingRight();
        int height = (this.f22745a.getHeight() - this.f22745a.getPaddingBottom()) - this.f22745a.getPaddingTop();
        int iB = B(this.f22747c);
        ViewGroup viewGroup = this.f22747c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f22747c.getPaddingRight() : 0);
        int iZ = z(this.f22747c);
        ViewGroup viewGroup2 = this.f22747c;
        return width <= Math.max(paddingLeft, B(this.f22753i) + B(this.f22755k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f22747c.getPaddingBottom() : 0)) + (z(this.f22748d) * 2);
    }

    public final void y(float f10) {
        if (this.f22752h != null) {
            this.f22752h.setTranslationX((int) (r0.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup = this.f22753i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup2 = this.f22750f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
    }
}
