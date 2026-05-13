package jh;

import bp.m1;
import bp.r0;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements MaxAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f72449b;

    public k(t tVar) {
        this.f72449b = tVar;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        this.f72449b.C.onAdClick();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f72449b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        t tVar = this.f72449b;
        tVar.C.onAdShow(r0.b(maxAd, tVar.f71957f));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
        AdLog.d("interstitialAd load next ad");
        this.f72449b.D.loadAd();
        t tVar = this.f72449b;
        tVar.G = true;
        tVar.C.onAdClose();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        this.f72449b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        t tVar = this.f72449b;
        if (tVar.F) {
            return;
        }
        tVar.E = true;
        tVar.f(maxAd.getRevenue());
        this.f72449b.f71977z = "applovin_" + maxAd.getNetworkName();
        this.f72449b.r(maxAd);
        t tVar2 = this.f72449b;
        if (!tVar2.G) {
            tVar2.C.onAdLoaded();
            return;
        }
        m1 m1Var = new m1();
        m1Var.f5815a = tVar2.D;
        m1Var.f5816b = maxAd;
        bp.x xVarA = bp.x.a();
        String str = this.f72449b.H;
        xVarA.getClass();
        try {
            xVarA.f5886a.putIfAbsent(str, m1Var);
            AdLog.d(xVarA.f5887b, "putCache, cacheAdMap " + xVarA.f5886a.toString());
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        this.f72449b.G = false;
    }
}
