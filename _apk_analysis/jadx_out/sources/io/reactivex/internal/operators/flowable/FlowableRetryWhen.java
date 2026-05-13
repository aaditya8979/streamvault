package io.reactivex.internal.operators.flowable;

import dm.o;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.UnicastProcessor;
import jm.a;
import ms.b;
import ms.c;
import xl.e;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableRetryWhen<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super e<Throwable>, ? extends ms.a<?>> f71375d;

    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen$WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public RetryWhenSubscriber(b<? super T> bVar, um.a<Throwable> aVar, c cVar) {
            super(bVar, aVar, cVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber, ms.b
        public void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber, ms.b
        public void onError(Throwable th2) {
            again(th2);
        }
    }

    public FlowableRetryWhen(e<T> eVar, o<? super e<Throwable>, ? extends ms.a<?>> oVar) {
        super(eVar);
        this.f71375d = oVar;
    }

    @Override // xl.e
    public void n(b<? super T> bVar) {
        xm.a aVar = new xm.a(bVar);
        um.a<T> aVarR = UnicastProcessor.t(8).r();
        try {
            ms.a aVar2 = (ms.a) fm.a.e(this.f71375d.apply(aVarR), "handler returned a null Publisher");
            FlowableRepeatWhen$WhenReceiver flowableRepeatWhen$WhenReceiver = new FlowableRepeatWhen$WhenReceiver(this.f72490c);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(aVar, aVarR, flowableRepeatWhen$WhenReceiver);
            flowableRepeatWhen$WhenReceiver.subscriber = retryWhenSubscriber;
            bVar.onSubscribe(retryWhenSubscriber);
            aVar2.a(flowableRepeatWhen$WhenReceiver);
            flowableRepeatWhen$WhenReceiver.onNext(0);
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptySubscription.error(th2, bVar);
        }
    }
}
