package yads;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xt3 implements RewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr2 f96870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xp3 f96871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lk f96872c;

    public xt3(dr2 dr2Var, xp3 xp3Var, lk lkVar) {
        this.f96870a = dr2Var;
        this.f96871b = xp3Var;
        this.f96872c = lkVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xt3) && tn.p.f(((xt3) obj).f96870a, this.f96870a);
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final List getAdAttributes() {
        List<gc> list = this.f96870a.f88969g;
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        for (gc gcVar : list) {
            this.f96872c.getClass();
            arrayList.add(new kk(gcVar));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final AdInfo getInfo() {
        xp3 xp3Var = this.f96871b;
        c00 c00Var = this.f96870a.f88968f;
        xp3Var.getClass();
        return xp3.a(c00Var);
    }

    public final int hashCode() {
        return this.f96870a.hashCode();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void setAdEventListener(RewardedAdEventListener rewardedAdEventListener) {
        eu3 eu3Var = new eu3(rewardedAdEventListener);
        dr2 dr2Var = this.f96870a;
        dr2Var.f88965c.a();
        dr2Var.f88964b.f96124c = eu3Var;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void show(Activity activity) {
        this.f96870a.a(activity);
    }
}
