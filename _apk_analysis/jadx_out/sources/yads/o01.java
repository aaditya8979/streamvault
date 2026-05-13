package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class o01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg2 f93061b;

    public o01(boolean z10, sg2 sg2Var) {
        this.f93060a = z10;
        this.f93061b = sg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o01)) {
            return false;
        }
        o01 o01Var = (o01) obj;
        return this.f93060a == o01Var.f93060a && tn.p.f(this.f93061b, o01Var.f93061b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f93060a) * 31;
        sg2 sg2Var = this.f93061b;
        return iHashCode + (sg2Var == null ? 0 : sg2Var.hashCode());
    }

    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.f93060a + ", handledPackage=" + this.f93061b + ")";
    }
}
