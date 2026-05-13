package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class pu2 implements ru2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f93786a;

    public pu2(l4 l4Var) {
        this.f93786a = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu2) && tn.p.f(this.f93786a, ((pu2) obj).f93786a);
    }

    public final int hashCode() {
        return this.f93786a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f93786a + ")";
    }
}
