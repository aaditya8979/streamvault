package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.inmobi.media.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3507jb extends AbstractC3869y implements InterfaceC3338cj, InterfaceC3380ea, InterfaceC3421g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3844x f27393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3721s1 f27394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hc f27395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ac f27396e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3507jb(C3844x c3844x, AbstractC3721s1 abstractC3721s1, Hc hc2, Ac ac2) {
        super(c3844x);
        tn.p.k(c3844x, "adComponent");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(hc2, "publisherCallbacks");
        tn.p.k(ac2, "stateMachine");
        this.f27393b = c3844x;
        this.f27394c = abstractC3721s1;
        this.f27395d = hc2;
        this.f27396e = ac2;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-LoadingState", "Initialize Called");
        }
        this.f27394c.getClass();
        InterfaceC3338cj interfaceC3338cj = ((Cd) this).f25265j.f25435b.f25720c;
        Uc uc2 = interfaceC3338cj instanceof Uc ? (Uc) interfaceC3338cj : null;
        if (uc2 != null) {
            C3605n9 c3605n9 = uc2.f26435a.f25379a.f28472a.f27735c;
            if (c3605n9 != null) {
                c3605n9.a("NativeCreatedState", "Inflate Called");
            }
            uc2.f26436b.a(new Dd(uc2.f26435a, uc2.f26436b), uc2);
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-LoadingState", "transitionToLoadFailedState " + ((int) s10));
        }
        this.f27396e.a(new C3407fb(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10))), inMobiAdRequestStatus, this.f27394c, this.f27393b, this.f27395d, this.f27396e), this);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3380ea
    public final void e() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-LoadingState", "onInternalLoadTimeout");
        }
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), Re.a() == null ? (short) 2139 : (short) 2203);
    }

    @Override // com.inmobi.media.InterfaceC3421g
    public final void j() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-LoadingState", "onDestroy");
        }
        this.f27396e.a(new C3700r5(((Cd) this).f25265j, this.f27394c, this.f27393b), this);
    }
}
