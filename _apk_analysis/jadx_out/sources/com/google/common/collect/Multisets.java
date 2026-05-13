package com.google.common.collect;

import com.google.common.collect.Sets;
import com.google.common.collect.b2;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class Multisets {

    public static class ImmutableEntry<E> extends a<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        public ImmutableEntry(E e10, int i10) {
            this.element = e10;
            this.count = i10;
            j1.b(i10, "count");
        }

        @Override // com.google.common.collect.b2.a
        public final int getCount() {
            return this.count;
        }

        @Override // com.google.common.collect.b2.a
        public final E getElement() {
            return this.element;
        }

        public ImmutableEntry<E> nextInBucket() {
            return null;
        }
    }

    public static abstract class a<E> implements b2.a<E> {
        public boolean equals(Object obj) {
            if (!(obj instanceof b2.a)) {
                return false;
            }
            b2.a aVar = (b2.a) obj;
            return getCount() == aVar.getCount() && y7.i.a(getElement(), aVar.getElement());
        }

        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    public static abstract class b<E> extends Sets.d<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return e().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return e().containsAll(collection);
        }

        public abstract b2<E> e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return e().remove(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().entrySet().size();
        }
    }

    public static abstract class c<E> extends Sets.d<b2.a<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof b2.a)) {
                return false;
            }
            b2.a aVar = (b2.a) obj;
            return aVar.getCount() > 0 && e().count(aVar.getElement()) == aVar.getCount();
        }

        public abstract b2<E> e();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof b2.a) {
                b2.a aVar = (b2.a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return e().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    public static final class d<E> implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b2<E> f23299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<b2.a<E>> f23300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b2.a<E> f23301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f23303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f23304g;

        public d(b2<E> b2Var, Iterator<b2.a<E>> it) {
            this.f23299b = b2Var;
            this.f23300c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23302e > 0 || this.f23300c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f23302e == 0) {
                b2.a<E> next = this.f23300c.next();
                this.f23301d = next;
                int count = next.getCount();
                this.f23302e = count;
                this.f23303f = count;
            }
            this.f23302e--;
            this.f23304g = true;
            b2.a<E> aVar = this.f23301d;
            Objects.requireNonNull(aVar);
            return aVar.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            j1.e(this.f23304g);
            if (this.f23303f == 1) {
                this.f23300c.remove();
            } else {
                b2<E> b2Var = this.f23299b;
                b2.a<E> aVar = this.f23301d;
                Objects.requireNonNull(aVar);
                b2Var.remove(aVar.getElement());
            }
            this.f23303f--;
            this.f23304g = false;
        }
    }

    public static <E> boolean a(b2<E> b2Var, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.addTo(b2Var);
        return true;
    }

    public static <E> boolean b(b2<E> b2Var, b2<? extends E> b2Var2) {
        if (b2Var2 instanceof AbstractMapBasedMultiset) {
            return a(b2Var, (AbstractMapBasedMultiset) b2Var2);
        }
        if (b2Var2.isEmpty()) {
            return false;
        }
        for (b2.a<? extends E> aVar : b2Var2.entrySet()) {
            b2Var.add(aVar.getElement(), aVar.getCount());
        }
        return true;
    }

    public static <E> boolean c(b2<E> b2Var, Collection<? extends E> collection) {
        y7.l.m(b2Var);
        y7.l.m(collection);
        if (collection instanceof b2) {
            return b(b2Var, d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.a(b2Var, collection.iterator());
    }

    public static <T> b2<T> d(Iterable<T> iterable) {
        return (b2) iterable;
    }

    public static boolean e(b2<?> b2Var, Object obj) {
        if (obj == b2Var) {
            return true;
        }
        if (obj instanceof b2) {
            b2 b2Var2 = (b2) obj;
            if (b2Var.size() == b2Var2.size() && b2Var.entrySet().size() == b2Var2.entrySet().size()) {
                for (b2.a aVar : b2Var2.entrySet()) {
                    if (b2Var.count(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> b2.a<E> f(E e10, int i10) {
        return new ImmutableEntry(e10, i10);
    }

    public static int g(Iterable<?> iterable) {
        if (iterable instanceof b2) {
            return ((b2) iterable).elementSet().size();
        }
        return 11;
    }

    public static <E> Iterator<E> h(b2<E> b2Var) {
        return new d(b2Var, b2Var.entrySet().iterator());
    }

    public static boolean i(b2<?> b2Var, Collection<?> collection) {
        if (collection instanceof b2) {
            collection = ((b2) collection).elementSet();
        }
        return b2Var.elementSet().removeAll(collection);
    }

    public static boolean j(b2<?> b2Var, Collection<?> collection) {
        y7.l.m(collection);
        if (collection instanceof b2) {
            collection = ((b2) collection).elementSet();
        }
        return b2Var.elementSet().retainAll(collection);
    }

    public static <E> int k(b2<E> b2Var, E e10, int i10) {
        j1.b(i10, "count");
        int iCount = b2Var.count(e10);
        int i11 = i10 - iCount;
        if (i11 > 0) {
            b2Var.add(e10, i11);
        } else if (i11 < 0) {
            b2Var.remove(e10, -i11);
        }
        return iCount;
    }

    public static <E> boolean l(b2<E> b2Var, E e10, int i10, int i11) {
        j1.b(i10, "oldCount");
        j1.b(i11, "newCount");
        if (b2Var.count(e10) != i10) {
            return false;
        }
        b2Var.setCount(e10, i11);
        return true;
    }
}
