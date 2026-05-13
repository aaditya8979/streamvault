package ho;

import io.a0;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FlowCoroutine.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g<T> extends a0<T> {
    public g(@NotNull kotlin.coroutines.d dVar, @NotNull hn.c<? super T> cVar) {
        super(dVar, cVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean g0(@NotNull Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return a0(th2);
    }
}
