package io.ktor.client.plugins;

import cl.d;
import cl.g;
import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: HttpPlainText.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class RenderRequestHook implements al.a<q<? super d, ? super Object, ? super hn.c<? super jl.c>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final RenderRequestHook f71155a = new RenderRequestHook();

    @Override // al.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull HttpClient httpClient, @NotNull q<? super d, Object, ? super hn.c<? super jl.c>, ? extends Object> qVar) {
        p.k(httpClient, "client");
        p.k(qVar, "handler");
        httpClient.n().l(g.f6705h.b(), new RenderRequestHook$install$1(qVar, null));
    }
}
