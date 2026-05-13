package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.inmobi.media.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3696r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3547l1 f28013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3467hk f28014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f28016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f28017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f28018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f28019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f28020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f28021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3672q1 f28022j;

    public C3696r1(AbstractC3547l1 abstractC3547l1) {
        tn.p.k(abstractC3547l1, "adUnit");
        this.f28013a = abstractC3547l1;
        this.f28014b = new C3467hk();
        this.f28022j = new C3672q1(this);
    }

    public final String a() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad2;
        String telemetryMetadataBlob;
        AdSet adSetR = this.f28013a.r();
        return (adSetR == null || (ads = adSetR.getAds()) == null || (ad2 = (com.inmobi.media.ads.network.common.model.Ad) cn.f0.v0(ads)) == null || (telemetryMetadataBlob = ad2.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }
}
