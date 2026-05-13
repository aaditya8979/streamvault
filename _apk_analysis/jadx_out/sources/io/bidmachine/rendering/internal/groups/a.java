package io.bidmachine.rendering.internal.groups;

import bn.r;
import bo.a0;
import bo.d0;
import cn.x;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f70432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f70433b;

    public a(List list) {
        p.k(list, "initial");
        this.f70432a = list;
        this.f70433b = new HashSet(list);
    }

    private final void b(String str) {
        if (this.f70433b.contains(str)) {
            return;
        }
        this.f70433b.add(str);
    }

    private final void c(String str) {
        if (a0.W(str, C3978d4.j.f31381c, false, 2, null)) {
            String strSubstring = str.substring(1);
            p.j(strSubstring, "this as java.lang.String).substring(startIndex)");
            b(strSubstring);
        } else if (a0.W(str, "!", false, 2, null)) {
            String strSubstring2 = str.substring(1);
            p.j(strSubstring2, "this as java.lang.String).substring(startIndex)");
            e(strSubstring2);
        }
    }

    private final void e(String str) {
        if (p.f(str, "default")) {
            return;
        }
        this.f70433b.remove(str);
    }

    @Override // io.bidmachine.rendering.internal.groups.b
    public void a(String str) {
        p.k(str, "stateGroups");
        synchronized (this.f70433b) {
            List listU0 = d0.U0(str, new String[]{Z7.f30794r}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(x.x(listU0, 10));
            Iterator it = listU0.iterator();
            while (it.hasNext()) {
                arrayList.add(d0.s1((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!d0.u0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c((String) it2.next());
            }
            r rVar = r.f5635a;
        }
    }

    @Override // io.bidmachine.rendering.internal.groups.b
    public boolean a(List list) {
        boolean z10;
        p.k(list, "stateGroups");
        synchronized (this.f70433b) {
            if (list.isEmpty()) {
                z10 = true;
                break;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (d((String) it.next())) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "stateGroup"
            tn.p.k(r3, r0)
            java.util.HashSet r0 = r2.f70433b
            monitor-enter(r0)
            java.lang.String r1 = "default"
            boolean r1 = tn.p.f(r3, r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L1b
            java.util.HashSet r1 = r2.f70433b     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L19
            goto L1b
        L19:
            r3 = 0
            goto L1c
        L1b:
            r3 = 1
        L1c:
            monitor-exit(r0)
            return r3
        L1e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.rendering.internal.groups.a.d(java.lang.String):boolean");
    }
}
