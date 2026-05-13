package mm;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: ObservableNever.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends xl.k<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xl.k<Object> f74811b = new z0();

    @Override // xl.k
    public void subscribeActual(xl.r<? super Object> rVar) {
        rVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
