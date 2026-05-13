package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes4.dex */
public final class C9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65100a;

    public C9(long j10) {
        this.f65100a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9) && this.f65100a == ((C9) obj).f65100a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f65100a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f65100a + ')';
    }
}
