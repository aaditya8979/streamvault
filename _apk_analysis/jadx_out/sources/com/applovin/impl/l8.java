package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f8708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f8710e = Collections.synchronizedSet(new HashSet());

    public class a extends t4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f8711a;

        public a(boolean z10) {
            this.f8711a = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            l8.this.f8708c.destroy();
            l8.this.f8708c = null;
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53127a, webView, str);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/l8$a;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53127a, webView, str);
            safedk_l8$a_onPageFinished_b22223da9b1058e4cf88973ae1cbbf7e(webView, str);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == l8.this.f8708c) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.gc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8378b.b();
                    }
                });
            } else {
                l8.this.b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        public void safedk_l8$a_onPageFinished_b22223da9b1058e4cf88973ae1cbbf7e(WebView webView, String str) {
            if (this.f8711a) {
                com.applovin.impl.sdk.o unused = l8.this.f8707b;
                if (com.applovin.impl.sdk.o.a()) {
                    l8.this.f8707b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                l8.this.f8709d = true;
            }
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53127a, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53127a, webView, str, super.shouldInterceptRequest(webView, str));
        }
    }

    public l8(com.applovin.impl.sdk.k kVar) {
        this.f8706a = kVar;
        this.f8707b = kVar.O();
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z10) {
        n7.b();
        WebView webViewB = n7.b(com.applovin.impl.sdk.k.o(), "web tracker");
        if (webViewB == null) {
            return null;
        }
        webViewB.getSettings().setJavaScriptEnabled(true);
        webViewB.setWebViewClient(new a(z10 && c()));
        AppLovinNetworkBridge.webviewLoadData(webViewB, "<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return webViewB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f8708c = webViewA;
        if (webViewA == null && com.applovin.impl.sdk.o.a()) {
            this.f8707b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final WebView webView) {
        if (webView == null || !this.f8710e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.cc
            @Override // java.lang.Runnable
            public final void run() {
                webView.destroy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z10, String str2, String str3) {
        if (z10) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.f8706a.D().d(d2.f7996b1, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        final String strAppendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f8706a.a(x4.f10749i3)).booleanValue());
        if (this.f8708c == null) {
            WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f8708c = webViewA;
            if (webViewA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8707b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.f8709d) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8707b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put("source", "webViewNotInitialized");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f8706a.D().d(d2.f7996b1, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        String str = "al_firePostback('" + strAppendQueryParameters + "')";
        if (((Boolean) this.f8706a.a(x4.Q2)).booleanValue()) {
            o8.a(this.f8708c, str, this.f8706a).a(this.f8706a.q0().a("evaluateJavascriptPromise"), new s4.b() { // from class: com.applovin.impl.dc
                @Override // com.applovin.impl.s4.b
                public final void a(boolean z10, Object obj, Object obj2) {
                    this.f8122a.a(appLovinPostbackListener, strAppendQueryParameters, z10, (String) obj, (String) obj2);
                }
            });
        } else {
            o8.a(this.f8708c, str);
            appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        final WebView webViewA = a(str);
        if (webViewA != null) {
            this.f8710e.add(webViewA);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.fc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8312b.b(webViewA);
                }
            }, ((Integer) this.f8706a.a(x4.K2)).intValue());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f8707b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    private boolean c() {
        return ((Boolean) this.f8706a.a(x4.P2)).booleanValue();
    }

    public void a(final com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.bc
            @Override // java.lang.Runnable
            public final void run() {
                this.f7889b.b(eVar, appLovinPostbackListener);
            }
        });
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ac
            @Override // java.lang.Runnable
            public final void run() {
                this.f7665b.a();
            }
        });
    }

    public void b(final String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8707b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else if (str.startsWith("<script")) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ec
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8250b.c(str);
                }
            });
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f8707b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
        }
    }
}
