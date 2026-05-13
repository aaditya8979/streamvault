package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.n2;
import p000do.t1;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class InterruptibleKt {
    @Nullable
    public static final <T> Object b(@NotNull kotlin.coroutines.d dVar, @NotNull sn.a<? extends T> aVar, @NotNull hn.c<? super T> cVar) {
        return p000do.g.g(dVar, new InterruptibleKt$runInterruptible$2(aVar, null), cVar);
    }

    public static /* synthetic */ Object c(kotlin.coroutines.d dVar, sn.a aVar, hn.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return b(dVar, aVar, cVar);
    }

    public static final <T> T d(kotlin.coroutines.d dVar, sn.a<? extends T> aVar) throws Throwable {
        try {
            n2 n2Var = new n2();
            n2Var.A(t1.m(dVar));
            try {
                return aVar.invoke();
            } finally {
                n2Var.x();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
