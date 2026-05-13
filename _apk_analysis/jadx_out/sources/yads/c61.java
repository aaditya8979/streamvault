package yads;

import android.content.Context;
import com.ironsource.Q6;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class c61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v9 f88359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f88360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j5 f88361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io2 f88362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nt2 f88363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sx f88364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final we f88365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i22 f88366h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c61(Context context, v9 v9Var, d4 d4Var, lu2 lu2Var, j5 j5Var) {
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f93787a;
        at1 at1VarA = cf.a(context, iu3Var.b());
        Object obj = dw2.f89000j;
        this(v9Var, d4Var, j5Var, at1VarA, cw2.a().a(context), new sx(), new we(context));
    }

    public c61(v9 v9Var, d4 d4Var, j5 j5Var, io2 io2Var, nt2 nt2Var, sx sxVar, we weVar) {
        this.f88359a = v9Var;
        this.f88360b = d4Var;
        this.f88361c = j5Var;
        this.f88362d = io2Var;
        this.f88363e = nt2Var;
        this.f88364f = sxVar;
        this.f88365g = weVar;
    }

    public final fo2 a() {
        fo2 fo2VarA = this.f88364f.a(this.f88359a, this.f88360b);
        fo2VarA.b(bo2.f88105a, Q6.G1);
        a03 a03Var = this.f88360b.f88743d.f87866a;
        if (a03Var != null) {
            fo2VarA.b(a03Var.b().f97849b, "size_type");
            fo2VarA.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2VarA.b(Integer.valueOf(a03Var.getHeight()), "height");
        }
        nt2 nt2Var = this.f88363e;
        if (nt2Var != null) {
            fo2VarA.b(nt2Var.O, "banner_size_calculation_type");
        }
        i22 i22Var = this.f88366h;
        return i22Var != null ? go2.a(fo2VarA, i22Var.a()) : fo2VarA;
    }

    public final fo2 a(qb3 qb3Var) {
        fo2 fo2VarA = a();
        fo2VarA.b(qb3Var.f93979a.f93528b, "reason");
        String str = qb3Var.f93980b;
        if (str != null && str.length() > 0) {
            fo2VarA.b(str, "asset_name");
        }
        String str2 = qb3Var.f93981c;
        if (str2 != null && str2.length() > 0) {
            fo2VarA.b(str2, UnifiedMediationParams.KEY_DESCRIPTION);
        }
        return fo2VarA;
    }

    public final void a(co2 co2Var, fo2 fo2Var) {
        Map map = fo2Var.f89652a;
        c cVar = fo2Var.f89653b;
        String str = co2Var.f88557b;
        Map mapC = kotlin.collections.a.C(map);
        this.f88362d.a(new eo2(str, mapC, cVar));
        this.f88365g.a(co2Var, mapC, bo2.f88105a, this.f88361c);
    }
}
