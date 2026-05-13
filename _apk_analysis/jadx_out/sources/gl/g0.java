package gl;

import io.ktor.http.URLProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: URLProtocol.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 {
    public static final boolean a(@NotNull URLProtocol uRLProtocol) {
        tn.p.k(uRLProtocol, "<this>");
        return tn.p.f(uRLProtocol.getName(), "https") || tn.p.f(uRLProtocol.getName(), "wss");
    }

    public static final boolean b(@NotNull URLProtocol uRLProtocol) {
        tn.p.k(uRLProtocol, "<this>");
        return tn.p.f(uRLProtocol.getName(), "ws") || tn.p.f(uRLProtocol.getName(), "wss");
    }
}
