package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f97276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f97277c;

    public yr1(long j10, String str, List list) {
        this.f97275a = str;
        this.f97276b = list;
        this.f97277c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr1)) {
            return false;
        }
        yr1 yr1Var = (yr1) obj;
        return tn.p.f(this.f97275a, yr1Var.f97275a) && tn.p.f(this.f97276b, yr1Var.f97276b) && this.f97277c == yr1Var.f97277c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f97277c) + eb.a(this.f97276b, this.f97275a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnitSettings(adUnitId=" + this.f97275a + ", networks=" + this.f97276b + ", loadTimeoutMillis=" + this.f97277c + ")";
    }
}
