package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Qc {
    public static final List a(Rc rc2) {
        ArrayList arrayList;
        tn.p.k(rc2, "<this>");
        C3567ll c3567ll = rc2.f26245a;
        if (c3567ll != null) {
            ArrayList arrayList2 = c3567ll.f27584b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (tn.p.f(((C3809ve) obj).f28365b, "click")) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList(cn.x.x(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3809ve) it.next()).f28364a);
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? cn.w.m() : arrayList;
    }
}
