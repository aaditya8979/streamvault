package e;

import android.view.View;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements bp.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f60007a;

    public j(p pVar) {
        this.f60007a = pVar;
    }

    @Override // bp.u
    public final void onAdClick() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f60007a.M;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClick();
        }
    }

    @Override // bp.u
    public final void onAdLoaded(View view) {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f60007a.M;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdLoaded(view);
        }
    }

    @Override // bp.u
    public final void onAdShow(AdInfo adInfo) {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f60007a.M;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdShow(adInfo);
        }
    }
}
