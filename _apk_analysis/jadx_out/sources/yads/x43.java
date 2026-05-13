package yads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class x43 extends ua0 implements r43 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r43 f96631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f96632e;

    @Override // yads.r43
    public final int a() {
        r43 r43Var = this.f96631d;
        r43Var.getClass();
        return r43Var.a();
    }

    @Override // yads.r43
    public final int a(long j10) {
        r43 r43Var = this.f96631d;
        r43Var.getClass();
        return r43Var.a(j10 - this.f96632e);
    }

    @Override // yads.r43
    public final long a(int i10) {
        r43 r43Var = this.f96631d;
        r43Var.getClass();
        return r43Var.a(i10) + this.f96632e;
    }

    @Override // yads.r43
    public final List b(long j10) {
        r43 r43Var = this.f96631d;
        r43Var.getClass();
        return r43Var.b(j10 - this.f96632e);
    }
}
