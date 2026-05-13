package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f95667a;

    public ui(List list, x3 x3Var, l12 l12Var, kn2 kn2Var, x51 x51Var, if1 if1Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            String strB = oiVar.b();
            if1 if1VarA = oiVar.a();
            Pair pairA = bn.h.a(strB, iv.a(x51Var, kn2Var, x3Var, l12Var, oiVar, if1VarA == null ? if1Var : if1VarA));
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        this.f95667a = linkedHashMap;
    }
}
