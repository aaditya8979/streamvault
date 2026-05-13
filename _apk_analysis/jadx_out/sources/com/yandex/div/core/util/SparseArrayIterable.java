package com.yandex.div.core.util;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import un.a;

/* JADX INFO: compiled from: SparseArrays.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class SparseArrayIterable<T> implements Iterable<T>, a {

    @NotNull
    private final SparseArrayCompat<T> array;

    public SparseArrayIterable(@NotNull SparseArrayCompat<T> sparseArrayCompat) {
        this.array = sparseArrayCompat;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new SparseArrayIterator(this.array);
    }
}
