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

/* JADX INFO: compiled from: IronSourceSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class IronSourceNetworkBridge {
    public static void httpUrlConnectionDisconnect(HttpURLConnection httpURLConnection) {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
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
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = httpURLConnection.getResponseCode();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o() && responseCode >= 200 && responseCode < 300) {
            String string = httpURLConnection.getURL().toString();
            Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode url=" + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f53132f);
            CreativeInfoManager.a(g.f53132f, string, httpURLConnection.getInputStream(), httpURLConnection.getHeaderFields());
        }
        return responseCode;
    }

    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    public static void onAddedJavascriptInterface(WebView webView, Object obj, String str) {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->onAddedJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: " + webView + ", SDK_PACKAGE_NAME: " + g.f53132f + " object is: " + obj + " and name: " + str);
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f53132f);
        if (adNetworkDiscoveryH != null) {
            adNetworkDiscoveryH.a(webView, obj);
        }
        webView.addJavascriptInterface(obj, str);
    }

    public static InputStream urlConnectionGetInputStream(URLConnection uRLConnection) throws IOException {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return uRLConnection.getInputStream();
        }
        String string = uRLConnection.getURL().toString();
        Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : " + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME =  " + g.f53132f);
        Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
        InputStream inputStream = null;
        try {
            inputStream = uRLConnection.getInputStream();
        } catch (Throwable th2) {
            Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : " + th2.getMessage());
        }
        InputStream inputStreamA = CreativeInfoManager.a(g.f53132f, string, inputStream, headerFields);
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
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return uRLConnection.getOutputStream();
        }
        OutputStream outputStream = uRLConnection.getOutputStream();
        String string = uRLConnection.getURL().toString();
        Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=" + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f53132f);
        return CreativeInfoManager.a(g.f53132f, string, outputStream);
    }

    public static void webviewLoadUrl(WebView webView, String str) {
        Logger.d("IronSourceNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/IronSourceNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + str + ", WebView address : " + webView.toString() + "  SDK_PACKAGE_NAME = " + g.f53132f);
            NetworkBridge.logWebviewLoadURLRequest(g.f53132f, webView, str);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f53132f);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(str, (String) null, webView, g.f53132f);
            }
            SafeDKWebAppInterface.a(g.f53132f, webView, str);
        }
        webView.loadUrl(str);
    }
}
