package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3385ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27108b;

    public C3385ef(String str, String str2) {
        tn.p.k(str, "hyperId");
        tn.p.k("i6i", "sspId");
        tn.p.k(str2, "spHost");
        tn.p.k("inmobi", "pubId");
        this.f27107a = str;
        this.f27108b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3385ef)) {
            return false;
        }
        C3385ef c3385ef = (C3385ef) obj;
        return tn.p.f(this.f27107a, c3385ef.f27107a) && tn.p.f("i6i", "i6i") && tn.p.f(this.f27108b, c3385ef.f27108b) && tn.p.f("inmobi", "inmobi");
    }

    public final int hashCode() {
        return ((this.f27108b.hashCode() + (((this.f27107a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098;
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f27107a + ", sspId=i6i, spHost=" + this.f27108b + ", pubId=inmobi)";
    }
}
