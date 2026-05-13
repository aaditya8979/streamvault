package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator<Comparable> f23511b = new a();
    public Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.b entrySet;
    public final e<K, V> header;
    private LinkedTreeMap<K, V>.c keySet;
    public int modCount;
    public e<K, V> root;
    public int size;

    public static class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends LinkedTreeMap<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarFindByEntry;
            if (!(obj instanceof Map.Entry) || (eVarFindByEntry = LinkedTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(eVarFindByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends LinkedTreeMap<K, V>.d<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f23525g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedTreeMap.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e<K, V> f23516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f23517c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23518d;

        public d() {
            this.f23516b = LinkedTreeMap.this.header.f23523e;
            this.f23518d = LinkedTreeMap.this.modCount;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f23516b;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.header) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.modCount != this.f23518d) {
                throw new ConcurrentModificationException();
            }
            this.f23516b = eVar.f23523e;
            this.f23517c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f23516b != LinkedTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f23517c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.removeInternal(eVar, true);
            this.f23517c = null;
            this.f23518d = LinkedTreeMap.this.modCount;
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e<K, V> f23520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f23521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e<K, V> f23522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e<K, V> f23523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e<K, V> f23524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final K f23525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public V f23526h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f23527i;

        public e() {
            this.f23525g = null;
            this.f23524f = this;
            this.f23523e = this;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f23520b = eVar;
            this.f23525g = k10;
            this.f23527i = 1;
            this.f23523e = eVar2;
            this.f23524f = eVar3;
            eVar3.f23523e = this;
            eVar2.f23524f = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f23521c; eVar2 != null; eVar2 = eVar2.f23521c) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f23522d; eVar2 != null; eVar2 = eVar2.f23522d) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f23525g;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f23526h;
            if (v10 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v10.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f23525g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f23526h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f23525g;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f23526h;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f23526h;
            this.f23526h = v10;
            return v11;
        }

        public String toString() {
            return this.f23525g + "=" + this.f23526h;
        }
    }

    public LinkedTreeMap() {
        this(f23511b);
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.header = new e<>();
        this.comparator = comparator == null ? f23511b : comparator;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final void b(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f23521c;
            e<K, V> eVar3 = eVar.f23522d;
            int i10 = eVar2 != null ? eVar2.f23527i : 0;
            int i11 = eVar3 != null ? eVar3.f23527i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f23521c;
                e<K, V> eVar5 = eVar3.f23522d;
                int i13 = (eVar4 != null ? eVar4.f23527i : 0) - (eVar5 != null ? eVar5.f23527i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    d(eVar);
                } else {
                    f(eVar3);
                    d(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f23521c;
                e<K, V> eVar7 = eVar2.f23522d;
                int i14 = (eVar6 != null ? eVar6.f23527i : 0) - (eVar7 != null ? eVar7.f23527i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    f(eVar);
                } else {
                    d(eVar2);
                    f(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f23527i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f23527i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f23520b;
        }
    }

    public final void c(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f23520b;
        eVar.f23520b = null;
        if (eVar2 != null) {
            eVar2.f23520b = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.f23521c == eVar) {
            eVar3.f23521c = eVar2;
        } else {
            eVar3.f23522d = eVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        e<K, V> eVar = this.header;
        eVar.f23524f = eVar;
        eVar.f23523e = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    public final void d(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f23521c;
        e<K, V> eVar3 = eVar.f23522d;
        e<K, V> eVar4 = eVar3.f23521c;
        e<K, V> eVar5 = eVar3.f23522d;
        eVar.f23522d = eVar4;
        if (eVar4 != null) {
            eVar4.f23520b = eVar;
        }
        c(eVar, eVar3);
        eVar3.f23521c = eVar;
        eVar.f23520b = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f23527i : 0, eVar4 != null ? eVar4.f23527i : 0) + 1;
        eVar.f23527i = iMax;
        eVar3.f23527i = Math.max(iMax, eVar5 != null ? eVar5.f23527i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new b();
        this.entrySet = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f23521c;
        e<K, V> eVar3 = eVar.f23522d;
        e<K, V> eVar4 = eVar2.f23521c;
        e<K, V> eVar5 = eVar2.f23522d;
        eVar.f23521c = eVar5;
        if (eVar5 != null) {
            eVar5.f23520b = eVar;
        }
        c(eVar, eVar2);
        eVar2.f23522d = eVar;
        eVar.f23520b = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f23527i : 0, eVar5 != null ? eVar5.f23527i : 0) + 1;
        eVar.f23527i = iMax;
        eVar2.f23527i = Math.max(iMax, eVar4 != null ? eVar4.f23527i : 0) + 1;
    }

    public e<K, V> find(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.comparator;
        e<K, V> eVar2 = this.root;
        if (eVar2 != null) {
            Comparable comparable = comparator == f23511b ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f23525g) : comparator.compare(k10, eVar2.f23525g);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f23521c : eVar2.f23522d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.header;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f23524f);
            if (iCompareTo < 0) {
                eVar2.f23521c = eVar;
            } else {
                eVar2.f23522d = eVar;
            }
            b(eVar2, true);
        } else {
            if (comparator == f23511b && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f23524f);
            this.root = eVar;
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    public e<K, V> findByEntry(Map.Entry<?, ?> entry) {
        e<K, V> eVarFindByObject = findByObject(entry.getKey());
        if (eVarFindByObject != null && a(eVarFindByObject.f23526h, entry.getValue())) {
            return eVarFindByObject;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> findByObject(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarFindByObject = findByObject(obj);
        if (eVarFindByObject != null) {
            return eVarFindByObject.f23526h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new c();
        this.keySet = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> eVarFind = find(k10, true);
        V v11 = eVarFind.f23526h;
        eVarFind.f23526h = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarRemoveInternalByKey = removeInternalByKey(obj);
        if (eVarRemoveInternalByKey != null) {
            return eVarRemoveInternalByKey.f23526h;
        }
        return null;
    }

    public void removeInternal(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f23524f;
            eVar2.f23523e = eVar.f23523e;
            eVar.f23523e.f23524f = eVar2;
        }
        e<K, V> eVar3 = eVar.f23521c;
        e<K, V> eVar4 = eVar.f23522d;
        e<K, V> eVar5 = eVar.f23520b;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                c(eVar, eVar3);
                eVar.f23521c = null;
            } else if (eVar4 != null) {
                c(eVar, eVar4);
                eVar.f23522d = null;
            } else {
                c(eVar, null);
            }
            b(eVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        e<K, V> eVarB = eVar3.f23527i > eVar4.f23527i ? eVar3.b() : eVar4.a();
        removeInternal(eVarB, false);
        e<K, V> eVar6 = eVar.f23521c;
        if (eVar6 != null) {
            i10 = eVar6.f23527i;
            eVarB.f23521c = eVar6;
            eVar6.f23520b = eVarB;
            eVar.f23521c = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f23522d;
        if (eVar7 != null) {
            i11 = eVar7.f23527i;
            eVarB.f23522d = eVar7;
            eVar7.f23520b = eVarB;
            eVar.f23522d = null;
        }
        eVarB.f23527i = Math.max(i10, i11) + 1;
        c(eVar, eVarB);
    }

    public e<K, V> removeInternalByKey(Object obj) {
        e<K, V> eVarFindByObject = findByObject(obj);
        if (eVarFindByObject != null) {
            removeInternal(eVarFindByObject, true);
        }
        return eVarFindByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }
}
