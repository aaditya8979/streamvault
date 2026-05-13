package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class j40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r40 f91092d;

    public j40(String str, String str2, String str3, r40 r40Var) {
        this.f91089a = str;
        this.f91090b = str2;
        this.f91091c = str3;
        this.f91092d = r40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j40)) {
            return false;
        }
        j40 j40Var = (j40) obj;
        return tn.p.f(this.f91089a, j40Var.f91089a) && tn.p.f(this.f91090b, j40Var.f91090b) && tn.p.f(this.f91091c, j40Var.f91091c) && tn.p.f(this.f91092d, j40Var.f91092d);
    }

    public final int hashCode() {
        return this.f91092d.f94280a.hashCode() + k4.a(this.f91091c, k4.a(this.f91090b, this.f91089a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitFullData(name=" + this.f91089a + ", format=" + this.f91090b + ", adUnitId=" + this.f91091c + ", mediation=" + this.f91092d + ")";
    }
}
