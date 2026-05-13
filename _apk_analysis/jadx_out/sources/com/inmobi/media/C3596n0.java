package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3596n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f27656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f27660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27662h;

    public C3596n0(String str, Map map, long j10, String str2, String str3, Map map2, String str4, boolean z10) {
        tn.p.k(str, "clientRequestId");
        tn.p.k("im", "integrationTypeString");
        tn.p.k(str2, "monetizationContext");
        tn.p.k("unifiedSdkJson", "adFormat");
        this.f27655a = str;
        this.f27656b = map;
        this.f27657c = j10;
        this.f27658d = str2;
        this.f27659e = str3;
        this.f27660f = map2;
        this.f27661g = str4;
        this.f27662h = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3596n0)) {
            return false;
        }
        C3596n0 c3596n0 = (C3596n0) obj;
        return tn.p.f(this.f27655a, c3596n0.f27655a) && tn.p.f("im", "im") && tn.p.f(this.f27656b, c3596n0.f27656b) && this.f27657c == c3596n0.f27657c && tn.p.f(this.f27658d, c3596n0.f27658d) && tn.p.f(this.f27659e, c3596n0.f27659e) && tn.p.f("unifiedSdkJson", "unifiedSdkJson") && tn.p.f(this.f27660f, c3596n0.f27660f) && tn.p.f(this.f27661g, c3596n0.f27661g) && this.f27662h == c3596n0.f27662h && tn.p.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = ((this.f27655a.hashCode() * 31) + 3364) * 31;
        Map map = this.f27656b;
        int iHashCode2 = (this.f27658d.hashCode() + ((Long.hashCode(this.f27657c) + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31;
        String str = this.f27659e;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + 1309392464) * 31;
        Map map2 = this.f27660f;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.f27661g;
        return (Boolean.hashCode(this.f27662h) + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        return "AdMetaData(clientRequestId=" + this.f27655a + ", integrationTypeString=im, extras=" + this.f27656b + ", imPlacementId=" + this.f27657c + ", monetizationContext=" + this.f27658d + ", adType=" + this.f27659e + ", adFormat=unifiedSdkJson, adSpecificRequestParams=" + this.f27660f + ", keywords=" + this.f27661g + ", isApplicationMutedByPub=" + this.f27662h + ", extraInfo=" + ((Object) null) + ")";
    }
}
