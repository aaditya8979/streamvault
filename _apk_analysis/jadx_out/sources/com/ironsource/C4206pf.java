package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4206pf extends K4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4206pf(@NotNull AbstractC4309w0 abstractC4309w0, @NotNull yg ygVar) {
        super(abstractC4309w0, ygVar);
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(ygVar, "waterfallInstances");
    }

    private final int a(yg ygVar) {
        Integer num;
        List<A> listB = ygVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((A) obj).w()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(b((A) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(b((A) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    private final int b(A a10) {
        return a10.h().l();
    }

    @Override // com.ironsource.G
    public boolean a(@NotNull A a10, @NotNull yg ygVar) {
        tn.p.k(a10, C4157n2.f33007p);
        tn.p.k(ygVar, "waterfallInstances");
        return a(ygVar) < b(a10);
    }
}
