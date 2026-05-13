package cp;

import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements MainInterstitialAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f59388a;

    public j(q qVar) {
        this.f59388a = qVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f59388a.q("onAdClick");
        this.f59388a.getClass();
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f59388a.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdClose() {
        this.f59388a.q("onAdClose");
        this.f59388a.getClass();
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f59388a.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f59388a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdLoaded() {
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f59388a.q("onAdShow");
        this.f59388a.getClass();
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f59388a.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdShow(adInfo);
        }
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoComplete() {
        this.f59388a.q("onAdVideoComplete");
        this.f59388a.getClass();
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f59388a.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdVideoComplete();
        }
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoStart() {
        this.f59388a.q("onAdVideoStart");
        this.f59388a.getClass();
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f59388a.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdVideoStart();
        }
    }
}
