package jh;

import android.app.Activity;
import android.os.Handler;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends i0 {
    public MainInterstitialAdCallBack C;
    public MaxInterstitialAd D;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public String H = "";
    public final k I = new k(this);

    @Override // jh.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = pVar;
        try {
            this.H = this.f71962k.f63661c;
            AdLog.d("unitID " + this.H);
            AbstractC4634il.ILil(activity.getApplicationContext(), new g0(this, activity));
            if (this.f71970s) {
                AdLog.d("refreshAdCache, do not turn on the countdown");
            } else {
                new Handler().postDelayed(new x(this), this.f71975x);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // jh.i0
    public final void C() {
        try {
            MaxInterstitialAd maxInterstitialAd = this.D;
            if (maxInterstitialAd == null) {
                v("ChannelAD is null!");
            } else if (maxInterstitialAd.isReady()) {
                this.D.showAd(this.f71957f);
            } else {
                v("ChannelAD is not ready!");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // j.n0
    public final boolean b() {
        return true;
    }

    @Override // j.n0
    public final boolean t() {
        try {
            MaxInterstitialAd maxInterstitialAd = this.D;
            if (maxInterstitialAd != null) {
                return true ^ maxInterstitialAd.isReady();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return true;
    }

    @Override // j.n0
    public final void v(String str) {
        if (this.F || this.G) {
            return;
        }
        this.F = true;
        super.v(str);
    }
}
