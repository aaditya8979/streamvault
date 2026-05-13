package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.p;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableSubscribeOn<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f71597c;

    public static final class SubscribeOnObserver<T> extends AtomicReference<b> implements r<T>, b {
        private static final long serialVersionUID = 8094547886072529208L;
        public final r<? super T> downstream;
        public final AtomicReference<b> upstream = new AtomicReference<>();

        public SubscribeOnObserver(r<? super T> rVar) {
            this.downstream = rVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // xl.r
        public void onComplete() {
            this.downstream.onComplete();
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
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        public void setDisposable(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SubscribeOnObserver<T> f71598b;

        public a(SubscribeOnObserver<T> subscribeOnObserver) {
            this.f71598b = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            ObservableSubscribeOn.this.f74327b.subscribe(this.f71598b);
        }
    }

    public ObservableSubscribeOn(p<T> pVar, s sVar) {
        super(pVar);
        this.f71597c = sVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(rVar);
        rVar.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.setDisposable(this.f71597c.c(new a(subscribeOnObserver)));
    }
}
