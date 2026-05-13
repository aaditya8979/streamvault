package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.ironsource.adqualitysdk.sdk.i.bb;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class js implements jk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<WebView, js> f2902 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2903;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Set<jk> f2904 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jt f2905;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js$2, reason: invalid class name */
    public class AnonymousClass2 extends WebViewClient {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f2909 = false;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2907 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f2908 = null;

        public AnonymousClass2() {
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean m6802(WebView webView) {
            if (this.f2909 && this.f2907) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f2908 == null || webView.getOriginalUrl().equals(this.f2908)) ? false : true;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean m6803(WebView webView, String str) {
            if (!str.startsWith(js.this.f2903)) {
                return false;
            }
            this.f2908 = webView.getOriginalUrl();
            String strSubstring = str.substring(js.this.f2903.length());
            js jsVar = js.this;
            jsVar.mo4350(webView, jsVar.f2903, strSubstring);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53132f, webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/js$2;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53132f, webView, str);
            safedk_js$2_onPageFinished_7b9c1b9fd7cfdfdadfc561f45118cf9d(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            js.this.mo4348(webView);
            this.f2909 = true;
        }

        public void safedk_js$2_onPageFinished_7b9c1b9fd7cfdfdadfc561f45118cf9d(WebView webView, String str) {
            js.this.mo4348(webView);
            this.f2909 = false;
            this.f2907 = true;
            if (this.f2908 == null) {
                this.f2908 = webView.getOriginalUrl();
            }
        }

        @RequiresApi(api = 24)
        public boolean safedk_js$2_shouldOverrideUrlLoading_05e45263fbdc9e2511712c77c9068285(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        public boolean safedk_js$2_shouldOverrideUrlLoading_267ac2d1718033f4f47bb58953824792(WebView webView, String str) {
            if (m6803(webView, str)) {
                return true;
            }
            if (this.f2908 == null) {
                this.f2908 = webView.getOriginalUrl();
            }
            js.this.mo4351(webView, str, m6802(webView));
            this.f2907 = true;
            this.f2909 = false;
            return false;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53132f, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53132f, webView, str, super.shouldInterceptRequest(webView, str));
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/js$2;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean zSafedk_js$2_shouldOverrideUrlLoading_05e45263fbdc9e2511712c77c9068285 = safedk_js$2_shouldOverrideUrlLoading_05e45263fbdc9e2511712c77c9068285(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f53132f, webView, webResourceRequest, zSafedk_js$2_shouldOverrideUrlLoading_05e45263fbdc9e2511712c77c9068285);
            return zSafedk_js$2_shouldOverrideUrlLoading_05e45263fbdc9e2511712c77c9068285;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/js$2;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_js$2_shouldOverrideUrlLoading_267ac2d1718033f4f47bb58953824792 = safedk_js$2_shouldOverrideUrlLoading_267ac2d1718033f4f47bb58953824792(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53132f, webView, str, zSafedk_js$2_shouldOverrideUrlLoading_267ac2d1718033f4f47bb58953824792);
            return zSafedk_js$2_shouldOverrideUrlLoading_267ac2d1718033f4f47bb58953824792;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js$4, reason: invalid class name */
    public class AnonymousClass4 extends WebChromeClient {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2910 = false;

        public AnonymousClass4() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            js.this.mo4349(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            if (i10 != 100 || this.f2910) {
                return;
            }
            this.f2910 = true;
            js.this.mo4348(webView);
        }
    }

    private js(WebView webView, String str) {
        this.f2903 = str;
        jt jtVar = new jt(webView);
        this.f2905 = jtVar;
        jtVar.m6811(new AnonymousClass2());
        this.f2905.m6809(new AnonymousClass4());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static js m6793(WebView webView, String str) {
        js jsVar = f2902.get(webView);
        if (jsVar != null) {
            return jsVar;
        }
        js jsVar2 = new js(webView, str);
        f2902.put(webView, jsVar2);
        return jsVar2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6795() {
        this.f2905.m6809(new AnonymousClass4());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻐ */
    public final void mo4348(WebView webView) {
        for (jk jkVar : new HashSet(this.f2904)) {
            if (jkVar != null) {
                jkVar.mo4348(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻛ */
    public final void mo4349(WebView webView, String str) {
        for (jk jkVar : new HashSet(this.f2904)) {
            if (jkVar != null) {
                jkVar.mo4349(webView, str);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻛ */
    public final void mo4350(WebView webView, String str, String str2) {
        for (jk jkVar : new HashSet(this.f2904)) {
            if (jkVar != null) {
                jkVar.mo4350(webView, str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6796(jk jkVar) {
        this.f2904.add(jkVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m6797() {
        return this.f2905.m6810();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final bb.e m6798() {
        return this.f2905.m6807();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ｋ */
    public final void mo4351(WebView webView, String str, boolean z10) {
        for (jk jkVar : new HashSet(this.f2904)) {
            if (jkVar != null) {
                jkVar.mo4351(webView, str, z10);
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6799() {
        this.f2905.m6811(new AnonymousClass2());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final WebView m6800() {
        return this.f2905.m6808();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6801(jk jkVar) {
        this.f2904.remove(jkVar);
    }
}
