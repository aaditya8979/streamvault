package io.ktor.client.plugins;

import cl.d;
import io.ktor.client.HttpClient;
import io.ktor.util.pipeline.InvalidPhaseException;
import org.jetbrains.annotations.NotNull;
import ql.g;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: BodyProgress.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AfterRenderHook implements al.a<q<? super d, ? super jl.c, ? super hn.c<? super jl.c>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AfterRenderHook f71083a = new AfterRenderHook();

    @Override // al.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull HttpClient httpClient, @NotNull q<? super d, ? super jl.c, ? super hn.c<? super jl.c>, ? extends Object> qVar) throws InvalidPhaseException {
        p.k(httpClient, "client");
        p.k(qVar, "handler");
        g gVar = new g("ObservableContent");
        httpClient.n().j(cl.g.f6705h.b(), gVar);
        httpClient.n().l(gVar, new AfterRenderHook$install$1(qVar, null));
    }
}
