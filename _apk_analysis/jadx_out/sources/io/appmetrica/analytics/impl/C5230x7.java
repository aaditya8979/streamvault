package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5230x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67932b;

    public C5230x7(long j10, int i10) {
        this.f67931a = j10;
        this.f67932b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5230x7)) {
            return false;
        }
        C5230x7 c5230x7 = (C5230x7) obj;
        return this.f67931a == c5230x7.f67931a && this.f67932b == c5230x7.f67932b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67932b) + (Long.hashCode(this.f67931a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f67931a + ", exponent=" + this.f67932b + ')';
    }
}
