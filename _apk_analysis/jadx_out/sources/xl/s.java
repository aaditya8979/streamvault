package xl;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Scheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f86987a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: compiled from: Scheduler.java */
    public static final class a implements bm.b, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f86988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f86989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Thread f86990d;

        public a(Runnable runnable, c cVar) {
            this.f86988b = runnable;
            this.f86989c = cVar;
        }

        @Override // bm.b
        public void dispose() {
            if (this.f86990d == Thread.currentThread()) {
                c cVar = this.f86989c;
                if (cVar instanceof io.reactivex.internal.schedulers.a) {
                    ((io.reactivex.internal.schedulers.a) cVar).h();
                    return;
                }
            }
            this.f86989c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f86989c.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f86990d = Thread.currentThread();
            try {
                this.f86988b.run();
            } finally {
                dispose();
                this.f86990d = null;
            }
        }
    }

    /* JADX INFO: compiled from: Scheduler.java */
    public static final class b implements bm.b, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f86991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f86992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f86993d;

        public b(Runnable runnable, c cVar) {
            this.f86991b = runnable;
            this.f86992c = cVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f86993d = true;
            this.f86992c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f86993d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f86993d) {
                return;
            }
            try {
                this.f86991b.run();
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f86992c.dispose();
                throw ExceptionHelper.d(th2);
            }
        }
    }

    /* JADX INFO: compiled from: Scheduler.java */
    public static abstract class c implements bm.b {

        /* JADX INFO: compiled from: Scheduler.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Runnable f86994b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final SequentialDisposable f86995c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f86996d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public long f86997e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public long f86998f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public long f86999g;

            public a(long j10, Runnable runnable, long j11, SequentialDisposable sequentialDisposable, long j12) {
                this.f86994b = runnable;
                this.f86995c = sequentialDisposable;
                this.f86996d = j12;
                this.f86998f = j11;
                this.f86999g = j10;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r12 = this;
                    java.lang.Runnable r0 = r12.f86994b
                    r0.run()
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r12.f86995c
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L51
                    xl.s$c r0 = xl.s.c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.a(r1)
                    long r4 = xl.s.f86987a
                    long r6 = r2 + r4
                    long r8 = r12.f86998f
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f86996d
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f86999g
                    long r8 = r12.f86997e
                    long r8 = r8 + r6
                    r12.f86997e = r8
                    long r8 = r8 * r10
                    long r4 = r4 + r8
                    goto L43
                L34:
                    long r4 = r12.f86996d
                    long r8 = r2 + r4
                    long r10 = r12.f86997e
                    long r10 = r10 + r6
                    r12.f86997e = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f86999g = r4
                    r4 = r8
                L43:
                    r12.f86998f = r2
                    long r4 = r4 - r2
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r12.f86995c
                    xl.s$c r2 = xl.s.c.this
                    bm.b r1 = r2.c(r12, r4, r1)
                    r0.replace(r1)
                L51:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: xl.s.c.a.run():void");
            }
        }

        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public bm.b b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract bm.b c(Runnable runnable, long j10, TimeUnit timeUnit);

        public bm.b d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableU = tm.a.u(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jA = a(TimeUnit.NANOSECONDS);
            bm.b bVarC = c(new a(jA + timeUnit.toNanos(j10), runnableU, jA, sequentialDisposable2, nanos), j10, timeUnit);
            if (bVarC == EmptyDisposable.INSTANCE) {
                return bVarC;
            }
            sequentialDisposable.replace(bVarC);
            return sequentialDisposable2;
        }
    }

    public abstract c a();

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public bm.b c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public bm.b d(Runnable runnable, long j10, TimeUnit timeUnit) {
        c cVarA = a();
        a aVar = new a(tm.a.u(runnable), cVarA);
        cVarA.c(aVar, j10, timeUnit);
        return aVar;
    }

    public bm.b e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c cVarA = a();
        b bVar = new b(tm.a.u(runnable), cVarA);
        bm.b bVarD = cVarA.d(bVar, j10, j11, timeUnit);
        return bVarD == EmptyDisposable.INSTANCE ? bVarD : bVar;
    }
}
