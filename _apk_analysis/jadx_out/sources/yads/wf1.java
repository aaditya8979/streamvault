package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f96368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah f96369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cu1 f96370d;

    public /* synthetic */ wf1(Context context, d4 d4Var) {
        this(context, d4Var, new ah(context), cu1.f88614e.a());
    }

    public wf1(Context context, d4 d4Var, ah ahVar, cu1 cu1Var) {
        this.f96367a = context;
        this.f96368b = d4Var;
        this.f96369c = ahVar;
        this.f96370d = cu1Var;
    }

    public final List a() {
        l4 l4VarA;
        l4 l4VarA2;
        l4[] l4VarArr = new l4[4];
        try {
            this.f96369c.a();
            l4VarA = null;
        } catch (ub1 e10) {
            l4 l4Var = h9.f90282a;
            l4VarA = h9.a(1, e10.getMessage(), e10.f95593c);
        }
        l4VarArr[0] = l4VarA;
        try {
            cu1 cu1Var = this.f96370d;
            Context context = this.f96367a;
            if (cu1Var.f88617b) {
                synchronized (cu1Var.f88616a) {
                    if (cu1Var.f88617b) {
                        if (ub.a(context)) {
                            cu1Var.f88618c.a(context);
                            cu1Var.f88619d.getClass();
                            hc2.a(context);
                        }
                        cu1Var.f88617b = false;
                    }
                    bn.r rVar = bn.r.f5635a;
                }
            }
            l4VarA2 = null;
        } catch (ub1 e11) {
            l4 l4Var2 = h9.f90282a;
            l4VarA2 = h9.a(1, e11.getMessage(), e11.f95593c);
        }
        l4VarArr[1] = l4VarA2;
        d4 d4Var = this.f96368b;
        l4VarArr[2] = d4Var.f88742c.f90339a == null ? h9.f90293l : null;
        l4VarArr[3] = d4Var.f88744e == null ? h9.f90290i : null;
        return cn.w.r(l4VarArr);
    }
}
