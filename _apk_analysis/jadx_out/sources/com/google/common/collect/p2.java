package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: TransformedIterator.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p2<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<? extends F> f23432b;

    public p2(Iterator<? extends F> it) {
        this.f23432b = (Iterator) y7.l.m(it);
    }

    public abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23432b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f23432b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f23432b.remove();
    }
}
