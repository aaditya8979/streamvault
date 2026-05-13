package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class oq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93308b;

    public oq1(String str, String str2) {
        this.f93307a = str;
        this.f93308b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq1)) {
            return false;
        }
        oq1 oq1Var = (oq1) obj;
        return tn.p.f(this.f93307a, oq1Var.f93307a) && tn.p.f(this.f93308b, oq1Var.f93308b);
    }

    public final int hashCode() {
        return this.f93308b.hashCode() + (this.f93307a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationAdapterSignature(format=" + this.f93307a + ", className=" + this.f93308b + ")";
    }
}
