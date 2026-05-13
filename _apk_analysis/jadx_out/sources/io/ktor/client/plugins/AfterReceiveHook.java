package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: BodyProgress.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AfterReceiveHook implements al.a<p<? super dl.c, ? super hn.c<? super dl.c>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AfterReceiveHook f71082a = new AfterReceiveHook();

    @Override // al.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull HttpClient httpClient, @NotNull p<? super dl.c, ? super hn.c<? super dl.c>, ? extends Object> pVar) {
        tn.p.k(httpClient, "client");
        tn.p.k(pVar, "handler");
        httpClient.m().l(dl.b.f59808h.a(), new AfterReceiveHook$install$1(pVar, null));
    }
}
