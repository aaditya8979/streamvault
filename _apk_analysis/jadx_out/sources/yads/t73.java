package yads;

/* JADX INFO: loaded from: classes.dex */
public final class t73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn2[] f95089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final op0[] f95090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o83 f95091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f95092e;

    public t73(mn2[] mn2VarArr, op0[] op0VarArr, o83 o83Var, li1 li1Var) {
        this.f95089b = mn2VarArr;
        this.f95090c = (op0[]) op0VarArr.clone();
        this.f95091d = o83Var;
        this.f95092e = li1Var;
        this.f95088a = mn2VarArr.length;
    }

    public final boolean a(int i10) {
        return this.f95089b[i10] != null;
    }
}
