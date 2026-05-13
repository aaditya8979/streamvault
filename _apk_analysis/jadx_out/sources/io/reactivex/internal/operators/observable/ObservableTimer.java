package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservableTimer extends k<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f71629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f71631d;

    public static final class TimerObserver extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public final r<? super Long> downstream;

        public TimerObserver(r<? super Long> rVar) {
            this.downstream = rVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            this.downstream.onComplete();
        }

        public void setResource(b bVar) {
            DisposableHelper.trySet(this, bVar);
        }
    }

    public ObservableTimer(long j10, TimeUnit timeUnit, s sVar) {
        this.f71630c = j10;
        this.f71631d = timeUnit;
        this.f71629b = sVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super Long> rVar) {
        TimerObserver timerObserver = new TimerObserver(rVar);
        rVar.onSubscribe(timerObserver);
        timerObserver.setResource(this.f71629b.d(timerObserver, this.f71630c, this.f71631d));
    }
}
