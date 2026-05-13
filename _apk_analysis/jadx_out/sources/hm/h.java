package hm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import xl.r;

/* JADX INFO: compiled from: FutureObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h<T> extends CountDownLatch implements r<T>, Future<T>, bm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f63537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f63538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<bm.b> f63539d;

    public h() {
        super(1);
        this.f63539d = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        bm.b bVar;
        DisposableHelper disposableHelper;
        do {
            bVar = this.f63539d.get();
            if (bVar == this || bVar == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!androidx.compose.animation.core.a.a(this.f63539d, bVar, disposableHelper));
        if (bVar != null) {
            bVar.dispose();
        }
        countDown();
        return true;
    }

    @Override // bm.b
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            qm.c.b();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f63538c;
        if (th2 == null) {
            return this.f63537b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            qm.c.b();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.c(j10, timeUnit));
            }
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f63538c;
        if (th2 == null) {
            return this.f63537b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f63539d.get());
    }

    @Override // bm.b
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // xl.r
    public void onComplete() {
        bm.b bVar;
        if (this.f63537b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            bVar = this.f63539d.get();
            if (bVar == this || bVar == DisposableHelper.DISPOSED) {
                return;
            }
        } while (!androidx.compose.animation.core.a.a(this.f63539d, bVar, this));
        countDown();
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        bm.b bVar;
        if (this.f63538c != null) {
            tm.a.s(th2);
            return;
        }
        this.f63538c = th2;
        do {
            bVar = this.f63539d.get();
            if (bVar == this || bVar == DisposableHelper.DISPOSED) {
                tm.a.s(th2);
                return;
            }
        } while (!androidx.compose.animation.core.a.a(this.f63539d, bVar, this));
        countDown();
    }

    @Override // xl.r
    public void onNext(T t10) {
        if (this.f63537b == null) {
            this.f63537b = t10;
        } else {
            this.f63539d.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // xl.r
    public void onSubscribe(bm.b bVar) {
        DisposableHelper.setOnce(this.f63539d, bVar);
    }
}
