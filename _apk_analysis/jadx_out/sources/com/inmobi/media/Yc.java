package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class Yc extends O6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3844x f26637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InMobiJsonResponse f26638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC3721s1 f26639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hc f26640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ac f26641j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yc(C3844x c3844x, InMobiJsonResponse inMobiJsonResponse, AbstractC3721s1 abstractC3721s1, Hc hc2, Ac ac2) {
        super(c3844x, abstractC3721s1, hc2, ac2);
        tn.p.k(c3844x, "adComponent");
        tn.p.k(inMobiJsonResponse, "inMobiJsonResponse");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(hc2, "nativeCallback");
        tn.p.k(ac2, "stateMachine");
        this.f26637f = c3844x;
        this.f26638g = inMobiJsonResponse;
        this.f26639h = abstractC3721s1;
        this.f26640i = hc2;
        this.f26641j = ac2;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeFetchedState", "Initialize Called - ad fetched successfully");
        }
        InterfaceC3580m9 interfaceC3580m9L2 = l();
        if (interfaceC3580m9L2 != null) {
            ((C3605n9) interfaceC3580m9L2).a("AUM-FetchedState", "Initialize Called");
        }
        this.f26068c.getClass();
        C3844x c3844x = this.f28550a;
        C3571m0 c3571m0 = c3844x.f28472a.f27738f;
        G g10 = c3844x.f28473b;
        c3571m0.getClass();
        tn.p.k(g10, "adContext");
        p000do.i.d(c3571m0.f27589a, null, null, new C3472i0(g10, c3571m0, null), 3, null);
        P4.a(k(), new N6(this, null));
    }
}
