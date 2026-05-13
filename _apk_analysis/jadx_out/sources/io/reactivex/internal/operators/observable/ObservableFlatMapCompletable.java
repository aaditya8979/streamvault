package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import xl.c;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableFlatMapCompletable<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends c> f71474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f71475d;

    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements r<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final r<? super T> downstream;
        public final o<? super T, ? extends c> mapper;
        public b upstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final bm.a set = new bm.a();

        public final class InnerObserver extends AtomicReference<b> implements xl.b, b {
            private static final long serialVersionUID = 8606673141535671828L;

            public InnerObserver() {
            }

            @Override // bm.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // bm.b
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // xl.b, xl.h
            public void onComplete() {
                FlatMapCompletableMainObserver.this.innerComplete(this);
            }

            @Override // xl.b
            public void onError(Throwable th2) {
                FlatMapCompletableMainObserver.this.innerError(this, th2);
            }

            @Override // xl.b
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public FlatMapCompletableMainObserver(r<? super T> rVar, o<? super T, ? extends c> oVar, boolean z10) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.delayErrors = z10;
            lazySet(1);
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public void clear() {
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        public void innerComplete(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver) {
            this.set.delete(innerObserver);
            onComplete();
        }

        public void innerError(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver, Throwable th2) {
            this.set.delete(innerObserver);
            onError(th2);
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public boolean isEmpty() {
            return true;
        }

        @Override // xl.r
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thTerminate = this.errors.terminate();
                if (thTerminate != null) {
                    this.downstream.onError(thTerminate);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                tm.a.s(th2);
                return;
            }
            if (this.delayErrors) {
                if (decrementAndGet() == 0) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            try {
                c cVar = (c) fm.a.e(this.mapper.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.disposed || !this.set.a(innerObserver)) {
                    return;
                }
                cVar.b(innerObserver);
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public T poll() throws Exception {
            return null;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.d
        public int requestFusion(int i10) {
            return i10 & 2;
        }
    }

    public ObservableFlatMapCompletable(p<T> pVar, o<? super T, ? extends c> oVar, boolean z10) {
        super(pVar);
        this.f71474c = oVar;
        this.f71475d = z10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74327b.subscribe(new FlatMapCompletableMainObserver(rVar, this.f71474c, this.f71475d));
    }
}
