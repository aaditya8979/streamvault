package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class zn2 implements kf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2 f97728a;

    public zn2(ao2 ao2Var) {
        this.f97728a = ao2Var;
    }

    @Override // yads.kf3
    public final void a() {
    }

    @Override // yads.kf3
    public final void a(jf3 jf3Var) {
        this.f97728a.f87767c.a();
        this.f97728a.f87765a.a((kf3) null);
        this.f97728a.f87765a.e();
    }

    @Override // yads.kf3
    public final void b() {
    }

    @Override // yads.kf3
    public final void c() {
        vf3 vf3Var = this.f97728a.f87767c;
        if (!vf3Var.f96082d) {
            vf3Var.f96082d = true;
            vf3Var.f96080b.a();
            vf3Var.f96081c.post(new uf3(vf3Var));
        }
        ef3 ef3Var = this.f97728a.f87769e;
        if (ef3Var != null) {
            ef3Var.c();
        }
    }

    @Override // yads.kf3
    public final void d() {
        this.f97728a.f87767c.a();
        this.f97728a.f87765a.a((kf3) null);
        ef3 ef3Var = this.f97728a.f87769e;
        if (ef3Var != null) {
            ef3Var.b();
        }
    }

    @Override // yads.kf3
    public final void e() {
        this.f97728a.f87767c.a();
        this.f97728a.f87765a.a((kf3) null);
    }

    @Override // yads.kf3
    public final void f() {
    }

    @Override // yads.kf3
    public final void h() {
        this.f97728a.f87765a.c();
    }

    @Override // yads.kf3
    public final void i() {
    }

    @Override // yads.kf3
    public final void onVolumeChanged(float f10) {
    }
}
