package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ty0 implements py0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe1 f95420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f95421b;

    public ty0(xe1 xe1Var, kz kzVar) {
        this.f95420a = xe1Var;
        this.f95421b = kzVar;
    }

    @Override // yads.py0
    public final void c() {
        if (this.f95420a.a()) {
            return;
        }
        this.f95421b.e();
    }

    @Override // yads.py0
    public final void invalidate() {
        this.f95420a.b();
    }
}
