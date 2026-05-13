package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class kl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jl1 f91640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f91641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f91642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f91643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f91645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f91646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f91647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f91648k;

    public kl1(String str, String str2, jl1 jl1Var, String str3, String str4, Float f10, int i10, int i11, int i12, String str5) {
        this.f91638a = str;
        this.f91639b = str2;
        this.f91640c = jl1Var;
        this.f91641d = str3;
        this.f91642e = str4;
        this.f91643f = f10;
        this.f91644g = i10;
        this.f91645h = i11;
        this.f91646i = i12;
        this.f91647j = str5;
        this.f91648k = tn.p.f(str5, "VPAID");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl1)) {
            return false;
        }
        kl1 kl1Var = (kl1) obj;
        return tn.p.f(this.f91638a, kl1Var.f91638a) && tn.p.f(this.f91639b, kl1Var.f91639b) && this.f91640c == kl1Var.f91640c && tn.p.f(this.f91641d, kl1Var.f91641d) && tn.p.f(this.f91642e, kl1Var.f91642e) && tn.p.f(this.f91643f, kl1Var.f91643f) && this.f91644g == kl1Var.f91644g && this.f91645h == kl1Var.f91645h && this.f91646i == kl1Var.f91646i && tn.p.f(this.f91647j, kl1Var.f91647j);
    }

    public final int hashCode() {
        int iHashCode = this.f91638a.hashCode() * 31;
        String str = this.f91639b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        jl1 jl1Var = this.f91640c;
        int iHashCode3 = (iHashCode2 + (jl1Var == null ? 0 : jl1Var.hashCode())) * 31;
        String str2 = this.f91641d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f91642e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.f91643f;
        int iA = nd3.a(this.f91646i, nd3.a(this.f91645h, nd3.a(this.f91644g, (iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31, 31), 31), 31);
        String str4 = this.f91647j;
        return iA + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "MediaFile(uri=" + this.f91638a + ", id=" + this.f91639b + ", deliveryMethod=" + this.f91640c + ", mimeType=" + this.f91641d + ", codec=" + this.f91642e + ", vmafMetric=" + this.f91643f + ", height=" + this.f91644g + ", width=" + this.f91645h + ", bitrate=" + this.f91646i + ", apiFramework=" + this.f91647j + ")";
    }
}
