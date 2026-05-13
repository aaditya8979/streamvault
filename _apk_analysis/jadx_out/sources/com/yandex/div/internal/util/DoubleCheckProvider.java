package com.yandex.div.internal.util;

import bn.g;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import ym.a;

/* JADX INFO: compiled from: DoubleCheckProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DoubleCheckProvider<T> implements a<T> {

    @NotNull
    private final g value$delegate;

    public DoubleCheckProvider(@NotNull sn.a<? extends T> aVar) {
        this.value$delegate = b.b(aVar);
    }

    private final T getValue() {
        return (T) this.value$delegate.getValue();
    }

    @Override // ym.a
    public T get() {
        return getValue();
    }
}
