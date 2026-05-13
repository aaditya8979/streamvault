package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class b40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87901c;

    public b40(String str, String str2, String str3) {
        this.f87899a = str;
        this.f87900b = str2;
        this.f87901c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b40)) {
            return false;
        }
        b40 b40Var = (b40) obj;
        return tn.p.f(this.f87899a, b40Var.f87899a) && tn.p.f(this.f87900b, b40Var.f87900b) && tn.p.f(this.f87901c, b40Var.f87901c);
    }

    public final int hashCode() {
        String str = this.f87899a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f87900b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f87901c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdNetworkSettingsData(pageId=" + this.f87899a + ", appReviewStatus=" + this.f87900b + ", appAdsTxt=" + this.f87901c + ")";
    }
}
