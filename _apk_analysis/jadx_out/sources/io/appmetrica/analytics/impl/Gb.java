package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class Gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P2 f65277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4823h2 f65278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f65279c;

    public Gb(P2 p22, C4823h2 c4823h2) {
        ArrayList arrayList = new ArrayList();
        this.f65279c = arrayList;
        this.f65277a = p22;
        arrayList.add(p22);
        this.f65278b = c4823h2;
        arrayList.add(c4823h2);
    }

    public final synchronized void a() {
        Iterator it = this.f65279c.iterator();
        while (it.hasNext()) {
            ((InterfaceC4969mk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C4984na c4984na) {
        this.f65279c.add(c4984na);
    }
}
