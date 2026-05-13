package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class i40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90662c;

    public i40(String str, String str2, String str3) {
        this.f90660a = str;
        this.f90661b = str2;
        this.f90662c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i40)) {
            return false;
        }
        i40 i40Var = (i40) obj;
        return tn.p.f(this.f90660a, i40Var.f90660a) && tn.p.f(this.f90661b, i40Var.f90661b) && tn.p.f(this.f90662c, i40Var.f90662c);
    }

    public final int hashCode() {
        return this.f90662c.hashCode() + k4.a(this.f90661b, this.f90660a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitData(name=" + this.f90660a + ", format=" + this.f90661b + ", adUnitId=" + this.f90662c + ")";
    }
}
