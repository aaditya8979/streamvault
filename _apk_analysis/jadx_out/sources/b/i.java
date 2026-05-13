package b;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yk.e.activity.BaseVideoActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f5323a;

    public i(BaseVideoActivity baseVideoActivity) {
        this.f5323a = baseVideoActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (!webView.getSettings().getLoadsImagesAutomatically()) {
            webView.getSettings().setLoadsImagesAutomatically(true);
        }
        this.f5323a.f3298l1IIi1.setVisibility(8);
        this.f5323a.f3294L1l.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f5323a.f3298l1IIi1.setVisibility(0);
        this.f5323a.f3294L1l.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f5323a.f3288IIi = true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f5323a.f3298l1IIi1.setVisibility(0);
        this.f5323a.f3294L1l.setVisibility(8);
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
