package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jm.a;
import ms.b;
import ms.c;
import xl.e;
import xl.f;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowableTakeUntil<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ms.a<? extends U> f71378d;

    public static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements f<T>, c {
        private static final long serialVersionUID = -4945480365982832967L;
        public final b<? super T> downstream;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicReference<c> upstream = new AtomicReference<>();
        public final TakeUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        public final AtomicThrowable error = new AtomicThrowable();

        public final class OtherSubscriber extends AtomicReference<c> implements f<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            public OtherSubscriber() {
            }

            @Override // ms.b
            public void onComplete() {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.upstream);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                qm.f.a(takeUntilMainSubscriber.downstream, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // ms.b
            public void onError(Throwable th2) {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.upstream);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                qm.f.c(takeUntilMainSubscriber.downstream, th2, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // ms.b
            public void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                onComplete();
            }

            @Override // xl.f, ms.b
            public void onSubscribe(c cVar) {
                SubscriptionHelper.setOnce(this, cVar, Long.MAX_VALUE);
            }
        }

        public TakeUntilMainSubscriber(b<? super T> bVar) {
            this.downstream = bVar;
        }

        @Override // ms.c
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        @Override // ms.b
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            qm.f.a(this.downstream, this, this.error);
        }

        @Override // ms.b
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.other);
            qm.f.c(this.downstream, th2, this, this.error);
        }

        @Override // ms.b
        public void onNext(T t10) {
            qm.f.e(this.downstream, t10, this, this.error);
        }

        @Override // xl.f, ms.b
        public void onSubscribe(c cVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, cVar);
        }

        @Override // ms.c
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
        }
    }

    public FlowableTakeUntil(e<T> eVar, ms.a<? extends U> aVar) {
        super(eVar);
        this.f71378d = aVar;
    }

    @Override // xl.e
    public void n(b<? super T> bVar) {
        TakeUntilMainSubscriber takeUntilMainSubscriber = new TakeUntilMainSubscriber(bVar);
        bVar.onSubscribe(takeUntilMainSubscriber);
        this.f71378d.a(takeUntilMainSubscriber.other);
        this.f72490c.m(takeUntilMainSubscriber);
    }
}
