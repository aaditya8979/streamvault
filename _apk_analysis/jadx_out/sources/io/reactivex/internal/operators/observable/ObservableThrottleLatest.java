package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableThrottleLatest<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f71615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f71616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f71617f;

    public static final class ThrottleLatestObserver<T> extends AtomicInteger implements r<T>, b, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final r<? super T> downstream;
        public final boolean emitLast;
        public Throwable error;
        public final AtomicReference<T> latest = new AtomicReference<>();
        public final long timeout;
        public volatile boolean timerFired;
        public boolean timerRunning;
        public final TimeUnit unit;
        public b upstream;
        public final s.c worker;

        public ThrottleLatestObserver(r<? super T> rVar, long j10, TimeUnit timeUnit, s.c cVar, boolean z10) {
            this.downstream = rVar;
            this.timeout = j10;
            this.unit = timeUnit;
            this.worker = cVar;
            this.emitLast = z10;
        }

        @Override // bm.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.latest;
            r<? super T> rVar = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z10 = this.done;
                if (z10 && this.error != null) {
                    atomicReference.lazySet(null);
                    rVar.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                boolean z11 = atomicReference.get() == null;
                if (z10) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z11 && this.emitLast) {
                        rVar.onNext(andSet);
                    }
                    rVar.onComplete();
                    this.worker.dispose();
                    return;
                }
                if (z11) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    rVar.onNext(atomicReference.getAndSet(null));
                    this.timerFired = false;
                    this.timerRunning = true;
                    this.worker.c(this, this.timeout, this.unit);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // xl.r
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.latest.set(t10);
            drain();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }
    }

    public ObservableThrottleLatest(k<T> kVar, long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        super(kVar);
        this.f71614c = j10;
        this.f71615d = timeUnit;
        this.f71616e = sVar;
        this.f71617f = z10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74327b.subscribe(new ThrottleLatestObserver(rVar, this.f71614c, this.f71615d, this.f71616e.a(), this.f71617f));
    }
}
