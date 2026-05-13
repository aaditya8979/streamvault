package io.reactivex.disposables;

import bm.b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    public ReferenceDisposable(T t10) {
        super(fm.a.e(t10, "value is null"));
    }

    @Override // bm.b
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        onDisposed(andSet);
    }

    @Override // bm.b
    public final boolean isDisposed() {
        return get() == null;
    }

    public abstract void onDisposed(T t10);
}
