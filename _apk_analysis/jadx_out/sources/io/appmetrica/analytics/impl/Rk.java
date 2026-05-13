package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class Rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo f65844a;

    public Rk(yo yoVar) {
        this.f65844a = yoVar;
    }

    public final long a() {
        long jOptLong;
        yo yoVar = this.f65844a;
        synchronized (yoVar) {
            jOptLong = yoVar.f68052a.a().optLong("session_id", -1L);
        }
        long j10 = jOptLong >= 10000000000L ? 1 + jOptLong : 10000000000L;
        this.f65844a.b(j10);
        return j10;
    }
}
