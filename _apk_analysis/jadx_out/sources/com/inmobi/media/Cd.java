package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class Cd extends AbstractC3507jb {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3844x f25261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC3721s1 f25262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Hc f25263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ac f25264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Fc f25265j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cd(C3844x c3844x, InMobiJsonResponse inMobiJsonResponse, AbstractC3721s1 abstractC3721s1, Hc hc2, Ac ac2) {
        super(c3844x, abstractC3721s1, hc2, ac2);
        tn.p.k(c3844x, "adComponent");
        tn.p.k(inMobiJsonResponse, "inMobiJsonResponse");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(hc2, "nativeCallback");
        tn.p.k(ac2, "stateMachine");
        this.f25261f = c3844x;
        this.f25262g = abstractC3721s1;
        this.f25263h = hc2;
        this.f25264i = ac2;
        this.f25265j = new Fc(new Ec(c3844x, inMobiJsonResponse, ac2));
    }

    public final void a(C3307be c3307be) {
        tn.p.k(c3307be, "pubData");
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeLoadingState", "onLoadSuccess - ad loaded successfully " + c3307be);
        }
        this.f25264i.a(new C3659pd(c3307be, this.f25261f, this.f25265j, this.f25262g, this.f25263h, this.f25264i), this);
    }
}
