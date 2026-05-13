package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xo1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f96835g = cn.w.p(co2.f88543m, co2.f88544n);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f96836h = cn.w.p(co2.f88545o, co2.f88546p, co2.D, co2.E);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f96837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f96838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f96839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wo1 f96840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jr1 f96841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tq2 f96842f;

    public /* synthetic */ xo1(d4 d4Var, lu2 lu2Var, v9 v9Var) {
        this(d4Var, lu2Var, v9Var, new wo1(), new jr1(), new tq2());
    }

    public xo1(d4 d4Var, lu2 lu2Var, v9 v9Var, wo1 wo1Var, jr1 jr1Var, tq2 tq2Var) {
        this.f96837a = d4Var;
        this.f96838b = lu2Var;
        this.f96839c = v9Var;
        this.f96840d = wo1Var;
        this.f96841e = jr1Var;
        this.f96842f = tq2Var;
    }

    public final void a(Context context, co2 co2Var, qq1 qq1Var, String str, Map map) {
        fo2 fo2VarA;
        wo1 wo1Var = this.f96840d;
        v9 v9Var = this.f96839c;
        d4 d4Var = this.f96837a;
        wo1Var.getClass();
        if ((v9Var != null ? v9Var.f96002m : null) == sz.f95017b) {
            Object obj = v9Var.f96009t;
            fo2VarA = wo1Var.f96462b.a(v9Var, d4Var, obj instanceof d12 ? (d12) obj : null);
        } else {
            fo2VarA = wo1Var.f96461a.a(v9Var, d4Var);
        }
        this.f96841e.getClass();
        fo2 fo2VarA2 = go2.a(fo2VarA, jr1.a(qq1Var));
        fo2VarA2.f89652a.putAll(map);
        Map map2 = fo2VarA2.f89652a;
        c cVar = fo2VarA2.f89653b;
        String str2 = co2Var.f88557b;
        Map mapC = kotlin.collections.a.C(map2);
        eo2 eo2Var = new eo2(str2, mapC, cVar);
        ((iu3) this.f96838b).getClass();
        pu3 pu3Var = pu3.f93787a;
        cf.a(context, new cq3(((iu3) this.f96838b).f90998a)).a(eo2Var);
        new we(context).a(co2Var, mapC, str, qq1Var.f94116g);
    }

    public final void a(Context context, qq1 qq1Var, Map map) {
        a(context, co2.f88536f, qq1Var, null, map);
    }
}
