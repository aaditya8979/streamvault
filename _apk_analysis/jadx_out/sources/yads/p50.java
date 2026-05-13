package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@so.k
public final class p50 {

    @NotNull
    public static final o50 Companion = new o50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93438b;

    public /* synthetic */ p50(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            wo.c2.a(i10, 3, n50.f92741a.getDescriptor());
        }
        this.f93437a = str;
        this.f93438b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        return tn.p.f(this.f93437a, p50Var.f93437a) && tn.p.f(this.f93438b, p50Var.f93438b);
    }

    public final int hashCode() {
        return this.f93438b.hashCode() + (this.f93437a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelBiddingParameter(name=" + this.f93437a + ", value=" + this.f93438b + ")";
    }
}
