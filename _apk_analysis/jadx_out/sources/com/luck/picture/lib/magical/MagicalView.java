package com.luck.picture.lib.magical;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import com.luck.picture.lib.config.PictureSelectionConfig;

/* JADX INFO: loaded from: classes.dex */
public class MagicalView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f35101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FrameLayout f35109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f35110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ua.b f35111t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f35112u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ua.c f35115x;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MagicalView.this.H(fFloatValue, r0.f35096e, MagicalView.this.f35102k, MagicalView.this.f35095d, MagicalView.this.f35105n, MagicalView.this.f35098g, MagicalView.this.f35103l, MagicalView.this.f35097f, MagicalView.this.f35104m);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MagicalView.this.E();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TransitionManager.beginDelayedTransition((ViewGroup) MagicalView.this.f35109r.getParent(), new TransitionSet().setDuration(250L).addTransition(new ChangeBounds()).addTransition(new ChangeTransform()).addTransition(new ChangeImageTransform()));
            MagicalView.this.w(true);
            MagicalView.this.f35109r.setTranslationX(0.0f);
            MagicalView.this.f35109r.setTranslationY(0.0f);
            MagicalView.this.f35111t.d(MagicalView.this.f35098g);
            MagicalView.this.f35111t.a(MagicalView.this.f35097f);
            MagicalView.this.f35111t.c(MagicalView.this.f35096e);
            MagicalView.this.f35111t.b(MagicalView.this.f35095d);
            MagicalView.this.y(true);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MagicalView.this.f35115x != null) {
                MagicalView.this.f35115x.c();
            }
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MagicalView.this.f35108q = true;
            MagicalView.this.f35093b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MagicalView.this.f35110s.setAlpha(MagicalView.this.f35093b);
            if (MagicalView.this.f35115x != null) {
                MagicalView.this.f35115x.d(MagicalView.this.f35093b);
            }
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f35121b;

        public f(boolean z10) {
            this.f35121b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MagicalView.this.f35108q = false;
            if (!this.f35121b || MagicalView.this.f35115x == null) {
                return;
            }
            MagicalView.this.f35115x.c();
        }
    }

    public MagicalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MagicalView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35093b = 0.0f;
        this.f35094c = 250L;
        this.f35108q = false;
        this.f35112u = PictureSelectionConfig.e().L;
        this.f35101j = ab.e.d(getContext());
        getScreenSize();
        View view = new View(context);
        this.f35110s = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setAlpha(this.f35093b);
        addView(view);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35109r = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f35111t = new ua.b(frameLayout);
    }

    private void getScreenSize() {
        this.f35099h = ab.e.e(getContext());
        if (this.f35112u) {
            this.f35100i = ab.e.d(getContext());
        } else {
            this.f35100i = ab.e.g(getContext());
        }
    }

    public void A(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        if (this.f35112u || (i12 = this.f35099h) > (i13 = this.f35100i)) {
            return;
        }
        if (((int) (i12 / (i10 / i11))) > i13) {
            this.f35100i = this.f35101j;
            if (z10) {
                this.f35111t.d(i12);
                this.f35111t.a(this.f35100i);
            }
        }
    }

    public void B() {
        getScreenSize();
        J(true);
    }

    public void C(int i10, int i11, boolean z10) {
        getScreenSize();
        K(i10, i11, z10);
    }

    public final void D() {
        this.f35109r.getLocationOnScreen(new int[2]);
        this.f35105n = 0;
        int i10 = this.f35099h;
        int i11 = this.f35100i;
        float f10 = i10 / i11;
        int i12 = this.f35106o;
        int i13 = this.f35107p;
        if (f10 < i12 / i13) {
            this.f35103l = i10;
            int i14 = (int) (i10 * (i13 / i12));
            this.f35104m = i14;
            this.f35102k = (i11 - i14) / 2;
        } else {
            this.f35104m = i11;
            int i15 = (int) (i11 * (i12 / i13));
            this.f35103l = i15;
            this.f35102k = 0;
            this.f35105n = (i10 - i15) / 2;
        }
        this.f35111t.d(this.f35098g);
        this.f35111t.a(this.f35097f);
        this.f35111t.b(this.f35095d);
        this.f35111t.c(this.f35096e);
    }

    public final void E() {
        this.f35108q = false;
        z();
        ua.c cVar = this.f35115x;
        if (cVar != null) {
            cVar.b(this, false);
        }
    }

    public void F(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f35106o = i14;
        this.f35107p = i15;
        this.f35095d = i10;
        this.f35096e = i11;
        this.f35098g = i12;
        this.f35097f = i13;
    }

    public final void G(float f10, float f11, float f12, float f13) {
        I(true, 0.0f, 0.0f, f10, 0.0f, f11, 0.0f, f12, 0.0f, f13);
    }

    public final void H(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        I(false, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    public final void I(boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (z10) {
            this.f35111t.d(f16);
            this.f35111t.a(f18);
            this.f35111t.b((int) f14);
            this.f35111t.c((int) f12);
            return;
        }
        float f19 = (f14 - f13) * f10;
        float f20 = (f16 - f15) * f10;
        float f21 = (f18 - f17) * f10;
        this.f35111t.d(f15 + f20);
        this.f35111t.a(f17 + f21);
        this.f35111t.b((int) (f13 + f19));
        this.f35111t.c((int) (f11 + (f10 * (f12 - f11))));
    }

    public void J(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
            this.f35093b = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f35093b = f10;
        this.f35110s.setAlpha(f10);
        setVisibility(0);
        D();
        x(z10);
    }

    public void K(int i10, int i11, boolean z10) {
        this.f35106o = i10;
        this.f35107p = i11;
        this.f35095d = 0;
        this.f35096e = 0;
        this.f35098g = 0;
        this.f35097f = 0;
        setVisibility(0);
        D();
        G(this.f35102k, this.f35105n, this.f35103l, this.f35104m);
        if (z10) {
            this.f35093b = 1.0f;
            this.f35110s.setAlpha(1.0f);
        } else {
            this.f35093b = 0.0f;
            this.f35110s.setAlpha(0.0f);
            this.f35109r.setAlpha(0.0f);
            this.f35109r.animate().alpha(1.0f).setDuration(250L).start();
            this.f35110s.animate().alpha(1.0f).setDuration(250L).start();
        }
        E();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = r5.f35109r
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto Le
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            int r1 = r6.getAction()
            r2 = 1
            if (r1 == 0) goto L53
            if (r1 == r2) goto L4d
            r3 = 2
            if (r1 == r3) goto L1f
            r3 = 3
            if (r1 == r3) goto L4d
            goto L66
        L1f:
            float r1 = r6.getX()
            int r1 = (int) r1
            float r3 = r6.getY()
            int r3 = (int) r3
            int r4 = r5.f35113v
            int r1 = r1 - r4
            int r1 = java.lang.Math.abs(r1)
            int r4 = r5.f35114w
            int r4 = r3 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r1 <= r4) goto L40
            if (r0 == 0) goto L66
            r0.setUserInputEnabled(r2)
            goto L66
        L40:
            if (r0 == 0) goto L66
            int r1 = r5.f35114w
            int r1 = r1 - r3
            boolean r1 = r5.canScrollVertically(r1)
            r0.setUserInputEnabled(r1)
            goto L66
        L4d:
            if (r0 == 0) goto L66
            r0.setUserInputEnabled(r2)
            goto L66
        L53:
            float r1 = r6.getX()
            int r1 = (int) r1
            r5.f35113v = r1
            float r1 = r6.getY()
            int r1 = (int) r1
            r5.f35114w = r1
            if (r0 == 0) goto L66
            r0.setUserInputEnabled(r2)
        L66:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.magical.MagicalView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackgroundAlpha(float f10) {
        this.f35093b = f10;
        this.f35110s.setAlpha(f10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f35110s.setBackgroundColor(i10);
    }

    public void setMagicalContent(View view) {
        this.f35109r.addView(view);
    }

    public void setOnMojitoViewCallback(ua.c cVar) {
        this.f35115x = cVar;
    }

    public void t() {
        if (this.f35108q) {
            return;
        }
        if (this.f35098g == 0 || this.f35097f == 0) {
            v();
            return;
        }
        ua.c cVar = this.f35115x;
        if (cVar != null) {
            cVar.e();
        }
        w(false);
        u();
    }

    @RequiresApi(api = 21)
    public final void u() {
        this.f35109r.post(new c());
    }

    public final void v() {
        this.f35109r.animate().alpha(0.0f).setDuration(250L).setListener(new d()).start();
        this.f35110s.animate().alpha(0.0f).setDuration(250L).start();
    }

    public final void w(boolean z10) {
        if (z10) {
            this.f35115x.a(true);
        }
    }

    public final void x(boolean z10) {
        Interpolator interpolatorA;
        if (z10) {
            this.f35093b = 1.0f;
            this.f35110s.setAlpha(1.0f);
            G(this.f35102k, this.f35105n, this.f35103l, this.f35104m);
            E();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.addListener(new b());
        la.d dVar = PictureSelectionConfig.f34993m1;
        if (dVar != null && (interpolatorA = dVar.a()) != null) {
            valueAnimatorOfFloat.setInterpolator(interpolatorA);
        }
        valueAnimatorOfFloat.setDuration(250L).start();
        y(false);
    }

    public final void y(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f35093b, z10 ? 0.0f : 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new e());
        valueAnimatorOfFloat.addListener(new f(z10));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.start();
    }

    public final void z() {
        int i10 = this.f35100i;
        this.f35104m = i10;
        this.f35103l = this.f35099h;
        this.f35102k = 0;
        this.f35111t.a(i10);
        this.f35111t.d(this.f35099h);
        this.f35111t.c(0);
        this.f35111t.b(0);
    }
}
