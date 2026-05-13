package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class s32 implements r31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f94697a;

    public s32(v9 v9Var) {
        this.f94697a = tn.p.f(v9Var.b(), r32.f94273c.a()) || tn.p.f(v9Var.b(), r32.f94274d.a());
    }

    @Override // yads.r31
    public final boolean a() {
        return this.f94697a;
    }
}
