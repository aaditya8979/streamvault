package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class qu2 implements ru2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd f94157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jm0 f94158b;

    public qu2(rd rdVar, jm0 jm0Var) {
        this.f94157a = rdVar;
        this.f94158b = jm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu2)) {
            return false;
        }
        qu2 qu2Var = (qu2) obj;
        return tn.p.f(this.f94157a, qu2Var.f94157a) && tn.p.f(this.f94158b, qu2Var.f94158b);
    }

    public final int hashCode() {
        return this.f94158b.hashCode() + (this.f94157a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(advertisingConfiguration=" + this.f94157a + ", environmentConfiguration=" + this.f94158b + ")";
    }
}
