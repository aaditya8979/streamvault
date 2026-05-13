package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@so.k
public final class ha0 {

    @NotNull
    public static final ga0 Companion = new ga0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f90333b;

    public /* synthetic */ ha0(int i10, String str, double d10) {
        if (3 != (i10 & 3)) {
            wo.c2.a(i10, 3, fa0.f89521a.getDescriptor());
        }
        this.f90332a = str;
        this.f90333b = d10;
    }

    public final double a() {
        return this.f90333b;
    }

    public final String b() {
        return this.f90332a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0Var = (ha0) obj;
        return tn.p.f(this.f90332a, ha0Var.f90332a) && Double.compare(this.f90333b, ha0Var.f90333b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f90333b) + (this.f90332a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + this.f90332a + ", minCpm=" + this.f90333b + ")";
    }
}
