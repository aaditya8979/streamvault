package yads;

/* JADX INFO: loaded from: classes7.dex */
public abstract class iu1 {
    public static ju1 a() {
        ju1 ju1Var;
        ju1 ju1Var2 = ju1.f91373b;
        if (ju1Var2 != null) {
            return ju1Var2;
        }
        synchronized (ju1.f91374c) {
            ju1Var = ju1.f91373b;
            if (ju1Var == null) {
                ju1Var = new ju1();
                ju1.f91373b = ju1Var;
            }
        }
        return ju1Var;
    }
}
