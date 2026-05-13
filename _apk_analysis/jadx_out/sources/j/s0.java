package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainNativeAdCallBack f72010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l.r f72013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainNativeAdCallBack f72014e;

    public s0(Activity activity, String str, cp.m mVar) {
        this.curAdType = "信息流";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f72010a = mVar;
        this.f3397IL = 4;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        String strOptString;
        try {
            String strOptString2 = jSONObject.optString("platform");
            strOptString = jSONObject.optString("offline_adv");
            switch (strOptString2) {
                case "wx":
                    this.f72013d = new l.e0();
                    break;
                case "pangle":
                    this.f72013d = new l.m();
                    break;
                case "vungle":
                    this.f72013d = new l.z();
                    break;
                case "applovin":
                    this.f72013d = new l.l();
                    break;
                case "admob":
                    this.f72013d = new l.k();
                    break;
                case "mintegral":
                    this.f72013d = new l.i0();
                    break;
                case "facebook":
                    this.f72013d = new l.y();
                    break;
                case "bigo":
                    this.f72013d = new l.w();
                    break;
                case "inMobi":
                    this.f72013d = new l.t();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.f72013d = new l.e0();
                        break;
                    } else {
                        this.f72013d = null;
                        break;
                    }
                    break;
            }
            l.r rVar = this.f72013d;
            if (rVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f72010a));
                return;
            }
            rVar.f71969r = this.IL1Iii;
            rVar.f71970s = this.LL1IL;
            rVar.p(jSONObject, 4, this.curAdType, this.adPlcID, this.f3403iILLL1);
            l.r rVar2 = this.f72013d;
            z zVar = new z(this, rVar2, this.f72010a);
            rVar2.l(getLoadTimeOut());
            l.r rVar3 = this.f72013d;
            rVar3.f71974w = zVar;
            rVar3.B(this.IL1Iii, this.f72011b, this.f72012c, zVar);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f72010a));
        }
    }

    @Override // j.y1
    public final int getApiAdType() {
        return 11;
    }

    @Override // j.y1
    public final String getSubPlatform() {
        l.r rVar = this.f72013d;
        return rVar != null ? rVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        l.r rVar = this.f72013d;
        if (rVar != null) {
            return rVar.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        l.r rVar = this.f72013d;
        if (rVar != null) {
            return rVar.b();
        }
        return false;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f72013d = null;
    }
}
