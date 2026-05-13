package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cr1 {
    public static boolean a(br1 br1Var) {
        List list = br1Var.f88118d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((ar1) it.next()).f87791c) {
                    return false;
                }
            }
        }
        return true;
    }
}
