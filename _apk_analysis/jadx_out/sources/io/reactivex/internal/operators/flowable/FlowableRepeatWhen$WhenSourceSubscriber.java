package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import ms.b;
import ms.c;
import um.a;
import xl.f;

/* JADX INFO: loaded from: classes11.dex */
abstract class FlowableRepeatWhen$WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements f<T> {
    private static final long serialVersionUID = -5604623027276966720L;
    public final b<? super T> downstream;
    public final a<U> processor;
    private long produced;
    public final c receiver;

    public FlowableRepeatWhen$WhenSourceSubscriber(b<? super T> bVar, a<U> aVar, c cVar) {
        this.downstream = bVar;
        this.processor = aVar;
        this.receiver = cVar;
    }

    public final void again(U u10) {
        long j10 = this.produced;
        if (j10 != 0) {
            this.produced = 0L;
            produced(j10);
        }
        this.receiver.request(1L);
        this.processor.onNext(u10);
    }

    @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, ms.c
    public final void cancel() {
        super.cancel();
        this.receiver.cancel();
    }

    @Override // ms.b
    public abstract /* synthetic */ void onComplete();

    @Override // ms.b
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // ms.b
    public final void onNext(T t10) {
        this.produced++;
        this.downstream.onNext(t10);
    }

    @Override // xl.f, ms.b
    public final void onSubscribe(c cVar) {
        setSubscription(cVar);
    }
}
