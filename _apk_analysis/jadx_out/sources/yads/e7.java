package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class e7 implements yv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7 f89131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89132b;

    public e7(c7 c7Var, int i10) {
        this.f89131a = c7Var;
        this.f89132b = i10;
    }

    @Override // yads.yv
    public final boolean a() {
        return this.f89131a.f88375b <= this.f89132b;
    }
}
