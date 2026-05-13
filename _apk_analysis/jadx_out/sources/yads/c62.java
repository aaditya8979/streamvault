package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class c62 implements ay0, m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d62 f88367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f88368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z3 f88369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tj2 f88370d;

    public c62(d62 d62Var, z3 z3Var, tj2 tj2Var, Long l10) {
        this.f88367a = d62Var;
        this.f88368b = l10;
        this.f88369c = z3Var;
        this.f88370d = tj2Var;
    }

    @Override // yads.m62
    public final void a() {
        z3 z3Var = this.f88369c;
        if (z3Var != null) {
            z3Var.a();
        }
        this.f88369c = null;
    }

    @Override // yads.m62
    public final void a(long j10, long j11) {
        tj2 tj2Var = this.f88370d;
        if (tj2Var != null) {
            tj2Var.a(j10, j11);
        }
        Long l10 = this.f88368b;
        if (l10 == null || j11 <= l10.longValue()) {
            return;
        }
        tj2 tj2Var2 = this.f88370d;
        if (tj2Var2 != null) {
            tj2Var2.a();
        }
        z3 z3Var = this.f88369c;
        if (z3Var != null) {
            z3Var.b();
        }
        this.f88367a.f88769a.remove(this);
        this.f88369c = null;
        this.f88370d = null;
    }

    @Override // yads.m62
    public final void b() {
        tj2 tj2Var = this.f88370d;
        if (tj2Var != null) {
            tj2Var.a();
        }
        z3 z3Var = this.f88369c;
        if (z3Var != null) {
            z3Var.b();
        }
        this.f88367a.f88769a.remove(this);
        this.f88369c = null;
        this.f88370d = null;
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f88367a.f88769a.remove(this);
        this.f88369c = null;
        this.f88370d = null;
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }

    @Override // yads.ay0
    public final void start() {
        this.f88367a.f88769a.add(this);
    }
}
