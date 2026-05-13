package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ah1 {
    public static bh1 a(Context context) {
        if (bh1.f88004g == null) {
            synchronized (bh1.f88003f) {
                if (bh1.f88004g == null) {
                    eh1 eh1Var = new eh1();
                    dh1 dh1Var = new dh1();
                    Object obj = dw2.f89000j;
                    bh1.f88004g = new bh1(context, eh1Var, dh1Var, cw2.a(), new ox2());
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        bh1 bh1Var = bh1.f88004g;
        if (bh1Var != null) {
            return bh1Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
