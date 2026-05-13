package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class py2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qy2 f93833d;

    public py2(int i10, long j10, qy2 qy2Var, String str) {
        this.f93830a = j10;
        this.f93831b = str;
        this.f93832c = i10;
        this.f93833d = qy2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py2)) {
            return false;
        }
        py2 py2Var = (py2) obj;
        return this.f93830a == py2Var.f93830a && tn.p.f(this.f93831b, py2Var.f93831b) && this.f93832c == py2Var.f93832c && this.f93833d == py2Var.f93833d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f93830a) * 31;
        String str = this.f93831b;
        return this.f93833d.hashCode() + nd3.a(this.f93832c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowNotice(delay=" + this.f93830a + ", url=" + this.f93831b + ", visibilityPercent=" + this.f93832c + ", type=" + this.f93833d + ")";
    }
}
