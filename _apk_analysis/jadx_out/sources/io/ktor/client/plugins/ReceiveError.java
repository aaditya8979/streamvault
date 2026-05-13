package io.ktor.client.plugins;

import dl.e;
import io.ktor.client.HttpClient;
import io.ktor.util.pipeline.InvalidPhaseException;
import org.jetbrains.annotations.NotNull;
import ql.g;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ReceiveError implements al.a<q<? super cl.b, ? super Throwable, ? super hn.c<? super Throwable>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ReceiveError f71154a = new ReceiveError();

    @Override // al.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull HttpClient httpClient, @NotNull q<? super cl.b, ? super Throwable, ? super hn.c<? super Throwable>, ? extends Object> qVar) throws InvalidPhaseException {
        p.k(httpClient, "client");
        p.k(qVar, "handler");
        g gVar = new g("BeforeReceive");
        httpClient.o().k(e.f59815h.b(), gVar);
        httpClient.o().l(gVar, new ReceiveError$install$1(qVar, null));
    }
}
