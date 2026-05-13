package io.ktor.client.plugins.api;

import al.a;
import al.l;
import dl.c;
import dl.e;
import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import sn.s;
import tn.p;

/* JADX INFO: compiled from: KtorCallContexts.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class TransformResponseBodyHook implements a<s<? super l, ? super c, ? super io.ktor.utils.io.a, ? super rl.a, ? super hn.c<? super Object>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TransformResponseBodyHook f71167a = new TransformResponseBodyHook();

    @Override // al.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull HttpClient httpClient, @NotNull s<? super l, ? super c, ? super io.ktor.utils.io.a, ? super rl.a, ? super hn.c<Object>, ? extends Object> sVar) {
        p.k(httpClient, "client");
        p.k(sVar, "handler");
        httpClient.o().l(e.f59815h.c(), new TransformResponseBodyHook$install$1(sVar, null));
    }
}
