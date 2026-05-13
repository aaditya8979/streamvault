package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class d90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y90 f88781a;

    public d90(y90 y90Var) {
        this.f88781a = y90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d90) && tn.p.f(this.f88781a, ((d90) obj).f88781a);
    }

    public final int hashCode() {
        return this.f88781a.hashCode();
    }

    public final String toString() {
        return "OnMediationNetworkClick(uiUnit=" + this.f88781a + ")";
    }
}
