package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import pm.f;
import xl.s;

/* JADX INFO: compiled from: SingleScheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final RxThreadFactory f71683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ScheduledExecutorService f71684e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f71685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f71686c;

    /* JADX INFO: compiled from: SingleScheduler.java */
    public static final class a extends s.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f71687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bm.a f71688c = new bm.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f71689d;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f71687b = scheduledExecutorService;
        }

        @Override // xl.s.c
        public bm.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f71689d) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(tm.a.u(runnable), this.f71688c);
            this.f71688c.a(scheduledRunnable);
            try {
                scheduledRunnable.setFuture(j10 <= 0 ? this.f71687b.submit((Callable) scheduledRunnable) : this.f71687b.schedule((Callable) scheduledRunnable, j10, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e10) {
                dispose();
                tm.a.s(e10);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // bm.b
        public void dispose() {
            if (this.f71689d) {
                return;
            }
            this.f71689d = true;
            this.f71688c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f71689d;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f71684e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f71683d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public b() {
        this(f71683d);
    }

    public b(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f71686c = atomicReference;
        this.f71685b = threadFactory;
        atomicReference.lazySet(f(threadFactory));
    }

    public static ScheduledExecutorService f(ThreadFactory threadFactory) {
        return f.a(threadFactory);
    }

    @Override // xl.s
    public s.c a() {
        return new a(this.f71686c.get());
    }

    @Override // xl.s
    public bm.b d(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(tm.a.u(runnable));
        try {
            scheduledDirectTask.setFuture(j10 <= 0 ? this.f71686c.get().submit(scheduledDirectTask) : this.f71686c.get().schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            tm.a.s(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // xl.s
    public bm.b e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableU = tm.a.u(runnable);
        if (j11 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableU);
            try {
                scheduledDirectPeriodicTask.setFuture(this.f71686c.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e10) {
                tm.a.s(e10);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f71686c.get();
        pm.b bVar = new pm.b(runnableU, scheduledExecutorService);
        try {
            bVar.a(j10 <= 0 ? scheduledExecutorService.submit(bVar) : scheduledExecutorService.schedule(bVar, j10, timeUnit));
            return bVar;
        } catch (RejectedExecutionException e11) {
            tm.a.s(e11);
            return EmptyDisposable.INSTANCE;
        }
    }
}
