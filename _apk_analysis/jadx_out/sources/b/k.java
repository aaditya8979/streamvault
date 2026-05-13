package b;

import android.webkit.JavascriptInterface;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f5327a;

    public k(MainInterstitialActivity mainInterstitialActivity) {
        this.f5327a = mainInterstitialActivity;
    }

    @JavascriptInterface
    public void adClick(String str) {
        try {
            MainInterstitialActivity mainInterstitialActivity = this.f5327a;
            MainInterstitialActivity mainInterstitialActivity2 = mainInterstitialActivity.IL1Iii;
            if (bp.c.f5737b == null) {
                bp.c.f5737b = new bp.c();
            }
            bp.c.f5737b.a(mainInterstitialActivity2, 6, mainInterstitialActivity.ILil, mainInterstitialActivity.f3319ILl.adPlcID, false);
            this.f5327a.f59311Lil.onAdClick();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @JavascriptInterface
    public void extendMethod(String str) {
        AdLog.d("extendMethod, jsonStr = " + str);
    }

    @JavascriptInterface
    public void finish(String str) {
        try {
            this.f5327a.f59311Lil.onAdClose();
            MainInterstitialActivity mainInterstitialActivity = this.f5327a;
            mainInterstitialActivity.IL1Iii(mainInterstitialActivity.IL1Iii);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
