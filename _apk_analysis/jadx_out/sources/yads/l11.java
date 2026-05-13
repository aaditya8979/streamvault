package yads;

import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes11.dex */
public class l11 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m11 f91859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final go3 f91860b;

    public /* synthetic */ l11(m11 m11Var) {
        this(m11Var, cs2.b());
    }

    public l11(m11 m11Var, go3 go3Var) {
        this.f91859a = m11Var;
        this.f91860b = go3Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f91859a.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.f91859a.a(i10);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f91859a.a(webResourceError.getErrorCode());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (((io3) this.f91860b).a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        } else {
            this.f91859a.a(-11);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f91859a.a(webView.getContext(), str);
        return true;
    }
}
