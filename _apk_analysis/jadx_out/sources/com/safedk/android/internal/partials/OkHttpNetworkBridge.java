package com.safedk.android.internal.partials;

import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* JADX INFO: compiled from: OkHttpSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class OkHttpNetworkBridge {
    public static BufferedSource retrofitExceptionCatchingRequestBody_source(ResponseBody responseBody) {
        Logger.d("OkHttpNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/OkHttpNetworkBridge;->retrofitExceptionCatchingRequestBody_source(Lokhttp3/ResponseBody;)Lokio/BufferedSource;");
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
}
