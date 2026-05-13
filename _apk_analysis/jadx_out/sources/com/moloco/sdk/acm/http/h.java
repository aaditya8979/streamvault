package com.moloco.sdk.acm.http;

import bn.r;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.plugins.UserAgentKt;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bn.g f45873a = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.acm.http.e
        @Override // sn.a
        public final Object invoke() {
            return h.b();
        }
    });

    public static final r a(uk.h hVar) {
        p.k(hVar, "$this$HttpClient");
        uk.h.n(hVar, UserAgentKt.d(), null, 2, null);
        uk.h.n(hVar, HttpTimeoutKt.m(), null, 2, null);
        return r.f5635a;
    }

    public static final HttpClient b() {
        return uk.j.a(new l() { // from class: com.moloco.sdk.acm.http.g
            @Override // sn.l
            public final Object invoke(Object obj) {
                return h.a((uk.h) obj);
            }
        });
    }

    public static final HttpClient c() {
        return (HttpClient) f45873a.getValue();
    }

    @NotNull
    public static final HttpClient d() {
        return c();
    }
}
