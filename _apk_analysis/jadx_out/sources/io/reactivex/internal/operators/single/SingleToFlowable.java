package io.reactivex.internal.operators.single;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import xl.e;
import xl.u;
import xl.v;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleToFlowable<T> extends e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v<? extends T> f71676c;

    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements u<T> {
        private static final long serialVersionUID = 187782011903685568L;
        public b upstream;

        public SingleToFlowableObserver(ms.b<? super T> bVar) {
            super(bVar);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ms.c
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // xl.u
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // xl.u
        public void onSuccess(T t10) {
            complete(t10);
        }
    }

    public SingleToFlowable(v<? extends T> vVar) {
        this.f71676c = vVar;
    }

    @Override // xl.e
    public void n(ms.b<? super T> bVar) {
        this.f71676c.c(new SingleToFlowableObserver(bVar));
    }
}
