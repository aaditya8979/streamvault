package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al3 f88066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af1 f88067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jj1 f88068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f88069d;

    public bl3(al3 al3Var, af1 af1Var, jj1 jj1Var, Map map) {
        this.f88066a = al3Var;
        this.f88067b = af1Var;
        this.f88068c = jj1Var;
        this.f88069d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl3)) {
            return false;
        }
        bl3 bl3Var = (bl3) obj;
        return tn.p.f(this.f88066a, bl3Var.f88066a) && tn.p.f(this.f88067b, bl3Var.f88067b) && tn.p.f(this.f88068c, bl3Var.f88068c) && tn.p.f(this.f88069d, bl3Var.f88069d);
    }

    public final int hashCode() {
        return this.f88069d.hashCode() + ((this.f88068c.hashCode() + ((this.f88067b.hashCode() + (this.f88066a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewSizeInfo(view=" + this.f88066a + ", layoutParams=" + this.f88067b + ", measured=" + this.f88068c + ", additionalInfo=" + this.f88069d + ")";
    }
}
