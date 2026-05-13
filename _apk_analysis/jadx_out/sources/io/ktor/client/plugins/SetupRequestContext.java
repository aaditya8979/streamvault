package io.ktor.client.plugins;

import bn.r;
import cl.d;
import cl.g;
import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: HttpRequestLifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SetupRequestContext implements al.a<q<? super d, ? super l<? super hn.c<? super r>, ? extends Object>, ? super hn.c<? super r>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SetupRequestContext f71158a = new SetupRequestContext();

    @Override // al.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull HttpClient httpClient, @NotNull q<? super d, ? super l<? super hn.c<? super r>, ? extends Object>, ? super hn.c<? super r>, ? extends Object> qVar) {
        p.k(httpClient, "client");
        p.k(qVar, "handler");
        httpClient.n().l(g.f6705h.a(), new SetupRequestContext$install$1(qVar, null));
    }
}
