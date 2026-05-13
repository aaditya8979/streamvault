package p000do;

import bn.r;
import io.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends j1 implements r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Executor f59862c;

    public k1(@NotNull Executor executor) {
        this.f59862c = executor;
        a.a(I());
    }

    @Override // p000do.r0
    @NotNull
    public y0 A(long j10, @NotNull Runnable runnable, @NotNull d dVar) {
        Executor executorI = I();
        ScheduledExecutorService scheduledExecutorService = executorI instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorI : null;
        ScheduledFuture<?> scheduledFutureM = scheduledExecutorService != null ? M(scheduledExecutorService, runnable, dVar, j10) : null;
        return scheduledFutureM != null ? new x0(scheduledFutureM) : n0.f59868h.A(j10, runnable, dVar);
    }

    @Override // p000do.j1
    @NotNull
    public Executor I() {
        return this.f59862c;
    }

    public final void L(d dVar, RejectedExecutionException rejectedExecutionException) {
        t1.c(dVar, h1.a("The task was rejected", rejectedExecutionException));
    }

    public final ScheduledFuture<?> M(ScheduledExecutorService scheduledExecutorService, Runnable runnable, d dVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            L(dVar, e10);
            return null;
        }
    }

    @Override // p000do.r0
    public void a(long j10, @NotNull k<? super r> kVar) {
        Executor executorI = I();
        ScheduledExecutorService scheduledExecutorService = executorI instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorI : null;
        ScheduledFuture<?> scheduledFutureM = scheduledExecutorService != null ? M(scheduledExecutorService, new f2(this, kVar), kVar.getContext(), j10) : null;
        if (scheduledFutureM != null) {
            n.c(kVar, new j(scheduledFutureM));
        } else {
            n0.f59868h.a(j10, kVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorI = I();
        ExecutorService executorService = executorI instanceof ExecutorService ? (ExecutorService) executorI : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // p000do.h0
    public void dispatch(@NotNull d dVar, @NotNull Runnable runnable) {
        try {
            Executor executorI = I();
            b.a();
            executorI.execute(runnable);
        } catch (RejectedExecutionException e10) {
            b.a();
            L(dVar, e10);
            w0.b().dispatch(dVar, runnable);
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof k1) && ((k1) obj).I() == I();
    }

    public int hashCode() {
        return System.identityHashCode(I());
    }

    @Override // p000do.h0
    @NotNull
    public String toString() {
        return I().toString();
    }
}
