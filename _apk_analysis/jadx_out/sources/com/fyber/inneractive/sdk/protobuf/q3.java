package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class q3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f19215a;

    public q3(r3 r3Var) {
        this.f19215a = r3Var.f19222a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19215a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f19215a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
