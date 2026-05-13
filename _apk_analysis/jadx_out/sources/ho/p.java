package ho;

import io.a0;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class p {
    public static final void b(@NotNull final SafeCollector<?> safeCollector, @NotNull kotlin.coroutines.d dVar) {
        if (((Number) dVar.fold(0, new sn.p() { // from class: ho.o
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return Integer.valueOf(p.c(safeCollector, ((Integer) obj).intValue(), (d.b) obj2));
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + dVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final int c(SafeCollector safeCollector, int i10, d.b bVar) {
        d.c<?> key = bVar.getKey();
        d.b bVar2 = safeCollector.collectContext.get(key);
        if (key != kotlinx.coroutines.g.H8) {
            if (bVar != bVar2) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) bVar2;
        tn.p.i(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        kotlinx.coroutines.g gVarD = d((kotlinx.coroutines.g) bVar, gVar);
        if (gVarD == gVar) {
            return gVar == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + gVarD + ", expected child of " + gVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    @Nullable
    public static final kotlinx.coroutines.g d(@Nullable kotlinx.coroutines.g gVar, @Nullable kotlinx.coroutines.g gVar2) {
        while (gVar != null) {
            if (gVar == gVar2 || !(gVar instanceof a0)) {
                return gVar;
            }
            gVar = ((a0) gVar).s0();
        }
        return null;
    }
}
