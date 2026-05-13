package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g4 {
    public static h4 a(e82 e82Var) {
        m4 m4Var;
        int i10 = e82Var != null ? e82Var.f89157a : -1;
        boolean z10 = ad1.f87661a;
        if (204 == i10) {
            m4Var = m4.f92242d;
        } else {
            Map map = e82Var != null ? e82Var.f89159c : null;
            Integer numValueOf = e82Var != null ? Integer.valueOf(e82Var.f89157a) : null;
            m4Var = (numValueOf != null && 400 == numValueOf.intValue() && map != null && t01.b(map, u11.N)) ? m4.f92246h : 403 == i10 ? m4.f92245g : 404 == i10 ? m4.f92240b : (500 > i10 || i10 > 599) ? -1 == i10 ? m4.f92250l : m4.f92243e : m4.f92244f;
        }
        return new h4(m4Var, e82Var);
    }
}
