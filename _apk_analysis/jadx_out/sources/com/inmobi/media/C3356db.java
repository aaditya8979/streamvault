package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: renamed from: com.inmobi.media.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3356db extends AbstractC3523k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f27027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f27028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Hc f27029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3356db(short s10, InMobiAdRequestStatus inMobiAdRequestStatus, C3622o1 c3622o1, Hc hc2, Ac ac2) {
        super(null, c3622o1, ac2);
        tn.p.k(inMobiAdRequestStatus, "status");
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(hc2, "publisherCallbacks");
        tn.p.k(ac2, "stateMachine");
        this.f27027d = s10;
        this.f27028e = inMobiAdRequestStatus;
        this.f27029f = hc2;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9C = this.f27441b.c();
        if (interfaceC3580m9C != null) {
            short s10 = this.f27027d;
            ((C3605n9) interfaceC3580m9C).b("AUM-LoadDroppedState", "Initialize Called " + ((int) s10) + com.ironsource.Z7.f30794r + this.f27028e.getStatusCode() + com.ironsource.Z7.f30794r + this.f27028e.getMessage());
        }
        P4.a(this.f27441b.a(), new C3330cb(this, null));
        C3571m0 c3571m0B = this.f27441b.b();
        p000do.i.d(c3571m0B.f27589a, null, null, new C3422g0(c3571m0B, this.f27027d, null), 3, null);
        AbstractC3721s1 abstractC3721s1 = this.f27440a;
        if (abstractC3721s1 != null) {
            abstractC3721s1.a();
        }
        j();
    }
}
