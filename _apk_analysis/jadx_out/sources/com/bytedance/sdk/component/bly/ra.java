package com.bytedance.sdk.component.bly;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.bly.ouw;
import com.bytedance.sdk.component.utils.ko;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class ra extends WebViewClient {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final List<String> f12517lh;
    private final WebViewClient ouw;
    private final ouw.InterfaceC0195ouw vt;

    public ra(ouw.InterfaceC0195ouw interfaceC0195ouw, WebViewClient webViewClient, List<String> list) {
        this.vt = interfaceC0195ouw;
        this.ouw = webViewClient;
        this.f12517lh = list;
    }

    private static int ouw(WebView webView) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                return webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(g.f53147u, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bly/ra;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f53147u, webView, str);
        safedk_ra_onPageFinished_2eebabc06c6ca6f0d40921d8b4f22cb7(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ouw.InterfaceC0195ouw interfaceC0195ouw = this.vt;
        if (interfaceC0195ouw != null) {
            interfaceC0195ouw.ouw(ouw(webView));
        }
        this.ouw.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.ouw.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.ouw.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.ouw.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.ouw.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return Build.VERSION.SDK_INT >= 26 ? this.ouw.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void safedk_ra_onPageFinished_2eebabc06c6ca6f0d40921d8b4f22cb7(WebView webView, String str) {
        ouw.InterfaceC0195ouw interfaceC0195ouw = this.vt;
        if (interfaceC0195ouw != null) {
            interfaceC0195ouw.vt();
        }
        this.ouw.onPageFinished(webView, str);
    }

    public WebResourceResponse safedk_ra_shouldInterceptRequest_17ba5e890378a6188b3368061b734291(WebView webView, String str) {
        return this.ouw.shouldInterceptRequest(webView, str);
    }

    public WebResourceResponse safedk_ra_shouldInterceptRequest_fd9089e25a5f28a8432dd564aef9fe53(WebView webView, WebResourceRequest webResourceRequest) {
        if (vt.ouw(this.f12517lh, webResourceRequest.getUrl().toString())) {
            ko.vt("arbitrage_intercept", "trigger shouldInterceptRequest()");
            ouw.InterfaceC0195ouw interfaceC0195ouw = this.vt;
            if (interfaceC0195ouw != null) {
                interfaceC0195ouw.ouw();
            }
        }
        return this.ouw.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean safedk_ra_shouldOverrideUrlLoading_9b74c08f2ed0608396dbe78d5fcd6e22(WebView webView, String str) {
        ko.vt("arbitrage_click", "trigger shouldOverrideUrlLoading()");
        ouw.InterfaceC0195ouw interfaceC0195ouw = this.vt;
        if (interfaceC0195ouw != null) {
            interfaceC0195ouw.ouw();
        }
        return this.ouw.shouldOverrideUrlLoading(webView, str);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bly/ra;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53147u, webView, webResourceRequest, safedk_ra_shouldInterceptRequest_fd9089e25a5f28a8432dd564aef9fe53(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bly/ra;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(g.f53147u, webView, str, safedk_ra_shouldInterceptRequest_17ba5e890378a6188b3368061b734291(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bly/ra;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_ra_shouldOverrideUrlLoading_9b74c08f2ed0608396dbe78d5fcd6e22 = safedk_ra_shouldOverrideUrlLoading_9b74c08f2ed0608396dbe78d5fcd6e22(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f53147u, webView, str, zSafedk_ra_shouldOverrideUrlLoading_9b74c08f2ed0608396dbe78d5fcd6e22);
        return zSafedk_ra_shouldOverrideUrlLoading_9b74c08f2ed0608396dbe78d5fcd6e22;
    }
}
