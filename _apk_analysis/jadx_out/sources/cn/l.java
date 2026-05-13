package cn;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l<T> implements Collection<T>, un.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final T[] f6747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6748c;

    public l(@NotNull T[] tArr, boolean z10) {
        tn.p.k(tArr, "values");
        this.f6747b = tArr;
        this.f6748c = z10;
    }

    @Override // java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return r.P(this.f6747b, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        tn.p.k(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return this.f6747b.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f6747b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return tn.b.a(this.f6747b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Collection
    @NotNull
    public final Object[] toArray() {
        return v.b(this.f6747b, this.f6748c);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        tn.p.k(tArr, "array");
        return (T[]) tn.h.b(this, tArr);
    }
}
