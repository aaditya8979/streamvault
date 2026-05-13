package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f96655b;

    public x8(boolean z10, int i10) {
        this.f96654a = i10;
        this.f96655b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj;
        return this.f96654a == x8Var.f96654a && this.f96655b == x8Var.f96655b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96655b) + (Integer.hashCode(this.f96654a) * 31);
    }

    public final String toString() {
        return "AdQualityVerifierNetworkConfiguration(usagePercent=" + this.f96654a + ", disabled=" + this.f96655b + ")";
    }
}
