package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@so.k
public final class hu1 {

    @NotNull
    public static final gu1 Companion = new gu1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mu1 f90562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu1 f90563b;

    public /* synthetic */ hu1(int i10, mu1 mu1Var, pu1 pu1Var) {
        if (3 != (i10 & 3)) {
            wo.c2.a(i10, 3, fu1.f89677a.getDescriptor());
        }
        this.f90562a = mu1Var;
        this.f90563b = pu1Var;
    }

    public hu1(mu1 mu1Var, pu1 pu1Var) {
        this.f90562a = mu1Var;
        this.f90563b = pu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu1)) {
            return false;
        }
        hu1 hu1Var = (hu1) obj;
        return tn.p.f(this.f90562a, hu1Var.f90562a) && tn.p.f(this.f90563b, hu1Var.f90563b);
    }

    public final int hashCode() {
        int iHashCode = this.f90562a.hashCode() * 31;
        pu1 pu1Var = this.f90563b;
        return iHashCode + (pu1Var == null ? 0 : pu1Var.hashCode());
    }

    public final String toString() {
        return "MobileAdsNetworkLog(request=" + this.f90562a + ", response=" + this.f90563b + ")";
    }
}
