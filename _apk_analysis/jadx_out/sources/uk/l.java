package uk;

import bn.r;
import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import java.io.IOException;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class l {
    @NotNull
    public static final <T extends xk.f> HttpClient b(@NotNull xk.g<? extends T> gVar, @NotNull sn.l<? super h<T>, r> lVar) {
        p.k(gVar, "engineFactory");
        p.k(lVar, "block");
        h hVar = new h();
        lVar.invoke(hVar);
        final HttpClientEngine httpClientEngineA = gVar.a(hVar.g());
        HttpClient httpClient = new HttpClient(httpClientEngineA, hVar, true);
        d.b bVar = httpClient.getCoroutineContext().get(kotlinx.coroutines.g.H8);
        p.h(bVar);
        ((kotlinx.coroutines.g) bVar).f(new sn.l() { // from class: uk.k
            @Override // sn.l
            public final Object invoke(Object obj) {
                return l.c(httpClientEngineA, (Throwable) obj);
            }
        });
        return httpClient;
    }

    public static final r c(HttpClientEngine httpClientEngine, Throwable th2) throws IOException {
        httpClientEngine.close();
        return r.f5635a;
    }
}
