package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d00 {
    public static e00 a(String str) {
        Object next;
        Iterator<E> it = e00.f89048l.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (tn.p.f(((e00) next).f89049b, str)) {
                break;
            }
        }
        return (e00) next;
    }
}
