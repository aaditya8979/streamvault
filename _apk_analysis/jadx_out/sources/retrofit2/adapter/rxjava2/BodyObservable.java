package retrofit2.adapter.rxjava2;

import bm.b;
import io.reactivex.exceptions.CompositeException;
import retrofit2.Response;
import tm.a;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes.dex */
final class BodyObservable<T> extends k<T> {
    private final k<Response<T>> upstream;

    public static class BodyObserver<R> implements r<Response<R>> {
        private final r<? super R> observer;
        private boolean terminated;

        public BodyObserver(r<? super R> rVar) {
            this.observer = rVar;
        }

        @Override // xl.r
        public void onComplete() {
            if (this.terminated) {
                return;
            }
            this.observer.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (!this.terminated) {
                this.observer.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            a.s(assertionError);
        }

        @Override // xl.r
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th2) {
                cm.a.b(th2);
                a.s(new CompositeException(httpException, th2));
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            this.observer.onSubscribe(bVar);
        }
    }

    public BodyObservable(k<Response<T>> kVar) {
        this.upstream = kVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.upstream.subscribe(new BodyObserver(rVar));
    }
}
