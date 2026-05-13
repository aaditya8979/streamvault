package kotlin.collections.builders;

import cn.g;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c<V> extends g<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MapBuilder<?, V> f73226b;

    public c(@NotNull MapBuilder<?, V> mapBuilder) {
        p.k(mapBuilder, "backing");
        this.f73226b = mapBuilder;
    }

    @Override // cn.g, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends V> collection) {
        p.k(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f73226b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f73226b.containsValue(obj);
    }

    @Override // cn.g
    public int getSize() {
        return this.f73226b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f73226b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return this.f73226b.valuesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f73226b.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> collection) {
        p.k(collection, "elements");
        this.f73226b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> collection) {
        p.k(collection, "elements");
        this.f73226b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
