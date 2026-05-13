package b;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yk.e.activity.WebActivity;
import com.yk.e.util.DownloadManager;
import com.yk.e.util.StringUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebActivity f5318a;

    public f0(WebActivity webActivity) {
        this.f5318a = webActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f5318a.I1I.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f5318a.I1I.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.contains(".apk")) {
            if (this.f5318a.f3342IL == null) {
                return true;
            }
            DownloadManager downloadManager = new DownloadManager();
            WebActivity webActivity = this.f5318a;
            downloadManager.get(webActivity, webActivity.f3342IL.getMainParams(), this.f5318a.f3342IL.adPlcID, str);
            return true;
        }
        if (str.contains("tel:")) {
            WebActivity webActivity2 = this.f5318a;
            webActivity2.f3343lLi1LL = str;
            webActivity2.IL1Iii(str);
            return true;
        }
        if (str.startsWith("http") || str.startsWith("https")) {
            this.f5318a.IL1Iii.scrollTo(0, 0);
            return false;
        }
        StringUtil.gotoProtocol(this.f5318a, str);
        return true;
    }
}
