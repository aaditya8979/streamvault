package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C5049q0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5049q0 implements Ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f67546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4773f4 f67547c = new C4773f4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f67548d = f().getHandler();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T1 f67549e = new T1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4935lb f67550f = new C4935lb();

    public C5049q0(@NotNull Context context, @NotNull S3 s32) {
        this.f67545a = context;
        this.f67546b = s32.a();
        BaseReleaseLogger.init(context);
        f().execute(new Runnable() { // from class: mh.l0
            @Override // java.lang.Runnable
            public final void run() {
                C5049q0.e();
            }
        });
        a().a();
        G3.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.14.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 26.11.2025.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final C4773f4 a() {
        return this.f67547c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[Catch: all -> 0x0052, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:13:0x0016, B:18:0x0031, B:20:0x0035, B:22:0x0039, B:25:0x0040, B:28:0x004d, B:26:0x0046, B:14:0x001c, B:16:0x0028), top: B:34:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:13:0x0016, B:18:0x0031, B:20:0x0035, B:22:0x0039, B:25:0x0040, B:28:0x004d, B:26:0x0046, B:14:0x001c, B:16:0x0028), top: B:34:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(@org.jetbrains.annotations.Nullable io.appmetrica.analytics.AppMetricaConfig r3, @org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.Ua r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = io.appmetrica.analytics.impl.C5248y0.f67997g     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L50
            if (r3 == 0) goto L1c
            java.lang.Boolean r0 = r3.crashReporting     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto Ld
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L52
        Ld:
            if (r0 == 0) goto L1c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L16
            goto L1c
        L16:
            io.appmetrica.analytics.impl.lb r4 = r2.f67550f     // Catch: java.lang.Throwable -> L52
            r4.a()     // Catch: java.lang.Throwable -> L52
            goto L2f
        L1c:
            io.appmetrica.analytics.impl.lb r0 = r2.f67550f     // Catch: java.lang.Throwable -> L52
            r0.c()     // Catch: java.lang.Throwable -> L52
            io.appmetrica.analytics.impl.lb r0 = r2.f67550f     // Catch: java.lang.Throwable -> L52
            r0.b()     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L2f
            io.appmetrica.analytics.impl.lb r0 = r2.f67550f     // Catch: java.lang.Throwable -> L52
            android.content.Context r1 = r2.f67545a     // Catch: java.lang.Throwable -> L52
            r0.a(r1, r3, r4)     // Catch: java.lang.Throwable -> L52
        L2f:
            if (r3 == 0) goto L46
            java.lang.Boolean r4 = r3.appOpenTrackingEnabled     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L37
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L52
        L37:
            if (r4 == 0) goto L46
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L40
            goto L46
        L40:
            io.appmetrica.analytics.impl.T1 r4 = r2.f67549e     // Catch: java.lang.Throwable -> L52
            r4.c()     // Catch: java.lang.Throwable -> L52
            goto L4b
        L46:
            io.appmetrica.analytics.impl.T1 r4 = r2.f67549e     // Catch: java.lang.Throwable -> L52
            r4.b()     // Catch: java.lang.Throwable -> L52
        L4b:
            if (r3 == 0) goto L50
            r3 = 1
            io.appmetrica.analytics.impl.C5248y0.f67997g = r3     // Catch: java.lang.Throwable -> L52
        L50:
            monitor-exit(r2)
            return
        L52:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5049q0.a(io.appmetrica.analytics.AppMetricaConfig, io.appmetrica.analytics.impl.Ua):void");
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final Handler b() {
        return this.f67548d;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final T1 c() {
        return this.f67549e;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final C4935lb d() {
        return this.f67550f;
    }

    @NotNull
    public final IHandlerExecutor f() {
        return this.f67546b;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final ICommonExecutor getDefaultExecutor() {
        return this.f67546b;
    }
}
