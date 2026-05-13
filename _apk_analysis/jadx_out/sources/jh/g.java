package jh;

import android.app.Activity;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;
import sg.bigo.ads.api.InterstitialAd;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends i0 {
    public MainInterstitialAdCallBack C;
    public InterstitialAd D;
    public String E = "";
    public final a0 F = new a0(this);

    @Override // jh.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = pVar;
        i.e eVar = this.f71962k;
        String str = eVar.f63659a;
        this.E = eVar.f63661c;
        AbstractC4634il.IL1Iii(activity, str, new r(this));
    }

    @Override // jh.i0
    public final void C() {
        try {
            InterstitialAd interstitialAd = this.D;
            if (interstitialAd == null) {
                v("channelAd is null");
            } else if (!interstitialAd.isExpired()) {
                this.D.show();
            } else {
                this.D.destroy();
                v("channelAd is expired");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }
}
