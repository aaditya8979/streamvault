package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@so.k
public final class ih2 {

    @NotNull
    public static final hh2 Companion = new hh2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh2 f90839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gi2 f90840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ai2 f90841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f90842e;

    public /* synthetic */ ih2(int i10, String str, qh2 qh2Var, gi2 gi2Var, ai2 ai2Var, String str2) {
        if (31 != (i10 & 31)) {
            wo.c2.a(i10, 31, gh2.f89985a.getDescriptor());
        }
        this.f90838a = str;
        this.f90839b = qh2Var;
        this.f90840c = gi2Var;
        this.f90841d = ai2Var;
        this.f90842e = str2;
    }

    public ih2(String str, qh2 qh2Var, gi2 gi2Var, ai2 ai2Var, String str2) {
        this.f90838a = str;
        this.f90839b = qh2Var;
        this.f90840c = gi2Var;
        this.f90841d = ai2Var;
        this.f90842e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih2)) {
            return false;
        }
        ih2 ih2Var = (ih2) obj;
        return tn.p.f(this.f90838a, ih2Var.f90838a) && tn.p.f(this.f90839b, ih2Var.f90839b) && tn.p.f(this.f90840c, ih2Var.f90840c) && tn.p.f(this.f90841d, ih2Var.f90841d) && tn.p.f(this.f90842e, ih2Var.f90842e);
    }

    public final int hashCode() {
        int iHashCode = this.f90838a.hashCode() * 31;
        qh2 qh2Var = this.f90839b;
        int iHashCode2 = (iHashCode + (qh2Var == null ? 0 : qh2Var.hashCode())) * 31;
        gi2 gi2Var = this.f90840c;
        int iHashCode3 = (this.f90841d.hashCode() + ((iHashCode2 + (gi2Var == null ? 0 : gi2Var.hashCode())) * 31)) * 31;
        String str = this.f90842e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PrefetchedMediationInfo(adapter=" + this.f90838a + ", networkWinner=" + this.f90839b + ", revenue=" + this.f90840c + ", result=" + this.f90841d + ", networkAdInfo=" + this.f90842e + ")";
    }
}
