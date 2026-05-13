package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.j2objc.annotations.Weak;
import com.ironsource.G5;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes6.dex */
public final class Maps {

    public enum EntryFunction implements y7.e<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.collect.Maps.EntryFunction, y7.e
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.collect.Maps.EntryFunction, y7.e
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        /* synthetic */ EntryFunction(a aVar) {
            this();
        }

        @Override // y7.e
        public abstract /* synthetic */ Object apply(Map.Entry<?, ?> entry);
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class a<K, V> extends p2<Map.Entry<K, V>, K> {
        public a(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.p2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class b<K, V> extends p2<Map.Entry<K, V>, V> {
        public b(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.p2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    public static abstract class c<K, V> extends q1<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Comparator<? super K> f23281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f23282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public transient NavigableSet<K> f23283e;

        public class a extends d<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.d
            public Map<K, V> e() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return c.this.j();
            }
        }

        public static <T> Ordering<T> m(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k10) {
            return l().floorEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return l().floorKey(k10);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f23281c;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = l().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.natural();
            }
            Ordering orderingM = m(comparator2);
            this.f23281c = orderingM;
            return orderingM;
        }

        @Override // com.google.common.collect.q1, com.google.common.collect.r1
        /* JADX INFO: renamed from: delegate */
        public final Map<K, V> g() {
            return l();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return l().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return l();
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f23282d;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setG = g();
            this.f23282d = setG;
            return setG;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return l().lastEntry();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return l().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k10) {
            return l().ceilingEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return l().ceilingKey(k10);
        }

        public Set<Map.Entry<K, V>> g() {
            return new a();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k10, boolean z10) {
            return l().tailMap(k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k10) {
            return l().lowerEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return l().lowerKey(k10);
        }

        public abstract Iterator<Map.Entry<K, V>> j();

        @Override // com.google.common.collect.q1, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        public abstract NavigableMap<K, V> l();

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return l().firstEntry();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return l().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k10) {
            return l().higherEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return l().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f23283e;
            if (navigableSet != null) {
                return navigableSet;
            }
            g gVar = new g(this);
            this.f23283e = gVar;
            return gVar;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return l().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return l().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
            return l().subMap(k11, z11, k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k10, boolean z10) {
            return l().headMap(k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // com.google.common.collect.r1
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.q1, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new i(this);
        }
    }

    public static abstract class d<K, V> extends Sets.d<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objN = Maps.n(e(), key);
            if (y7.i.a(objN, entry.getValue())) {
                return objN != null || e().containsKey(key);
            }
            return false;
        }

        public abstract Map<K, V> e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return e().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) y7.l.m(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.j(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) y7.l.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = Sets.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetG.add(((Map.Entry) obj).getKey());
                    }
                }
                return e().keySet().retainAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().size();
        }
    }

    public static abstract class e<K, V> extends AbstractMap<K, V> {

        public class a extends d<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.d
            public Map<K, V> e() {
                return e.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return e.this.a();
            }
        }

        public abstract Iterator<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.c(a());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }
    }

    public static class f<K, V> extends Sets.d<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Weak
        public final Map<K, V> f23286b;

        public f(Map<K, V> map) {
            this.f23286b = (Map) y7.l.m(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return f().containsKey(obj);
        }

        /* JADX INFO: renamed from: e */
        public Map<K, V> f() {
            return this.f23286b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return f().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.h(f().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            f().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f().size();
        }
    }

    public static class g<K, V> extends h<K, V> implements NavigableSet<K> {
        public g(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return e().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return e().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return e().floorKey(k10);
        }

        @Override // com.google.common.collect.Maps.h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> f() {
            return (NavigableMap) this.f23286b;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return e().headMap(k10, z10).navigableKeySet();
        }

        @Override // java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return e().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return e().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Maps.i(e().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Maps.i(e().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return e().subMap(k10, z10, k11, z11).navigableKeySet();
        }

        @Override // java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return e().tailMap(k10, z10).navigableKeySet();
        }

        @Override // java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }
    }

    public static class h<K, V> extends f<K, V> implements SortedSet<K> {
        public h(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        public SortedMap<K, V> f() {
            throw null;
        }

        @Override // java.util.SortedSet
        public K first() {
            return f().firstKey();
        }

        @Override // java.util.SortedSet
        public K last() {
            return f().lastKey();
        }
    }

    public static class i<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Weak
        public final Map<K, V> f23287b;

        public i(Map<K, V> map) {
            this.f23287b = (Map) y7.l.m(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return e().containsValue(obj);
        }

        public final Map<K, V> e() {
            return this.f23287b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.r(e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (y7.i.a(obj, entry.getValue())) {
                        e().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) y7.l.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = Sets.f();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return e().keySet().removeAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) y7.l.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = Sets.f();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return e().keySet().retainAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    public static abstract class j<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f23288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Collection<V> f23289c;

        public abstract Set<Map.Entry<K, V>> a();

        public Collection<V> b() {
            return new i(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f23288b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f23288b = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f23289c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionB = b();
            this.f23289c = collectionB;
            return collectionB;
        }
    }

    public static int a(int i10) {
        if (i10 < 3) {
            j1.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map<?, ?> map, Object obj) {
        return Iterators.e(h(map.entrySet().iterator()), obj);
    }

    public static boolean c(Map<?, ?> map, Object obj) {
        return Iterators.e(r(map.entrySet().iterator()), obj);
    }

    public static boolean d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> e(K k10, V v10) {
        return new ImmutableEntry(k10, v10);
    }

    public static <E> ImmutableMap<E, Integer> f(Collection<E> collection) {
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        Iterator<E> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bVar.g(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return bVar.c();
    }

    public static <K> y7.e<Map.Entry<K, ?>, K> g() {
        return EntryFunction.KEY;
    }

    public static <K, V> Iterator<K> h(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }

    public static <K> K i(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static <K, V> HashMap<K, V> j(int i10) {
        return new HashMap<>(a(i10));
    }

    public static <K, V> IdentityHashMap<K, V> k() {
        return new IdentityHashMap<>();
    }

    public static <K, V> void l(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public static boolean m(Map<?, ?> map, Object obj) {
        y7.l.m(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <V> V n(Map<?, V> map, Object obj) {
        y7.l.m(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <V> V o(Map<?, V> map, Object obj) {
        y7.l.m(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String p(Map<?, ?> map) {
        StringBuilder sbB = k1.b(map.size());
        sbB.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbB.append(", ");
            }
            z10 = false;
            sbB.append(entry.getKey());
            sbB.append(G5.T);
            sbB.append(entry.getValue());
        }
        sbB.append('}');
        return sbB.toString();
    }

    public static <V> y7.e<Map.Entry<?, V>, V> q() {
        return EntryFunction.VALUE;
    }

    public static <K, V> Iterator<V> r(Iterator<Map.Entry<K, V>> it) {
        return new b(it);
    }

    public static <V> V s(Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }
}
