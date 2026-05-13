package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: loaded from: classes8.dex */
public final class Jc extends AbstractC3415fj implements InterfaceC3712rh, Ck, InterfaceC3395f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC3338cj f25720c;

    /* JADX WARN: Illegal instructions before constructor call */
    public Jc(Ec ec2) {
        tn.p.k(ec2, "nativeAdUnitComponent");
        C3844x c3844x = ec2.f25379a;
        tn.p.k(c3844x, "adComponent");
        super(c3844x.f28472a.f27737e);
        this.f25720c = new Uc(ec2, this);
    }

    @Override // com.inmobi.media.AbstractC3415fj
    public final InterfaceC3338cj a() {
        return this.f25720c;
    }

    @Override // com.inmobi.media.InterfaceC3395f
    public final Object a(hn.c cVar) {
        Object objA;
        InterfaceC3338cj interfaceC3338cj = this.f25720c;
        InterfaceC3395f interfaceC3395f = interfaceC3338cj instanceof InterfaceC3395f ? (InterfaceC3395f) interfaceC3338cj : null;
        return (interfaceC3395f == null || (objA = interfaceC3395f.a(cVar)) != in.a.g()) ? bn.r.f5635a : objA;
    }

    @Override // com.inmobi.media.InterfaceC3712rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        tn.p.k(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3338cj interfaceC3338cj = this.f25720c;
        InterfaceC3712rh interfaceC3712rh = interfaceC3338cj instanceof InterfaceC3712rh ? (InterfaceC3712rh) interfaceC3338cj : null;
        if (interfaceC3712rh != null) {
            interfaceC3712rh.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.AbstractC3415fj
    public final void a(InterfaceC3338cj interfaceC3338cj) {
        tn.p.k(interfaceC3338cj, "<set-?>");
        this.f25720c = interfaceC3338cj;
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3338cj interfaceC3338cj = this.f25720c;
        Ck ck2 = interfaceC3338cj instanceof Ck ? (Ck) interfaceC3338cj : null;
        if (ck2 != null) {
            ck2.d();
        }
    }
}
