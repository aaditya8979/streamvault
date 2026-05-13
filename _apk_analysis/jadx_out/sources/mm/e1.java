package mm;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import mm.d1;

/* JADX INFO: compiled from: ObservableReduceWithSingle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e1<T, R> extends xl.t<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<R> f74408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.c<R, ? super T, R> f74409c;

    public e1(xl.p<T> pVar, Callable<R> callable, dm.c<R, ? super T, R> cVar) {
        this.f74407a = pVar;
        this.f74408b = callable;
        this.f74409c = cVar;
    }

    @Override // xl.t
    public void m(xl.u<? super R> uVar) {
        try {
            this.f74407a.subscribe(new d1.a(uVar, this.f74409c, fm.a.e(this.f74408b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, uVar);
        }
    }
}
