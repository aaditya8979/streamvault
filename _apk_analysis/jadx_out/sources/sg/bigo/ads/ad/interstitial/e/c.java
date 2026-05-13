package sg.bigo.ads.ad.interstitial.e;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f80825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.e.a.a f80826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.e.a.c f80827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.h.a f80828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconAds f80829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80830f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f80832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f80833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.e.a f80834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.e.a f80835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f80836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f80837m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f80831g = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f80838n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f80839o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f80840p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<NativeAd> f80841q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<NativeAd> f80842r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map<Integer, Boolean> f80843s = new ConcurrentHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map<Integer, Boolean> f80844t = new ConcurrentHashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List<Integer> f80845u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<Integer> f80846v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final sg.bigo.ads.api.d f80847w = new sg.bigo.ads.api.d() { // from class: sg.bigo.ads.ad.interstitial.e.c.1
        private int a(@NonNull NativeAd nativeAd, @NonNull List<NativeAd> list) {
            c cVar = c.this;
            int iA = sg.bigo.ads.ad.interstitial.e.a.b.a(cVar.f80840p ? cVar.f80826b : cVar.f80827c);
            int iIndexOf = list.indexOf(nativeAd);
            if (iA == 0) {
                return 0;
            }
            return iIndexOf / iA;
        }

        @Override // sg.bigo.ads.api.d
        public final void a(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.ad.interstitial.e.a.b bVar;
            List<Integer> list;
            List<NativeAd> list2;
            Map<Integer, Boolean> map;
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad impression.");
            c cVar = c.this;
            if (cVar.f80840p) {
                bVar = cVar.f80826b;
                list = cVar.f80845u;
                list2 = cVar.f80841q;
                map = cVar.f80843s;
            } else {
                bVar = cVar.f80827c;
                list = cVar.f80846v;
                list2 = cVar.f80842r;
                map = cVar.f80844t;
            }
            c.a(bVar, list, list2, map, a(nativeAd, list2));
        }

        @Override // sg.bigo.ads.api.d
        public final void a(@NonNull NativeAd nativeAd, @NonNull AdError adError) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad error, code=" + adError.getCode() + ", message=" + adError.getMessage());
        }

        @Override // sg.bigo.ads.api.d
        public final void b(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
            n nVar = c.this.f80836l;
            if (nVar != null) {
                nVar.b();
                c.this.f80836l = null;
            }
            n nVar2 = c.this.f80837m;
            if (nVar2 != null) {
                nVar2.b();
                c.this.f80837m = null;
            }
        }

        @Override // sg.bigo.ads.api.d
        public final void c(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
        }

        @Override // sg.bigo.ads.api.d
        public final void d(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
        }
    };

    public static class a implements IconAdsRequest.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f80858a;

        private a() {
            this.f80858a = 1;
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        @Override // sg.bigo.ads.api.IconAdsRequest.b
        public final int a() {
            return this.f80858a;
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f80859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f80860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final ViewGroup f80861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final sg.bigo.ads.ad.interstitial.e.a.b f80862d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f80863e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f80864f;

        private b(@NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar) {
            this.f80861c = viewGroup;
            this.f80862d = bVar;
            this.f80859a = 0L;
            this.f80860b = false;
            this.f80863e = false;
            this.f80864f = false;
        }

        public /* synthetic */ b(ViewGroup viewGroup, sg.bigo.ads.ad.interstitial.e.a.b bVar, byte b10) {
            this(viewGroup, bVar);
        }

        public final ValueAnimator a(@Nullable Integer num) {
            if (num == null) {
                return null;
            }
            return sg.bigo.ads.common.w.b.a(this.f80861c, num.intValue(), new b.a() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f80865a = 300;

                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return this.f80865a;
                }
            });
        }

        public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable Integer num, final sg.bigo.ads.ad.interstitial.e.a aVar) {
            u.b(view);
            viewGroup.addView(view);
            sg.bigo.ads.common.e.a.a(view, 100.0f);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(12);
            } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
            }
            final ValueAnimator valueAnimatorA = a(num);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.1f, 1, 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.2
                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    b.this.a(aVar);
                }

                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    ValueAnimator valueAnimator = valueAnimatorA;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            });
            view.startAnimation(translateAnimation);
        }

        public void a(final sg.bigo.ads.ad.interstitial.e.a aVar) {
            if (aVar != null && aVar.f80795c > 0) {
                aVar.f80794b.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.ad.interstitial.e.a aVar2 = aVar;
                        aVar2.f80794b.setFlipInterval(aVar2.f80795c);
                        aVar.f80794b.c();
                    }
                });
            }
        }

        public abstract boolean a();

        public final void b() {
            this.f80860b = true;
            this.f80863e = false;
            this.f80861c.removeCallbacks(this);
        }

        public final void c() {
            this.f80863e = false;
            this.f80864f = true;
            this.f80861c.removeCallbacks(this);
        }

        public final boolean d() {
            if (this.f80860b || this.f80863e) {
                return false;
            }
            this.f80863e = true;
            this.f80864f = false;
            if (this.f80859a == 0) {
                this.f80859a = SystemClock.elapsedRealtime();
            }
            this.f80861c.postDelayed(this, Math.max(this.f80862d.j() - (SystemClock.elapsedRealtime() - this.f80859a), 0L));
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f80860b && !this.f80864f && a()) {
                this.f80860b = true;
            }
            this.f80863e = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NonNull s sVar, @NonNull m mVar, @Nullable sg.bigo.ads.ad.interstitial.h.a aVar) {
        this.f80825a = sVar;
        this.f80826b = new sg.bigo.ads.ad.interstitial.e.a.a(mVar);
        this.f80827c = new sg.bigo.ads.ad.interstitial.e.a.c(mVar, aVar == null || aVar.g());
        this.f80828d = aVar;
    }

    public static /* synthetic */ List a(IconAds iconAds) {
        if (!(iconAds instanceof sg.bigo.ads.ad.a.a)) {
            if (iconAds != null) {
                return Arrays.asList(iconAds.getNativeAds());
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sg.bigo.ads.ad.b.a.c cVar : ((sg.bigo.ads.ad.a.a) iconAds).f79810a) {
            if (!cVar.isExpired() && !cVar.f80028i) {
                if (cVar.I) {
                    arrayList.add(cVar);
                } else if (!cVar.J) {
                    arrayList2.add(cVar);
                }
            }
        }
        arrayList.addAll(arrayList2);
        sg.bigo.ads.ad.b.a.c[] cVarArr = new sg.bigo.ads.ad.b.a.c[arrayList.size()];
        sg.bigo.ads.common.utils.k.a(arrayList, cVarArr);
        return Arrays.asList(cVarArr);
    }

    public static /* synthetic */ n a(c cVar, final sg.bigo.ads.ad.interstitial.e.a.b bVar, final List list) {
        int iO;
        if (bVar == null || !bVar.a() || (iO = bVar.o()) < 0) {
            return null;
        }
        return new n(r.f82514a.a(iO)) { // from class: sg.bigo.ads.ad.interstitial.e.c.5
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                NativeAd nativeAd = (NativeAd) list.get(0);
                if (nativeAd instanceof sg.bigo.ads.ad.b.b) {
                    sg.bigo.ads.ad.b.a.c cVar2 = (sg.bigo.ads.ad.b.a.c) nativeAd;
                    if (cVar2.f80026g) {
                        return;
                    }
                    cVar2.a((sg.bigo.ads.common.i) null, bVar.b(), 22);
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(sg.bigo.ads.ad.interstitial.e.a.b r7, java.util.List r8, java.util.List r9, java.util.Map r10, int r11) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.e.c.a(sg.bigo.ads.ad.interstitial.e.a.b, java.util.List, java.util.List, java.util.Map, int):void");
    }

    public static void a(sg.bigo.ads.ad.interstitial.e.a aVar, b bVar) {
        if (aVar != null) {
            aVar.f80794b.d();
        } else if (bVar != null) {
            bVar.c();
        }
    }

    public static /* synthetic */ void a(c cVar, int i10) {
        Ad ad2 = cVar.f80829e;
        if (ad2 instanceof sg.bigo.ads.api.b.g) {
            ((sg.bigo.ads.api.b.g) ad2).f81827b = i10;
        }
    }

    public static /* synthetic */ void a(c cVar, sg.bigo.ads.ad.interstitial.e.a.b bVar, int i10, List list) {
        if (bVar == null || list == null) {
            return;
        }
        sg.bigo.ads.core.d.b.a(cVar.f80825a.f(), i10, bVar.i(), cVar.f80839o, list.size(), bVar.f(), bVar.a());
    }

    public static /* synthetic */ void a(c cVar, boolean z10) {
        Ad ad2 = cVar.f80829e;
        if (ad2 instanceof sg.bigo.ads.api.b.g) {
            ((sg.bigo.ads.api.b.g) ad2).f81828c = z10;
        }
    }

    public static void b(sg.bigo.ads.ad.interstitial.e.a aVar, b bVar) {
        if (aVar == null) {
            if (bVar != null) {
                bVar.d();
            }
        } else {
            int i10 = aVar.f80795c;
            if (i10 > 0) {
                aVar.f80794b.setFlipInterval(i10);
                aVar.f80794b.c();
            }
        }
    }

    private void d() {
        b();
        sg.bigo.ads.ad.interstitial.e.a aVar = this.f80834j;
        if (aVar != null) {
            aVar.f80794b.d();
            u.b(this.f80834j.f80793a);
        }
        this.f80834j = null;
    }

    public final void a(ViewGroup viewGroup, final int i10) {
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) this.f80825a.f(), i10);
        this.f80840p = true;
        if (viewGroup == null) {
            a(this.f80826b, "endPageView is null", i10);
            return;
        }
        if (sg.bigo.ads.ad.interstitial.e.a.b.b(this.f80826b)) {
            a(this.f80826b, "config is invalid", i10);
            return;
        }
        if (!a(i10)) {
            a(this.f80826b, "icon request hasScene return false", i10);
            return;
        }
        d();
        b bVar = new b(viewGroup, this.f80826b) { // from class: sg.bigo.ads.ad.interstitial.e.c.3
            {
                byte b10 = 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
            @Override // sg.bigo.ads.ad.interstitial.e.c.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean a() {
                /*
                    Method dump skipped, instruction units count: 235
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.e.c.AnonymousClass3.a():boolean");
            }
        };
        this.f80832h = bVar;
        bVar.d();
    }

    public final void a(sg.bigo.ads.ad.interstitial.e.a.b bVar, String str, int i10) {
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a(this.f80825a.f(), str, i10, bVar.i(), this.f80839o, bVar.f());
        }
    }

    public final boolean a() {
        s sVar = this.f80825a;
        return sVar.f80028i || sVar.H().f80028i;
    }

    public final boolean a(int i10) {
        return (this.f80830f & i10) == i10;
    }

    public final void b() {
        b bVar = this.f80832h;
        if (bVar != null) {
            bVar.b();
        }
        this.f80832h = null;
    }

    public final void c() {
        b bVar = this.f80833i;
        if (bVar != null) {
            bVar.b();
        }
        this.f80833i = null;
    }
}
