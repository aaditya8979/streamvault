package io.reactivex.internal.operators.flowable;

import bm.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ms.c;
import xl.e;
import xl.s;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTimer extends e<Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f71379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f71381e;

    public static final class TimerSubscriber extends AtomicReference<b> implements c, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public final ms.b<? super Long> downstream;
        public volatile boolean requested;

        public TimerSubscriber(ms.b<? super Long> bVar) {
            this.downstream = bVar;
        }

        @Override // ms.c
        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // ms.c
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.requested = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (!this.requested) {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.downstream.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onComplete();
                }
            }
        }

        public void setResource(b bVar) {
            DisposableHelper.trySet(this, bVar);
        }
    }

    public FlowableTimer(long j10, TimeUnit timeUnit, s sVar) {
        this.f71380d = j10;
        this.f71381e = timeUnit;
        this.f71379c = sVar;
    }

    @Override // xl.e
    public void n(ms.b<? super Long> bVar) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(bVar);
        bVar.onSubscribe(timerSubscriber);
        timerSubscriber.setResource(this.f71379c.d(timerSubscriber, this.f71380d, this.f71381e));
    }
}
