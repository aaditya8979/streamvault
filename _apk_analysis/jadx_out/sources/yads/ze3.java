package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class ze3 implements kf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f97548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf3 f97549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vf3 f97550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yf3 f97551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jg3 f97552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w5 f97553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yj3 f97554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final af3 f97555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f97556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gf3 f97557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f97558k;

    public ze3(je3 je3Var, hf3 hf3Var, vf3 vf3Var, yf3 yf3Var, jg3 jg3Var, w5 w5Var, zj3 zj3Var, af3 af3Var, boolean z10) {
        this.f97548a = je3Var;
        this.f97549b = hf3Var;
        this.f97550c = vf3Var;
        this.f97551d = yf3Var;
        this.f97552e = jg3Var;
        this.f97553f = w5Var;
        this.f97554g = zj3Var;
        this.f97555h = af3Var;
        this.f97556i = z10;
    }

    @Override // yads.kf3
    public final void a() {
        if (this.f97558k) {
            this.f97552e.a(hg3.f90404e);
            this.f97554g.j();
        }
    }

    @Override // yads.kf3
    public final void a(jf3 jf3Var) {
        this.f97558k = false;
        this.f97552e.a(this.f97552e.f91224a.contains(hg3.f90403d) ? hg3.f90409j : hg3.f90410k);
        this.f97550c.a();
        this.f97551d.a(jf3Var);
        this.f97554g.a(jf3Var);
        this.f97555h.a(this.f97548a, jf3Var);
        this.f97549b.a((ze3) null);
        this.f97555h.g(this.f97548a);
    }

    @Override // yads.kf3
    public final void b() {
        if (this.f97558k) {
            this.f97552e.a(hg3.f90408i);
            this.f97554g.f();
        }
    }

    @Override // yads.kf3
    public final void c() {
        this.f97558k = true;
        this.f97552e.a(hg3.f90404e);
        vf3 vf3Var = this.f97550c;
        if (!vf3Var.f96082d) {
            vf3Var.f96082d = true;
            vf3Var.f96080b.a();
            vf3Var.f96081c.post(new uf3(vf3Var));
        }
        this.f97557j = new gf3(this.f97549b, this.f97554g);
        this.f97555h.b(this.f97548a);
    }

    @Override // yads.kf3
    public final void d() {
        this.f97558k = false;
        this.f97552e.a(hg3.f90406g);
        if (this.f97556i) {
            this.f97554g.b();
        }
        this.f97550c.a();
        this.f97551d.b();
        this.f97555h.c(this.f97548a);
        this.f97549b.a((ze3) null);
        this.f97555h.g(this.f97548a);
    }

    @Override // yads.kf3
    public final void e() {
        this.f97554g.g();
        this.f97558k = false;
        this.f97552e.a(hg3.f90405f);
        this.f97550c.a();
        this.f97551d.b();
        this.f97555h.h(this.f97548a);
        this.f97549b.a((ze3) null);
        this.f97555h.g(this.f97548a);
    }

    @Override // yads.kf3
    public final void f() {
        this.f97552e.a(hg3.f90404e);
        if (this.f97558k) {
            this.f97554g.c();
        }
        vf3 vf3Var = this.f97550c;
        if (!vf3Var.f96082d) {
            vf3Var.f96082d = true;
            vf3Var.f96080b.a();
            vf3Var.f96081c.post(new uf3(vf3Var));
        }
        this.f97555h.d(this.f97548a);
    }

    @Override // yads.kf3
    public final void h() {
        this.f97552e.a(hg3.f90403d);
        this.f97553f.a(v5.f95943v);
        this.f97555h.j(this.f97548a);
    }

    @Override // yads.kf3
    public final void i() {
        this.f97552e.a(hg3.f90407h);
        if (this.f97558k) {
            this.f97554g.d();
        }
        this.f97555h.k(this.f97548a);
    }

    @Override // yads.kf3
    public final void onVolumeChanged(float f10) {
        this.f97554g.a(f10);
        gf3 gf3Var = this.f97557j;
        if (gf3Var != null) {
            if (f10 == 0.0f) {
                if (!gf3Var.f89979b) {
                    gf3Var.f89979b = true;
                    gf3Var.f89978a.l();
                }
            } else if (gf3Var.f89979b) {
                gf3Var.f89979b = false;
                gf3Var.f89978a.a();
            }
        }
        this.f97555h.a(this.f97548a, f10);
    }
}
