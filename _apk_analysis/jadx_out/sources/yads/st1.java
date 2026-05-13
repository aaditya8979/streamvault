package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class st1 {
    public static ut1 a(lu2 lu2Var) {
        if (ut1.f95783g == null) {
            synchronized (ut1.f95782f) {
                if (ut1.f95783g == null) {
                    ut1.f95783g = new ut1(new nt1(new ot1()), new rt1(), new uu2(), lu2Var, tt1.f95350b);
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        ut1 ut1Var = ut1.f95783g;
        if (ut1Var != null) {
            return ut1Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
