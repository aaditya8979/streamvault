package com.applovin.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class m8 extends t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f8786b;

    public interface a {
        void a(Uri uri, com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar);

        void b(Uri uri, com.applovin.impl.adview.l lVar);

        void b(com.applovin.impl.adview.l lVar);

        void c(com.applovin.impl.adview.l lVar);

        void d(com.applovin.impl.adview.l lVar);
    }

    public m8(com.applovin.impl.sdk.k kVar) {
        this.f8785a = kVar.O();
    }

    private void a(WebView webView, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8785a.d("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof com.applovin.impl.adview.l)) {
            return;
        }
        com.applovin.impl.adview.l lVar = (com.applovin.impl.adview.l) webView;
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        a aVar = (a) this.f8786b.get();
        if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.b(lVar);
                return;
            }
            if ("/close_ad".equals(path)) {
                aVar.a(lVar);
                return;
            }
            if ("/skip_ad".equals(path)) {
                aVar.d(lVar);
                return;
            }
            if ("/load_url".equals(path)) {
                aVar.a(uri, lVar);
                return;
            }
            if ("/template_error".equals(path)) {
                aVar.b(uri, lVar);
                return;
            }
            if ("/fully_watched".equals(path)) {
                aVar.c(lVar);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8785a.k("WebViewButtonClient", "Unknown URL: " + str);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8785a.k("WebViewButtonClient", "Path: " + path);
            }
        }
    }

    @Override // com.applovin.impl.t4
    public Map a() {
        return CollectionUtils.hashMap("name", "WebViewButtonClient");
    }

    public void a(WeakReference weakReference) {
        this.f8786b = weakReference;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53127a, webView, str);
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53127a, webView, str);
    }

    public boolean safedk_m8_shouldOverrideUrlLoading_4abe774f188b541636c5c536580c1b92(WebView webView, String str) {
        a(webView, str);
        return true;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53127a, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53127a, webView, str, super.shouldInterceptRequest(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/m8;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_m8_shouldOverrideUrlLoading_4abe774f188b541636c5c536580c1b92 = safedk_m8_shouldOverrideUrlLoading_4abe774f188b541636c5c536580c1b92(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53127a, webView, str, zSafedk_m8_shouldOverrideUrlLoading_4abe774f188b541636c5c536580c1b92);
        return zSafedk_m8_shouldOverrideUrlLoading_4abe774f188b541636c5c536580c1b92;
    }
}
