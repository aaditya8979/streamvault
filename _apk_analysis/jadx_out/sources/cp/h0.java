package cp;

import android.view.View;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 implements MainThirdBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f59382a;

    public h0(z zVar) {
        this.f59382a = zVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f59382a.q("onAdClick");
        this.f59382a.getClass();
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f59382a.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdClose() {
        this.f59382a.q("onAdClose");
        this.f59382a.getClass();
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f59382a.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f59382a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdLoaded(View view) {
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f59382a.q("onAdShow");
        this.f59382a.getClass();
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f59382a.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdShow(adInfo);
        }
    }
}
