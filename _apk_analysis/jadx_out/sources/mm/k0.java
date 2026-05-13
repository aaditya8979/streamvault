package mm;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ObservableFromFuture.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k0<T> extends xl.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Future<? extends T> f74483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f74485d;

    public k0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f74483b = future;
        this.f74484c = j10;
        this.f74485d = timeUnit;
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
            TimeUnit timeUnit = this.f74485d;
            deferredScalarDisposable.complete(fm.a.e(timeUnit != null ? this.f74483b.get(this.f74484c, timeUnit) : this.f74483b.get(), "Future returned null"));
        } catch (Throwable th2) {
            cm.a.b(th2);
            if (deferredScalarDisposable.isDisposed()) {
                return;
            }
            rVar.onError(th2);
        }
    }
}
