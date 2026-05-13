package io.reactivex.internal.operators.single;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import ms.a;
import ms.c;
import xl.f;
import xl.t;
import xl.u;
import xl.v;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleTakeUntil<T, U> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<T> f71674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<U> f71675b;

    public static final class TakeUntilMainObserver<T> extends AtomicReference<b> implements u<T>, b {
        private static final long serialVersionUID = -622603812305745221L;
        public final u<? super T> downstream;
        public final TakeUntilOtherSubscriber other = new TakeUntilOtherSubscriber(this);

        public TakeUntilMainObserver(u<? super T> uVar) {
            this.downstream = uVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.other.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            this.other.dispose();
            b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                tm.a.s(th2);
            } else {
                this.downstream.onError(th2);
            }
        }

        @Override // xl.u
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // xl.u
        public void onSuccess(T t10) {
            this.other.dispose();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onSuccess(t10);
            }
        }

        public void otherError(Throwable th2) {
            b andSet;
            b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                tm.a.s(th2);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.downstream.onError(th2);
        }
    }

    public static final class TakeUntilOtherSubscriber extends AtomicReference<c> implements f<Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        public final TakeUntilMainObserver<?> parent;

        public TakeUntilOtherSubscriber(TakeUntilMainObserver<?> takeUntilMainObserver) {
            this.parent = takeUntilMainObserver;
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // ms.b
        public void onComplete() {
            c cVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (cVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.otherError(new CancellationException());
            }
        }

        @Override // ms.b
        public void onError(Throwable th2) {
            this.parent.otherError(th2);
        }

        @Override // ms.b
        public void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.parent.otherError(new CancellationException());
            }
        }

        @Override // xl.f, ms.b
        public void onSubscribe(c cVar) {
            SubscriptionHelper.setOnce(this, cVar, Long.MAX_VALUE);
        }
    }

    public SingleTakeUntil(v<T> vVar, a<U> aVar) {
        this.f71674a = vVar;
        this.f71675b = aVar;
    }

    @Override // xl.t
    public void m(u<? super T> uVar) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(uVar);
        uVar.onSubscribe(takeUntilMainObserver);
        this.f71675b.a(takeUntilMainObserver.other);
        this.f71674a.c(takeUntilMainObserver);
    }
}
