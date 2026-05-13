package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sm.e;
import xl.p;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSampleTimed<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f71561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f71562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f71563f;

    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        public final AtomicInteger wip;

        public SampleTimedEmitLast(r<? super T> rVar, long j10, TimeUnit timeUnit, s sVar) {
            super(rVar, j10, timeUnit, sVar);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public SampleTimedNoLast(r<? super T> rVar, long j10, TimeUnit timeUnit, s sVar) {
            super(rVar, j10, timeUnit, sVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void complete() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }
    }

    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements r<T>, b, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        public final r<? super T> downstream;
        public final long period;
        public final s scheduler;
        public final AtomicReference<b> timer = new AtomicReference<>();
        public final TimeUnit unit;
        public b upstream;

        public SampleTimedObserver(r<? super T> rVar, long j10, TimeUnit timeUnit, s sVar) {
            this.downstream = rVar;
            this.period = j10;
            this.unit = timeUnit;
            this.scheduler = sVar;
        }

        public void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        public abstract void complete();

        @Override // bm.b
        public void dispose() {
            cancelTimer();
            this.upstream.dispose();
        }

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            cancelTimer();
            complete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            cancelTimer();
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
                s sVar = this.scheduler;
                long j10 = this.period;
                DisposableHelper.replace(this.timer, sVar.e(this, j10, j10, this.unit));
            }
        }
    }

    public ObservableSampleTimed(p<T> pVar, long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        super(pVar);
        this.f71560c = j10;
        this.f71561d = timeUnit;
        this.f71562e = sVar;
        this.f71563f = z10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        e eVar = new e(rVar);
        if (this.f71563f) {
            this.f74327b.subscribe(new SampleTimedEmitLast(eVar, this.f71560c, this.f71561d, this.f71562e));
        } else {
            this.f74327b.subscribe(new SampleTimedNoLast(eVar, this.f71560c, this.f71561d, this.f71562e));
        }
    }
}
