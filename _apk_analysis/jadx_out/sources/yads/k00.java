package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class k00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91438b;

    public k00(String str, String str2) {
        this.f91437a = str;
        this.f91438b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return tn.p.f(this.f91437a, k00Var.f91437a) && tn.p.f(this.f91438b, k00Var.f91438b);
    }

    public final int hashCode() {
        String str = this.f91437a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f91438b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CoreCreative(creativeId=" + this.f91437a + ", campaignId=" + this.f91438b + ")";
    }
}
