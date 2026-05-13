package kotlin.collections.builders;

import cn.j;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b<E> extends j<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MapBuilder<E, ?> f73225b;

    public b(@NotNull MapBuilder<E, ?> mapBuilder) {
        p.k(mapBuilder, "backing");
        this.f73225b = mapBuilder;
    }

    @Override // cn.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        p.k(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f73225b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f73225b.containsKey(obj);
    }

    @Override // cn.j
    public int getSize() {
        return this.f73225b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f73225b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return this.f73225b.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f73225b.removeKey$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<?> collection) {
        p.k(collection, "elements");
        this.f73225b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<?> collection) {
        p.k(collection, "elements");
        this.f73225b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
