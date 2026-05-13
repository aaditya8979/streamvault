package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class A9 implements IHandlerExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f64969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f64970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThreadC4729db f64971c;

    public A9(HandlerThreadC4729db handlerThreadC4729db) {
        this(handlerThreadC4729db, handlerThreadC4729db.getLooper(), new Handler(handlerThreadC4729db.getLooper()));
    }

    @VisibleForTesting
    public A9(@NonNull HandlerThreadC4729db handlerThreadC4729db, @NonNull Looper looper, @NonNull Handler handler) {
        this.f64971c = handlerThreadC4729db;
        this.f64969a = looper;
        this.f64970b = handler;
    }

    public A9(@NonNull String str) {
        this(a(str));
    }

    public static HandlerThreadC4729db a(String str) {
        HandlerThreadC4729db handlerThreadC4729db = new HandlerThreadC4729db(str + "-" + Ad.f64974a.incrementAndGet());
        handlerThreadC4729db.start();
        return handlerThreadC4729db;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f64970b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j10) {
        this.f64970b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j10));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
        this.f64970b.postDelayed(runnable, timeUnit.toMillis(j10));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.f64970b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.f64969a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z10;
        HandlerThreadC4729db handlerThreadC4729db = this.f64971c;
        synchronized (handlerThreadC4729db) {
            z10 = handlerThreadC4729db.f66596a;
        }
        return z10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.f64970b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f64970b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC4729db handlerThreadC4729db = this.f64971c;
        synchronized (handlerThreadC4729db) {
            handlerThreadC4729db.f66596a = false;
            handlerThreadC4729db.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f64970b.post(futureTask);
        return futureTask;
    }
}
