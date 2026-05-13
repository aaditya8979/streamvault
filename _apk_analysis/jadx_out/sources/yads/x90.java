package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class x90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x80 f96678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q50 f96679c;

    public x90(String str, String str2) {
        this(str, new x80(str2, 0, null, 0, 14));
    }

    public /* synthetic */ x90(String str, x80 x80Var) {
        this(str, x80Var, null);
    }

    public x90(String str, x80 x80Var, q50 q50Var) {
        super(0);
        this.f96677a = str;
        this.f96678b = x80Var;
        this.f96679c = q50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return tn.p.f(this.f96677a, x90Var.f96677a) && tn.p.f(this.f96678b, x90Var.f96678b) && tn.p.f(this.f96679c, x90Var.f96679c);
    }

    public final int hashCode() {
        String str = this.f96677a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        x80 x80Var = this.f96678b;
        int iHashCode2 = (iHashCode + (x80Var == null ? 0 : x80Var.hashCode())) * 31;
        q50 q50Var = this.f96679c;
        return iHashCode2 + (q50Var != null ? q50Var.hashCode() : 0);
    }

    public final String toString() {
        return "KeyValue(title=" + this.f96677a + ", subtitle=" + this.f96678b + ", text=" + this.f96679c + ")";
    }
}
