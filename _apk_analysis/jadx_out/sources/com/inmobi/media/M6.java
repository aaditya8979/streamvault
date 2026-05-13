package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class M6 extends AbstractC3523k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f25932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f25933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Hc f25934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6(Map map, InMobiAdRequestStatus inMobiAdRequestStatus, AbstractC3721s1 abstractC3721s1, C3622o1 c3622o1, Hc hc2, Ac ac2) {
        super(abstractC3721s1, c3622o1, ac2);
        tn.p.k(map, "payload");
        tn.p.k(inMobiAdRequestStatus, "inMobiAdRequestStatus");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(hc2, "publisherCallbacks");
        tn.p.k(ac2, "stateMachine");
        this.f25932d = map;
        this.f25933e = inMobiAdRequestStatus;
        this.f25934f = hc2;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9C = this.f27441b.c();
        if (interfaceC3580m9C != null) {
            ((C3605n9) interfaceC3580m9C).b("AUM-FetchFailedState", "Initialized Called : " + this.f25932d + com.ironsource.Z7.f30794r + this.f25933e.getStatusCode() + com.ironsource.Z7.f30794r + this.f25933e.getMessage());
        }
        P4.a(this.f27441b.a(), new L6(this, null));
        C3571m0 c3571m0B = this.f27441b.b();
        Map map = this.f25932d;
        c3571m0B.getClass();
        tn.p.k(map, "payload");
        p000do.i.d(c3571m0B.f27589a, null, null, new C3496j0(c3571m0B, map, null), 3, null);
        AbstractC3721s1 abstractC3721s1 = this.f27440a;
        if (abstractC3721s1 != null) {
            abstractC3721s1.a();
        }
        j();
    }
}
