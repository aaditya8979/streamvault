package yads;

/* JADX INFO: loaded from: classes12.dex */
public abstract class wo2 {
    public static xo2 a() {
        xo2 xo2Var;
        xo2 xo2Var2 = xo2.f96844b;
        if (xo2Var2 != null) {
            return xo2Var2;
        }
        synchronized (xo2.f96843a) {
            xo2Var = xo2.f96844b;
            if (xo2Var == null) {
                xo2Var = new xo2();
                xo2.f96844b = xo2Var;
            }
        }
        return xo2Var;
    }
}
