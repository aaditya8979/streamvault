package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kz2 implements c92 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f91812c = cn.w.p(qy2.f94219b, qy2.f94220c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f91813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f91814b;

    public kz2(e83 e83Var, e83 e83Var2) {
        this.f91813a = kotlin.collections.a.m(bn.h.a(qy2.f94219b, e83Var), bn.h.a(qy2.f94220c, e83Var2));
    }

    @Override // yads.c92
    public final void a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            qy2 qy2Var = ((h92) obj).f90306a.f88393d;
            Object arrayList = linkedHashMap.get(qy2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(qy2Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : cn.o0.b(linkedHashMap, jz2.f91433b).entrySet()) {
            qy2 qy2Var2 = (qy2) entry.getKey();
            List list2 = (List) entry.getValue();
            c92 c92Var = (c92) this.f91813a.get(qy2Var2);
            if (c92Var != null) {
                c92Var.a(list2);
            }
        }
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, List list, rb3 rb3Var) {
        if (!this.f91814b) {
            this.f91814b = true;
            List listP0 = cn.f0.P0(list, qy2Var);
            for (qy2 qy2Var2 : cn.f0.L0(f91812c, cn.f0.l1(listP0))) {
                a(qy2Var2, rb3Var);
                a(qy2Var2, listP0, rb3Var);
            }
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((qy2) it.next()) == qy2Var) {
                    return;
                }
            }
        }
        c92 c92Var = (c92) this.f91813a.get(qy2Var);
        if (c92Var != null) {
            c92Var.a(qy2Var, list, rb3Var);
        }
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, qb3 qb3Var) {
        c92 c92Var = (c92) this.f91813a.get(qy2Var);
        if (c92Var != null) {
            c92Var.a(qy2Var, qb3Var);
        }
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, rb3 rb3Var) {
        c92 c92Var = (c92) this.f91813a.get(qy2Var);
        if (c92Var != null) {
            c92Var.a(qy2Var, rb3Var);
        }
    }

    @Override // yads.c92
    public final void a(v9 v9Var) {
        Iterator it = this.f91813a.values().iterator();
        while (it.hasNext()) {
            ((c92) it.next()).a(v9Var);
        }
    }

    @Override // yads.c92
    public final void invalidate() {
        Iterator it = this.f91813a.values().iterator();
        while (it.hasNext()) {
            ((c92) it.next()).invalidate();
        }
    }
}
