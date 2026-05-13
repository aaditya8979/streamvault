package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class yz2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97338c;

    public yz2(int i10, int i11) {
        this.f97337b = i10;
        this.f97338c = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yz2 yz2Var = (yz2) obj;
        return tn.p.m(this.f97337b * this.f97338c, yz2Var.f97337b * yz2Var.f97338c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz2)) {
            return false;
        }
        yz2 yz2Var = (yz2) obj;
        return this.f97337b == yz2Var.f97337b && this.f97338c == yz2Var.f97338c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f97338c) + (Integer.hashCode(this.f97337b) * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f97337b + ", height=" + this.f97338c + ")";
    }
}
