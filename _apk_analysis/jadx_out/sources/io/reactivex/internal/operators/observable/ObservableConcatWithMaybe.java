package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.h;
import xl.i;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableConcatWithMaybe<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<? extends T> f71453c;

    public static final class ConcatWithObserver<T> extends AtomicReference<b> implements r<T>, h<T>, b {
        private static final long serialVersionUID = -1953724749712440952L;
        public final r<? super T> downstream;
        public boolean inMaybe;
        public i<? extends T> other;

        public ConcatWithObserver(r<? super T> rVar, i<? extends T> iVar) {
            this.downstream = rVar;
            this.other = iVar;
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
            if (this.inMaybe) {
                this.downstream.onComplete();
                return;
            }
            this.inMaybe = true;
            DisposableHelper.replace(this, null);
            i<? extends T> iVar = this.other;
            this.other = null;
            iVar.b(this);
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
            if (!DisposableHelper.setOnce(this, bVar) || this.inMaybe) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // xl.h
        public void onSuccess(T t10) {
            this.downstream.onNext(t10);
            this.downstream.onComplete();
        }
    }

    public ObservableConcatWithMaybe(k<T> kVar, i<? extends T> iVar) {
        super(kVar);
        this.f71453c = iVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74327b.subscribe(new ConcatWithObserver(rVar, this.f71453c));
    }
}
