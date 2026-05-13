package cn;

import com.ironsource.G5;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractMap.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class f<K, V> implements Map<K, V>, un.a {

    @NotNull
    public static final a Companion = new a(null);

    @Nullable
    private volatile Set<? extends K> _keys;

    @Nullable
    private volatile Collection<? extends V> _values;

    /* JADX INFO: compiled from: AbstractMap.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AbstractMap.kt */
    public static final class b extends k<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f<K, V> f6736b;

        /* JADX INFO: compiled from: AbstractMap.kt */
        public static final class a implements Iterator<K>, un.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f6737b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f6737b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f6737b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f6737b.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(f<K, ? extends V> fVar) {
            this.f6736b = fVar;
        }

        @Override // cn.b, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f6736b.containsKey(obj);
        }

        @Override // cn.b
        public int getSize() {
            return this.f6736b.size();
        }

        @Override // cn.k, cn.b, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<K> iterator() {
            return new a(this.f6736b.entrySet().iterator());
        }
    }

    /* JADX INFO: compiled from: AbstractMap.kt */
    public static final class c extends cn.b<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f<K, V> f6738b;

        /* JADX INFO: compiled from: AbstractMap.kt */
        public static final class a implements Iterator<V>, un.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f6739b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f6739b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f6739b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f6739b.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(f<K, ? extends V> fVar) {
            this.f6738b = fVar;
        }

        @Override // cn.b, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f6738b.containsValue(obj);
        }

        @Override // cn.b
        public int getSize() {
            return this.f6738b.size();
        }

        @Override // cn.b, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<V> iterator() {
            return new a(this.f6738b.entrySet().iterator());
        }
    }

    private final Map.Entry<K, V> implFindEntry(K k10) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (tn.p.f(((Map.Entry) next).getKey(), k10)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    private final String toString(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    private final String toString(Map.Entry<? extends K, ? extends V> entry) {
        return toString(entry.getKey()) + G5.T + toString(entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$2(f fVar, Map.Entry entry) {
        tn.p.k(entry, "it");
        return fVar.toString(entry);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(@Nullable Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        tn.p.i(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v10 = get(key);
        if (!tn.p.f(value, v10)) {
            return false;
        }
        if (v10 != null) {
            return true;
        }
        tn.p.i(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return implFindEntry(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (tn.p.f(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlin_stdlib((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        Map.Entry<K, V> entryImplFindEntry = implFindEntry(obj);
        if (entryImplFindEntry != null) {
            return entryImplFindEntry.getValue();
        }
        return null;
    }

    public abstract Set<Map.Entry<K, V>> getEntries();

    @NotNull
    public Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = new b(this);
        }
        Set<? extends K> set = this._keys;
        tn.p.h(set);
        return set;
    }

    public int getSize() {
        return entrySet().size();
    }

    @NotNull
    public Collection<V> getValues() {
        if (this._values == null) {
            this._values = new c(this);
        }
        Collection<? extends V> collection = this._values;
        tn.p.h(collection);
        return collection;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        return f0.D0(entrySet(), ", ", com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d, com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e, 0, null, new sn.l() { // from class: cn.e
            @Override // sn.l
            public final Object invoke(Object obj) {
                return f.toString$lambda$2(this.f6734b, (Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
