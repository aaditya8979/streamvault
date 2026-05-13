package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class jo2 extends lo2 implements i30 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cx2 f91317f;

    public jo2(long j10, mx0 mx0Var, p51 p51Var, cx2 cx2Var, ArrayList arrayList) {
        super(mx0Var, p51Var, cx2Var, arrayList);
        this.f91317f = cx2Var;
    }

    @Override // yads.i30
    public final long a(long j10) {
        return this.f91317f.b(j10);
    }

    @Override // yads.i30
    public final long a(long j10, long j11) {
        return this.f91317f.c(j10, j11);
    }

    @Override // yads.i30
    public final boolean a() {
        return this.f91317f.b();
    }

    @Override // yads.i30
    public final long b() {
        return this.f91317f.f88637d;
    }

    @Override // yads.i30
    public final long b(long j10, long j11) {
        return this.f91317f.b(j10, j11);
    }

    @Override // yads.i30
    public final pl2 b(long j10) {
        return this.f91317f.a(j10, this);
    }

    @Override // yads.i30
    public final long c(long j10) {
        return this.f91317f.a(j10);
    }

    @Override // yads.i30
    public final long c(long j10, long j11) {
        return this.f91317f.a(j10, j11);
    }

    @Override // yads.lo2
    public final String c() {
        return null;
    }

    @Override // yads.i30
    public final long d(long j10, long j11) {
        cx2 cx2Var = this.f91317f;
        if (cx2Var.f88639f != null) {
            return -9223372036854775807L;
        }
        long jA = cx2Var.a(j10, j11);
        long jA2 = cx2Var.a(j10);
        if (jA2 == -1) {
            jA2 = (int) (cx2Var.c((j11 - cx2Var.f88641h) + cx2Var.f88642i, j10) - cx2Var.a(j10, j11));
        }
        long j12 = jA2 + jA;
        return (cx2Var.b(j12, j10) + cx2Var.b(j12)) - cx2Var.f88642i;
    }

    @Override // yads.lo2
    public final i30 d() {
        return this;
    }

    @Override // yads.i30
    public final long e(long j10, long j11) {
        long jA = this.f91317f.a(j10);
        return jA != -1 ? jA : (int) (r0.c((j11 - r0.f88641h) + r0.f88642i, j10) - r0.a(j10, j11));
    }

    @Override // yads.lo2
    public final pl2 e() {
        return null;
    }
}
