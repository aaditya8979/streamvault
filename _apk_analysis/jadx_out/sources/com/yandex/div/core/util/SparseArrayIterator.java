package com.yandex.div.core.util;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import un.a;

/* JADX INFO: compiled from: SparseArrays.kt */
/* JADX INFO: loaded from: classes10.dex */
final class SparseArrayIterator<T> implements Iterator<T>, a {

    @NotNull
    private final SparseArrayCompat<T> array;
    private int index;

    public SparseArrayIterator(@NotNull SparseArrayCompat<T> sparseArrayCompat) {
        this.array = sparseArrayCompat;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.array.size() > this.index;
    }

    @Override // java.util.Iterator
    public T next() {
        SparseArrayCompat<T> sparseArrayCompat = this.array;
        int i10 = this.index;
        this.index = i10 + 1;
        return sparseArrayCompat.valueAt(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
