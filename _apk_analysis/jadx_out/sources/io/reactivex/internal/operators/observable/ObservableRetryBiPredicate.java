package io.reactivex.internal.operators.observable;

import bm.b;
import dm.d;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableRetryBiPredicate<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<? super Integer, ? super Throwable> f71556c;

    public static final class RetryBiObserver<T> extends AtomicInteger implements r<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final r<? super T> downstream;
        public final d<? super Integer, ? super Throwable> predicate;
        public int retries;
        public final p<? extends T> source;
        public final SequentialDisposable upstream;

        public RetryBiObserver(r<? super T> rVar, d<? super Integer, ? super Throwable> dVar, SequentialDisposable sequentialDisposable, p<? extends T> pVar) {
            this.downstream = rVar;
            this.upstream = sequentialDisposable;
            this.source = pVar;
            this.predicate = dVar;
        }

        @Override // xl.r
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            try {
                d<? super Integer, ? super Throwable> dVar = this.predicate;
                int i10 = this.retries + 1;
                this.retries = i10;
                if (dVar.test(Integer.valueOf(i10), th2)) {
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

    public ObservableRetryBiPredicate(k<T> kVar, d<? super Integer, ? super Throwable> dVar) {
        super(kVar);
        this.f71556c = dVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        rVar.onSubscribe(sequentialDisposable);
        new RetryBiObserver(rVar, this.f71556c, sequentialDisposable, this.f74327b).subscribeNext();
    }
}
