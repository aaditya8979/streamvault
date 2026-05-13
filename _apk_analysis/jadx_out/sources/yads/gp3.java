package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gp3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hp3 f90086a;

    public gp3(hp3 hp3Var) {
        this.f90086a = hp3Var;
    }

    public final void a() {
        hp3 hp3Var = this.f90086a;
        to2 to2Var = hp3Var.f90480c;
        if (hp3Var.f90481d != 0 || to2Var == null) {
            return;
        }
        to2Var.onSuccess(hp3Var.f90479b);
    }

    @Override // yads.to2
    public final void a(be3 be3Var) {
        hp3 hp3Var = this.f90086a;
        hp3Var.f90481d--;
        a();
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        r0.f90481d--;
        this.f90086a.f90479b.addAll((List) obj);
        a();
    }
}
