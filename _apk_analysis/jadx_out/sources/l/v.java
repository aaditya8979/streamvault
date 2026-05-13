package l;

import android.view.View;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements bp.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f73618a;

    public v(l lVar) {
        this.f73618a = lVar;
    }

    @Override // bp.u
    public final void onAdClick() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f73618a.B;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClick();
        }
    }

    @Override // bp.u
    public final void onAdLoaded(View view) {
        MainNativeAdCallBack mainNativeAdCallBack = this.f73618a.B;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdLoaded(view);
        }
    }

    @Override // bp.u
    public final void onAdShow(AdInfo adInfo) {
        MainNativeAdCallBack mainNativeAdCallBack = this.f73618a.B;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdShow(adInfo);
        }
    }
}
