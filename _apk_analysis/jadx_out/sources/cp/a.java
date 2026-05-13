package cp;

import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements MainRewardVideoAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f59359a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f59360b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59361c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f59362d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f59363e;

    public a(g0 g0Var) {
        this.f59363e = g0Var;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f59362d;
        aVar.f63634e = i10;
        aVar.f63635f = str;
        if (this.f59361c) {
            this.f59363e.v(aVar);
        } else {
            this.f59363e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdShow(AdInfo adInfo) {
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdVideoCache() {
        double revenue = this.f59359a.getRevenue();
        i.a aVar = this.f59362d;
        aVar.f63630a = revenue;
        aVar.f63631b = this.f59359a;
        aVar.f63632c = this.f59360b;
        if (this.f59361c) {
            this.f59363e.c(aVar);
        } else {
            this.f59363e.z(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdVideoComplete() {
    }

    @Override // com.yk.e.callBack.MainRewardVideoAdCallBack
    public final void onReward(String str) {
    }
}
