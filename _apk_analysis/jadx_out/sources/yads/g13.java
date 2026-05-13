package yads;

/* JADX INFO: loaded from: classes.dex */
public final class g13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f89771e;

    public g13(int i10, int i11, int i12, int i13) {
        this.f89767a = i10;
        this.f89768b = i11;
        this.f89769c = i12;
        this.f89770d = i13;
        this.f89771e = i12 * i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g13)) {
            return false;
        }
        g13 g13Var = (g13) obj;
        return this.f89767a == g13Var.f89767a && this.f89768b == g13Var.f89768b && this.f89769c == g13Var.f89769c && this.f89770d == g13Var.f89770d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89770d) + nd3.a(this.f89769c, nd3.a(this.f89768b, Integer.hashCode(this.f89767a) * 31, 31), 31);
    }

    public final String toString() {
        return "SmartCenter(x=" + this.f89767a + ", y=" + this.f89768b + ", width=" + this.f89769c + ", height=" + this.f89770d + ")";
    }
}
