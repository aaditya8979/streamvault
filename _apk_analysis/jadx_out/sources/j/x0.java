package j;

import com.ironsource.Mf;
import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.object.AdInfo;
import com.yk.e.subad.MainFloatViewLoader;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements MainFloatViewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp.e f72037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainFloatViewCallback f72038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainFloatViewLoader f72039c;

    public x0(MainFloatViewLoader mainFloatViewLoader, dp.e eVar, MainFloatViewCallback mainFloatViewCallback) {
        this.f72039c = mainFloatViewLoader;
        this.f72037a = eVar;
        this.f72038b = mainFloatViewCallback;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        MainFloatViewLoader mainFloatViewLoader = this.f72039c;
        if (mainFloatViewLoader.ILL) {
            return;
        }
        mainFloatViewLoader.ILL = true;
        this.f72037a.s("onAdClick");
        this.f72037a.i(2, null);
        this.f72039c.IL1Iii.runOnUiThread(new h0(this));
    }

    @Override // com.yk.e.callBack.MainFloatViewCallback
    public final void onAdClose() {
        MainFloatViewLoader mainFloatViewLoader = this.f72039c;
        if (mainFloatViewLoader.f3400Ll1) {
            return;
        }
        mainFloatViewLoader.f3400Ll1 = true;
        this.f72037a.s("onAdClose");
        this.f72037a.i(5, null);
        this.f72039c.IL1Iii.runOnUiThread(new t0(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        try {
            dp.e eVar = this.f72037a;
            if (eVar != null) {
                eVar.y();
                this.f72037a.s("onAdFail = " + str);
                this.f72037a.k(4, this.f72039c.LL1IL);
                this.f72037a.g(0);
            }
            this.f72039c.IL1Iii.runOnUiThread(new j0(this, i10, str));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // com.yk.e.callBack.MainFloatViewCallback
    public final void onAdHide() {
        this.f72037a.s("onAdHide");
        this.f72039c.IL1Iii.runOnUiThread(new q1(this));
    }

    @Override // com.yk.e.callBack.MainFloatViewCallback
    public final void onAdLoaded() {
        this.f72037a.y();
        this.f72037a.k(8, this.f72039c.LL1IL);
        this.f72037a.g(1);
        MainFloatViewLoader mainFloatViewLoader = this.f72039c;
        if (mainFloatViewLoader.f3407llL1ii) {
            return;
        }
        mainFloatViewLoader.f3407llL1ii = true;
        mainFloatViewLoader.iIlLiL = false;
        this.f72037a.s(Mf.f29856j);
        this.f72039c.IL1Iii();
        this.f72039c.IL1Iii.runOnUiThread(new n(this));
    }

    @Override // com.yk.e.callBack.MainFloatViewCallback
    public final void onAdShow(AdInfo adInfo) {
        MainFloatViewLoader mainFloatViewLoader = this.f72039c;
        if (!mainFloatViewLoader.f3409il) {
            mainFloatViewLoader.f3409il = true;
            this.f72037a.s("onAdShow");
            this.f72037a.h(0, adInfo, this.f72039c.LL1IL, 0L, 0L, null);
        }
        this.f72039c.IL1Iii.runOnUiThread(new w1(this, adInfo));
    }
}
