package yads;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class o40 implements p40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka0 f93112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f93113b;

    public o40(ka0 ka0Var, List list) {
        this.f93112a = ka0Var;
        this.f93113b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return tn.p.f(this.f93112a, o40Var.f93112a) && tn.p.f(this.f93113b, o40Var.f93113b);
    }

    public final int hashCode() {
        ka0 ka0Var = this.f93112a;
        return this.f93113b.hashCode() + ((ka0Var == null ? 0 : ka0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Waterfall(currency=" + this.f93112a + ", cpmFloors=" + this.f93113b + ")";
    }
}
