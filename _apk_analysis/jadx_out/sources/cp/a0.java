package cp;

import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements MainRewardVideoAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f59364a;

    public a0(g0 g0Var) {
        this.f59364a = g0Var;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f59364a.q("onAdClick");
        this.f59364a.getClass();
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f59364a.E;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdClose() {
        this.f59364a.q("onAdClose");
        this.f59364a.getClass();
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f59364a.E;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f59364a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f59364a.q("onAdShow");
        this.f59364a.getClass();
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f59364a.E;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdShow(adInfo);
        }
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdVideoCache() {
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdVideoComplete() {
        this.f59364a.q("onAdVideoComplete");
        this.f59364a.getClass();
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f59364a.E;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdVideoComplete();
        }
    }

    @Override // com.yk.e.callBack.MainRewardVideoAdCallBack
    public final void onReward(String str) {
        this.f59364a.q("onReward");
        this.f59364a.getClass();
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f59364a.E;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onReward(str);
        }
    }
}
