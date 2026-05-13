package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class bn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cn0 f88089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88090b;

    public bn0(cn0 cn0Var, String str) {
        this.f88089a = cn0Var;
        this.f88090b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0)) {
            return false;
        }
        bn0 bn0Var = (bn0) obj;
        return this.f88089a == bn0Var.f88089a && tn.p.f(this.f88090b, bn0Var.f88090b);
    }

    public final int hashCode() {
        return this.f88090b.hashCode() + (this.f88089a.hashCode() * 31);
    }

    public final String toString() {
        return "ExclusionRule(type=" + this.f88089a + ", value=" + this.f88090b + ")";
    }
}
