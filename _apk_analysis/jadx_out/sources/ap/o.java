package ap;

import android.view.View;
import bp.r0;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.ironsource.Z7;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements MaxAdViewAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f5251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f5252c;

    public o(c cVar, View view) {
        this.f5252c = cVar;
        this.f5251b = view;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f5252c.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClick();
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdCollapsed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f5252c.v(maxError.getCode() + Z7.f30794r + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        c cVar = this.f5252c;
        cVar.H = maxAd;
        MainThirdBannerCallBack mainThirdBannerCallBack = cVar.F;
        if (mainThirdBannerCallBack == null || !cVar.D) {
            return;
        }
        mainThirdBannerCallBack.onAdShow(r0.b(maxAd, cVar.f71957f));
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdExpanded(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        AdLog.d(this.f5252c.E, "thirdBanner, applovin load failed, msg = " + maxError.getCode() + Z7.f30794r + maxError.getMessage());
        this.f5252c.v(maxError.getCode() + Z7.f30794r + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        c cVar = this.f5252c;
        if (cVar.J || cVar.I) {
            return;
        }
        cVar.I = true;
        cVar.f(maxAd.getRevenue());
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f5252c.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdLoaded(this.f5251b);
        }
    }
}
