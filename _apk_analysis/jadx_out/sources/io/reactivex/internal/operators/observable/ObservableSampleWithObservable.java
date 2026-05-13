package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sm.e;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableSampleWithObservable<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<?> f71564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f71565d;

    public static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        public volatile boolean done;
        public final AtomicInteger wip;

        public SampleMainEmitLast(r<? super T> rVar, p<?> pVar) {
            super(rVar, pVar);
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void completeMain() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void completeOther() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.done;
                    emit();
                    if (z10) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public SampleMainNoLast(r<? super T> rVar, p<?> pVar) {
            super(rVar, pVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void completeMain() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void completeOther() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void run() {
            emit();
        }
    }

    public static abstract class SampleMainObserver<T> extends AtomicReference<T> implements r<T>, b {
        private static final long serialVersionUID = -3517602651313910099L;
        public final r<? super T> downstream;
        public final AtomicReference<b> other = new AtomicReference<>();
        public final p<?> sampler;
        public b upstream;

        public SampleMainObserver(r<? super T> rVar, p<?> pVar) {
            this.downstream = rVar;
            this.sampler = pVar;
        }

        public void complete() {
            this.upstream.dispose();
            completeOther();
        }

        public abstract void completeMain();

        public abstract void completeOther();

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.other);
            this.upstream.dispose();
        }

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        public void error(Throwable th2) {
            this.upstream.dispose();
            this.downstream.onError(th2);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.other.get() == DisposableHelper.DISPOSED;
        }

        @Override // xl.r
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            completeMain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new a(this));
                }
            }
        }

        public abstract void run();

        public boolean setOther(b bVar) {
            return DisposableHelper.setOnce(this.other, bVar);
        }
    }

    public static final class a<T> implements r<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SampleMainObserver<T> f71566b;

        public a(SampleMainObserver<T> sampleMainObserver) {
            this.f71566b = sampleMainObserver;
        }

        @Override // xl.r
        public void onComplete() {
            this.f71566b.complete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f71566b.error(th2);
        }

        @Override // xl.r
        public void onNext(Object obj) {
            this.f71566b.run();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            this.f71566b.setOther(bVar);
        }
    }

    public ObservableSampleWithObservable(p<T> pVar, p<?> pVar2, boolean z10) {
        super(pVar);
        this.f71564c = pVar2;
        this.f71565d = z10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        e eVar = new e(rVar);
        if (this.f71565d) {
            this.f74327b.subscribe(new SampleMainEmitLast(eVar, this.f71564c));
        } else {
            this.f74327b.subscribe(new SampleMainNoLast(eVar, this.f71564c));
        }
    }
}
