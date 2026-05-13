package pm;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: InstantPeriodicTask.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements Callable<Void>, bm.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FutureTask<Void> f77484g = new FutureTask<>(Functions.f71325b, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f77485b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f77488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f77489f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Future<?>> f77487d = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Future<?>> f77486c = new AtomicReference<>();

    public b(Runnable runnable, ExecutorService executorService) {
        this.f77485b = runnable;
        this.f77488e = executorService;
    }

    public void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f77487d.get();
            if (future2 == f77484g) {
                future.cancel(this.f77489f != Thread.currentThread());
                return;
            }
        } while (!androidx.compose.animation.core.a.a(this.f77487d, future2, future));
    }

    public void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f77486c.get();
            if (future2 == f77484g) {
                future.cancel(this.f77489f != Thread.currentThread());
                return;
            }
        } while (!androidx.compose.animation.core.a.a(this.f77486c, future2, future));
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f77489f = Thread.currentThread();
        try {
            this.f77485b.run();
            b(this.f77488e.submit(this));
            this.f77489f = null;
        } catch (Throwable th2) {
            this.f77489f = null;
            tm.a.s(th2);
        }
        return null;
    }

    @Override // bm.b
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f77487d;
        FutureTask<Void> futureTask = f77484g;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f77489f != Thread.currentThread());
        }
        Future<?> andSet2 = this.f77486c.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f77489f != Thread.currentThread());
    }

    @Override // bm.b
    public boolean isDisposed() {
        return this.f77487d.get() == f77484g;
    }
}
