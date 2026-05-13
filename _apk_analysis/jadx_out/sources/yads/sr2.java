package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class sr2 {
    public static tr2 a() {
        if (tr2.f95333d == null) {
            synchronized (tr2.f95332c) {
                if (tr2.f95333d == null) {
                    tr2.f95333d = new tr2(new ki2(), new oy0());
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        tr2 tr2Var = tr2.f95333d;
        if (tr2Var != null) {
            return tr2Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
