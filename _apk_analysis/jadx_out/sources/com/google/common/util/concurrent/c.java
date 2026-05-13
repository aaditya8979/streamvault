package com.google.common.util.concurrent;

import c8.i;
import c8.j;
import c8.k;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.b;
import com.ironsource.C3978d4;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import y7.l;

/* JADX INFO: compiled from: MoreExecutors.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: compiled from: MoreExecutors.java */
    public static class a extends c8.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExecutorService f23486b;

        public a(ExecutorService executorService) {
            this.f23486b = (ExecutorService) l.m(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f23486b.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f23486b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f23486b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f23486b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f23486b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f23486b.shutdownNow();
        }

        public final String toString() {
            return super.toString() + C3978d4.j.f31383d + this.f23486b + C3978d4.j.f31385e;
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    public static final class b extends a implements ScheduledExecutorService {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f23487c;

        /* JADX INFO: compiled from: MoreExecutors.java */
        public static final class a<V> extends b.a<V> implements j<V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final ScheduledFuture<?> f23488d;

            public a(i<V> iVar, ScheduledFuture<?> scheduledFuture) {
                super(iVar);
                this.f23488d = scheduledFuture;
            }

            @Override // c8.c, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean zCancel = super.cancel(z10);
                if (zCancel) {
                    this.f23488d.cancel(z10);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f23488d.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f23488d.compareTo(delayed);
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.c$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MoreExecutors.java */
        public static final class RunnableC0321b extends AbstractFuture.i<Void> implements Runnable {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final Runnable f23489i;

            public RunnableC0321b(Runnable runnable) {
                this.f23489i = (Runnable) l.m(runnable);
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            public String A() {
                return "task=[" + this.f23489i + C3978d4.j.f31385e;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f23489i.run();
                } catch (Throwable th2) {
                    E(th2);
                    throw th2;
                }
            }
        }

        public b(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f23487c = (ScheduledExecutorService) l.m(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public j<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskI = TrustedListenableFutureTask.I(runnable, null);
            return new a(trustedListenableFutureTaskI, this.f23487c.schedule(trustedListenableFutureTaskI, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public <V> j<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskJ = TrustedListenableFutureTask.J(callable);
            return new a(trustedListenableFutureTaskJ, this.f23487c.schedule(trustedListenableFutureTaskJ, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public j<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            RunnableC0321b runnableC0321b = new RunnableC0321b(runnable);
            return new a(runnableC0321b, this.f23487c.scheduleAtFixedRate(runnableC0321b, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public j<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            RunnableC0321b runnableC0321b = new RunnableC0321b(runnable);
            return new a(runnableC0321b, this.f23487c.scheduleWithFixedDelay(runnableC0321b, j10, j11, timeUnit));
        }
    }

    public static Executor a() {
        return DirectExecutor.INSTANCE;
    }

    public static k b(ExecutorService executorService) {
        if (executorService instanceof k) {
            return (k) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new b((ScheduledExecutorService) executorService) : new a(executorService);
    }
}
