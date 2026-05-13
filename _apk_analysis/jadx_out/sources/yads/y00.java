package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class y00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h10 f96947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a10 f96948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a10 f96949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a10 f96950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o10 f96951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f96952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f96953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f96954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f96955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f96956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Float f96957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f96958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f96959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f96960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f96961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f96962p;

    public y00(h10 h10Var, a10 a10Var, a10 a10Var2, a10 a10Var3, o10 o10Var, String str, String str2, String str3, String str4, String str5, Float f10, String str6, String str7, String str8, String str9, boolean z10) {
        this.f96947a = h10Var;
        this.f96948b = a10Var;
        this.f96949c = a10Var2;
        this.f96950d = a10Var3;
        this.f96951e = o10Var;
        this.f96952f = str;
        this.f96953g = str2;
        this.f96954h = str3;
        this.f96955i = str4;
        this.f96956j = str5;
        this.f96957k = f10;
        this.f96958l = str6;
        this.f96959m = str7;
        this.f96960n = str8;
        this.f96961o = str9;
        this.f96962p = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return tn.p.f(this.f96947a, y00Var.f96947a) && tn.p.f(this.f96948b, y00Var.f96948b) && tn.p.f(this.f96949c, y00Var.f96949c) && tn.p.f(this.f96950d, y00Var.f96950d) && tn.p.f(this.f96951e, y00Var.f96951e) && tn.p.f(this.f96952f, y00Var.f96952f) && tn.p.f(this.f96953g, y00Var.f96953g) && tn.p.f(this.f96954h, y00Var.f96954h) && tn.p.f(this.f96955i, y00Var.f96955i) && tn.p.f(this.f96956j, y00Var.f96956j) && tn.p.f(this.f96957k, y00Var.f96957k) && tn.p.f(this.f96958l, y00Var.f96958l) && tn.p.f(this.f96959m, y00Var.f96959m) && tn.p.f(this.f96960n, y00Var.f96960n) && tn.p.f(this.f96961o, y00Var.f96961o) && this.f96962p == y00Var.f96962p;
    }

    public final int hashCode() {
        h10 h10Var = this.f96947a;
        int iHashCode = (h10Var == null ? 0 : Float.hashCode(h10Var.f90193a)) * 31;
        a10 a10Var = this.f96948b;
        int iHashCode2 = (iHashCode + (a10Var == null ? 0 : a10Var.hashCode())) * 31;
        a10 a10Var2 = this.f96949c;
        int iHashCode3 = (iHashCode2 + (a10Var2 == null ? 0 : a10Var2.hashCode())) * 31;
        a10 a10Var3 = this.f96950d;
        int iHashCode4 = (iHashCode3 + (a10Var3 == null ? 0 : a10Var3.hashCode())) * 31;
        o10 o10Var = this.f96951e;
        int iHashCode5 = (iHashCode4 + (o10Var == null ? 0 : o10Var.hashCode())) * 31;
        String str = this.f96952f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f96953g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f96954h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f96955i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f96956j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f10 = this.f96957k;
        int iHashCode11 = (iHashCode10 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str6 = this.f96958l;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f96959m;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f96960n;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f96961o;
        return Boolean.hashCode(this.f96962p) + ((iHashCode14 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreNativeAdAssets(media=" + this.f96947a + ", favicon=" + this.f96948b + ", icon=" + this.f96949c + ", image=" + this.f96950d + ", closeButton=" + this.f96951e + ", age=" + this.f96952f + ", body=" + this.f96953g + ", callToAction=" + this.f96954h + ", domain=" + this.f96955i + ", price=" + this.f96956j + ", rating=" + this.f96957k + ", reviewCount=" + this.f96958l + ", sponsored=" + this.f96959m + ", title=" + this.f96960n + ", warning=" + this.f96961o + ", feedbackAvailable=" + this.f96962p + ")";
    }
}
