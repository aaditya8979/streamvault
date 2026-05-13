package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p03 f91502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r03 f91503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f91504c;

    public k7(p03 p03Var, r03 r03Var, long j10) {
        this.f91502a = p03Var;
        this.f91503b = r03Var;
        this.f91504c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.f91502a == k7Var.f91502a && this.f91503b == k7Var.f91503b && this.f91504c == k7Var.f91504c;
    }

    public final int hashCode() {
        p03 p03Var = this.f91502a;
        int iHashCode = (p03Var == null ? 0 : p03Var.hashCode()) * 31;
        r03 r03Var = this.f91503b;
        return Long.hashCode(this.f91504c) + ((iHashCode + (r03Var != null ? r03Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdPodSkip(transitionStrategy=" + this.f91502a + ", visibility=" + this.f91503b + ", delay=" + this.f91504c + ")";
    }
}
