package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class d80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88774b;

    public d80(String str, String str2) {
        this.f88773a = str;
        this.f88774b = str2;
    }

    public final String a() {
        return this.f88773a;
    }

    public final String b() {
        return this.f88774b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return tn.p.f(this.f88773a, d80Var.f88773a) && tn.p.f(this.f88774b, d80Var.f88774b);
    }

    public final int hashCode() {
        return this.f88774b.hashCode() + (this.f88773a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelMediationAdapterParameterData(name=" + this.f88773a + ", value=" + this.f88774b + ")";
    }
}
