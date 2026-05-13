package com.google.common.collect;

import com.google.common.collect.Multisets;
import com.google.common.collect.b2;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: AbstractMultiset.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d<E> extends AbstractCollection<E> implements b2<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set<E> f23385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Set<b2.a<E>> f23386c;

    /* JADX INFO: compiled from: AbstractMultiset.java */
    public class a extends Multisets.b<E> {
        public a() {
        }

        @Override // com.google.common.collect.Multisets.b
        public b2<E> e() {
            return d.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return d.this.elementIterator();
        }
    }

    /* JADX INFO: compiled from: AbstractMultiset.java */
    public class b extends Multisets.c<E> {
        public b() {
        }

        @Override // com.google.common.collect.Multisets.c
        public b2<E> e() {
            return d.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<b2.a<E>> iterator() {
            return d.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d.this.distinctElements();
        }
    }

    public int add(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e10) {
        add(e10, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.b2
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public Set<E> createElementSet() {
        return new a();
    }

    public Set<b2.a<E>> createEntrySet() {
        return new b();
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    public Set<E> elementSet() {
        Set<E> set = this.f23385b;
        if (set != null) {
            return set;
        }
        Set<E> setCreateElementSet = createElementSet();
        this.f23385b = setCreateElementSet;
        return setCreateElementSet;
    }

    public abstract Iterator<b2.a<E>> entryIterator();

    public Set<b2.a<E>> entrySet() {
        Set<b2.a<E>> set = this.f23386c;
        if (set != null) {
            return set;
        }
        Set<b2.a<E>> setCreateEntrySet = createEntrySet();
        this.f23386c = setCreateEntrySet;
        return setCreateEntrySet;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return Multisets.e(this, obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public int remove(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.b2
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.i(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.j(this, collection);
    }

    public int setCount(E e10, int i10) {
        return Multisets.k(this, e10, i10);
    }

    public boolean setCount(E e10, int i10, int i11) {
        return Multisets.l(this, e10, i10, i11);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
