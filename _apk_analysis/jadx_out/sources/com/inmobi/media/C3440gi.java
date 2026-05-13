package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;

/* JADX INFO: renamed from: com.inmobi.media.gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3440gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3795v0 f27230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3672q1 f27239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3564li f27240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f27241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InlineParams f27242m;

    public C3440gi(C3795v0 c3795v0, String str, String str2, String str3, int i10, String str4, String str5, boolean z10, int i11, C3672q1 c3672q1, C3564li c3564li, String str6, InlineParams inlineParams) {
        tn.p.k(c3795v0, "placement");
        tn.p.k(str, "markupType");
        tn.p.k(str2, "impressionId");
        tn.p.k(str3, "telemetryMetadataBlob");
        tn.p.k(str4, "creativeType");
        tn.p.k(str5, "creativeId");
        this.f27230a = c3795v0;
        this.f27231b = str;
        this.f27232c = str2;
        this.f27233d = str3;
        this.f27234e = i10;
        this.f27235f = str4;
        this.f27236g = str5;
        this.f27237h = z10;
        this.f27238i = i11;
        this.f27239j = c3672q1;
        this.f27240k = c3564li;
        this.f27241l = str6;
        this.f27242m = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3440gi)) {
            return false;
        }
        C3440gi c3440gi = (C3440gi) obj;
        return tn.p.f(this.f27230a, c3440gi.f27230a) && tn.p.f(this.f27231b, c3440gi.f27231b) && tn.p.f(this.f27232c, c3440gi.f27232c) && tn.p.f(this.f27233d, c3440gi.f27233d) && this.f27234e == c3440gi.f27234e && tn.p.f(this.f27235f, c3440gi.f27235f) && tn.p.f(this.f27236g, c3440gi.f27236g) && this.f27237h == c3440gi.f27237h && this.f27238i == c3440gi.f27238i && tn.p.f(this.f27239j, c3440gi.f27239j) && tn.p.f(this.f27240k, c3440gi.f27240k) && tn.p.f(this.f27241l, c3440gi.f27241l) && tn.p.f(this.f27242m, c3440gi.f27242m);
    }

    public final int hashCode() {
        int iA = AbstractC3414fi.a(this.f27238i, (Boolean.hashCode(this.f27237h) + ((this.f27236g.hashCode() + ((this.f27235f.hashCode() + AbstractC3414fi.a(this.f27234e, (this.f27233d.hashCode() + ((this.f27232c.hashCode() + ((this.f27231b.hashCode() + (this.f27230a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31);
        C3672q1 c3672q1 = this.f27239j;
        int iHashCode = (iA + (c3672q1 == null ? 0 : c3672q1.hashCode())) * 31;
        C3564li c3564li = this.f27240k;
        int iHashCode2 = (iHashCode + (c3564li == null ? 0 : Integer.hashCode(c3564li.f27575a))) * 31;
        String str = this.f27241l;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InlineParams inlineParams = this.f27242m;
        return iHashCode3 + (inlineParams != null ? inlineParams.hashCode() : 0);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.f27230a + ", markupType=" + this.f27231b + ", impressionId=" + this.f27232c + ", telemetryMetadataBlob=" + this.f27233d + ", internetAvailabilityAdRetryCount=" + this.f27234e + ", creativeType=" + this.f27235f + ", creativeId=" + this.f27236g + ", isRewarded=" + this.f27237h + ", adIndex=" + this.f27238i + ", adUnitTelemetryData=" + this.f27239j + ", renderViewTelemetryData=" + this.f27240k + ", renderViewId=" + this.f27241l + ", inlineParams=" + this.f27242m + ")";
    }
}
