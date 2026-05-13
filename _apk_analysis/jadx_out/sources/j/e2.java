package j;

import com.ironsource.Mf;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class e2 implements MainSplashAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.t0 f71859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainSplashAdCallBack f71860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f71861c;

    public e2(d1 d1Var, k.t0 t0Var, MainSplashAdCallBack mainSplashAdCallBack) {
        this.f71861c = d1Var;
        this.f71859a = t0Var;
        this.f71860b = mainSplashAdCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        d1 d1Var = this.f71861c;
        if (d1Var.ILL) {
            return;
        }
        d1Var.ILL = true;
        this.f71859a.s("onAdClick");
        this.f71859a.i(2, null);
        this.f71861c.IL1Iii.runOnUiThread(new y(this));
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdClose() {
        d1 d1Var = this.f71861c;
        if (d1Var.f3400Ll1) {
            return;
        }
        d1Var.f3400Ll1 = true;
        this.f71859a.s("onAdClose");
        this.f71859a.i(5, null);
        this.f71861c.IL1Iii.runOnUiThread(new m1(this));
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdComplete() {
        d1 d1Var = this.f71861c;
        if (d1Var.f3401L11I) {
            return;
        }
        d1Var.f3401L11I = true;
        this.f71859a.s("onAdComplete");
        this.f71859a.i(1, null);
        this.f71861c.IL1Iii.runOnUiThread(new c2(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f71859a.y();
        this.f71859a.s("onAdFail = " + str);
        this.f71859a.k(4, this.f71861c.LL1IL);
        this.f71859a.g(0);
        this.f71861c.IL1Iii.runOnUiThread(new t1(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdLoaded() {
        this.f71859a.y();
        this.f71859a.k(8, this.f71861c.LL1IL);
        this.f71859a.g(1);
        d1 d1Var = this.f71861c;
        if (d1Var.f3407llL1ii) {
            return;
        }
        d1Var.f3407llL1ii = true;
        d1Var.iIlLiL = false;
        this.f71859a.s(Mf.f29856j);
        this.f71861c.IL1Iii();
        this.f71861c.setRevenue(this.f71859a.f71976y);
        this.f71861c.IL1Iii.runOnUiThread(new j(this));
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        d1 d1Var = this.f71861c;
        if (d1Var.f3409il) {
            return;
        }
        d1Var.f3409il = true;
        this.f71859a.s("onAdShow");
        this.f71859a.h(0, adInfo, this.f71861c.LL1IL, 0L, 0L, null);
        this.f71861c.IL1Iii.runOnUiThread(new x(this, adInfo));
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdSkipped() {
        d1 d1Var = this.f71861c;
        if (d1Var.f3398IiL) {
            return;
        }
        d1Var.f3398IiL = true;
        this.f71859a.s("onAdSkipped");
        this.f71859a.i(3, null);
        this.f71861c.IL1Iii.runOnUiThread(new x1(this));
    }
}
