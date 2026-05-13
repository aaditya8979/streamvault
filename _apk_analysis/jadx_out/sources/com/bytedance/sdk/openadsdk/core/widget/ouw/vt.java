package com.bytedance.sdk.openadsdk.core.widget.ouw;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.th;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.g;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class vt implements ouw {
    private com.bytedance.sdk.component.bly.le fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public bs f14063lh;
    public final AtomicInteger ouw;
    public final MessageQueue vt;
    public final boolean yu;

    public vt(int i10, boolean z10, MessageQueue messageQueue) {
        this.ouw = new AtomicInteger(i10);
        this.yu = z10;
        this.vt = messageQueue;
    }

    private static void ouw(com.bytedance.sdk.component.bly.le leVar) {
        if (leVar == null || leVar.getWebView() == null) {
            return;
        }
        try {
            lh lhVarOuw = lh.ouw(zih.ouw());
            lhVarOuw.vt = false;
            lhVarOuw.ouw(leVar.getWebView());
            leVar.setVerticalScrollBarEnabled(false);
            leVar.setHorizontalScrollBarEnabled(false);
            lh.ouw(leVar);
            leVar.ra();
            leVar.setUserAgentString(th.ouw(leVar.getWebView()));
            leVar.setMixedContentMode(0);
            leVar.setJavaScriptEnabled(true);
            leVar.setJavaScriptCanOpenWindowsAutomatically(true);
            leVar.setDomStorageEnabled(true);
            leVar.setDatabaseEnabled(true);
            leVar.setCacheMode(-1);
            leVar.setAllowFileAccess(false);
            leVar.setSupportZoom(true);
            leVar.setBuiltInZoomControls(true);
            leVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            leVar.setUseWideViewPort(true);
        } catch (Throwable th2) {
            qbp.lh("WebViewPool", th2.toString());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.ouw
    public final void ouw() {
        MessageQueue messageQueue;
        if (this.yu) {
            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().ouw(this.fkw);
        } else {
            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().vt(this.fkw);
        }
        try {
            ko.ouw("WebViewPool", "preload finish ", Integer.valueOf(this.ouw.get()), "isV3 ?? ", Boolean.valueOf(this.yu));
            this.ouw.decrementAndGet();
            if (this.ouw.get() <= 0 || (messageQueue = this.vt) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.vt.2
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    int i10 = vt.this.ouw.get();
                    vt vtVar = vt.this;
                    new vt(i10, vtVar.yu, vtVar.vt).vt();
                    return false;
                }
            });
        } catch (Exception e10) {
            ko.vt("WebViewPool", e10.getMessage());
        }
    }

    public final void vt() {
        if (this.ouw.get() <= 0) {
            return;
        }
        ko.vt("WebViewPool", "preload start ,isV3 = " + this.yu + ",preloadSize = " + this.ouw);
        String strYu = com.bytedance.sdk.component.adexpress.ouw.vt.vt.yu(null);
        if (this.yu) {
            String strYu2 = com.bytedance.sdk.component.adexpress.ouw.vt.vt.yu("v3");
            if (strYu != null && strYu.equals(strYu2)) {
                ko.vt("WebViewPool", "v1 and v3 url is same ,so do not preload v3");
                return;
            }
            strYu = strYu2;
        }
        if (TextUtils.isEmpty(strYu)) {
            ko.vt("WebViewPool", "engin url is empty ,no preload.");
            return;
        }
        try {
            com.bytedance.sdk.component.bly.le leVar = new com.bytedance.sdk.component.bly.le(new MutableContextWrapper(zih.ouw()), this.yu ? le.lh.ADS_V3 : le.lh.ADS);
            this.fkw = leVar;
            if (leVar.getWebView() == null) {
                return;
            }
            this.fkw.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.vt.1
                @Override // android.webkit.WebViewClient
                public void onLoadResource(WebView webView, String str) {
                    super.onLoadResource(webView, str);
                    CreativeInfoManager.onResourceLoaded(g.f53147u, webView, str);
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    CreativeInfoManager.onWebViewPageFinished(g.f53147u, webView, str);
                }

                @Override // android.webkit.WebViewClient
                public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53147u, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    return CreativeInfoManager.onWebViewResponse(g.f53147u, webView, str, super.shouldInterceptRequest(webView, str));
                }
            });
            ouw(this.fkw);
            Uri uriBuild = Uri.parse(strYu).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            bs bsVar = new bs(this.fkw.getContext());
            this.f14063lh = bsVar;
            bs bsVarVt = bsVar.vt(this.fkw);
            bsVarVt.ksc = this;
            bsVarVt.ouw(this.fkw);
            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().ouw(this.fkw, this.f14063lh);
            this.fkw.a_(uriBuild.toString());
        } catch (Exception unused) {
        }
    }
}
