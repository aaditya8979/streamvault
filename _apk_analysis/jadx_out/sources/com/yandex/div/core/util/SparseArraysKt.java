package com.yandex.div.core.util;

import androidx.collection.SparseArrayCompat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SparseArrays.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SparseArraysKt {
    @NotNull
    public static final <T> Iterable<T> toIterable(@NotNull SparseArrayCompat<T> sparseArrayCompat) {
        return new SparseArrayIterable(sparseArrayCompat);
    }
}
