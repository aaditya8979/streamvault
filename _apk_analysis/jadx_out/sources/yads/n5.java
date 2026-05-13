package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f92740a = "yandex_ad_info";

    public static String a(de3 de3Var) {
        Object next;
        Iterator it = de3Var.f88838a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (tn.p.f(((hq0) next).f90482a, f92740a)) {
                break;
            }
        }
        hq0 hq0Var = (hq0) next;
        if (hq0Var != null) {
            return hq0Var.f90483b;
        }
        return null;
    }
}
