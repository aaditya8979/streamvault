package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95202c;

    public tg(String str, String str2, String str3) {
        this.f95200a = str;
        this.f95201b = str2;
        this.f95202c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return tn.p.f(this.f95200a, tgVar.f95200a) && tn.p.f(this.f95201b, tgVar.f95201b) && tn.p.f(this.f95202c, tgVar.f95202c);
    }

    public final int hashCode() {
        String str = this.f95200a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95201b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95202c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AppMetricaIdentifiers(adGetUrl=" + this.f95200a + ", deviceId=" + this.f95201b + ", uuid=" + this.f95202c + ")";
    }
}
