package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@so.k
public final class qh2 {

    @NotNull
    public static final ph2 Companion = new ph2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94034b;

    public /* synthetic */ qh2(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            wo.c2.a(i10, 3, oh2.f93227a.getDescriptor());
        }
        this.f94033a = str;
        this.f94034b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh2)) {
            return false;
        }
        qh2 qh2Var = (qh2) obj;
        return tn.p.f(this.f94033a, qh2Var.f94033a) && tn.p.f(this.f94034b, qh2Var.f94034b);
    }

    public final int hashCode() {
        return this.f94034b.hashCode() + (this.f94033a.hashCode() * 31);
    }

    public final String toString() {
        return "PrefetchedMediationNetworkWinner(networkName=" + this.f94033a + ", networkAdUnit=" + this.f94034b + ")";
    }
}
