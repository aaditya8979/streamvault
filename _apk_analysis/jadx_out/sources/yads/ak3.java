package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class ak3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tu3 f87728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m03 f87729b;

    public /* synthetic */ ak3(tu3 tu3Var) {
        this(tu3Var, new m03());
    }

    public ak3(tu3 tu3Var, m03 m03Var) {
        this.f87728a = tu3Var;
        this.f87729b = m03Var;
    }

    public final zj3 a(Context context, je3 je3Var, mf3 mf3Var) {
        su3 su3Var;
        wj3 wj3Var = new wj3(context);
        mh3 mh3Var = new mh3(context);
        uy uyVar = new uy();
        uyVar.f95867a.add(new j20(je3Var.f91194a, wj3Var, mh3Var));
        uyVar.f95867a.add(new lg3(je3Var.f91195b, wj3Var));
        gg3 gg3VarA = this.f87729b.a(je3Var.f91194a);
        List list = je3Var.f91195b.f95615n;
        if (this.f87728a.f95361a.a(context)) {
            wj3 wj3Var2 = new wj3(context);
            ca2 ca2Var = new ca2();
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            pu3 pu3Var = pu3.f93787a;
            su3Var = new su3(context, mf3Var, gg3VarA, list, wj3Var2, ca2Var, cf.a(applicationContext, new cq3(applicationContext)));
        } else {
            su3Var = null;
        }
        if (su3Var != null) {
            uyVar.f95867a.add(su3Var);
        }
        return new zj3(uyVar);
    }
}
