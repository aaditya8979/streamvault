package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringJsonLexer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 {
    @NotNull
    public static final h1 a(@NotNull xo.a aVar, @NotNull String str) {
        tn.p.k(aVar, "json");
        tn.p.k(str, "source");
        return !aVar.e().a() ? new h1(str) : new j1(str);
    }
}
