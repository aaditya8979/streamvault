package com.google.common.collect;

import com.google.common.base.Predicates;
import com.google.common.collect.k1;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes7.dex */
public final class Sets {

    public static final class UnmodifiableNavigableSet<E> extends u1<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient UnmodifiableNavigableSet<E> f23336c;
        private final NavigableSet<E> delegate;
        private final SortedSet<E> unmodifiableDelegate;

        public UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) y7.l.m(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e10) {
            return this.delegate.ceiling(e10);
        }

        @Override // com.google.common.collect.u1, com.google.common.collect.s1, com.google.common.collect.o1, com.google.common.collect.r1
        /* JADX INFO: renamed from: delegate */
        public SortedSet<E> g() {
            return this.unmodifiableDelegate;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.y(this.delegate.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.f23336c;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.f23336c = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.f23336c = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public E floor(E e10) {
            return this.delegate.floor(e10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e10, boolean z10) {
            return Sets.k(this.delegate.headSet(e10, z10));
        }

        @Override // java.util.NavigableSet
        public E higher(E e10) {
            return this.delegate.higher(e10);
        }

        @Override // java.util.NavigableSet
        public E lower(E e10) {
            return this.delegate.lower(e10);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
            return Sets.k(this.delegate.subSet(e10, z10, e11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e10, boolean z10) {
            return Sets.k(this.delegate.tailSet(e10, z10));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class a<E> extends e<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f23337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Set f23338c;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$a$a, reason: collision with other inner class name */
        public class C0317a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator<E> f23339d;

            public C0317a() {
                this.f23339d = a.this.f23337b.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            public E a() {
                while (this.f23339d.hasNext()) {
                    E next = this.f23339d.next();
                    if (a.this.f23338c.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f23337b = set;
            this.f23338c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f23337b.contains(obj) && this.f23338c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f23337b.containsAll(collection) && this.f23338c.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public r2<E> iterator() {
            return new C0317a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f23338c, this.f23337b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f23337b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f23338c.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    public static class b<E> extends k1.a<E> implements Set<E> {
        public b(Set<E> set, y7.m<? super E> mVar) {
            super(set, mVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.d(this);
        }
    }

    public static class c<E> extends b<E> implements SortedSet<E> {
        public c(SortedSet<E> sortedSet, y7.m<? super E> mVar) {
            super(sortedSet, mVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f23417b).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) Iterators.k(this.f23417b.iterator(), this.f23418c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new c(((SortedSet) this.f23417b).headSet(e10), this.f23418c);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f23417b;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f23418c.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new c(((SortedSet) this.f23417b).subSet(e10, e11), this.f23418c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new c(((SortedSet) this.f23417b).tailSet(e10), this.f23418c);
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) y7.l.m(collection));
        }
    }

    public static abstract class e<E> extends AbstractSet<E> {
        public e() {
        }

        public /* synthetic */ e(l2 l2Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, y7.m<? super E> mVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, mVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) y7.l.m(set), (y7.m) y7.l.m(mVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f23417b, Predicates.b(bVar.f23418c, mVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, y7.m<? super E> mVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) y7.l.m(sortedSet), (y7.m) y7.l.m(mVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f23417b, Predicates.b(bVar.f23418c, mVar));
    }

    public static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        y7.l.n(set, "set1");
        y7.l.n(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(Maps.a(i10));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(Maps.k());
    }

    public static boolean i(Set<?> set, Collection<?> collection) {
        y7.l.m(collection);
        if (collection instanceof b2) {
            collection = ((b2) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : Iterators.s(set.iterator(), collection);
    }

    public static boolean j(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static <E> NavigableSet<E> k(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }
}
