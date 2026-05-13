package io.ktor.client.plugins;

import cl.g;
import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class RequestError implements al.a<q<? super cl.b, ? super Throwable, ? super hn.c<? super Throwable>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final RequestError f71156a = new RequestError();

    @Override // al.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull HttpClient httpClient, @NotNull q<? super cl.b, ? super Throwable, ? super hn.c<? super Throwable>, ? extends Object> qVar) {
        p.k(httpClient, "client");
        p.k(qVar, "handler");
        httpClient.n().l(g.f6705h.a(), new RequestError$install$1(qVar, null));
    }
}
