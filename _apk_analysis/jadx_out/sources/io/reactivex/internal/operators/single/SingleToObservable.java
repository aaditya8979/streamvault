package io.reactivex.internal.operators.single;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import xl.k;
import xl.r;
import xl.u;
import xl.v;

/* JADX INFO: loaded from: classes6.dex */
public final class SingleToObservable<T> extends k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v<? extends T> f71677b;

    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements u<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        public b upstream;

        public SingleToObservableObserver(r<? super T> rVar) {
            super(rVar);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            error(th2);
        }

        @Override // xl.u
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // xl.u
        public void onSuccess(T t10) {
            complete(t10);
        }
    }

    public SingleToObservable(v<? extends T> vVar) {
        this.f71677b = vVar;
    }

    public static <T> u<T> b(r<? super T> rVar) {
        return new SingleToObservableObserver(rVar);
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f71677b.c(b(rVar));
    }
}
