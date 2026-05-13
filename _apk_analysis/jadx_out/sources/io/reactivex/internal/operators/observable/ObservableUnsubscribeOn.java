package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import xl.p;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes.dex */
public final class ObservableUnsubscribeOn<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f71632c;

    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements r<T>, b {
        private static final long serialVersionUID = 1015244841293359600L;
        public final r<? super T> downstream;
        public final s scheduler;
        public b upstream;

        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeObserver.this.upstream.dispose();
            }
        }

        public UnsubscribeObserver(r<? super T> rVar, s sVar) {
            this.downstream = rVar;
            this.scheduler = sVar;
        }

        @Override // bm.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.c(new a());
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return get();
        }

        @Override // xl.r
        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (get()) {
                tm.a.s(th2);
            } else {
                this.downstream.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableUnsubscribeOn(p<T> pVar, s sVar) {
        super(pVar);
        this.f71632c = sVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74327b.subscribe(new UnsubscribeObserver(rVar, this.f71632c));
    }
}
