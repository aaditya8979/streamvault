package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rf f26595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26598d;

    public Xf(Rf rf2, int i10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        tn.p.k(rf2, "ping");
        this.f26595a = rf2;
        this.f26596b = i10;
        this.f26597c = str;
        this.f26598d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xf)) {
            return false;
        }
        Xf xf2 = (Xf) obj;
        return tn.p.f(this.f26595a, xf2.f26595a) && this.f26596b == xf2.f26596b && tn.p.f(this.f26597c, xf2.f26597c) && this.f26598d == xf2.f26598d;
    }

    public final int hashCode() {
        int iA = AbstractC3414fi.a(this.f26596b, this.f26595a.hashCode() * 31, 31);
        String str = this.f26597c;
        return Long.hashCode(this.f26598d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PingResult(ping=" + this.f26595a + ", statusCode=" + this.f26596b + ", error=" + this.f26597c + ", timestamp=" + this.f26598d + ")";
    }
}
