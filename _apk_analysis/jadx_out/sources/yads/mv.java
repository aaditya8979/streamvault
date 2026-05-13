package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class mv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f92579a = new w5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mc2 f92580b = new mc2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5 f92581c = v5.A;

    public final Long a() {
        List listG1;
        Object next;
        w5 w5Var = this.f92579a;
        synchronized (w5Var.f96286a) {
            listG1 = cn.f0.g1(w5Var.f96289d);
        }
        Iterator it = listG1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((u5) next).f95555a == this.f92581c) {
                break;
            }
        }
        u5 u5Var = (u5) next;
        if (u5Var == null) {
            return null;
        }
        Object obj = u5Var.f95556b.get("duration");
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }
}
