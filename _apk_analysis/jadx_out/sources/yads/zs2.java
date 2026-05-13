package yads;

import android.content.Context;
import com.ironsource.Q6;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f97760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f97761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9 f97762c;

    public zs2(d4 d4Var, lu2 lu2Var) {
        n9 n9Var = new n9();
        new aq2();
        new n9();
        new wy();
        this(d4Var, lu2Var, n9Var);
    }

    public zs2(d4 d4Var, lu2 lu2Var, n9 n9Var) {
        this.f97760a = d4Var;
        this.f97761b = lu2Var;
        this.f97762c = n9Var;
    }

    public final void a(Context context, v9 v9Var, co2 co2Var, fo2 fo2Var) {
        fy1 fy1Var;
        cq2 cq2Var;
        fo2 fo2VarA = this.f97762c.a(this.f97760a.f88744e);
        fo2VarA.b(v9Var.f95994e, "ad_unit_id");
        String str = bo2.f88105a;
        fo2VarA.b(str, Q6.G1);
        e00 e00Var = v9Var.f95990a;
        fo2VarA.b(e00Var != null ? e00Var.f89049b : null, "ad_type");
        d12 d12Var = (d12) v9Var.f96009t;
        if (d12Var != null) {
            List list = d12Var.f88690a;
            String str2 = (list == null || (fy1Var = (fy1) cn.f0.v0(list)) == null || (cq2Var = fy1Var.f89726a) == null) ? null : cq2Var.f88588b;
            if (str2 == null) {
                str2 = "";
            }
            fo2VarA.b(str2, "native_ad_type");
        }
        fo2VarA.b(v9Var.f96001l, "ad_source");
        fo2 fo2VarA2 = go2.a(fo2VarA, fo2Var);
        Map map = fo2VarA2.f89652a;
        c cVar = fo2VarA2.f89653b;
        String str3 = co2Var.f88557b;
        Map mapC = kotlin.collections.a.C(map);
        eo2 eo2Var = new eo2(str3, mapC, cVar);
        ((iu3) this.f97761b).getClass();
        pu3 pu3Var = pu3.f93787a;
        cf.a(context, new cq3(((iu3) this.f97761b).f90998a)).a(eo2Var);
        new we(context).a(co2Var, mapC, str, null);
    }

    public final void a(Context context, v9 v9Var, d22 d22Var) {
        Map mapJ;
        fo2 fo2Var = new fo2((Map) null, 3);
        if (d22Var != null) {
            List list = d22Var.f88704a.f88741b.f94199c;
            List list2 = list.isEmpty() ^ true ? list : null;
            if (list2 == null || (mapJ = cn.p0.g(bn.h.a("image_sizes", cn.f0.g1(list2)))) == null) {
                mapJ = kotlin.collections.a.j();
            }
            fo2Var.f89652a.putAll(mapJ);
        }
        a(context, v9Var, co2.f88537g, fo2Var);
    }

    public final void a(Context context, v9 v9Var, e22 e22Var) {
        fo2 fo2Var = new fo2((Map) null, 3);
        do2 do2Var = do2.f88937c;
        fo2Var.b("success", "status");
        a(context, v9Var, co2.f88538h, fo2Var);
    }
}
