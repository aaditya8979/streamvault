package p000do;

import hn.c;
import in.a;
import jn.f;
import jo.b;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: Supervisor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j2 {
    @NotNull
    public static final w a(@Nullable g gVar) {
        return new i2(gVar);
    }

    public static /* synthetic */ w b(g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = null;
        }
        return a(gVar);
    }

    @Nullable
    public static final <R> Object c(@NotNull p<? super l0, ? super c<? super R>, ? extends Object> pVar, @NotNull c<? super R> cVar) {
        h2 h2Var = new h2(cVar.getContext(), cVar);
        Object objD = b.d(h2Var, h2Var, pVar);
        if (objD == a.g()) {
            f.c(cVar);
        }
        return objD;
    }
}
