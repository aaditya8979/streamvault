package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3384ee implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3759te f27106a;

    public C3384ee(p000do.l0 l0Var, C3759te c3759te) {
        this.f27106a = c3759te;
    }

    @Override // go.e
    public final Object emit(Object obj, hn.c cVar) {
        AbstractC3305bc abstractC3305bc = (AbstractC3305bc) obj;
        Nc nc2 = this.f27106a.f28184b.f28264f;
        nc2.getClass();
        tn.p.k(abstractC3305bc, "mediaEvent");
        if (abstractC3305bc instanceof Em) {
            nc2.f26033a.f25954d = AbstractC3468hl.a(((Em) abstractC3305bc).f25403a);
        } else if (abstractC3305bc instanceof Xm) {
            nc2.f26033a.f25955e = ((Xm) abstractC3305bc).f26602a;
        }
        if (!(abstractC3305bc instanceof Xm)) {
            InterfaceC3580m9 interfaceC3580m9L = this.f27106a.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).a("NativeRenderedState", "listenMediaEvents - processing media event: " + abstractC3305bc);
            }
            ((Sc) this.f27106a.f28184b.f28271m.getValue()).a(abstractC3305bc);
            C3614ni c3614ni = (C3614ni) this.f27106a.f28184b.f28272n.getValue();
            c3614ni.getClass();
            tn.p.k(abstractC3305bc, "event");
            if (abstractC3305bc instanceof Rl) {
                c3614ni.f27700b.a((Rl) abstractC3305bc);
            }
            C3614ni c3614ni2 = (C3614ni) this.f27106a.f28184b.f28272n.getValue();
            c3614ni2.getClass();
            tn.p.k(abstractC3305bc, "event");
            Ac ac2 = c3614ni2.f27701c.f25381c;
            if (abstractC3305bc instanceof C3544kn) {
                ac2.f();
            } else if (abstractC3305bc instanceof C3470hn) {
                ac2.i();
            } else if (abstractC3305bc instanceof Om) {
                ac2.b();
            } else if (abstractC3305bc instanceof Pl) {
                ac2.h();
            } else if (abstractC3305bc instanceof S1) {
                ac2.a(((S1) abstractC3305bc).f26272a);
            }
            C3614ni c3614ni3 = (C3614ni) this.f27106a.f28184b.f28272n.getValue();
            c3614ni3.getClass();
            tn.p.k(abstractC3305bc, "mediaEvent");
            if (abstractC3305bc instanceof Pl) {
                c3614ni3.f27699a.g();
            }
        }
        return bn.r.f5635a;
    }
}
