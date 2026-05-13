package h;

import android.view.View;
import bp.r0;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.ironsource.Z7;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements MaxAdViewAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f62952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f62953c;

    public o(c cVar, View view) {
        this.f62953c = cVar;
        this.f62952b = view;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        MainMRECCallBack mainMRECCallBack = this.f62953c.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClick();
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdCollapsed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f62953c.v(maxError.getCode() + Z7.f30794r + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        c cVar = this.f62953c;
        cVar.H = maxAd;
        MainMRECCallBack mainMRECCallBack = cVar.F;
        if (mainMRECCallBack == null || !cVar.D) {
            return;
        }
        mainMRECCallBack.onAdShow(r0.b(maxAd, cVar.f71957f));
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdExpanded(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        AdLog.d(this.f62953c.E, "thirdBanner, applovin load failed, msg = " + maxError.getCode() + Z7.f30794r + maxError.getMessage());
        this.f62953c.v(maxError.getCode() + Z7.f30794r + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        c cVar = this.f62953c;
        if (cVar.J || cVar.I) {
            return;
        }
        cVar.I = true;
        cVar.f(maxAd.getRevenue());
        MainMRECCallBack mainMRECCallBack = this.f62953c.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdLoaded(this.f62952b);
        }
    }
}
