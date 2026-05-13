package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class w12 implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j52 f96258a;

    public w12(j52 j52Var) {
        this.f96258a = j52Var;
    }

    @Override // yads.yb
    public final boolean a() {
        View viewA;
        l12 l12Var = ((k12) this.f96258a).f91462d;
        return (l12Var == null || (viewA = l12Var.f91863c.a()) == null || kl3.f91651a.a(viewA).f96809a < 1) ? false : true;
    }
}
