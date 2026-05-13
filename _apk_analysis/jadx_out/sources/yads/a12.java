package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class a12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f87543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v42 f87544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo2 f87545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87546d;

    public a12(g9 g9Var, v42 v42Var, b12 b12Var, int i10) {
        this.f87543a = g9Var;
        this.f87544b = v42Var;
        this.f87545c = b12Var;
        this.f87546d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a12)) {
            return false;
        }
        a12 a12Var = (a12) obj;
        return tn.p.f(this.f87543a, a12Var.f87543a) && this.f87544b == a12Var.f87544b && tn.p.f(this.f87545c, a12Var.f87545c) && this.f87546d == a12Var.f87546d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87546d) + ((this.f87545c.hashCode() + ((this.f87544b.hashCode() + (this.f87543a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdRequestData(adRequestData=" + this.f87543a + ", nativeResponseType=" + this.f87544b + ", requestPolicy=" + this.f87545c + ", adsCount=" + this.f87546d + ")";
    }
}
