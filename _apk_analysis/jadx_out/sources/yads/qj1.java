package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class qj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f94051a;

    public qj1(y00 y00Var) {
        this.f94051a = y00Var;
    }

    public final Float a() {
        int i10;
        int i11;
        y00 y00Var = this.f94051a;
        h10 h10Var = y00Var.f96947a;
        a10 a10Var = y00Var.f96950d;
        if (h10Var != null) {
            return Float.valueOf(h10Var.f90193a);
        }
        if (a10Var == null || (i10 = a10Var.f87541c) <= 0 || (i11 = a10Var.f87542d) <= 0) {
            return null;
        }
        return Float.valueOf(i10 / i11);
    }
}
