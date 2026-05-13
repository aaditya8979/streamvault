package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cf {
    public static final at1 a(Context context, cq3 cq3Var) {
        pu3 pu3Var = pu3.f93787a;
        if (ct1.f88601b == null) {
            synchronized (at1.f87801e) {
                if (ct1.f88601b == null) {
                    Context contextA = uz.a(context);
                    ct1.f88601b = ct1.a(contextA, ct1.f88600a.a(contextA), cq3Var);
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        at1 at1Var = ct1.f88601b;
        if (at1Var != null) {
            return at1Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
