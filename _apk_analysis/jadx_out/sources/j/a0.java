package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainInterstitialAdCallBack f71807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jh.i0 f71808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f71809c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MainInterstitialAdCallBack f71810d;

    public a0(Activity activity, String str, cp.u uVar) {
        this.curAdType = "插屏";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3397IL = 6;
        this.f71807a = uVar;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        String strOptString;
        jh.i0 uVar;
        try {
            String strOptString2 = jSONObject.optString("platform");
            strOptString = jSONObject.optString("offline_adv");
            switch (strOptString2) {
                case "wx":
                    uVar = new jh.u();
                    break;
                case "pangle":
                    uVar = new jh.z();
                    break;
                case "unity":
                    uVar = new jh.n();
                    break;
                case "vungle":
                    uVar = new jh.l();
                    break;
                case "applovin":
                    uVar = new jh.t();
                    break;
                case "admob":
                    uVar = new jh.j();
                    break;
                case "mintegral":
                    uVar = new jh.m();
                    break;
                case "facebook":
                    uVar = new jh.c0();
                    break;
                case "bigo":
                    uVar = new jh.g();
                    break;
                case "ironSource":
                    uVar = new jh.w();
                    break;
                case "inMobi":
                    uVar = new jh.v();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString)) {
                        uVar = new jh.u();
                        break;
                    } else {
                        uVar = null;
                        break;
                    }
                    break;
            }
            if (uVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f71807a));
                return;
            }
            uVar.f71969r = this.IL1Iii;
            uVar.f71970s = this.LL1IL;
            uVar.p(jSONObject, 6, this.curAdType, this.adPlcID, this.f3403iILLL1);
            uVar.B = this.f71809c;
            p pVar = new p(this, uVar, this.f71807a);
            uVar.l(getLoadTimeOut());
            uVar.f71974w = pVar;
            uVar.B(this.IL1Iii, pVar);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f71807a));
        }
    }

    @Override // j.y1
    public final int getApiAdType() {
        return 16;
    }

    @Override // j.y1
    public final String getSubPlatform() {
        jh.i0 i0Var = this.f71808b;
        return i0Var != null ? i0Var.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        jh.i0 i0Var = this.f71808b;
        if (i0Var != null) {
            return i0Var.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        jh.i0 i0Var = this.f71808b;
        if (i0Var != null) {
            return i0Var.b();
        }
        return false;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f71808b = null;
    }

    @Override // j.y1
    public final void onAdBidLose() {
        super.onAdBidLose();
        jh.i0 i0Var = this.f71808b;
        if (i0Var != null) {
            i0Var.w();
        }
    }

    @Override // j.y1
    public final void onAdBidWin() {
        super.onAdBidWin();
        jh.i0 i0Var = this.f71808b;
        if (i0Var != null) {
            i0Var.u();
        }
    }
}
