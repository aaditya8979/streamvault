package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes8.dex */
public abstract class O6 extends AbstractC3869y implements InterfaceC3338cj, InterfaceC3380ea, InterfaceC3421g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3844x f26067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3721s1 f26068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hc f26069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ac f26070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O6(C3844x c3844x, AbstractC3721s1 abstractC3721s1, Hc hc2, Ac ac2) {
        super(c3844x);
        tn.p.k(c3844x, "adComponent");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(hc2, "publisherCallbacks");
        tn.p.k(ac2, "stateMachine");
        this.f26067b = c3844x;
        this.f26068c = abstractC3721s1;
        this.f26069d = hc2;
        this.f26070e = ac2;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3380ea
    public final void e() {
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-FetchedState", "transitionToLoadFailedState Called");
        }
        this.f26070e.a(new C3407fb(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), inMobiAdRequestStatus, this.f26068c, this.f26067b, this.f26069d, this.f26070e), this);
    }

    @Override // com.inmobi.media.InterfaceC3421g
    public final void j() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-FetchedState", "onDestroy Called");
        }
        this.f26070e.a(new C3700r5(null, this.f26068c, this.f26067b), this);
    }
}
