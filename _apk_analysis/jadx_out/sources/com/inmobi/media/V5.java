package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.CookieManager;
import com.inmobi.media.V5;
import com.inmobi.media.core.config.models.AdConfig;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class V5 extends AbstractC3872y2 implements InterfaceC3613nh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f26471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sn.l f26475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3580m9 f26476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U5 f26477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f26478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ya f26479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26481l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5(Context context, long j10, String str, String str2, String str3, sn.l lVar, InterfaceC3580m9 interfaceC3580m9) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "placementType");
        tn.p.k(str2, "impressionId");
        tn.p.k(str3, "creativeId");
        tn.p.k(lVar, "onLpLifecycleEvent");
        this.f26471b = j10;
        this.f26472c = str;
        this.f26473d = str2;
        this.f26474e = str3;
        this.f26475f = lVar;
        this.f26476g = interfaceC3580m9;
        this.f26478i = V5.class.getSimpleName();
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        e();
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
    }

    public static final bn.r a(V5 v52) {
        T5 t52;
        ViewParent parent = v52.getParent();
        Q5 q52 = parent instanceof Q5 ? (Q5) parent : null;
        if (q52 != null && (t52 = q52.f26166d) != null) {
            C c10 = ((L8) t52).f25860a.f25938b;
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = c10 instanceof GestureDetectorOnGestureListenerC3337ci ? (GestureDetectorOnGestureListenerC3337ci) c10 : null;
            if (gestureDetectorOnGestureListenerC3337ci != null) {
                gestureDetectorOnGestureListenerC3337ci.D();
            }
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(V5 v52, String str, Map map) {
        tn.p.k(str, "trackerName");
        tn.p.k(map, "macros");
        ViewParent parent = v52.getParent();
        Q5 q52 = parent instanceof Q5 ? (Q5) parent : null;
        if (q52 != null) {
            tn.p.k(str, "trackerName");
            tn.p.k(map, "macros");
            T5 t52 = q52.f26166d;
            if (t52 != null) {
                tn.p.k(str, "trackerName");
                tn.p.k(map, "macros");
                C c10 = ((L8) t52).f25860a.f25938b;
                GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = c10 instanceof GestureDetectorOnGestureListenerC3337ci ? (GestureDetectorOnGestureListenerC3337ci) c10 : null;
                if (gestureDetectorOnGestureListenerC3337ci != null) {
                    gestureDetectorOnGestureListenerC3337ci.b(str, map);
                }
            }
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(V5 v52, JSONObject jSONObject) {
        tn.p.k(jSONObject, "it");
        v52.f26475f.invoke(jSONObject);
        return bn.r.f5635a;
    }

    private final AdConfig getAdConfig() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        return (AdConfig) Y3.f26611a.a(AdConfig.class);
    }

    private final AdConfig.RenderingConfig getRenderingConfig() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f26611a.a(AdConfig.class)).getRendering();
    }

    private void safedk_webview_V5_webviewLoadData_172d49d32092f6f80826f3dca3960029(String str, String str2, String str3) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/inmobi/media/V5;->safedk_webview_V5_webviewLoadData_172d49d32092f6f80826f3dca3960029(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        boolean z10 = SafeDK.getInstance() != null && SafeDK.getInstance().o();
        Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : " + this + ", isSafeDKInitialized = " + z10 + ", SDK_PACKAGE_NAME = " + com.safedk.android.utils.g.f53135i);
        if (z10) {
            CreativeInfoManager.a((String) null, str, this, com.safedk.android.utils.g.f53135i);
            SafeDKWebAppInterface.a(com.safedk.android.utils.g.f53135i, this, str);
        }
        super.loadData(str, str2, str3);
    }

    private void safedk_webview_V5_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(String str) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/inmobi/media/V5;->safedk_webview_V5_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + str + ", WebView address : " + toString() + "  SDK_PACKAGE_NAME = " + com.safedk.android.utils.g.f53135i);
            NetworkBridge.logWebviewLoadURLRequest(com.safedk.android.utils.g.f53135i, this, str);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(com.safedk.android.utils.g.f53135i);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(str, (String) null, this, com.safedk.android.utils.g.f53135i);
            }
            SafeDKWebAppInterface.a(com.safedk.android.utils.g.f53135i, this, str);
        }
        super.loadUrl(str);
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public final void a(String str) {
        tn.p.k(str, "api");
        HashMap map = new HashMap();
        map.put("creativeId", this.f26474e);
        map.put("trigger", str);
        map.put("impressionId", this.f26473d);
        map.put("adType", this.f26472c);
        Wj wj2 = Wj.f26549a;
        Wj.b("BlockAutoRedirection", map, EnumC3287ak.f26805a);
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public final boolean a() {
        tn.p.j(this.f26478i, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public final boolean c() {
        tn.p.j(this.f26478i, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.AbstractC3872y2
    public final Ua d() {
        Va va2 = new Va(true, null, getAdConfig().isCCTEnabled(), 18);
        Context context = getContext();
        tn.p.j(context, "getContext(...)");
        return new Ua(context, va2, null, this, null, this.f26476g, 140);
    }

    @Override // com.inmobi.media.AbstractC3872y2, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        U5 u52 = new U5("IN_CUSTOM_EXPAND", new sn.a() { // from class: n9.v4
            @Override // sn.a
            public final Object invoke() {
                return V5.a(this.f75654b);
            }
        }, new sn.l() { // from class: n9.w4
            @Override // sn.l
            public final Object invoke(Object obj) {
                return V5.a(this.f75669b, (JSONObject) obj);
            }
        }, new sn.p() { // from class: n9.x4
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return V5.a(this.f75689b, (String) obj, (Map) obj2);
            }
        }, this.f26476g);
        setWebViewClient(u52);
        this.f26477h = u52;
    }

    @Nullable
    public final Ya getLandingPageTelemetryControlInfo() {
        return this.f26479j;
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public long getViewTouchTimestamp() {
        return this.f26471b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        tn.p.k(str, "data");
        safedk_webview_V5_webviewLoadData_172d49d32092f6f80826f3dca3960029(str, str2, str3);
        U5 u52 = this.f26477h;
        if (u52 != null) {
            u52.f28621d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        tn.p.k(str, "url");
        safedk_webview_V5_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(str);
        U5 u52 = this.f26477h;
        if (u52 != null) {
            u52.f28621d = true;
        }
    }

    @Override // com.inmobi.media.AbstractC3872y2, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (!this.f26481l) {
            this.f26481l = true;
            sn.l lVar = this.f26475f;
            GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
            lVar.invoke(Mh.a("IN_CUSTOM_EXPAND", "onScroll"));
        }
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (!this.f26480k) {
            this.f26480k = true;
            sn.l lVar = this.f26475f;
            GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
            lVar.invoke(Mh.a("IN_CUSTOM_EXPAND", "onInteraction"));
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryControlInfo(@Nullable Ya ya2) {
        this.f26479j = ya2;
        U5 u52 = this.f26477h;
        if (u52 != null) {
            u52.f26415j = ya2;
            u52.f26416k = new Wa(ya2, u52);
        }
    }

    public void setViewTouchTimestamp(long j10) {
        this.f26471b = j10;
    }
}
