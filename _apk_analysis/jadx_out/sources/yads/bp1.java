package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bp1 extends ep1 {
    public bp1(d4 d4Var) {
        super(d4Var);
    }

    @Override // yads.ep1
    public final Map a(Context context) {
        Map mapC = kotlin.collections.a.C(super.a(context));
        a03 a03Var = this.f89344a.f88743d.f87866a;
        if (a03Var != null) {
            mapC.put("width", Integer.valueOf(a03Var.c(context)));
            mapC.put("height", Integer.valueOf(a03Var.a(context)));
        }
        return mapC;
    }
}
