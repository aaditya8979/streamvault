package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.media.AbstractC3897z2;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3897z2 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3580m9 f28618a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28621d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28619b = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f28622e = new AtomicBoolean(false);

    public AbstractC3897z2(InterfaceC3580m9 interfaceC3580m9) {
        this.f28618a = interfaceC3580m9;
    }

    public static final void a(AbstractC3897z2 abstractC3897z2) {
        abstractC3897z2.f28622e.set(false);
    }

    public final void a(WebView webView) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f28622e.set(true);
        webView.postDelayed(new Runnable() { // from class: n9.qc
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3897z2.a(this.f75592b);
            }
        }, 1000L);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53135i, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/z2;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53135i, webView, str);
        safedk_z2_onPageFinished_b80083544f4e6f4c73a5d5ac39866754(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(renderProcessGoneDetail, "detail");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Kb.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("BaseWebViewClient", "onRenderProcessGone - WebView crash detected, destroying ad ");
        }
        webView.destroy();
        return true;
    }

    public void safedk_z2_onPageFinished_b80083544f4e6f4c73a5d5ac39866754(WebView webView, String str) {
        if (this.f28621d) {
            this.f28621d = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    public WebResourceResponse safedk_z2_shouldInterceptRequest_7b59d05f2b719a6fa627186c89be0e2b(WebView webView, String str) {
        int i10;
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, "url");
        C3850x5.f28483a.getClass();
        if (!C3850x5.v() && -1 != (i10 = this.f28619b)) {
            if (i10 > 0) {
                this.f28619b = i10 - 1;
            } else if (!this.f28620c) {
                new Handler(Looper.getMainLooper()).post(new Ge(webView));
                this.f28620c = true;
                if (webView instanceof GestureDetectorOnGestureListenerC3337ci) {
                    ((GestureDetectorOnGestureListenerC3337ci) webView).G();
                }
            }
        }
        WebResourceResponse webResourceResponseA = AbstractC3394eo.a(str, this.f28618a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(webView, str) : webResourceResponseA;
    }

    public WebResourceResponse safedk_z2_shouldInterceptRequest_a6d334ec7ca7b668b092e0d258a7d5b3(WebView webView, WebResourceRequest webResourceRequest) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        InterfaceC3580m9 interfaceC3580m9 = this.f28618a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("BaseWebViewClient", "shouldInterceptRequest - url - " + webResourceRequest.getUrl() + ", method - " + webResourceRequest.getMethod() + ", isMainFrame - " + webResourceRequest.isForMainFrame());
        }
        int i10 = this.f28619b;
        if (-1 != i10) {
            if (i10 > 0) {
                this.f28619b = i10 - 1;
            } else if (!this.f28620c) {
                new Handler(Looper.getMainLooper()).post(new Ge(webView));
                this.f28620c = true;
                if (webView instanceof GestureDetectorOnGestureListenerC3337ci) {
                    ((GestureDetectorOnGestureListenerC3337ci) webView).G();
                }
            }
        }
        WebResourceResponse webResourceResponseA = AbstractC3394eo.a(webResourceRequest, this.f28618a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(webView, webResourceRequest) : webResourceResponseA;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/z2;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53135i, webView, webResourceRequest, safedk_z2_shouldInterceptRequest_a6d334ec7ca7b668b092e0d258a7d5b3(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/z2;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53135i, webView, str, safedk_z2_shouldInterceptRequest_7b59d05f2b719a6fa627186c89be0e2b(webView, str));
    }
}
