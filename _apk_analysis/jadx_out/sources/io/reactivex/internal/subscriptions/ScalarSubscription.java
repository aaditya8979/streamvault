package io.reactivex.internal.subscriptions;

import gm.e;
import java.util.concurrent.atomic.AtomicInteger;
import ms.b;

/* JADX INFO: loaded from: classes6.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements e<T> {
    public static final int CANCELLED = 2;
    public static final int NO_REQUEST = 0;
    public static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    public final b<? super T> subscriber;
    public final T value;

    public ScalarSubscription(b<? super T> bVar, T t10) {
        this.subscriber = bVar;
        this.value = t10;
    }

    @Override // ms.c
    public void cancel() {
        lazySet(2);
    }

    @Override // gm.h
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // gm.h
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // gm.h
    public boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // gm.h
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    @Override // ms.c
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10) && compareAndSet(0, 1)) {
            b<? super T> bVar = this.subscriber;
            bVar.onNext(this.value);
            if (get() != 2) {
                bVar.onComplete();
            }
        }
    }

    @Override // gm.d
    public int requestFusion(int i10) {
        return i10 & 1;
    }
}
