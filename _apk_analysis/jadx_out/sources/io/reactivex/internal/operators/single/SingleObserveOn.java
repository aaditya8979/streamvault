package io.reactivex.internal.operators.single;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.s;
import xl.t;
import xl.u;
import xl.v;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleObserveOn<T> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<T> f71668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f71669b;

    public static final class ObserveOnSingleObserver<T> extends AtomicReference<b> implements u<T>, b, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        public final u<? super T> downstream;
        public Throwable error;
        public final s scheduler;
        public T value;

        public ObserveOnSingleObserver(u<? super T> uVar, s sVar) {
            this.downstream = uVar;
            this.scheduler = sVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            this.error = th2;
            DisposableHelper.replace(this, this.scheduler.c(this));
        }

        @Override // xl.u
        public void onSubscribe(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // xl.u
        public void onSuccess(T t10) {
            this.value = t10;
            DisposableHelper.replace(this, this.scheduler.c(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.error;
            if (th2 != null) {
                this.downstream.onError(th2);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }
    }

    public SingleObserveOn(v<T> vVar, s sVar) {
        this.f71668a = vVar;
        this.f71669b = sVar;
    }

    @Override // xl.t
    public void m(u<? super T> uVar) {
        this.f71668a.c(new ObserveOnSingleObserver(uVar, this.f71669b));
    }
}
