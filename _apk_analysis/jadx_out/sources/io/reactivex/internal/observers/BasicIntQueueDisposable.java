package io.reactivex.internal.observers;

import gm.c;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements c<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // gm.h
    public abstract /* synthetic */ void clear();

    @Override // bm.b
    public abstract /* synthetic */ void dispose();

    @Override // bm.b
    public abstract /* synthetic */ boolean isDisposed();

    @Override // gm.h
    public abstract /* synthetic */ boolean isEmpty();

    @Override // gm.h
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // gm.h
    public abstract /* synthetic */ T poll() throws Exception;

    @Override // gm.d
    public abstract /* synthetic */ int requestFusion(int i10);
}
