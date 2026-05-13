package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import xl.p;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTakeLastTimed<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f71606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f71607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f71608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f71609h;

    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements r<T>, b {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
        public final long count;
        public final boolean delayError;
        public final r<? super T> downstream;
        public Throwable error;
        public final om.a<Object> queue;
        public final s scheduler;
        public final long time;
        public final TimeUnit unit;
        public b upstream;

        public TakeLastTimedObserver(r<? super T> rVar, long j10, long j11, TimeUnit timeUnit, s sVar, int i10, boolean z10) {
            this.downstream = rVar;
            this.count = j10;
            this.time = j11;
            this.unit = timeUnit;
            this.scheduler = sVar;
            this.queue = new om.a<>(i10);
            this.delayError = z10;
        }

        @Override // bm.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.queue.clear();
            }
        }

        public void drain() {
            Throwable th2;
            if (compareAndSet(false, true)) {
                r<? super T> rVar = this.downstream;
                om.a<Object> aVar = this.queue;
                boolean z10 = this.delayError;
                while (!this.cancelled) {
                    if (!z10 && (th2 = this.error) != null) {
                        aVar.clear();
                        rVar.onError(th2);
                        return;
                    }
                    Object objPoll = aVar.poll();
                    if (objPoll == null) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            rVar.onError(th3);
                            return;
                        } else {
                            rVar.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = aVar.poll();
                    if (((Long) objPoll).longValue() >= this.scheduler.b(this.unit) - this.time) {
                        rVar.onNext(objPoll2);
                    }
                }
                aVar.clear();
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // xl.r
        public void onComplete() {
            drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.error = th2;
            drain();
        }

        @Override // xl.r
        public void onNext(T t10) {
            om.a<Object> aVar = this.queue;
            long jB = this.scheduler.b(this.unit);
            long j10 = this.time;
            long j11 = this.count;
            boolean z10 = j11 == Long.MAX_VALUE;
            aVar.l(Long.valueOf(jB), t10);
            while (!aVar.isEmpty()) {
                if (((Long) aVar.m()).longValue() > jB - j10 && (z10 || (aVar.o() >> 1) <= j11)) {
                    return;
                }
                aVar.poll();
                aVar.poll();
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastTimed(p<T> pVar, long j10, long j11, TimeUnit timeUnit, s sVar, int i10, boolean z10) {
        super(pVar);
        this.f71604c = j10;
        this.f71605d = j11;
        this.f71606e = timeUnit;
        this.f71607f = sVar;
        this.f71608g = i10;
        this.f71609h = z10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74327b.subscribe(new TakeLastTimedObserver(rVar, this.f71604c, this.f71605d, this.f71606e, this.f71607f, this.f71608g, this.f71609h));
    }
}
