package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 implements MainThirdBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap.j f71903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainThirdBannerCallBack f71904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f71905c;

    public k2(e0 e0Var, ap.j jVar, MainThirdBannerCallBack mainThirdBannerCallBack) {
        this.f71905c = e0Var;
        this.f71903a = jVar;
        this.f71904b = mainThirdBannerCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        e0 e0Var = this.f71905c;
        if (e0Var.ILL) {
            return;
        }
        e0Var.ILL = true;
        this.f71903a.s("onAdClick");
        this.f71903a.i(2, null);
        this.f71905c.IL1Iii.runOnUiThread(new d2(this));
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdClose() {
        e0 e0Var = this.f71905c;
        if (e0Var.f3400Ll1) {
            return;
        }
        e0Var.f3400Ll1 = true;
        this.f71903a.s("onAdClose");
        this.f71903a.i(5, null);
        this.f71905c.IL1Iii.runOnUiThread(new b1(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f71903a.y();
        this.f71903a.s("onAdFail = " + str);
        this.f71903a.k(4, this.f71905c.LL1IL);
        this.f71903a.g(0);
        this.f71905c.IL1Iii.runOnUiThread(new s1(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdLoaded(View view) {
        this.f71903a.y();
        this.f71903a.k(8, this.f71905c.LL1IL);
        this.f71903a.g(1);
        e0 e0Var = this.f71905c;
        if (e0Var.f3407llL1ii) {
            return;
        }
        e0Var.f3407llL1ii = true;
        e0Var.iIlLiL = false;
        this.f71903a.s(Mf.f29856j);
        this.f71905c.setRevenue(this.f71903a.f71976y);
        this.f71905c.IL1Iii();
        this.f71905c.IL1Iii.runOnUiThread(new w0(this, view));
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
        e0 e0Var = this.f71905c;
        if (e0Var.f3409il) {
            return;
        }
        e0Var.f3409il = true;
        this.f71903a.s("onAdShow");
        this.f71903a.h(0, adInfo, this.f71905c.LL1IL, 0L, 0L, null);
        this.f71905c.IL1Iii.runOnUiThread(new q0(this, adInfo));
    }
}
