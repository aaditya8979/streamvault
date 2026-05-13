package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.r;
import xl.u;
import xl.v;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatWithSingle<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v<? extends T> f71454c;

    public static final class ConcatWithObserver<T> extends AtomicReference<b> implements r<T>, u<T>, b {
        private static final long serialVersionUID = -1953724749712440952L;
        public final r<? super T> downstream;
        public boolean inSingle;
        public v<? extends T> other;

        public ConcatWithObserver(r<? super T> rVar, v<? extends T> vVar) {
            this.downstream = rVar;
            this.other = vVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // xl.r
        public void onComplete() {
            this.inSingle = true;
            DisposableHelper.replace(this, null);
            v<? extends T> vVar = this.other;
            this.other = null;
            vVar.c(this);
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
            if (!DisposableHelper.setOnce(this, bVar) || this.inSingle) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // xl.u
        public void onSuccess(T t10) {
            this.downstream.onNext(t10);
            this.downstream.onComplete();
        }
    }

    public ObservableConcatWithSingle(k<T> kVar, v<? extends T> vVar) {
        super(kVar);
        this.f71454c = vVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74327b.subscribe(new ConcatWithObserver(rVar, this.f71454c));
    }
}
