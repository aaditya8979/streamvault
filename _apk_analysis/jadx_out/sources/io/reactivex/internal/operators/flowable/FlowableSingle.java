package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import jm.a;
import ms.b;
import ms.c;
import xl.e;
import xl.f;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSingle<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f71376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f71377e;

    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements f<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        public final T defaultValue;
        public boolean done;
        public final boolean failOnEmpty;
        public c upstream;

        public SingleElementSubscriber(b<? super T> bVar, T t10, boolean z10) {
            super(bVar);
            this.defaultValue = t10;
            this.failOnEmpty = z10;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ms.c
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // ms.b
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t10 = this.value;
            this.value = null;
            if (t10 == null) {
                t10 = this.defaultValue;
            }
            if (t10 != null) {
                complete(t10);
            } else if (this.failOnEmpty) {
                this.downstream.onError(new NoSuchElementException());
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // ms.b
        public void onError(Throwable th2) {
            if (this.done) {
                tm.a.s(th2);
            } else {
                this.done = true;
                this.downstream.onError(th2);
            }
        }

        @Override // ms.b
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.value == null) {
                this.value = t10;
                return;
            }
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // xl.f, ms.b
        public void onSubscribe(c cVar) {
            if (SubscriptionHelper.validate(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingle(e<T> eVar, T t10, boolean z10) {
        super(eVar);
        this.f71376d = t10;
        this.f71377e = z10;
    }

    @Override // xl.e
    public void n(b<? super T> bVar) {
        this.f72490c.m(new SingleElementSubscriber(bVar, this.f71376d, this.f71377e));
    }
}
