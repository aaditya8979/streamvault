package go;

import io.e0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f62662a = new e0(Constraint.NONE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e0 f62663b = new e0("PENDING");

    @NotNull
    public static final <T> l<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) ho.m.f63563a;
        }
        return new StateFlowImpl(t10);
    }

    @NotNull
    public static final <T> d<T> d(@NotNull u<? extends T> uVar, @NotNull kotlin.coroutines.d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        }
        return ((z10 || i10 == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) ? uVar : q.e(uVar, dVar, i10, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(@NotNull l<T> lVar, @NotNull sn.l<? super T, ? extends T> lVar2) {
        a.i iVar;
        do {
            iVar = (Object) lVar.getValue();
        } while (!lVar.b(iVar, lVar2.invoke(iVar)));
    }
}
