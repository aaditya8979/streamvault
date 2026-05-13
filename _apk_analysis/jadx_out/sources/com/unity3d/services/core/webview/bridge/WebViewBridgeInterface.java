package com.unity3d.services.core.webview.bridge;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import bo.d0;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: WebViewBridgeInterface.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class WebViewBridgeInterface {

    @NotNull
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;

    @NotNull
    private final IWebViewBridge webViewBridge;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewBridgeInterface() {
        this(null);
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>()V");
        CreativeInfoManager.onWebviewInterfaceConstruction(g.f53139m, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private WebViewBridgeInterface(StatsEvent statsEvent) {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>()V");
        if ("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>()V" == 0) {
        } else {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewBridgeInterface(@NotNull IWebViewBridge iWebViewBridge, @NotNull IInvocationCallbackInvoker iInvocationCallbackInvoker) {
        this(iWebViewBridge, iInvocationCallbackInvoker, null);
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;)V");
        CreativeInfoManager.onWebviewInterfaceConstruction(g.f53139m, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i10, i iVar) {
        this(iWebViewBridge, iInvocationCallbackInvoker, i10, iVar, null);
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;ILtn/i;)V");
        CreativeInfoManager.onWebviewInterfaceConstruction(g.f53139m, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i10, i iVar, StatsEvent statsEvent) {
        this(SharedInstances.INSTANCE.getWebViewBridge(), SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker());
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;ILtn/i;)V");
        if ("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;ILtn/i;)V" != 0) {
            this((i10 & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
            return;
        }
        int i11 = i10 & 1;
        int i12 = i10 & 2;
    }

    private WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, StatsEvent statsEvent) {
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;)V");
        if ("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;)V" == 0) {
            p.k(iWebViewBridge, "webViewBridge");
            p.k(iInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        } else {
            p.k(iWebViewBridge, "webViewBridge");
            p.k(iInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
            this.webViewBridge = iWebViewBridge;
            this.webViewAppInvocationCallbackInvoker = iInvocationCallbackInvoker;
        }
    }

    @JavascriptInterface
    public final void handleCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) throws Exception {
        p.k(str, "callbackId");
        p.k(str2, "callbackStatus");
        p.k(str3, "rawParameters");
        DeviceLog.debug("handleCallback " + str + ' ' + str2 + ' ' + str3);
        this.webViewBridge.handleCallback(str, str2, JSONArrayExtensionsKt.toTypedArray(new JSONArray(str3)));
    }

    @JavascriptInterface
    public final void handleInvocation(@NotNull String str) throws JSONException {
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;->handleInvocation(Ljava/lang/String;)V");
        CreativeInfoManager.onHandleInvocation(g.f53139m, this, str);
        safedk_WebViewBridgeInterface_handleInvocation_b28daaa65b43c0e84aea26fd798d0398(str);
    }

    public final void onHandleCallback(@NotNull WebView webView, @NotNull WebMessageCompat webMessageCompat, @NotNull Uri uri, boolean z10, @NotNull JavaScriptReplyProxy javaScriptReplyProxy) throws Exception {
        p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(webMessageCompat, "message");
        p.k(uri, "sourceOrigin");
        p.k(javaScriptReplyProxy, "replyProxy");
        String data = webMessageCompat.getData();
        if (z10) {
            if (data == null || d0.u0(data)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(data);
            String string = jSONObject.getString("id");
            String string2 = jSONObject.getString("status");
            String string3 = jSONObject.getString("parameters");
            p.j(string, "callbackId");
            p.j(string2, "callbackStatus");
            p.j(string3, "rawParameters");
            handleCallback(string, string2, string3);
        }
    }

    public final void onHandleInvocation(@NotNull WebView webView, @NotNull WebMessageCompat webMessageCompat, @NotNull Uri uri, boolean z10, @NotNull JavaScriptReplyProxy javaScriptReplyProxy) throws JSONException {
        p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(webMessageCompat, "message");
        p.k(uri, "sourceOrigin");
        p.k(javaScriptReplyProxy, "replyProxy");
        String data = webMessageCompat.getData();
        if (z10) {
            if (data == null || d0.u0(data)) {
                return;
            }
            handleInvocation(data);
        }
    }

    @JavascriptInterface
    public void safedk_WebViewBridgeInterface_handleInvocation_b28daaa65b43c0e84aea26fd798d0398(String str) throws JSONException {
        p.k(str, "data");
        DeviceLog.debug("handleInvocation " + str);
        JSONArray jSONArray = new JSONArray(str);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            p.i(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            p.i(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            p.i(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            p.i(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            p.i(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensionsKt.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }
}
