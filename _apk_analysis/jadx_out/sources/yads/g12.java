package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz1 f89766a;

    public /* synthetic */ g12() {
        this(new pz1());
    }

    public g12(pz1 pz1Var) {
        this.f89766a = pz1Var;
    }

    public static ArrayList b(d12 d12Var) {
        List list = d12Var.f88690a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((fy1) it.next()).f89728c;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List a(d12 d12Var) {
        List<fy1> list = d12Var.f88690a;
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        for (fy1 fy1Var : list) {
            kj kjVar = this.f89766a.f93841a;
            List list2 = fy1Var.f89727b;
            kjVar.getClass();
            Set setA = kj.a(list2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = setA.iterator();
            while (it.hasNext()) {
                String str = ((u41) it.next()).f95550d;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            arrayList.add(cn.f0.g1(arrayList3));
        }
        return cn.x.z(arrayList);
    }
}
