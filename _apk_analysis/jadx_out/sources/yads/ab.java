package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f87634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87636c;

    public ab(String str, String str2, boolean z10) {
        this.f87634a = z10;
        this.f87635b = str;
        this.f87636c = str2;
    }

    public final String a() {
        return this.f87636c;
    }

    public final String b() {
        return this.f87635b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return this.f87634a == abVar.f87634a && tn.p.f(this.f87635b, abVar.f87635b) && tn.p.f(this.f87636c, abVar.f87636c);
    }

    public final int hashCode() {
        return this.f87636c.hashCode() + k4.a(this.f87635b, Boolean.hashCode(this.f87634a) * 31, 31);
    }

    public final String toString() {
        return "AdTuneInfo(shouldShow=" + this.f87634a + ", token=" + this.f87635b + ", advertiserInfo=" + this.f87636c + ")";
    }
}
