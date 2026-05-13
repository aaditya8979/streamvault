package com.fyber.inneractive.sdk.protobuf;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes12.dex */
public final class p3 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator f19207a;

    public p3(r3 r3Var, int i10) {
        this.f19207a = r3Var.f19222a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f19207a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19207a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f19207a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19207a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f19207a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19207a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
