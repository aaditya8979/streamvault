package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class rc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94371d;

    public rc1(int i10, int i11, String str, String str2) {
        this.f94368a = str;
        this.f94369b = str2;
        this.f94370c = i10;
        this.f94371d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc1)) {
            return false;
        }
        rc1 rc1Var = (rc1) obj;
        return tn.p.f(this.f94368a, rc1Var.f94368a) && tn.p.f(this.f94369b, rc1Var.f94369b) && this.f94370c == rc1Var.f94370c && this.f94371d == rc1Var.f94371d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f94371d) + nd3.a(this.f94370c, k4.a(this.f94369b, this.f94368a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "InteractiveCreativeFile(html=" + this.f94368a + ", mimeType=" + this.f94369b + ", height=" + this.f94370c + ", width=" + this.f94371d + ")";
    }
}
