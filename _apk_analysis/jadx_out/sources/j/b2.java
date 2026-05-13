package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class b2 implements MainRewardVideoAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f f71822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainRewardVideoAdCallBack f71823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f71824c;

    public b2(j1 j1Var, c.f fVar, MainRewardVideoAdCallBack mainRewardVideoAdCallBack) {
        this.f71824c = j1Var;
        this.f71822a = fVar;
        this.f71823b = mainRewardVideoAdCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        j1 j1Var = this.f71824c;
        if (j1Var.ILL) {
            return;
        }
        j1Var.ILL = true;
        this.f71822a.s("onAdClick");
        this.f71822a.i(2, null);
        this.f71824c.IL1Iii.runOnUiThread(new v0(this));
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdClose() {
        j1 j1Var = this.f71824c;
        if (j1Var.f3400Ll1) {
            return;
        }
        j1Var.f3400Ll1 = true;
        this.f71822a.s("onAdClose");
        this.f71822a.i(5, null);
        this.f71824c.IL1Iii.runOnUiThread(new w(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f71822a.y();
        this.f71822a.s("onAdFail = " + str);
        this.f71822a.k(4, this.f71824c.LL1IL);
        this.f71822a.g(0);
        this.f71824c.IL1Iii.runOnUiThread(new f0(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        j1 j1Var = this.f71824c;
        if (j1Var.f3409il) {
            return;
        }
        j1Var.f3409il = true;
        this.f71822a.s("onAdShow");
        this.f71822a.h(0, adInfo, this.f71824c.LL1IL, 0L, 0L, null);
        this.f71824c.IL1Iii.runOnUiThread(new g2(this, adInfo));
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdVideoCache() {
        this.f71822a.y();
        j1 j1Var = this.f71824c;
        if (j1Var.f3396ILl) {
            return;
        }
        j1Var.f3396ILl = true;
        this.f71822a.s("onAdVideoCache");
        this.f71822a.k(8, this.f71824c.LL1IL);
        this.f71822a.g(1);
        this.f71824c.setRevenue(this.f71822a.f71976y);
        j1 j1Var2 = this.f71824c;
        j1Var2.iIlLiL = false;
        j1Var2.f71893b = this.f71822a;
        j1Var2.IL1Iii();
        this.f71824c.IL1Iii.runOnUiThread(new f1(this));
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdVideoComplete() {
        j1 j1Var = this.f71824c;
        if (j1Var.f72043Lil) {
            return;
        }
        j1Var.f72043Lil = true;
        this.f71822a.s("onAdVideoComplete");
        this.f71822a.i(1, null);
        this.f71824c.IL1Iii.runOnUiThread(new n1(this));
    }

    @Override // com.yk.e.callBack.MainRewardVideoAdCallBack
    public final void onReward(String str) {
        j1 j1Var = this.f71824c;
        if (j1Var.LlLI1) {
            return;
        }
        j1Var.LlLI1 = true;
        this.f71822a.s("onReward");
        this.f71822a.i(10, new y0(this));
    }
}
