package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class fx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89721b;

    public fx2(long j10, long j11) {
        this.f89720a = j10;
        this.f89721b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fx2.class != obj.getClass()) {
            return false;
        }
        fx2 fx2Var = (fx2) obj;
        return this.f89720a == fx2Var.f89720a && this.f89721b == fx2Var.f89721b;
    }

    public final int hashCode() {
        return (((int) this.f89720a) * 31) + ((int) this.f89721b);
    }
}
