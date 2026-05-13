package yads;

import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr1 f95331a;

    public tr1(cr1 cr1Var) {
        this.f95331a = cr1Var;
    }

    public static void a(ArrayList arrayList, String str) {
        int iMax = Math.max(4, 44 - str.length());
        int i10 = iMax / 2;
        String strO = bo.a0.O("-", i10);
        String strO2 = bo.a0.O("-", (iMax % 2) + i10);
        String strO3 = bo.a0.O(Z7.f30794r, 1);
        arrayList.add(new sr1(strO + strO3 + str + strO3 + strO2, rr1.f94595b));
    }

    public static void a(ArrayList arrayList, String str, String str2) {
        if (str != null && !bo.d0.u0(str)) {
            arrayList.add(new sr1("SDK Version: " + str, rr1.f94595b));
        }
        if (str2 == null || bo.d0.u0(str2)) {
            return;
        }
        arrayList.add(new sr1("ADAPTERS Version: " + str2, rr1.f94595b));
    }

    public static void a(ArrayList arrayList, List list, String str, boolean z10) {
        rr1 rr1Var;
        String str2;
        String str3;
        if (z10) {
            rr1Var = rr1.f94595b;
            str2 = "ADAPTERS";
            str3 = "INTEGRATED SUCCESSFULLY";
        } else {
            rr1Var = rr1.f94596c;
            str2 = "MISSING ADAPTERS";
            str3 = "NOT INTEGRATED";
        }
        ArrayList arrayList2 = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ar1) it.next()).a());
        }
        arrayList.add(new sr1(cn.f0.D0(arrayList2, null, str2 + ": ", null, 0, null, null, 61, null), rr1Var));
        arrayList.add(new sr1(str + ": " + str3, rr1Var));
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            br1 br1Var = (br1) it.next();
            a(arrayList2, br1Var.f88115a);
            String str = br1Var.f88117c;
            String str2 = ((ar1) cn.f0.t0(br1Var.f88118d)).f87790b;
            this.f95331a.getClass();
            boolean zA = cr1.a(br1Var);
            if (zA) {
                a(arrayList2, str, str2);
            }
            a(arrayList2, br1Var.f88118d, br1Var.f88115a, zA);
        }
        return arrayList2;
    }
}
