package b;

import android.graphics.drawable.Drawable;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;
import com.yk.e.util.ImageHandler;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f5330a;

    public l0(MainInterstitialActivity mainInterstitialActivity) {
        this.f5330a = mainInterstitialActivity;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f5330a.f59311Lil;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdFail(AdSdkStateCode.MAIN_RENDER_FAILED, "img is null");
        } else {
            AdLog.e("mainAdCallBack is null, msg = img is null");
        }
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
    }
}
