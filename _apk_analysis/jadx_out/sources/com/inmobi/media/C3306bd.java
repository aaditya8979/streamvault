package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.ads.network.common.model.AdResponse;

/* JADX INFO: renamed from: com.inmobi.media.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3306bd extends R6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3622o1 f26853o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC3721s1 f26854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Hc f26855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Ac f26856r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3306bd(C3622o1 c3622o1, AbstractC3721s1 abstractC3721s1, Ac ac2, Hc hc2) {
        super(c3622o1, abstractC3721s1, ac2, hc2);
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(hc2, "nativeCallback");
        tn.p.k(ac2, "stateMachine");
        this.f26853o = c3622o1;
        this.f26854p = abstractC3721s1;
        this.f26855q = hc2;
        this.f26856r = ac2;
    }

    @Override // com.inmobi.media.R6
    public final void a(AdResponse adResponse) {
        tn.p.k(adResponse, "adResponse");
        C3605n9 c3605n9 = this.f27069e;
        if (c3605n9 != null) {
            tn.p.k(adResponse, IconCompat.EXTRA_OBJ);
            c3605n9.a("AUM-NativeFetchingState", "onAdResponseParseSuccess " + AbstractC3581ma.a(adResponse, AdResponse.class));
        }
        S0.a(this.f26853o, adResponse, new Zc(this), new C3280ad(this));
    }
}
