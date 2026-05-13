package kotlinx.coroutines.flow.internal;

import bn.r;
import go.d;
import go.e;
import hn.c;
import ho.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.q;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CombineKt {
    @Nullable
    public static final <R, T> Object a(@NotNull e<? super R> eVar, @NotNull d<? extends T>[] dVarArr, @NotNull a<T[]> aVar, @NotNull q<? super e<? super R>, ? super T[], ? super c<? super r>, ? extends Object> qVar, @NotNull c<? super r> cVar) {
        Object objA = h.a(new CombineKt$combineInternal$2(dVarArr, aVar, qVar, eVar, null), cVar);
        return objA == in.a.g() ? objA : r.f5635a;
    }
}
