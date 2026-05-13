package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class i50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h50 f90678c;

    public i50(String str, String str2, h50 h50Var) {
        this.f90676a = str;
        this.f90677b = str2;
        this.f90678c = h50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return tn.p.f(this.f90676a, i50Var.f90676a) && tn.p.f(this.f90677b, i50Var.f90677b) && this.f90678c == i50Var.f90678c;
    }

    public final int hashCode() {
        String str = this.f90676a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f90677b;
        return this.f90678c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAlertData(title=" + this.f90676a + ", message=" + this.f90677b + ", type=" + this.f90678c + ")";
    }
}
