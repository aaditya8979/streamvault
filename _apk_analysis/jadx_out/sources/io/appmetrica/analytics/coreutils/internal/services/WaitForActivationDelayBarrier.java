package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: loaded from: classes5.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f64773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f64774b;

    public static class ActivationBarrierHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f64775a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f64776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f64777c;

        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f64776b = new a(this, runnable);
            this.f64777c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j10, @NonNull ICommonExecutor iCommonExecutor) {
            if (this.f64775a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f64777c.subscribe(j10, iCommonExecutor, this.f64776b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f64774b = systemTimeProvider;
    }

    public void activate() {
        this.f64773a = this.f64774b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j10, @NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j10 - (this.f64774b.currentTimeMillis() - this.f64773a), 0L));
    }
}
