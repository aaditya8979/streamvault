package com.inmobi.media;

import com.inmobi.media.Wm;

/* JADX INFO: loaded from: classes9.dex */
public final class Wm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f26563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3452h5 f26564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final In f26565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bn.g f26566d;

    public Wm(p000do.l0 l0Var, C3452h5 c3452h5, In in2) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(c3452h5, "trackingView");
        tn.p.k(in2, "config");
        this.f26563a = l0Var;
        this.f26564b = c3452h5;
        this.f26565c = in2;
        this.f26566d = kotlin.b.b(new sn.a() { // from class: n9.g5
            @Override // sn.a
            public final Object invoke() {
                return Wm.a(this.f75385b);
            }
        });
    }

    public static final C3836wg a(Wm wm2) {
        In in2 = wm2.f26565c;
        return new C3836wg(wm2.f26563a, new C3886yg(wm2.f26565c.f25672b), new Kn(new Jn(in2.f25671a, in2.f25673c), new C3286aj(wm2.f26564b, cn.w.m())));
    }
}
