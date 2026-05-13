package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import jm.a;
import ms.b;
import ms.c;
import xl.e;
import xl.f;

/* JADX INFO: loaded from: classes8.dex */
public final class FlowableOnBackpressureError<T> extends a<T, T> {

    public static final class BackpressureErrorSubscriber<T> extends AtomicLong implements f<T>, c {
        private static final long serialVersionUID = -3176480756392482682L;
        public boolean done;
        public final b<? super T> downstream;
        public c upstream;

        public BackpressureErrorSubscriber(b<? super T> bVar) {
            this.downstream = bVar;
        }

        @Override // ms.c
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // ms.b
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
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
            if (get() == 0) {
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            } else {
                this.downstream.onNext(t10);
                qm.b.c(this, 1L);
            }
        }

        @Override // xl.f, ms.b
        public void onSubscribe(c cVar) {
            if (SubscriptionHelper.validate(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // ms.c
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                qm.b.a(this, j10);
            }
        }
    }

    public FlowableOnBackpressureError(e<T> eVar) {
        super(eVar);
    }

    @Override // xl.e
    public void n(b<? super T> bVar) {
        this.f72490c.m(new BackpressureErrorSubscriber(bVar));
    }
}
