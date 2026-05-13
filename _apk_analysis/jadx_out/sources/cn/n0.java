package cn;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class n0<K, V> implements m0<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<K, V> f6754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final sn.l<K, V> f6755c;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(@NotNull Map<K, ? extends V> map, @NotNull sn.l<? super K, ? extends V> lVar) {
        tn.p.k(map, "map");
        tn.p.k(lVar, "default");
        this.f6754b = map;
        this.f6755c = lVar;
    }

    @NotNull
    public Set<Map.Entry<K, V>> a() {
        return i().entrySet();
    }

    @NotNull
    public Set<K> b() {
        return i().keySet();
    }

    public int c() {
        return i().size();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return i().containsValue(obj);
    }

    @NotNull
    public Collection<V> d() {
        return i().values();
    }

    @Override // cn.m0
    public V e(K k10) {
        Map<K, V> mapI = i();
        V v10 = mapI.get(k10);
        return (v10 != null || mapI.containsKey(k10)) ? v10 : this.f6755c.invoke(k10);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return i().equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return i().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return i().hashCode();
    }

    @Override // cn.m0
    @NotNull
    public Map<K, V> i() {
        return this.f6754b;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return i().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @NotNull
    public String toString() {
        return i().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return d();
    }
}
