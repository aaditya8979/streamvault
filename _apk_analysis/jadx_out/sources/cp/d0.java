package cp;

import android.view.View;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 implements MainWdNativeAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f59368a;

    public d0(h hVar) {
        this.f59368a = hVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f59368a.q("onAdClick");
        this.f59368a.getClass();
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f59368a.F;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdClose() {
        this.f59368a.q("onAdClose");
        this.f59368a.getClass();
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f59368a.F;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f59368a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdLoaded(View view) {
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdShow(AdInfo adInfo) {
        this.f59368a.q("onAdShow");
        this.f59368a.getClass();
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f59368a.F;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdShow(adInfo);
        }
    }
}
