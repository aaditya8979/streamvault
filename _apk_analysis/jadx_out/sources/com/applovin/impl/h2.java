package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class h2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8415b;

    public h2(com.applovin.impl.sdk.k kVar) {
        this.f8414a = kVar;
        this.f8415b = kVar.O();
    }

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.f8414a.a(x4.T2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f8414a.a(x4.U2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int iHttpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
        this.f8414a.D().a("loadResource", str, iHttpUrlConnectionGetResponseCode, httpURLConnection.getResponseMessage());
        if (r0.a(iHttpUrlConnectionGetResponseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8415b.a("HttpUrlConnectionLoader", "Opened stream to resource " + str);
        }
        InputStream inputStreamUrlConnectionGetInputStream = AppLovinNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", mapHashMap);
        this.f8414a.g().d(d2.Q, mapHashMap);
        return inputStreamUrlConnectionGetInputStream;
    }
}
