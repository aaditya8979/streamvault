package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class j1 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainRewardVideoAdCallBack f71892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.f f71893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71894c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f71895d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f71896e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MainRewardVideoAdCallBack f71897f;

    public j1(Activity activity, String str, cp.a aVar) {
        this.curAdType = "激励视频";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f71892a = aVar;
        this.f3397IL = 3;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        String strOptString;
        c.f vVar;
        try {
            String strOptString2 = jSONObject.optString("platform");
            strOptString = jSONObject.optString("offline_adv");
            switch (strOptString2) {
                case "wx":
                    vVar = new c.v();
                    break;
                case "pangle":
                    vVar = new c.t();
                    break;
                case "unity":
                    vVar = new c.z();
                    break;
                case "vungle":
                    vVar = new c.d();
                    break;
                case "applovin":
                    vVar = new c.k0();
                    break;
                case "admob":
                    vVar = new c.i0();
                    break;
                case "mintegral":
                    vVar = new c.m();
                    break;
                case "facebook":
                    vVar = new c.w();
                    break;
                case "bigo":
                    vVar = new c.p();
                    break;
                case "ironSource":
                    vVar = new c.b();
                    break;
                case "inMobi":
                    vVar = new c.x();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString)) {
                        vVar = new c.v();
                        break;
                    } else {
                        vVar = null;
                        break;
                    }
                    break;
            }
            if (vVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f71892a));
                return;
            }
            vVar.f71969r = this.IL1Iii;
            vVar.f71970s = this.LL1IL;
            vVar.p(jSONObject, 3, this.curAdType, this.adPlcID, this.f3403iILLL1);
            vVar.f71967p = this.f71895d;
            vVar.f71968q = this.f71896e;
            b2 b2Var = new b2(this, vVar, this.f71892a);
            vVar.l(getLoadTimeOut());
            vVar.f71974w = b2Var;
            vVar.B(this.IL1Iii, this.f71894c, b2Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f71892a));
        }
    }

    @Override // j.y1
    public final int getApiAdType() {
        return 14;
    }

    @Override // j.y1
    public final String getSubPlatform() {
        c.f fVar = this.f71893b;
        return fVar != null ? fVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        c.f fVar = this.f71893b;
        if (fVar != null) {
            return fVar.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        c.f fVar = this.f71893b;
        if (fVar != null) {
            return fVar.b();
        }
        return false;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f71893b = null;
    }

    @Override // j.y1
    public final void onAdBidLose() {
        super.onAdBidLose();
        c.f fVar = this.f71893b;
        if (fVar != null) {
            fVar.w();
        }
    }

    @Override // j.y1
    public final void onAdBidWin() {
        super.onAdBidWin();
        c.f fVar = this.f71893b;
        if (fVar != null) {
            fVar.u();
        }
    }
}
