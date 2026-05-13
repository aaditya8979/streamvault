package com.inmobi.media;

import com.inmobi.media.C3304bb;

/* JADX INFO: renamed from: com.inmobi.media.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3304bb extends AbstractC3721s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3622o1 f26850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ac f26851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.g f26852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3304bb(C3622o1 c3622o1, Ac ac2) {
        super(c3622o1);
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(ac2, "stateMachine");
        this.f26850b = c3622o1;
        this.f26851c = ac2;
    }

    public static final bn.r a(C3304bb c3304bb) {
        c3304bb.f26851c.e();
        return bn.r.f5635a;
    }

    @Override // com.inmobi.media.AbstractC3721s1
    public final void a() {
        H6.a(this.f26852d);
        this.f26852d = null;
    }

    @Override // com.inmobi.media.AbstractC3721s1
    public final void b() {
        g();
    }

    @Override // com.inmobi.media.AbstractC3721s1
    public final void d() {
        g();
    }

    @Override // com.inmobi.media.AbstractC3721s1
    public final void e() {
        H6.a(this.f26852d);
        this.f26852d = null;
    }

    public final void g() {
        long j10 = this.f28084a.f27686c;
        p000do.l0 l0Var = this.f26850b.f27737e;
        sn.a aVar = new sn.a() { // from class: n9.s5
            @Override // sn.a
            public final Object invoke() {
                return C3304bb.a(this.f75610b);
            }
        };
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(aVar, "timeOutCallback");
        this.f26852d = p000do.i.d(l0Var, null, null, new C3740sk(j10, aVar, null), 3, null);
    }
}
