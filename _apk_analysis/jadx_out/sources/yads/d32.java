package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class d32 implements w63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e32 f88728b;

    public d32(e32 e32Var, long j10) {
        this.f88728b = e32Var;
        this.f88727a = j10;
    }

    @Override // yads.w63
    public final void a(long j10, long j11) {
        tj2 tj2Var = this.f88728b.f89083d;
        if (tj2Var != null) {
            long j12 = this.f88727a;
            tj2Var.a(j12, j12 - j10);
        }
    }
}
