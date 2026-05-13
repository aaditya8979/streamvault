package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class ms1 implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns2 f92529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f92530c;

    public ms1(ns2 ns2Var, long j10) {
        this.f92529b = ns2Var;
        this.f92530c = j10;
    }

    @Override // yads.ns2
    public final int a(long j10) {
        return this.f92529b.a(j10 - this.f92530c);
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        int iA = this.f92529b.a(nx0Var, sa0Var, i10);
        if (iA == -4) {
            sa0Var.f94751f = Math.max(0L, sa0Var.f94751f + this.f92530c);
        }
        return iA;
    }

    @Override // yads.ns2
    public final void a() {
        this.f92529b.a();
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return this.f92529b.isReady();
    }
}
