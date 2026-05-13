package yads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class mc0 extends ko {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lc0 f92320e;

    public mc0(lc0 lc0Var, long j10, long j11) {
        super(j10, j11);
        this.f92320e = lc0Var;
    }

    @Override // yads.yj1
    public final long a() {
        long j10 = this.f91678d;
        if (j10 < this.f91676b || j10 > this.f91677c) {
            throw new NoSuchElementException();
        }
        return this.f92320e.a(j10);
    }

    @Override // yads.yj1
    public final long b() {
        long j10 = this.f91678d;
        if (j10 < this.f91676b || j10 > this.f91677c) {
            throw new NoSuchElementException();
        }
        lc0 lc0Var = this.f92320e;
        return lc0Var.f91927d.a(j10 - lc0Var.f91929f);
    }
}
