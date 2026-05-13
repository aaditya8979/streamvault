package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class b51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu0 f87914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kj f87915b;

    public /* synthetic */ b51() {
        this(new nu0(), new kj());
    }

    public b51(nu0 nu0Var, kj kjVar) {
        this.f87914a = nu0Var;
        this.f87915b = kjVar;
    }

    public final Set a(List list) {
        Object next;
        List listM;
        m0 m0Var;
        List listM2;
        gi0 gi0Var;
        List list2;
        Object next2;
        this.f87915b.getClass();
        Set setK1 = cn.f0.k1(kj.a(list));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (tn.p.f(((oi) next).f93229a, "feedback")) {
                break;
            }
        }
        oi oiVar = (oi) next;
        this.f87914a.getClass();
        if ((oiVar != null ? oiVar.f93231c : null) instanceof qu0) {
            List listQ = cn.w.q(((qu0) oiVar.f93231c).f94153a);
            if1 if1Var = oiVar.f93232d;
            if (if1Var == null || (list2 = if1Var.f90802a) == null) {
                m0Var = null;
            } else {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (tn.p.f(((m0) next2).a(), "divkit_adtune")) {
                        break;
                    }
                }
                m0Var = (m0) next2;
            }
            rh0 rh0Var = m0Var instanceof rh0 ? (rh0) m0Var : null;
            if (rh0Var == null || (gi0Var = rh0Var.f94450b) == null || (listM2 = gi0Var.f89991d) == null) {
                listM2 = cn.w.m();
            }
            listM = cn.f0.O0(listQ, listM2);
        } else {
            listM = cn.w.m();
        }
        setK1.addAll(listM);
        return setK1;
    }
}
