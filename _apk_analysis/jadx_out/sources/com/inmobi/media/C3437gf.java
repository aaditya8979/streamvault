package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3437gf extends AbstractC3548l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3385ef f27222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3605n9 f27223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3437gf(SignalsConfig.NovatiqConfig novatiqConfig, C3385ef c3385ef, C3605n9 c3605n9) {
        super(novatiqConfig.getBeaconUrl());
        tn.p.k(novatiqConfig, "mConfig");
        tn.p.k(c3385ef, "data");
        this.f27222b = c3385ef;
        this.f27223c = c3605n9;
    }

    public final Je a() {
        C3605n9 c3605n9 = this.f27223c;
        if (c3605n9 != null) {
            C3385ef c3385ef = this.f27222b;
            c3605n9.a("Novatiq", "preparing Novatiq request with data - hyperId - " + c3385ef.f27107a + " - sspHost - " + c3385ef.f27108b + " - pubId - inmobi");
        }
        String str = this.f27531a;
        Pair pairA = bn.h.a("sptoken", this.f27222b.f27107a);
        this.f27222b.getClass();
        Pair pairA2 = bn.h.a("sspid", "i6i");
        Pair pairA3 = bn.h.a("ssphost", this.f27222b.f27108b);
        this.f27222b.getClass();
        return new Je(str, null, null, kotlin.collections.a.m(pairA, pairA2, pairA3, bn.h.a("pubid", "inmobi")), null, false, 54);
    }
}
