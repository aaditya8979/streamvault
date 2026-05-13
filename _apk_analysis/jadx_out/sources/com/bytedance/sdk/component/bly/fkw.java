package com.bytedance.sdk.component.bly;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import com.ironsource.C3978d4;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class fkw extends WebView {
    private boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private lh f12486le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f12487lh;
    public long ouw;
    private final HashSet<String> vt;
    private boolean yu;

    public fkw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.vt = new HashSet<>();
        this.ouw = System.currentTimeMillis();
        ko.vt("TTAD.PangleWebView", "init: ");
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new le.ouw());
    }

    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    private void safedk_webview_fkw_onAddedJavascriptInterface_d5cc8fe3a6f29e536613b996bf4ad6eb(Object obj, String str) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/bytedance/sdk/component/bly/fkw;->safedk_webview_fkw_onAddedJavascriptInterface_d5cc8fe3a6f29e536613b996bf4ad6eb(Ljava/lang/Object;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: " + this + ", SDK_PACKAGE_NAME: " + g.f53147u + " object is: " + obj + " and name: " + str);
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f53147u);
        if (adNetworkDiscoveryH != null) {
            adNetworkDiscoveryH.a((WebView) this, obj);
        }
        super.addJavascriptInterface(obj, str);
    }

    private void safedk_webview_fkw_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(String str, String str2, String str3, String str4, String str5) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/bytedance/sdk/component/bly/fkw;->safedk_webview_fkw_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: " + str + ", WebView address : " + toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f53147u);
            CreativeInfoManager.a(str, str2, this, g.f53147u);
            SafeDKWebAppInterface.a(g.f53147u, this, str2);
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    private void safedk_webview_fkw_webviewLoadUrl_9734b466488e157cba9b069557de2b55(String str, Map map) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/bytedance/sdk/component/bly/fkw;->safedk_webview_fkw_webviewLoadUrl_9734b466488e157cba9b069557de2b55(Ljava/lang/String;Ljava/util/Map;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl. url: " + str + ", WebView address : " + toString() + "  SDK_PACKAGE_NAME = " + g.f53147u);
            NetworkBridge.logWebviewLoadURLRequest(g.f53147u, this, str);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f53147u);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(str, (String) null, this, g.f53147u);
            }
            SafeDKWebAppInterface.a(g.f53147u, this, str);
        }
        super.loadUrl(str, map);
    }

    private void safedk_webview_fkw_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(String str) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/bytedance/sdk/component/bly/fkw;->safedk_webview_fkw_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + str + ", WebView address : " + toString() + "  SDK_PACKAGE_NAME = " + g.f53147u);
            NetworkBridge.logWebviewLoadURLRequest(g.f53147u, this, str);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f53147u);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(str, (String) null, this, g.f53147u);
            }
            SafeDKWebAppInterface.a(g.f53147u, this, str);
        }
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        ko.vt("TTAD.PangleWebView", "addJavascriptInterface: " + str + ", " + this);
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
        } else {
            safedk_webview_fkw_onAddedJavascriptInterface_d5cc8fe3a6f29e536613b996bf4ad6eb(obj, str);
            this.vt.add(str);
        }
    }

    @Override // android.webkit.WebView
    public final void clearCache(boolean z10) {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        } else {
            super.clearCache(z10);
        }
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        ko.vt("TTAD.PangleWebView", "destroy() called, ".concat(String.valueOf(this)));
        if (this.f12487lh) {
            return;
        }
        this.f12487lh = true;
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public final void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.f12487lh && !this.fkw) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            ko.fkw("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public final void goBack() {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        } else {
            super.goBack();
        }
    }

    @Override // android.webkit.WebView
    public final void goBackOrForward(int i10) {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        } else {
            super.goBackOrForward(i10);
        }
    }

    @Override // android.webkit.WebView
    public final void goForward() {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        } else {
            super.goForward();
        }
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        } else {
            safedk_webview_fkw_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
            return;
        }
        try {
            safedk_webview_fkw_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e10) {
            ko.lh("TTAD.PangleWebView", "loadUrl: ", e10);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map<String, String> map) {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
            return;
        }
        try {
            safedk_webview_fkw_webviewLoadUrl_9734b466488e157cba9b069557de2b55(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e10) {
            ko.lh("TTAD.PangleWebView", "loadUrl: ", e10);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ko.vt("TTAD.PangleWebView", "onAttachedToWindow: ".concat(String.valueOf(this)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ko.vt("TTAD.PangleWebView", "onDetachedFromWindow: ".concat(String.valueOf(this)));
        if (this.yu) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f12487lh || this.fkw) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f12487lh || this.fkw) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "onPause: has destroyed or recycler");
            return;
        }
        try {
            super.onPause();
        } catch (Exception e10) {
            ko.lh("TTAD.PangleWebView", "onPause: ", e10);
        }
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "onResume: has destroyed or recycler");
            return;
        }
        try {
            super.onResume();
        } catch (Exception e10) {
            ko.lh("TTAD.PangleWebView", "onResume: ", e10);
        }
    }

    @Override // android.webkit.WebView
    public final void pauseTimers() {
        ko.vt("TTAD.PangleWebView", "pauseTimers: ");
        if (this.f12487lh || this.fkw) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public final void reload() {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "reload: has destroyed or recycler");
        } else {
            super.reload();
        }
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (this.f12487lh || this.fkw) {
            ko.vt("TTAD.PangleWebView", "removeJavascriptInterface: has destroyed or recycler, name=".concat(String.valueOf(str)));
        } else {
            super.removeJavascriptInterface(str);
            this.vt.remove(str);
        }
    }

    @Override // android.webkit.WebView
    public final void resumeTimers() {
        ko.vt("TTAD.PangleWebView", "resumeTimers: ");
        if (this.f12487lh || this.fkw) {
            return;
        }
        super.resumeTimers();
    }

    public final void setDestroyOnDetached(boolean z10) {
        ko.vt("TTAD.PangleWebView", "setDestroyOnDetached() called with: destroyOnDetached = [" + z10 + C3978d4.j.f31385e);
        this.yu = z10;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        if (this.f12486le == null) {
            ko.vt("arbitrage_click", "mTouchListenerProxy == null");
            super.setOnTouchListener(onTouchListener);
        } else {
            ko.vt("arbitrage_click", "mTouchListenerProxy != null");
            this.f12486le.ouw(onTouchListener);
            super.setOnTouchListener(this.f12486le);
        }
    }

    public final void setRecycler(boolean z10) {
        this.fkw = z10;
    }

    public final void setTouchListenerProxy(lh lhVar) {
        this.f12486le = lhVar;
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (this.f12487lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            ko.lh("TTAD.PangleWebView", "stopLoading: ", e10);
        }
    }
}
