package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class qb3 implements tb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pb3 f93979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93981c;

    public qb3(pb3 pb3Var, String str, String str2) {
        this.f93979a = pb3Var;
        this.f93980b = str;
        this.f93981c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb3)) {
            return false;
        }
        qb3 qb3Var = (qb3) obj;
        return this.f93979a == qb3Var.f93979a && tn.p.f(this.f93980b, qb3Var.f93980b) && tn.p.f(this.f93981c, qb3Var.f93981c);
    }

    public final int hashCode() {
        int iHashCode = this.f93979a.hashCode() * 31;
        String str = this.f93980b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f93981c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Failure(status=" + this.f93979a + ", assetName=" + this.f93980b + ", description=" + this.f93981c + ")";
    }
}
