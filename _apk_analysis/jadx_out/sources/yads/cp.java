package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class cp {
    public static fo2 a(dp dpVar) {
        e00 e00Var;
        fo2 fo2Var = new fo2((Map) null, 3);
        fo2Var.a((dpVar == null || (e00Var = dpVar.f88943a) == null) ? null : e00Var.f89049b, "ad_type");
        fo2Var.a(dpVar != null ? dpVar.f88945c : null, "parameters");
        a03 a03Var = dpVar != null ? dpVar.f88944b : null;
        if (a03Var != null) {
            fo2Var.b(a03Var.b().f97849b, "size_type");
            fo2Var.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2Var.b(Integer.valueOf(a03Var.getHeight()), "height");
        }
        return fo2Var;
    }
}
