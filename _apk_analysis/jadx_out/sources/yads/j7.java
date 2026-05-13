package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7 f91108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7 f91109c;

    public j7(long j10, k7 k7Var, l7 l7Var) {
        this.f91107a = j10;
        this.f91108b = k7Var;
        this.f91109c = l7Var;
    }

    public final long a() {
        return this.f91107a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return this.f91107a == j7Var.f91107a && tn.p.f(this.f91108b, j7Var.f91108b) && this.f91109c == j7Var.f91109c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f91107a) * 31;
        k7 k7Var = this.f91108b;
        int iHashCode2 = (iHashCode + (k7Var == null ? 0 : k7Var.hashCode())) * 31;
        l7 l7Var = this.f91109c;
        return iHashCode2 + (l7Var != null ? l7Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdPodItem(duration=" + this.f91107a + ", skip=" + this.f91108b + ", transitionPolicy=" + this.f91109c + ")";
    }
}
