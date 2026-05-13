package com.fyber.inneractive.sdk.activities;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j1;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberReportAdActivity f15800a;

    public a(FyberReportAdActivity fyberReportAdActivity) {
        this.f15800a = fyberReportAdActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53142p, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53142p, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i10), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        FyberReportAdActivity fyberReportAdActivity = this.f15800a;
        if (fyberReportAdActivity.f15771b == webView) {
            fyberReportAdActivity.f15771b = null;
        }
        if (webView != null) {
            v.a(webView);
            webView.destroy();
        }
        this.f15800a.finish();
        return true;
    }

    public boolean safedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a(WebView webView, String str) {
        com.fyber.inneractive.sdk.flow.h hVar;
        if (str == null) {
            return false;
        }
        if (j1.a(str)) {
            WebView webView2 = this.f15800a.f15771b;
            if (webView2 != null) {
                DTExchangeNetworkBridge.webviewLoadUrl(webView2, "chrome://crash");
            }
            return true;
        }
        if (!str.startsWith("fybermarketplace://reportAd?") || (hVar = FyberReportAdActivity.f15770f) == null) {
            return false;
        }
        String strSubstring = str.substring(28);
        com.fyber.inneractive.sdk.flow.g gVar = (com.fyber.inneractive.sdk.flow.g) hVar;
        w wVar = new w(u.FYBER_REPORT_AD, gVar.f16394b, gVar.f16395c);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", strSubstring);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "message", strSubstring);
        }
        wVar.f17081f.put(jSONObject);
        wVar.f17082g = true;
        wVar.a((String) null);
        WebView webView3 = this.f15800a.f15771b;
        if (webView3 != null) {
            q0.a(webView3, "reportSent();");
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53142p, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53142p, webView, str, super.shouldInterceptRequest(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a = safedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53142p, webView, str, zSafedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a);
        return zSafedk_a_shouldOverrideUrlLoading_0e0a97058b8988959ba7eb7368f3240a;
    }
}
