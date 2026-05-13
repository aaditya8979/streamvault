package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.ads.network.common.model.AdResponse;

/* JADX INFO: renamed from: com.inmobi.media.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3609nd extends AbstractC3483ib {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3622o1 f27689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC3721s1 f27690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Hc f27691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Ac f27692r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3609nd(byte[] bArr, C3622o1 c3622o1, AbstractC3721s1 abstractC3721s1, Hc hc2, Ac ac2) {
        super(bArr, c3622o1, abstractC3721s1, hc2, ac2);
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(hc2, "nativeCallback");
        tn.p.k(ac2, "stateMachine");
        this.f27689o = c3622o1;
        this.f27690p = abstractC3721s1;
        this.f27691q = hc2;
        this.f27692r = ac2;
    }

    @Override // com.inmobi.media.AbstractC3483ib
    public final void a(AdResponse adResponse) {
        tn.p.k(adResponse, "adResponse");
        C3605n9 c3605n9 = this.f27069e;
        if (c3605n9 != null) {
            tn.p.k(adResponse, IconCompat.EXTRA_OBJ);
            c3605n9.a("AUM-NativeLoadResponseState", "onAdResponseParseSuccess - ad response received: " + AbstractC3581ma.a(adResponse, AdResponse.class));
        }
        S0.a(this.f27689o, adResponse, new C3559ld(this), new C3584md(this));
    }
}
