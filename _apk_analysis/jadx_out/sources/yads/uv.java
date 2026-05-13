package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class uv extends px0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f95848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f95849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f95850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f95851g;

    public uv(s63 s63Var, long j10, long j11) throws vv {
        super(s63Var);
        boolean z10 = false;
        if (s63Var.a() != 1) {
            throw new vv(0);
        }
        r63 r63VarA = s63Var.a(0, new r63());
        long jMax = Math.max(0L, j10);
        if (!r63VarA.f94310m && jMax != 0 && !r63VarA.f94306i) {
            throw new vv(1);
        }
        long jMax2 = j11 == Long.MIN_VALUE ? r63VarA.f94312o : Math.max(0L, j11);
        long j12 = r63VarA.f94312o;
        if (j12 != -9223372036854775807L) {
            jMax2 = jMax2 > j12 ? j12 : jMax2;
            if (jMax > jMax2) {
                throw new vv(2);
            }
        }
        this.f95848d = jMax;
        this.f95849e = jMax2;
        this.f95850f = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (r63VarA.f94307j && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
            z10 = true;
        }
        this.f95851g = z10;
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        this.f93823c.a(0, p63Var, z10);
        long j10 = p63Var.f93451f - this.f95848d;
        long j11 = this.f95850f;
        return p63Var.a(p63Var.f93447b, p63Var.f93448c, 0, j11 == -9223372036854775807L ? -9223372036854775807L : j11 - j10, j10, e6.f89106h, false);
    }

    @Override // yads.px0, yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        this.f93823c.a(0, r63Var, 0L);
        long j11 = r63Var.f94315r;
        long j12 = this.f95848d;
        r63Var.f94315r = j11 + j12;
        r63Var.f94312o = this.f95850f;
        r63Var.f94307j = this.f95851g;
        long j13 = r63Var.f94311n;
        if (j13 != -9223372036854775807L) {
            long jMax = Math.max(j13, j12);
            r63Var.f94311n = jMax;
            long j14 = this.f95849e;
            if (j14 != -9223372036854775807L) {
                jMax = Math.min(jMax, j14);
            }
            r63Var.f94311n = jMax - this.f95848d;
        }
        long jB = ib3.b(this.f95848d);
        long j15 = r63Var.f94303f;
        if (j15 != -9223372036854775807L) {
            r63Var.f94303f = j15 + jB;
        }
        long j16 = r63Var.f94304g;
        if (j16 != -9223372036854775807L) {
            r63Var.f94304g = j16 + jB;
        }
        return r63Var;
    }
}
