package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: loaded from: classes7.dex */
public final class Ac extends AbstractC3446h implements InterfaceC3712rh, Ck, ro, Sl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC3338cj f25156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ac(C3622o1 c3622o1, Hc hc2) {
        super(c3622o1.f27737e);
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(hc2, "nativeCallbacks");
        this.f25156c = new Tc(c3622o1, hc2, this);
    }

    @Override // com.inmobi.media.AbstractC3415fj
    public final InterfaceC3338cj a() {
        return this.f25156c;
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        String strA;
        InterfaceC3338cj interfaceC3338cj = this.f25156c;
        Fc fc2 = interfaceC3338cj instanceof Cd ? ((Cd) interfaceC3338cj).f25265j : interfaceC3338cj instanceof C3659pd ? ((C3659pd) interfaceC3338cj).f27869h : interfaceC3338cj instanceof C3734se ? ((C3734se) interfaceC3338cj).f28117f : interfaceC3338cj instanceof C3859xe ? ((C3859xe) interfaceC3338cj).f28516a : null;
        return (fc2 == null || (strA = fc2.a(d10)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : strA;
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        String strA;
        InterfaceC3338cj interfaceC3338cj = this.f25156c;
        Fc fc2 = interfaceC3338cj instanceof Cd ? ((Cd) interfaceC3338cj).f25265j : interfaceC3338cj instanceof C3659pd ? ((C3659pd) interfaceC3338cj).f27869h : interfaceC3338cj instanceof C3734se ? ((C3734se) interfaceC3338cj).f28117f : interfaceC3338cj instanceof C3859xe ? ((C3859xe) interfaceC3338cj).f28516a : null;
        return (fc2 == null || (strA = fc2.a(i10, d10)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : strA;
    }

    @Override // com.inmobi.media.InterfaceC3712rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        tn.p.k(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3338cj interfaceC3338cj = this.f25156c;
        InterfaceC3712rh interfaceC3712rh = interfaceC3338cj instanceof InterfaceC3712rh ? (InterfaceC3712rh) interfaceC3338cj : null;
        if (interfaceC3712rh != null) {
            interfaceC3712rh.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.AbstractC3415fj
    public final void a(InterfaceC3338cj interfaceC3338cj) {
        tn.p.k(interfaceC3338cj, "<set-?>");
        this.f25156c = interfaceC3338cj;
    }

    @Override // com.inmobi.media.Sl
    public final void a(boolean z10) {
        InterfaceC3338cj interfaceC3338cj = this.f25156c;
        Sl sl2 = interfaceC3338cj instanceof Sl ? (Sl) interfaceC3338cj : null;
        if (sl2 != null) {
            sl2.a(z10);
        }
    }

    @Override // com.inmobi.media.Sl
    public final void b() {
        InterfaceC3338cj interfaceC3338cj = this.f25156c;
        Sl sl2 = interfaceC3338cj instanceof Sl ? (Sl) interfaceC3338cj : null;
        if (sl2 != null) {
            sl2.b();
        }
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3338cj interfaceC3338cj = this.f25156c;
        Ck ck2 = interfaceC3338cj instanceof Ck ? (Ck) interfaceC3338cj : null;
        if (ck2 != null) {
            ck2.d();
        }
    }

    @Override // com.inmobi.media.Sl
    public final void f() {
        InterfaceC3338cj interfaceC3338cj = this.f25156c;
        Sl sl2 = interfaceC3338cj instanceof Sl ? (Sl) interfaceC3338cj : null;
        if (sl2 != null) {
            sl2.f();
        }
    }

    @Override // com.inmobi.media.Sl
    public final void h() {
        InterfaceC3338cj interfaceC3338cj = this.f25156c;
        Sl sl2 = interfaceC3338cj instanceof Sl ? (Sl) interfaceC3338cj : null;
        if (sl2 != null) {
            sl2.h();
        }
    }

    @Override // com.inmobi.media.Sl
    public final void i() {
        InterfaceC3338cj interfaceC3338cj = this.f25156c;
        Sl sl2 = interfaceC3338cj instanceof Sl ? (Sl) interfaceC3338cj : null;
        if (sl2 != null) {
            sl2.i();
        }
    }
}
