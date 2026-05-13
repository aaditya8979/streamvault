package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class hu2 implements iu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt2 f90564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xy f90565b;

    public hu2(nt2 nt2Var, xy xyVar) {
        this.f90564a = nt2Var;
        this.f90565b = xyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu2)) {
            return false;
        }
        hu2 hu2Var = (hu2) obj;
        return tn.p.f(this.f90564a, hu2Var.f90564a) && this.f90565b == hu2Var.f90565b;
    }

    public final int hashCode() {
        return this.f90565b.hashCode() + (this.f90564a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(sdkConfiguration=" + this.f90564a + ", configurationSource=" + this.f90565b + ")";
    }
}
