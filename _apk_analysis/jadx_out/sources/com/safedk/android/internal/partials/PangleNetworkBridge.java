package com.safedk.android.internal.partials;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PangleSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class PangleNetworkBridge {
    public static void httpUrlConnectionDisconnect(HttpURLConnection httpURLConnection) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                Logger.d("SafeDKNetwork", "httpUrlConnectionDisconnect, isOnUiThread = " + k.c());
                f fVarRemove = NetworkBridge.f53038a.remove(httpURLConnection);
                if (fVarRemove != null) {
                    fVarRemove.a();
                }
            } catch (Throwable th2) {
            }
        }
        httpURLConnection.disconnect();
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection httpURLConnection) throws IOException {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = httpURLConnection.getResponseCode();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o() && responseCode >= 200 && responseCode < 300) {
            String string = httpURLConnection.getURL().toString();
            Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode url=" + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f53147u);
            CreativeInfoManager.a(g.f53147u, string, httpURLConnection.getInputStream(), httpURLConnection.getHeaderFields());
        }
        return responseCode;
    }

    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    public static void onAddedJavascriptInterface(WebView webView, Object obj, String str) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->onAddedJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: " + webView + ", SDK_PACKAGE_NAME: " + g.f53147u + " object is: " + obj + " and name: " + str);
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f53147u);
        if (adNetworkDiscoveryH != null) {
            adNetworkDiscoveryH.a(webView, obj);
        }
        webView.addJavascriptInterface(obj, str);
    }

    public static InputStream urlConnectionGetInputStream(URLConnection uRLConnection) throws IOException {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return uRLConnection.getInputStream();
        }
        String string = uRLConnection.getURL().toString();
        Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : " + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME =  " + g.f53147u);
        Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
        InputStream inputStream = null;
        try {
            inputStream = uRLConnection.getInputStream();
        } catch (Throwable th2) {
            Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : " + th2.getMessage());
        }
        InputStream inputStreamA = CreativeInfoManager.a(g.f53147u, string, inputStream, headerFields);
        if (!(uRLConnection instanceof HttpURLConnection) || !(inputStreamA instanceof f)) {
            return inputStreamA;
        }
        Logger.d("SafeDKNetwork", "following HttpURLConnection:" + uRLConnection + " and stream: " + inputStreamA);
        f fVar = (f) inputStreamA;
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        NetworkBridge.f53038a.put(httpURLConnection, fVar);
        fVar.a(httpURLConnection);
        return inputStreamA;
    }

    public static OutputStream urlConnectionGetOutputStream(URLConnection uRLConnection) throws IOException {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return uRLConnection.getOutputStream();
        }
        OutputStream outputStream = uRLConnection.getOutputStream();
        String string = uRLConnection.getURL().toString();
        Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=" + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f53147u);
        return CreativeInfoManager.a(g.f53147u, string, outputStream);
    }

    public static void webviewLoadDataWithBaseURL(WebView webView, String str, String str2, String str3, String str4, String str5) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: " + str + ", WebView address : " + webView.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f53147u);
            CreativeInfoManager.a(str, str2, webView, g.f53147u);
            SafeDKWebAppInterface.a(g.f53147u, webView, str2);
        }
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public static void webviewLoadUrl(WebView webView, String str) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + str + ", WebView address : " + webView.toString() + "  SDK_PACKAGE_NAME = " + g.f53147u);
            NetworkBridge.logWebviewLoadURLRequest(g.f53147u, webView, str);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f53147u);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(str, (String) null, webView, g.f53147u);
            }
            SafeDKWebAppInterface.a(g.f53147u, webView, str);
        }
        webView.loadUrl(str);
    }

    public static void webviewLoadUrl(WebView webView, String str, Map<String, String> map) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl. url: " + str + ", WebView address : " + webView.toString() + "  SDK_PACKAGE_NAME = " + g.f53147u);
            NetworkBridge.logWebviewLoadURLRequest(g.f53147u, webView, str);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f53147u);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(str, (String) null, webView, g.f53147u);
            }
            SafeDKWebAppInterface.a(g.f53147u, webView, str);
        }
        webView.loadUrl(str, map);
    }
}
