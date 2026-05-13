package yads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q92 {
    public static r92 a() {
        r92 r92Var;
        r92 r92Var2 = r92.f94331d;
        if (r92Var2 != null) {
            return r92Var2;
        }
        synchronized (r92.f94330c) {
            r92Var = r92.f94331d;
            if (r92Var == null) {
                r92Var = new r92(new ba2());
                r92.f94331d = r92Var;
            }
        }
        return r92Var;
    }
}
