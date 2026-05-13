package jh;

import android.app.Activity;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends i0 {
    public Activity C;
    public MainInterstitialAdCallBack D;
    public InterstitialAd E;
    public AdInfo F;
    public long G = 0;
    public String H = "";
    public final f I = new f(this);
    public final c J = new c(this);

    @Override // jh.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = activity;
        this.D = pVar;
        this.H = this.f71962k.f63661c;
        AdLog.d("unitID " + this.H);
        try {
            AbstractC4634il.IL1Iii(activity, new d(this, activity));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // jh.i0
    public final void C() {
        InterstitialAd interstitialAd = this.E;
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(this.J);
            this.E.show(this.C);
        }
    }

    public final void D(AdValue adValue) {
        f(adValue.getValueMicros() / 1000000);
        this.f71977z = "admob_" + this.E.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        AdInfo adInfo = new AdInfo();
        this.F = adInfo;
        adInfo.setRevenue(adValue.getValueMicros() / 1000000);
        int precisionType = adValue.getPrecisionType();
        this.F.setRevenuePrecision(precisionType != 0 ? precisionType != 1 ? precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE" : "ESTIMATED" : "UNKNOWN");
        String mediationAdapterClassName = this.E.getResponseInfo().getMediationAdapterClassName();
        this.F.setNetworkName(this.E.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName() + '-' + mediationAdapterClassName);
        r(this.F);
    }

    public final void E() {
        this.G = System.currentTimeMillis();
        this.E.setOnPaidEventListener(new OnPaidEventListener() { // from class: jh.i
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                this.f72446a.D(adValue);
            }
        });
        this.D.onAdLoaded();
    }

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    @Override // j.n0
    public final boolean t() {
        try {
            return System.currentTimeMillis() - this.G > 3600000;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return true;
        }
    }
}
