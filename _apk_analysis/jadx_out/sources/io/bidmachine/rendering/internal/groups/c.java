package io.bidmachine.rendering.internal.groups;

import cn.x;
import io.bidmachine.rendering.internal.event.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f70434a;

    public c(b bVar) {
        p.k(bVar, "stateGroupController");
        this.f70434a = bVar;
    }

    @Override // io.bidmachine.rendering.internal.event.e
    public boolean a(List list) {
        p.k(list, "params");
        if (list.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return !this.f70434a.a(arrayList);
    }
}
