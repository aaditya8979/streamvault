package com.fyber.inneractive.sdk.network;

import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HttpURLConnection f16983g;

    public j(HttpURLConnection httpURLConnection, int i10, FilterInputStream filterInputStream, Map map, String str) {
        this.f16983g = httpURLConnection;
        this.f16988a = i10;
        this.f16990c = filterInputStream;
        this.f16991d = map;
        this.f16992e = str;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        try {
            HttpURLConnection httpURLConnection = this.f16983g;
            if (httpURLConnection != null) {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            }
        } catch (Throwable unused) {
        }
        super.a();
    }
}
