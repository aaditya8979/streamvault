package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class u41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13 f95551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f95552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f95553g;

    public u41(int i10, int i11, String str, String str2, o13 o13Var, boolean z10, String str3) {
        this.f95547a = i10;
        this.f95548b = i11;
        this.f95549c = str;
        this.f95550d = str2;
        this.f95551e = o13Var;
        this.f95552f = z10;
        this.f95553g = str3;
    }

    public final int a() {
        return this.f95548b;
    }

    public final int b() {
        return this.f95547a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u41)) {
            return false;
        }
        u41 u41Var = (u41) obj;
        return this.f95547a == u41Var.f95547a && this.f95548b == u41Var.f95548b && tn.p.f(this.f95549c, u41Var.f95549c) && tn.p.f(this.f95550d, u41Var.f95550d) && tn.p.f(this.f95551e, u41Var.f95551e) && this.f95552f == u41Var.f95552f && tn.p.f(this.f95553g, u41Var.f95553g);
    }

    public final int hashCode() {
        int iA = k4.a(this.f95549c, nd3.a(this.f95548b, Integer.hashCode(this.f95547a) * 31, 31), 31);
        String str = this.f95550d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        o13 o13Var = this.f95551e;
        int iHashCode2 = (Boolean.hashCode(this.f95552f) + ((iHashCode + (o13Var == null ? 0 : o13Var.hashCode())) * 31)) * 31;
        String str2 = this.f95553g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ImageValue(width=" + this.f95547a + ", height=" + this.f95548b + ", url=" + this.f95549c + ", sizeType=" + this.f95550d + ", smartCenterSettings=" + this.f95551e + ", preload=" + this.f95552f + ", preview=" + this.f95553g + ")";
    }
}
