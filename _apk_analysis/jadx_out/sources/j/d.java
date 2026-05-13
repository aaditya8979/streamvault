package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainMaterialCallback f71835a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71838d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MainMaterialCallback f71841g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ct.u f71836b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f71839e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f71840f = false;

    public d(Activity activity, String str, cp.s sVar) {
        this.curAdType = "pauseInterstitial";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3397IL = 28;
        this.f71835a = sVar;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        String strOptString;
        try {
            String strOptString2 = jSONObject.optString("platform");
            strOptString = jSONObject.optString("offline_adv");
            switch (strOptString2) {
                case "wx":
                    this.f71836b = new ct.n();
                    break;
                case "pangle":
                    this.f71836b = new ct.b0();
                    break;
                case "vungle":
                    this.f71836b = new ct.e();
                    break;
                case "admob":
                    this.f71836b = new ct.a0();
                    break;
                case "applovin":
                    this.f71836b = new ct.g();
                    break;
                case "mintegral":
                    this.f71836b = new ct.v();
                    break;
                case "facebook":
                    this.f71836b = new ct.m0();
                    break;
                case "bigo":
                    this.f71836b = new ct.i0();
                    break;
                case "inMobi":
                    this.f71836b = new ct.a();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.f71836b = new ct.n();
                        break;
                    } else {
                        this.f71836b = null;
                        break;
                    }
                    break;
            }
            ct.u uVar = this.f71836b;
            if (uVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f71835a));
                return;
            }
            uVar.f71969r = this.IL1Iii;
            uVar.f71970s = this.LL1IL;
            uVar.p(jSONObject, 28, this.curAdType, this.adPlcID, this.f3403iILLL1);
            ct.u uVar2 = this.f71836b;
            uVar2.B = this.f71837c;
            uVar2.C = this.f71838d;
            uVar2.D = this.f71839e;
            uVar2.E = this.f71840f;
            l1 l1Var = new l1(this, uVar2, this.f71835a);
            uVar2.l(getLoadTimeOut());
            ct.u uVar3 = this.f71836b;
            uVar3.f71974w = l1Var;
            uVar3.B(this.IL1Iii, l1Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f71835a));
        }
    }

    @Override // j.y1
    public final int getApiAdType() {
        return 28;
    }

    @Override // j.y1
    public final String getSubPlatform() {
        ct.u uVar = this.f71836b;
        return uVar != null ? uVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        ct.u uVar = this.f71836b;
        if (uVar != null) {
            return uVar.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        ct.u uVar = this.f71836b;
        if (uVar != null) {
            return uVar.b();
        }
        return false;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f71836b = null;
    }
}
