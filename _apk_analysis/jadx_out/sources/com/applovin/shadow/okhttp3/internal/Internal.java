package com.applovin.shadow.okhttp3.internal;

import com.applovin.shadow.okhttp3.Cache;
import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.vungle.ads.internal.ui.AdActivity;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: internal.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Internal {
    @NotNull
    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String str) {
        p.k(builder, "builder");
        p.k(str, "line");
        return builder.addLenient$okhttp(str);
    }

    @NotNull
    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String str, @NotNull String str2) {
        p.k(builder, "builder");
        p.k(str, "name");
        p.k(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }

    public static final void applyConnectionSpec(@NotNull ConnectionSpec connectionSpec, @NotNull SSLSocket sSLSocket, boolean z10) {
        p.k(connectionSpec, "connectionSpec");
        p.k(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z10);
    }

    @Nullable
    public static final Response cacheGet(@NotNull Cache cache, @NotNull Request request) {
        p.k(cache, "cache");
        p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        return cache.get$okhttp(request);
    }

    @NotNull
    public static final String cookieToString(@NotNull Cookie cookie, boolean z10) {
        p.k(cookie, "cookie");
        return cookie.toString$okhttp(z10);
    }

    @Nullable
    public static final Cookie parseCookie(long j10, @NotNull HttpUrl httpUrl, @NotNull String str) {
        p.k(httpUrl, "url");
        p.k(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j10, httpUrl, str);
    }
}
