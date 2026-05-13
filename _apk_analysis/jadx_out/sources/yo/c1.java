package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReaderJsonLexer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 {
    @NotNull
    public static final b1 a(@NotNull xo.a aVar, @NotNull f0 f0Var, @NotNull char[] cArr) {
        tn.p.k(aVar, "json");
        tn.p.k(f0Var, "reader");
        tn.p.k(cArr, "buffer");
        return !aVar.e().a() ? new b1(f0Var, cArr) : new d1(f0Var, cArr);
    }

    public static /* synthetic */ b1 b(xo.a aVar, f0 f0Var, char[] cArr, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cArr = p.f97972c.d();
        }
        return a(aVar, f0Var, cArr);
    }
}
