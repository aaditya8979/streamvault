package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kj {
    public static Set a(List list) {
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oi) it.next()).f93231c);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            List listE = obj instanceof u41 ? cn.v.e(obj) : obj instanceof on1 ? ((on1) obj).f93293c : null;
            if (listE != null) {
                arrayList2.add(listE);
            }
        }
        return cn.f0.l1(cn.x.z(arrayList2));
    }
}
