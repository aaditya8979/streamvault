package com.mbridge.msdk.splash.view;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: compiled from: SplashWebViewClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f40105c = "SplashWebViewClient";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.splash.middle.a f40106d;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SplashWebViewClient.java */
    public class C0503a implements ValueCallback<String> {
        public C0503a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public void a(com.mbridge.msdk.splash.middle.a aVar) {
        if (aVar != null) {
            this.f40106d = aVar;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(g.f53141o, webView, str);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        CreativeInfoManager.onWebViewPageFinished(g.f53141o, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript(SafeDKWebAppInterface.f52902f + com.mbridge.msdk.setting.util.a.a().b(), new C0503a());
        } catch (Throwable th2) {
            q0.b("SplashWebViewClient", "onPageStarted", th2);
        }
    }

    public boolean safedk_a_shouldOverrideUrlLoading_d7eb555bdc38e0c7ffd57fad76da232b(WebView webView, String str) {
        try {
            WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
            if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f35744d && com.mbridge.msdk.click.utils.a.a(((com.mbridge.msdk.splash.signal.b) windVaneWebView.getObject()).b().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f35742b)) {
                return false;
            }
            com.mbridge.msdk.splash.middle.a aVar = this.f40106d;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable th2) {
            q0.b("SplashWebViewClient", "shouldOverrideUrlLoading", th2);
            return false;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53141o, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(g.f53141o, webView, str, super.shouldInterceptRequest(webView, str));
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/splash/view/a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_a_shouldOverrideUrlLoading_d7eb555bdc38e0c7ffd57fad76da232b = safedk_a_shouldOverrideUrlLoading_d7eb555bdc38e0c7ffd57fad76da232b(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f53141o, webView, str, zSafedk_a_shouldOverrideUrlLoading_d7eb555bdc38e0c7ffd57fad76da232b);
        return zSafedk_a_shouldOverrideUrlLoading_d7eb555bdc38e0c7ffd57fad76da232b;
    }
}
