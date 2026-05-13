package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class a73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt2 f87613b;

    public a73(String str, kt2 kt2Var) {
        this.f87612a = str;
        this.f87613b = kt2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a73)) {
            return false;
        }
        a73 a73Var = (a73) obj;
        return tn.p.f(this.f87612a, a73Var.f87612a) && this.f87613b == a73Var.f87613b;
    }

    public final int hashCode() {
        String str = this.f87612a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        kt2 kt2Var = this.f87613b;
        return iHashCode + (kt2Var != null ? kt2Var.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult(bidderToken=" + this.f87612a + ", stubReason=" + this.f87613b + ")";
    }
}
