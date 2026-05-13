package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class m72 implements ay0, p72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o72 f92302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr2 f92303b;

    public m72(o72 o72Var, lr2 lr2Var) {
        this.f92302a = o72Var;
        this.f92303b = lr2Var;
    }

    @Override // yads.p72
    public final void a() {
    }

    @Override // yads.p72
    public final void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f92303b.a();
        this.f92302a.f93137a.remove(this);
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f92302a.f93137a.remove(this);
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }

    @Override // yads.ay0
    public final void start() {
        this.f92302a.f93137a.add(this);
    }
}
