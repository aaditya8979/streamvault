package retrofit2.adapter.rxjava2;

import bm.b;
import cm.a;
import io.reactivex.exceptions.CompositeException;
import retrofit2.Call;
import retrofit2.Response;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes9.dex */
final class CallExecuteObservable<T> extends k<Response<T>> {
    private final Call<T> originalCall;

    public static final class CallDisposable implements b {
        private final Call<?> call;
        private volatile boolean disposed;

        public CallDisposable(Call<?> call) {
            this.call = call;
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
    }

    public CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // xl.k
    public void subscribeActual(r<? super Response<T>> rVar) {
        boolean z10;
        Call<T> callClone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(callClone);
        rVar.onSubscribe(callDisposable);
        try {
            Response<T> responseExecute = callClone.execute();
            if (!callDisposable.isDisposed()) {
                rVar.onNext(responseExecute);
            }
            if (callDisposable.isDisposed()) {
                return;
            }
            try {
                rVar.onComplete();
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                a.b(th);
                if (z10) {
                    tm.a.s(th);
                    return;
                }
                if (callDisposable.isDisposed()) {
                    return;
                }
                try {
                    rVar.onError(th);
                } catch (Throwable th3) {
                    a.b(th3);
                    tm.a.s(new CompositeException(th, th3));
                }
            }
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
        }
    }
}
