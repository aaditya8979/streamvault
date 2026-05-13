package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class r90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94329c;

    public r90(String str, String str2, String str3) {
        super(0);
        this.f94327a = str;
        this.f94328b = str2;
        this.f94329c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        return tn.p.f(this.f94327a, r90Var.f94327a) && tn.p.f(this.f94328b, r90Var.f94328b) && tn.p.f(this.f94329c, r90Var.f94329c);
    }

    public final int hashCode() {
        return this.f94329c.hashCode() + k4.a(this.f94328b, this.f94327a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdUnit(name=" + this.f94327a + ", format=" + this.f94328b + ", id=" + this.f94329c + ")";
    }
}
