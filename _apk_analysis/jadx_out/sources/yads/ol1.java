package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class ol1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kl1 f93278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl1 f93279b;

    public ol1(kl1 kl1Var, kl1 kl1Var2) {
        this.f93278a = kl1Var;
        this.f93279b = kl1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol1)) {
            return false;
        }
        ol1 ol1Var = (ol1) obj;
        return tn.p.f(this.f93278a, ol1Var.f93278a) && tn.p.f(this.f93279b, ol1Var.f93279b);
    }

    public final int hashCode() {
        int iHashCode = this.f93278a.hashCode() * 31;
        kl1 kl1Var = this.f93279b;
        return iHashCode + (kl1Var == null ? 0 : kl1Var.hashCode());
    }

    public final String toString() {
        return "MediaFileWithFallback(target=" + this.f93278a + ", fallback=" + this.f93279b + ")";
    }
}
