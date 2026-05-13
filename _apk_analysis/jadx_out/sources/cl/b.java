package cl;

import gl.u;
import gl.x;
import io.ktor.client.call.HttpClientCall;
import io.ktor.http.Url;
import org.jetbrains.annotations.NotNull;
import p000do.l0;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface b extends u, l0 {

    /* JADX INFO: compiled from: HttpRequest.kt */
    public static final class a {
        @NotNull
        public static kotlin.coroutines.d a(@NotNull b bVar) {
            return bVar.L().getCoroutineContext();
        }
    }

    @NotNull
    HttpClientCall L();

    @NotNull
    kl.b getAttributes();

    @NotNull
    kotlin.coroutines.d getCoroutineContext();

    @NotNull
    x getMethod();

    @NotNull
    Url getUrl();
}
