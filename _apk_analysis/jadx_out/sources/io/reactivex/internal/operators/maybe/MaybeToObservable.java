package io.reactivex.internal.operators.maybe;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import xl.h;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeToObservable<T> extends k<T> {

    public static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements h<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        public b upstream;

        public MaybeToObservableObserver(r<? super T> rVar) {
            super(rVar);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // xl.h
        public void onComplete() {
            complete();
        }

        @Override // xl.h
        public void onError(Throwable th2) {
            error(th2);
        }

        @Override // xl.h
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // xl.h
        public void onSuccess(T t10) {
            complete(t10);
        }
    }

    public static <T> h<T> b(r<? super T> rVar) {
        return new MaybeToObservableObserver(rVar);
    }
}
