package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements MainNativeAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l.r f72044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainNativeAdCallBack f72045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f72046c;

    public z(s0 s0Var, l.r rVar, MainNativeAdCallBack mainNativeAdCallBack) {
        this.f72046c = s0Var;
        this.f72044a = rVar;
        this.f72045b = mainNativeAdCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        s0 s0Var = this.f72046c;
        if (s0Var.ILL) {
            return;
        }
        s0Var.ILL = true;
        this.f72044a.s("onAdClick");
        this.f72044a.i(2, null);
        this.f72046c.IL1Iii.runOnUiThread(new l(this));
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdClose() {
        s0 s0Var = this.f72046c;
        if (s0Var.f3400Ll1) {
            return;
        }
        s0Var.f3400Ll1 = true;
        this.f72044a.s("onAdClose");
        this.f72044a.i(5, null);
        this.f72046c.IL1Iii.runOnUiThread(new u0(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f72044a.y();
        this.f72044a.s("onAdFail = " + str);
        this.f72044a.k(4, this.f72046c.LL1IL);
        this.f72044a.g(0);
        this.f72046c.IL1Iii.runOnUiThread(new a2(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdLoaded(View view) {
        this.f72044a.y();
        this.f72044a.k(8, this.f72046c.LL1IL);
        this.f72044a.g(1);
        this.f72046c.setRevenue(this.f72044a.f71976y);
        this.f72046c.getClass();
        s0 s0Var = this.f72046c;
        if (s0Var.f3407llL1ii) {
            return;
        }
        s0Var.f3407llL1ii = true;
        s0Var.iIlLiL = false;
        this.f72044a.s(Mf.f29856j);
        this.f72046c.IL1Iii();
        this.f72046c.IL1Iii.runOnUiThread(new r0(this, view));
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        s0 s0Var = this.f72046c;
        if (s0Var.f3409il) {
            return;
        }
        s0Var.f3409il = true;
        this.f72044a.s("onAdShow");
        this.f72044a.h(0, adInfo, this.f72046c.LL1IL, 0L, 0L, null);
        this.f72046c.IL1Iii.runOnUiThread(new e(this, adInfo));
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoComplete() {
        s0 s0Var = this.f72046c;
        if (s0Var.f72043Lil) {
            return;
        }
        s0Var.f72043Lil = true;
        this.f72044a.s("onAdVideoComplete");
        this.f72046c.IL1Iii.runOnUiThread(new e1(this));
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoStart() {
        s0 s0Var = this.f72046c;
        if (s0Var.f3406lIlii) {
            return;
        }
        s0Var.f3406lIlii = true;
        this.f72044a.s("onAdVideoStart");
        this.f72046c.IL1Iii.runOnUiThread(new p0(this));
    }
}
