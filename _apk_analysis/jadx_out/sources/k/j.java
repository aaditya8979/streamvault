package k;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends AppOpenAd.AppOpenAdLoadCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f72649c;

    public j(m mVar) {
        this.f72649c = mVar;
    }

    public final void a(AdValue adValue) {
        this.f72649c.f(adValue.getValueMicros() / 1000000);
        this.f72649c.f71977z = "admob_" + this.f72649c.E.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        this.f72649c.r(adValue);
        this.f72649c.G = new AdInfo();
        this.f72649c.G.setRevenue(adValue.getValueMicros() / 1000000);
        int precisionType = adValue.getPrecisionType();
        this.f72649c.G.setRevenuePrecision(precisionType != 0 ? precisionType != 1 ? precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE" : "ESTIMATED" : "UNKNOWN");
        m mVar = this.f72649c;
        mVar.G.setNetworkName(mVar.E.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f72649c.x(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        super.onAdLoaded(appOpenAd);
        m mVar = this.f72649c;
        mVar.E = appOpenAd;
        mVar.F = System.currentTimeMillis();
        this.f72649c.E.setOnPaidEventListener(new OnPaidEventListener() { // from class: k.i
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                this.f72647a.a(adValue);
            }
        });
        this.f72649c.D.onAdLoaded();
    }
}
