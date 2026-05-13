package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a<K, V> extends dn.a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MapBuilder<K, V> f73224b;

    public a(@NotNull MapBuilder<K, V> mapBuilder) {
        p.k(mapBuilder, "backing");
        this.f73224b = mapBuilder;
    }

    @Override // cn.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        p.k(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> collection) {
        p.k(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f73224b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<?> collection) {
        p.k(collection, "elements");
        return this.f73224b.containsAllEntries$kotlin_stdlib(collection);
    }

    @Override // dn.a
    public boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        p.k(entry, "element");
        return this.f73224b.containsEntry$kotlin_stdlib(entry);
    }

    @Override // cn.j
    public int getSize() {
        return this.f73224b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f73224b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f73224b.entriesIterator$kotlin_stdlib();
    }

    @Override // dn.a
    public boolean remove(@NotNull Map.Entry<K, V> entry) {
        p.k(entry, "element");
        return this.f73224b.removeEntry$kotlin_stdlib(entry);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<?> collection) {
        p.k(collection, "elements");
        this.f73224b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<?> collection) {
        p.k(collection, "elements");
        this.f73224b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
