package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90274b;

    public h8(boolean z10, int i10) {
        this.f90273a = i10;
        this.f90274b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return this.f90273a == h8Var.f90273a && this.f90274b == h8Var.f90274b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90274b) + (Integer.hashCode(this.f90273a) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + this.f90273a + ", disabled=" + this.f90274b + ")";
    }
}
