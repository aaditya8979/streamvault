package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.c;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableConcatWithCompletable<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f71452c;

    public static final class ConcatWithObserver<T> extends AtomicReference<b> implements r<T>, xl.b, b {
        private static final long serialVersionUID = -1953724749712440952L;
        public final r<? super T> downstream;
        public boolean inCompletable;
        public c other;

        public ConcatWithObserver(r<? super T> rVar, c cVar) {
            this.downstream = rVar;
            this.other = cVar;
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
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            DisposableHelper.replace(this, null);
            c cVar = this.other;
            this.other = null;
            cVar.b(this);
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
            if (!DisposableHelper.setOnce(this, bVar) || this.inCompletable) {
                return;
            }
            this.downstream.onSubscribe(this);
        }
    }

    public ObservableConcatWithCompletable(k<T> kVar, c cVar) {
        super(kVar);
        this.f71452c = cVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74327b.subscribe(new ConcatWithObserver(rVar, this.f71452c));
    }
}
