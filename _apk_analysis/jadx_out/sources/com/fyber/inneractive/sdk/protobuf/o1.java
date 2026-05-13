package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class o1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f19202a;

    public o1(Iterator it) {
        this.f19202a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19202a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f19202a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19202a.remove();
    }
}
