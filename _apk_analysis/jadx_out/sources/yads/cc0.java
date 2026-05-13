package yads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cc0 {
    public static HashMap a(String str) {
        int[] iArrA = dc0.a(str);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        sm2 sm2Var = dc0.f88792n;
        map.put(2, (Long) sm2Var.get(iArrA[0]));
        map.put(3, (Long) dc0.f88793o.get(iArrA[1]));
        map.put(4, (Long) dc0.f88794p.get(iArrA[2]));
        map.put(5, (Long) dc0.f88795q.get(iArrA[3]));
        map.put(10, (Long) dc0.f88796r.get(iArrA[4]));
        map.put(9, (Long) dc0.f88797s.get(iArrA[5]));
        map.put(7, (Long) sm2Var.get(iArrA[0]));
        return map;
    }
}
