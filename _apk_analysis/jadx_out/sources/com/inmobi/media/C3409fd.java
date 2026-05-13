package com.inmobi.media;

import com.inmobi.media.C3409fd;

/* JADX INFO: renamed from: com.inmobi.media.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3409fd extends AbstractC3722s2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3435gd f27163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bn.g f27164i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3409fd(p000do.l0 l0Var, C3793un c3793un, C3868xn c3868xn, go.l lVar) {
        super(l0Var, c3793un, c3868xn, lVar);
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(c3793un, "viewabilityModel");
        tn.p.k(c3868xn, "viewabilityCriteria");
        tn.p.k(lVar, "windowObserver");
        this.f27163h = new C3435gd(new Jn(c3868xn.f28540b, c3868xn.f28541c), this.f28091g.f25390c);
        this.f27164i = kotlin.b.b(new sn.a() { // from class: n9.u6
            @Override // sn.a
            public final Object invoke() {
                return C3409fd.a(this.f75645b);
            }
        });
    }

    public static final Bn a(C3409fd c3409fd) {
        C3435gd c3435gd = c3409fd.f27163h;
        tn.p.k(c3435gd, "viewabilityTrackerView");
        return new Bn(new C3836wg(c3409fd.f28085a, new C3886yg(c3409fd.f28086b.f28539a), c3435gd), new Dn(c3409fd.f28085a, c3409fd.f28086b.f28542d));
    }

    @Override // com.inmobi.media.AbstractC3722s2
    public final Bn c() {
        return (Bn) this.f27164i.getValue();
    }
}
