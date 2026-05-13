package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class ck2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88485b;

    public ck2(boolean z10, int i10) {
        this.f88484a = i10;
        this.f88485b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ck2.class != obj.getClass()) {
            return false;
        }
        ck2 ck2Var = (ck2) obj;
        return this.f88484a == ck2Var.f88484a && this.f88485b == ck2Var.f88485b;
    }

    public final int hashCode() {
        return (this.f88484a * 31) + (this.f88485b ? 1 : 0);
    }
}
