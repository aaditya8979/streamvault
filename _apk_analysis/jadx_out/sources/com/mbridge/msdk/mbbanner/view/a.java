package com.mbridge.msdk.mbbanner.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.List;

/* JADX INFO: compiled from: BannerWebViewClient.java */
/* JADX INFO: loaded from: classes12.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38564c = "BannerWebViewClient";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<CampaignEx> f38566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.mbridge.msdk.mbbanner.common.listener.a f38567f;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerWebViewClient.java */
    public class C0463a implements ValueCallback<String> {
        public C0463a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public a(String str, List<CampaignEx> list, com.mbridge.msdk.mbbanner.common.listener.a aVar) {
        this.f38565d = str;
        this.f38566e = list;
        this.f38567f = aVar;
    }

    private void a(WebView webView, String str) {
        webView.evaluateJavascript(str, new C0463a());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, g.f53141o);
        context.startActivity(intent);
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
        CampaignEx campaignEx;
        super.onPageStarted(webView, str, bitmap);
        try {
            a(webView, SafeDKWebAppInterface.f52902f + com.mbridge.msdk.setting.util.a.a().b());
            List<CampaignEx> list = this.f38566e;
            if (list == null || list.isEmpty() || (campaignEx = this.f38566e.get(0)) == null || !campaignEx.isActiveOm()) {
                return;
            }
            a(webView, SafeDKWebAppInterface.f52902f + MBridgeConstans.OMID_JS_SERVICE_CONTENT);
        } catch (Throwable th2) {
            q0.b("BannerWebViewClient", "onPageStarted", th2);
        }
    }

    public boolean safedk_a_shouldOverrideUrlLoading_078b6b002ab25c1d646f13a68f3d4eb0(WebView webView, String str) {
        try {
            q0.b("BannerWebViewClient", "Use html to open url.");
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f35744d && com.mbridge.msdk.click.utils.a.a(this.f38566e.get(0), baseWebView.getUrl(), com.mbridge.msdk.click.utils.a.f35742b)) {
                return false;
            }
            if (this.f38566e.size() > 1) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(c.n().d(), new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f38567f;
            if (aVar != null) {
                aVar.a(false, str);
            }
            return true;
        } catch (Throwable th2) {
            q0.b("BannerWebViewClient", "shouldOverrideUrlLoading", th2);
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
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbbanner/view/a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_a_shouldOverrideUrlLoading_078b6b002ab25c1d646f13a68f3d4eb0 = safedk_a_shouldOverrideUrlLoading_078b6b002ab25c1d646f13a68f3d4eb0(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f53141o, webView, str, zSafedk_a_shouldOverrideUrlLoading_078b6b002ab25c1d646f13a68f3d4eb0);
        return zSafedk_a_shouldOverrideUrlLoading_078b6b002ab25c1d646f13a68f3d4eb0;
    }
}
