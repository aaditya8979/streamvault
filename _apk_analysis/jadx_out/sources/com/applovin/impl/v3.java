package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f10541a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(y2 y2Var);
    }

    public void a(a aVar) {
        this.f10541a.add(aVar);
    }

    public void a(y2 y2Var) {
        Iterator it = new ArrayList(this.f10541a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(y2Var);
        }
    }

    public void b(a aVar) {
        this.f10541a.remove(aVar);
    }
}
