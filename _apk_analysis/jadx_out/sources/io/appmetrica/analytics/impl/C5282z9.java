package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5282z9 implements ExecutorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4944lk f68059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f68060b;

    public C5282z9() {
        C4944lk c4944lkW = C5009oa.k().w();
        this.f68059a = c4944lkW;
        this.f68060b = c4944lkW.b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f68059a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final InterruptionSafeThread getInterruptionThread(@NotNull String str, @NotNull String str2, @NotNull Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + "-" + Ad.f64974a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getModuleExecutor() {
        return this.f68060b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getReportRunnableExecutor() {
        return this.f68059a.d();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getSupportIOExecutor() {
        C4944lk c4944lk = this.f68059a;
        if (c4944lk.f67245f == null) {
            synchronized (c4944lk) {
                if (c4944lk.f67245f == null) {
                    c4944lk.f67240a.getClass();
                    HandlerThreadC4729db handlerThreadC4729dbA = A9.a("IAA-SIO");
                    c4944lk.f67245f = new A9(handlerThreadC4729dbA, handlerThreadC4729dbA.getLooper(), new Handler(handlerThreadC4729dbA.getLooper()));
                }
            }
        }
        return c4944lk.f67245f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getUiExecutor() {
        C4944lk c4944lk = this.f68059a;
        if (c4944lk.f67247h == null) {
            synchronized (c4944lk) {
                if (c4944lk.f67247h == null) {
                    c4944lk.f67240a.getClass();
                    c4944lk.f67247h = new ExecutorC4892jk(new Handler(Looper.getMainLooper()));
                }
            }
        }
        return c4944lk.f67247h;
    }
}
