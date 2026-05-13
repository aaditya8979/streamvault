package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;

/* JADX INFO: renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3266a extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f26726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3266a(byte[] bArr, long j10, C3605n9 c3605n9) {
        super(c3605n9);
        tn.p.k(bArr, "response");
        this.f26726b = bArr;
        this.f26727c = j10;
    }

    @Override // com.inmobi.media.R0
    public final bn.r a(AdResponse adResponse, sn.l lVar) {
        C3605n9 c3605n9 = this.f26215a;
        if (c3605n9 != null) {
            c3605n9.a("ABAdResponseManager", "Instance PLId: " + this.f26727c + ", Response PLId: " + adResponse.getPlacementId());
        }
        V0.a(adResponse, this.f26215a, lVar);
        return bn.r.f5635a;
    }

    @Override // com.inmobi.media.R0
    public final Object a(hn.c cVar) {
        return new String(this.f26726b, bo.c.f5639b);
    }
}
