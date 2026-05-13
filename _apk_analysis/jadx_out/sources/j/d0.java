package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements MainWdNativeAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.c0 f71842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainWdNativeAdCallback f71843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m2 f71844c;

    public d0(m2 m2Var, e.c0 c0Var, MainWdNativeAdCallback mainWdNativeAdCallback) {
        this.f71844c = m2Var;
        this.f71842a = c0Var;
        this.f71843b = mainWdNativeAdCallback;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        m2 m2Var = this.f71844c;
        if (m2Var.ILL) {
            return;
        }
        m2Var.ILL = true;
        this.f71842a.s("onAdClick");
        this.f71842a.i(2, null);
        this.f71844c.IL1Iii.runOnUiThread(new f(this));
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdClose() {
        m2 m2Var = this.f71844c;
        if (m2Var.f3400Ll1) {
            return;
        }
        m2Var.f3400Ll1 = true;
        this.f71842a.s("onAdClose");
        this.f71842a.i(5, null);
        this.f71844c.IL1Iii.runOnUiThread(new h(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f71842a.y();
        this.f71842a.s("onAdFail = " + str);
        this.f71842a.k(4, this.f71844c.LL1IL);
        this.f71842a.g(0);
        this.f71844c.IL1Iii.runOnUiThread(new h2(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdLoaded(View view) {
        this.f71842a.y();
        this.f71842a.k(8, this.f71844c.LL1IL);
        this.f71842a.g(1);
        m2 m2Var = this.f71844c;
        if (m2Var.f3407llL1ii) {
            return;
        }
        m2Var.f3407llL1ii = true;
        m2Var.iIlLiL = false;
        this.f71842a.s(Mf.f29856j);
        this.f71844c.IL1Iii();
        this.f71844c.setRevenue(this.f71842a.f71976y);
        this.f71844c.IL1Iii.runOnUiThread(new g1(this, view));
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdShow(AdInfo adInfo) {
        m2 m2Var = this.f71844c;
        if (m2Var.f3409il) {
            return;
        }
        m2Var.f3409il = true;
        this.f71842a.s("onAdShow");
        this.f71842a.h(0, adInfo, this.f71844c.LL1IL, 0L, 0L, null);
        this.f71844c.IL1Iii.runOnUiThread(new v(this, adInfo));
    }
}
