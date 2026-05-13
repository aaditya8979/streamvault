package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91256c;

    public jk(String str, String str2, String str3) {
        this.f91254a = str;
        this.f91255b = str2;
        this.f91256c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj;
        return tn.p.f(this.f91254a, jkVar.f91254a) && tn.p.f(this.f91255b, jkVar.f91255b) && tn.p.f(this.f91256c, jkVar.f91256c);
    }

    public final int hashCode() {
        return this.f91256c.hashCode() + k4.a(this.f91255b, this.f91254a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Attributes(campaignId=" + this.f91254a + ", bannerId=" + this.f91255b + ", placeId=" + this.f91256c + ")";
    }
}
