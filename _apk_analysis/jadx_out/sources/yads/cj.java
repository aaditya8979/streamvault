package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f88467a;

    public cj(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Pair pairA = bn.h.a(oiVar.b(), oiVar.c());
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        this.f88467a = linkedHashMap;
    }
}
