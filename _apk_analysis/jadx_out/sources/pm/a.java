package pm;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xl.s;

/* JADX INFO: compiled from: ComputationScheduler.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f77470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RxThreadFactory f77471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77472f = f(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f77473g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f77474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<b> f77475c;

    /* JADX INFO: renamed from: pm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class C0924a extends s.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final em.b f77476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bm.a f77477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final em.b f77478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f77479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f77480f;

        public C0924a(c cVar) {
            this.f77479e = cVar;
            em.b bVar = new em.b();
            this.f77476b = bVar;
            bm.a aVar = new bm.a();
            this.f77477c = aVar;
            em.b bVar2 = new em.b();
            this.f77478d = bVar2;
            bVar2.a(bVar);
            bVar2.a(aVar);
        }

        @Override // xl.s.c
        public bm.b b(Runnable runnable) {
            return this.f77480f ? EmptyDisposable.INSTANCE : this.f77479e.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f77476b);
        }

        @Override // xl.s.c
        public bm.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f77480f ? EmptyDisposable.INSTANCE : this.f77479e.e(runnable, j10, timeUnit, this.f77477c);
        }

        @Override // bm.b
        public void dispose() {
            if (this.f77480f) {
                return;
            }
            this.f77480f = true;
            this.f77478d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f77480f;
        }
    }

    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f77482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f77483c;

        public b(int i10, ThreadFactory threadFactory) {
            this.f77481a = i10;
            this.f77482b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f77482b[i11] = new c(threadFactory);
            }
        }

        public c a() {
            int i10 = this.f77481a;
            if (i10 == 0) {
                return a.f77473g;
            }
            c[] cVarArr = this.f77482b;
            long j10 = this.f77483c;
            this.f77483c = 1 + j10;
            return cVarArr[(int) (j10 % ((long) i10))];
        }

        public void b() {
            for (c cVar : this.f77482b) {
                cVar.dispose();
            }
        }
    }

    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class c extends io.reactivex.internal.schedulers.a {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        f77473g = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f77471e = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        f77470d = bVar;
        bVar.b();
    }

    public a() {
        this(f77471e);
    }

    public a(ThreadFactory threadFactory) {
        this.f77474b = threadFactory;
        this.f77475c = new AtomicReference<>(f77470d);
        g();
    }

    public static int f(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // xl.s
    public s.c a() {
        return new C0924a(this.f77475c.get().a());
    }

    @Override // xl.s
    public bm.b d(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f77475c.get().a().f(runnable, j10, timeUnit);
    }

    @Override // xl.s
    public bm.b e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f77475c.get().a().g(runnable, j10, j11, timeUnit);
    }

    public void g() {
        b bVar = new b(f77472f, this.f77474b);
        if (androidx.compose.animation.core.a.a(this.f77475c, f77470d, bVar)) {
            return;
        }
        bVar.b();
    }
}
