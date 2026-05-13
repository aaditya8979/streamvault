package io.appmetrica.analytics.billing.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4635a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f64446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64447b;

    public C4635a(List list, boolean z10) {
        this.f64446a = list;
        this.f64447b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4635a)) {
            return false;
        }
        C4635a c4635a = (C4635a) obj;
        return tn.p.f(this.f64446a, c4635a.f64446a) && this.f64447b == c4635a.f64447b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f64446a.hashCode() * 31;
        boolean z10 = this.f64447b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f64446a + ", firstInappCheckOccurred=" + this.f64447b + ')';
    }
}
