package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class lc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fu f91924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lo2 f91925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo f91926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i30 f91927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f91928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f91929f;

    public lc0(long j10, lo2 lo2Var, uo uoVar, fu fuVar, long j11, i30 i30Var) {
        this.f91928e = j10;
        this.f91925b = lo2Var;
        this.f91926c = uoVar;
        this.f91929f = j11;
        this.f91924a = fuVar;
        this.f91927d = i30Var;
    }

    public final long a(long j10) {
        return this.f91927d.b(j10 - this.f91929f, this.f91928e) + this.f91927d.a(j10 - this.f91929f);
    }

    public final lc0 a(long j10, lo2 lo2Var) throws zo {
        long jA;
        i30 i30VarD = this.f91925b.d();
        i30 i30VarD2 = lo2Var.d();
        if (i30VarD == null) {
            return new lc0(j10, lo2Var, this.f91926c, this.f91924a, this.f91929f, i30VarD);
        }
        if (!i30VarD.a()) {
            return new lc0(j10, lo2Var, this.f91926c, this.f91924a, this.f91929f, i30VarD2);
        }
        long jC = i30VarD.c(j10);
        if (jC == 0) {
            return new lc0(j10, lo2Var, this.f91926c, this.f91924a, this.f91929f, i30VarD2);
        }
        long jB = i30VarD.b();
        long jA2 = i30VarD.a(jB);
        long j11 = jC + jB;
        long j12 = j11 - 1;
        long jB2 = i30VarD.b(j12, j10) + i30VarD.a(j12);
        long jB3 = i30VarD2.b();
        long jA3 = i30VarD2.a(jB3);
        long j13 = this.f91929f;
        if (jB2 == jA3) {
            jA = (j11 - jB3) + j13;
        } else {
            if (jB2 < jA3) {
                throw new zo();
            }
            jA = jA3 < jA2 ? j13 - (i30VarD2.a(jA2, j10) - jB) : (i30VarD.a(jA3, j10) - jB3) + j13;
        }
        return new lc0(j10, lo2Var, this.f91926c, this.f91924a, jA, i30VarD2);
    }
}
