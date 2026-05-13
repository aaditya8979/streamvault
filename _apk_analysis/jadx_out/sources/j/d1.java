package j;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class d1 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f71845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainSplashAdCallBack f71846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k.t0 f71847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f71848d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainSplashAdCallBack f71849e;

    public d1(Activity activity, String str, ViewGroup viewGroup, cp.r rVar) {
        this.curAdType = "开屏";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f71845a = viewGroup;
        this.f71846b = rVar;
        this.f3397IL = 1;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        String strOptString;
        try {
            String strOptString2 = jSONObject.optString("platform");
            strOptString = jSONObject.optString("offline_adv");
            switch (strOptString2) {
                case "wx":
                    this.f71847c = new k.x();
                    break;
                case "pangle":
                    this.f71847c = new k.q0();
                    break;
                case "unity":
                    this.f71847c = new k.h();
                    break;
                case "vungle":
                    this.f71847c = new k.a0();
                    break;
                case "applovin":
                    this.f71847c = new k.y();
                    break;
                case "admob":
                    this.f71847c = new k.m();
                    break;
                case "mintegral":
                    this.f71847c = new k.z0();
                    break;
                case "facebook":
                    this.f71847c = new k.l0();
                    break;
                case "bigo":
                    this.f71847c = new k.k();
                    break;
                case "ironSource":
                    this.f71847c = new k.f0();
                    break;
                case "inMobi":
                    this.f71847c = new k.c0();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.f71847c = new k.x();
                        break;
                    } else {
                        this.f71847c = null;
                        break;
                    }
                    break;
            }
            k.t0 t0Var = this.f71847c;
            if (t0Var == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f71846b));
                return;
            }
            t0Var.f71969r = this.IL1Iii;
            t0Var.f71970s = this.LL1IL;
            t0Var.p(jSONObject, 1, this.curAdType, this.adPlcID, this.f3403iILLL1);
            k.t0 t0Var2 = this.f71847c;
            t0Var2.B = this.f71848d;
            e2 e2Var = new e2(this, t0Var2, this.f71846b);
            t0Var2.l(getLoadTimeOut());
            k.t0 t0Var3 = this.f71847c;
            t0Var3.f71974w = e2Var;
            t0Var3.B(this.IL1Iii, this.f71845a, e2Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f71846b));
        }
    }

    @Override // j.y1
    public final int getApiAdType() {
        return 13;
    }

    @Override // j.y1
    public final String getSubPlatform() {
        k.t0 t0Var = this.f71847c;
        return t0Var != null ? t0Var.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        k.t0 t0Var = this.f71847c;
        if (t0Var != null) {
            return t0Var.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        k.t0 t0Var = this.f71847c;
        if (t0Var != null) {
            return t0Var instanceof f.z;
        }
        return false;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f71847c = null;
    }

    @Override // j.y1
    public final void onAdBidLose() {
        super.onAdBidLose();
        k.t0 t0Var = this.f71847c;
        if (t0Var != null) {
            t0Var.w();
        }
    }

    @Override // j.y1
    public final void onAdBidWin() {
        super.onAdBidWin();
        k.t0 t0Var = this.f71847c;
        if (t0Var != null) {
            t0Var.u();
        }
    }
}
