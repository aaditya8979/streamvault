package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class uc3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj3 f95597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf3 f95598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3 f95599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f95600d;

    public /* synthetic */ uc3(ek3 ek3Var, zj3 zj3Var, hf3 hf3Var) {
        this(zj3Var, hf3Var, new fk3(ek3Var));
    }

    public uc3(zj3 zj3Var, hf3 hf3Var, fk3 fk3Var) {
        this.f95597a = zj3Var;
        this.f95598b = hf3Var;
        this.f95599c = fk3Var;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f95600d || j11 <= 0 || !this.f95599c.a()) {
            return;
        }
        this.f95600d = true;
        this.f95597a.a(this.f95598b.getVolume(), j10);
    }
}
