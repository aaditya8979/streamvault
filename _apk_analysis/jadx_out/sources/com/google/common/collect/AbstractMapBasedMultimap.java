package com.google.common.collect;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.c;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractMapBasedMultimap<K, V> extends com.google.common.collect.c<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Map<K, Collection<V>> f23062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f23063h;

    public class a extends AbstractMapBasedMultimap<K, V>.d<V> {
        public a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.d
        public V a(K k10, V v10) {
            return v10;
        }
    }

    public class b extends AbstractMapBasedMultimap<K, V>.d<Map.Entry<K, V>> {
        public b(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k10, V v10) {
            return Maps.e(k10, v10);
        }
    }

    public class c extends Maps.j<K, Collection<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f23064d;

        public class a extends Maps.d<K, Collection<V>> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return k1.c(c.this.f23064d.entrySet(), obj);
            }

            @Override // com.google.common.collect.Maps.d
            public Map<K, Collection<V>> e() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // com.google.common.collect.Maps.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.c(entry.getKey());
                return true;
            }
        }

        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f23067b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Collection<V> f23068c;

            public b() {
                this.f23067b = c.this.f23064d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f23067b.next();
                this.f23068c = next.getValue();
                return c.this.f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f23067b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                y7.l.s(this.f23068c != null, "no calls to next() since the last call to remove()");
                this.f23067b.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, this.f23068c.size());
                this.f23068c.clear();
                this.f23068c = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            this.f23064d = map;
        }

        @Override // com.google.common.collect.Maps.j
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) Maps.n(this.f23064d, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.wrapCollection(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f23064d == AbstractMapBasedMultimap.this.f23062g) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.m(this.f23064d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f23064d.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionCreateCollection = AbstractMapBasedMultimap.this.createCollection();
            collectionCreateCollection.addAll(collectionRemove);
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionCreateCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f23064d.equals(obj);
        }

        public Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Maps.e(key, AbstractMapBasedMultimap.this.wrapCollection(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f23064d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> h() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f23064d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f23064d.toString();
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f23070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public K f23071c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Collection<V> f23072d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Iterator<V> f23073e = Iterators.i();

        public d() {
            this.f23070b = AbstractMapBasedMultimap.this.f23062g.entrySet().iterator();
        }

        public abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23070b.hasNext() || this.f23073e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f23073e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f23070b.next();
                this.f23071c = next.getKey();
                Collection<V> value = next.getValue();
                this.f23072d = value;
                this.f23073e = value.iterator();
            }
            return a(c2.a(this.f23071c), this.f23073e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f23073e.remove();
            Collection<V> collection = this.f23072d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f23070b.remove();
            }
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
        }
    }

    public class e extends Maps.f<K, Collection<V>> {

        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f23076b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f23077c;

            public a(Iterator it) {
                this.f23077c = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f23077c.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f23077c.next();
                this.f23076b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                y7.l.s(this.f23076b != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f23076b.getValue();
                this.f23077c.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, value.size());
                value.clear();
                this.f23076b = null;
            }
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return f().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || f().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return f().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(f().entrySet().iterator());
        }

        @Override // com.google.common.collect.Maps.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = f().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public final class f extends AbstractMapBasedMultimap<K, V>.i implements NavigableMap<K, Collection<V>> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = j().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return j().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(j().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = j().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = j().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return j().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(j().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = j().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return j().higherKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> g() {
            return new g(j());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, com.google.common.collect.AbstractMapBasedMultimap.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> h() {
            return (NavigableSet) super.h();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = j().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = j().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return j().lowerKey(k10);
        }

        public Map.Entry<K, Collection<V>> m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionCreateCollection = AbstractMapBasedMultimap.this.createCollection();
            collectionCreateCollection.addAll(next.getValue());
            it.remove();
            return Maps.e(next.getKey(), AbstractMapBasedMultimap.this.unmodifiableCollectionSubclass(collectionCreateCollection));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> j() {
            return (NavigableMap) super.j();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return h();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(j().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(j().tailMap(k10, z10));
        }
    }

    public final class g extends AbstractMapBasedMultimap<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return f().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return f().floorKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> f() {
            return (NavigableMap) super.f();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(f().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return f().higherKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return f().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Iterators.r(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Iterators.r(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(f().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(f().tailMap(k10, z10));
        }
    }

    public class h extends AbstractMapBasedMultimap<K, V>.l implements RandomAccess {
        public h(AbstractMapBasedMultimap abstractMapBasedMultimap, K k10, List<V> list, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    public class i extends AbstractMapBasedMultimap<K, V>.c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SortedSet<K> f23081f;

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return j().firstKey();
        }

        public SortedSet<K> g() {
            return new j(j());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.c, java.util.AbstractMap, java.util.Map
        public SortedSet<K> h() {
            SortedSet<K> sortedSet = this.f23081f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetG = g();
            this.f23081f = sortedSetG;
            return sortedSetG;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(j().headMap(k10));
        }

        public SortedMap<K, Collection<V>> j() {
            return (SortedMap) this.f23064d;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return j().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(j().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(j().tailMap(k10));
        }
    }

    public class j extends AbstractMapBasedMultimap<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        public SortedMap<K, Collection<V>> f() {
            return (SortedMap) super.f();
        }

        @Override // java.util.SortedSet
        public K first() {
            return f().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(f().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return f().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(f().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(f().tailMap(k10));
        }
    }

    public class k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f23084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection<V> f23085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AbstractMapBasedMultimap<K, V>.k f23086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Collection<V> f23087e;

        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<V> f23089b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Collection<V> f23090c;

            public a() {
                Collection<V> collection = k.this.f23085c;
                this.f23090c = collection;
                this.f23089b = AbstractMapBasedMultimap.b(collection);
            }

            public a(Iterator<V> it) {
                this.f23090c = k.this.f23085c;
                this.f23089b = it;
            }

            public Iterator<V> a() {
                b();
                return this.f23089b;
            }

            public void b() {
                k.this.i();
                if (k.this.f23085c != this.f23090c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f23089b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f23089b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f23089b.remove();
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                k.this.j();
            }
        }

        public k(K k10, Collection<V> collection, AbstractMapBasedMultimap<K, V>.k kVar) {
            this.f23084b = k10;
            this.f23085c = collection;
            this.f23086d = kVar;
            this.f23087e = kVar == null ? null : kVar.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            i();
            boolean zIsEmpty = this.f23085c.isEmpty();
            boolean zAdd = this.f23085c.add(v10);
            if (zAdd) {
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    e();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f23085c.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f23085c.size() - size);
                if (size == 0) {
                    e();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f23085c.clear();
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
            j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            i();
            return this.f23085c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            i();
            return this.f23085c.containsAll(collection);
        }

        public void e() {
            AbstractMapBasedMultimap<K, V>.k kVar = this.f23086d;
            if (kVar != null) {
                kVar.e();
            } else {
                AbstractMapBasedMultimap.this.f23062g.put(this.f23084b, this.f23085c);
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            i();
            return this.f23085c.equals(obj);
        }

        public AbstractMapBasedMultimap<K, V>.k f() {
            return this.f23086d;
        }

        public Collection<V> g() {
            return this.f23085c;
        }

        K h() {
            return this.f23084b;
        }

        @Override // java.util.Collection
        public int hashCode() {
            i();
            return this.f23085c.hashCode();
        }

        public void i() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.k kVar = this.f23086d;
            if (kVar != null) {
                kVar.i();
                if (this.f23086d.g() != this.f23087e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f23085c.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.f23062g.get(this.f23084b)) == null) {
                    return;
                }
                this.f23085c = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            i();
            return new a();
        }

        public void j() {
            AbstractMapBasedMultimap<K, V>.k kVar = this.f23086d;
            if (kVar != null) {
                kVar.j();
            } else if (this.f23085c.isEmpty()) {
                AbstractMapBasedMultimap.this.f23062g.remove(this.f23084b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            i();
            boolean zRemove = this.f23085c.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                j();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f23085c.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f23085c.size() - size);
                j();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            y7.l.m(collection);
            int size = size();
            boolean zRetainAll = this.f23085c.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f23085c.size() - size);
                j();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            i();
            return this.f23085c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            i();
            return this.f23085c.toString();
        }
    }

    public class l extends AbstractMapBasedMultimap<K, V>.k implements List<V> {

        public class a extends AbstractMapBasedMultimap<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            public a(int i10) {
                super(l.this.l().listIterator(i10));
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(v10);
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    l.this.e();
                }
            }

            public final ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                c().set(v10);
            }
        }

        public l(K k10, List<V> list, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            i();
            boolean zIsEmpty = g().isEmpty();
            l().add(i10, v10);
            AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
            if (zIsEmpty) {
                e();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = l().addAll(i10, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, g().size() - size);
                if (size == 0) {
                    e();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            i();
            return l().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            i();
            return l().indexOf(obj);
        }

        public List<V> l() {
            return (List) g();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            i();
            return l().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            i();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            i();
            return new a(i10);
        }

        @Override // java.util.List
        public V remove(int i10) {
            i();
            V vRemove = l().remove(i10);
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
            j();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            i();
            return l().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            i();
            return AbstractMapBasedMultimap.this.wrapList(h(), l().subList(i10, i11), f() == null ? this : f());
        }
    }

    public class m extends AbstractMapBasedMultimap<K, V>.o implements NavigableSet<V> {
        public m(K k10, NavigableSet<V> navigableSet, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, navigableSet, kVar);
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v10) {
            return l().ceiling(v10);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(l().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return n(l().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v10) {
            return l().floor(v10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v10, boolean z10) {
            return n(l().headSet(v10, z10));
        }

        @Override // java.util.NavigableSet
        public V higher(V v10) {
            return l().higher(v10);
        }

        @Override // java.util.NavigableSet
        public V lower(V v10) {
            return l().lower(v10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.o
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> l() {
            return (NavigableSet) super.l();
        }

        public final NavigableSet<V> n(NavigableSet<V> navigableSet) {
            return new m(this.f23084b, navigableSet, f() == null ? this : f());
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) Iterators.r(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) Iterators.r(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v10, boolean z10, V v11, boolean z11) {
            return n(l().subSet(v10, z10, v11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v10, boolean z10) {
            return n(l().tailSet(v10, z10));
        }
    }

    public class n extends AbstractMapBasedMultimap<K, V>.k implements Set<V> {
        public n(K k10, Set<V> set) {
            super(k10, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zI = Sets.i((Set) this.f23085c, collection);
            if (zI) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f23085c.size() - size);
                j();
            }
            return zI;
        }
    }

    public class o extends AbstractMapBasedMultimap<K, V>.k implements SortedSet<V> {
        public o(K k10, SortedSet<V> sortedSet, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return l().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            i();
            return l().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v10) {
            i();
            return new o(h(), l().headSet(v10), f() == null ? this : f());
        }

        public SortedSet<V> l() {
            return (SortedSet) g();
        }

        @Override // java.util.SortedSet
        public V last() {
            i();
            return l().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v10, V v11) {
            i();
            return new o(h(), l().subSet(v10, v11), f() == null ? this : f());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v10) {
            i();
            return new o(h(), l().tailSet(v10), f() == null ? this : f());
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        y7.l.d(map.isEmpty());
        this.f23062g = map;
    }

    public static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.f23063h;
        abstractMapBasedMultimap.f23063h = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.f23063h;
        abstractMapBasedMultimap.f23063h = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int access$212(AbstractMapBasedMultimap abstractMapBasedMultimap, int i10) {
        int i11 = abstractMapBasedMultimap.f23063h + i10;
        abstractMapBasedMultimap.f23063h = i11;
        return i11;
    }

    public static /* synthetic */ int access$220(AbstractMapBasedMultimap abstractMapBasedMultimap, int i10) {
        int i11 = abstractMapBasedMultimap.f23063h - i10;
        abstractMapBasedMultimap.f23063h = i11;
        return i11;
    }

    public static <E> Iterator<E> b(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final Collection<V> a(K k10) {
        Collection<V> collection = this.f23062g.get(k10);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateCollection = createCollection(k10);
        this.f23062g.put(k10, collectionCreateCollection);
        return collectionCreateCollection;
    }

    public Map<K, Collection<V>> backingMap() {
        return this.f23062g;
    }

    public final void c(Object obj) {
        Collection collection = (Collection) Maps.o(this.f23062g, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f23063h -= size;
        }
    }

    @Override // com.google.common.collect.a2
    public void clear() {
        Iterator<Collection<V>> it = this.f23062g.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f23062g.clear();
        this.f23063h = 0;
    }

    @Override // com.google.common.collect.a2
    public boolean containsKey(Object obj) {
        return this.f23062g.containsKey(obj);
    }

    @Override // com.google.common.collect.c
    public Map<K, Collection<V>> createAsMap() {
        return new c(this.f23062g);
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(K k10) {
        return createCollection();
    }

    @Override // com.google.common.collect.c
    public Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof k2 ? new c.b(this) : new c.a();
    }

    @Override // com.google.common.collect.c
    public Set<K> createKeySet() {
        return new e(this.f23062g);
    }

    @Override // com.google.common.collect.c
    public b2<K> createKeys() {
        return new Multimaps.b(this);
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.f23062g;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f23062g) : map instanceof SortedMap ? new i((SortedMap) this.f23062g) : new c(this.f23062g);
    }

    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.f23062g;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f23062g) : map instanceof SortedMap ? new j((SortedMap) this.f23062g) : new e(this.f23062g);
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    @Override // com.google.common.collect.c
    public Collection<V> createValues() {
        return new c.C0318c();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.c
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new b(this);
    }

    @Override // com.google.common.collect.a2
    public Collection<V> get(K k10) {
        Collection<V> collectionCreateCollection = this.f23062g.get(k10);
        if (collectionCreateCollection == null) {
            collectionCreateCollection = createCollection(k10);
        }
        return wrapCollection(k10, collectionCreateCollection);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f23062g.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f23063h++;
            return true;
        }
        Collection<V> collectionCreateCollection = createCollection(k10);
        if (!collectionCreateCollection.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f23063h++;
        this.f23062g.put(k10, collectionCreateCollection);
        return true;
    }

    @Override // com.google.common.collect.a2
    public Collection<V> removeAll(Object obj) {
        Collection<V> collectionRemove = this.f23062g.remove(obj);
        if (collectionRemove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(collectionRemove);
        this.f23063h -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    @Override // com.google.common.collect.c
    public Collection<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k10);
        }
        Collection<V> collectionA = a(k10);
        Collection<V> collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(collectionA);
        this.f23063h -= collectionA.size();
        collectionA.clear();
        while (it.hasNext()) {
            if (collectionA.add(it.next())) {
                this.f23063h++;
            }
        }
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    public final void setMap(Map<K, Collection<V>> map) {
        this.f23062g = map;
        this.f23063h = 0;
        for (Collection<V> collection : map.values()) {
            y7.l.d(!collection.isEmpty());
            this.f23063h += collection.size();
        }
    }

    @Override // com.google.common.collect.a2
    public int size() {
        return this.f23063h;
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.c
    public Iterator<V> valueIterator() {
        return new a(this);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public Collection<V> values() {
        return super.values();
    }

    public Collection<V> wrapCollection(K k10, Collection<V> collection) {
        return new k(k10, collection, null);
    }

    public final List<V> wrapList(K k10, List<V> list, AbstractMapBasedMultimap<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(this, k10, list, kVar) : new l(k10, list, kVar);
    }
}
