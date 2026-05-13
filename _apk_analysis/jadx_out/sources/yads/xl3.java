package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class xl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96810b;

    public xl3(int i10, String str) {
        this.f96809a = i10;
        this.f96810b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl3)) {
            return false;
        }
        xl3 xl3Var = (xl3) obj;
        return this.f96809a == xl3Var.f96809a && tn.p.f(this.f96810b, xl3Var.f96810b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f96809a) * 31;
        String str = this.f96810b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VisibleAreaResult(area=" + this.f96809a + ", description=" + this.f96810b + ")";
    }
}
