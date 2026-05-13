package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.C4666b0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4666b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5273z0 f66403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xk f66404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3 f66405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f66406d = TimeUnit.SECONDS.toMillis(10);

    public C4666b0(C5273z0 c5273z0, Xk xk2, S3 s32) {
        this.f66403a = c5273z0;
        this.f66404b = xk2;
        this.f66405c = s32;
    }

    public static final void a(C4666b0 c4666b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c4666b0.f66403a.getClass();
        C5248y0 c5248y0A = C5248y0.a(context);
        c5248y0A.f().a(appMetricaLibraryAdapterConfig);
        C4696c4.l().f66453c.a().execute(new RunnableC5224x1(c5248y0A.f67998a));
    }

    public final synchronized void a(final Context context, final AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f66403a.getClass();
        if (C5273z0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f66404b.a();
        this.f66403a.getClass();
        C5248y0 c5248y0A = C5248y0.a(context);
        c5248y0A.f68001d.a(null, c5248y0A);
        IHandlerExecutor iHandlerExecutorA = this.f66405c.a();
        ((A9) iHandlerExecutorA).f64970b.post(new Runnable() { // from class: mh.z
            @Override // java.lang.Runnable
            public final void run() {
                C4666b0.a(this.f74309b, context, appMetricaLibraryAdapterConfig);
            }
        });
        this.f66403a.getClass();
        C5273z0.b();
    }
}
