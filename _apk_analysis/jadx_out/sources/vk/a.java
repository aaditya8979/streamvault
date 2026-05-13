package vk;

import gl.m;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DelegatedCall.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends HttpClientCall {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull HttpClient httpClient, @NotNull HttpClientCall httpClientCall, @NotNull l<? super dl.c, ? extends io.ktor.utils.io.a> lVar, @NotNull m mVar) {
        super(httpClient);
        p.k(httpClient, "client");
        p.k(httpClientCall, "originCall");
        p.k(lVar, "responseContent");
        p.k(mVar, "responseHeaders");
        j(new c(this, httpClientCall.d()));
        k(new d(this, httpClientCall.e(), lVar, mVar));
    }
}
