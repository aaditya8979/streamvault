package com.safedk.android.internal.partials;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;

/* JADX INFO: compiled from: UnityAdsSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class UnityAdsNetworkBridge {
    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    public static void onAddedJavascriptInterface(WebView webView, Object obj, String str) {
        Logger.d("UnityAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityAdsNetworkBridge;->onAddedJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: " + webView + ", SDK_PACKAGE_NAME: com.unity3d.ads object is: " + obj + " and name: " + str);
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h("com.unity3d.ads");
        if (adNetworkDiscoveryH != null) {
            adNetworkDiscoveryH.a(webView, obj);
        }
        webView.addJavascriptInterface(obj, str);
    }

    public static void webviewLoadData(WebView webView, String str, String str2, String str3) {
        Logger.d("UnityAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityAdsNetworkBridge;->webviewLoadData(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        boolean z10 = SafeDK.getInstance() != null && SafeDK.getInstance().o();
        Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : " + webView + ", isSafeDKInitialized = " + z10 + ", SDK_PACKAGE_NAME = com.unity3d.ads");
        if (z10) {
            CreativeInfoManager.a((String) null, str, webView, "com.unity3d.ads");
            SafeDKWebAppInterface.a("com.unity3d.ads", webView, str);
        }
        webView.loadData(str, str2, str3);
    }

    public static void webviewLoadDataWithBaseURL(WebView webView, String str, String str2, String str3, String str4, String str5) {
        Logger.d("UnityAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityAdsNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: " + str + ", WebView address : " + webView.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = com.unity3d.ads");
            CreativeInfoManager.a(str, str2, webView, "com.unity3d.ads");
            SafeDKWebAppInterface.a("com.unity3d.ads", webView, str2);
        }
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public static void webviewLoadUrl(WebView webView, String str) {
        Logger.d("UnityAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityAdsNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + str + ", WebView address : " + webView.toString() + "  SDK_PACKAGE_NAME = com.unity3d.ads");
            NetworkBridge.logWebviewLoadURLRequest("com.unity3d.ads", webView, str);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h("com.unity3d.ads");
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(str, (String) null, webView, "com.unity3d.ads");
            }
            SafeDKWebAppInterface.a("com.unity3d.ads", webView, str);
        }
        webView.loadUrl(str);
    }
}
