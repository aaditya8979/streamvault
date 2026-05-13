package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f90233a = cn.w0.j(com.safedk.android.utils.g.f53151y, "yads", "com.monetization.ads", "com.yandex.div");

    public static boolean a(StackTraceElement stackTraceElement, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((bn0) obj).f88089a == cn0.f88508b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (bo.d0.c0(stackTraceElement.toString(), ((bn0) it.next()).f88090b, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cb, code lost:
    
        r6 = (java.lang.StackTraceElement) cn.r.d0(r11, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r6 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d3, code lost:
    
        r6 = r6.getClassName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        if (r6 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0083, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.StackTraceElement[] r11, java.util.Set r12) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h33.a(java.lang.StackTraceElement[], java.util.Set):boolean");
    }
}
