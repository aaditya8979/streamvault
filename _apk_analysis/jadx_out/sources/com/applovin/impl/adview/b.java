package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.f2;
import com.applovin.impl.j0;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.o7;
import com.applovin.impl.o8;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.w7;
import com.applovin.impl.x4;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class b extends j0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f7730j = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f7731k = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f7734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f7738i;

    public class a extends t4 {
        public a() {
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdWebView");
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

    public b(c cVar, com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.f7737h = new ArrayList();
        this.f7738i = new Object();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f7733d = kVar;
        this.f7732c = kVar.O();
        Integer num = (Integer) kVar.a(x4.G6);
        if (num.intValue() > 0) {
            synchronized (f7731k) {
                Set set = f7730j;
                set.add(this);
                n7.a("AdWebView", set.size(), num.intValue(), kVar.D());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new com.applovin.impl.t(cVar != null ? cVar.d() : null, kVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (o0.i() && ((Boolean) kVar.a(x4.Z5)).booleanValue()) {
            setWebViewRenderProcessClient(new d(kVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.b0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return b.a(view, motionEvent);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.c0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f7743b.a(view);
            }
        });
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, o7 o7Var) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7732c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strA);
            }
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) kVar.a(x4.O4), str);
        if (!StringUtils.isValidString(strA2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7732c.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
            }
            AppLovinNetworkBridge.webviewLoadUrl(this, str);
            return;
        }
        if (o7Var.x1() && o7Var.isOpenMeasurementEnabled()) {
            strA2 = kVar.e0().a(strA2, f2.a((AppLovinAdImpl) o7Var));
        }
        String str4 = strA2;
        if (com.applovin.impl.sdk.o.a()) {
            this.f7732c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str4);
        }
        AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, str2, str4, "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f7732c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private void b() {
        synchronized (this.f7738i) {
            Iterator it = this.f7737h.iterator();
            while (it.hasNext()) {
                o8.a(this, (String) it.next(), "AdWebView", this.f7733d);
            }
            this.f7737h.clear();
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (this.f7735f) {
            com.applovin.impl.sdk.o.h("AdWebView", "Ad can not be loaded in a destroyed webview");
            return;
        }
        this.f7734e = bVar;
        try {
            applySettings(bVar);
            if (n7.a(bVar.getSize())) {
                setVisibility(0);
            }
            bVar.a(SystemClock.elapsedRealtime());
            if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), ((com.applovin.impl.sdk.ad.a) bVar).g1(), "text/html", null, "");
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7732c.a("AdWebView", "AppLovinAd rendered");
                    return;
                }
                return;
            }
            if (bVar instanceof o7) {
                o7 o7Var = (o7) bVar;
                r7 r7VarG1 = o7Var.g1();
                if (r7VarG1 == null) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7732c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                w7 w7VarE = r7VarG1.e();
                Uri uriC = w7VarE.c();
                String string = uriC != null ? uriC.toString() : "";
                String strB = w7VarE.b();
                String strI1 = o7Var.i1();
                if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strB)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7732c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                        return;
                    }
                    return;
                }
                if (w7VarE.d() == w7.a.STATIC) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7732c.a("AdWebView", "Rendering WebView for static VAST ad");
                    }
                    String strA = a((String) this.f7733d.a(x4.N4), string);
                    if (o7Var.x1() && o7Var.isOpenMeasurementEnabled() && o7Var.y1()) {
                        strA = this.f7733d.e0().a(strA, f2.a((AppLovinAdImpl) bVar));
                    }
                    AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), strA, "text/html", null, "");
                    return;
                }
                if (w7VarE.d() == w7.a.HTML) {
                    if (!StringUtils.isValidString(strB)) {
                        if (StringUtils.isValidString(string)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f7732c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                            }
                            a(string, bVar.k(), strI1, this.f7733d, o7Var);
                            return;
                        }
                        return;
                    }
                    String strA2 = a(strI1, strB);
                    String str = StringUtils.isValidString(strA2) ? strA2 : strB;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7732c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                    }
                    AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), str, "text/html", null, "");
                    return;
                }
                if (w7VarE.d() != w7.a.IFRAME) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7732c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                        return;
                    }
                    return;
                }
                if (StringUtils.isValidString(string)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7732c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                    }
                    a(string, bVar.k(), strI1, this.f7733d, o7Var);
                } else if (StringUtils.isValidString(strB)) {
                    String strA3 = a(strI1, strB);
                    String str2 = StringUtils.isValidString(strA3) ? strA3 : strB;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7732c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str2);
                    }
                    AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), str2, "text/html", null, "");
                }
            }
        } catch (Throwable th2) {
            throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th2);
        }
    }

    public void a(String str) {
        if (!((Boolean) this.f7733d.a(x4.f10884y6)).booleanValue()) {
            o8.a(this, str, "AdWebView", this.f7733d);
        } else {
            if (this.f7736g) {
                o8.a(this, str, "AdWebView", this.f7733d);
                return;
            }
            synchronized (this.f7737h) {
                this.f7737h.add(str);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f7735f = true;
        this.f7736g = false;
        super.destroy();
    }

    @Override // com.applovin.impl.j0, com.applovin.impl.adview.AppLovinWebViewBase, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53127a, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f7734e;
    }

    @Override // com.applovin.impl.j0, com.applovin.impl.adview.AppLovinWebViewBase, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    public void setAdHtmlLoaded(boolean z10) {
        this.f7736g = z10;
        if (z10 && ((Boolean) this.f7733d.a(x4.f10884y6)).booleanValue()) {
            b();
        }
    }
}
