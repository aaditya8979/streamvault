package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3407fb extends AbstractC3523k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f27160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f27161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Hc f27162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3407fb(Map map, InMobiAdRequestStatus inMobiAdRequestStatus, AbstractC3721s1 abstractC3721s1, InterfaceC3828w8 interfaceC3828w8, Hc hc2, Ac ac2) {
        super(abstractC3721s1, interfaceC3828w8, ac2);
        tn.p.k(map, "telemetryPayload");
        tn.p.k(inMobiAdRequestStatus, "status");
        tn.p.k(interfaceC3828w8, "adManagerComponent");
        tn.p.k(hc2, "publisherCallbacks");
        tn.p.k(ac2, "stateMachine");
        this.f27160d = map;
        this.f27161e = inMobiAdRequestStatus;
        this.f27162f = hc2;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9C = this.f27441b.c();
        if (interfaceC3580m9C != null) {
            ((C3605n9) interfaceC3580m9C).b("AUM-LoadFailedState", "Initialize Called " + this.f27160d + com.ironsource.Z7.f30794r + this.f27161e.getStatusCode() + com.ironsource.Z7.f30794r + this.f27161e.getMessage());
        }
        P4.a(this.f27441b.a(), new C3381eb(this, null));
        C3571m0 c3571m0B = this.f27441b.b();
        Map map = this.f27160d;
        c3571m0B.getClass();
        tn.p.k(map, "payload");
        p000do.i.d(c3571m0B.f27589a, null, null, new C3447h0(c3571m0B, map, null), 3, null);
        AbstractC3721s1 abstractC3721s1 = this.f27440a;
        if (abstractC3721s1 != null) {
            abstractC3721s1.a();
        }
        j();
    }
}
