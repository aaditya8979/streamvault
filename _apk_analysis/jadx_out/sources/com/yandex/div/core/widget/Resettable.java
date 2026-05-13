package com.yandex.div.core.widget;

import java.util.ConcurrentModificationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;

/* JADX INFO: compiled from: GridContainer.kt */
/* JADX INFO: loaded from: classes6.dex */
final class Resettable<T> {

    @NotNull
    private final a<T> initializer;

    @Nullable
    private T value;

    /* JADX WARN: Multi-variable type inference failed */
    public Resettable(@NotNull a<? extends T> aVar) {
        this.initializer = aVar;
    }

    public final T get() {
        if (this.value == null) {
            this.value = this.initializer.invoke();
        }
        T t10 = this.value;
        if (t10 != null) {
            return t10;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    public final boolean getInitialized() {
        return this.value != null;
    }

    public final void reset() {
        this.value = null;
    }
}
