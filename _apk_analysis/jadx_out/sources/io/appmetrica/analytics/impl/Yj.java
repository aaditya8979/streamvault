package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f66269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4655af f66270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeProvider f66271c;

    public static Yj c() {
        return Xj.f66181a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f66269a;
    }

    public final synchronized void a(long j10, @Nullable Long l10) {
        this.f66269a = (j10 - this.f66271c.currentTimeMillis()) / 1000;
        boolean z10 = true;
        if (this.f66270b.b(true)) {
            if (l10 != null) {
                long jAbs = Math.abs(j10 - this.f66271c.currentTimeMillis());
                C4655af c4655af = this.f66270b;
                if (jAbs <= TimeUnit.SECONDS.toMillis(l10.longValue())) {
                    z10 = false;
                }
                c4655af.d(z10);
            } else {
                this.f66270b.d(false);
            }
        }
        this.f66270b.d(this.f66269a);
        this.f66270b.b();
    }

    @VisibleForTesting
    public final void a(C4655af c4655af, TimeProvider timeProvider) {
        this.f66270b = c4655af;
        this.f66269a = c4655af.a(0);
        this.f66271c = timeProvider;
    }

    public final synchronized void b() {
        this.f66270b.d(false);
        this.f66270b.b();
    }

    public final synchronized long d() {
        return this.f66269a;
    }

    public final synchronized void e() {
        a(C5009oa.I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f66270b.b(true);
    }
}
