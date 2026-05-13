package c;

import bp.r0;
import bp.v0;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements MaxRewardedAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f6489b;

    public u(k0 k0Var) {
        this.f6489b = k0Var;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        this.f6489b.B.onAdClick();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f6489b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        k0 k0Var = this.f6489b;
        k0Var.B.onAdShow(r0.b(maxAd, k0Var.f71957f));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
        AdLog.i("applovin load the next ad");
        this.f6489b.C.loadAd();
        this.f6489b.B.onAdClose();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        this.f6489b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        k0 k0Var = this.f6489b;
        if (k0Var.E) {
            return;
        }
        k0Var.r(maxAd);
        this.f6489b.f(maxAd.getRevenue());
        this.f6489b.f71977z = "applovin_" + maxAd.getNetworkName();
        v0.a().b(this.f6489b.F, maxAd);
        k0 k0Var2 = this.f6489b;
        k0Var2.D = true;
        k0Var2.B.onAdVideoCache();
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public final void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        this.f6489b.B.onReward("");
    }
}
