package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class Fd implements InterfaceC3878y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3878y8 f25436a;

    public Fd(p000do.l0 l0Var, Vb vb2, go.l lVar) {
        InterfaceC3878y8 jd2;
        tn.p.k(l0Var, "scope");
        tn.p.k(vb2, "mrC50Model");
        tn.p.k(lVar, "lifecycleObserver");
        tn.p.k(l0Var, "scope");
        tn.p.k(vb2, "mrC50Model");
        tn.p.k(lVar, "lifecycleObserver");
        if (vb2 instanceof K5) {
            jd2 = new Ed(l0Var, (K5) vb2, lVar);
        } else {
            if (!(vb2 instanceof Nm)) {
                throw new NoWhenBranchMatchedException();
            }
            jd2 = new Jd((Nm) vb2);
        }
        this.f25436a = jd2;
    }

    @Override // com.inmobi.media.InterfaceC3878y8
    public final void a() {
        this.f25436a.a();
    }

    @Override // com.inmobi.media.InterfaceC3878y8
    public final go.d b() {
        return this.f25436a.b();
    }
}
