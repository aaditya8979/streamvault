package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr1 f95949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nr1 f95950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j50 f95951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kr1 f95952d;

    public v50(cr1 cr1Var, nr1 nr1Var, j50 j50Var, kr1 kr1Var) {
        this.f95949a = cr1Var;
        this.f95950b = nr1Var;
        this.f95951c = j50Var;
        this.f95952d = kr1Var;
    }

    public final u50 a(b80 b80Var, j80 j80Var) {
        List listM;
        List listM2;
        List listM3;
        h50 h50Var;
        Object next;
        a50 y40Var;
        if (j80Var == null || (listM = j80Var.f91125g) == null) {
            listM = cn.w.m();
        }
        m50 m50Var = b80Var.f87940a;
        t80 t80Var = b80Var.f87941b;
        b40 b40Var = new b40(j80Var != null ? j80Var.f91119a : null, j80Var != null ? j80Var.f91122d : null, j80Var != null ? j80Var.f91121c : null);
        List<br1> list = b80Var.f87942c;
        ArrayList arrayListA = this.f95950b.a(listM);
        if (!arrayListA.isEmpty()) {
            list = arrayListA;
        }
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        for (br1 br1Var : list) {
            Iterator it = listM.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (tn.p.f(((g80) next).f89867b, br1Var.f88115a)) {
                    break;
                }
            }
            g80 g80Var = (g80) next;
            this.f95949a.getClass();
            boolean zA = cr1.a(br1Var);
            this.f95952d.getClass();
            List list2 = br1Var.f88118d;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                y40Var = x40.f96628a;
            } else {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (!((ar1) it2.next()).f87791c) {
                        List list3 = br1Var.f88118d;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            y40Var = z40.f97389a;
                        } else {
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                if (!(!((ar1) it3.next()).f87791c)) {
                                    dr1 dr1Var = dr1.f88961b;
                                    y40Var = new y40();
                                    break;
                                }
                            }
                            y40Var = z40.f97389a;
                        }
                    }
                }
                y40Var = x40.f96628a;
            }
            a50 a50Var = y40Var;
            String str = br1Var.f88115a;
            String str2 = g80Var != null ? g80Var.f89868c : null;
            ar1 ar1Var = (ar1) cn.f0.v0(br1Var.f88118d);
            String str3 = ar1Var != null ? ar1Var.f87790b : null;
            String str4 = g80Var != null ? g80Var.f89871f : null;
            String str5 = br1Var.f88117c;
            List list4 = br1Var.f88118d;
            ArrayList arrayList2 = new ArrayList(cn.x.x(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((ar1) it4.next()).f87789a);
            }
            arrayList.add(new b50(str, str2, zA, str3, str4, str5, a50Var, arrayList2));
        }
        d50 d50Var = new d50(arrayList);
        t50 t50Var = b80Var.f87943d;
        u70 u70Var = b80Var.f87944e;
        if (j80Var == null || (listM2 = j80Var.f91124f) == null) {
            listM2 = cn.w.m();
        }
        List list5 = listM2;
        j50 j50Var = this.f95951c;
        List list6 = j80Var != null ? j80Var.f91123e : null;
        j50Var.getClass();
        if (list6 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list6) {
                g50 g50Var = (g50) obj;
                if (g50Var.f89814a != null || g50Var.f89815b != null) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(cn.x.x(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                g50 g50Var2 = (g50) it5.next();
                String str6 = g50Var2.f89814a;
                String str7 = g50Var2.f89815b;
                h50[] h50VarArrValues = h50.values();
                int length = h50VarArrValues.length;
                Iterator it6 = it5;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        h50Var = null;
                        break;
                    }
                    int i11 = length;
                    h50Var = h50VarArrValues[i10];
                    h50[] h50VarArr = h50VarArrValues;
                    g50 g50Var3 = g50Var2;
                    if (tn.p.f(g50Var2.f89816c, h50Var.f90250b)) {
                        break;
                    }
                    i10++;
                    h50VarArrValues = h50VarArr;
                    length = i11;
                    g50Var2 = g50Var3;
                }
                if (h50Var == null) {
                    h50Var = h50.f90248c;
                }
                arrayList4.add(new i50(str6, str7, h50Var));
                it5 = it6;
            }
            listM3 = arrayList4;
        } else {
            listM3 = cn.w.m();
        }
        return new u50(m50Var, t80Var, b40Var, d50Var, t50Var, u70Var, list5, listM3);
    }
}
