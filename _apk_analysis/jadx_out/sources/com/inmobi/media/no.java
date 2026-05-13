package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* JADX INFO: loaded from: classes11.dex */
public final class no extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53135i, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53135i, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return oo.a(webView, renderProcessGoneDetail, "safe_web_view");
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53135i, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53135i, webView, str, super.shouldInterceptRequest(webView, str));
    }
}
