package c;

import android.app.Activity;
import com.vungle.ads.RewardedAd;
import com.yk.e.AbstractC4634il;
import com.yk.e.util.AdLog;
import j.b2;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends f {
    public Activity C;
    public RewardedAd G;
    public boolean B = false;
    public boolean D = false;
    public String E = "";
    public String F = "";

    @Override // c.f
    public final void B(Activity activity, int i10, b2 b2Var) {
        this.C = activity;
        i.e eVar = this.f71962k;
        this.E = eVar.f63659a;
        this.F = eVar.f63661c;
        AdLog.d("appID " + this.E + ", posID " + this.F);
        AbstractC4634il.IL1Iii(activity.getApplicationContext(), this.E, new q(this, activity, b2Var));
    }

    @Override // c.f
    public final void C() {
        try {
            RewardedAd rewardedAd = this.G;
            if (rewardedAd != null && rewardedAd.canPlayAd().booleanValue()) {
                this.G.play(this.C);
            } else if (!this.D) {
                super.v("rewardedAd cannot play!");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // j.n0
    public final void v(String str) {
        if (this.D) {
            return;
        }
        super.v(str);
    }
}
