package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUnit f19576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t1 f19578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u1 f19580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f19581f;

    public v1(TimeUnit timeUnit, long j10) {
        this.f19579d = false;
        this.f19581f = 0L;
        this.f19577b = j10;
        this.f19576a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }

    public v1(TimeUnit timeUnit, long j10, long j11) {
        this.f19579d = false;
        this.f19577b = j10;
        this.f19576a = timeUnit;
        this.f19581f = j11;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }

    public final void a(long j10) {
        long jUptimeMillis = (SystemClock.uptimeMillis() - j10) + 50 + this.f19581f;
        this.f19581f = jUptimeMillis;
        if (this.f19580e != null && jUptimeMillis > this.f19576a.toMillis(this.f19577b)) {
            this.f19580e.a();
            return;
        }
        t1 t1Var = this.f19578c;
        if (t1Var == null || this.f19580e == null) {
            return;
        }
        t1Var.removeMessages(1932593528);
        this.f19578c.sendEmptyMessageDelayed(1932593528, 50L);
    }
}
