package com.moloco.sdk.acm.http;

import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HttpClient f45859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f45860c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f45858a = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final bn.g f45861d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.acm.http.c
        @Override // sn.a
        public final Object invoke() {
            return d.c();
        }
    });

    public static final f c() {
        HttpClient httpClient = f45859b;
        String str = null;
        if (httpClient == null) {
            p.C("httpClient");
            httpClient = null;
        }
        String str2 = f45860c;
        if (str2 == null) {
            p.C("apiUrl");
        } else {
            str = str2;
        }
        return new f(httpClient, str);
    }

    @NotNull
    public final j a() {
        return (j) f45861d.getValue();
    }

    public final void b(@NotNull HttpClient httpClient, @NotNull String str) {
        p.k(httpClient, "httpClient");
        p.k(str, "apiUrl");
        if (f45859b == null) {
            f45859b = httpClient;
            f45860c = str;
        }
    }
}
