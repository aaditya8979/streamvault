package pl;

import org.jetbrains.annotations.NotNull;
import rs.c;
import rs.e;
import tn.p;

/* JADX INFO: compiled from: KtorSimpleLoggerJvm.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    @NotNull
    public static final c a(@NotNull String str) {
        p.k(str, "name");
        c cVarK = e.k(str);
        p.j(cVarK, "getLogger(...)");
        return cVarK;
    }
}
