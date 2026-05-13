package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import yads.l12;
import yads.ny1;

/* JADX INFO: loaded from: classes12.dex */
public final class ny1 implements l22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f93049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h22 f93050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f93051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l12 f93052d;

    public ny1(List list, h22 h22Var) {
        this.f93049a = list;
        this.f93050b = h22Var;
    }

    public static final boolean a(ny1 ny1Var, l12 l12Var) {
        List list = ny1Var.f93049a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f93234f) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pi piVarA = l12Var.a((oi) it.next());
                if (piVarA != null && piVarA.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean b(ny1 ny1Var, l12 l12Var) {
        Object next;
        Iterator it = ny1Var.f93049a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            oi oiVar = (oi) next;
            if (oiVar.f93234f && tn.p.f(oiVar.f93229a, "sponsored")) {
                break;
            }
        }
        oi oiVar2 = (oi) next;
        if (oiVar2 == null) {
            return true;
        }
        pi piVarA = l12Var.a(oiVar2);
        return piVarA != null && piVarA.d();
    }

    public static final boolean c(ny1 ny1Var, l12 l12Var) {
        Object next;
        List list = ny1Var.f93049a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f93234f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            oi oiVar = (oi) next;
            pi piVarA = l12Var.a(oiVar);
            if (!(piVarA instanceof pi)) {
                piVarA = null;
            }
            if (piVarA == null || !piVarA.a(oiVar.f93231c)) {
                break;
            }
        }
        oi oiVar2 = (oi) next;
        ny1Var.f93051c = oiVar2 != null ? oiVar2.f93229a : null;
        return oiVar2 == null;
    }

    public static final boolean d(ny1 ny1Var, l12 l12Var) {
        Object next;
        List list = ny1Var.f93049a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f93234f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            pi piVarA = l12Var.a((oi) next);
            if (piVarA == null || !piVarA.e()) {
                break;
            }
        }
        oi oiVar = (oi) next;
        ny1Var.f93051c = oiVar != null ? oiVar.f93229a : null;
        return oiVar == null;
    }

    public static final boolean e(ny1 ny1Var, l12 l12Var) {
        Object next;
        List list = ny1Var.f93049a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f93234f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            pi piVarA = l12Var.a((oi) next);
            if (piVarA == null || !piVarA.b()) {
                break;
            }
        }
        oi oiVar = (oi) next;
        ny1Var.f93051c = oiVar != null ? oiVar.f93229a : null;
        return oiVar == null;
    }

    public final tb3 a(boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (b() && !z10) {
            arrayList.add(sb3.f94768d);
        }
        List list = this.f93049a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            int i10 = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((oi) it.next()).f93234f && (i10 = i10 + 1) < 0) {
                    cn.w.v();
                }
            }
            if (i10 >= 2 && a() && !z10) {
                arrayList.add(sb3.f94769e);
            }
        }
        if (c()) {
            arrayList.add(sb3.f94767c);
        }
        return (!d() || z10) ? new rb3(arrayList) : new qb3(pb3.f93523f, this.f93051c, null);
    }

    public final boolean a() {
        return !a(new k22() { // from class: bt.a7
            @Override // yads.k22
            public final boolean a(l12 l12Var) {
                return ny1.a(this.f5939a, l12Var);
            }
        });
    }

    public final boolean a(k22 k22Var) {
        l12 l12Var = this.f93052d;
        if (l12Var == null) {
            return false;
        }
        this.f93050b.getClass();
        return k22Var.a(l12Var);
    }

    public final boolean b() {
        return !a(new k22() { // from class: bt.c7
            @Override // yads.k22
            public final boolean a(l12 l12Var) {
                return ny1.b(this.f5972a, l12Var);
            }
        });
    }

    public final boolean c() {
        return !a(new k22() { // from class: bt.z6
            @Override // yads.k22
            public final boolean a(l12 l12Var) {
                return ny1.c(this.f6445a, l12Var);
            }
        });
    }

    public final boolean d() {
        return !a(new k22() { // from class: bt.d7
            @Override // yads.k22
            public final boolean a(l12 l12Var) {
                return ny1.d(this.f5993a, l12Var);
            }
        });
    }

    public final kp2 e() {
        return new kp2(this.f93051c, a(new k22() { // from class: bt.b7
            @Override // yads.k22
            public final boolean a(l12 l12Var) {
                return ny1.e(this.f5955a, l12Var);
            }
        }));
    }
}
