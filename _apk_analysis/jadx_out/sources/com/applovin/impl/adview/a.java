package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.k;
import com.applovin.impl.c2;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.f4;
import com.applovin.impl.h4;
import com.applovin.impl.l2;
import com.applovin.impl.n1;
import com.applovin.impl.n7;
import com.applovin.impl.o8;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t4;
import com.applovin.impl.v2;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {
    private volatile AppLovinAdLoadListener A;
    private volatile AppLovinAdDisplayListener B;
    private volatile AppLovinAdViewEventListener C;
    private volatile AppLovinAdClickListener D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f7679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.k f7680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f7681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.o f7682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f7683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f7684g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdSize f7686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CustomTabsSession f7688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.applovin.impl.adview.c f7689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f7690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f7691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WebView f7692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f7693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Runnable f7694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f7695r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f7685h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f7696s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f7697t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private f f7698u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f f7699v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f7700w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f7701x = new AtomicBoolean();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile boolean f7702y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile boolean f7703z = false;

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    public class C0138a extends t4 {
        public C0138a() {
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53127a, webView, str);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53127a, webView, str);
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

    public interface b {
        void a(a aVar);
    }

    public class c implements Runnable {
        private c() {
        }

        public /* synthetic */ c(a aVar, C0138a c0138a) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f7691n != null) {
                a.this.f7691n.setVisibility(8);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        public class C0139a implements k.a {
            public C0139a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f7691n.addView(a.this.f7693p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void b() {
                com.applovin.impl.sdk.o unused = a.this.f7682e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f7682e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        public /* synthetic */ d(a aVar, C0138a c0138a) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f7696s != null) {
                if (a.this.f7691n == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f7696s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    t2.a(a.this.C, a.this.f7696s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f7680c.g().a(d2.F, a.this.f7696s, mapHashMap);
                    return;
                }
                a.this.v();
                com.applovin.impl.sdk.o unused = a.this.f7682e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f7682e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f7696s.getAdIdNumber() + "...");
                }
                a.b(a.this.f7691n, a.this.f7696s.getSize());
                if (a.this.f7693p != null) {
                    e8.c(a.this.f7693p);
                    a.this.f7693p = null;
                }
                c2 c2Var = new c2(a.this.f7685h, a.this.f7680c);
                if (c2Var.c()) {
                    a.this.f7693p = new k(c2Var, a.this.f7678a);
                    a.this.f7693p.a(new C0139a());
                }
                a.this.f7691n.setAdHtmlLoaded(false);
                a.this.f7691n.a(a.this.f7696s);
                if (a.this.f7696s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f7703z) {
                    return;
                }
                a.this.f7696s.setHasShown(true);
            }
        }
    }

    public static class e implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f7708a;

        public e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f7708a = aVar;
        }

        private a a() {
            return this.f7708a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.o.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i10);
            }
        }
    }

    private void E() {
        if (this.f7682e != null && com.applovin.impl.sdk.o.a() && com.applovin.impl.sdk.o.a()) {
            this.f7682e.a("AppLovinAdView", "Destroying...");
        }
        o8.b(this.f7691n);
        this.f7691n = null;
        o8.b(this.f7692o);
        this.f7692o = null;
        this.f7688k = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f7703z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        try {
            if (this.A != null) {
                this.A.failedToReceiveAd(i10);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while running app load callback", th2);
            com.applovin.impl.sdk.k kVar = this.f7680c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadFailedCallback", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        this.f7680c = kVar;
        this.f7681d = kVar.k();
        this.f7682e = kVar.O();
        this.f7683f = AppLovinCommunicator.getInstance(context);
        this.f7686i = appLovinAdSize;
        this.f7687j = str;
        if (!(context instanceof AppLovinFullscreenActivity)) {
            context = context.getApplicationContext();
        }
        this.f7678a = context;
        this.f7679b = appLovinAdView;
        this.f7689l = new com.applovin.impl.adview.c(this, kVar);
        C0138a c0138a = null;
        this.f7695r = new c(this, c0138a);
        this.f7694q = new d(this, c0138a);
        this.f7690m = new e(this, kVar);
        a(appLovinAdSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f7701x.compareAndSet(true, false)) {
            a(this.f7686i);
        }
        try {
            if (this.A != null) {
                this.A.adReceived(appLovinAd);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Exception while running ad load callback: " + th2.getMessage());
            com.applovin.impl.sdk.k kVar = this.f7680c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadedCallback", th2);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    private void a(String str) {
        if (this.f7696s == null || this.f7691n == null || !n7.a(this.f7696s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f7691n.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String str3;
        if (StringUtils.isValidString(str)) {
            str3 = "gtag('event', '" + str2 + "', " + str + ");";
        } else {
            str3 = "gtag('event', '" + str2 + "')";
        }
        if (((Boolean) this.f7680c.a(x4.Q2)).booleanValue()) {
            o8.a(this.f7692o, str3, this.f7680c);
        } else {
            o8.a(this.f7692o, str3);
        }
    }

    private void a(String str, Map map) {
        a(o8.a(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i10) {
        if (!this.f7703z) {
            a(this.f7695r);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f7798b.a(i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        if (this.f7698u == null && (this.f7696s instanceof com.applovin.impl.sdk.ad.a) && this.f7691n != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f7696s;
            Context context = this.f7678a;
            Activity activityB = context instanceof Activity ? (Activity) context : e8.b(this.f7691n, this.f7680c);
            if (activityB == null || activityB.isFinishing()) {
                com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
                Uri uriE1 = aVar.e1();
                if (uriE1 != null) {
                    this.f7681d.trackAndLaunchClick(aVar, i(), this, uriE1, motionEvent);
                }
                this.f7691n.a("javascript:al_onFailedExpand();");
                return;
            }
            ViewGroup viewGroup = this.f7679b;
            if (viewGroup != null) {
                viewGroup.removeView(this.f7691n);
            }
            f fVar = new f(aVar, this.f7691n, activityB, this.f7680c);
            this.f7698u = fVar;
            fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.u
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f7792b.a(dialogInterface);
                }
            });
            this.f7698u.show();
            t2.c(this.C, this.f7696s, (AppLovinAdView) this.f7679b);
            if (this.f7696s.isOpenMeasurementEnabled()) {
                this.f7696s.getAdEventTracker().a((View) this.f7698u.c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension = -1;
        int iApplyDimension2 = (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension2;
        layoutParams.height = iApplyDimension;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f7696s.getAdEventTracker().c(webView);
        k kVar = this.f7693p;
        if (kVar == null || !kVar.a()) {
            this.f7696s.getAdEventTracker().a((View) webView);
        } else {
            f4 adEventTracker = this.f7696s.getAdEventTracker();
            k kVar2 = this.f7693p;
            adEventTracker.b(webView, Collections.singletonList(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        }
        this.f7696s.getAdEventTracker().h();
        this.f7696s.getAdEventTracker().g();
    }

    private void b(String str) {
        if (((Boolean) this.f7680c.a(x4.E1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(o8.b(str, map));
    }

    private void c() {
        a(new Runnable() { // from class: com.applovin.impl.adview.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f7782b.r();
            }
        });
    }

    private void c(String str, Map map) {
        a(o8.c(str, map));
    }

    private void d() {
        a(new Runnable() { // from class: com.applovin.impl.adview.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7709b.s();
            }
        });
    }

    private void d(String str, Map map) {
        a(o8.d(str, map));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7682e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7682e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this.f7691n, "/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f7679b == null || (bVar = this.f7691n) == null || bVar.getParent() != null) {
            return;
        }
        this.f7679b.addView(this.f7691n);
        b(this.f7691n, this.f7696s.getSize());
        if (this.f7696s.isOpenMeasurementEnabled()) {
            this.f7696s.getAdEventTracker().a((View) this.f7691n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f7691n != null && this.f7698u != null) {
            a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.f7698u != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7682e.a("AppLovinAdView", "Detaching expanded ad: " + this.f7698u.b());
            }
            this.f7699v = this.f7698u;
            this.f7698u = null;
            a(this.f7686i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f7699v;
        if (fVar == null && this.f7698u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f7699v.dismiss();
            this.f7699v = null;
        } else {
            aVarB = this.f7698u.b();
            this.f7698u.dismiss();
            this.f7698u = null;
        }
        t2.a(this.C, aVarB, (AppLovinAdView) this.f7679b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        AppLovinNetworkBridge.webviewLoadUrl(f(), "chrome://crash");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.applovin.impl.sdk.ad.b bVar = this.f7696s;
        v2 v2Var = new v2();
        v2Var.a().a(bVar).a(i());
        if (!n7.a(bVar.getSize())) {
            v2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        v2Var.a(this.f7680c);
        v2Var.a();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7682e.a("AppLovinAdView", v2Var.toString());
        }
    }

    private void x() {
        if (this.f7696s.P0()) {
            int iC = this.f7680c.p().c();
            if (com.applovin.impl.sdk.i.a(iC)) {
                this.f7691n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f7691n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (n7.a(this.f7686i)) {
            if (((Boolean) this.f7680c.a(x4.E1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f7680c.a(x4.F1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f7680c.a(x4.G1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f7680c.a(x4.H1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7682e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f7684g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.f7696s != null && this.f7696s.r0()) {
            com.applovin.impl.g.a(this.f7691n, this.f7680c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void C() {
        if (this.f7702y) {
            if (this.f7696s == null || !this.f7696s.Z0()) {
                t2.b(this.B, this.f7696s);
            }
            if (this.f7696s != null && this.f7696s.isOpenMeasurementEnabled() && n7.a(this.f7696s.getSize())) {
                this.f7696s.getAdEventTracker().f();
            }
            if (this.f7691n != null && this.f7698u != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7682e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f7682e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.f7702y || this.f7703z) {
            return;
        }
        this.f7703z = true;
    }

    public void F() {
        if (this.f7702y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f7700w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f7703z = false;
        }
    }

    public void a() {
        a(new Runnable() { // from class: com.applovin.impl.adview.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f7789b.p();
            }
        });
    }

    public void a(Uri uri) {
        if (this.f7696s == null || !this.f7696s.w0()) {
            return;
        }
        if (this.f7692o == null) {
            this.f7680c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7680c.O().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        final String queryParameter = uri.getQueryParameter("event_name");
        final String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (!TextUtils.isEmpty(queryParameter)) {
            a(new Runnable() { // from class: com.applovin.impl.adview.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7786b.a(queryParameter2, queryParameter);
                }
            });
            return;
        }
        this.f7680c.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7680c.O().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
        }
    }

    public void a(final MotionEvent motionEvent) {
        a(new Runnable() { // from class: com.applovin.impl.adview.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f7783b.b(motionEvent);
            }
        });
    }

    public void a(final WebView webView, String str) {
        if (this.f7696s == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.v
            @Override // java.lang.Runnable
            public final void run() {
                webView.setVisibility(0);
            }
        });
        if (!((Boolean) this.f7680c.a(x4.f10884y6)).booleanValue() || (str != null && str.startsWith(this.f7696s.k()))) {
            try {
                if (this.f7696s != this.f7697t) {
                    this.f7697t = this.f7696s;
                    x();
                    this.f7691n.setAdHtmlLoaded(true);
                    if (this.B != null) {
                        this.f7680c.y().d(this.f7696s);
                        if (this.f7696s.s0()) {
                            this.f7680c.g().a(d2.E, this.f7696s, CollectionUtils.hashMap("details", f2.b(this.f7696s)));
                        } else {
                            this.f7680c.g().a(d2.D, this.f7696s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f7696s.z())));
                            t2.a(this.B, this.f7696s);
                        }
                        if (this.f7696s.Q0()) {
                            String str2 = (String) this.f7680c.p0().a(z4.T, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f7691n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f7691n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f7696s.s0()) {
                            this.f7691n.a("javascript:al_onAdRestored( '" + this.f7696s.X() + "' );");
                        }
                    }
                    if ((this.f7696s instanceof com.applovin.impl.sdk.ad.a) && this.f7696s.isOpenMeasurementEnabled()) {
                        this.f7680c.q0().a(new r6(this.f7680c, "StartOMSDK", new Runnable() { // from class: com.applovin.impl.adview.w
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f7794b.b(webView);
                            }
                        }), d6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while notifying ad display listener", th2);
                com.applovin.impl.sdk.k kVar = this.f7680c;
                if (kVar != null) {
                    kVar.D().a("AppLovinAdView", "onAdHtmlLoaded", th2);
                }
            }
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.s.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.s.b(attributeSet)) {
                u();
            }
        }
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.C = appLovinAdViewEventListener;
    }

    public void a(b bVar) {
        this.f7684g = bVar;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        if (appLovinAdView != null) {
            this.f7681d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f7682e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        t2.a(this.D, bVar);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        n7.b(appLovinAd, this.f7680c);
        if (!this.f7702y) {
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
            Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "renderAd", mapA);
            this.f7680c.g().d(d2.C, mapA);
        }
        com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) n7.a(appLovinAd, this.f7680c);
        if (bVar == null) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
            t2.a(this.B, "Unable to retrieve the loaded ad");
            Map mapA2 = f2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "noAdToRender", mapA2);
            CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
            this.f7680c.g().d(d2.F, mapA2);
            return;
        }
        if (bVar == this.f7696s) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
            if (((Boolean) this.f7680c.a(x4.I1)).booleanValue()) {
                if (this.B instanceof l2) {
                    t2.a(this.B, "Attempting to show ad again");
                } else {
                    if (n7.c(this.f7680c)) {
                        throw new IllegalStateException("Attempting to show ad again");
                    }
                    this.f7680c.g().a(d2.S0, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                }
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
            CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
            this.f7680c.g().a(d2.F, bVar, mapHashMap);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7682e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
        }
        t2.b(this.B, this.f7696s);
        if (this.f7696s != null && this.f7696s.isOpenMeasurementEnabled()) {
            this.f7696s.getAdEventTracker().f();
        }
        this.f7700w.set(null);
        this.f7697t = null;
        this.f7696s = bVar;
        if (this.f7696s.isCustomTabsEnabled()) {
            this.f7688k = this.f7680c.z().a(this);
            this.f7680c.z().b(this.f7696s.getCustomTabsWarmupUrls(), this.f7688k);
        }
        if (!this.f7703z && n7.a(this.f7686i)) {
            this.f7680c.k().trackImpression(bVar);
        }
        if (this.f7698u != null) {
            c();
        }
        a(this.f7694q);
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.D = appLovinAdClickListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.B = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.A = appLovinAdLoadListener;
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f7689l, this.f7680c, this.f7678a);
            this.f7691n = bVar;
            bVar.setBackgroundColor(0);
            this.f7691n.setWillNotCacheDrawing(false);
            this.f7679b.setBackgroundColor(0);
            this.f7679b.addView(this.f7691n);
            b(this.f7691n, appLovinAdSize);
            if (!this.f7702y) {
                a(this.f7695r);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7785b.o();
                }
            });
            this.f7702y = true;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Failed to initialize AdWebView", th2);
            this.f7680c.D().a("AppLovinAdView", "initAdWebView", th2);
            this.f7701x.set(true);
        }
    }

    public void a(String str, Object obj) {
        this.f7685h.put(str, obj);
    }

    public void a(boolean z10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7682e.a("AppLovinAdView", "onWindowFocusChanged( " + z10 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.adview.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f7796b.q();
            }
        });
    }

    public void b(Uri uri) {
        if (this.f7696s != null && this.f7696s.w0() && this.f7692o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f7680c.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7680c.O().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f7678a);
            this.f7692o = webView;
            webView.setWebViewClient(new C0138a());
            this.f7692o.getSettings().setJavaScriptEnabled(true);
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this.f7692o, (String) this.f7680c.a(x4.f10753i7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", null);
        }
    }

    public void b(final AppLovinAd appLovinAd) {
        if (appLovinAd == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7682e.b("AppLovinAdView", "No provided when to the view controller");
            }
            b(-1);
        } else {
            if (this.f7703z) {
                this.f7700w.set(appLovinAd);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7682e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            } else {
                c(appLovinAd);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7790b.a(appLovinAd);
                }
            });
        }
    }

    public void c(int i10) {
        String strA = e8.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f7682e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b("javascript:al_onWindowVisibilityChanged( " + strA + " );");
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public AppLovinAdViewEventListener e() {
        return this.C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f7691n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f7696s;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return a.class.getSimpleName();
    }

    public CustomTabsSession h() {
        return this.f7688k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f7679b;
    }

    public com.applovin.impl.sdk.k j() {
        return this.f7680c;
    }

    public AppLovinAdSize k() {
        return this.f7686i;
    }

    public String l() {
        return this.f7687j;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7797b.t();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
        }
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.application_paused":
                m();
                break;
            case "com.applovin.application_resumed":
                n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void u() {
        if (this.f7680c == null || this.f7690m == null || this.f7678a == null || !this.f7702y) {
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f7681d.loadNextAd(this.f7687j, this.f7686i, this.f7690m);
        }
    }

    public void w() {
        if ((this.f7678a instanceof n1) && this.f7696s != null && this.f7696s.K() == b.EnumC0153b.DISMISS) {
            ((n1) this.f7678a).dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.f7698u != null || this.f7699v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7682e.a("AppLovinAdView", "Ad: " + this.f7696s + " closed.");
        }
        a(this.f7695r);
        t2.b(this.B, this.f7696s);
        this.f7696s = null;
    }
}
