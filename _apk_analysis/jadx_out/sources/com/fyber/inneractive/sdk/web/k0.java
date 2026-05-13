package com.fyber.inneractive.sdk.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f19676e;

    public k0(j jVar, boolean z10, int i10, int i11, int i12) {
        this.f19676e = jVar;
        this.f19672a = z10;
        this.f19673b = i10;
        this.f19674c = i11;
        this.f19675d = i12;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53142p, webView, str);
        safedk_k0_onLoadResource_5e4c7aec67db305f1f538b12d57d1270(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53142p, webView, str);
        safedk_k0_onPageFinished_dffa11ebe1b6f0bcc0595b54c77d4cfa(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.e("onPageStarted - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.e("%sError: code = %d text = %s WebView = %s", IAlog.a(this), Integer.valueOf(i10), str, webView);
        super.onReceivedError(webView, i10, str, str2);
        j jVar = this.f19676e;
        if (jVar != null) {
            jVar.d();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (webView != null) {
            com.fyber.inneractive.sdk.util.v.a(webView);
            webView.destroy();
        }
        j jVar = this.f19676e;
        if (jVar != null) {
            jVar.a();
        }
        return true;
    }

    public void safedk_k0_onLoadResource_5e4c7aec67db305f1f538b12d57d1270(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.e("Resources to load: %s", str);
        IAlog.d("%s %s", "RESOURCES", str);
        j jVar = this.f19676e;
        if (jVar != null) {
            i iVar = (i) jVar;
            if (TextUtils.isEmpty(str) || !str.startsWith("http://") || com.fyber.inneractive.sdk.util.s.a()) {
                return;
            }
            IAlog.a("%s Found a portential unsecure resource url: %s", IAlog.a(iVar), str);
        }
    }

    public void safedk_k0_onPageFinished_dffa11ebe1b6f0bcc0595b54c77d4cfa(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.e("onPageFinished - url: %s", str);
        j jVar = this.f19676e;
        if (jVar != null) {
            jVar.a(webView);
        }
    }

    public WebResourceResponse safedk_k0_shouldInterceptRequest_d2b0cda7f0212217cff9d9ea52019c55(WebView webView, WebResourceRequest webResourceRequest) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.f19672a && webResourceRequest != null) {
            IAlog.e("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            b1 b1Var = b1.f19591c;
            int i10 = this.f19673b;
            int i11 = this.f19674c;
            int i12 = this.f19675d;
            b1Var.getClass();
            WebResourceResponse webResourceResponse = null;
            if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith("http") && TextUtils.equals(webResourceRequest.getMethod(), "GET")) {
                c1 c1Var = (c1) b1Var.f19592a.get(new d1(webResourceRequest));
                if (c1Var != null) {
                    webResourceResponse = new WebResourceResponse(c1Var.f19598c, c1Var.f19599d, c1Var.f19600e, c1Var.f19601f, c1Var.f19597b, new ByteArrayInputStream(c1Var.f19596a));
                } else {
                    try {
                        url = new URL(webResourceRequest.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer byteBufferAllocateDirect = (ByteBuffer) com.fyber.inneractive.sdk.util.f.f19526b.f19527a.poll();
                        if (byteBufferAllocateDirect == null) {
                            byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
                        }
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                b1.a(webResourceRequest, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i10);
                            httpURLConnection.setReadTimeout(i11);
                            c1 c1VarA = null;
                            while (i12 > 0) {
                                try {
                                    c1VarA = b1.a(httpURLConnection, byteBufferAllocateDirect);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i12 = 0;
                                }
                                if (c1VarA != null) {
                                    break;
                                }
                                i12--;
                            }
                            if (c1VarA != null) {
                                try {
                                    if (c1VarA.a()) {
                                        b1Var.f19592a.put(new d1(webResourceRequest), c1VarA);
                                    }
                                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(c1VarA.f19598c, c1VarA.f19599d, c1VarA.f19600e, c1VarA.f19601f, c1VarA.f19597b, new ByteArrayInputStream(c1VarA.f19596a));
                                    DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                    com.fyber.inneractive.sdk.util.f.f19526b.f19527a.offer(byteBufferAllocateDirect);
                                    webResourceResponse = webResourceResponse2;
                                } catch (Throwable unused6) {
                                    DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                    com.fyber.inneractive.sdk.util.f.f19526b.f19527a.offer(byteBufferAllocateDirect);
                                }
                            } else {
                                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            com.fyber.inneractive.sdk.util.f.f19526b.f19527a.offer(byteBufferAllocateDirect);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.e("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        j jVar = this.f19676e;
        return jVar != null && jVar.a(webView, str);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53142p, webView, webResourceRequest, safedk_k0_shouldInterceptRequest_d2b0cda7f0212217cff9d9ea52019c55(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53142p, webView, str, super.shouldInterceptRequest(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2 = safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53142p, webView, str, zSafedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2);
        return zSafedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2;
    }
}
