package io.appmetrica.analytics.idsync.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64942c;

    public z(String str, long j10, int i10) {
        this.f64940a = str;
        this.f64941b = j10;
        this.f64942c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return tn.p.f(this.f64940a, zVar.f64940a) && this.f64941b == zVar.f64941b && this.f64942c == zVar.f64942c;
    }

    public final int hashCode() {
        return v.a(this.f64942c) + ((Long.hashCode(this.f64941b) + (this.f64940a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f64940a + ", lastAttempt=" + this.f64941b + ", lastAttemptResult=" + u.b(this.f64942c) + ')';
    }
}
