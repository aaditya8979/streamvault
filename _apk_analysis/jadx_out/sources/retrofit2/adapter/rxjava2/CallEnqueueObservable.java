package retrofit2.adapter.rxjava2;

import bm.b;
import cm.a;
import io.reactivex.exceptions.CompositeException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes2.dex */
final class CallEnqueueObservable<T> extends k<Response<T>> {
    private final Call<T> originalCall;

    public static final class CallCallback<T> implements b, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final r<? super Response<T>> observer;
        public boolean terminated = false;

        public CallCallback(Call<?> call, r<? super Response<T>> rVar) {
            this.call = call;
            this.observer = rVar;
        }

        @Override // bm.b
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<T> call, Throwable th2) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.observer.onError(th2);
            } catch (Throwable th3) {
                a.b(th3);
                tm.a.s(new CompositeException(th2, th3));
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<T> call, Response<T> response) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(response);
                if (this.disposed) {
                    return;
                }
                this.terminated = true;
                this.observer.onComplete();
            } catch (Throwable th2) {
                if (this.terminated) {
                    tm.a.s(th2);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th2);
                } catch (Throwable th3) {
                    a.b(th3);
                    tm.a.s(new CompositeException(th2, th3));
                }
            }
        }
    }

    public CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // xl.k
    public void subscribeActual(r<? super Response<T>> rVar) {
        Call<T> callClone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(callClone, rVar);
        rVar.onSubscribe(callCallback);
        callClone.enqueue(callCallback);
    }
}
