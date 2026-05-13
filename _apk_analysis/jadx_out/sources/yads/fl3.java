package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class fl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89618b;

    public fl3(int i10, String str) {
        this.f89617a = str;
        this.f89618b = i10;
    }

    public final String a() {
        return this.f89617a;
    }

    public final int b() {
        return this.f89618b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl3)) {
            return false;
        }
        fl3 fl3Var = (fl3) obj;
        return tn.p.f(this.f89617a, fl3Var.f89617a) && this.f89618b == fl3Var.f89618b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89618b) + (this.f89617a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewSizeKey(adUnitId=" + this.f89617a + ", screenOrientation=" + this.f89618b + ")";
    }
}
