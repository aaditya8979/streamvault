package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3745t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3696r1 f28155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f28157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f28159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28160f;

    public C3745t0(C3696r1 c3696r1, String str, Boolean bool, String str2, byte b10, String str3) {
        tn.p.k(c3696r1, "adUnitTelemetry");
        this.f28155a = c3696r1;
        this.f28156b = str;
        this.f28157c = bool;
        this.f28158d = str2;
        this.f28159e = b10;
        this.f28160f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3745t0)) {
            return false;
        }
        C3745t0 c3745t0 = (C3745t0) obj;
        return tn.p.f(this.f28155a, c3745t0.f28155a) && tn.p.f(this.f28156b, c3745t0.f28156b) && tn.p.f(this.f28157c, c3745t0.f28157c) && tn.p.f(this.f28158d, c3745t0.f28158d) && this.f28159e == c3745t0.f28159e && tn.p.f(this.f28160f, c3745t0.f28160f);
    }

    public final int hashCode() {
        int iHashCode = this.f28155a.hashCode() * 31;
        String str = this.f28156b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f28157c;
        int iHashCode3 = (Byte.hashCode(this.f28159e) + ((this.f28158d.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f28160f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C3696r1 c3696r1 = this.f28155a;
        String str = this.f28156b;
        Boolean bool = this.f28157c;
        String str2 = this.f28158d;
        byte b10 = this.f28159e;
        return "AdNotReadyMetadata(adUnitTelemetry=" + c3696r1 + ", creativeType=" + str + ", isRewarded=" + bool + ", markupType=" + str2 + ", adState=" + ((int) b10) + ", impressionId=" + this.f28160f + ")";
    }
}
