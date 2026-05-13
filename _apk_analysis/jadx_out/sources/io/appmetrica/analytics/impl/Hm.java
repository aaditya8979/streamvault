package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class Hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65339a;

    public Hm(long j10) {
        this.f65339a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Hm.class == obj.getClass() && this.f65339a == ((Hm) obj).f65339a;
    }

    public final int hashCode() {
        long j10 = this.f65339a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f65339a + '}';
    }
}
