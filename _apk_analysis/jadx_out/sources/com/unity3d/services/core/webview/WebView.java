package com.unity3d.services.core.webview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import bn.g;
import cn.v0;
import com.ironsource.C4306ve;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.internal.partials.UnityCoreNetworkBridge;
import com.safedk.android.utils.Logger;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import tn.i;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: WebView.kt */
/* JADX INFO: loaded from: classes9.dex */
public class WebView extends android.webkit.WebView implements IServiceComponent {

    @NotNull
    private final g sdkMetricsSender$delegate;

    @NotNull
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context) {
        this(context, false, null, null, null, 30, null);
        p.k(context, GAMConfig.KEY_CONTEXT);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z10) {
        this(context, z10, null, null, null, 28, null);
        p.k(context, GAMConfig.KEY_CONTEXT);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z10, @NotNull IWebViewBridge iWebViewBridge) {
        this(context, z10, iWebViewBridge, null, null, 24, null);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(iWebViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z10, @NotNull IWebViewBridge iWebViewBridge, @NotNull IInvocationCallbackInvoker iInvocationCallbackInvoker) {
        this(context, z10, iWebViewBridge, iInvocationCallbackInvoker, null, 16, null);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(iWebViewBridge, "webViewBridge");
        p.k(iInvocationCallbackInvoker, "callbackInvoker");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z10, @NotNull IWebViewBridge iWebViewBridge, @NotNull IInvocationCallbackInvoker iInvocationCallbackInvoker, @NotNull IExperiments iExperiments) {
        super(context);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(iWebViewBridge, "webViewBridge");
        p.k(iInvocationCallbackInvoker, "callbackInvoker");
        p.k(iExperiments, C4306ve.f34270d);
        final String str = "";
        this.sdkMetricsSender$delegate = kotlin.b.a(LazyThreadSafetyMode.NONE, new sn.a<SDKMetricsSender>() { // from class: com.unity3d.services.core.webview.WebView$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.request.metrics.SDKMetricsSender, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final SDKMetricsSender invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, t.b(SDKMetricsSender.class));
            }
        });
        final WebViewBridgeInterface webViewBridgeInterface = new WebViewBridgeInterface(iWebViewBridge, iInvocationCallbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z10);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean zIsWebMessageEnabled = iExperiments.isWebMessageEnabled();
        if (zIsWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean zIsFeatureSupported = WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER);
        if (zIsFeatureSupported) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (zIsWebMessageEnabled && zIsFeatureSupported) {
            WebViewCompat.addWebMessageListener(this, "handleInvocation", v0.d("*"), new WebViewCompat.WebMessageListener() { // from class: com.unity3d.services.core.webview.a
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public final void onPostMessage(android.webkit.WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z11, JavaScriptReplyProxy javaScriptReplyProxy) throws JSONException {
                    webViewBridgeInterface.onHandleInvocation(webView, webMessageCompat, uri, z11, javaScriptReplyProxy);
                }
            });
            WebViewCompat.addWebMessageListener(this, "handleCallback", v0.d("*"), new WebViewCompat.WebMessageListener() { // from class: com.unity3d.services.core.webview.b
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public final void onPostMessage(android.webkit.WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z11, JavaScriptReplyProxy javaScriptReplyProxy) throws Exception {
                    webViewBridgeInterface.onHandleCallback(webView, webMessageCompat, uri, z11, javaScriptReplyProxy);
                }
            });
        } else {
            UnityCoreNetworkBridge.onAddedJavascriptInterface(this, webViewBridgeInterface, "webviewbridge");
        }
        applySafeAreaInsets();
    }

    public /* synthetic */ WebView(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i10, i iVar) {
        this(context, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i10 & 16) != 0 ? new Experiments() : iExperiments);
    }

    private final void applySafeAreaInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.unity3d.services.core.webview.d
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return WebView.applySafeAreaInsets$lambda$3(this.f53581b, view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat applySafeAreaInsets$lambda$3(WebView webView, View view, WindowInsetsCompat windowInsetsCompat) {
        Object objM7534constructorimpl;
        p.k(webView, "this$0");
        p.k(view, "v");
        p.k(windowInsetsCompat, "insets");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        p.j(insets, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout());
        p.j(insets2, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Float.valueOf(webView.getContext().getResources().getDisplayMetrics().density));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Float fValueOf = Float.valueOf(1.0f);
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = fValueOf;
        }
        float fFloatValue = ((Number) objM7534constructorimpl).floatValue();
        int iApplySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(insets.left, insets2.left), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets.f4229top, insets2.f4229top), fFloatValue);
        webView.evaluateJavascript(bo.t.j("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '" + iApplySafeAreaInsets$lambda$3$toPx + "px');\n                    root.style.setProperty('--safe-area-inset-right', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(insets.right, insets2.right), fFloatValue) + "px');\n                    root.style.setProperty('--safe-area-inset-top', '" + iApplySafeAreaInsets$lambda$3$toPx2 + "px');\n                    root.style.setProperty('--safe-area-inset-bottom', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(insets.bottom, insets2.bottom), fFloatValue) + "px');\n                })();\n            "), null);
        return windowInsetsCompat;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i10, float f10) {
        return (int) (i10 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateJavascript$lambda$1(WebView webView, String str, ValueCallback valueCallback) {
        p.k(webView, "this$0");
        p.k(str, "$script");
        super.evaluateJavascript(str, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender$delegate.getValue();
    }

    private void safedk_webview_WebView_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(String str) {
        Logger.d("UnityCoreNetwork|SafeDK: Partial-Network> Lcom/unity3d/services/core/webview/WebView;->safedk_webview_WebView_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + str + ", WebView address : " + toString() + "  SDK_PACKAGE_NAME = " + com.safedk.android.utils.g.f53139m);
            NetworkBridge.logWebviewLoadURLRequest(com.safedk.android.utils.g.f53139m, this, str);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(com.safedk.android.utils.g.f53139m);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(str, (String) null, this, com.safedk.android.utils.g.f53139m);
            }
            SafeDKWebAppInterface.a(com.safedk.android.utils.g.f53139m, this, str);
        }
        super.loadUrl(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53139m, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(@NotNull final String str, @Nullable final ValueCallback<String> valueCallback) {
        p.k(str, "script");
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.c
            @Override // java.lang.Runnable
            public final void run() {
                WebView.evaluateJavascript$lambda$1(this.f53578b, str, valueCallback);
            }
        });
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String str) {
        p.k(str, "url");
        DeviceLog.debug("Loading url: " + str);
        safedk_webview_WebView_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(str);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
