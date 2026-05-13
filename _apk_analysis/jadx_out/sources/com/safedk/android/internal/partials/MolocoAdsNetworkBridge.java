package com.safedk.android.internal.partials;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;

/* JADX INFO: compiled from: MolocoAdsSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class MolocoAdsNetworkBridge {
    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    public static void onAddedJavascriptInterface(WebView webView, Object obj, String str) {
        Logger.d("MolocoAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MolocoAdsNetworkBridge;->onAddedJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: " + webView + ", SDK_PACKAGE_NAME: " + g.D + " object is: " + obj + " and name: " + str);
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.D);
        if (adNetworkDiscoveryH != null) {
            adNetworkDiscoveryH.a(webView, obj);
        }
        webView.addJavascriptInterface(obj, str);
    }

    public static void webviewLoadDataWithBaseURL(WebView webView, String str, String str2, String str3, String str4, String str5) {
        Logger.d("MolocoAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MolocoAdsNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: " + str + ", WebView address : " + webView.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.D);
            CreativeInfoManager.a(str, str2, webView, g.D);
            SafeDKWebAppInterface.a(g.D, webView, str2);
        }
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public static void webviewLoadUrl(WebView webView, String str) {
        Logger.d("MolocoAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MolocoAdsNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + str + ", WebView address : " + webView.toString() + "  SDK_PACKAGE_NAME = " + g.D);
            NetworkBridge.logWebviewLoadURLRequest(g.D, webView, str);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.D);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(str, (String) null, webView, g.D);
            }
            SafeDKWebAppInterface.a(g.D, webView, str);
        }
        webView.loadUrl(str);
    }
}
