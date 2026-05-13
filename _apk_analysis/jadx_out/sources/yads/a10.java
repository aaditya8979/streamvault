package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class a10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn.a f87539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87542d;

    public a10(f02 f02Var, String str, int i10, int i11) {
        this.f87539a = f02Var;
        this.f87540b = str;
        this.f87541c = i10;
        this.f87542d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return tn.p.f(this.f87539a, a10Var.f87539a) && tn.p.f(this.f87540b, a10Var.f87540b) && this.f87541c == a10Var.f87541c && this.f87542d == a10Var.f87542d;
    }

    public final int hashCode() {
        int iHashCode = this.f87539a.hashCode() * 31;
        String str = this.f87540b;
        return Integer.hashCode(this.f87542d) + nd3.a(this.f87541c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "CoreNativeAdImage(getBitmap=" + this.f87539a + ", sizeType=" + this.f87540b + ", width=" + this.f87541c + ", height=" + this.f87542d + ")";
    }
}
