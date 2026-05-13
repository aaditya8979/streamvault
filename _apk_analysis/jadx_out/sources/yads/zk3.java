package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class zk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97649b;

    public zk3(int i10, int i11) {
        this.f97648a = i10;
        this.f97649b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk3)) {
            return false;
        }
        zk3 zk3Var = (zk3) obj;
        return this.f97648a == zk3Var.f97648a && this.f97649b == zk3Var.f97649b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f97649b) + (Integer.hashCode(this.f97648a) * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.f97648a + ", height=" + this.f97649b + ")";
    }
}
