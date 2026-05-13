package okhttp3.internal.http;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HttpMethod {

    @NotNull
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(@NotNull String str) {
        p.k(str, "method");
        return (p.f(str, "GET") || p.f(str, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(@NotNull String str) {
        p.k(str, "method");
        return p.f(str, "POST") || p.f(str, "PUT") || p.f(str, "PATCH") || p.f(str, "PROPPATCH") || p.f(str, "REPORT");
    }

    public final boolean invalidatesCache(@NotNull String str) {
        p.k(str, "method");
        return p.f(str, "POST") || p.f(str, "PATCH") || p.f(str, "PUT") || p.f(str, "DELETE") || p.f(str, "MOVE");
    }

    public final boolean redirectsToGet(@NotNull String str) {
        p.k(str, "method");
        return !p.f(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(@NotNull String str) {
        p.k(str, "method");
        return p.f(str, "PROPFIND");
    }
}
