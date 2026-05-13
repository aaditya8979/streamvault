package go;

import ho.j;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CancellableFlowImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g {
    @NotNull
    public static final <T> d<T> a(@NotNull d<? extends T> dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        int i11;
        BufferOverflow bufferOverflow2;
        boolean z10 = true;
        if (!(i10 >= 0 || i10 == -2 || i10 == -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i10 == -1) {
            bufferOverflow2 = BufferOverflow.DROP_OLDEST;
            i11 = 0;
        } else {
            i11 = i10;
            bufferOverflow2 = bufferOverflow;
        }
        return dVar instanceof ho.j ? j.a.a((ho.j) dVar, null, i11, bufferOverflow2, 1, null) : new ho.e(dVar, null, i11, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ d b(d dVar, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return f.d(dVar, i10, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> d<T> c(@NotNull d<? extends T> dVar) {
        return dVar instanceof a ? dVar : new CancellableFlowImpl(dVar);
    }

    public static final void d(kotlin.coroutines.d dVar) {
        if (dVar.get(kotlinx.coroutines.g.H8) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dVar).toString());
    }

    @NotNull
    public static final <T> d<T> e(@NotNull d<? extends T> dVar) {
        return b(dVar, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> d<T> f(@NotNull d<? extends T> dVar, @NotNull kotlin.coroutines.d dVar2) {
        d(dVar2);
        return tn.p.f(dVar2, EmptyCoroutineContext.INSTANCE) ? dVar : dVar instanceof ho.j ? j.a.a((ho.j) dVar, dVar2, 0, null, 6, null) : new ho.e(dVar, dVar2, 0, null, 12, null);
    }
}
