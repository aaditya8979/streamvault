package jh;

import android.app.Activity;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends i0 {
    public MainInterstitialAdCallBack C;
    public MBNewInterstitialHandler D;
    public String E = "";
    public String F = "";
    public String G = "";
    public String H = "";
    public final o I = new o(this);

    @Override // jh.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = pVar;
        try {
            i.e eVar = this.f71962k;
            String str = eVar.f63660b;
            this.E = str;
            String str2 = eVar.f63659a;
            this.F = str2;
            String str3 = eVar.f63661c;
            this.G = str3;
            String str4 = eVar.f63664f;
            this.H = str4;
            AdLog.i("appKey " + str + ", appID " + str2 + ", placementId " + str3 + ", unitID " + str4);
            AbstractC4634il.IL1Iii(activity.getApplicationContext(), this.F, this.E, new b0(this, activity));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // jh.i0
    public final void C() {
        try {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.D;
            if (mBNewInterstitialHandler == null) {
                v("ad instance is null");
            } else if (mBNewInterstitialHandler.isReady()) {
                this.D.show();
            } else {
                v("ad not ready");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            v(e10.getMessage());
        }
    }

    @Override // j.n0
    public final boolean t() {
        try {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.D;
            if (mBNewInterstitialHandler != null) {
                return true ^ mBNewInterstitialHandler.isReady();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return true;
    }
}
