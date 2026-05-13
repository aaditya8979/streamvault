package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class tv2 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f95383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f95384b;

    public tv2(lu2 lu2Var, d4 d4Var) {
        this.f95383a = lu2Var;
        this.f95384b = d4Var;
    }

    @Override // yads.x22
    public final w22 a(m02 m02Var) {
        return new sv2(m02Var, this.f95384b, new mv2(this.f95383a));
    }
}
