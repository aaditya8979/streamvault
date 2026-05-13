package com.inmobi.media;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes12.dex */
public final class yo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.g f28613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final go.l f28614b;

    public yo(long j10, p000do.l0 l0Var, ViewGroup viewGroup, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(viewGroup, "observableView");
        go.l lVarA = go.v.a(Boolean.FALSE);
        this.f28614b = lVarA;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("WindowLifecycleHandler", "WindowLifecycleHandler init - observableView: " + viewGroup + ", isAttachedToWindow: " + viewGroup.isAttachedToWindow());
        }
        go.u uVarM = go.f.M(go.f.C(go.f.f(new Ao(viewGroup, null)), p000do.w0.c()), l0Var, kotlinx.coroutines.flow.a.f73397a.c(), Boolean.valueOf(viewGroup.isAttachedToWindow()));
        M1 m12 = new M1(j10, viewGroup, interfaceC3580m9, l0Var, lVarA);
        tn.p.k(uVarM, "<this>");
        tn.p.k(l0Var, "scope");
        tn.p.k(m12, "collector");
        this.f28613a = p000do.i.d(l0Var, null, null, new N4(uVarM, m12, null), 3, null);
    }
}
