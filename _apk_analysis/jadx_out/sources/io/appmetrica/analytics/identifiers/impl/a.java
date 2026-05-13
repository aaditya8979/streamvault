package io.appmetrica.analytics.identifiers.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f64842c;

    public a(String str, String str2, Boolean bool) {
        this.f64840a = str;
        this.f64841b = str2;
        this.f64842c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return tn.p.f(this.f64840a, aVar.f64840a) && tn.p.f(this.f64841b, aVar.f64841b) && tn.p.f(this.f64842c, aVar.f64842c);
    }

    public final int hashCode() {
        int iHashCode = this.f64840a.hashCode() * 31;
        String str = this.f64841b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f64842c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f64840a + ", advId=" + this.f64841b + ", limitedAdTracking=" + this.f64842c + ')';
    }
}
