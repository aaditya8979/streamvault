package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class Ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f65205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vk f65206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hk f65207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f65208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f65209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicLong f65210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f65211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Tk f65212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f65213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f65214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f65215k;

    public Ek(Y4 y42, Vk vk2, Hk hk2, SystemTimeProvider systemTimeProvider) {
        this.f65205a = y42;
        this.f65206b = vk2;
        this.f65207c = hk2;
        this.f65215k = systemTimeProvider;
        a();
    }

    public final void a() {
        Hk hk2 = this.f65207c;
        long jElapsedRealtime = this.f65215k.elapsedRealtime();
        Long l10 = hk2.f65332c;
        if (l10 != null) {
            jElapsedRealtime = l10.longValue();
        }
        this.f65209e = jElapsedRealtime;
        Long l11 = this.f65207c.f65331b;
        this.f65208d = l11 != null ? l11.longValue() : -1L;
        Long l12 = this.f65207c.f65334e;
        this.f65210f = new AtomicLong(l12 == null ? 0L : l12.longValue());
        Boolean bool = this.f65207c.f65335f;
        this.f65211g = bool != null ? bool.booleanValue() : true;
        Long l13 = this.f65207c.f65336g;
        long jLongValue = l13 != null ? l13.longValue() : 0L;
        this.f65213i = jLongValue;
        Hk hk3 = this.f65207c;
        long jLongValue2 = jLongValue - this.f65209e;
        Long l14 = hk3.f65337h;
        if (l14 != null) {
            jLongValue2 = l14.longValue();
        }
        this.f65214j = jLongValue2;
    }

    public final String toString() {
        return "Session{id=" + this.f65208d + ", creationTime=" + this.f65209e + ", currentReportId=" + this.f65210f + ", sessionRequestParams=" + this.f65212h + ", sleepStart=" + this.f65213i + '}';
    }
}
