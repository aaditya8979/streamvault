package bp;

import android.webkit.JavascriptInterface;
import com.yk.e.util.AdLog;
import com.yk.e.util.OktWebView;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OktWebView f5854a;

    public p1(OktWebView oktWebView) {
        this.f5854a = oktWebView;
    }

    @JavascriptInterface
    public void adClick(String str) {
        try {
            OktWebView oktWebView = this.f5854a;
            int i10 = OktWebView.IL1Iii;
            oktWebView.getClass();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @JavascriptInterface
    public void extendMethod(String str) {
        AdLog.d("extendMethod, jsonStr = " + str);
        OktWebView oktWebView = this.f5854a;
        int i10 = OktWebView.IL1Iii;
        oktWebView.getClass();
    }

    @JavascriptInterface
    public void finish(String str) {
        try {
            OktWebView oktWebView = this.f5854a;
            int i10 = OktWebView.IL1Iii;
            oktWebView.getClass();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
