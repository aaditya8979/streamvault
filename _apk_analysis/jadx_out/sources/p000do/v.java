package p000do;

import kotlin.Result;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class v {
    @NotNull
    public static final <T> t<T> a(T t10) {
        u uVar = new u(null);
        uVar.n(t10);
        return uVar;
    }

    @NotNull
    public static final <T> t<T> b(@Nullable g gVar) {
        return new u(gVar);
    }

    public static /* synthetic */ t c(g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = null;
        }
        return b(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@NotNull t<T> tVar, @NotNull Object obj) {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        return thM7537exceptionOrNullimpl == null ? tVar.n(obj) : tVar.b(thM7537exceptionOrNullimpl);
    }
}
