package f;

import android.view.View;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 implements bp.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f61378a;

    public h0(o oVar) {
        this.f61378a = oVar;
    }

    @Override // bp.u
    public final void onAdClick() {
        MainBannerCallBack mainBannerCallBack = this.f61378a.E;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClick();
        }
    }

    @Override // bp.u
    public final void onAdLoaded(View view) {
        MainBannerCallBack mainBannerCallBack = this.f61378a.E;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdLoaded(view);
        }
    }

    @Override // bp.u
    public final void onAdShow(AdInfo adInfo) {
        MainBannerCallBack mainBannerCallBack = this.f61378a.E;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdShow(adInfo);
        }
    }
}
