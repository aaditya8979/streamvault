package io.reactivex.internal.operators.observable;

import bm.b;
import gm.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.h;
import xl.i;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableMergeWithMaybe<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<? extends T> f71507c;

    public static final class MergeWithObserver<T> extends AtomicInteger implements r<T>, b {
        public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        public static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        public volatile boolean disposed;
        public final r<? super T> downstream;
        public volatile boolean mainDone;
        public volatile int otherState;
        public volatile g<T> queue;
        public T singleItem;
        public final AtomicReference<b> mainDisposable = new AtomicReference<>();
        public final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        public final AtomicThrowable error = new AtomicThrowable();

        public static final class OtherObserver<T> extends AtomicReference<b> implements h<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            public final MergeWithObserver<T> parent;

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // xl.h
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // xl.h
            public void onError(Throwable th2) {
                this.parent.otherError(th2);
            }

            @Override // xl.h
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // xl.h
            public void onSuccess(T t10) {
                this.parent.otherSuccess(t10);
            }
        }

        public MergeWithObserver(r<? super T> rVar) {
            this.downstream = rVar;
        }

        @Override // bm.b
        public void dispose() {
            this.disposed = true;
            DisposableHelper.dispose(this.mainDisposable);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            r<? super T> rVar = this.downstream;
            int iAddAndGet = 1;
            while (!this.disposed) {
                if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    rVar.onError(this.error.terminate());
                    return;
                }
                int i10 = this.otherState;
                if (i10 == 1) {
                    T t10 = this.singleItem;
                    this.singleItem = null;
                    this.otherState = 2;
                    rVar.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.mainDone;
                g<T> gVar = this.queue;
                a.i iVarPoll = gVar != null ? gVar.poll() : null;
                boolean z11 = iVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.queue = null;
                    rVar.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    rVar.onNext(iVarPoll);
                }
            }
            this.singleItem = null;
            this.queue = null;
        }

        public g<T> getOrCreateQueue() {
            g<T> gVar = this.queue;
            if (gVar != null) {
                return gVar;
            }
            om.a aVar = new om.a(k.bufferSize());
            this.queue = aVar;
            return aVar;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        @Override // xl.r
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                tm.a.s(th2);
            } else {
                DisposableHelper.dispose(this.mainDisposable);
                drain();
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.mainDisposable, bVar);
        }

        public void otherComplete() {
            this.otherState = 2;
            drain();
        }

        public void otherError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                tm.a.s(th2);
            } else {
                DisposableHelper.dispose(this.mainDisposable);
                drain();
            }
        }

        public void otherSuccess(T t10) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t10);
                this.otherState = 2;
            } else {
                this.singleItem = t10;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    public ObservableMergeWithMaybe(k<T> kVar, i<? extends T> iVar) {
        super(kVar);
        this.f71507c = iVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(rVar);
        rVar.onSubscribe(mergeWithObserver);
        this.f74327b.subscribe(mergeWithObserver);
        this.f71507c.b(mergeWithObserver.otherObserver);
    }
}
