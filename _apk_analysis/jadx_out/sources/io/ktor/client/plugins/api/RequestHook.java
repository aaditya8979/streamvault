package io.ktor.client.plugins.api;

import al.a;
import al.k;
import cl.d;
import cl.g;
import hn.c;
import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import sn.r;
import tn.p;

/* JADX INFO: compiled from: KtorCallContexts.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RequestHook implements a<r<? super k, ? super d, ? super Object, ? super c<? super bn.r>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final RequestHook f71162a = new RequestHook();

    @Override // al.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull HttpClient httpClient, @NotNull r<? super k, ? super d, Object, ? super c<? super bn.r>, ? extends Object> rVar) {
        p.k(httpClient, "client");
        p.k(rVar, "handler");
        httpClient.n().l(g.f6705h.d(), new RequestHook$install$1(rVar, null));
    }
}
