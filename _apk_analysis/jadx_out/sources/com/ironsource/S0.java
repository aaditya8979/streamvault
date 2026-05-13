package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class S0 extends com.ironsource.mediationsdk.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, K> f30364e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(@NotNull List<? extends NetworkSettings> list, int i10) {
        super(list, i10);
        tn.p.k(list, Ne.f29986y0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(list, 10)), 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pairA = bn.h.a(((NetworkSettings) it.next()).getProviderName(), new K(i10));
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        this.f30364e = linkedHashMap;
    }

    private final void a(Map<String, I> map) {
        for (Map.Entry<String, K> entry : this.f30364e.entrySet()) {
            entry.getValue().a(map.get(entry.getKey()));
        }
    }

    @Override // com.ironsource.mediationsdk.h
    @NotNull
    public String a(@NotNull String str) {
        String strD;
        tn.p.k(str, "instanceName");
        K k10 = this.f30364e.get(str);
        return (k10 == null || (strD = k10.d()) == null) ? "" : strD;
    }

    public final void a(@NotNull yg ygVar) {
        tn.p.k(ygVar, "waterfallInstances");
        List<A> listB = ygVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(listB, 10)), 16));
        for (A a10 : listB) {
            Pair pairA = bn.h.a(a10.p(), a10.s());
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        a(linkedHashMap);
    }
}
