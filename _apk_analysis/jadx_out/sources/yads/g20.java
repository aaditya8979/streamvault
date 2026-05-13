package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g20 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b20 f89783a;

    public g20(b20 b20Var) {
        this.f89783a = b20Var;
    }

    @Override // yads.vj3
    public final Map a() {
        e20 e20Var = this.f89783a.f87884e;
        List listM = e20Var != null ? e20Var.f89071b : null;
        if (listM == null) {
            listM = cn.w.m();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listM) {
            String str = ((x73) obj).f96651a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(cn.p0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(cn.x.x(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((x73) it.next()).f96652b);
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }
}
