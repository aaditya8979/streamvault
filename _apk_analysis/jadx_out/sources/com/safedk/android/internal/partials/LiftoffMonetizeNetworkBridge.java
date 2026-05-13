package com.safedk.android.internal.partials;

import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* JADX INFO: compiled from: LiftoffMonetizeSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class LiftoffMonetizeNetworkBridge {
    public static void okhttp3CallEnqueue(Call call, Callback callback) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->okhttp3CallEnqueue(Lokhttp3/Call;Lokhttp3/Callback;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                Request request = call.request();
                int iIdentityHashCode = System.identityHashCode(request);
                String string = request.url().toString();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.f53039b.get(Integer.valueOf(iIdentityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(g.f53130d, string);
                } else {
                    requestInfo.a(string);
                }
                NetworkBridge.f53039b.put(Integer.valueOf(iIdentityHashCode), requestInfo);
                Logger.d("SafeDKNetwork", "retrofitokhttp3Call_enqueue request id:" + iIdentityHashCode + ", RequestInfo:" + requestInfo + ", isOnUiThread = " + k.c());
            } catch (Throwable th2) {
                Logger.d("SafeDKNetwork", "retrofit|okhttp3.Call enqueue error " + th2.getMessage());
            }
        }
        call.enqueue(callback);
    }

    public static Response okhttp3CallExecute(Call call) throws IOException {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->okhttp3CallExecute(Lokhttp3/Call;)Lokhttp3/Response;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                Request request = call.request();
                int iIdentityHashCode = System.identityHashCode(request);
                String string = request.url().toString();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.f53039b.get(Integer.valueOf(iIdentityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(g.f53130d, string);
                } else {
                    requestInfo.a(string);
                }
                NetworkBridge.f53039b.put(Integer.valueOf(iIdentityHashCode), requestInfo);
                Logger.d("SafeDKNetwork", "retrofitCall_execute request id:" + iIdentityHashCode + ", RequestInfo:" + requestInfo + ", isOnUiThread = " + k.c());
            } catch (Throwable th2) {
                Logger.d("SafeDKNetwork", "retrofit|okhttp3 okhttp3.Call execute error " + th2.getMessage());
            }
        }
        return call.execute();
    }

    public static ResponseBody okhttp3Response_body(Response response) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->okhttp3Response_body(Lokhttp3/Response;)Lokhttp3/ResponseBody;");
        ResponseBody responseBodyBody = response.body();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                int iIdentityHashCode = System.identityHashCode(response);
                NetworkBridge.RequestInfo requestInfoRemove = NetworkBridge.f53039b.remove(Integer.valueOf(iIdentityHashCode));
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body response id " + iIdentityHashCode + ", info " + requestInfoRemove + ", isOnUiThread = " + k.c());
                if (requestInfoRemove != null) {
                    int iIdentityHashCode2 = System.identityHashCode(responseBodyBody);
                    NetworkBridge.f53039b.put(Integer.valueOf(iIdentityHashCode2), requestInfoRemove);
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, removing response Id:" + iIdentityHashCode + ", adding  responseBodyId:" + iIdentityHashCode2 + ", RequestInfo:" + requestInfoRemove);
                } else {
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, skipping response Id:" + iIdentityHashCode);
                }
            } catch (Throwable th2) {
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body error " + th2.getMessage());
            }
        }
        return responseBodyBody;
    }

    public static BufferedSource retrofitExceptionCatchingRequestBody_source(ResponseBody responseBody) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->retrofitExceptionCatchingRequestBody_source(Lokhttp3/ResponseBody;)Lokio/BufferedSource;");
        BufferedSource bufferedSourceSource = responseBody.source();
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return bufferedSourceSource;
        }
        try {
            int iIdentityHashCode = System.identityHashCode(responseBody);
            Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source bodyId " + iIdentityHashCode + " retroReq " + NetworkBridge.f53039b + ", isOnUiThread = " + k.c());
            NetworkBridge.RequestInfo requestInfo = NetworkBridge.f53039b.get(Integer.valueOf(iIdentityHashCode));
            if (requestInfo != null) {
                bufferedSourceSource = CreativeInfoManager.a(requestInfo.a(), requestInfo.b(), bufferedSourceSource, iIdentityHashCode);
                Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source found responseBodyId:" + iIdentityHashCode + ", RequestInfo:" + requestInfo + ", returning Source: " + bufferedSourceSource);
            }
            return bufferedSourceSource;
        } catch (Throwable th2) {
            Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source error " + th2.getMessage());
            return bufferedSourceSource;
        }
    }

    public static void webviewLoadUrl(WebView webView, String str) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + str + ", WebView address : " + webView.toString() + "  SDK_PACKAGE_NAME = " + g.f53130d);
            NetworkBridge.logWebviewLoadURLRequest(g.f53130d, webView, str);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f53130d);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(str, (String) null, webView, g.f53130d);
            }
            SafeDKWebAppInterface.a(g.f53130d, webView, str);
        }
        webView.loadUrl(str);
    }
}
