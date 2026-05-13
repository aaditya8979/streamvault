package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5291zi implements InterfaceC4763ek {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C5266yi f68064e = new C5266yi();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f68065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f68066g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5024p0 f68067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zj f68068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeProvider f68069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f68070d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f68065f = timeUnit.toMillis(1L);
        f68066g = timeUnit.toMillis(4L);
    }

    public C5291zi(@NotNull C5024p0 c5024p0, @NotNull Zj zj2) {
        this(c5024p0, zj2, new SystemTimeProvider());
    }

    @VisibleForTesting
    public C5291zi(@NotNull C5024p0 c5024p0, @NotNull Zj zj2, @NotNull TimeProvider timeProvider) {
        this.f68067a = c5024p0;
        this.f68068b = zj2;
        this.f68069c = timeProvider;
        this.f68070d = C4696c4.l().g().b();
    }

    public final void a(@NotNull Cf cf2) {
        ICommonExecutor iCommonExecutor = this.f68070d;
        Zj zj2 = this.f68068b;
        iCommonExecutor.submit(new C5112se(zj2.f66311b, zj2.f66312c, cf2));
    }

    public final void a(@NotNull C5215wh c5215wh) {
        AbstractCallableC5265yh qg2;
        ICommonExecutor iCommonExecutor = this.f68070d;
        if (c5215wh.f67903b) {
            Zj zj2 = this.f68068b;
            qg2 = new C4724d6(zj2.f66310a, zj2.f66311b, zj2.f66312c, c5215wh);
        } else {
            Zj zj3 = this.f68068b;
            qg2 = new Qg(zj3.f66311b, zj3.f66312c, c5215wh);
        }
        iCommonExecutor.submit(qg2);
    }

    public final void b(@NotNull Cf cf2) {
        ICommonExecutor iCommonExecutor = this.f68070d;
        Zj zj2 = this.f68068b;
        iCommonExecutor.submit(new Fi(zj2.f66311b, zj2.f66312c, cf2));
    }

    public final void b(@NotNull C5215wh c5215wh) {
        long jUptimeMillis = this.f68069c.uptimeMillis();
        Zj zj2 = this.f68068b;
        C4724d6 c4724d6 = new C4724d6(zj2.f66310a, zj2.f66311b, zj2.f66312c, c5215wh);
        long j10 = tn.p.f(Looper.myLooper(), Looper.getMainLooper()) ? f68065f : f68066g;
        if (this.f68067a.a()) {
            try {
                this.f68070d.submit(c4724d6).get(j10, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c4724d6.f68046c) {
            return;
        }
        try {
            c4724d6.a();
            Thread.sleep(Math.max(0L, j10 - (this.f68069c.uptimeMillis() - jUptimeMillis)));
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4763ek
    public final void reportData(int i10, @NotNull Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f68070d;
        Zj zj2 = this.f68068b;
        iCommonExecutor.submit(new On(zj2.f66311b, zj2.f66312c, i10, bundle));
    }
}
