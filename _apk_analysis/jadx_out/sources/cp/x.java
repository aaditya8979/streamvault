package cp;

import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements MainSplashAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f59418a;

    public x(l lVar) {
        this.f59418a = lVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f59418a.q("onAdClick");
        this.f59418a.getClass();
        MainSplashAdCallBack mainSplashAdCallBack = this.f59418a.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdClose() {
        this.f59418a.q("onAdClose");
        this.f59418a.getClass();
        MainSplashAdCallBack mainSplashAdCallBack = this.f59418a.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdComplete() {
        this.f59418a.q("onAdVideoComplete");
        this.f59418a.getClass();
        MainSplashAdCallBack mainSplashAdCallBack = this.f59418a.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdComplete();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f59418a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdLoaded() {
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f59418a.q("onAdShow");
        this.f59418a.getClass();
        MainSplashAdCallBack mainSplashAdCallBack = this.f59418a.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdShow(adInfo);
        }
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdSkipped() {
        this.f59418a.q("onAdSkipped");
        this.f59418a.getClass();
        MainSplashAdCallBack mainSplashAdCallBack = this.f59418a.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdSkipped();
        }
    }
}
