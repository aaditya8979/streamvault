package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class nr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final or1 f92913a;

    public nr1(or1 or1Var) {
        this.f92913a = or1Var;
    }

    public final ArrayList a(List list) {
        hr1 hr1Var;
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g80 g80Var = (g80) it.next();
            List<String> list2 = g80Var.f89870e;
            ArrayList arrayList2 = new ArrayList(cn.x.x(list2, 10));
            for (String str : list2) {
                List listT0 = bo.d0.T0(str, new char[]{'.'}, false, 0, 6, null);
                String str2 = (String) cn.f0.w0(listT0, cn.w.o(listT0) - 1);
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new oq1(str2, str));
            }
            String str3 = g80Var.f89867b;
            String str4 = g80Var.f89866a;
            if (str4 != null) {
                hr1.f90489c.getClass();
                hr1Var = (hr1) hr1.f90490d.get(str4);
                if (hr1Var == null) {
                    hr1Var = hr1.f90510x;
                }
            } else {
                hr1Var = hr1.f90510x;
            }
            arrayList.add(new pq1(str3, hr1Var, arrayList2));
        }
        return this.f92913a.a(arrayList);
    }
}
