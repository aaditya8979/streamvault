package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@so.k
public final class gi2 {

    @NotNull
    public static final fi2 Companion = new fi2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f89996a;

    public /* synthetic */ gi2(int i10, double d10) {
        if (1 != (i10 & 1)) {
            wo.c2.a(i10, 1, ei2.f89267a.getDescriptor());
        }
        this.f89996a = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi2) && Double.compare(this.f89996a, ((gi2) obj).f89996a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f89996a);
    }

    public final String toString() {
        return "PrefetchedMediationRevenue(value=" + this.f89996a + ")";
    }
}
