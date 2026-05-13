package com.inmobi.media;

/* JADX INFO: loaded from: classes6.dex */
public final class Dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f25345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25346b;

    public Dn(p000do.l0 l0Var, int i10) {
        tn.p.k(l0Var, "coroutineScope");
        this.f25345a = l0Var;
        this.f25346b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dn)) {
            return false;
        }
        Dn dn2 = (Dn) obj;
        return tn.p.f(this.f25345a, dn2.f25345a) && this.f25346b == dn2.f25346b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25346b) + (this.f25345a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.f25345a + ", impressionMinDuration=" + this.f25346b + ")";
    }
}
