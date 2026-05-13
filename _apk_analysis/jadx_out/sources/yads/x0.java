package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x0 {
    public static z0 a() {
        z0 z0Var;
        Object obj = z0.f97340f;
        z0 z0Var2 = z0.f97341g;
        if (z0Var2 != null) {
            return z0Var2;
        }
        synchronized (z0.f97340f) {
            z0Var = z0.f97341g;
            if (z0Var == null) {
                z0Var = new z0();
                z0.f97341g = z0Var;
            }
        }
        return z0Var;
    }
}
