package cp;

import android.view.View;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements MainBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f59365a;

    public c(i iVar) {
        this.f59365a = iVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f59365a.q("onAdClick");
        this.f59365a.getClass();
        MainBannerCallBack mainBannerCallBack = this.f59365a.F;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdClose() {
        this.f59365a.q("onAdClose");
        this.f59365a.getClass();
        MainBannerCallBack mainBannerCallBack = this.f59365a.F;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f59365a.u(i10, str);
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdLoaded(View view) {
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f59365a.q("onAdShow");
        this.f59365a.getClass();
        MainBannerCallBack mainBannerCallBack = this.f59365a.F;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdShow(adInfo);
        }
    }
}
