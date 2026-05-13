package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5059qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f67572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67573b;

    public C5059qa() {
        this(false);
    }

    public C5059qa(boolean z10) {
        this.f67572a = new HashMap();
        this.f67573b = z10;
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f67572a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f67572a.toString();
    }
}
