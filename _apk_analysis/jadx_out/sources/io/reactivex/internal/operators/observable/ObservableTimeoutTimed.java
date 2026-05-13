package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.p;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableTimeoutTimed<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f71622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f71623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p<? extends T> f71624f;

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<bm.b> implements r<T>, bm.b, b {
        private static final long serialVersionUID = 3764492702657003550L;
        public final r<? super T> downstream;
        public p<? extends T> fallback;
        public final long timeout;
        public final TimeUnit unit;
        public final s.c worker;
        public final SequentialDisposable task = new SequentialDisposable();
        public final AtomicLong index = new AtomicLong();
        public final AtomicReference<bm.b> upstream = new AtomicReference<>();

        public TimeoutFallbackObserver(r<? super T> rVar, long j10, TimeUnit timeUnit, s.c cVar, p<? extends T> pVar) {
            this.downstream = rVar;
            this.timeout = j10;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = pVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
            this.worker.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // xl.r
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                tm.a.s(th2);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th2);
            this.worker.dispose();
        }

        @Override // xl.r
        public void onNext(T t10) {
            long j10 = this.index.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.index.compareAndSet(j10, j11)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t10);
                    startTimeout(j11);
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void onTimeout(long j10) {
            if (this.index.compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                p<? extends T> pVar = this.fallback;
                this.fallback = null;
                pVar.subscribe(new a(this.downstream, this));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j10) {
            this.task.replace(this.worker.c(new c(j10, this), this.timeout, this.unit));
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements r<T>, bm.b, b {
        private static final long serialVersionUID = 3764492702657003550L;
        public final r<? super T> downstream;
        public final long timeout;
        public final TimeUnit unit;
        public final s.c worker;
        public final SequentialDisposable task = new SequentialDisposable();
        public final AtomicReference<bm.b> upstream = new AtomicReference<>();

        public TimeoutObserver(r<? super T> rVar, long j10, TimeUnit timeUnit, s.c cVar) {
            this.downstream = rVar;
            this.timeout = j10;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            this.worker.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // xl.r
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                tm.a.s(th2);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th2);
            this.worker.dispose();
        }

        @Override // xl.r
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t10);
                    startTimeout(j11);
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void onTimeout(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.c(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j10) {
            this.task.replace(this.worker.c(new c(j10, this), this.timeout, this.unit));
        }
    }

    public static final class a<T> implements r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r<? super T> f71625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<bm.b> f71626c;

        public a(r<? super T> rVar, AtomicReference<bm.b> atomicReference) {
            this.f71625b = rVar;
            this.f71626c = atomicReference;
        }

        @Override // xl.r
        public void onComplete() {
            this.f71625b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f71625b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f71625b.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            DisposableHelper.replace(this.f71626c, bVar);
        }
    }

    public interface b {
        void onTimeout(long j10);
    }

    public static final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f71627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f71628c;

        public c(long j10, b bVar) {
            this.f71628c = j10;
            this.f71627b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f71627b.onTimeout(this.f71628c);
        }
    }

    public ObservableTimeoutTimed(k<T> kVar, long j10, TimeUnit timeUnit, s sVar, p<? extends T> pVar) {
        super(kVar);
        this.f71621c = j10;
        this.f71622d = timeUnit;
        this.f71623e = sVar;
        this.f71624f = pVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        if (this.f71624f == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(rVar, this.f71621c, this.f71622d, this.f71623e.a());
            rVar.onSubscribe(timeoutObserver);
            timeoutObserver.startTimeout(0L);
            this.f74327b.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(rVar, this.f71621c, this.f71622d, this.f71623e.a(), this.f71624f);
        rVar.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.startTimeout(0L);
        this.f74327b.subscribe(timeoutFallbackObserver);
    }
}
