package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class m51 extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p51 f92269d;

    public m51(int i10, p51 p51Var) {
        super(p51Var.size(), i10);
        this.f92269d = p51Var;
    }

    @Override // yads.f
    public final Object a(int i10) {
        return this.f92269d.get(i10);
    }
}
