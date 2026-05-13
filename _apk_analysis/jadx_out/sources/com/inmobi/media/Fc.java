package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Fc implements ro, InterfaceC3395f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f25434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jc f25435b;

    public Fc(Ec ec2) {
        tn.p.k(ec2, "nativeAdUnitComponent");
        this.f25434a = ec2;
        this.f25435b = new Jc(ec2);
    }

    @Override // com.inmobi.media.InterfaceC3395f
    public final Object a(hn.c cVar) {
        Object objA = this.f25435b.a(cVar);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return qo.a(this.f25434a.f25379a, d10);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return qo.a(this.f25434a.f25379a, i10, d10);
    }

    public final void a() {
        InterfaceC3338cj interfaceC3338cj = this.f25435b.f25720c;
        C3759te c3759te = interfaceC3338cj instanceof C3759te ? (C3759te) interfaceC3338cj : null;
        if (c3759te != null) {
            InterfaceC3580m9 interfaceC3580m9L = c3759te.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).a("NativeRenderedState", "takeAction");
            }
            ((C3509jd) c3759te.f28184b.f28274p.getValue()).b();
        }
    }
}
