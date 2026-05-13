package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.r;

/* JADX INFO: loaded from: classes6.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<b> implements r<T>, b {
    private static final long serialVersionUID = -8612022020200669122L;
    public final r<? super T> downstream;
    public final AtomicReference<b> upstream = new AtomicReference<>();

    public ObserverResourceWrapper(r<? super T> rVar) {
        this.downstream = rVar;
    }

    @Override // bm.b
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // bm.b
    public boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    @Override // xl.r
    public void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        dispose();
        this.downstream.onError(th2);
    }

    @Override // xl.r
    public void onNext(T t10) {
        this.downstream.onNext(t10);
    }

    @Override // xl.r
    public void onSubscribe(b bVar) {
        if (DisposableHelper.setOnce(this.upstream, bVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void setResource(b bVar) {
        DisposableHelper.set(this, bVar);
    }
}
