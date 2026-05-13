package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import qm.c;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes11.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<? extends T> f71412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71413c;

    public static final class BlockingObservableIterator<T> extends AtomicReference<b> implements r<T>, Iterator<T>, b {
        private static final long serialVersionUID = 6695226475494099826L;
        public final Condition condition;
        public volatile boolean done;
        public Throwable error;
        public final Lock lock;
        public final om.a<T> queue;

        public BlockingObservableIterator(int i10) {
            this.queue = new om.a<>(i10);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z10 = this.done;
                boolean zIsEmpty = this.queue.isEmpty();
                if (z10) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        throw ExceptionHelper.d(th2);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    c.b();
                    this.lock.lock();
                    while (!this.done && this.queue.isEmpty()) {
                        try {
                            this.condition.await();
                        } finally {
                        }
                    }
                    this.lock.unlock();
                } catch (InterruptedException e10) {
                    DisposableHelper.dispose(this);
                    signalConsumer();
                    throw ExceptionHelper.d(e10);
                }
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.queue.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // xl.r
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            signalConsumer();
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.queue.offer(t10);
            signalConsumer();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        public void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }
    }

    public BlockingObservableIterable(p<? extends T> pVar, int i10) {
        this.f71412b = pVar;
        this.f71413c = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.f71413c);
        this.f71412b.subscribe(blockingObservableIterator);
        return blockingObservableIterator;
    }
}
