package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class l90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91910a;

    public l90(String str) {
        this.f91910a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj;
        l90Var.getClass();
        return tn.p.f("Warning", "Warning") && tn.p.f(this.f91910a, l90Var.f91910a);
    }

    public final int hashCode() {
        return this.f91910a.hashCode() + 562735108;
    }

    public final String toString() {
        return "Warning(title=Warning, message=" + this.f91910a + ")";
    }
}
