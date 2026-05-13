package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.C3978d4;
import com.ironsource.K8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4199p8 implements K8 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f33224g = "loadWithUrl | webView is not null";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f33225h = "p8";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f33226i = "file://";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f33229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4163n8 f33230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4072i8 f33231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f33232f;

    /* JADX INFO: renamed from: com.ironsource.p8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f33234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33235c;

        public a(String str, JSONObject jSONObject, String str2) {
            this.f33233a = str;
            this.f33234b = jSONObject;
            this.f33235c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4199p8.this.f33229c != null) {
                A8.a(C4024fe.f31722q, new C4300v8().a(G5.A, C4199p8.f33224g).a());
            }
            try {
                C4199p8.this.b(this.f33233a);
                IronSourceNetworkBridge.webviewLoadUrl(C4199p8.this.f33229c, C4199p8.this.a(this.f33234b.getString("urlForWebView")));
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put("adViewId", C4199p8.this.f33227a);
                C4199p8.this.f33230d.a(this.f33235c, jSONObjectJsonObjectInit);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                C4199p8.this.b(this.f33233a, e10.getMessage());
                A8.a(C4024fe.f31722q, new C4300v8().a(G5.A, e10.getMessage()).a());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33238b;

        public b(String str, String str2) {
            this.f33237a = str;
            this.f33238b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C4199p8.this.f33229c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put("adViewId", C4199p8.this.f33227a);
                C4163n8 c4163n8 = C4199p8.this.f33230d;
                if (c4163n8 != null) {
                    c4163n8.a(this.f33237a, jSONObjectJsonObjectInit);
                    C4199p8.this.f33230d.b();
                }
                C4199p8 c4199p8 = C4199p8.this;
                c4199p8.f33230d = null;
                c4199p8.f33232f = null;
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                Log.e(C4199p8.f33225h, "performCleanup | could not destroy ISNAdView webView ID: " + C4199p8.this.f33227a);
                A8.a(C4024fe.f31723r, new C4300v8().a(G5.A, e10.getMessage()).a());
                C4199p8.this.b(this.f33238b, e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$c */
    public class c implements K8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33240a;

        public c(String str) {
            this.f33240a = str;
        }

        @Override // com.ironsource.K8.a
        public void a(String str) {
            Logger.i(C4199p8.f33225h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C4199p8.this.b(this.f33240a, str);
        }

        @Override // com.ironsource.K8.a
        public void b(String str) {
            Logger.i(C4199p8.f33225h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C4199p8.this.f33229c.getParent()).removeView(C4199p8.this.f33229c);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C4199p8.this.d();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$d */
    public class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C4199p8.this.new d());
            webView2.setWebViewClient(new e());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$e */
    public class e extends WebViewClient {
        private e() {
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
            com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53132f);
            context.startActivity(intent);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53132f, webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53132f, webView, str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C4199p8.f33225h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public boolean safedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f(WebView webView, String str) {
            Context context = webView.getContext();
            Intent intentA = new OpenUrlActivity.e(new k.c()).a(str).b(false).a(context);
            intentA.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
            return true;
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
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/p8$e;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f = safedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53132f, webView, str, zSafedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f);
            return zSafedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f;
        }
    }

    public C4199p8(InterfaceC4125l8 interfaceC4125l8, Context context, String str, C4072i8 c4072i8) {
        this.f33232f = context;
        C4163n8 c4163n8 = new C4163n8();
        this.f33230d = c4163n8;
        c4163n8.g(str);
        this.f33227a = str;
        this.f33230d.a(interfaceC4125l8);
        this.f33231e = c4072i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return "file://" + this.f33228b + d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface"})
    public void b(String str) {
        Logger.i(f33225h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f33232f);
        this.f33229c = webView;
        IronSourceNetworkBridge.onAddedJavascriptInterface(webView, new C4143m8(this), C4089j8.f32048e);
        this.f33229c.setWebViewClient(new C4181o8(new c(str)));
        this.f33229c.setWebChromeClient(new d());
        Og.a(this.f33229c);
        this.f33230d.a(this.f33229c);
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.f33227a;
    }

    @Override // com.ironsource.K8
    public synchronized void a(String str, String str2) {
        if (this.f33232f == null) {
            return;
        }
        Logger.i(f33225h, "performCleanup");
        V7.f30593a.d(new b(str, str2));
    }

    @Override // com.ironsource.K8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, C3978d4.c.D);
            return;
        }
        Logger.i(f33225h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(C3978d4.i.f31364t0)) {
                this.f33229c.onPause();
                this.f33230d.f(str2);
            } else if (str.equals(C3978d4.i.f31366u0)) {
                this.f33229c.onResume();
                this.f33230d.f(str2);
            } else {
                b(str3, C3978d4.c.C);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            b(str3, C3978d4.c.E);
        }
    }

    @Override // com.ironsource.K8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f33230d.e(str);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            Logger.i(f33225h, "sendHandleGetViewVisibility fail with reason: " + e10.getMessage());
        }
    }

    public C4163n8 b() {
        return this.f33230d;
    }

    public void b(String str, String str2) {
        C4163n8 c4163n8 = this.f33230d;
        if (c4163n8 != null) {
            c4163n8.a(str, str2);
        }
    }

    @Override // com.ironsource.K8
    public void b(JSONObject jSONObject, String str, String str2) {
        V7.f30593a.d(new a(str2, jSONObject, str));
    }

    public C4072i8 c() {
        return this.f33231e;
    }

    @Override // com.ironsource.K8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.f33230d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            Logger.i(f33225h, "sendMessageToAd fail message: " + e10.getMessage());
            throw e10;
        }
    }

    public void e(String str) {
        this.f33228b = str;
    }

    @Override // com.ironsource.K8
    public WebView getPresentingView() {
        return this.f33229c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f33230d.c(str);
    }
}
