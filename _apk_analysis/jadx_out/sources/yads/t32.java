package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class t32 implements ac2, w63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u32 f95060a;

    public t32(u32 u32Var) {
        this.f95060a = u32Var;
    }

    @Override // yads.ac2
    public final void a() {
        this.f95060a.f95535a.a();
    }

    @Override // yads.w63
    public final void a(long j10, long j11) {
        long jA = this.f95060a.f95539e.a() - j10;
        u32 u32Var = this.f95060a;
        long j12 = jA + u32Var.f95537c.f94850a;
        this.f95060a.f95535a.a(u32Var.f95538d.a(), j12);
    }
}
