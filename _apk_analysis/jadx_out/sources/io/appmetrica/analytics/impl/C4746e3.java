package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4746e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f66649a;

    public C4746e3(long j10) {
        this.f66649a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4746e3.class == obj.getClass() && this.f66649a == ((C4746e3) obj).f66649a;
    }

    public final int hashCode() {
        long j10 = this.f66649a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f66649a + '}';
    }
}
