package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class bw2 implements pq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88179b;

    public bw2(int i10, String str) {
        this.f88178a = i10;
        this.f88179b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw2)) {
            return false;
        }
        bw2 bw2Var = (bw2) obj;
        return this.f88178a == bw2Var.f88178a && tn.p.f(this.f88179b, bw2Var.f88179b);
    }

    public final int hashCode() {
        return this.f88179b.hashCode() + (Integer.hashCode(this.f88178a) * 31);
    }

    public final String toString() {
        return "SdkReward(amount=" + this.f88178a + ", type=" + this.f88179b + ")";
    }
}
