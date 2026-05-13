package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3363di extends AbstractC3897z2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3589mi f27042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sn.l f27043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f27045i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3363di(C3589mi c3589mi, InterfaceC3580m9 interfaceC3580m9, sn.l lVar) {
        super(interfaceC3580m9);
        tn.p.k(lVar, "onRenderViewProcessGone");
        this.f27042f = c3589mi;
        this.f27043g = lVar;
        this.f27045i = RedirectEvent.f52809b;
    }

    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        if (this.f27044h || gestureDetectorOnGestureListenerC3337ci.f26950e) {
            return;
        }
        this.f27044h = true;
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        gestureDetectorOnGestureListenerC3337ci.g(gestureDetectorOnGestureListenerC3337ci.getMraidJsString());
    }

    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("RenderViewClient", "Override URL loading :" + str);
        }
        gestureDetectorOnGestureListenerC3337ci.s();
        Ta taA = Ua.a(gestureDetectorOnGestureListenerC3337ci.getLandingPageHandler(), this.f27045i, (String) null, str, (Ya) null, 24);
        InterfaceC3580m9 interfaceC3580m92 = this.f28618a;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a("RenderViewClient", "Current Index :" + gestureDetectorOnGestureListenerC3337ci.copyBackForwardList().getCurrentIndex() + " Original Url :" + gestureDetectorOnGestureListenerC3337ci.getOriginalUrl() + " URL: " + str);
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28618a;
        if (interfaceC3580m93 != null) {
            ((C3605n9) interfaceC3580m93).c("RenderViewClient", "landingPage process result - " + taA.f26350a);
        }
    }

    public final boolean a(WebView webView, String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("RenderViewClient", "onShouldOverrideUrlLoading  - url - " + str);
        }
        boolean z10 = true;
        if (webView instanceof GestureDetectorOnGestureListenerC3337ci) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) webView;
            gestureDetectorOnGestureListenerC3337ci.getClass();
            if (!gestureDetectorOnGestureListenerC3337ci.a()) {
                gestureDetectorOnGestureListenerC3337ci.a(this.f27045i);
                return true;
            }
            InterfaceC3580m9 interfaceC3580m92 = this.f28618a;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("RenderViewClient", "Placement type:  " + ((int) gestureDetectorOnGestureListenerC3337ci.getPlacementType()) + "  url:" + str);
            }
            a(gestureDetectorOnGestureListenerC3337ci, str);
        } else {
            z10 = false;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28618a;
        if (interfaceC3580m93 != null) {
            ((C3605n9) interfaceC3580m93).a("RenderViewClient", "Override URL loading :" + str + " returned " + z10);
        }
        return z10;
    }

    @Override // com.inmobi.media.AbstractC3897z2, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53135i, webView, str);
        safedk_di_onLoadResource_6eb002a202a2385eb37ae127257c5f96(webView, str);
    }

    @Override // com.inmobi.media.AbstractC3897z2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53135i, webView, str);
        safedk_di_onPageFinished_055c058bf5b4e7d5a56f3a3313042702(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Gh gh2;
        C3589mi c3589mi = this.f27042f;
        if (c3589mi != null) {
            Map mapA = c3589mi.a();
            long j10 = c3589mi.f27633c;
            p000do.l0 l0Var = AbstractC3492il.f27361a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3589mi.a("PageStarted");
            Wj wj2 = Wj.f26549a;
            Wj.b(strA, mapA, EnumC3287ak.f26805a);
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("RenderViewClient", "Page load started:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3337ci) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28618a;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("RenderViewClient", "Page load started renderview: " + ((GestureDetectorOnGestureListenerC3337ci) webView).getMarkupType());
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) webView;
            a(gestureDetectorOnGestureListenerC3337ci);
            gestureDetectorOnGestureListenerC3337ci.setAndUpdateViewState("Loading");
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28618a;
        if (interfaceC3580m93 != null) {
            ((C3605n9) interfaceC3580m93).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        InterfaceC3580m9 interfaceC3580m94 = this.f28618a;
        if (interfaceC3580m94 == null || (gh2 = ((C3605n9) interfaceC3580m94).f27675a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        tn.p.k(str2, "failingUrl");
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("RenderViewClient", "OnReceivedError - errorCode - " + i10 + ", description - " + str + ", url - " + str2);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(webResourceError, "error");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C3850x5.f28483a.getClass();
        if (!C3850x5.x()) {
            InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("RenderViewClient", "OnReceivedError ");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28618a;
        if (interfaceC3580m92 != null) {
            int errorCode = webResourceError.getErrorCode();
            CharSequence description = webResourceError.getDescription();
            ((C3605n9) interfaceC3580m92).b("RenderViewClient", "OnReceivedError - errorCode - " + errorCode + ", description - " + ((Object) description) + ", url - " + webResourceRequest.getUrl() + ", method - " + webResourceRequest.getMethod() + ", isMainFrame - " + webResourceRequest.isForMainFrame());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("RenderViewClient", "ReceivedHttpError - error - " + (webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null) + ", statusCode - " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null) + " url - " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " isMainFrame - " + (webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("RenderViewClient", "onReceivedSSLError - error - " + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null) + " - url - " + (sslError != null ? sslError.getUrl() : null));
        }
    }

    @Override // com.inmobi.media.AbstractC3897z2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(renderProcessGoneDetail, "detail");
        if (Build.VERSION.SDK_INT >= 26) {
            InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).c("RenderViewClient", "onRenderProcessGone detail did crash- " + renderProcessGoneDetail.didCrash() + " priority - " + renderProcessGoneDetail.rendererPriorityAtExit());
            }
            this.f27043g.invoke(Boolean.valueOf(renderProcessGoneDetail.didCrash()));
        } else {
            InterfaceC3580m9 interfaceC3580m92 = this.f28618a;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).c("RenderViewClient", "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void safedk_di_onLoadResource_6eb002a202a2385eb37ae127257c5f96(WebView webView, String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("RenderViewClient", "Resource loading:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3337ci) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) webView;
            String url = gestureDetectorOnGestureListenerC3337ci.getUrl();
            if (str == null || url == null || bo.a0.W(url, "file:", false, 2, null)) {
                return;
            }
            a(gestureDetectorOnGestureListenerC3337ci);
        }
    }

    public void safedk_di_onPageFinished_055c058bf5b4e7d5a56f3a3313042702(WebView webView, String str) {
        Gh gh2;
        C3589mi c3589mi = this.f27042f;
        if (c3589mi != null) {
            Map mapA = c3589mi.a();
            long j10 = c3589mi.f27633c;
            p000do.l0 l0Var = AbstractC3492il.f27361a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3589mi.a("WebViewLoadFinished");
            Wj wj2 = Wj.f26549a;
            Wj.b(strA, mapA, EnumC3287ak.f26805a);
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("RenderViewClient", "Page load finished:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3337ci) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) webView;
            a(gestureDetectorOnGestureListenerC3337ci);
            if (tn.p.f("Loading", gestureDetectorOnGestureListenerC3337ci.f26992z)) {
                gestureDetectorOnGestureListenerC3337ci.g("window.imaiview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC3337ci.g("window.mraidview.broadcastEvent('ready');");
                p000do.i.d(A9.f25147c, null, null, new Zh(gestureDetectorOnGestureListenerC3337ci, null), 3, null);
            }
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28618a;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28618a;
        if (interfaceC3580m93 == null || (gh2 = ((C3605n9) interfaceC3580m93).f27675a) == null) {
            return;
        }
        gh2.a();
    }

    public WebResourceResponse safedk_di_shouldInterceptRequest_0387cbdc895e93529137ca9c7eaf963f(WebView webView, String str) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, "url");
        WebResourceResponse webResourceResponseA = AbstractC3394eo.a(str, this.f28618a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(webView, str) : webResourceResponseA;
    }

    public WebResourceResponse safedk_di_shouldInterceptRequest_f3f288ea22ebec6fd3215c44ea448800(WebView webView, WebResourceRequest webResourceRequest) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        WebResourceResponse webResourceResponseA = AbstractC3394eo.a(webResourceRequest, this.f28618a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(webView, webResourceRequest) : webResourceResponseA;
    }

    public boolean safedk_di_shouldOverrideUrlLoading_31568257f88a9cbecd0bdd3c9964e9f9(WebView webView, String str) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, "url");
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("RenderViewClient", "shouldOverrideUrlLoading Called " + str);
        }
        return a(webView, str);
    }

    public boolean safedk_di_shouldOverrideUrlLoading_f653bca25349885d719a0687703e3498(WebView webView, WebResourceRequest webResourceRequest) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        C3850x5.f28483a.getClass();
        if (!C3850x5.v()) {
            return false;
        }
        String string = webResourceRequest.getUrl().toString();
        tn.p.j(string, "toString(...)");
        return a(webView, string);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.inmobi.media.AbstractC3897z2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53135i, webView, webResourceRequest, safedk_di_shouldInterceptRequest_f3f288ea22ebec6fd3215c44ea448800(webView, webResourceRequest));
    }

    @Override // com.inmobi.media.AbstractC3897z2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53135i, webView, str, safedk_di_shouldInterceptRequest_0387cbdc895e93529137ca9c7eaf963f(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_di_shouldOverrideUrlLoading_f653bca25349885d719a0687703e3498 = safedk_di_shouldOverrideUrlLoading_f653bca25349885d719a0687703e3498(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f53135i, webView, webResourceRequest, zSafedk_di_shouldOverrideUrlLoading_f653bca25349885d719a0687703e3498);
        return zSafedk_di_shouldOverrideUrlLoading_f653bca25349885d719a0687703e3498;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_di_shouldOverrideUrlLoading_31568257f88a9cbecd0bdd3c9964e9f9 = safedk_di_shouldOverrideUrlLoading_31568257f88a9cbecd0bdd3c9964e9f9(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53135i, webView, str, zSafedk_di_shouldOverrideUrlLoading_31568257f88a9cbecd0bdd3c9964e9f9);
        return zSafedk_di_shouldOverrideUrlLoading_31568257f88a9cbecd0bdd3c9964e9f9;
    }
}
