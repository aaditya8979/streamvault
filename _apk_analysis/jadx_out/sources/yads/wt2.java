package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class wt2 {
    public static xt2 a() {
        xt2 xt2Var;
        xt2 xt2Var2 = xt2.f96868c;
        if (xt2Var2 != null) {
            return xt2Var2;
        }
        synchronized (xt2.f96867b) {
            xt2Var = xt2.f96868c;
            if (xt2Var == null) {
                xt2Var = new xt2();
                xt2.f96868c = xt2Var;
            }
        }
        return xt2Var;
    }
}
