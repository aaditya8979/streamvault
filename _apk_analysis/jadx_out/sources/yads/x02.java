package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public abstract class x02 {
    public static Set a(w02 w02Var, xh0 xh0Var) {
        List listD = w02Var.d();
        if (listD != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                cn.b0.F(arrayList, ((gi0) it.next()).f89994g);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                wh0 wh0Var = (wh0) obj;
                if (xh0Var == null || wh0Var.f96392a == xh0Var) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(cn.x.x(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((wh0) it2.next()).f96393b);
            }
            Set setL1 = cn.f0.l1(arrayList3);
            if (setL1 != null) {
                return setL1;
            }
        }
        return cn.w0.f();
    }
}
