package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class wf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96366c;

    public wf0(String str, String str2, String str3) {
        this.f96364a = str;
        this.f96365b = str2;
        this.f96366c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wf0.class != obj.getClass()) {
            return false;
        }
        wf0 wf0Var = (wf0) obj;
        return ib3.a(this.f96364a, wf0Var.f96364a) && ib3.a(this.f96365b, wf0Var.f96365b) && ib3.a(this.f96366c, wf0Var.f96366c);
    }

    public final int hashCode() {
        int iHashCode = this.f96364a.hashCode() * 31;
        String str = this.f96365b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f96366c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
