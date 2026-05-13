package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class sr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rr1 f94920b;

    public sr1(String str, rr1 rr1Var) {
        this.f94919a = str;
        this.f94920b = rr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr1)) {
            return false;
        }
        sr1 sr1Var = (sr1) obj;
        return tn.p.f(this.f94919a, sr1Var.f94919a) && this.f94920b == sr1Var.f94920b;
    }

    public final int hashCode() {
        return this.f94920b.hashCode() + (this.f94919a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationNetworkMessage(message=" + this.f94919a + ", type=" + this.f94920b + ")";
    }
}
