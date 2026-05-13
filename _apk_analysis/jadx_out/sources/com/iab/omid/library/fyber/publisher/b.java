package com.iab.omid.library.fyber.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.internal.g;
import com.iab.omid.library.fyber.internal.h;
import com.iab.omid.library.fyber.utils.c;
import com.iab.omid.library.fyber.utils.f;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f24332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f24333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f24334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f24335j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded("com.iab.omid.library", webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            CreativeInfoManager.onWebViewPageFinished("com.iab.omid.library", webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("com.iab.omid.library", webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse("com.iab.omid.library", webView, str, super.shouldInterceptRequest(webView, str));
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0339b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f24337a;

        public RunnableC0339b() {
            this.f24337a = b.this.f24332g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24337a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f24333h = null;
        this.f24334i = map;
        this.f24335j = str2;
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.fyber.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0339b(), Math.max(4000 - (this.f24333h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f24333h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f24332g = null;
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f24332g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f24332g.getSettings().setAllowContentAccess(false);
        this.f24332g.getSettings().setAllowFileAccess(false);
        this.f24332g.setWebViewClient(new a());
        a(this.f24332g);
        h.a().c(this.f24332g, this.f24335j);
        for (String str : this.f24334i.keySet()) {
            h.a().d(this.f24332g, this.f24334i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f24333h = Long.valueOf(f.b());
    }
}
