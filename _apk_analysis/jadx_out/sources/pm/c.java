package pm;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xl.s;

/* JADX INFO: compiled from: IoScheduler.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final RxThreadFactory f77490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RxThreadFactory f77491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeUnit f77492f = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0925c f77493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f77494h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f77495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<a> f77496c;

    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f77497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConcurrentLinkedQueue<C0925c> f77498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final bm.a f77499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f77500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Future<?> f77501f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ThreadFactory f77502g;

        public a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f77497b = nanos;
            this.f77498c = new ConcurrentLinkedQueue<>();
            this.f77499d = new bm.a();
            this.f77502g = threadFactory;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, c.f77491e);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f77500e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f77501f = scheduledFutureScheduleWithFixedDelay;
        }

        public void a() {
            if (this.f77498c.isEmpty()) {
                return;
            }
            long jC = c();
            for (C0925c c0925c : this.f77498c) {
                if (c0925c.i() > jC) {
                    return;
                }
                if (this.f77498c.remove(c0925c)) {
                    this.f77499d.b(c0925c);
                }
            }
        }

        public C0925c b() {
            if (this.f77499d.isDisposed()) {
                return c.f77493g;
            }
            while (!this.f77498c.isEmpty()) {
                C0925c c0925cPoll = this.f77498c.poll();
                if (c0925cPoll != null) {
                    return c0925cPoll;
                }
            }
            C0925c c0925c = new C0925c(this.f77502g);
            this.f77499d.a(c0925c);
            return c0925c;
        }

        public long c() {
            return System.nanoTime();
        }

        public void d(C0925c c0925c) {
            c0925c.j(c() + this.f77497b);
            this.f77498c.offer(c0925c);
        }

        public void f() {
            this.f77499d.dispose();
            Future<?> future = this.f77501f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f77500e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class b extends s.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f77504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0925c f77505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f77506e = new AtomicBoolean();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bm.a f77503b = new bm.a();

        public b(a aVar) {
            this.f77504c = aVar;
            this.f77505d = aVar.b();
        }

        @Override // xl.s.c
        public bm.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f77503b.isDisposed() ? EmptyDisposable.INSTANCE : this.f77505d.e(runnable, j10, timeUnit, this.f77503b);
        }

        @Override // bm.b
        public void dispose() {
            if (this.f77506e.compareAndSet(false, true)) {
                this.f77503b.dispose();
                this.f77504c.d(this.f77505d);
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f77506e.get();
        }
    }

    /* JADX INFO: renamed from: pm.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class C0925c extends io.reactivex.internal.schedulers.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f77507d;

        public C0925c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f77507d = 0L;
        }

        public long i() {
            return this.f77507d;
        }

        public void j(long j10) {
            this.f77507d = j10;
        }
    }

    static {
        C0925c c0925c = new C0925c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f77493g = c0925c;
        c0925c.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        f77490d = rxThreadFactory;
        f77491e = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        a aVar = new a(0L, null, rxThreadFactory);
        f77494h = aVar;
        aVar.f();
    }

    public c() {
        this(f77490d);
    }

    public c(ThreadFactory threadFactory) {
        this.f77495b = threadFactory;
        this.f77496c = new AtomicReference<>(f77494h);
        f();
    }

    @Override // xl.s
    public s.c a() {
        return new b(this.f77496c.get());
    }

    public void f() {
        a aVar = new a(60L, f77492f, this.f77495b);
        if (androidx.compose.animation.core.a.a(this.f77496c, f77494h, aVar)) {
            return;
        }
        aVar.f();
    }
}
