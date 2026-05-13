package gl;

import io.ktor.http.Url;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Url.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 {
    @NotNull
    public static final String a(@NotNull Url url) {
        tn.p.k(url, "<this>");
        return b(url) + i0.i(url);
    }

    @NotNull
    public static final String b(@NotNull Url url) {
        tn.p.k(url, "<this>");
        StringBuilder sb2 = new StringBuilder();
        i0.g(sb2, url.getEncodedUser(), url.getEncodedPassword());
        return sb2.toString();
    }
}
