package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class gu2 implements iu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im3 f90121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xy f90122b;

    public gu2(im3 im3Var, xy xyVar) {
        this.f90121a = im3Var;
        this.f90122b = xyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu2)) {
            return false;
        }
        gu2 gu2Var = (gu2) obj;
        return tn.p.f(this.f90121a, gu2Var.f90121a) && this.f90122b == gu2Var.f90122b;
    }

    public final int hashCode() {
        return this.f90122b.hashCode() + (this.f90121a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.f90121a + ", configurationSource=" + this.f90122b + ")";
    }
}
