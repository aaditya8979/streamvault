package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4705cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66528b;

    public C4705cd(String str, boolean z10) {
        this.f66527a = str;
        this.f66528b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4705cd)) {
            return false;
        }
        C4705cd c4705cd = (C4705cd) obj;
        return tn.p.f(this.f66527a, c4705cd.f66527a) && this.f66528b == c4705cd.f66528b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f66527a.hashCode() * 31;
        boolean z10 = this.f66528b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f66527a + ", loaded=" + this.f66528b + ')';
    }
}
