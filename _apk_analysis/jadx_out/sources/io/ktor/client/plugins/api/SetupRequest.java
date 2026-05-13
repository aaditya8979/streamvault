package io.ktor.client.plugins.api;

import al.a;
import bn.r;
import cl.d;
import cl.g;
import hn.c;
import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: CommonHooks.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SetupRequest implements a<p<? super d, ? super c<? super r>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SetupRequest f71166a = new SetupRequest();

    @Override // al.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull HttpClient httpClient, @NotNull p<? super d, ? super c<? super r>, ? extends Object> pVar) {
        tn.p.k(httpClient, "client");
        tn.p.k(pVar, "handler");
        httpClient.n().l(g.f6705h.a(), new SetupRequest$install$1(pVar, null));
    }
}
