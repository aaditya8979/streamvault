package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class h92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c83 f90306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb3 f90307b;

    public h92(c83 c83Var, qb3 qb3Var) {
        this.f90306a = c83Var;
        this.f90307b = qb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h92)) {
            return false;
        }
        h92 h92Var = (h92) obj;
        return tn.p.f(this.f90306a, h92Var.f90306a) && tn.p.f(this.f90307b, h92Var.f90307b);
    }

    public final int hashCode() {
        return this.f90307b.hashCode() + (this.f90306a.hashCode() * 31);
    }

    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.f90306a + ", validationResult=" + this.f90307b + ")";
    }
}
