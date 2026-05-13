package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m43 {
    public static n43 a() {
        if (n43.f92737b == null) {
            synchronized (n43.f92738c) {
                if (n43.f92737b == null) {
                    n43.f92737b = new n43();
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        n43 n43Var = n43.f92737b;
        if (n43Var != null) {
            return n43Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
