package pm;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import xl.s;

/* JADX INFO: compiled from: TrampolineScheduler.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f77516b = new g();

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f77517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f77518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f77519d;

        public a(Runnable runnable, c cVar, long j10) {
            this.f77517b = runnable;
            this.f77518c = cVar;
            this.f77519d = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f77518c.f77527e) {
                return;
            }
            long jA = this.f77518c.a(TimeUnit.MILLISECONDS);
            long j10 = this.f77519d;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    tm.a.s(e10);
                    return;
                }
            }
            if (this.f77518c.f77527e) {
                return;
            }
            this.f77517b.run();
        }
    }

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f77520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f77521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f77522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f77523e;

        public b(Runnable runnable, Long l10, int i10) {
            this.f77520b = runnable;
            this.f77521c = l10.longValue();
            this.f77522d = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = fm.a.b(this.f77521c, bVar.f77521c);
            return iB == 0 ? fm.a.a(this.f77522d, bVar.f77522d) : iB;
        }
    }

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class c extends s.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f77524b = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f77525c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f77526d = new AtomicInteger();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f77527e;

        /* JADX INFO: compiled from: TrampolineScheduler.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f77528b;

            public a(b bVar) {
                this.f77528b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f77528b.f77523e = true;
                c.this.f77524b.remove(this.f77528b);
            }
        }

        @Override // xl.s.c
        public bm.b b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // xl.s.c
        public bm.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return e(new a(runnable, this, jA), jA);
        }

        @Override // bm.b
        public void dispose() {
            this.f77527e = true;
        }

        public bm.b e(Runnable runnable, long j10) {
            if (this.f77527e) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f77526d.incrementAndGet());
            this.f77524b.add(bVar);
            if (this.f77525c.getAndIncrement() != 0) {
                return io.reactivex.disposables.a.c(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f77527e) {
                b bVarPoll = this.f77524b.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f77525c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVarPoll.f77523e) {
                    bVarPoll.f77520b.run();
                }
            }
            this.f77524b.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f77527e;
        }
    }

    public static g f() {
        return f77516b;
    }

    @Override // xl.s
    public s.c a() {
        return new c();
    }

    @Override // xl.s
    public bm.b c(Runnable runnable) {
        tm.a.u(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // xl.s
    public bm.b d(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            tm.a.u(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            tm.a.s(e10);
        }
        return EmptyDisposable.INSTANCE;
    }
}
