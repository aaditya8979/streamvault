package io.reactivex.internal.observers;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import xl.r;

/* JADX INFO: loaded from: classes3.dex */
public final class BlockingObserver<T> extends AtomicReference<b> implements r<T>, b {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    public final Queue<Object> queue;

    public BlockingObserver(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // bm.b
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    @Override // bm.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // xl.r
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        this.queue.offer(NotificationLite.error(th2));
    }

    @Override // xl.r
    public void onNext(T t10) {
        this.queue.offer(NotificationLite.next(t10));
    }

    @Override // xl.r
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
