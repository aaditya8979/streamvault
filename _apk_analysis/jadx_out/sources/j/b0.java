package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainBannerCallBack f71816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f71817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.x f71819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainBannerCallBack f71820e;

    public b0(Activity activity, String str, cp.f fVar) {
        this.curAdType = "banner";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3397IL = 7;
        this.f71816a = fVar;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        String strOptString;
        try {
            String strOptString2 = jSONObject.optString("platform");
            strOptString = jSONObject.optString("offline_adv");
            switch (strOptString2) {
                case "wx":
                    this.f71819d = new f.g();
                    break;
                case "pangle":
                    this.f71819d = new f.s();
                    break;
                case "vungle":
                    this.f71819d = new f.i();
                    break;
                case "admob":
                    this.f71819d = new f.z();
                    break;
                case "applovin":
                    this.f71819d = new f.o();
                    break;
                case "mintegral":
                    this.f71819d = new f.q();
                    break;
                case "facebook":
                    this.f71819d = new f.f();
                    break;
                case "bigo":
                    this.f71819d = new f.f0();
                    break;
                case "inMobi":
                    this.f71819d = new f.j();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.f71819d = new f.g();
                        break;
                    } else {
                        this.f71819d = null;
                        break;
                    }
                    break;
            }
            f.x xVar = this.f71819d;
            if (xVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f71816a));
                return;
            }
            xVar.f71969r = this.IL1Iii;
            xVar.f71970s = this.LL1IL;
            xVar.p(jSONObject, 7, this.curAdType, this.adPlcID, this.f3403iILLL1);
            f.x xVar2 = this.f71819d;
            xVar2.B = this.f71817b;
            xVar2.C = this.f71818c;
            p1 p1Var = new p1(this, xVar2, this.f71816a);
            xVar2.f71974w = p1Var;
            xVar2.l(getLoadTimeOut());
            this.f71819d.B(this.IL1Iii, p1Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f71816a));
        }
    }

    @Override // j.y1
    public final int getApiAdType() {
        return 18;
    }

    @Override // j.y1
    public final String getSubPlatform() {
        f.x xVar = this.f71819d;
        return xVar != null ? xVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        f.x xVar = this.f71819d;
        if (xVar != null) {
            return xVar.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        f.x xVar = this.f71819d;
        if (xVar != null) {
            return xVar.b();
        }
        return false;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f71819d = null;
    }
}
