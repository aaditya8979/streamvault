package yads;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class if1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f90802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dr0 f90803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f90805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f90806e;

    public if1(List list, dr0 dr0Var, List list2, String str, long j10) {
        this.f90802a = list;
        this.f90803b = dr0Var;
        this.f90804c = list2;
        this.f90805d = str;
        this.f90806e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if1)) {
            return false;
        }
        if1 if1Var = (if1) obj;
        return tn.p.f(this.f90802a, if1Var.f90802a) && tn.p.f(this.f90803b, if1Var.f90803b) && tn.p.f(this.f90804c, if1Var.f90804c) && tn.p.f(this.f90805d, if1Var.f90805d) && this.f90806e == if1Var.f90806e;
    }

    public final int hashCode() {
        List list = this.f90802a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        dr0 dr0Var = this.f90803b;
        int iA = eb.a(this.f90804c, (iHashCode + (dr0Var == null ? 0 : dr0Var.hashCode())) * 31, 31);
        String str = this.f90805d;
        return Long.hashCode(this.f90806e) + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Link(actions=" + this.f90802a + ", falseClick=" + this.f90803b + ", trackingUrls=" + this.f90804c + ", url=" + this.f90805d + ", clickableDelay=" + this.f90806e + ")";
    }
}
