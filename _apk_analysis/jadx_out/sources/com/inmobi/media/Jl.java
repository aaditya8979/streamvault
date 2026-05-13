package com.inmobi.media;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Jl {
    public static final int a(String str) {
        tn.p.k(str, "<this>");
        try {
            List listU0 = bo.d0.U0(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER, "."}, false, 4, 2, null);
            int i10 = Integer.parseInt((String) listU0.get(0));
            int i11 = Integer.parseInt((String) listU0.get(1));
            return (((i11 * 60) + (i10 * 3600) + Integer.parseInt((String) listU0.get(2))) * 1000) + (listU0.size() == 4 ? Integer.parseInt((String) listU0.get(3)) : 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final List a(String str, ArrayList arrayList) {
        tn.p.k(str, "trackerType");
        if (arrayList == null) {
            return cn.w.m();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (tn.p.f(((C3809ve) obj).f28365b, str)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(cn.x.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C3809ve) it.next()).f28364a);
        }
        return arrayList3;
    }
}
