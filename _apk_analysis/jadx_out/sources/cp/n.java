package cp;

import android.view.View;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements MainNativeAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f59396a;

    public n(b0 b0Var) {
        this.f59396a = b0Var;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f59396a.q("onAdClick");
        this.f59396a.getClass();
        MainNativeAdCallBack mainNativeAdCallBack = this.f59396a.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdClose() {
        this.f59396a.q("onAdClose");
        this.f59396a.getClass();
        MainNativeAdCallBack mainNativeAdCallBack = this.f59396a.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f59396a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdLoaded(View view) {
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f59396a.q("onAdShow");
        this.f59396a.getClass();
        MainNativeAdCallBack mainNativeAdCallBack = this.f59396a.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdShow(adInfo);
        }
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoComplete() {
        this.f59396a.q("onAdVideoComplete");
        this.f59396a.getClass();
        MainNativeAdCallBack mainNativeAdCallBack = this.f59396a.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdVideoComplete();
        }
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoStart() {
        this.f59396a.q("onAdVideoStart");
        this.f59396a.getClass();
        MainNativeAdCallBack mainNativeAdCallBack = this.f59396a.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdVideoStart();
        }
    }
}
