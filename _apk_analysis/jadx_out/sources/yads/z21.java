package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class z21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg f97362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e31 f97364c;

    public z21(tg tgVar, String str, e31 e31Var) {
        this.f97362a = tgVar;
        this.f97363b = str;
        this.f97364c = e31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z21)) {
            return false;
        }
        z21 z21Var = (z21) obj;
        return tn.p.f(this.f97362a, z21Var.f97362a) && tn.p.f(this.f97363b, z21Var.f97363b) && this.f97364c == z21Var.f97364c;
    }

    public final int hashCode() {
        return this.f97364c.hashCode() + k4.a(this.f97363b, this.f97362a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Identifiers(appMetricaIdentifiers=" + this.f97362a + ", mauid=" + this.f97363b + ", identifiersType=" + this.f97364c + ")";
    }
}
