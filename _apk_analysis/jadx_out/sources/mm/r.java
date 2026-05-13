package mm;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableDefer.java */
/* JADX INFO: loaded from: classes6.dex */
public final class r<T> extends xl.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends xl.p<? extends T>> f74619b;

    public r(Callable<? extends xl.p<? extends T>> callable) {
        this.f74619b = callable;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        try {
            ((xl.p) fm.a.e(this.f74619b.call(), "null ObservableSource supplied")).subscribe(rVar);
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }
}
