package yads;

import android.content.Context;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class f83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f89516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f89517b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f83(Context context, d4 d4Var, lu2 lu2Var) {
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f93787a;
        this(d4Var, cf.a(context, iu3Var.b()));
    }

    public f83(d4 d4Var, io2 io2Var) {
        this.f89516a = d4Var;
        this.f89517b = io2Var;
    }

    public final void a(Map map, nt2 nt2Var) {
        co2 co2Var = co2.f88533c;
        if (nt2Var == null || !nt2Var.f92981w0) {
            return;
        }
        d4 d4Var = this.f89516a;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = bn.h.a("ad_type", d4Var.f88740a.f89049b);
        String str = d4Var.f88742c.f90339a;
        if (str == null) {
            str = "";
        }
        pairArr[1] = bn.h.a("ad_unit_id", str);
        this.f89517b.a(new eo2("tracking_event", kotlin.collections.a.C(kotlin.collections.a.q(kotlin.collections.a.m(pairArr), map)), null));
    }
}
