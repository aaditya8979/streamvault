package c;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import j.b2;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends f {
    public Activity B;
    public MainRewardVideoAdCallBack C;
    public PAGRewardedAd D;
    public String E = "";
    public String F = "";
    public final n0 G = new n0(this);
    public final e0 H = new e0(this);

    @Override // c.f
    public final void B(Activity activity, int i10, b2 b2Var) {
        this.B = activity;
        this.C = b2Var;
        i.e eVar = this.f71962k;
        this.E = eVar.f63659a;
        this.F = eVar.f63661c;
        AdLog.d("appID " + this.E + ", posID " + this.F);
        AbstractC4634il.IL1Iii(activity.getApplicationContext(), new o0(this), this.E);
    }

    @Override // c.f
    public final void C() {
        try {
            this.B.runOnUiThread(new a0(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            x(e10.getMessage());
        }
    }
}
