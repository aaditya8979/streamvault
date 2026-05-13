package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements MainMaterialCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ct.u f71933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainMaterialCallback f71934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f71935c;

    public l1(d dVar, ct.u uVar, MainMaterialCallback mainMaterialCallback) {
        this.f71935c = dVar;
        this.f71933a = uVar;
        this.f71934b = mainMaterialCallback;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        d dVar = this.f71935c;
        if (dVar.ILL) {
            return;
        }
        dVar.ILL = true;
        this.f71933a.s("onAdClick");
        this.f71933a.i(2, null);
        this.f71935c.IL1Iii.runOnUiThread(new o(this));
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdClose() {
        d dVar = this.f71935c;
        if (dVar.f3400Ll1) {
            return;
        }
        dVar.f3400Ll1 = true;
        this.f71933a.s("onAdClose");
        this.f71933a.i(5, null);
        this.f71935c.IL1Iii.runOnUiThread(new f2(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f71933a.y();
        this.f71933a.s("onAdFail = " + str);
        this.f71933a.k(4, this.f71935c.LL1IL);
        this.f71933a.g(0);
        this.f71935c.IL1Iii.runOnUiThread(new c1(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdLoaded(View view) {
        this.f71933a.y();
        this.f71933a.k(8, this.f71935c.LL1IL);
        this.f71933a.g(1);
        this.f71935c.setRevenue(this.f71933a.f71976y);
        d dVar = this.f71935c;
        if (dVar.f3407llL1ii) {
            return;
        }
        dVar.f3407llL1ii = true;
        dVar.iIlLiL = false;
        this.f71933a.s(Mf.f29856j);
        this.f71935c.IL1Iii();
        this.f71935c.IL1Iii.runOnUiThread(new k0(this, view));
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdShow(AdInfo adInfo) {
        d dVar = this.f71935c;
        if (dVar.f3409il) {
            return;
        }
        dVar.f3409il = true;
        this.f71933a.s("onAdShow");
        this.f71933a.h(0, adInfo, this.f71935c.LL1IL, 0L, 0L, null);
        this.f71935c.IL1Iii.runOnUiThread(new a1(this, adInfo));
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoComplete() {
        d dVar = this.f71935c;
        if (dVar.f72043Lil) {
            return;
        }
        dVar.f72043Lil = true;
        this.f71933a.s("onAdVideoComplete");
        this.f71933a.i(1, null);
        this.f71935c.IL1Iii.runOnUiThread(new r1(this));
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoStart() {
        d dVar = this.f71935c;
        if (dVar.f3406lIlii) {
            return;
        }
        dVar.f3406lIlii = true;
        this.f71933a.s("onAdVideoStart");
        this.f71935c.IL1Iii.runOnUiThread(new u(this));
    }
}
