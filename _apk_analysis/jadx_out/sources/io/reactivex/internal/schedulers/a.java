package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import pm.f;
import xl.s;

/* JADX INFO: compiled from: NewThreadWorker.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends s.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f71681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f71682c;

    public a(ThreadFactory threadFactory) {
        this.f71681b = f.a(threadFactory);
    }

    @Override // xl.s.c
    public bm.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // xl.s.c
    public bm.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f71682c ? EmptyDisposable.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // bm.b
    public void dispose() {
        if (this.f71682c) {
            return;
        }
        this.f71682c = true;
        this.f71681b.shutdownNow();
    }

    public ScheduledRunnable e(Runnable runnable, long j10, TimeUnit timeUnit, em.a aVar) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(tm.a.u(runnable), aVar);
        if (aVar != null && !aVar.a(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.setFuture(j10 <= 0 ? this.f71681b.submit((Callable) scheduledRunnable) : this.f71681b.schedule((Callable) scheduledRunnable, j10, timeUnit));
        } catch (RejectedExecutionException e10) {
            if (aVar != null) {
                aVar.b(scheduledRunnable);
            }
            tm.a.s(e10);
        }
        return scheduledRunnable;
    }

    public bm.b f(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(tm.a.u(runnable));
        try {
            scheduledDirectTask.setFuture(j10 <= 0 ? this.f71681b.submit(scheduledDirectTask) : this.f71681b.schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            tm.a.s(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    public bm.b g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableU = tm.a.u(runnable);
        if (j11 <= 0) {
            pm.b bVar = new pm.b(runnableU, this.f71681b);
            try {
                bVar.a(j10 <= 0 ? this.f71681b.submit(bVar) : this.f71681b.schedule(bVar, j10, timeUnit));
                return bVar;
            } catch (RejectedExecutionException e10) {
                tm.a.s(e10);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableU);
        try {
            scheduledDirectPeriodicTask.setFuture(this.f71681b.scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e11) {
            tm.a.s(e11);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void h() {
        if (this.f71682c) {
            return;
        }
        this.f71682c = true;
        this.f71681b.shutdown();
    }

    @Override // bm.b
    public boolean isDisposed() {
        return this.f71682c;
    }
}
