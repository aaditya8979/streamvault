package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class pc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f93552a;

    public pc2(w5 w5Var) {
        this.f93552a = w5Var;
    }

    public final LinkedHashMap a(Set set) {
        List listG1;
        w5 w5Var = this.f93552a;
        synchronized (w5Var.f96286a) {
            listG1 = cn.f0.g1(w5Var.f96289d);
        }
        ao.i<u5> iVarZ = SequencesKt___SequencesKt.z(cn.f0.g0(listG1), new oc2(set));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (u5 u5Var : iVarZ) {
            String str = u5Var.f95555a.f95948b;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(u5Var.f95556b);
        }
        return linkedHashMap;
    }
}
