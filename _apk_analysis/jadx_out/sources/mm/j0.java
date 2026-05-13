package mm;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableFromCallable.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j0<T> extends xl.k<T> implements Callable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends T> f74467b;

    public j0(Callable<? extends T> callable) {
        this.f74467b = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) fm.a.e(this.f74467b.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(rVar);
        rVar.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            deferredScalarDisposable.complete(fm.a.e(this.f74467b.call(), "Callable returned null"));
        } catch (Throwable th2) {
            cm.a.b(th2);
            if (deferredScalarDisposable.isDisposed()) {
                tm.a.s(th2);
            } else {
                rVar.onError(th2);
            }
        }
    }
}
