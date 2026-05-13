package p000do;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import p000do.d1;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e1 extends c1 {
    @NotNull
    public abstract Thread X();

    public void Y(long j10, @NotNull d1.c cVar) {
        n0.f59868h.p0(j10, cVar);
    }

    public final void Z() {
        Thread threadX = X();
        if (Thread.currentThread() != threadX) {
            b.a();
            LockSupport.unpark(threadX);
        }
    }
}
