package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class uo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sp1 f95734a;

    public uo1(sp1 sp1Var) {
        this.f95734a = sp1Var;
    }

    public final ArrayList a(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String strB = this.f95734a.b((qq1) obj);
            Object arrayList2 = linkedHashMap.get(strB);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(strB, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            qq1 qq1Var = ((String) entry.getKey()) != null ? (qq1) cn.f0.t0((List) entry.getValue()) : null;
            if (qq1Var != null) {
                arrayList3.add(qq1Var);
            }
        }
        return arrayList3;
    }
}
