package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 implements MainMRECCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.j f72048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainMRECCallBack f72049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f72050c;

    public z1(c0 c0Var, h.j jVar, MainMRECCallBack mainMRECCallBack) {
        this.f72050c = c0Var;
        this.f72048a = jVar;
        this.f72049b = mainMRECCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        c0 c0Var = this.f72050c;
        if (c0Var.ILL) {
            return;
        }
        c0Var.ILL = true;
        this.f72048a.s("onAdClick");
        this.f72048a.i(2, null);
        this.f72050c.IL1Iii.runOnUiThread(new r2(this));
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdClose() {
        c0 c0Var = this.f72050c;
        if (c0Var.f3400Ll1) {
            return;
        }
        c0Var.f3400Ll1 = true;
        this.f72048a.s("onAdClose");
        this.f72048a.i(5, null);
        this.f72050c.IL1Iii.runOnUiThread(new g(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f72048a.y();
        this.f72048a.s("onAdFail = " + str);
        this.f72048a.k(4, this.f72050c.LL1IL);
        this.f72048a.g(0);
        this.f72050c.IL1Iii.runOnUiThread(new s(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdLoaded(View view) {
        this.f72048a.y();
        this.f72048a.k(8, this.f72050c.LL1IL);
        this.f72048a.g(1);
        c0 c0Var = this.f72050c;
        if (c0Var.f3407llL1ii) {
            return;
        }
        c0Var.f3407llL1ii = true;
        c0Var.iIlLiL = false;
        this.f72048a.s(Mf.f29856j);
        this.f72050c.setRevenue(this.f72048a.f71976y);
        this.f72050c.IL1Iii();
        this.f72050c.IL1Iii.runOnUiThread(new h1(this, view));
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdShow(AdInfo adInfo) {
        c0 c0Var = this.f72050c;
        if (c0Var.f3409il) {
            return;
        }
        c0Var.f3409il = true;
        this.f72048a.s("onAdShow");
        this.f72048a.h(0, adInfo, this.f72050c.LL1IL, 0L, 0L, null);
        this.f72050c.IL1Iii.runOnUiThread(new i0(this, adInfo));
    }
}
