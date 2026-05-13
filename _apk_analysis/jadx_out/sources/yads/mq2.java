package yads;

import android.app.Dialog;

/* JADX INFO: loaded from: classes9.dex */
public final class mq2 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir2 f92503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nq2 f92504b;

    public mq2(ir2 ir2Var, nq2 nq2Var) {
        this.f92503a = ir2Var;
        this.f92504b = nq2Var;
    }

    @Override // yads.t2
    public final void b() {
        ir2 ir2Var = this.f92503a;
        ir2Var.f90961d = true;
        Dialog dialog = ((ei0) ir2Var.f90959b).f89266f;
        if (dialog != null) {
            ng0.a(dialog);
        }
        ((q2) this.f92504b.f92911a).a(13, null);
    }
}
