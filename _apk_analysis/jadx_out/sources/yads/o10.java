package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class o10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10 f93069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93070b;

    public o10(n10 n10Var, String str) {
        this.f93069a = n10Var;
        this.f93070b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o10)) {
            return false;
        }
        o10 o10Var = (o10) obj;
        return this.f93069a == o10Var.f93069a && tn.p.f(this.f93070b, o10Var.f93070b);
    }

    public final int hashCode() {
        int iHashCode = this.f93069a.hashCode() * 31;
        String str = this.f93070b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CoreNativeCloseButton(type=" + this.f93069a + ", text=" + this.f93070b + ")";
    }
}
