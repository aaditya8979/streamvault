package io.reactivex.internal.operators.observable;

import bm.b;
import dm.q;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableRetryPredicate<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q<? super Throwable> f71557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71558d;

    public static final class RepeatObserver<T> extends AtomicInteger implements r<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final r<? super T> downstream;
        public final q<? super Throwable> predicate;
        public long remaining;
        public final p<? extends T> source;
        public final SequentialDisposable upstream;

        public RepeatObserver(r<? super T> rVar, long j10, q<? super Throwable> qVar, SequentialDisposable sequentialDisposable, p<? extends T> pVar) {
            this.downstream = rVar;
            this.upstream = sequentialDisposable;
            this.source = pVar;
            this.predicate = qVar;
            this.remaining = j10;
        }

        @Override // xl.r
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            long j10 = this.remaining;
            if (j10 != Long.MAX_VALUE) {
                this.remaining = j10 - 1;
            }
            if (j10 == 0) {
                this.downstream.onError(th2);
                return;
            }
            try {
                if (this.predicate.test(th2)) {
                    subscribeNext();
                } else {
                    this.downstream.onError(th2);
                }
            } catch (Throwable th3) {
                cm.a.b(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            this.upstream.update(bVar);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.upstream.isDisposed()) {
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    public ObservableRetryPredicate(k<T> kVar, long j10, q<? super Throwable> qVar) {
        super(kVar);
        this.f71557c = qVar;
        this.f71558d = j10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        rVar.onSubscribe(sequentialDisposable);
        new RepeatObserver(rVar, this.f71558d, this.f71557c, sequentialDisposable, this.f74327b).subscribeNext();
    }
}
