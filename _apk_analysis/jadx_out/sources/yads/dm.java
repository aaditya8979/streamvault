package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f88911d;

    public dm(String str, String str2, String str3, String str4) {
        this.f88908a = str;
        this.f88909b = str2;
        this.f88910c = str3;
        this.f88911d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return tn.p.f(this.f88908a, dmVar.f88908a) && tn.p.f(this.f88909b, dmVar.f88909b) && tn.p.f(this.f88910c, dmVar.f88910c) && tn.p.f(this.f88911d, dmVar.f88911d);
    }

    public final int hashCode() {
        String str = this.f88908a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f88909b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f88910c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f88911d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundColors(top=" + this.f88908a + ", right=" + this.f88909b + ", left=" + this.f88910c + ", bottom=" + this.f88911d + ")";
    }
}
