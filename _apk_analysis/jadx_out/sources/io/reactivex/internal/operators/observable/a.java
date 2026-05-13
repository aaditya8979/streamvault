package io.reactivex.internal.operators.observable;

import gm.f;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import xl.k;
import xl.r;

/* JADX INFO: compiled from: ObservableJust.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> extends k<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f71667b;

    public a(T t10) {
        this.f71667b = t10;
    }

    @Override // gm.f, java.util.concurrent.Callable
    public T call() {
        return this.f71667b;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(rVar, this.f71667b);
        rVar.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }
}
