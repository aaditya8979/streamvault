package com.inmobi.media;

import com.inmobi.media.Ed;

/* JADX INFO: loaded from: classes6.dex */
public final class Ed extends AbstractC3722s2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Gd f25386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bn.g f25387i;

    /* JADX WARN: Illegal instructions before constructor call */
    public Ed(p000do.l0 l0Var, K5 k52, go.l lVar) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(k52, "displayMRC50Model");
        tn.p.k(lVar, "windowObserver");
        C3793un c3793un = k52.f25798a;
        C3868xn c3868xn = k52.f25799b;
        super(l0Var, c3793un, c3868xn, lVar);
        this.f25386h = new Gd(new Jn(c3868xn.f28540b, c3868xn.f28541c), this.f28091g.f25390c);
        this.f25387i = kotlin.b.b(new sn.a() { // from class: n9.z
            @Override // sn.a
            public final Object invoke() {
                return Ed.a(this.f75715b);
            }
        });
    }

    public static final Bn a(Ed ed2) {
        Gd gd2 = ed2.f25386h;
        tn.p.k(gd2, "viewabilityTrackerView");
        return new Bn(new C3836wg(ed2.f28085a, new C3886yg(ed2.f28086b.f28539a), gd2), new Dn(ed2.f28085a, ed2.f28086b.f28542d));
    }

    @Override // com.inmobi.media.AbstractC3722s2
    public final Bn c() {
        return (Bn) this.f25387i.getValue();
    }
}
