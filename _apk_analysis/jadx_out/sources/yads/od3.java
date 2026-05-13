package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class od3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f93190d;

    public od3(int i10, int i11, int i12) {
        this.f93188b = i10;
        this.f93189c = i11;
        this.f93190d = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(od3 od3Var) {
        int i10 = this.f93188b;
        int i11 = od3Var.f93188b;
        if (i10 != i11) {
            return tn.p.m(i10, i11);
        }
        int i12 = this.f93189c;
        int i13 = od3Var.f93189c;
        return i12 != i13 ? tn.p.m(i12, i13) : tn.p.m(this.f93190d, od3Var.f93190d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od3)) {
            return false;
        }
        od3 od3Var = (od3) obj;
        return this.f93188b == od3Var.f93188b && this.f93189c == od3Var.f93189c && this.f93190d == od3Var.f93190d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93190d) + nd3.a(this.f93189c, Integer.hashCode(this.f93188b) * 31, 31);
    }

    public final String toString() {
        return this.f93188b + "." + this.f93189c + "." + this.f93190d;
    }
}
