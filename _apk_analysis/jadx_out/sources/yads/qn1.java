package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class qn1 {
    public static Set a(fy1 fy1Var) {
        List list = fy1Var.f89727b;
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oi) it.next()).f93231c);
        }
        return cn.f0.l1(cn.d0.c0(arrayList, on1.class));
    }
}
