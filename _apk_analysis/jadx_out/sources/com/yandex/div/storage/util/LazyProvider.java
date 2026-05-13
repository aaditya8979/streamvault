package com.yandex.div.storage.util;

import bn.g;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import ym.a;

/* JADX INFO: compiled from: LazyProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class LazyProvider<T> implements a<T> {

    @NotNull
    private final g value$delegate;

    public LazyProvider(@NotNull sn.a<? extends T> aVar) {
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
