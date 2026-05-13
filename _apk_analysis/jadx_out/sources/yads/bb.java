package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class bb {
    public static String a(ab abVar) {
        ArrayList arrayList = new ArrayList();
        if (!bo.d0.u0(abVar.a())) {
            arrayList.add(abVar.a());
        }
        if (!bo.d0.u0(abVar.b())) {
            arrayList.add("erid: " + abVar.b());
        }
        return cn.f0.D0(arrayList, " · ", null, null, 0, null, null, 62, null);
    }
}
