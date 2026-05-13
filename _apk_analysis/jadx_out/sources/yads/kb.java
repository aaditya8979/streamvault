package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kb {
    public static List a(y90 y90Var) {
        List listC = cn.v.c();
        listC.add(v90.f96016a);
        listC.add(new w90("Info"));
        if (y90Var.f() == c50.f88348c && y90Var.a() != null) {
            String strD = y90Var.d();
            listC.add(new x90((strD == null || bo.d0.u0(strD)) ? "ID" : y90Var.d(), y90Var.a()));
        }
        listC.add(new x90("Type", y90Var.f().a()));
        List<d80> listE = y90Var.e();
        if (listE != null) {
            for (d80 d80Var : listE) {
                listC.add(new x90(d80Var.a(), d80Var.b()));
            }
        }
        List listB = y90Var.b();
        if (listB != null && !listB.isEmpty()) {
            listC.add(v90.f96016a);
            listC.add(new w90("CPM floors"));
            String strD2 = y90Var.d();
            String str = (strD2 == null || bo.d0.u0(strD2)) ? "" : y90Var.d() + ": ";
            for (ha0 ha0Var : y90Var.b()) {
                listC.add(new x90(str + ha0Var.b(), "cpm: " + ha0Var.a()));
            }
        }
        return cn.v.a(listC);
    }
}
