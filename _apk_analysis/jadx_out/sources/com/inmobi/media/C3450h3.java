package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3450h3 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f27271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f27272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3475i3 f27273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S2 f27274d;

    public C3450h3(AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, C3475i3 c3475i3, S2 s22) {
        this.f27271a = atomicBoolean;
        this.f27272b = ref$ObjectRef;
        this.f27273c = c3475i3;
        this.f27274d = s22;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53135i, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/h3;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53135i, webView, str);
        safedk_h3_onPageFinished_d95b7ace30509833f0457edf6a35d1dc(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        tn.p.k(str2, "failingUrl");
        C3475i3.a(this.f27271a, this.f27272b, this.f27273c, this.f27274d, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(webResourceError, "error");
        C3475i3.a(this.f27271a, this.f27272b, this.f27273c, this.f27274d, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(webResourceResponse, "errorResponse");
        C3475i3.a(this.f27271a, this.f27272b, this.f27273c, this.f27274d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(renderProcessGoneDetail, "detail");
        C3475i3.a(this.f27271a, this.f27272b, this.f27273c, this.f27274d, false);
        return oo.a(webView, renderProcessGoneDetail, "click_mgr");
    }

    public void safedk_h3_onPageFinished_d95b7ace30509833f0457edf6a35d1dc(WebView webView, String str) {
        C3475i3.a(this.f27271a, this.f27272b, this.f27273c, this.f27274d, true);
    }

    public boolean safedk_h3_shouldOverrideUrlLoading_98b7c73acc447aaf353a32d7d6b19fcc(WebView webView, String str) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, "url");
        S2 s22 = this.f27274d;
        return (s22.f26277d || tn.p.f(str, s22.f26275b)) ? false : true;
    }

    public boolean safedk_h3_shouldOverrideUrlLoading_ef7b54c034a5482f39626c2abf695b2e(WebView webView, WebResourceRequest webResourceRequest) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        return (this.f27274d.f26277d || tn.p.f(webResourceRequest.getUrl().toString(), this.f27274d.f26275b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53135i, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53135i, webView, str, super.shouldInterceptRequest(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/h3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_h3_shouldOverrideUrlLoading_ef7b54c034a5482f39626c2abf695b2e = safedk_h3_shouldOverrideUrlLoading_ef7b54c034a5482f39626c2abf695b2e(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f53135i, webView, webResourceRequest, zSafedk_h3_shouldOverrideUrlLoading_ef7b54c034a5482f39626c2abf695b2e);
        return zSafedk_h3_shouldOverrideUrlLoading_ef7b54c034a5482f39626c2abf695b2e;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/h3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_h3_shouldOverrideUrlLoading_98b7c73acc447aaf353a32d7d6b19fcc = safedk_h3_shouldOverrideUrlLoading_98b7c73acc447aaf353a32d7d6b19fcc(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53135i, webView, str, zSafedk_h3_shouldOverrideUrlLoading_98b7c73acc447aaf353a32d7d6b19fcc);
        return zSafedk_h3_shouldOverrideUrlLoading_98b7c73acc447aaf353a32d7d6b19fcc;
    }
}
