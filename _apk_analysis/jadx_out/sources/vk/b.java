package vk;

import gl.m;
import io.ktor.client.call.HttpClientCall;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DelegatedCall.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    @NotNull
    public static final HttpClientCall a(@NotNull HttpClientCall httpClientCall, @NotNull m mVar, @NotNull l<? super dl.c, ? extends io.ktor.utils.io.a> lVar) {
        p.k(httpClientCall, "<this>");
        p.k(mVar, "headers");
        p.k(lVar, "content");
        return new a(httpClientCall.c(), httpClientCall, lVar, mVar);
    }

    public static /* synthetic */ HttpClientCall b(HttpClientCall httpClientCall, m mVar, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = httpClientCall.e().getHeaders();
        }
        return a(httpClientCall, mVar, lVar);
    }
}
