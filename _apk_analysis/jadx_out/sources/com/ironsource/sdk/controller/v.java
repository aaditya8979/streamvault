package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.ironsource.A8;
import com.ironsource.B4;
import com.ironsource.B7;
import com.ironsource.C1;
import com.ironsource.C3921a1;
import com.ironsource.C3924a4;
import com.ironsource.C3951bd;
import com.ironsource.C3961c5;
import com.ironsource.C3969cd;
import com.ironsource.C3978d4;
import com.ironsource.C4014f4;
import com.ironsource.C4024fe;
import com.ironsource.C4026fg;
import com.ironsource.C4032g4;
import com.ironsource.C4038ga;
import com.ironsource.C4042ge;
import com.ironsource.C4085j4;
import com.ironsource.C4086j5;
import com.ironsource.C4091ja;
import com.ironsource.C4099k0;
import com.ironsource.C4107k8;
import com.ironsource.C4108k9;
import com.ironsource.C4121l4;
import com.ironsource.C4177o4;
import com.ironsource.C4216q8;
import com.ironsource.C4228r4;
import com.ironsource.C4242s1;
import com.ironsource.C4266t8;
import com.ironsource.C4283u8;
import com.ironsource.C4300v8;
import com.ironsource.C4351y8;
import com.ironsource.C8;
import com.ironsource.EnumC4144m9;
import com.ironsource.G5;
import com.ironsource.InterfaceC3945b7;
import com.ironsource.InterfaceC3999e7;
import com.ironsource.InterfaceC4017f7;
import com.ironsource.InterfaceC4103k4;
import com.ironsource.InterfaceC4153mg;
import com.ironsource.InterfaceC4218qa;
import com.ironsource.InterfaceC4262t4;
import com.ironsource.InterfaceC4276u1;
import com.ironsource.InterfaceC4285ua;
import com.ironsource.InterfaceC4296v4;
import com.ironsource.InterfaceC4313w4;
import com.ironsource.InterfaceC4330x4;
import com.ironsource.InterfaceC4347y4;
import com.ironsource.Je;
import com.ironsource.K8;
import com.ironsource.Lb;
import com.ironsource.M;
import com.ironsource.Nb;
import com.ironsource.Ng;
import com.ironsource.Oc;
import com.ironsource.Og;
import com.ironsource.Q6;
import com.ironsource.Qc;
import com.ironsource.Rc;
import com.ironsource.Sc;
import com.ironsource.V7;
import com.ironsource.X3;
import com.ironsource.Y1;
import com.ironsource.Y4;
import com.ironsource.Z0;
import com.ironsource.Z3;
import com.ironsource.Z4;
import com.ironsource.Z7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.controller.m;
import com.ironsource.sdk.controller.p;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.ironsourceads.internal.services.a;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.model.AdPayload;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class v implements com.ironsource.sdk.controller.l, Oc, DownloadListener {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f33871b0 = "about:blank";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static int f33872c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static String f33873d0 = "is_store";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static String f33874e0 = "external_url";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static String f33875f0 = "secondary_web_view";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static String f33876g0 = "success";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static String f33877h0 = "fail";
    private String A;
    private com.ironsource.sdk.controller.d B;
    private InterfaceC4153mg C;
    private C3921a1 D;
    private Z4 G;
    private com.ironsource.sdk.controller.o H;
    private com.ironsource.sdk.controller.q I;
    private com.ironsource.sdk.controller.u J;
    private com.ironsource.sdk.controller.i K;
    private com.ironsource.sdk.controller.a L;
    private com.ironsource.sdk.controller.j M;
    private C4242s1 N;
    private B4 O;
    private Ng P;
    private com.ironsource.sdk.controller.c Q;
    private X3 R;
    private JSONObject S;
    private l.a T;
    private l.b U;
    private C4177o4 V;
    private boolean W;
    private final B7 X;
    public C4032g4 Y;
    private volatile C4091ja Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V7 f33878a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Qc f33879a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4103k4 f33880b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C4086j5 f33886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f33887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q f33888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f33889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CountDownTimer f33890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CountDownTimer f33891m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p f33895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f33896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private FrameLayout f33897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f33898t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f33899u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private EnumC0405v f33900v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f33901w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private InterfaceC4347y4 f33902x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC4330x4 f33903y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private InterfaceC4313w4 f33904z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33881c = v.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33882d = "IronSource";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f33883e = "We're sorry, some error occurred. we will investigate it";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33892n = 50;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f33893o = 50;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f33894p = C3978d4.e.f31273b;
    private Object E = new Object();
    private boolean F = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4283u8 f33907a;

        public c(C4283u8 c4283u8) {
            this.f33907a = c4283u8;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.Q.c("controller html - failed to download - " + this.f33907a.b());
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f33909a;

        public d(Context context) {
            this.f33909a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.e(this.f33909a);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f33911a;

        public e(Context context) {
            this.f33911a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.f33911a);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4266t8.e f33913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33914b;

        public f(C4266t8.e eVar, String str) {
            this.f33913a = eVar;
            this.f33914b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4296v4 interfaceC4296v4A;
            C4266t8.e eVar = this.f33913a;
            if ((eVar == C4266t8.e.RewardedVideo || eVar == C4266t8.e.Interstitial) && (interfaceC4296v4A = v.this.a(eVar)) != null) {
                interfaceC4296v4A.b(this.f33913a, this.f33914b);
            }
        }
    }

    public class g extends X3 {
        public g(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.X3, com.ironsource.InterfaceC4316w7
        public void a() {
            v vVar = v.this;
            if (vVar.f33887i) {
                vVar.n("none");
            }
        }

        @Override // com.ironsource.X3, com.ironsource.InterfaceC4316w7
        public void a(String str, JSONObject jSONObject) {
            v vVar = v.this;
            if (vVar.f33887i) {
                vVar.n(str);
            }
        }

        @Override // com.ironsource.X3, com.ironsource.InterfaceC4316w7
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.f33887i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                v.this.e(jSONObject);
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public class h implements Ng {
        public h() {
        }

        @Override // com.ironsource.Ng
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f33918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WebView f33919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33920c;

        public i(JSONObject jSONObject, WebView webView, String str) {
            this.f33918a = jSONObject;
            this.f33919b = webView;
            this.f33920c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.f33918a, this.f33919b);
            v.this.m("about:blank");
            v.this.m(this.f33920c);
        }
    }

    public class j extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f33922a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Q.c(C3978d4.c.f31242j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j10, long j11, int i10) {
            super(j10, j11);
            this.f33922a = i10;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.f33881c, "Loading Controller Timer Finish");
            int i10 = this.f33922a;
            if (i10 == 3) {
                v.this.b(new a());
            } else {
                v.this.a(i10 + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(v.this.f33881c, "Loading Controller Timer Tick " + j10);
        }
    }

    public class k implements t {
        public k() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C4266t8.e eVar, Y4 y42) {
            v.this.a(str, eVar, y42);
        }
    }

    public class l implements t {
        public l() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C4266t8.e eVar, Y4 y42) {
            v.this.a(str, eVar, y42);
        }
    }

    public class m implements t {
        public m() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C4266t8.e eVar, Y4 y42) {
            v.this.a(str, eVar, y42);
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4266t8.e f33928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4 f33929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33930c;

        public n(C4266t8.e eVar, Y4 y42, String str) {
            this.f33928a = eVar;
            this.f33929b = y42;
            this.f33930c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Y4 y42;
            C4266t8.e eVar = C4266t8.e.RewardedVideo;
            C4266t8.e eVar2 = this.f33928a;
            if ((eVar != eVar2 && C4266t8.e.Interstitial != eVar2 && C4266t8.e.Banner != eVar2) || (y42 = this.f33929b) == null || TextUtils.isEmpty(y42.h())) {
                return;
            }
            InterfaceC4296v4 interfaceC4296v4A = v.this.a(this.f33928a);
            Log.d(v.this.f33881c, "onAdProductInitFailed (message:" + this.f33930c + ")(" + this.f33928a + ")");
            if (interfaceC4296v4A != null) {
                interfaceC4296v4A.a(this.f33928a, this.f33929b.h(), this.f33930c);
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class p extends WebChromeClient {
        private p() {
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.Z.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new r());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            View view = v.this.f33896r;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            v vVar = v.this;
            vVar.f33897s.removeView(vVar.f33896r);
            v vVar2 = v.this;
            vVar2.f33896r = null;
            vVar2.f33897s.setVisibility(8);
            v.this.f33898t.onCustomViewHidden();
            v.this.Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.Z.setVisibility(8);
            if (v.this.f33896r != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.f33897s.addView(view);
            v vVar = v.this;
            vVar.f33896r = view;
            vVar.f33898t = customViewCallback;
            vVar.f33897s.setVisibility(0);
        }
    }

    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C4266t8.e f33934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f33935b;

        public q(C4266t8.e eVar, String str) {
            this.f33934a = eVar;
            this.f33935b = str;
        }

        public String a() {
            return this.f33935b;
        }

        public C4266t8.e b() {
            return this.f33934a;
        }
    }

    public class r extends WebViewClient {
        private r() {
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
            Logger.e(v.this.f33881c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public boolean safedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812(WebView webView, String str) {
            Context contextP = v.this.p();
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(contextP, new OpenUrlActivity.e(new k.c()).a(str).b(false).a(contextP));
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
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$r;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812 = safedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53132f, webView, str, zSafedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812);
            return zSafedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812;
        }
    }

    public class s {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33938a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f33939b;

            public a(String str, String str2) {
                this.f33938a = str;
                this.f33939b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f33938a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f33881c, "onRVShowFail(message:" + this.f33938a + ")");
                v.this.f33902x.b(this.f33939b, str);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33941a;

            public b(String str) {
                this.f33941a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f33881c, "onInterstitialInitSuccess()");
                v.this.f33903y.a(C4266t8.e.Interstitial, this.f33941a, (Z0) null);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33943a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f33944b;

            public c(String str, String str2) {
                this.f33943a = str;
                this.f33944b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f33943a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f33881c, "onInterstitialInitFail(message:" + str + ")");
                v.this.f33903y.a(C4266t8.e.Interstitial, this.f33944b, str);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4296v4 f33946a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4266t8.e f33947b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f33948c;

            public d(InterfaceC4296v4 interfaceC4296v4, C4266t8.e eVar, String str) {
                this.f33946a = interfaceC4296v4;
                this.f33947b = eVar;
                this.f33948c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f33946a.a(this.f33947b, this.f33948c);
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33950a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JSONObject f33951b;

            public e(String str, JSONObject jSONObject) {
                this.f33950a = str;
                this.f33951b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f33903y.a(this.f33950a, this.f33951b);
            }
        }

        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33953a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f33954b;

            public f(String str, String str2) {
                this.f33953a = str;
                this.f33954b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f33953a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f33903y.a(this.f33954b, str);
            }
        }

        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33956a;

            public g(String str) {
                this.f33956a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f33881c, "onBannerInitSuccess()");
                v.this.f33904z.a(C4266t8.e.Banner, this.f33956a, (Z0) null);
            }
        }

        public class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33958a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f33959b;

            public h(String str, String str2) {
                this.f33958a = str;
                this.f33959b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f33958a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f33881c, "onBannerInitFail(message:" + str + ")");
                v.this.f33904z.a(C4266t8.e.Banner, this.f33959b, str);
            }
        }

        public class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33961a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4107k8 f33962b;

            public i(String str, C4107k8 c4107k8) {
                this.f33961a = str;
                this.f33962b = c4107k8;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f33881c, "onBannerLoadSuccess()");
                v.this.f33904z.a(this.f33961a, this.f33962b);
            }
        }

        public class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33964a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f33965b;

            public j(String str, String str2) {
                this.f33964a = str;
                this.f33965b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f33881c, "onLoadBannerFail()");
                String str = this.f33964a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f33904z.c(this.f33965b, str);
            }
        }

        public class k implements Runnable {
            public k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.F();
            }
        }

        public class l implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33968a;

            public l(String str) {
                this.f33968a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (IronSourceVideoBridge.jsonObjectInit(this.f33968a).has(f.b.f33715b)) {
                        v.this.T.a(f.a.a(this.f33968a));
                    } else {
                        v.this.U.a(Nb.a(this.f33968a));
                    }
                } catch (JSONException e10) {
                    C4228r4.d().a(e10);
                    Logger.e(v.this.f33881c, "failed to parse received message");
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }

        public class m implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C4266t8.e f33970a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f33971b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f33972c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ JSONObject f33973d;

            public m(C4266t8.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f33970a = eVar;
                this.f33971b = str;
                this.f33972c = str2;
                this.f33973d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC4296v4 interfaceC4296v4A;
                C4266t8.e eVar = this.f33970a;
                if ((eVar == C4266t8.e.Interstitial || eVar == C4266t8.e.RewardedVideo || eVar == C4266t8.e.Banner) && (interfaceC4296v4A = v.this.a(eVar)) != null) {
                    interfaceC4296v4A.a(this.f33970a, this.f33971b, this.f33972c, this.f33973d);
                }
            }
        }

        public class n implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33975a;

            public n(String str) {
                this.f33975a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.f33881c, "omidAPI(" + this.f33975a + ")");
                    v.this.H.a(new C4042ge(this.f33975a).toString(), s.this.new w());
                } catch (Exception e10) {
                    C4228r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                    Logger.i(v.this.f33881c, "omidAPI failed with exception " + e10.getMessage());
                }
            }
        }

        public class o implements Runnable {
            public o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.B();
            }
        }

        public class p implements Runnable {
            public p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.removeJavascriptInterface(C3978d4.f31184e);
            }
        }

        public class q implements Runnable {
            public q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.getSettings().setMixedContentMode(0);
            }
        }

        public class r implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33980a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f33981b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Z0 f33982c;

            public r(int i10, String str, Z0 z02) {
                this.f33980a = i10;
                this.f33981b = str;
                this.f33982c = z02;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f33980a <= 0) {
                    v.this.f33902x.c(this.f33981b);
                } else {
                    Log.d(v.this.f33881c, "onRVInitSuccess()");
                    v.this.f33902x.a(C4266t8.e.RewardedVideo, this.f33981b, this.f33982c);
                }
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$s, reason: collision with other inner class name */
        public class RunnableC0403s implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33984a;

            public RunnableC0403s(String str) {
                this.f33984a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.M.a(IronSourceVideoBridge.jsonObjectInit(this.f33984a), s.this.new w());
                } catch (Exception e10) {
                    C4228r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                    Logger.i(v.this.f33881c, "fileSystemAPI failed with exception " + e10.getMessage());
                }
            }
        }

        public class t implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f33987b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f33988c;

            public t(String str, String str2, int i10) {
                this.f33986a = str;
                this.f33987b = str2;
                this.f33988c = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f33986a.equalsIgnoreCase(C4266t8.e.RewardedVideo.toString())) {
                    v.this.f33902x.a(this.f33987b, this.f33988c);
                }
            }
        }

        public class u implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33990a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f33991b;

            public u(String str, int i10) {
                this.f33990a = str;
                this.f33991b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f33903y.onInterstitialAdRewarded(this.f33990a, this.f33991b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$v, reason: collision with other inner class name */
        public class RunnableC0404v implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33993a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f33994b;

            public RunnableC0404v(String str, String str2) {
                this.f33993a = str;
                this.f33994b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f33993a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f33881c, "onRVInitFail(message:" + str + ")");
                v.this.f33902x.a(C4266t8.e.RewardedVideo, this.f33994b, str);
            }
        }

        public class w implements InterfaceC4218qa {
            public w() {
            }

            @Override // com.ironsource.InterfaceC4218qa
            public void a(boolean z10, @NotNull String str, C4042ge c4042ge) {
                c4042ge.b(z10 ? v.f33876g0 : v.f33877h0, str);
                v.this.a(c4042ge.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC4218qa
            public void a(boolean z10, @NotNull String str, @NotNull String str2) {
                C4042ge c4042ge = new C4042ge();
                c4042ge.b(z10 ? v.f33876g0 : v.f33877h0, str);
                c4042ge.b("data", str2);
                v.this.a(c4042ge.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC4218qa
            public void a(boolean z10, @NotNull String str, JSONObject jSONObject) {
                try {
                    jSONObject.put(z10 ? v.f33876g0 : v.f33877h0, str);
                    v.this.a(jSONObject.toString(), z10, (String) null, (String) null);
                } catch (JSONException e10) {
                    C4228r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }

        public s() {
        }

        private void a(String str, int i10) {
            Y4 y4A;
            v vVar = v.this;
            C4266t8.e eVar = C4266t8.e.Interstitial;
            if (vVar.r(eVar.toString()) && (y4A = v.this.G.a(eVar, str)) != null && y4A.k()) {
                v.this.b(new u(str, i10));
            }
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void a(String str, boolean z10) {
            Y4 y4A = v.this.G.a(C4266t8.e.Interstitial, str);
            if (y4A != null) {
                y4A.a(z10);
            }
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put(com.ironsource.sdk.controller.d.f33620h, v.this.B.f());
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                Logger.d(v.this.f33881c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (a(str)) {
                try {
                    JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
                    jSONObject.putOpt("testerABGroup", jSONObjectJsonObjectInit.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObjectJsonObjectInit.get("testFriendlyName"));
                } catch (JSONException e10) {
                    C4228r4.d().a(e10);
                    Logger.d(v.this.f33881c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str) {
            if (z10) {
                v.this.f33903y.c(C4266t8.e.Interstitial, str);
                v.this.f33903y.b(str);
            }
            a(str, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str, String str2) {
            if (z10) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f33903y.d(str2, str);
            }
            a(str2, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            try {
                InterfaceC4276u1 interfaceC4276u1A = InterfaceC4276u1.a(str);
                v vVar = v.this;
                C4242s1.a aVarA = vVar.N.a(vVar.Z.getContext(), interfaceC4276u1A);
                v.this.i(v.this.e(aVarA.f(), aVarA.i().toString()));
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(C3978d4.a.f31212h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                A8.a(C4024fe.f31721p, new C4300v8().a(G5.A, e10.getMessage()).a());
                Logger.d(v.this.f33881c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.W) {
                return;
            }
            a(jSONObject);
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
            com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53132f);
            context.startActivity(intent);
        }

        public boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains(Y1.f30690f)) {
                return false;
            }
            try {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
                if (jSONObjectJsonObjectInit.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObjectJsonObjectInit.getString("testFriendlyName").isEmpty();
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                return false;
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.f33881c, "adClicked(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d(C3978d4.i.f31349m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            C4266t8.e eVarG = v.this.g(strD);
            InterfaceC4296v4 interfaceC4296v4A = v.this.a(eVarG);
            if (eVarG == null || interfaceC4296v4A == null) {
                return;
            }
            v.this.b(new d(interfaceC4296v4A, eVarG, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(v.this.f33882d, "adCredited(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d(C3978d4.i.f31345k);
            int i10 = strD != null ? Integer.parseInt(strD) : 0;
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            String strD2 = c4042ge.d(C3978d4.i.f31349m);
            if (TextUtils.isEmpty(strD2)) {
                Log.d(v.this.f33882d, "adCredited | product type is missing");
            }
            if (C4266t8.e.Interstitial.toString().equalsIgnoreCase(strD2)) {
                a(strFetchDemandSourceId, i10);
            } else if (v.this.r(strD2)) {
                v.this.b(new t(strD2, strFetchDemandSourceId, i10));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.i(v.this.f33881c, "adUnitsReady(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4042ge(str));
            Z0 z02 = new Z0(str);
            if (!z02.g()) {
                v.this.a(str, false, C3978d4.c.f31250r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String strD = z02.d();
            if (C4266t8.e.RewardedVideo.toString().equalsIgnoreCase(strD) && v.this.r(strD)) {
                v.this.b(new r(Integer.parseInt(z02.c()), strFetchDemandSourceId, z02));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                Logger.i(v.this.f33881c, "adViewAPI(" + str + ")");
                v.this.L.a(new C4042ge(str).toString(), new w());
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f33881c, "adViewAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void androidSandboxApi(final String str) {
            V7.f30593a.b(new Runnable() { // from class: com.ironsource.sdk.controller.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33833b.b(str);
                }
            });
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.f33881c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        public void c(String str) {
            v.this.i(v.this.a(C3978d4.h.f31298d, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C4266t8.e eVarG;
            try {
                Logger.i(v.this.f33881c, "cleanAdInstance(" + str + ")");
                C4042ge c4042ge = new C4042ge(str);
                String strD = c4042ge.d(C3978d4.i.f31349m);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
                if (TextUtils.isEmpty(strFetchDemandSourceId) || (eVarG = v.this.g(strD)) == null) {
                    return;
                }
                v.this.G.b(eVarG, strFetchDemandSourceId);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> arrayListA = C4038ga.e().a();
                C4042ge c4042ge = new C4042ge(str);
                if (!arrayListA.isEmpty()) {
                    c4042ge.b(C3978d4.i.f31372x0, arrayListA.toString());
                }
                v.this.a(c4042ge.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        public void d(String str) {
            v.this.i(v.this.a(C3978d4.h.f31300e, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                Logger.i(v.this.f33881c, "deleteFile(" + str + ")");
                C4042ge c4042ge = new C4042ge(str);
                String strD = c4042ge.d(C3978d4.i.f31327b);
                String strD2 = c4042ge.d("path");
                if (strD2 != null && !TextUtils.isEmpty(strD)) {
                    C8 c82 = new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD2), strD);
                    IronSourceStorageUtils.ensurePathSafety(c82, v.this.A);
                    if (!c82.exists()) {
                        v.this.a(str, false, C3978d4.c.f31238f, "1");
                        return;
                    } else {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(c82), (String) null, (String) null);
                        return;
                    }
                }
                v.this.a(str, false, C3978d4.c.f31239g, "1");
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                Logger.i(v.this.f33881c, "deleteFolder(" + str + ")");
                String strD = new C4042ge(str).d("path");
                if (strD == null) {
                    v.this.a(str, false, C3978d4.c.f31239g, "1");
                    return;
                }
                C8 c82 = new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD));
                IronSourceStorageUtils.ensurePathSafety(c82, v.this.A);
                if (!c82.exists()) {
                    v.this.a(str, false, C3978d4.c.f31237e, "1");
                } else {
                    v.this.a(str, IronSourceStorageUtils.deleteFolder(c82.getPath()), (String) null, (String) null);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void destroyInlineStore(String str) {
            Logger.i(v.this.f33881c, "destroyInlineStore() called");
            try {
                a.AbstractC0711a abstractC0711aA = new com.unity3d.ironsourceads.internal.services.b().a(v.this.p(), EnumC4144m9.f32293b.a(new C4042ge(str).a(C3978d4.f.f31283e, EnumC4144m9.APP_ACTIVITY.b())));
                if (abstractC0711aA instanceof a.AbstractC0711a.C0712a) {
                    v.this.a(str, false, ((a.AbstractC0711a.C0712a) abstractC0711aA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                Logger.i(v.this.f33881c, "deviceDataAPI(" + str + ")");
                v.this.K.a(new C4042ge(str).toString(), new w());
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f33881c, "deviceDataAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            Logger.i(v.this.f33881c, "displayWebView(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            C4042ge c4042ge = new C4042ge(str);
            boolean zBooleanValue = ((Boolean) c4042ge.b("display")).booleanValue();
            String strD = c4042ge.d(C3978d4.i.f31349m);
            boolean zC = c4042ge.c(C3978d4.i.f31365u);
            String strD2 = c4042ge.d("adViewId");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            boolean zC2 = c4042ge.c(C3978d4.i.f31376z0);
            if (!zBooleanValue) {
                v.this.a(EnumC0405v.Gone);
                v.this.n();
                return;
            }
            v.this.F = c4042ge.c("immersive");
            boolean zC3 = c4042ge.c(C3978d4.i.f31373y);
            EnumC0405v enumC0405vU = v.this.u();
            EnumC0405v enumC0405v = EnumC0405v.Display;
            if (enumC0405vU == enumC0405v) {
                Logger.i(v.this.f33881c, "State: " + v.this.f33900v);
                return;
            }
            v.this.a(enumC0405v);
            Logger.i(v.this.f33881c, "State: " + v.this.f33900v);
            Context contextP = v.this.p();
            String strS = v.this.s();
            int iK = v.this.X.K(contextP);
            if (zC) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(contextP);
                hVar.addView(v.this.f33899u);
                hVar.a(v.this);
                return;
            }
            Intent intent = zC3 ? new Intent(contextP, (Class<?>) InterstitialActivity.class) : new Intent(contextP, (Class<?>) ControllerActivity.class);
            C4266t8.e eVar = C4266t8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strD)) {
                if ("application".equals(strS)) {
                    strS = SDKUtils.translateRequestedOrientation(v.this.X.N(contextP));
                }
                intent.putExtra(C3978d4.i.f31349m, eVar.toString());
                v.this.D.a(eVar.ordinal());
                v.this.D.f(strFetchDemandSourceId);
                if (v.this.r(eVar.toString())) {
                    v.this.f33902x.c(eVar, strFetchDemandSourceId);
                }
            } else {
                C4266t8.e eVar2 = C4266t8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(strD)) {
                    if ("application".equals(strS)) {
                        strS = SDKUtils.translateRequestedOrientation(v.this.X.N(contextP));
                    }
                    intent.putExtra(C3978d4.i.f31349m, eVar2.toString());
                }
            }
            if (strD2 != null) {
                intent.putExtra("adViewId", strD2);
            }
            intent.putExtra(C3978d4.i.f31376z0, zC2);
            intent.setFlags(536870912);
            intent.putExtra("immersive", v.this.F);
            intent.putExtra(C3978d4.i.A, strS);
            intent.putExtra(C3978d4.i.B, iK);
            v vVar = v.this;
            vVar.f33888j = new q(vVar.g(strD), strFetchDemandSourceId);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(contextP, intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            try {
                Logger.i(v.this.f33881c, "dsSharedSignalsAPI(" + str + ")");
                v.this.O.a(new C4042ge(str).toString(), new w());
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f33881c, "dsSharedSignalsAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            Logger.i(v.this.f33881c, "fileSystemAPI(" + str + ")");
            v.this.a(new RunnableC0403s(str));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.D(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getApplicationInfo("
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.h0(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = com.ironsource.sdk.controller.v.f0(r1, r5)
                com.ironsource.ge r2 = new com.ironsource.ge
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(r2)
                com.ironsource.sdk.controller.v r3 = com.ironsource.sdk.controller.v.this
                java.lang.Object[] r5 = com.ironsource.sdk.controller.v.l0(r3, r5, r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L58
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L5f
                r0 = r1
                goto L60
            L58:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L5f
                goto L60
            L5f:
                r0 = 0
            L60:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L75
                com.ironsource.sdk.controller.v r5 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.v.a0(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                com.ironsource.sdk.controller.v.n0(r0, r5)
            L75:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.s.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            Logger.i(v.this.f33881c, "getCachedFilesMap(" + str + ")");
            String strE = v.this.e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            C4042ge c4042ge = new C4042ge(str);
            if (!c4042ge.a("path")) {
                v.this.a(str, false, C3978d4.c.f31251s, (String) null);
                return;
            }
            String str2 = (String) c4042ge.b("path");
            if (!IronSourceStorageUtils.isPathExist(v.this.A, str2)) {
                v.this.a(str, false, C3978d4.c.f31252t, (String) null);
                return;
            }
            v.this.i(v.this.a(strE, IronSourceStorageUtils.getCachedFilesMap(v.this.A, str2), C3978d4.h.f31315s, C3978d4.h.f31314r));
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String strE;
            Logger.i(v.this.f33881c, "getConnectivityInfo(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d(v.f33876g0);
            String strD2 = c4042ge.d(v.f33877h0);
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            v vVar = v.this;
            X3 x32 = vVar.R;
            if (x32 != null) {
                jSONObjectJsonObjectInit = x32.a(vVar.Z.getContext());
            }
            if (jSONObjectJsonObjectInit.length() > 0) {
                strE = v.this.e(strD, jSONObjectJsonObjectInit.toString());
            } else {
                strE = v.this.e(strD2, v.this.a("errMsg", C3978d4.c.A, null, null, null, null, null, null, null, false));
            }
            v.this.i(strE);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.i(v.this.f33881c, "getControllerConfig(" + str + ")");
            String strD = new C4042ge(str).d(v.f33876g0);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            v.this.i(v.this.e(strD, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) {
            String strD;
            Logger.i(v.this.f33881c, "getMediationState(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD2 = c4042ge.d("demandSourceName");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            String strD3 = c4042ge.d(C3978d4.i.f31349m);
            if (strD3 == null || strD2 == null) {
                return;
            }
            try {
                C4266t8.e productType = SDKUtils.getProductType(strD3);
                if (productType != null) {
                    Y4 y4A = v.this.G.a(productType, strFetchDemandSourceId);
                    JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                    jSONObjectJsonObjectInit.put(C3978d4.i.f31349m, strD3);
                    jSONObjectJsonObjectInit.put("demandSourceName", strD2);
                    jSONObjectJsonObjectInit.put("demandSourceId", strFetchDemandSourceId);
                    if (y4A == null || y4A.a(-1)) {
                        strD = v.this.d(str);
                    } else {
                        strD = v.this.e(str);
                        jSONObjectJsonObjectInit.put("state", y4A.j());
                    }
                    a(strD, jSONObjectJsonObjectInit.toString());
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.D(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getDeviceStatus("
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.h0(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                java.lang.String r5 = com.ironsource.sdk.controller.v.f0(r1, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                com.ironsource.ja r2 = com.ironsource.sdk.controller.v.A(r1)
                android.content.Context r2 = r2.getContext()
                java.lang.Object[] r1 = com.ironsource.sdk.controller.v.g0(r1, r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L51
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L58
                r0 = r5
                goto L59
            L51:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L58
                goto L59
            L58:
                r0 = 0
            L59:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L6e
                com.ironsource.sdk.controller.v r5 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.v.a0(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                com.ironsource.sdk.controller.v.n0(r0, r5)
            L6e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.s.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            Logger.i(v.this.f33881c, "getDeviceVolume(" + str + ")");
            try {
                Context context = v.this.Z.getContext();
                float fA = C3961c5.b(context).a(context);
                C4042ge c4042ge = new C4042ge(str);
                c4042ge.b(C3978d4.j.P, String.valueOf(fA));
                v.this.a(c4042ge.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.i(v.this.f33881c, "getInitSummery(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            c4042ge.a(C3978d4.j.f31414s0, v.this.S);
            v.this.a(c4042ge.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            A8.a(C4024fe.f31731z, new C4300v8().a(G5.f29410y, str).a());
            String strE = v.this.e(str);
            String string = SDKUtils.getOrientation(v.this.Z.getContext()).toString();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, string, C3978d4.h.X, C3978d4.h.Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.i(v.this.f33881c, "getUserData(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            if (!c4042ge.a("key")) {
                v.this.a(str, false, C3978d4.c.F, (String) null);
                return;
            }
            String strE = v.this.e(str);
            String strD = c4042ge.d("key");
            v.this.i(v.this.e(strE, v.this.a(strD, C4038ga.e().a(strD), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                Logger.i(v.this.f33881c, "iabTokenAPI(" + str + ")");
                v.this.J.a(new C4042ge(str).toString(), new w());
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f33881c, "iabTokenAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.f33881c, "initController(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            CountDownTimer countDownTimer = v.this.f33891m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.f33891m = null;
            }
            if (c4042ge.a(C3978d4.i.f31357q)) {
                String strD = c4042ge.d(C3978d4.i.f31357q);
                if (C3978d4.i.f31361s.equalsIgnoreCase(strD)) {
                    v vVar = v.this;
                    vVar.f33887i = true;
                    vVar.Q.d();
                } else {
                    if (C3978d4.i.f31359r.equalsIgnoreCase(strD)) {
                        v.this.Q.c();
                        return;
                    }
                    if (!C3978d4.i.f31363t.equalsIgnoreCase(strD)) {
                        Logger.i(v.this.f33881c, "No STAGE mentioned! should not get here!");
                        return;
                    }
                    String strD2 = c4042ge.d("errMsg");
                    v.this.Q.c("controller js failed to initialize : " + strD2);
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            Logger.i(v.this.f33881c, "onAdWindowsClosed(" + str + ")");
            v.this.D.a();
            v.this.D.f(null);
            v.this.f33888j = null;
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d(C3978d4.i.f31349m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            C4266t8.e eVarG = v.this.g(strD);
            Log.d(v.this.f33882d, "onAdClosed() with type " + eVarG);
            if (v.this.r(strD)) {
                v.this.a(eVarG, strFetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(v.this.f33881c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            Logger.i(v.this.f33881c, "onGetApplicationInfoFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            Logger.i(v.this.f33881c, "onGetApplicationInfoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            Logger.i(v.this.f33881c, "onGetCachedFilesMapFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            Logger.i(v.this.f33881c, "onGetCachedFilesMapSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            Logger.i(v.this.f33881c, "onGetDeviceStatusFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            Logger.i(v.this.f33881c, "onGetDeviceStatusSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.f33881c, "onInitBannerFail(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f33881c, "onInitBannerFail failed with no demand source");
                return;
            }
            Z4 z42 = v.this.G;
            C4266t8.e eVar = C4266t8.e.Banner;
            Y4 y4A = z42.a(eVar, strFetchDemandSourceId);
            if (y4A != null) {
                y4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new h(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.f33881c, "onInitBannerSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4042ge(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f33881c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.r(C4266t8.e.Banner.toString())) {
                v.this.b(new g(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.f33881c, "onInitInterstitialFail(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f33881c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            Z4 z42 = v.this.G;
            C4266t8.e eVar = C4266t8.e.Interstitial;
            Y4 y4A = z42.a(eVar, strFetchDemandSourceId);
            if (y4A != null) {
                y4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new c(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.f33881c, "onInitInterstitialSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4042ge(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f33881c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.r(C4266t8.e.Interstitial.toString())) {
                v.this.b(new b(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.f33881c, "onInitRewardedVideoFail(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            Z4 z42 = v.this.G;
            C4266t8.e eVar = C4266t8.e.RewardedVideo;
            Y4 y4A = z42.a(eVar, strFetchDemandSourceId);
            if (y4A != null) {
                y4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new RunnableC0404v(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.f33881c, "onLoadBannerFail()");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(strFetchDemandSourceId) && v.this.r(C4266t8.e.Banner.toString())) {
                v.this.b(new j(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.f33881c, "onLoadBannerSuccess()");
            C4042ge c4042ge = new C4042ge(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            String strD = c4042ge.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            K8 k8A = C4216q8.a().a(strD);
            if (k8A == null) {
                v.this.f33904z.c(strFetchDemandSourceId, "not found view for the current adViewId= " + strD);
                return;
            }
            if (k8A instanceof C4107k8) {
                C4107k8 c4107k8 = (C4107k8) k8A;
                if (v.this.r(C4266t8.e.Banner.toString())) {
                    v.this.b(new i(strFetchDemandSourceId, c4107k8));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.f33881c, "onLoadInterstitialFail(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            a(strFetchDemandSourceId, false);
            if (v.this.r(C4266t8.e.Interstitial.toString())) {
                v.this.b(new f(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.f33881c, "onLoadInterstitialSuccess(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            JSONObject jSONObjectA = c4042ge.a();
            a(strFetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.r(C4266t8.e.Interstitial.toString())) {
                v.this.b(new e(strFetchDemandSourceId, jSONObjectA));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            Logger.i(v.this.f33881c, "onReceivedMessage(" + str + ")");
            V7.f30593a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.f33881c, "onShowInterstitialFail(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            final String strD = c4042ge.d("errMsg");
            final String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            final boolean zR = v.this.r(C4266t8.e.Interstitial.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33799b.a(zR, strD, strFetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            Logger.i(v.this.f33881c, "onShowInterstitialSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            final String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4042ge(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f33881c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C3921a1 c3921a1 = v.this.D;
            C4266t8.e eVar = C4266t8.e.Interstitial;
            c3921a1.a(eVar.ordinal());
            v.this.D.f(strFetchDemandSourceId);
            final boolean zR = v.this.r(eVar.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33820b.a(zR, strFetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.f33881c, "onShowRewardedVideoFail(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
            if (v.this.r(C4266t8.e.RewardedVideo.toString())) {
                v.this.b(new a(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            Logger.i(v.this.f33881c, "onShowRewardedVideoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(v.this.f33881c, "onVideoStatusChanged(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d(C3978d4.i.f31349m);
            if (v.this.C == null || TextUtils.isEmpty(strD)) {
                return;
            }
            String strD2 = c4042ge.d("status");
            if (C3978d4.i.f31332d0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStarted();
                return;
            }
            if ("paused".equalsIgnoreCase(strD2)) {
                v.this.C.onVideoPaused();
                return;
            }
            if ("playing".equalsIgnoreCase(strD2)) {
                v.this.C.onVideoResumed();
                return;
            }
            if (C3978d4.i.f31338g0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoEnded();
                return;
            }
            if (C3978d4.i.f31340h0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStopped();
                return;
            }
            Logger.i(v.this.f33881c, "onVideoStatusChanged: unknown status: " + strD2);
        }

        @JavascriptInterface
        public void openInlineStore(String str) {
            try {
                Logger.i(v.this.f33881c, "openInlineStore(" + str + ")");
                C4042ge c4042ge = new C4042ge(str);
                a.AbstractC0711a abstractC0711aA = new com.unity3d.ironsourceads.internal.services.b().a(v.this.p(), new C4108k9(c4042ge.d("url"), c4042ge.d(C3978d4.f.f31281c), EnumC4144m9.f32293b.a(c4042ge.a(C3978d4.f.f31283e, EnumC4144m9.APP_ACTIVITY.b())), (!c4042ge.a(C3978d4.f.f31282d) || c4042ge.e(C3978d4.f.f31282d)) ? null : (JSONObject) c4042ge.b(C3978d4.f.f31282d)));
                if (abstractC0711aA instanceof a.AbstractC0711a.C0712a) {
                    v.this.a(str, false, ((a.AbstractC0711a.C0712a) abstractC0711aA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.f33881c, "openUrl(" + str + ")");
                C4042ge c4042ge = new C4042ge(str);
                p.c cVarA = new p.a(c4042ge.d("method"), new Sc(v.this.F, 805306368)).a(c4042ge.c(C3978d4.i.L0) ? v.this.Z.getContext() : v.this.p(), new Rc(c4042ge.d("url"), c4042ge.d("package_name")));
                if (cVarA instanceof p.c.a) {
                    v.this.a(str, false, ((p.c.a) cVarA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                Logger.i(v.this.f33881c, "permissionsAPI(" + str + ")");
                v.this.I.a(new C4042ge(str).toString(), new w());
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f33881c, "permissionsAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            try {
                Logger.i(v.this.f33881c, "postAdEventNotification(" + str + ")");
                C4042ge c4042ge = new C4042ge(str);
                String strD = c4042ge.d(C3978d4.i.f31344j0);
                if (TextUtils.isEmpty(strD)) {
                    v.this.a(str, false, C3978d4.c.f31255w, (String) null);
                    return;
                }
                String strD2 = c4042ge.d(C3978d4.i.f31346k0);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4042ge);
                String str2 = !TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strD2;
                JSONObject jSONObject = (JSONObject) c4042ge.b(C3978d4.i.f31348l0);
                String strD3 = c4042ge.d(C3978d4.i.f31349m);
                C4266t8.e eVarG = v.this.g(strD3);
                if (!v.this.r(strD3)) {
                    v.this.a(str, false, C3978d4.c.f31254v, (String) null);
                    return;
                }
                String strE = v.this.e(str);
                if (!TextUtils.isEmpty(strE)) {
                    v.this.i(v.this.a(strE, v.this.a(C3978d4.i.f31349m, strD3, C3978d4.i.f31344j0, strD, "demandSourceName", strD2, "demandSourceId", str2, null, false), C3978d4.h.f31297c0, C3978d4.h.f31299d0));
                }
                v.this.b(new m(eVarG, str2, strD, jSONObject));
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            Logger.i(v.this.f33881c, "removeCloseEventHandler(" + str + ")");
            CountDownTimer countDownTimer = v.this.f33890l;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            v.this.f33889k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(v.this.f33881c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                Logger.i(v.this.f33881c, "saveFile(" + str + ")");
                C4042ge c4042ge = new C4042ge(str);
                String strD = c4042ge.d("path");
                String strD2 = c4042ge.d(C3978d4.i.f31327b);
                if (TextUtils.isEmpty(strD2)) {
                    v.this.a(str, false, C3978d4.c.f31239g, "1");
                    return;
                }
                C8 c82 = new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD), SDKUtils.getFileName(strD2));
                IronSourceStorageUtils.ensurePathSafety(c82, v.this.A);
                v vVar = v.this;
                if (vVar.X.a(vVar.A) <= 0) {
                    v.this.a(str, false, C4014f4.A, (String) null);
                    return;
                }
                if (c82.exists()) {
                    v.this.a(str, false, C4014f4.f31687z, (String) null);
                    return;
                }
                if (!Z3.h(v.this.Z.getContext())) {
                    v.this.a(str, false, C4014f4.C, (String) null);
                    return;
                }
                v.this.a(str, true, (String) null, (String) null);
                v.this.f33886h.a(c82, strD2, c4042ge.a("connectionTimeout", 0), c4042ge.a("readTimeout", 0));
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.f33881c, "setBackButtonState(" + str + ")");
            C4038ga.e().c(new C4042ge(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.f33881c, "setForceClose(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            String strD = c4042ge.d("width");
            String strD2 = c4042ge.d("height");
            v.this.f33892n = Integer.parseInt(strD);
            v.this.f33893o = Integer.parseInt(strD2);
            v.this.f33894p = c4042ge.d(C3978d4.i.L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            Logger.i(v.this.f33881c, "setMixedContentAlwaysAllow(" + str + ")");
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.f33881c, "setOrientation(" + str + ")");
                String strD = new C4042ge(str).d("orientation");
                v.this.o(strD);
                v vVar = v.this;
                if (vVar.f33879a0 != null) {
                    v.this.f33879a0.onOrientationChanged(strD, vVar.X.K(vVar.Z.getContext()));
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.f33881c, "setStoreSearchKeys(" + str + ")");
            C4038ga.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.f33881c, "setUserData(" + str + ")");
            C4042ge c4042ge = new C4042ge(str);
            if (!c4042ge.a("key")) {
                v.this.a(str, false, C3978d4.c.F, (String) null);
                return;
            }
            if (!c4042ge.a("value")) {
                v.this.a(str, false, C3978d4.c.G, (String) null);
                return;
            }
            String strD = c4042ge.d("key");
            String strD2 = c4042ge.d("value");
            C4038ga.e().a(strD, strD2);
            v.this.i(v.this.e(v.this.e(str), v.this.a(strD, strD2, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            Logger.i(v.this.f33881c, "setWebviewBackgroundColor(" + str + ")");
            v.this.q(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            Logger.i(v.this.f33881c, "stillAlive(" + str + ")");
            v.this.f33880b.a();
        }
    }

    public interface t {
        void a(String str, C4266t8.e eVar, Y4 y42);
    }

    public static class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f33997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f33998b;
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    public enum EnumC0405v {
        Display,
        Gone
    }

    public class w extends WebViewClient {
        private w() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53132f, webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$w;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53132f, webView, str);
            safedk_v$w_onPageFinished_54a02eed08a1fb59e53d8035ae586037(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            com.ironsource.sdk.controller.c cVar;
            Logger.i("onReceivedError", str2 + Z7.f30794r + str);
            if (str2.contains(C3978d4.f31185f) && (cVar = v.this.Q) != null) {
                cVar.c("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i10 + ")");
            }
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(v.this.f33881c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            com.ironsource.sdk.controller.c cVar = v.this.Q;
            if (cVar != null) {
                cVar.b(str);
            }
            v.this.v();
            return true;
        }

        public void safedk_v$w_onPageFinished_54a02eed08a1fb59e53d8035ae586037(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                v.this.A();
            }
            super.onPageFinished(webView, str);
        }

        public WebResourceResponse safedk_v$w_shouldInterceptRequest_db9d825c1b199e8d268f5f6da9a7d7c1(WebView webView, String str) {
            boolean zContains;
            Logger.i("shouldInterceptRequest", str);
            try {
                zContains = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException e10) {
                C4228r4.d().a(e10);
                zContains = false;
            }
            if (zContains) {
                String str2 = AdPayload.FILE_SCHEME + v.this.A + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException e11) {
                    C4228r4.d().a(e11);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public boolean safedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (v.this.h(str)) {
                    v.this.z();
                    return true;
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53132f, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$w;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53132f, webView, str, safedk_v$w_shouldInterceptRequest_db9d825c1b199e8d268f5f6da9a7d7c1(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$w;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040 = safedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53132f, webView, str, zSafedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040);
            return zSafedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(Context context, Z4 z42, C4032g4 c4032g4, com.ironsource.sdk.controller.c cVar, V7 v72, int i10, C4086j5 c4086j5, String str, l.a aVar, l.b bVar, String str2, String str3) throws Throwable {
        CountDownLatch countDownLatch;
        Object[] objArr = 0;
        p pVar = new p();
        this.f33895q = pVar;
        boolean zE = Lb.U().g().e();
        if (zE) {
            countDownLatch = new CountDownLatch(1);
            a(context, v72, countDownLatch);
        } else {
            countDownLatch = null;
        }
        this.X = Lb.U().i();
        if (!zE) {
            this.Z = new C4091ja(context, new InterfaceC4285ua.a());
        }
        Logger.i(this.f33881c, "C'tor");
        this.Y = c4032g4;
        this.Q = cVar;
        this.f33878a = v72;
        this.G = z42;
        if (!zE) {
            a(context, this.Z);
        }
        this.A = str;
        this.D = new C3921a1();
        this.S = IronSourceVideoBridge.jsonObjectInit();
        this.f33886h = c4086j5;
        this.T = aVar;
        this.U = bVar;
        boolean zOptBoolean = SDKUtils.getNetworkConfiguration().optBoolean(C3978d4.a.f31213i, false);
        this.W = zOptBoolean;
        if (zOptBoolean) {
            this.V = new C4177o4(new C4121l4(SDKUtils.getControllerUrl(), this.A, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new C3969cd(SDKUtils.getControllerUrl())), new sn.l() { // from class: com.ironsource.sdk.controller.k0
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return this.f33760b.d((C8) obj);
                }
            }, c4086j5, new InterfaceC4262t4.a());
        } else {
            c4086j5.a(this);
            this.B = new com.ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.A, SDKUtils.getControllerUrl(), c4086j5);
        }
        if (!zE) {
            this.Z.setWebViewClient(new w());
            this.Z.setWebChromeClient(pVar);
            Og.a(this.Z);
            a(this.Z);
            this.Z.setDownloadListener(this);
        }
        this.R = c(context);
        b(context);
        b(i10);
        this.f33884f = str2;
        this.f33885g = str3;
        if (zE) {
            try {
                countDownLatch.await();
                if (this.Z == null) {
                    IronLog.INTERNAL.error("WebView initialization failed");
                    this.Q.c("WebView initialization failed");
                    return;
                }
            } catch (InterruptedException e10) {
                IronLog.INTERNAL.error("WebView initialization was interrupted", e10);
                C4228r4.d().a(e10);
                Thread.currentThread().interrupt();
                this.Q.c("WebView initialization was interrupted");
                return;
            }
        }
        this.f33880b = InterfaceC4103k4.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    @SuppressLint({"NewApi"})
    private void G() {
    }

    private u a(C4266t8.e eVar, Y4 y42) {
        u uVar = new u();
        if (eVar == C4266t8.e.RewardedVideo || eVar == C4266t8.e.Interstitial || eVar == C4266t8.e.Banner) {
            HashMap map = new HashMap();
            map.put(C3978d4.j.f31389g, this.f33884f);
            if (!TextUtils.isEmpty(this.f33885g)) {
                map.put(C3978d4.j.f31387f, this.f33885g);
            }
            if (y42 != null) {
                if (y42.g() != null) {
                    map.putAll(y42.g());
                    map.put(C3978d4.i.f31374y0, String.valueOf(M.f29819a.c(y42.h())));
                }
                map.put("demandSourceName", y42.f());
                map.put("demandSourceId", y42.h());
            }
            String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
            C3978d4.h hVarA = C3978d4.h.a(eVar);
            String strA = a(hVarA.f31323a, strFlatMapToJsonAsString, hVarA.f31324b, hVarA.f31325c);
            uVar.f33997a = hVarA.f31323a;
            uVar.f33998b = strA;
        }
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC4296v4 a(C4266t8.e eVar) {
        if (eVar == C4266t8.e.Interstitial) {
            return this.f33903y;
        }
        if (eVar == C4266t8.e.RewardedVideo) {
            return this.f33902x;
        }
        if (eVar == C4266t8.e.Banner) {
            return this.f33904z;
        }
        return null;
    }

    private String a(C4266t8.e eVar, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String strOptString = jSONObject.optString("demandSourceName");
        String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        Y4 y4A = this.G.a(eVar, strFetchDemandSourceId);
        if (y4A != null) {
            if (y4A.g() != null) {
                map.putAll(y4A.g());
            }
            if (!TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C3978d4.h hVarB = C3978d4.h.b(eVar);
        return a(hVarB.f31323a, strFlatMapToJsonAsString, hVarB.f31324b, hVarB.f31325c);
    }

    private String a(String str, String str2) {
        return a(str, str2, C3978d4.i.f31337g);
    }

    private String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            return IronSourceVideoBridge.jsonObjectInit(str).put(str3, str2).toString();
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new m.a(str, str2, str3, str4).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObjectJsonObjectInit.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObjectJsonObjectInit.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObjectJsonObjectInit.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObjectJsonObjectInit.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObjectJsonObjectInit.put(str9, z10);
            }
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit.toString();
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f33899u = new FrameLayout(context);
        this.f33897s = new FrameLayout(context);
        this.f33897s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f33897s.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.f33899u.addView(this.f33897s, layoutParams);
        this.f33899u.addView(frameLayout);
    }

    private void a(final Context context, V7 v72, final CountDownLatch countDownLatch) {
        v72.d(new Runnable() { // from class: com.ironsource.sdk.controller.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f33731b.a(context, countDownLatch);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, CountDownLatch countDownLatch) {
        try {
            try {
                this.Z = new C4091ja(context, new InterfaceC4285ua.a());
                a(context, this.Z);
                this.Z.setWebViewClient(new w());
                this.Z.setWebChromeClient(this.f33895q);
                Og.a(this.Z);
                a(this.Z);
                this.Z.setDownloadListener(this);
            } catch (Exception e10) {
                this.Q.c("Failed to create WebView on UI thread");
                IronLog.INTERNAL.error("Failed to create WebView on UI thread", e10);
                C4228r4.d().a(e10);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    @SuppressLint({"NewApi"})
    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"AddJavascriptInterface"})
    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        IronSourceNetworkBridge.onAddedJavascriptInterface(webView, a(sVar), C3978d4.f31183d);
        IronSourceNetworkBridge.onAddedJavascriptInterface(webView, b(sVar), C3978d4.f31184e);
    }

    private void a(Y4 y42, Map<String, String> map) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, y42.b()});
        if (map.containsKey("adm")) {
            this.f33880b.a(new InterfaceC4103k4.d() { // from class: com.ironsource.sdk.controller.h0
                @Override // com.ironsource.InterfaceC4103k4.d
                public final void a(InterfaceC3999e7 interfaceC3999e7) {
                    this.f33739a.a(interfaceC3999e7);
                }
            });
        }
        this.D.d(y42.h(), true);
        i(a(C3978d4.h.E, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C3978d4.h.F, C3978d4.h.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC3945b7 interfaceC3945b7) {
        try {
            this.Q.a(interfaceC3945b7);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            Logger.e(this.f33881c, "handleLoadAd: " + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC3999e7 interfaceC3999e7) {
        interfaceC3999e7.a(new InterfaceC4017f7() { // from class: com.ironsource.sdk.controller.j0
            @Override // com.ironsource.InterfaceC4017f7
            public final void a(InterfaceC3945b7 interfaceC3945b7) {
                this.f33759b.a(interfaceC3945b7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C4266t8.e eVar, Y4 y42) {
        if (r(eVar.toString())) {
            b(new n(eVar, y42, str));
        }
    }

    private void a(String str, C4266t8.e eVar, Y4 y42, t tVar) {
        if (TextUtils.isEmpty(str)) {
            tVar.a("Application key are missing", eVar, y42);
        } else {
            i(a(eVar, y42).f33998b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z10, String str2, String str3) {
        String strD = new C4042ge(str).d(z10 ? f33876g0 : f33877h0);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        i(e(strD, a(b(str, str2), str3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean zOptBoolean = jSONObject.optBoolean("inspectWebview");
        if (zOptBoolean) {
            WebView.setWebContentsDebuggingEnabled(zOptBoolean);
        }
    }

    private boolean a(File file) {
        return C4085j4.a().contains(file.getName());
    }

    private String b(String str) {
        String str2 = this.A + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    private X3 c(Context context) {
        return new g(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    private String c(String str, String str2, String str3) {
        return new m.a(str, null, str2, str3).a();
    }

    private void c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), C3951bd.e(this.Z.getContext()));
        jSONObject.put(SDKUtils.encodeString(C3978d4.j.f31408p0), SDKUtils.encodeString(C3951bd.b(this.Z.getContext())));
    }

    private boolean c(C8 c82) {
        int iSaveFile;
        boolean zCopyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.Z.getContext(), c82);
        if (!zCopyFileFromBundleToStorage) {
            return false;
        }
        byte[] bArrA = C4085j4.a(this.Z.getContext(), C3978d4.f31186g);
        String strA = C4085j4.a(this.Z.getContext());
        if (strA != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c82.getParent());
            String str = File.separator;
            sb2.append(str);
            sb2.append("controller_");
            sb2.append(strA);
            sb2.append(str);
            sb2.append(C3978d4.f31186g);
            String string = sb2.toString();
            if (bArrA == null || bArrA.length == 0) {
                return zCopyFileFromBundleToStorage;
            }
            try {
                iSaveFile = IronSourceStorageUtils.saveFile(bArrA, string);
            } catch (Exception e10) {
                IronLog.INTERNAL.error("exception: " + e10.getMessage());
                zCopyFileFromBundleToStorage = false;
                iSaveFile = 0;
            }
            if (iSaveFile != 0) {
                return zCopyFileFromBundleToStorage;
            }
            IronLog.INTERNAL.verbose("failed to read bytes for " + c82.getName());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object d(C8 c82) {
        this.f33886h.a(this);
        if (c82 == null || !c82.exists()) {
            a(new C8(C3978d4.f31185f), new C4283u8(1, "Unable to download Html file"));
            return null;
        }
        a(c82);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new C4042ge(str).d(f33877h0);
    }

    private String d(JSONObject jSONObject) {
        C3961c5 c3961c5B = C3961c5.b(this.Z.getContext());
        StringBuilder sb2 = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb2.append("SDKVersion");
            sb2.append("=");
            sb2.append(sDKVersion);
            sb2.append(C3978d4.j.f31381c);
        }
        String strE = c3961c5B.e();
        if (!TextUtils.isEmpty(strE)) {
            sb2.append(C3978d4.j.f31401m);
            sb2.append("=");
            sb2.append(strE);
        }
        Uri uri = Uri.parse(SDKUtils.getControllerUrl());
        if (uri != null) {
            String str = uri.getScheme() + StringUtils.PROCESS_POSTFIX_DELIMITER;
            String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = host + StringUtils.PROCESS_POSTFIX_DELIMITER + port;
            }
            sb2.append(C3978d4.j.f31381c);
            sb2.append("protocol");
            sb2.append("=");
            sb2.append(str);
            sb2.append(C3978d4.j.f31381c);
            sb2.append(C3978d4.j.D);
            sb2.append("=");
            sb2.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String string = new JSONObject(jSONObject, new String[]{C3978d4.j.Z, C3978d4.j.f31389g}).toString();
                    if (!TextUtils.isEmpty(string)) {
                        sb2.append(C3978d4.j.f31381c);
                        sb2.append("controllerConfig");
                        sb2.append("=");
                        sb2.append(string);
                    }
                } catch (JSONException e10) {
                    C4228r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
            sb2.append(C3978d4.j.f31381c);
            sb2.append("debug");
            sb2.append("=");
            sb2.append(q());
            boolean featureFlagLoadControllerAndPlayerFromBundle = FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle();
            boolean zB = C4085j4.b(this.Z.getContext());
            if (featureFlagLoadControllerAndPlayerFromBundle && zB) {
                sb2.append(C3978d4.j.f31381c);
                sb2.append(C3978d4.j.f31416t0);
                sb2.append("=");
                sb2.append(true);
                IronLog.INTERNAL.verbose("controller html was loaded from bundle, setting in html params");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        boolean z10;
        C3961c5 c3961c5B = C3961c5.b(context);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(C3978d4.j.f31422z, "none");
            jSONObjectJsonObjectInit.put(C3978d4.j.A, SDKUtils.translateDeviceOrientation(this.X.z(context)));
            String strD = c3961c5B.d();
            if (strD != null) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = c3961c5B.c();
            if (strC != null) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
                z10 = false;
            } else {
                z10 = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.i(this.f33881c, "add AID");
                    jSONObjectJsonObjectInit.put("deviceIds" + C3978d4.j.f31383d + C3978d4.j.L + C3978d4.j.f31385e, SDKUtils.encodeString(advertiserId));
                }
                String limitAdTracking = SDKUtils.getLimitAdTracking();
                if (!TextUtils.isEmpty(limitAdTracking)) {
                    Logger.i(this.f33881c, "add LAT");
                    jSONObjectJsonObjectInit.put("isLimitAdTrackingEnabled", Boolean.parseBoolean(limitAdTracking));
                }
                String strE = c3961c5B.e();
                if (strE != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.f31401m), SDKUtils.encodeString(strE));
                } else {
                    z10 = true;
                }
                String strF = c3961c5B.f();
                if (strF != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceOSVersion"), strF.replaceAll("[^0-9/.]", ""));
                } else {
                    z10 = true;
                }
                String strF2 = c3961c5B.f();
                if (strF2 != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.f31405o), SDKUtils.encodeString(strF2));
                }
                String strValueOf = String.valueOf(c3961c5B.a());
                if (strValueOf != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceApiLevel"), strValueOf);
                } else {
                    z10 = true;
                }
                jSONObjectJsonObjectInit.put(Q6.f30236j0, String.valueOf(C4099k0.a()));
                String sDKVersion = SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(sDKVersion));
                }
                if (c3961c5B.b() != null && c3961c5B.b().length() > 0) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.f31411r), SDKUtils.encodeString(c3961c5B.b()));
                }
                String strB = C3924a4.b(context);
                if (strB.equals("none")) {
                    z10 = true;
                } else {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
                }
                String strD2 = C3924a4.d(context);
                if (strD2 != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD2));
                } else {
                    z10 = true;
                }
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("hasVPN"), C3924a4.e(context));
                jSONObjectJsonObjectInit.put("uxt", IronSourceStorageUtils.isUxt());
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
                }
                jSONObjectJsonObjectInit.put(C3978d4.j.f31421y, SDKUtils.encodeString(String.valueOf(this.X.a(this.A))));
                String strValueOf2 = String.valueOf(this.X.o());
                if (TextUtils.isEmpty(strValueOf2)) {
                    z10 = true;
                } else {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.G) + C3978d4.j.f31383d + SDKUtils.encodeString("width") + C3978d4.j.f31385e, SDKUtils.encodeString(strValueOf2));
                }
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.G) + C3978d4.j.f31383d + SDKUtils.encodeString("height") + C3978d4.j.f31385e, SDKUtils.encodeString(String.valueOf(this.X.b())));
                String strG = C1.g(this.Z.getContext());
                if (!TextUtils.isEmpty(strG)) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
                }
                String strValueOf3 = String.valueOf(this.X.r());
                if (!TextUtils.isEmpty(strValueOf3)) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.K), SDKUtils.encodeString(strValueOf3));
                }
                String strValueOf4 = String.valueOf(this.X.p());
                if (!TextUtils.isEmpty(strValueOf4)) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.O), SDKUtils.encodeString(strValueOf4));
                }
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.P), C3961c5.b(context).a(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.Y), this.X.k(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("mcc"), Z3.b(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("mnc"), Z3.c(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.S), Z3.f(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.R), SDKUtils.encodeString(Z3.g(context)));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.V), C1.f(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.X), C1.d(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C1.b(context)));
                String strE2 = C1.e(context);
                if (!TextUtils.isEmpty(strE2)) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.f31382c0), SDKUtils.encodeString(strE2));
                }
                c(jSONObjectJsonObjectInit);
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.f31410q0), this.X.t(context));
            } catch (JSONException e10) {
                e = e10;
                C4228r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (JSONException e11) {
            e = e11;
            z10 = false;
        }
        return new Object[]{jSONObjectJsonObjectInit.toString(), Boolean.valueOf(z10)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new C4042ge(str).d(f33876g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new m.a(str, str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        try {
            X3 x32 = this.R;
            if (x32 == null) {
                return;
            }
            x32.b(context);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    private String f(String str) {
        return new m.a(str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            X3 x32 = this.R;
            if (x32 == null) {
                return;
            }
            x32.c(context);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) {
        boolean z10;
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        Map<String, String> mapG = null;
        if (TextUtils.isEmpty(str)) {
            z10 = true;
        } else {
            Y4 y4A = this.G.a(g(str), str2);
            if (y4A != null) {
                mapG = y4A.g();
                mapG.put("demandSourceName", y4A.f());
                mapG.put("demandSourceId", y4A.h());
            }
            try {
                jSONObjectJsonObjectInit.put(C3978d4.i.f31349m, str);
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObjectJsonObjectInit = SDKUtils.mergeJSONObjects(jSONObjectJsonObjectInit, new JSONObject(initSDKParams));
                }
            } catch (Exception e11) {
                C4228r4.d().a(e11);
                IronLog.INTERNAL.error(e11.toString());
            }
            z10 = false;
        }
        if (!TextUtils.isEmpty(this.f33885g)) {
            try {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.f31387f), SDKUtils.encodeString(this.f33885g));
            } catch (JSONException e12) {
                C4228r4.d().a(e12);
                IronLog.INTERNAL.error(e12.toString());
            }
        }
        if (TextUtils.isEmpty(this.f33884f)) {
            z10 = true;
        } else {
            try {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3978d4.j.f31389g), SDKUtils.encodeString(this.f33884f));
            } catch (JSONException e13) {
                C4228r4.d().a(e13);
                IronLog.INTERNAL.error(e13.toString());
            }
        }
        if (mapG != null && !mapG.isEmpty()) {
            for (Map.Entry<String, String> entry : mapG.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    p(entry.getValue());
                }
                try {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e14) {
                    C4228r4.d().a(e14);
                    IronLog.INTERNAL.error(e14.toString());
                }
            }
        }
        return new Object[]{jSONObjectJsonObjectInit.toString(), Boolean.valueOf(z10)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4266t8.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C4266t8.e eVar = C4266t8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C4266t8.e eVar2 = C4266t8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C4266t8.e eVar3 = C4266t8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new Runnable() { // from class: com.ironsource.sdk.controller.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f33752b.k(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str) {
        this.Z.a(new m.b(str, q()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str) {
        try {
            Logger.i(this.f33881c, "load(): " + str);
            IronSourceNetworkBridge.webviewLoadUrl(this.Z, str);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            Logger.e(this.f33881c, "WebViewController::load: " + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Qc qc2 = this.f33879a0;
        if (qc2 != null) {
            qc2.onCloseRequested();
        }
    }

    private void p(String str) {
        if (str.equalsIgnoreCase("0")) {
            this.Z.getSettings().setCacheMode(2);
        } else {
            this.Z.getSettings().setCacheMode(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        C4042ge c4042ge = new C4042ge(str);
        String strD = c4042ge.d("color");
        String strD2 = c4042ge.d("adViewId");
        int color = !C3978d4.i.T.equalsIgnoreCase(strD) ? Color.parseColor(strD) : 0;
        if (strD2 == null) {
            this.Z.setBackgroundColor(color);
            return;
        }
        WebView presentingView = C4216q8.a().a(strD2).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f33881c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C4266t8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C4266t8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C4266t8.e.Banner.toString()) || this.f33904z == null : this.f33902x == null) : this.f33903y != null) {
            z10 = true;
        }
        if (!z10) {
            Logger.d(this.f33881c, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z10;
    }

    public void A() {
        i(f(C3978d4.h.A));
    }

    public void B() {
        try {
            this.Z.onPause();
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            Logger.i(this.f33881c, "WebViewController: onPause() - " + th2);
        }
    }

    public void C() {
        this.C = null;
    }

    public void D() {
        this.Z.a();
        this.f33879a0 = null;
    }

    public void E() {
        this.Z.requestFocus();
    }

    public void F() {
        try {
            this.Z.onResume();
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            Logger.i(this.f33881c, "WebViewController: onResume() - " + th2);
        }
    }

    public com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new com.ironsource.sdk.controller.b(new s()), sVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        this.Z.destroy();
        C4086j5 c4086j5 = this.f33886h;
        if (c4086j5 != null) {
            c4086j5.d();
        }
        X3 x32 = this.R;
        if (x32 != null) {
            x32.b();
        }
        CountDownTimer countDownTimer = this.f33891m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public void a(int i10) {
        if (!this.W && !this.B.m()) {
            Logger.i(this.f33881c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String strD = d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strD = String.format("%s&sessionid=%s", strD, initSDKParams.get("sessionid"));
        }
        this.f33878a.d(new i(controllerConfigAsJSONObject, this.Z, (this.W ? this.V.c().toURI().toString() : this.B.g().toURI().toString()) + "?" + strD));
        this.f33891m = new j(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, 1000L, i10).start();
    }

    public void a(int i10, boolean z10) {
        i(e(C3978d4.f.f31287i, a(C3978d4.f.f31284f, String.valueOf(i10), null, null, null, null, null, null, C3978d4.f.f31285g, z10)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.Y.a(activity);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new e(context));
    }

    public void a(B4 b42) {
        this.O = b42;
    }

    @Override // com.ironsource.Oc
    public void a(C8 c82) {
        if (this.W && this.V.a(c82)) {
            a(1);
        } else {
            if (!c82.getName().contains(C3978d4.f31185f)) {
                c(c82.getName(), c82.getParent());
                return;
            }
            C4085j4.a(this.Z.getContext(), false);
            IronLog.INTERNAL.verbose("controller html was loaded from server");
            this.B.a(new o());
        }
    }

    @Override // com.ironsource.Oc
    public void a(C8 c82, C4283u8 c4283u8) {
        if (this.W && this.V.a(c82)) {
            this.Q.c("controller html - failed to download - " + c4283u8.b());
            return;
        }
        boolean zCopyFileFromBundleToStorage = false;
        if (!c82.getName().contains(C3978d4.f31185f)) {
            if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && a((File) c82)) {
                IronLog.INTERNAL.verbose("copying from bundle to storage " + c82.getName());
                zCopyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.Z.getContext(), c82);
            }
            if (zCopyFileFromBundleToStorage) {
                c(c82.getName(), c82.getParent());
                return;
            } else {
                b(c82.getName(), c82.getParent(), c4283u8.b());
                return;
            }
        }
        if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && c82.getName().equals(C3978d4.f31185f)) {
            IronLog.INTERNAL.verbose("copying from bundle to storage " + c82.getName() + " and " + C3978d4.f31186g);
            zCopyFileFromBundleToStorage = c(c82);
        }
        if (!zCopyFileFromBundleToStorage) {
            this.B.a(new b(), new c(c4283u8));
            return;
        }
        A8.a(C4024fe.C);
        C4085j4.a(this.Z.getContext(), true);
        this.B.a(new a());
    }

    public void a(Qc qc2) {
        this.f33879a0 = qc2;
        this.Z.a(qc2);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42) {
        Map<String, String> mapB = y42.b();
        if (mapB != null) {
            i(a(C3978d4.h.S, SDKUtils.flatMapToJsonAsString(mapB), C3978d4.h.P, C3978d4.h.Q));
        }
        this.G.b(C4266t8.e.Banner, y42.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC4313w4 interfaceC4313w4) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, y42.b()});
        if (map != null) {
            i(a(C3978d4.h.N, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C3978d4.h.O, C3978d4.h.R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC4330x4 interfaceC4330x4) {
        i(a(C4266t8.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, y42.b()}))));
    }

    public void a(C3921a1 c3921a1) {
        synchronized (this.E) {
            if (c3921a1.j() && this.f33887i) {
                Log.d(this.f33881c, "restoreState(state:" + c3921a1 + ")");
                int iC = c3921a1.c();
                if (iC != -1) {
                    C4266t8.e eVar = C4266t8.e.RewardedVideo;
                    if (iC == eVar.ordinal()) {
                        Log.d(this.f33881c, "onRVAdClosed()");
                        String strB = c3921a1.b();
                        InterfaceC4296v4 interfaceC4296v4A = a(eVar);
                        if (interfaceC4296v4A != null && !TextUtils.isEmpty(strB)) {
                            interfaceC4296v4A.b(eVar, strB);
                        }
                    } else {
                        C4266t8.e eVar2 = C4266t8.e.Interstitial;
                        if (iC == eVar2.ordinal()) {
                            Log.d(this.f33881c, "onInterstitialAdClosed()");
                            String strB2 = c3921a1.b();
                            InterfaceC4296v4 interfaceC4296v4A2 = a(eVar2);
                            if (interfaceC4296v4A2 != null && !TextUtils.isEmpty(strB2)) {
                                interfaceC4296v4A2.b(eVar2, strB2);
                            }
                        }
                    }
                    c3921a1.a(-1);
                    c3921a1.f(null);
                } else {
                    Log.d(this.f33881c, "No ad was opened");
                }
                String strD = c3921a1.d();
                String strF = c3921a1.f();
                for (Y4 y42 : this.G.a(C4266t8.e.Interstitial)) {
                    if (y42.e() == 2) {
                        Log.d(this.f33881c, "initInterstitial(appKey:" + strD + ", userId:" + strF + ", demandSource:" + y42.f() + ")");
                        a(strD, strF, y42, this.f33903y);
                    }
                }
                String strG = c3921a1.g();
                String strH = c3921a1.h();
                for (Y4 y43 : this.G.a(C4266t8.e.RewardedVideo)) {
                    if (y43.e() == 2) {
                        String strF2 = y43.f();
                        Log.d(this.f33881c, "onRVNoMoreOffers()");
                        this.f33902x.c(strF2);
                        Log.d(this.f33881c, "initRewardedVideo(appKey:" + strG + ", userId:" + strH + ", demandSource:" + strF2 + ")");
                        a(strG, strH, y43, this.f33902x);
                    }
                }
                c3921a1.a(false);
            }
            this.D = c3921a1;
        }
    }

    public void a(InterfaceC4153mg interfaceC4153mg) {
        this.C = interfaceC4153mg;
    }

    public void a(C4242s1 c4242s1) {
        this.N = c4242s1;
    }

    public void a(com.ironsource.sdk.controller.a aVar) {
        this.L = aVar;
        aVar.a(o());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        i(a(cVar.e(), cVar.h(), C3978d4.h.U, C3978d4.h.U));
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.K = iVar;
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.M = jVar;
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.H = oVar;
    }

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.I = qVar;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.J = uVar;
    }

    public void a(EnumC0405v enumC0405v) {
        this.f33900v = enumC0405v;
    }

    public void a(C4266t8.e eVar, String str) {
        b(new f(eVar, str));
    }

    public void a(Runnable runnable) {
        V7 v72 = this.f33878a;
        if (v72 != null) {
            v72.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4330x4 interfaceC4330x4) {
        HashMap map = new HashMap();
        map.put("demandSourceName", str);
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        this.D.d(str, true);
        i(a(C3978d4.h.E, strFlatMapToJsonAsString, C3978d4.h.F, C3978d4.h.G));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC4313w4 interfaceC4313w4) {
        this.f33884f = str;
        this.f33885g = str2;
        this.f33904z = interfaceC4313w4;
        a(str, C4266t8.e.Banner, y42, new m());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC4330x4 interfaceC4330x4) {
        this.f33884f = str;
        this.f33885g = str2;
        this.f33903y = interfaceC4330x4;
        this.D.g(str);
        this.D.h(this.f33885g);
        a(this.f33884f, C4266t8.e.Interstitial, y42, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC4347y4 interfaceC4347y4) {
        this.f33884f = str;
        this.f33885g = str2;
        this.f33902x = interfaceC4347y4;
        this.D.i(str);
        this.D.j(str2);
        a(str, C4266t8.e.RewardedVideo, y42, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.S = jSONObject;
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4313w4 interfaceC4313w4) {
        i(a(C3978d4.h.N, jSONObject.toString(), C3978d4.h.O, C3978d4.h.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4330x4 interfaceC4330x4) {
        i(a(C4266t8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4347y4 interfaceC4347y4) {
        i(a(C4266t8.e.RewardedVideo, jSONObject));
    }

    public void a(boolean z10, String str) {
        i(e(C3978d4.h.V, a(C3978d4.i.M0, str, null, null, null, null, null, null, C3978d4.i.f31353o, z10)));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        Y4 y4A = this.G.a(C4266t8.e.Interstitial, str);
        return y4A != null && y4A.d();
    }

    public com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
        if (this.W) {
            this.V.b();
            return;
        }
        this.B.a(new C4300v8());
        if (this.B.k()) {
            a(1);
        }
    }

    public void b(int i10) {
        f33872c0 = i10;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new d(context));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42) {
        Map<String, String> mapB = y42.b();
        if (mapB != null) {
            i(e(C3978d4.h.T, SDKUtils.flatMapToJsonAsString(mapB)));
        }
        this.G.b(C4266t8.e.Interstitial, y42.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42, Map<String, String> map, InterfaceC4330x4 interfaceC4330x4) {
        a(y42, map);
    }

    public void b(Runnable runnable) {
        V7 v72 = this.f33878a;
        if (v72 != null) {
            v72.c(runnable);
        }
    }

    public void b(String str, String str2, String str3) {
        try {
            i(e(C3978d4.h.f31313q, a(C3978d4.i.f31327b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(C3978d4.h.f31301e0, jSONObject != null ? jSONObject.toString() : null));
    }

    public void b(boolean z10, String str) {
        i(e(C3978d4.h.V, a(C3978d4.i.K, str, null, null, null, null, null, null, C3978d4.i.f31353o, z10)));
    }

    public void c(Runnable runnable) {
        V7 v72 = this.f33878a;
        if (v72 != null) {
            v72.d(runnable);
        }
    }

    public void c(String str) {
        if (str.equals(C3978d4.i.f31341i)) {
            n();
        }
        i(e(C3978d4.h.f31322z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void c(String str, String str2) {
        try {
            i(e(C3978d4.h.f31312p, a(C3978d4.i.f31327b, str, "path", b(str2), null, null, null, null, null, false)));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            b(str, str2, e10.getMessage());
        }
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C3978d4.c.f31258z;
        }
        i(e(C3978d4.h.f31295a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        i(f(C3978d4.h.f31316t));
    }

    public void e(JSONObject jSONObject) {
        Logger.i(this.f33881c, "device connection info changed: " + jSONObject.toString());
        i(e(C3978d4.h.f31321y, a(C3978d4.j.f31392h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        a(this.D);
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        i(f(C3978d4.h.f31317u));
    }

    public void g(String str, String str2) {
        i(e(C3978d4.h.W, a(C3978d4.i.f31355p, str2, C3978d4.i.f31349m, str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public C4266t8.c h() {
        return C4266t8.c.Web;
    }

    public boolean h(String str) {
        try {
            if (!new Je(str, C4038ga.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return false;
            }
            C4026fg.a(p(), str);
            return true;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    public void j(String str) {
        i(e(C3978d4.f.f31288j, a("errMsg", str, null, null, null, null, null, null, null, false)));
    }

    public void l(String str) {
        i(e(C3978d4.h.f31319w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void n(String str) {
        try {
            String strD = C3924a4.d(this.Z.getContext());
            Logger.i(this.f33881c, "device status changed, connection type " + str);
            C4351y8.a(str);
            C4351y8.b(strD);
            i(e(C3978d4.h.f31320x, a("connectionType", str, "rawConnectionType", strD, null, null, null, null, null, false)));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e10));
        }
    }

    public Ng o() {
        if (this.P == null) {
            this.P = new h();
        }
        return this.P;
    }

    public void o(String str) {
        this.f33901w = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        Logger.i(this.f33881c, str + Z7.f30794r + str4);
    }

    public Context p() {
        return this.Y.a();
    }

    public int q() {
        return f33872c0;
    }

    public FrameLayout r() {
        return this.f33899u;
    }

    public String s() {
        return this.f33901w;
    }

    public C3921a1 t() {
        return this.D;
    }

    public EnumC0405v u() {
        return this.f33900v;
    }

    public void v() {
        if (this.f33888j == null) {
            return;
        }
        n();
        C4266t8.e eVarB = this.f33888j.b();
        String strA = this.f33888j.a();
        if (r(eVarB.toString())) {
            a(eVarB, strA);
        }
    }

    public void w() {
        this.f33895q.onHideCustomView();
    }

    public boolean x() {
        return this.f33896r != null;
    }

    public void y() {
        i(f(C3978d4.f.f31286h));
    }

    public void z() {
        i(f(C3978d4.h.Z));
    }
}
