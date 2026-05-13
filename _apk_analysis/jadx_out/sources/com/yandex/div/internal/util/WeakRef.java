package com.yandex.div.internal.util;

import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wn.d;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes3.dex */
final class WeakRef<T> implements d<Object, T> {

    @Nullable
    private WeakReference<T> weakReference;

    public WeakRef(@Nullable T t10) {
        this.weakReference = t10 != null ? new WeakReference<>(t10) : null;
    }

    @Override // wn.d
    @Nullable
    public T getValue(@Nullable Object obj, @NotNull KProperty<?> kProperty) {
        WeakReference<T> weakReference = this.weakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // wn.d
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> kProperty, @Nullable T t10) {
        this.weakReference = t10 != null ? new WeakReference<>(t10) : null;
    }
}
