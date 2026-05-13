package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class lz implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz f92178a;

    public lz(mz mzVar) {
        this.f92178a = mzVar;
    }

    @Override // yads.c2
    public final void a() {
        ay0 ay0Var = this.f92178a.f92657i;
        if (ay0Var != null) {
            ay0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        ay0 ay0Var = this.f92178a.f92657i;
        if (ay0Var != null) {
            ay0Var.pause();
        }
    }
}
