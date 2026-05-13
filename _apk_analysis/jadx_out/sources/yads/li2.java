package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class li2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yz2 f91984b;

    public li2(String str, yz2 yz2Var) {
        this.f91983a = str;
        this.f91984b = yz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li2)) {
            return false;
        }
        li2 li2Var = (li2) obj;
        return tn.p.f(this.f91983a, li2Var.f91983a) && tn.p.f(this.f91984b, li2Var.f91984b);
    }

    public final int hashCode() {
        return this.f91984b.hashCode() + (this.f91983a.hashCode() * 31);
    }

    public final String toString() {
        return "Preview(base64=" + this.f91983a + ", size=" + this.f91984b + ")";
    }
}
