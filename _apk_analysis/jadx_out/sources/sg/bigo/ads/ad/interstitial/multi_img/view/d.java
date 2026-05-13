package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.FixContentFrameLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d<T extends View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f81208b = 300;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f81209c = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f81210d = u.f81465e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f81211e = -188383023;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f81212a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f81213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.c f81214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f81215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f81216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RoundedFrameLayout f81217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FixContentFrameLayout f81218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final T f81219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AdImageView f81220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f81221n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f81222o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bitmap f81223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f81224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f81225r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ValueAnimator f81227t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ValueAnimator f81228u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f81229v = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f81226s = false;

    public interface a {
        void a();

        void b();
    }

    public d(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, boolean z10, int i10, int i11, @LayoutRes int i12, @IdRes int i13, @IdRes int i14, @IdRes int i15) {
        this.f81213f = context;
        this.f81212a = z10;
        this.f81216i = i11;
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) sg.bigo.ads.common.utils.a.a(context, i12, null, false);
        this.f81217j = roundedFrameLayout;
        this.f81218k = (FixContentFrameLayout) roundedFrameLayout.findViewById(i13);
        this.f81219l = (T) roundedFrameLayout.findViewById(i14);
        this.f81220m = (AdImageView) roundedFrameLayout.findViewById(i15);
        a(cVar);
        a(i10);
        this.f81224q = f81210d;
        sg.bigo.ads.common.utils.u.a(roundedFrameLayout, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                d.this.f81229v = SystemClock.elapsedRealtime();
            }
        });
        roundedFrameLayout.setTag(f81211e, this);
    }

    public static /* synthetic */ void a(d dVar, final Bitmap bitmap, final int i10) {
        if (dVar.a()) {
            dVar.f81220m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(d.this.f81220m.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i10);
                    d.this.f81220m.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    d.this.f81220m.setImageDrawable(bitmapDrawable);
                }
            });
        }
    }

    public final void a(int i10) {
        int i11;
        if (i10 != Integer.MIN_VALUE) {
            if (i10 != 4) {
                if (i10 == 1) {
                    i11 = -1;
                } else if (i10 != 2) {
                    i10 = 3;
                } else {
                    i11 = ViewCompat.MEASURED_STATE_MASK;
                }
            }
            this.f81215h = i10;
        }
        i11 = 0;
        b(i11);
        this.f81215h = i10;
    }

    public final void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        FixContentFrameLayout.a aVar = (FixContentFrameLayout.a) this.f81219l.getLayoutParams();
        if (aVar.f82554a == i10 || aVar.f82555b == i11) {
            return;
        }
        aVar.f82554a = i10;
        aVar.f82555b = i11;
        this.f81219l.setLayoutParams(aVar);
    }

    public final void a(sg.bigo.ads.ad.interstitial.multi_img.c cVar) {
        FixContentFrameLayout fixContentFrameLayout;
        boolean z10;
        this.f81214g = cVar;
        if (a()) {
            int iA = e.a(this.f81213f, 12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f81218k.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.topMargin = iA;
            layoutParams.leftMargin = iA;
            layoutParams.rightMargin = iA;
            layoutParams.bottomMargin = iA;
            layoutParams.height = -2;
            layoutParams.width = -2;
            this.f81218k.setLayoutParams(layoutParams);
            fixContentFrameLayout = this.f81218k;
            z10 = true;
        } else {
            fixContentFrameLayout = this.f81218k;
            z10 = false;
        }
        fixContentFrameLayout.setFixContent(z10);
    }

    public boolean a() {
        return this.f81212a;
    }

    public final void b(final int i10) {
        if (a()) {
            this.f81220m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.5
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.f81220m.setBackgroundColor(i10);
                }
            });
        }
    }

    public final void b(Bitmap bitmap) {
        a aVar;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = ((this.f81229v > 0L ? 1 : (this.f81229v == 0L ? 0 : -1)) != 0 ? SystemClock.elapsedRealtime() - this.f81229v : 0L) > f81208b;
        if (c(this.f81216i) || c(this.f81215h)) {
            this.f81223p = sg.bigo.ads.common.utils.d.b(this.f81213f, bitmap);
            if (c(this.f81216i)) {
                this.f81222o = sg.bigo.ads.common.w.b.a(this.f81223p, ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.f81222o = ViewCompat.MEASURED_STATE_MASK;
            }
            final b.a aVar2 = new b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.2
                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return d.f81209c;
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final boolean a(int i10) {
                    d.this.f81224q = i10;
                    d dVar = d.this;
                    if (dVar.c(dVar.f81215h)) {
                        d dVar2 = d.this;
                        d.a(dVar2, dVar2.f81223p, d.this.f81224q);
                    }
                    if (d.this.f81225r != null) {
                        d.this.f81225r.a();
                    }
                    return super.a(i10);
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i10) {
                    if (d.this.f81225r != null) {
                        d.this.f81225r.b();
                    }
                }
            };
            if (z12) {
                ValueAnimator valueAnimator = this.f81228u;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, f81210d);
                this.f81228u = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                this.f81228u.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            int iIntValue = ((Integer) animatedValue).intValue();
                            b.a aVar3 = aVar2;
                            if (aVar3 != null) {
                                aVar3.a(iIntValue);
                            }
                        }
                    }
                });
                this.f81228u.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        b.a aVar3 = aVar2;
                        if (aVar3 != null) {
                            aVar3.b(d.f81210d);
                        }
                    }
                });
                if (aVar2.a() >= 0) {
                    this.f81228u.setDuration(aVar2.a());
                }
                this.f81228u.start();
            } else {
                aVar2.a(f81210d);
                aVar2.b(f81210d);
            }
            z11 = true;
        }
        if (d(this.f81216i) || d(this.f81215h)) {
            int iA = sg.bigo.ads.common.w.b.a(bitmap, ViewCompat.MEASURED_STATE_MASK);
            final b.a aVar3 = new b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.3
                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return d.f81209c;
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final boolean a(int i10) {
                    d.this.f81221n = i10;
                    d dVar = d.this;
                    if (dVar.d(dVar.f81215h)) {
                        d dVar2 = d.this;
                        dVar2.b(dVar2.f81221n);
                    }
                    if (d.this.f81225r != null) {
                        d.this.f81225r.a();
                    }
                    return super.a(i10);
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i10) {
                    if (d.this.f81225r != null) {
                        d.this.f81225r.b();
                    }
                }
            };
            if (z12) {
                ValueAnimator valueAnimator2 = this.f81227t;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f81227t = sg.bigo.ads.common.w.b.a(this.f81220m, iA, new b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.8
                    @Override // sg.bigo.ads.common.w.b.a
                    public final long a() {
                        b.a aVar4 = aVar3;
                        if (aVar4 != null) {
                            return aVar4.a();
                        }
                        return -1L;
                    }

                    @Override // sg.bigo.ads.common.w.b.a
                    public final boolean a(int i10) {
                        b.a aVar4 = aVar3;
                        if (aVar4 == null) {
                            return true;
                        }
                        aVar4.a(i10);
                        return true;
                    }

                    @Override // sg.bigo.ads.common.w.b.a
                    public final void b(int i10) {
                        b.a aVar4 = aVar3;
                        if (aVar4 != null) {
                            aVar4.b(i10);
                        }
                    }
                });
            } else {
                aVar3.a(iA);
                aVar3.b(iA);
            }
        } else {
            z10 = z11;
        }
        if (z10 || (aVar = this.f81225r) == null) {
            return;
        }
        aVar.b();
    }

    public final boolean c(int i10) {
        return this.f81226s ? i10 == 5 : i10 == 4;
    }

    public final boolean d(int i10) {
        return this.f81226s ? i10 == 4 : i10 == 3;
    }
}
