package sg.bigo.ads.ad.splash.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
import sg.bigo.ads.ad.b.a;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends sg.bigo.ads.ad.interstitial.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> f81688j = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewFlow f81689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Indicator f81690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RoundedFrameLayout f81691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.a f81692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.view.b f81693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.interstitial.multi_img.b f81694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final w f81695i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.b.b f81697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ViewGroup f81698m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.view.c f81700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.view.c f81701p;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a.InterfaceC0961a f81696k = new a.InterfaceC0961a() { // from class: sg.bigo.ads.ad.splash.a.i.1
        @Override // sg.bigo.ads.ad.b.a.InterfaceC0961a
        public final boolean a() {
            if (i.this.f81689c != null) {
                return i.this.f81689c.f82644h;
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v f81702q = new v() { // from class: sg.bigo.ads.ad.splash.a.i.3
        @Override // sg.bigo.ads.ad.interstitial.v
        public final void a() {
            Bitmap bitmap = b.f81602j;
            boolean zAR = ((sg.bigo.ads.core.a.a) i.this.f81697l.f()).aR();
            if (bitmap != null) {
                if (zAR) {
                    synchronized (i.f81688j) {
                        i.f81688j.remove(i.this.f81693g);
                    }
                }
                i.this.f81693g.a(bitmap);
            }
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.interstitial.d f81699n = new sg.bigo.ads.ad.interstitial.d();

    /* JADX INFO: renamed from: sg.bigo.ads.ad.splash.a.i$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81706a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f81706a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81706a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81706a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81706a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull ViewGroup viewGroup, @NonNull w wVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar2) {
        this.f81697l = bVar;
        this.f81698m = viewGroup;
        this.f81694h = bVar2;
        this.f81695i = wVar;
    }

    public static /* synthetic */ void a(i iVar, final long j10, long j11, final long j12) {
        if (j10 > 0) {
            ViewFlow viewFlow = iVar.f81689c;
            if (!viewFlow.f82643g && !viewFlow.e()) {
                iVar.f81689c.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(iVar.f81698m.getContext(), 40);
                final int scrollX = iVar.f81689c.getScrollX();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j12);
                valueAnimatorOfInt.setStartDelay(j11);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.splash.a.i.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        i.a(i.this, j10 - 1, 300L, j12);
                    }
                });
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.splash.a.i.7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            i.this.f81689c.scrollTo(scrollX + ((Integer) animatedValue).intValue(), i.this.f81689c.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        iVar.f81689c.setScrollEnabled(true);
    }

    public final sg.bigo.ads.ad.interstitial.multi_img.view.a a(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i10, String str, boolean z10) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(context, this.f81694h, cVar, d(), i10, str, z10, null);
        aVar.f81226s = true;
        ViewFlow.b bVar = new ViewFlow.b();
        bVar.f82680a = -1;
        bVar.f82681b = -1;
        bVar.f82682c = false;
        bVar.f82683d = cVar.f81156d;
        this.f81689c.addView(aVar.f81217j, bVar);
        if (this.f81692f != null) {
            aVar.f81225r = new d.a() { // from class: sg.bigo.ads.ad.splash.a.i.10
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    i.this.f81692f.a(i.this.f81689c.a(aVar.f81217j));
                }

                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void b() {
                    aVar.f81225r = null;
                    a();
                }
            };
        }
        return aVar;
    }

    public final int d() {
        m mVar = this.f81694h.f81136a;
        if (mVar == null) {
            return 1;
        }
        return sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar.a("video_play_page.mediaview_colour"));
    }

    public final boolean e() {
        return this.f81694h.f81137b == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public final void f() {
        if (e()) {
        }
        int iA = this.f81694h.f81136a.a("video_play_page.multi_guide");
        switch (iA) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(iA, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.i.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.this.f81689c.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.i.8.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (i.this.f81689c.f82643g) {
                                    return;
                                }
                                i.a(i.this, 3L, 0L, 300L);
                            }
                        });
                    }
                });
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f81689c.setFlipInterval((iA - 5) * 1000);
                this.f81689c.c();
                break;
        }
    }
}
