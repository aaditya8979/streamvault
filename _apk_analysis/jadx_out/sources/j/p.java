package j;

import com.ironsource.Mf;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements MainInterstitialAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh.i0 f71986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainInterstitialAdCallBack f71987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f71988c;

    public p(a0 a0Var, jh.i0 i0Var, MainInterstitialAdCallBack mainInterstitialAdCallBack) {
        this.f71988c = a0Var;
        this.f71986a = i0Var;
        this.f71987b = mainInterstitialAdCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        a0 a0Var = this.f71988c;
        if (a0Var.ILL) {
            return;
        }
        a0Var.ILL = true;
        this.f71986a.s("onAdClick");
        this.f71986a.i(2, null);
        this.f71988c.IL1Iii.runOnUiThread(new o2(this));
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdClose() {
        a0 a0Var = this.f71988c;
        if (a0Var.f3400Ll1) {
            return;
        }
        a0Var.f3400Ll1 = true;
        this.f71986a.s("onAdClose");
        this.f71986a.i(5, null);
        this.f71988c.IL1Iii.runOnUiThread(new u1(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f71986a.y();
        this.f71986a.s("onAdFail = " + str);
        this.f71986a.k(4, this.f71988c.LL1IL);
        this.f71986a.g(0);
        this.f71988c.IL1Iii.runOnUiThread(new i2(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdLoaded() {
        this.f71986a.y();
        a0 a0Var = this.f71988c;
        if (a0Var.f3407llL1ii) {
            return;
        }
        a0Var.f3407llL1ii = true;
        this.f71986a.s(Mf.f29856j);
        this.f71986a.k(8, this.f71988c.LL1IL);
        this.f71986a.g(1);
        this.f71988c.setRevenue(this.f71986a.f71976y);
        a0 a0Var2 = this.f71988c;
        a0Var2.iIlLiL = false;
        a0Var2.IL1Iii();
        a0 a0Var3 = this.f71988c;
        a0Var3.f71808b = this.f71986a;
        a0Var3.IL1Iii.runOnUiThread(new t(this));
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        a0 a0Var = this.f71988c;
        if (a0Var.f3409il) {
            return;
        }
        a0Var.f3409il = true;
        this.f71986a.s("onAdShow");
        this.f71986a.h(0, adInfo, this.f71988c.LL1IL, 0L, 0L, null);
        this.f71988c.IL1Iii.runOnUiThread(new p2(this, adInfo));
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoComplete() {
        a0 a0Var = this.f71988c;
        if (a0Var.f72043Lil) {
            return;
        }
        a0Var.f72043Lil = true;
        this.f71986a.s("onAdVideoComplete");
        this.f71986a.i(1, null);
        this.f71988c.IL1Iii.runOnUiThread(new m0(this));
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoStart() {
        a0 a0Var = this.f71988c;
        if (a0Var.f3406lIlii) {
            return;
        }
        a0Var.f3406lIlii = true;
        this.f71986a.s("onAdVideoStart");
        this.f71988c.IL1Iii.runOnUiThread(new k1(this));
    }
}
