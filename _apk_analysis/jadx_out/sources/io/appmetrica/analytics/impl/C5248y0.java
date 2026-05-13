package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5248y0 implements Ua {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5248y0 f67995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f67996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f67997g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5073r0 f67999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FutureTask f68000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ca f68001d;

    @AnyThread
    public C5248y0(@NonNull Context context) {
        this.f67998a = context;
        C5073r0 c5073r0C = C4696c4.l().c();
        this.f67999b = c5073r0C;
        this.f68001d = c5073r0C.a(context, C4696c4.l().g());
        this.f68000c = new FutureTask(new Callable() { // from class: mh.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f74308b.p();
            }
        });
    }

    @NonNull
    @AnyThread
    public static C5248y0 a(@NonNull Context context) {
        C5248y0 c5248y0 = f67995e;
        if (c5248y0 == null) {
            synchronized (C5248y0.class) {
                c5248y0 = f67995e;
                if (c5248y0 == null) {
                    c5248y0 = new C5248y0(context);
                    c5248y0.j();
                    C4696c4.l().f66453c.a().execute(new RunnableC5223x0(c5248y0));
                    f67995e = c5248y0;
                }
            }
        }
        return c5248y0;
    }

    @WorkerThread
    public static void a(@Nullable Location location) {
        c().a(location);
    }

    @VisibleForTesting(otherwise = 5)
    public static synchronized void a(@Nullable C5248y0 c5248y0) {
        f67995e = c5248y0;
    }

    @WorkerThread
    public static void a(@NonNull String str) {
        c().a(str);
    }

    @WorkerThread
    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    @WorkerThread
    public static void a(boolean z10) {
        c().a(z10);
    }

    @WorkerThread
    public static void b(boolean z10) {
        c().a(z10, true);
    }

    public static Ic c() {
        return m() ? f67995e.f() : C4696c4.l().f66452b;
    }

    @WorkerThread
    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    @AnyThread
    public static synchronized boolean k() {
        return f67996f;
    }

    @AnyThread
    public static boolean l() {
        return f67997g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @androidx.annotation.AnyThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean m() {
        /*
            java.lang.Class<io.appmetrica.analytics.impl.y0> r0 = io.appmetrica.analytics.impl.C5248y0.class
            monitor-enter(r0)
            io.appmetrica.analytics.impl.y0 r1 = io.appmetrica.analytics.impl.C5248y0.f67995e     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L1b
            java.util.concurrent.FutureTask r2 = r1.f68000c     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.isDone()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1b
            io.appmetrica.analytics.impl.Da r1 = r1.f()     // Catch: java.lang.Throwable -> L1e
            io.appmetrica.analytics.impl.kc r1 = r1.i()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            monitor-exit(r0)
            return r1
        L1e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5248y0.m():boolean");
    }

    @VisibleForTesting(otherwise = 5)
    public static synchronized void n() {
        f67995e = null;
        f67996f = false;
        f67997g = false;
    }

    @WorkerThread
    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    @AnyThread
    public static synchronized void q() {
        f67996f = true;
    }

    @AnyThread
    public static void r() {
        f67997g = true;
    }

    @Nullable
    @AnyThread
    public static C5248y0 s() {
        return f67995e;
    }

    @WorkerThread
    public static void setDataSendingEnabled(boolean z10) {
        c().setDataSendingEnabled(z10);
    }

    @WorkerThread
    public static void setUserProfileID(@Nullable String str) {
        c().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Ua
    @NonNull
    public final Ta a() {
        return f().a();
    }

    @WorkerThread
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    @WorkerThread
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    @WorkerThread
    public final void a(@NonNull ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    @WorkerThread
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        f().a(startupParamsCallback, list);
    }

    @NonNull
    @AnyThread
    public final C4773f4 b() {
        return this.f68001d.a();
    }

    @WorkerThread
    public final void b(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C4696c4.l().f66453c.a().execute(new RunnableC5224x1(this.f67998a));
    }

    @NonNull
    @WorkerThread
    public final Sa c(@NonNull ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    @AnyThread
    public final void c(@Nullable AppMetricaConfig appMetricaConfig) {
        this.f68001d.a(appMetricaConfig, this);
    }

    @NonNull
    @AnyThread
    public final Y9 d() {
        return f().d();
    }

    @WorkerThread
    public final void d(@NonNull AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C4696c4.l().f66453c.a().execute(new RunnableC5224x1(this.f67998a));
    }

    @Nullable
    @AnyThread
    public final String e() {
        return f().e();
    }

    public final Da f() {
        try {
            return (Da) this.f68000c.get();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Nullable
    @AnyThread
    public final Map<String, String> g() {
        return f().g();
    }

    @NonNull
    @AnyThread
    public final AdvIdentifiersResult h() {
        return f().h();
    }

    @Nullable
    @WorkerThread
    public final C4910kc i() {
        return f().i();
    }

    public final void j() {
        S3 s32 = C4696c4.l().f66453c;
        Runnable runnable = new Runnable() { // from class: mh.z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74312b.o();
            }
        };
        s32.f65861a.getClass();
        new InterruptionSafeThread(runnable, "IAA-INIT_CORE-" + Ad.f64974a.incrementAndGet()).start();
    }

    public final void o() {
        C4696c4.l().f66468r.a(this.f67998a);
        new W3(this.f67998a).a(this.f67998a);
        C4696c4.l().a(this.f67998a).a();
        this.f68000c.run();
    }

    public final Da p() {
        Da da2;
        C5073r0 c5073r0 = this.f67999b;
        Context context = this.f67998a;
        Ca ca2 = this.f68001d;
        synchronized (c5073r0) {
            if (c5073r0.f67602d == null) {
                if (c5073r0.a(context)) {
                    c5073r0.f67602d = new E0();
                } else {
                    c5073r0.f67602d = new C0(context, ca2);
                }
            }
            da2 = c5073r0.f67602d;
        }
        return da2;
    }
}
