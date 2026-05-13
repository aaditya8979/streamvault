package k;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements MaxAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f72654b;

    public n(y yVar) {
        this.f72654b = yVar;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        this.f72654b.D.onAdClick();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f72654b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        y yVar = this.f72654b;
        yVar.D.onAdShow(bp.r0.b(maxAd, yVar.f71957f));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
        this.f72654b.D.onAdClose();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        this.f72654b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        y yVar = this.f72654b;
        if (yVar.G) {
            return;
        }
        yVar.F = true;
        if (yVar.E == null || !AppLovinSdk.getInstance(yVar.C).isInitialized()) {
            return;
        }
        if (!this.f72654b.E.isReady()) {
            this.f72654b.E.loadAd();
            return;
        }
        this.f72654b.r(maxAd);
        this.f72654b.f(maxAd.getRevenue());
        this.f72654b.f71977z = "applovin_" + maxAd.getNetworkName();
        this.f72654b.D.onAdLoaded();
    }
}
