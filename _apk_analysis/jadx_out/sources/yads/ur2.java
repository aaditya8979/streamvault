package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ur2 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y42 f95769a;

    public ur2(y42 y42Var) {
        this.f95769a = y42Var;
    }

    @Override // yads.c2
    public final void a() {
        ay0 ay0Var = this.f95769a.f96998b;
        if (ay0Var != null) {
            ay0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        ay0 ay0Var = this.f95769a.f96998b;
        if (ay0Var != null) {
            ay0Var.pause();
        }
    }
}
