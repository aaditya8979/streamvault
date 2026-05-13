package io.reactivex.internal.operators.observable;

import dm.o;
import gm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.c;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends xl.a implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<T> f71476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends c> f71477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71478c;

    public static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements bm.b, r<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final xl.b downstream;
        public final o<? super T, ? extends c> mapper;
        public bm.b upstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final bm.a set = new bm.a();

        public final class InnerObserver extends AtomicReference<bm.b> implements xl.b, bm.b {
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
            public void onSubscribe(bm.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public FlatMapCompletableMainObserver(xl.b bVar, o<? super T, ? extends c> oVar, boolean z10) {
            this.downstream = bVar;
            this.mapper = oVar;
            this.delayErrors = z10;
            lazySet(1);
        }

        @Override // bm.b
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

        @Override // bm.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
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
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapCompletableCompletable(p<T> pVar, o<? super T, ? extends c> oVar, boolean z10) {
        this.f71476a = pVar;
        this.f71477b = oVar;
        this.f71478c = z10;
    }

    @Override // gm.b
    public k<T> a() {
        return tm.a.o(new ObservableFlatMapCompletable(this.f71476a, this.f71477b, this.f71478c));
    }

    @Override // xl.a
    public void f(xl.b bVar) {
        this.f71476a.subscribe(new FlatMapCompletableMainObserver(bVar, this.f71477b, this.f71478c));
    }
}
