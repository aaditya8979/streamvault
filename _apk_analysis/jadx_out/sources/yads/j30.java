package yads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j30 {
    public static hu a(p30 p30Var, int i10, lo2 lo2Var) {
        if (lo2Var.f92053e == null) {
            return null;
        }
        mx0 mx0Var = lo2Var.f92049a;
        String str = mx0Var.f92609l;
        ar arVar = new ar((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new sx0() : new zi1(), i10, mx0Var);
        try {
            pl2 pl2Var = (pl2) ni.a(lo2Var.f());
            pl2 pl2VarE = lo2Var.e();
            if (pl2VarE != null) {
                pl2 pl2VarA = pl2Var.a(pl2VarE, ((uo) lo2Var.f92050b.get(0)).f95730a);
                if (pl2VarA == null) {
                    new r61(p30Var, a(lo2Var, ((uo) lo2Var.f92050b.get(0)).f95730a, pl2Var, 0), lo2Var.f92049a, 0, null, arVar).a();
                } else {
                    pl2VarE = pl2VarA;
                }
                new r61(p30Var, a(lo2Var, ((uo) lo2Var.f92050b.get(0)).f95730a, pl2VarE, 0), lo2Var.f92049a, 0, null, arVar).a();
            }
            arVar.c();
            return arVar.b();
        } catch (Throwable th2) {
            arVar.c();
            throw th2;
        }
    }

    public static u30 a(lo2 lo2Var, String str, pl2 pl2Var, int i10) {
        t30 t30Var = new t30();
        t30Var.f95053a = pl2Var.a(str);
        t30Var.f95056d = pl2Var.f93636a;
        t30Var.f95057e = pl2Var.f93637b;
        String strC = lo2Var.c();
        if (strC == null) {
            strC = pl2Var.a(((uo) lo2Var.f92050b.get(0)).f95730a).toString();
        }
        return t30Var.a(strC).a(i10).a();
    }
}
