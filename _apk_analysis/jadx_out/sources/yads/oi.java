package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f93231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final if1 f93232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f93233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f93234f;

    public oi(String str, String str2, Object obj, if1 if1Var, boolean z10, boolean z11) {
        this.f93229a = str;
        this.f93230b = str2;
        this.f93231c = obj;
        this.f93232d = if1Var;
        this.f93233e = z10;
        this.f93234f = z11;
    }

    public final if1 a() {
        return this.f93232d;
    }

    public final String b() {
        return this.f93229a;
    }

    public final Object c() {
        return this.f93231c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return tn.p.f(this.f93229a, oiVar.f93229a) && tn.p.f(this.f93230b, oiVar.f93230b) && tn.p.f(this.f93231c, oiVar.f93231c) && tn.p.f(this.f93232d, oiVar.f93232d) && this.f93233e == oiVar.f93233e && this.f93234f == oiVar.f93234f;
    }

    public final int hashCode() {
        int iA = k4.a(this.f93230b, this.f93229a.hashCode() * 31, 31);
        Object obj = this.f93231c;
        int iHashCode = (iA + (obj == null ? 0 : obj.hashCode())) * 31;
        if1 if1Var = this.f93232d;
        return Boolean.hashCode(this.f93234f) + ((Boolean.hashCode(this.f93233e) + ((iHashCode + (if1Var != null ? if1Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Asset(name=" + this.f93229a + ", type=" + this.f93230b + ", value=" + this.f93231c + ", link=" + this.f93232d + ", isClickable=" + this.f93233e + ", isRequired=" + this.f93234f + ")";
    }
}
