package c;

import android.app.Activity;
import bp.v0;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import j.b2;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f6490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainRewardVideoAdCallBack f6491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f6492c;

    public y(k0 k0Var, Activity activity, b2 b2Var) {
        this.f6492c = k0Var;
        this.f6490a = activity;
        this.f6491b = b2Var;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f6492c.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        MaxAd maxAd;
        k0 k0Var = this.f6492c;
        k0Var.C = MaxRewardedAd.getInstance(k0Var.F, this.f6490a);
        k0 k0Var2 = this.f6492c;
        MaxRewardedAd maxRewardedAd = k0Var2.C;
        if (maxRewardedAd == null) {
            k0Var2.a("rewardedAd is null");
            return;
        }
        maxRewardedAd.setListener(k0Var2.G);
        v0 v0VarA = v0.a();
        String str = this.f6492c.F;
        synchronized (v0VarA) {
            MaxAd maxAd2 = null;
            try {
                maxAd = (MaxAd) v0VarA.f5877a.get(str);
                if (maxAd != null) {
                    try {
                        v0VarA.f5877a.remove(str);
                    } catch (Exception e10) {
                        e = e10;
                        maxAd2 = maxAd;
                        AdLog.e(e.getMessage(), e);
                        maxAd = maxAd2;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (!this.f6492c.C.isReady() || maxAd == null) {
            this.f6492c.C.loadAd();
            return;
        }
        AdLog.i("applovin ad has ready");
        k0 k0Var3 = this.f6492c;
        k0Var3.D = true;
        k0Var3.f(maxAd.getRevenue());
        this.f6492c.f71977z = "applovin_" + maxAd.getNetworkName();
        v0.a().b(this.f6492c.F, maxAd);
        this.f6491b.onAdVideoCache();
    }
}
