package jh;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends i0 {
    public Activity C;
    public MainInterstitialAdCallBack D;
    public PAGInterstitialAd E;
    public String F = "";
    public String G = "";
    public final l0 H = new l0(this);
    public final d0 I = new d0(this);

    @Override // jh.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = activity;
        this.D = pVar;
        i.e eVar = this.f71962k;
        this.F = eVar.f63659a;
        this.G = eVar.f63661c;
        AdLog.d("appID " + this.F + ", posID " + this.G);
        AbstractC4634il.IL1Iii(activity.getApplicationContext(), new m0(this), this.F);
    }

    @Override // jh.i0
    public final void C() {
        PAGInterstitialAd pAGInterstitialAd = this.E;
        if (pAGInterstitialAd != null) {
            pAGInterstitialAd.show(this.C);
        }
    }
}
