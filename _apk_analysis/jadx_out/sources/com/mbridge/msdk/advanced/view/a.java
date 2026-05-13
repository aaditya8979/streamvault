package com.mbridge.msdk.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3978d4;
import com.ironsource.G5;
import com.mbridge.msdk.advanced.middle.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.vungle.ads.internal.model.AdPayload;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;

/* JADX INFO: compiled from: NativeAdvancedWebViewClient.java */
/* JADX INFO: loaded from: classes8.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35556c = "NativeAdvancedWebViewClient";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f35558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.mbridge.msdk.advanced.middle.a f35560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f35561h;

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NativeAdvancedWebViewClient.java */
    public class C0420a implements ValueCallback<String> {
        public C0420a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public a(String str, com.mbridge.msdk.advanced.middle.a aVar, c cVar) {
        com.mbridge.msdk.foundation.same.directory.c cVar2 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC;
        this.f35557d = e.b(cVar2) != null ? e.b(cVar2) : k0.a("YkRXhr5AWBPfNgzuH7JQ+2Ha");
        this.f35558e = k0.a("Y+xgWkl2");
        this.f35559f = str;
        this.f35560g = aVar;
        this.f35561h = cVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.f35561h != null) {
            try {
                String strA = "";
                if (str.startsWith(C3978d4.i.f31327b) && str.startsWith(this.f35557d)) {
                    strA = str.replace(AdPayload.FILE_SCHEME, "");
                }
                if (a(str)) {
                    strA = this.f35561h.a(URLDecoder.decode(Uri.parse(str).getQueryParameter(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)));
                }
                if (!TextUtils.isEmpty(strA) && a(strA, this.f35557d)) {
                    q0.a("NativeAdvancedWebViewClient", "replace url : " + strA);
                    if (!strA.contains("127.0.0.1") && !strA.startsWith("http")) {
                        HashMap map = new HashMap();
                        map.put("Access-Control-Allow-Origin", "*");
                        WebResourceResponse webResourceResponse = new WebResourceResponse("video/mp4", G5.N, new FileInputStream(strA));
                        webResourceResponse.setResponseHeaders(map);
                        return webResourceResponse;
                    }
                    return null;
                }
            } catch (Throwable th2) {
                q0.b("NativeAdvancedWebViewClient", th2.getMessage());
            }
        }
        return null;
    }

    private boolean a(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (scheme = uri.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.f35558e) || scheme.equals("mb-h5");
    }

    public void b() {
        if (this.f35561h != null) {
            this.f35561h = null;
        }
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
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript(SafeDKWebAppInterface.f52902f + com.mbridge.msdk.setting.util.a.a().b(), new C0420a());
        } catch (Throwable th2) {
            q0.b("NativeAdvancedWebViewClient", "onPageStarted", th2);
        }
    }

    @Nullable
    public WebResourceResponse safedk_a_shouldInterceptRequest_760d8c02192100f041c6f359c7ace52c(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webView, webResourceRequest.getUrl().toString());
    }

    @Nullable
    public WebResourceResponse safedk_a_shouldInterceptRequest_f98edc53b84eb6cd8b74482c601d3e96(WebView webView, String str) {
        return a(webView, str);
    }

    public boolean safedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f35744d) {
                    if (com.mbridge.msdk.click.utils.a.a(((com.mbridge.msdk.advanced.signal.b) windVaneWebView.getObject()).a().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f35742b)) {
                        return false;
                    }
                }
            } catch (Exception e10) {
                q0.b("NativeAdvancedWebViewClient", e10.getMessage());
            }
            q0.b("NativeAdvancedWebViewClient", "Use html to open url.");
            com.mbridge.msdk.advanced.middle.a aVar = this.f35560g;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable th2) {
            q0.b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th2);
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53141o, webView, webResourceRequest, safedk_a_shouldInterceptRequest_760d8c02192100f041c6f359c7ace52c(webView, webResourceRequest));
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(g.f53141o, webView, str, safedk_a_shouldInterceptRequest_f98edc53b84eb6cd8b74482c601d3e96(webView, str));
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee = safedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f53141o, webView, str, zSafedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee);
        return zSafedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee;
    }
}
