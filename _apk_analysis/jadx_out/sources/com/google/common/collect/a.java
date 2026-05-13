package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIndexedListIterator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<E> extends s2<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23374c;

    public a(int i10) {
        this(i10, 0);
    }

    public a(int i10, int i11) {
        y7.l.o(i11, i10);
        this.f23373b = i10;
        this.f23374c = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23374c < this.f23373b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23374c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23374c;
        this.f23374c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23374c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23374c - 1;
        this.f23374c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23374c - 1;
    }
}
