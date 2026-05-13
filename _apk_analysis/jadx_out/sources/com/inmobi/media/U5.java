package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class U5 extends AbstractC3897z2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f26411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sn.a f26412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sn.l f26413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sn.p f26414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ya f26415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Wa f26416k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(String str, sn.a aVar, sn.l lVar, sn.p pVar, InterfaceC3580m9 interfaceC3580m9) {
        super(interfaceC3580m9);
        tn.p.k(str, "api");
        tn.p.k(aVar, "onUserLandingCompleted");
        tn.p.k(lVar, "onLpLifecycleEvent");
        tn.p.k(pVar, "fireLandingPageTracker");
        this.f26411f = str;
        this.f26412g = aVar;
        this.f26413h = lVar;
        this.f26414i = pVar;
    }

    public static void a(U5 u52, int i10, boolean z10, String str, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        Wa wa2 = u52.f26416k;
        if (wa2 != null) {
            wa2.a(i10, z10, str, null);
        }
    }

    public final boolean a(WebView webView, String str) {
        Integer num;
        int i10;
        T5 t52;
        InterfaceC3288al userLeftApplicationListener;
        if (this.f28622e.get()) {
            return true;
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("EmbeddedBrowserViewClient", "onShouldOverrideUrlLoading: " + str);
        }
        if (webView instanceof AbstractC3872y2) {
            Ta taA = Ua.a(((AbstractC3872y2) webView).getLandingPageHandler(), this.f26411f, (String) null, str, this.f26415j, 16);
            num = taA.f26351b;
            i10 = taA.f26350a;
        } else {
            num = null;
            i10 = 0;
        }
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                return false;
            }
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 10);
            Wa wa2 = this.f26416k;
            if (wa2 != null) {
                wa2.a(3, false, str, numValueOf);
            }
            return true;
        }
        boolean z10 = webView instanceof V5;
        if (z10) {
            ViewParent parent = ((V5) webView).getParent();
            if ((parent instanceof Q5) && (userLeftApplicationListener = ((Q5) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        sn.l lVar = this.f26413h;
        Mh mh2 = GestureDetectorOnGestureListenerC3337ci.f26935e1;
        String str2 = this.f26411f;
        mh2.getClass();
        lVar.invoke(Mh.a(str2, "onNavigatingAway"));
        a(webView);
        tn.p.k(str, "url");
        Uri uri = Uri.parse(str);
        tn.p.j(uri, "Uri.parse(this)");
        if (!AbstractC3848x3.a(uri) || tn.p.f("play.google.com", uri.getHost()) || tn.p.f("market.android.com", uri.getHost()) || tn.p.f("market", uri.getScheme())) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (z10) {
                ViewParent parent2 = ((V5) webView).getParent();
                if ((parent2 instanceof Q5) && (t52 = ((Q5) parent2).f26166d) != null) {
                    M8.a(((L8) t52).f25860a);
                }
            }
        }
        a(this, 2, false, str, 8);
        return true;
    }

    @Override // com.inmobi.media.AbstractC3897z2, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53135i, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("EmbeddedBrowserViewClient", "onPageCommitVisible: " + str);
        }
        a(this, 4, true, str, 8);
    }

    @Override // com.inmobi.media.AbstractC3897z2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/U5;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53135i, webView, str);
        safedk_U5_onPageFinished_63244d0aed3d57c9a100e13fbb2f58cf(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("EmbeddedBrowserViewClient", "onPageStarted: " + str);
        }
        sn.l lVar = this.f26413h;
        Mh mh2 = GestureDetectorOnGestureListenerC3337ci.f26935e1;
        String str2 = this.f26411f;
        mh2.getClass();
        lVar.invoke(Mh.a(str2, "onPageStart"));
        a(this, 1, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        tn.p.k(str2, "failingUrl");
        Integer numValueOf = Integer.valueOf(i10);
        Wa wa2 = this.f26416k;
        if (wa2 != null) {
            wa2.a(3, false, str2, numValueOf);
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("EmbeddedBrowserViewClient", "onReceivedError: " + str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(webResourceError, "error");
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("EmbeddedBrowserViewClient", "onReceivedError: " + webResourceRequest.getUrl());
        }
        if (webResourceRequest.isForMainFrame()) {
            Integer numValueOf = Integer.valueOf(webResourceError.getErrorCode());
            String string = webResourceRequest.getUrl().toString();
            Wa wa2 = this.f26416k;
            if (wa2 != null) {
                wa2.a(3, true, string, numValueOf);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3897z2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(renderProcessGoneDetail, "detail");
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (Build.VERSION.SDK_INT >= 26) {
            Wa wa2 = this.f26416k;
            if (wa2 != null) {
                wa2.a(3, true, null, 8007);
            }
            Map mapO = kotlin.collections.a.o(bn.h.a("source", "embedded_browser"), bn.h.a("isCrashed", Boolean.valueOf(renderProcessGoneDetail.didCrash())));
            Wj wj2 = Wj.f26549a;
            Wj.b("WebViewRenderProcessGoneEvent", mapO, EnumC3287ak.f26805a);
        }
        return zOnRenderProcessGone;
    }

    public void safedk_U5_onPageFinished_63244d0aed3d57c9a100e13fbb2f58cf(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("EmbeddedBrowserViewClient", "onPageFinished: " + str);
        }
        a(this, 2, true, str, 8);
    }

    public boolean safedk_U5_shouldOverrideUrlLoading_a2bdbe055f8465838f26cd5ed7a94dbe(WebView webView, WebResourceRequest webResourceRequest) {
        String string;
        Uri url;
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        C3850x5.f28483a.getClass();
        if (!C3850x5.v()) {
            return false;
        }
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            string = "";
        }
        if (webView == null || string.length() <= 0) {
            return false;
        }
        return a(webView, string);
    }

    public boolean safedk_U5_shouldOverrideUrlLoading_ec10909dd8025dc294ba7b7aeb0524cd(WebView webView, String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    @Override // com.inmobi.media.AbstractC3897z2, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53135i, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
    }

    @Override // com.inmobi.media.AbstractC3897z2, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53135i, webView, str, super.shouldInterceptRequest(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/U5;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_U5_shouldOverrideUrlLoading_a2bdbe055f8465838f26cd5ed7a94dbe = safedk_U5_shouldOverrideUrlLoading_a2bdbe055f8465838f26cd5ed7a94dbe(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f53135i, webView, webResourceRequest, zSafedk_U5_shouldOverrideUrlLoading_a2bdbe055f8465838f26cd5ed7a94dbe);
        return zSafedk_U5_shouldOverrideUrlLoading_a2bdbe055f8465838f26cd5ed7a94dbe;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/U5;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_U5_shouldOverrideUrlLoading_ec10909dd8025dc294ba7b7aeb0524cd = safedk_U5_shouldOverrideUrlLoading_ec10909dd8025dc294ba7b7aeb0524cd(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53135i, webView, str, zSafedk_U5_shouldOverrideUrlLoading_ec10909dd8025dc294ba7b7aeb0524cd);
        return zSafedk_U5_shouldOverrideUrlLoading_ec10909dd8025dc294ba7b7aeb0524cd;
    }
}
