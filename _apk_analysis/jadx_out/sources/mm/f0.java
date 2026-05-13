package mm;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableError.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f0<T> extends xl.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends Throwable> f74416b;

    public f0(Callable<? extends Throwable> callable) {
        this.f74416b = callable;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        try {
            th = (Throwable) fm.a.e(this.f74416b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            cm.a.b(th);
        }
        EmptyDisposable.error(th, rVar);
    }
}
