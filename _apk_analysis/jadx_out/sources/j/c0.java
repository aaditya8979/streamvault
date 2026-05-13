package j;

import android.app.Activity;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainMRECCallBack f71826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f71827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h.j f71829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainMRECCallBack f71830e;

    public c0(Activity activity, String str, cp.e eVar) {
        this.curAdType = BrandSafetyUtils.f51658o;
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3397IL = 31;
        this.f71826a = eVar;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("platform");
            String strOptString2 = jSONObject.optString("offline_adv");
            byte b10 = -1;
            int iHashCode = strOptString.hashCode();
            if (iHashCode != 3809) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 1179703863 && strOptString.equals("applovin")) {
                        b10 = 1;
                    }
                } else if (strOptString.equals("admob")) {
                    b10 = 2;
                }
            } else if (strOptString.equals(Constant.platform)) {
                b10 = 0;
            }
            if (b10 == 0) {
                this.f71829d = new h.i();
            } else if (b10 == 1) {
                this.f71829d = new h.c();
            } else if (b10 == 2) {
                this.f71829d = new h.n();
            } else if (TextUtils.isEmpty(strOptString2)) {
                this.f71829d = null;
            } else {
                this.f71829d = new h.i();
            }
            h.j jVar = this.f71829d;
            if (jVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f71826a));
                return;
            }
            jVar.f71969r = this.IL1Iii;
            jVar.f71970s = this.LL1IL;
            jVar.p(jSONObject, 31, this.curAdType, this.adPlcID, this.f3403iILLL1);
            h.j jVar2 = this.f71829d;
            jVar2.B = this.f71827b;
            jVar2.C = this.f71828c;
            z1 z1Var = new z1(this, jVar2, this.f71826a);
            jVar2.f71974w = z1Var;
            jVar2.l(getLoadTimeOut());
            this.f71829d.B(this.IL1Iii, z1Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f71826a));
        }
    }

    @Override // j.y1
    public final int getApiAdType() {
        return 31;
    }

    @Override // j.y1
    public final String getSubPlatform() {
        h.j jVar = this.f71829d;
        return jVar != null ? jVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        return this.f71829d == null;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        h.j jVar = this.f71829d;
        if (jVar != null) {
            return jVar.b();
        }
        return false;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f71829d = null;
    }
}
