package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class av1 {
    public static bv1 a() {
        bv1 bv1Var;
        bv1 bv1Var2 = bv1.f88154b;
        if (bv1Var2 != null) {
            return bv1Var2;
        }
        synchronized (bv1.f88155c) {
            bv1Var = bv1.f88154b;
            if (bv1Var == null) {
                bv1Var = new bv1();
                bv1.f88154b = bv1Var;
            }
        }
        return bv1Var;
    }
}
