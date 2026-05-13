package retrofit2.adapter.rxjava2;

import bm.b;
import cm.a;
import io.reactivex.exceptions.CompositeException;
import retrofit2.Response;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
final class ResultObservable<T> extends k<Result<T>> {
    private final k<Response<T>> upstream;

    public static class ResultObserver<R> implements r<Response<R>> {
        private final r<? super Result<R>> observer;

        public ResultObserver(r<? super Result<R>> rVar) {
            this.observer = rVar;
        }

        @Override // xl.r
        public void onComplete() {
            this.observer.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            try {
                this.observer.onNext(Result.error(th2));
                this.observer.onComplete();
            } catch (Throwable th3) {
                try {
                    this.observer.onError(th3);
                } catch (Throwable th4) {
                    a.b(th4);
                    tm.a.s(new CompositeException(th3, th4));
                }
            }
        }

        @Override // xl.r
        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            this.observer.onSubscribe(bVar);
        }
    }

    public ResultObservable(k<Response<T>> kVar) {
        this.upstream = kVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super Result<T>> rVar) {
        this.upstream.subscribe(new ResultObserver(rVar));
    }
}
