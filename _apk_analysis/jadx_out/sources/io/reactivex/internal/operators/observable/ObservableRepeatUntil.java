package io.reactivex.internal.operators.observable;

import bm.b;
import dm.e;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableRepeatUntil<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f71537c;

    public static final class RepeatUntilObserver<T> extends AtomicInteger implements r<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final r<? super T> downstream;
        public final p<? extends T> source;
        public final e stop;
        public final SequentialDisposable upstream;

        public RepeatUntilObserver(r<? super T> rVar, e eVar, SequentialDisposable sequentialDisposable, p<? extends T> pVar) {
            this.downstream = rVar;
            this.upstream = sequentialDisposable;
            this.source = pVar;
            this.stop = eVar;
        }

        @Override // xl.r
        public void onComplete() {
            try {
                if (this.stop.a()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.downstream.onError(th2);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            this.upstream.replace(bVar);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    public ObservableRepeatUntil(k<T> kVar, e eVar) {
        super(kVar);
        this.f71537c = eVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        rVar.onSubscribe(sequentialDisposable);
        new RepeatUntilObserver(rVar, this.f71537c, sequentialDisposable, this.f74327b).subscribeNext();
    }
}
