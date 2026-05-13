package mm;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: ObservableEmpty.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends xl.k<Object> implements gm.f<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xl.k<Object> f74406b = new e0();

    @Override // gm.f, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super Object> rVar) {
        EmptyDisposable.complete(rVar);
    }
}
