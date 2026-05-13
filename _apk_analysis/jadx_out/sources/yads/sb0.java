package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class sb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl[] f94756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty2 f94757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d23 f94758c;

    public sb0(bl[] blVarArr, ty2 ty2Var, d23 d23Var) {
        bl[] blVarArr2 = new bl[blVarArr.length + 2];
        this.f94756a = blVarArr2;
        System.arraycopy(blVarArr, 0, blVarArr2, 0, blVarArr.length);
        this.f94757b = ty2Var;
        this.f94758c = d23Var;
        blVarArr2[blVarArr.length] = ty2Var;
        blVarArr2[blVarArr.length + 1] = d23Var;
    }

    public final bl[] a() {
        return this.f94756a;
    }
}
