package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.d6;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class x1 extends w1 {
    private final y1 M;
    private g0 N;
    private long O;
    private final AtomicBoolean P;

    public x1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new y1(this.f10567a, this.f10570d, this.f10568b);
        this.P = new AtomicBoolean();
    }

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.f10567a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fH1 = ((com.applovin.impl.sdk.ad.a) bVar).h1();
        if (fH1 <= 0.0f) {
            fH1 = this.f10567a.r();
        }
        return (long) (n7.c(fH1) * (((double) this.f10567a.y()) / 100.0d));
    }

    private int D() {
        g0 g0Var;
        int iMin = 100;
        if (h()) {
            if (((Boolean) this.f10568b.a(x4.f10738h1)).booleanValue() && !this.f10567a.hasShown()) {
                return 0;
            }
            if (!E() && (g0Var = this.N) != null) {
                iMin = (int) Math.min(100.0d, ((this.O - g0Var.b()) / this.O) * 100.0d);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f10569c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10569c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f10583q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f10577k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f10576j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f10576j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f10567a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.w1
    public void A() {
        this.M.a(this.f10578l);
        this.f10583q = SystemClock.elapsedRealtime();
        this.P.set(true);
    }

    public boolean E() {
        if (!(this.J && this.f10567a.a1()) && h()) {
            return this.P.get();
        }
        return true;
    }

    public void I() {
        long jP;
        long millis = 0;
        if (this.f10567a.O() >= 0 || this.f10567a.P() >= 0) {
            if (this.f10567a.O() >= 0) {
                jP = this.f10567a.O();
            } else {
                if (this.f10567a.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f10567a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) this.f10567a.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                }
                jP = (long) (millis * (((double) this.f10567a.P()) / 100.0d));
            }
            c(jP);
        }
    }

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        this.M.a(this.f10577k, this.f10576j, b(), viewGroup);
        if (((Boolean) this.f10568b.a(x4.X5)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.f10576j;
            if (kVar != null) {
                kVar.b();
            }
            SpecialsBridge.appLovinAdViewRenderAd(b(), this.f10567a);
            a("javascript:al_onPoststitialShow();", this.f10567a.x());
            if (h()) {
                long jC = C();
                this.O = jC;
                if (jC > 0) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f10569c.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.O + "ms...");
                    }
                    this.N = g0.a(this.O, this.f10568b, new Runnable() { // from class: com.applovin.impl.ag
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7804b.F();
                        }
                    });
                }
            }
            if (this.f10577k != null) {
                if (this.f10567a.r() >= 0) {
                    a(this.f10577k, this.f10567a.r(), new Runnable() { // from class: com.applovin.impl.bg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7899b.G();
                        }
                    });
                } else {
                    this.f10577k.setVisibility(0);
                }
            }
            I();
            this.f10568b.q0().a(new r6(this.f10568b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.cg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7960b.H();
                }
            }), d6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            p();
            super.c(n7.e(this.f10568b));
        }
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        if (!((Boolean) this.f10568b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f10567a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        g0 g0Var = this.N;
        if (g0Var != null) {
            g0Var.a();
            this.N = null;
        }
        super.a(str);
    }

    @Override // com.applovin.impl.w1
    public void b(long j10) {
    }

    @Override // com.applovin.impl.w1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.w1
    public void f() {
        super.f();
        A();
    }

    @Override // com.applovin.impl.w1
    public void m() {
        super.a(D(), false, E(), -2L);
    }

    @Override // com.applovin.impl.w1
    public void v() {
    }

    @Override // com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.w1
    public void x() {
        super.x();
        this.P.set(true);
    }
}
