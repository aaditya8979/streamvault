package androidx.core.util;

import bn.r;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes12.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {

    @NotNull
    private final hn.c<r> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(@NotNull hn.c<? super r> cVar) {
        super(false);
        this.continuation = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            hn.c<r> cVar = this.continuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m7534constructorimpl(r.f5635a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
