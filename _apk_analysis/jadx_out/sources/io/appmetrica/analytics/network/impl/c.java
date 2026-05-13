package io.appmetrica.analytics.network.impl;

import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkClient f68227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Request f68228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f68229c;

    public c(@NotNull NetworkClient networkClient, @NotNull Request request) {
        this(networkClient, request, new d());
    }

    @VisibleForTesting
    public c(@NotNull NetworkClient networkClient, @NotNull Request request, @NotNull d dVar) {
        this.f68227a = networkClient;
        this.f68228b = request;
        this.f68229c = dVar;
    }

    public final void a(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        Iterator<T> it = this.f68228b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f68227a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f68227a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f68227a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f68227a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f68228b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f68227a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:11|(9:58|12|(2:14|(3:50|16|17))|27|54|28|48|29|30)|38|52|39|40|41) */
    @Override // io.appmetrica.analytics.network.internal.Call
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.network.internal.Response execute() {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.network.impl.c.execute():io.appmetrica.analytics.network.internal.Response");
    }
}
