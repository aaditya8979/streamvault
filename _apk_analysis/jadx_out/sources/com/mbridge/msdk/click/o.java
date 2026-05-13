package com.mbridge.msdk.click;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.G5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.HashMap;

/* JADX INFO: compiled from: WebViewSpider.java */
/* JADX INFO: loaded from: classes10.dex */
public class o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f35656r = "o";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35658b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f35660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f35661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WebView f35664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f35666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35667k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35671o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35668l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f35672p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f35673q = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f35659c = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: WebViewSpider.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f35676c;

        public a(String str, String str2, Context context) {
            this.f35674a = str;
            this.f35675b = str2;
            this.f35676c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.f35674a, this.f35675b, this.f35676c, oVar.f35662f);
        }
    }

    /* JADX INFO: compiled from: WebViewSpider.java */
    public class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f35680c;

        public b(String str, String str2, Context context) {
            this.f35678a = str;
            this.f35679b = str2;
            this.f35680c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53141o, webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$b;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53141o, webView, str);
            safedk_o$b_onPageFinished_ba2a4c8e168e8a1aae31edc801d13823(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                MintegralNetworkBridge.webviewLoadUrl(webView, "javascript:window.navigator.vibrate([]);");
                if (o.this.f35669m) {
                    o.this.f35667k = 0;
                    o.this.f();
                    return;
                }
                o.this.f35671o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    o.this.f35670n = true;
                }
                synchronized (o.f35656r) {
                    o.this.f35662f = str;
                    if (o.this.f35661e == null || !o.this.f35661e.a(str)) {
                        o.this.h();
                    } else {
                        o.this.f35669m = true;
                        o.this.f();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            synchronized (o.f35656r) {
                o.this.f35669m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.f35661e != null) {
                o.this.f35661e.a(i10, webView.getUrl(), str, o.this.f35666j);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.f35678a) || TextUtils.isEmpty(this.f35679b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.f35680c).a(this.f35679b, this.f35678a, webView.getUrl());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.f35656r) {
                    o.this.f35669m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.f35661e != null) {
                    o.this.f35661e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.f35666j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th2) {
                q0.b(o.f35656r, th2.getMessage());
                return true;
            }
        }

        public void safedk_o$b_onPageFinished_ba2a4c8e168e8a1aae31edc801d13823(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                MintegralNetworkBridge.webviewLoadUrl(webView, "javascript:window.navigator.vibrate([]);");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public boolean safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2(WebView webView, String str) {
            synchronized (o.f35656r) {
                o oVar = o.this;
                oVar.f35671o = true;
                oVar.c();
                if (o.this.f35669m) {
                    o.this.d();
                    o.this.f();
                    return true;
                }
                o.this.f35662f = str;
                if (o.this.f35661e != null && o.this.f35661e.c(str)) {
                    o.this.f35669m = true;
                    o.this.d();
                    o.this.f();
                    return true;
                }
                if (o.this.f35665i) {
                    HashMap map = new HashMap();
                    if (o.this.f35664h.getUrl() != null) {
                        map.put("Referer", o.this.f35664h.getUrl());
                    }
                    MintegralNetworkBridge.webviewLoadUrl(o.this.f35664h, str, map);
                } else {
                    MintegralNetworkBridge.webviewLoadUrl(o.this.f35664h, str);
                }
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53141o, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53141o, webView, str, super.shouldInterceptRequest(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2 = safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53141o, webView, str, zSafedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2);
            return zSafedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2;
        }
    }

    /* JADX INFO: compiled from: WebViewSpider.java */
    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                try {
                    MintegralNetworkBridge.webviewLoadUrl(webView, "javascript:window.navigator.vibrate([]);");
                    if (!o.this.f35669m) {
                        o oVar = o.this;
                        if (!oVar.f35671o) {
                            oVar.g();
                        }
                    }
                    if (o.this.f35661e != null) {
                        o.this.f35661e.b(webView.getUrl());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: WebViewSpider.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f35668l = true;
            o.this.f35667k = 1;
            o.this.e();
        }
    }

    /* JADX INFO: compiled from: WebViewSpider.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f35668l = true;
            o.this.f35667k = 2;
            o.this.e();
        }
    }

    /* JADX INFO: compiled from: WebViewSpider.java */
    public interface f {
        void a(int i10, String str, String str2, String str3);

        void a(String str, boolean z10, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public o() {
        this.f35657a = 15000;
        this.f35658b = 3000;
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f35660d = gVarD;
        if (gVarD == null) {
            this.f35660d = com.mbridge.msdk.setting.h.b().a();
        }
        this.f35665i = this.f35660d.J0();
        this.f35657a = (int) this.f35660d.p0();
        this.f35658b = (int) this.f35660d.p0();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.f35664h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f35664h.getSettings().setCacheMode(2);
        this.f35664h.getSettings().setLoadsImagesAutomatically(false);
        this.f35664h.setWebViewClient(new b(str2, str, context));
        this.f35664h.setWebChromeClient(new c());
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f35662f);
        } else {
            this.f35659c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f35663g)) {
                this.f35664h.getSettings().setDefaultTextEncodingName(G5.N);
                this.f35658b = 2000;
                this.f35657a = 2000;
                q0.c(f35656r, this.f35663g);
                MintegralNetworkBridge.webviewLoadDataWithBaseURL(this.f35664h, str3, this.f35663g, "*/*", G5.N, str3);
                return;
            }
            if (!this.f35665i) {
                MintegralNetworkBridge.webviewLoadUrl(this.f35664h, str3);
                return;
            }
            HashMap map = new HashMap();
            if (this.f35664h.getUrl() != null) {
                map.put("Referer", this.f35664h.getUrl());
            }
            MintegralNetworkBridge.webviewLoadUrl(this.f35664h, str3, map);
        } catch (Throwable th2) {
            try {
                f fVar = this.f35661e;
                if (fVar != null) {
                    fVar.a(0, this.f35662f, th2.getMessage(), this.f35666j);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f35659c.removeCallbacks(this.f35672p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f35659c.removeCallbacks(this.f35673q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        f fVar;
        synchronized (f35656r) {
            try {
                try {
                    b();
                    this.f35664h.destroy();
                    fVar = this.f35661e;
                } finally {
                }
            } catch (Exception e10) {
                q0.b(f35656r, e10.getMessage());
            }
            if (fVar != null) {
                fVar.a(this.f35662f, this.f35668l, this.f35666j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        f fVar;
        synchronized (f35656r) {
            try {
                b();
                fVar = this.f35661e;
            } catch (Exception e10) {
                q0.b(f35656r, e10.getMessage());
            } catch (Throwable th2) {
                q0.b(f35656r, th2.getMessage());
            }
            if (fVar != null) {
                fVar.a(this.f35662f, this.f35668l, this.f35666j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    private void i() {
        this.f35659c.postDelayed(this.f35672p, this.f35658b);
    }

    private void j() {
        this.f35659c.postDelayed(this.f35673q, this.f35657a);
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar == null) {
            throw new NullPointerException("OverrideUrlLoadingListener can not be null");
        }
        this.f35662f = str3;
        this.f35661e = fVar;
        a(str, str2, context);
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar == null) {
            throw new NullPointerException("OverrideUrlLoadingListener can not be null");
        }
        this.f35663g = str4;
        this.f35662f = str3;
        this.f35661e = fVar;
        a(str, str2, context);
    }
}
