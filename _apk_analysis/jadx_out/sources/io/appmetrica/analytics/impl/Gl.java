package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class Gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Il f65296a;

    public Gl(Il il2) {
        this.f65296a = il2;
    }

    public final void a(String str, Kl kl2, C4817gm c4817gm) {
        ArrayList arrayList;
        synchronized (this.f65296a.f65377b) {
            Collection collection = (Collection) this.f65296a.f65376a.f67572a.get(str);
            arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Rl) it.next()).a(kl2, c4817gm);
        }
    }
}
