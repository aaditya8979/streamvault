package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5136td {
    public static ArrayList a() {
        C4705cd c4705cd;
        List<String> listA = C4696c4.l().f66463m.a();
        ArrayList arrayList = new ArrayList(cn.x.x(listA, 10));
        for (String str : listA) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor == null) {
                c4705cd = new C4705cd(str, false);
            } else {
                C4696c4.l().m().f66280b.add((ModuleClientEntryPoint) objLoadAndInstantiateClassWithDefaultConstructor);
                c4705cd = new C4705cd(str, true);
            }
            arrayList.add(c4705cd);
        }
        return arrayList;
    }
}
