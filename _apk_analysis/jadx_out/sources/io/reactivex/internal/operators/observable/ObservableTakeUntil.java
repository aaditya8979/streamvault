package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import qm.f;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservableTakeUntil<T, U> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<? extends U> f71610c;

    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = 1418547743690811973L;
        public final r<? super T> downstream;
        public final AtomicReference<b> upstream = new AtomicReference<>();
        public final TakeUntilMainObserver<T, U>.OtherObserver otherObserver = new OtherObserver();
        public final AtomicThrowable error = new AtomicThrowable();

        public final class OtherObserver extends AtomicReference<b> implements r<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public OtherObserver() {
            }

            @Override // xl.r
            public void onComplete() {
                TakeUntilMainObserver.this.otherComplete();
            }

            @Override // xl.r
            public void onError(Throwable th2) {
                TakeUntilMainObserver.this.otherError(th2);
            }

            @Override // xl.r
            public void onNext(U u10) {
                DisposableHelper.dispose(this);
                TakeUntilMainObserver.this.otherComplete();
            }

            @Override // xl.r
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public TakeUntilMainObserver(r<? super T> rVar) {
            this.downstream = rVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // xl.r
        public void onComplete() {
            DisposableHelper.dispose(this.otherObserver);
            f.b(this.downstream, this, this.error);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.otherObserver);
            f.d(this.downstream, th2, this, this.error);
        }

        @Override // xl.r
        public void onNext(T t10) {
            f.f(this.downstream, t10, this, this.error);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        public void otherComplete() {
            DisposableHelper.dispose(this.upstream);
            f.b(this.downstream, this, this.error);
        }

        public void otherError(Throwable th2) {
            DisposableHelper.dispose(this.upstream);
            f.d(this.downstream, th2, this, this.error);
        }
    }

    public ObservableTakeUntil(p<T> pVar, p<? extends U> pVar2) {
        super(pVar);
        this.f71610c = pVar2;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(rVar);
        rVar.onSubscribe(takeUntilMainObserver);
        this.f71610c.subscribe(takeUntilMainObserver.otherObserver);
        this.f74327b.subscribe(takeUntilMainObserver);
    }
}
