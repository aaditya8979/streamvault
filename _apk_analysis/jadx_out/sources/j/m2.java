package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.WorldNativeImgParams;
import com.yk.e.object.WorldNativeLyParams;
import com.yk.e.object.WorldNativeTagParams;
import com.yk.e.object.WorldNativeTvParams;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class m2 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainWdNativeAdCallback f71939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e.c0 f71940b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainWdNativeAdCallback f71943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WorldNativeTvParams f71944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WorldNativeTvParams f71945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WorldNativeTvParams f71946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WorldNativeImgParams f71947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WorldNativeLyParams f71948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WorldNativeLyParams f71949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WorldNativeLyParams f71950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WorldNativeTagParams f71951m;

    public m2(Activity activity, String str, cp.p pVar) {
        this.curAdType = "wdNative";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3397IL = 29;
        this.f71939a = pVar;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        String strOptString;
        try {
            String strOptString2 = jSONObject.optString("platform");
            strOptString = jSONObject.optString("offline_adv");
            switch (strOptString2) {
                case "wx":
                    this.f71940b = new e.a();
                    break;
                case "pangle":
                    this.f71940b = new e.h0();
                    break;
                case "vungle":
                    this.f71940b = new e.u();
                    break;
                case "applovin":
                    this.f71940b = new e.p();
                    break;
                case "admob":
                    this.f71940b = new e.b0();
                    break;
                case "mintegral":
                    this.f71940b = new e.q();
                    break;
                case "facebook":
                    this.f71940b = new e.r();
                    break;
                case "bigo":
                    this.f71940b = new e.h();
                    break;
                case "inMobi":
                    this.f71940b = new e.s();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.f71940b = new e.a();
                        break;
                    } else {
                        this.f71940b = null;
                        break;
                    }
                    break;
            }
            e.c0 c0Var = this.f71940b;
            if (c0Var == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f71939a));
                return;
            }
            c0Var.f71969r = this.IL1Iii;
            c0Var.f71970s = this.LL1IL;
            c0Var.p(jSONObject, 29, this.curAdType, this.adPlcID, this.f3403iILLL1);
            e.c0 c0Var2 = this.f71940b;
            c0Var2.B = this.f71941c;
            c0Var2.C = this.f71942d;
            c0Var2.I = this.f71949k;
            c0Var2.K = this.f71951m;
            c0Var2.J = this.f71950l;
            c0Var2.H = this.f71948j;
            c0Var2.F = this.f71946h;
            c0Var2.G = this.f71947i;
            c0Var2.E = this.f71945g;
            c0Var2.D = this.f71944f;
            d0 d0Var = new d0(this, c0Var2, this.f71939a);
            c0Var2.l(getLoadTimeOut());
            e.c0 c0Var3 = this.f71940b;
            c0Var3.f71974w = d0Var;
            c0Var3.B(this.IL1Iii, d0Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f71939a));
        }
    }

    @Override // j.y1
    public final int getApiAdType() {
        return 29;
    }

    @Override // j.y1
    public final String getSubPlatform() {
        e.c0 c0Var = this.f71940b;
        return c0Var != null ? c0Var.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        e.c0 c0Var = this.f71940b;
        if (c0Var != null) {
            return c0Var.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        e.c0 c0Var = this.f71940b;
        if (c0Var != null) {
            return c0Var.b();
        }
        return false;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
    }
}
