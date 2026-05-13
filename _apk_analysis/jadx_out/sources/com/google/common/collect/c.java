package com.google.common.collect;

import com.google.common.collect.Multimaps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AbstractMultimap.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<K, V> implements a2<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Collection<Map.Entry<K, V>> f23377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Set<K> f23378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient b2<K> f23379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Collection<V> f23380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Map<K, Collection<V>> f23381f;

    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class a extends Multimaps.a<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.Multimaps.a
        public a2<K, V> e() {
            return c.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return c.this.entryIterator();
        }
    }

    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class b extends c<K, V>.a implements Set<Map.Entry<K, V>> {
        public b(c cVar) {
            super();
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

    /* JADX INFO: renamed from: com.google.common.collect.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class C0318c extends AbstractCollection<V> {
        public C0318c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return c.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return c.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c.this.size();
        }
    }

    @Override // com.google.common.collect.a2
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f23381f;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapCreateAsMap = createAsMap();
        this.f23381f = mapCreateAsMap;
        return mapCreateAsMap;
    }

    @Override // com.google.common.collect.a2
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean containsValue(Object obj) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract b2<K> createKeys();

    public abstract Collection<V> createValues();

    @Override // com.google.common.collect.a2
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f23377b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionCreateEntries = createEntries();
        this.f23377b = collectionCreateEntries;
        return collectionCreateEntries;
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    public boolean equals(Object obj) {
        return Multimaps.a(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // com.google.common.collect.a2
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.a2
    public Set<K> keySet() {
        Set<K> set = this.f23378c;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.f23378c = setCreateKeySet;
        return setCreateKeySet;
    }

    public b2<K> keys() {
        b2<K> b2Var = this.f23379d;
        if (b2Var != null) {
            return b2Var;
        }
        b2<K> b2VarCreateKeys = createKeys();
        this.f23379d = b2VarCreateKeys;
        return b2VarCreateKeys;
    }

    @Override // com.google.common.collect.a2
    public boolean put(K k10, V v10) {
        return get(k10).add(v10);
    }

    @Override // com.google.common.collect.a2
    public boolean putAll(a2<? extends K, ? extends V> a2Var) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : a2Var.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    public boolean putAll(K k10, Iterable<? extends V> iterable) {
        y7.l.m(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k10).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && Iterators.a(get(k10), it);
    }

    @Override // com.google.common.collect.a2
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public Collection<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        y7.l.m(iterable);
        Collection<V> collectionRemoveAll = removeAll(k10);
        putAll(k10, iterable);
        return collectionRemoveAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return Maps.r(entries().iterator());
    }

    @Override // com.google.common.collect.a2
    public Collection<V> values() {
        Collection<V> collection = this.f23380e;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.f23380e = collectionCreateValues;
        return collectionCreateValues;
    }
}
