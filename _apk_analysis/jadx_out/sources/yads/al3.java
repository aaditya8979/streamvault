package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class al3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87742b;

    public al3(int i10, int i11) {
        this.f87741a = i10;
        this.f87742b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al3)) {
            return false;
        }
        al3 al3Var = (al3) obj;
        return this.f87741a == al3Var.f87741a && this.f87742b == al3Var.f87742b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87742b) + (Integer.hashCode(this.f87741a) * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.f87741a + ", height=" + this.f87742b + ")";
    }
}
