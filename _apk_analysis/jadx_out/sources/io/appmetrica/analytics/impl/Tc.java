package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f65935a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f65935a;
        ArrayList arrayList3 = new ArrayList(cn.x.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Sc) it.next()).a());
        }
        arrayList = new ArrayList();
        for (Object obj : arrayList3) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return cn.f0.k0(arrayList);
    }

    public final synchronized void a(Sc... scArr) {
        cn.b0.G(this.f65935a, scArr);
    }
}
