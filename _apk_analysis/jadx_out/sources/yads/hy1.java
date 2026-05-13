package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final at1 f90594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij f90595b;

    public hy1(Context context, lu2 lu2Var, o5 o5Var, e00 e00Var, String str) {
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f93787a;
        this.f90594a = cf.a(context, iu3Var.b());
        this.f90595b = new ij(o5Var, e00Var, str);
    }

    public final void a(ArrayList arrayList, co2 co2Var) {
        fo2 fo2VarA = this.f90595b.a();
        fo2VarA.b(arrayList, "assets");
        Map map = fo2VarA.f89652a;
        this.f90594a.a(new eo2(co2Var.f88557b, kotlin.collections.a.C(map), fo2VarA.f89653b));
    }
}
