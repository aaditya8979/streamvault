package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class jj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kj1 f91248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kj1 f91249b;

    public jj1(kj1 kj1Var, kj1 kj1Var2) {
        this.f91248a = kj1Var;
        this.f91249b = kj1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj1)) {
            return false;
        }
        jj1 jj1Var = (jj1) obj;
        return tn.p.f(this.f91248a, jj1Var.f91248a) && tn.p.f(this.f91249b, jj1Var.f91249b);
    }

    public final int hashCode() {
        return this.f91249b.hashCode() + (this.f91248a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredSize(width=" + this.f91248a + ", height=" + this.f91249b + ")";
    }
}
