package yads;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class c12 implements fp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9 f88265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9 f88266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g12 f88267c;

    public /* synthetic */ c12() {
        this(new u42(), new g12());
    }

    public c12(u42 u42Var, g12 g12Var) {
        this.f88265a = new n9();
        this.f88266b = new x9(u42Var);
        this.f88267c = g12Var;
    }

    @Override // yads.fp2
    public final eo2 a(Object obj) {
        d4 d4Var = (d4) obj;
        fo2 fo2Var = new fo2(new HashMap(), 2);
        g9 g9Var = d4Var.f88744e;
        if (g9Var != null) {
            fo2Var = go2.a(fo2Var, this.f88265a.a(g9Var));
        }
        fo2Var.b(d4Var.f88742c.f90339a, "ad_unit_id");
        fo2Var.b(d4Var.f88740a.f89049b, "ad_type");
        a03 a03Var = d4Var.f88743d.f87866a;
        if (a03Var != null) {
            fo2Var.b(a03Var.b().f97849b, "size_type");
            fo2Var.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2Var.b(Integer.valueOf(a03Var.getHeight()), "height");
            fn fnVarA = a03Var.a();
            fo2Var.a(fnVarA != null ? fnVarA.f89634b : null, "banner_size_calculation_type");
        }
        fo2Var.b(Boolean.valueOf(d4Var.f88746g == qa3.f93965c), "is_passback");
        fo2Var.b(Boolean.valueOf(d4Var.f88752m), "image_loading_automatically");
        List list = d4Var.f88741b.f94199c;
        if (!list.isEmpty()) {
            fo2Var.b(list, "image_sizes");
        }
        co2 co2Var = co2.f88533c;
        return new eo2("ad_request", kotlin.collections.a.C(fo2Var.f89652a), fo2Var.f89653b);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    @Override // yads.fp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.eo2 a(yads.vp2 r5, int r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.c12.a(yads.vp2, int, java.lang.Object):yads.eo2");
    }
}
