package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements MainBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.x f71990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainBannerCallBack f71991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f71992c;

    public p1(b0 b0Var, f.x xVar, MainBannerCallBack mainBannerCallBack) {
        this.f71992c = b0Var;
        this.f71990a = xVar;
        this.f71991b = mainBannerCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        b0 b0Var = this.f71992c;
        if (b0Var.ILL) {
            return;
        }
        b0Var.ILL = true;
        this.f71990a.s("onAdClick");
        this.f71990a.i(2, null);
        this.f71992c.IL1Iii.runOnUiThread(new v1(this));
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdClose() {
        b0 b0Var = this.f71992c;
        if (b0Var.f3400Ll1) {
            return;
        }
        b0Var.f3400Ll1 = true;
        this.f71990a.s("onAdClose");
        this.f71990a.i(5, null);
        this.f71992c.IL1Iii.runOnUiThread(new o0(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f71990a.y();
        this.f71990a.s("onAdFail = " + str);
        this.f71990a.k(4, this.f71992c.LL1IL);
        this.f71990a.g(0);
        this.f71992c.IL1Iii.runOnUiThread(new n2(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdLoaded(View view) {
        this.f71990a.y();
        this.f71990a.k(8, this.f71992c.LL1IL);
        this.f71990a.g(1);
        b0 b0Var = this.f71992c;
        if (b0Var.f3407llL1ii) {
            return;
        }
        b0Var.f3407llL1ii = true;
        b0Var.iIlLiL = false;
        this.f71990a.s(Mf.f29856j);
        this.f71992c.setRevenue(this.f71990a.f71976y);
        this.f71992c.IL1Iii();
        this.f71992c.IL1Iii.runOnUiThread(new a(this, view));
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
        b0 b0Var = this.f71992c;
        if (b0Var.f3409il) {
            return;
        }
        b0Var.f3409il = true;
        this.f71990a.s("onAdShow");
        this.f71990a.h(0, adInfo, this.f71992c.LL1IL, 0L, 0L, null);
        this.f71992c.IL1Iii.runOnUiThread(new q2(this, adInfo));
    }
}
