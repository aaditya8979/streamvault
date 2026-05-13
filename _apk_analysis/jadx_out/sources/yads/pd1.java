package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pd1 {
    public static qd1 a() {
        if (qd1.f94012d == null) {
            synchronized (qd1.f94011c) {
                if (qd1.f94012d == null) {
                    qd1.f94012d = new qd1(new ki2(), new oy0());
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        qd1 qd1Var = qd1.f94012d;
        if (qd1Var != null) {
            return qd1Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
