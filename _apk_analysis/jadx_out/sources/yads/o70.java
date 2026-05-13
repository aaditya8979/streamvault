package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class o70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y90 f93136b;

    public o70(y90 y90Var) {
        super(y90Var.c(), 0);
        this.f93136b = y90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o70) && tn.p.f(this.f93136b, ((o70) obj).f93136b);
    }

    public final int hashCode() {
        return this.f93136b.hashCode();
    }

    public final String toString() {
        return "AdUnitMediationAdapter(adapter=" + this.f93136b + ")";
    }
}
