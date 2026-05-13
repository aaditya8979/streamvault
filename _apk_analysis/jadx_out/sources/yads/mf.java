package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f92346a;

    public mf(Set set) {
        this.f92346a = set;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Iterator it = SequencesKt___SequencesKt.R(bo.d0.A0(((lf) obj).f91948c), 50).iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (bo.a0.W(bo.d0.s1(str).toString(), "at ", false, 2, null)) {
                        Set set = h33.f90233a;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                if (bo.d0.c0(str, (String) it2.next(), false, 2, null)) {
                                    arrayList.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(java.util.ArrayList r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r6.next()
            yads.lf r1 = (yads.lf) r1
            bn.g r2 = yads.sf.f94807a     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r1.f91948c     // Catch: java.lang.Throwable -> L43
            java.util.LinkedHashMap r2 = yads.sf.a(r2)     // Catch: java.lang.Throwable -> L43
            java.util.Set r3 = r2.keySet()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = cn.f0.u0(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Thread r3 = (java.lang.Thread) r3     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L2a
            goto L43
        L2a:
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.StackTraceElement[] r3 = (java.lang.StackTraceElement[]) r3     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L33
            goto L43
        L33:
            java.util.Set r4 = yads.h33.f90233a     // Catch: java.lang.Throwable -> L43
            java.util.Set r4 = r5.f92346a     // Catch: java.lang.Throwable -> L43
            boolean r3 = yads.h33.a(r3, r4)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L43
            yads.nb2 r3 = new yads.nb2     // Catch: java.lang.Throwable -> L43
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r3 = 0
        L44:
            if (r3 == 0) goto L9
            r0.add(r3)
            goto L9
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mf.a(java.util.ArrayList):java.util.ArrayList");
    }
}
